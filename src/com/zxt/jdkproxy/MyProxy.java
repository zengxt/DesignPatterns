package com.zxt.jdkproxy;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import org.apache.commons.io.FileUtils;

/**
 * 
 * @Description: 模拟JDK动态代理的实现
 * 动态代理的实现思路：
 * 实现功能：通过自定义的Proxy的newProxyInstance方法返回代理对象
 * 1、声明一段源码（动态产生代理）
 * 2、编译源码（JDK Compiler API），产生新的类（代理类）
 * 3、将这个类load到内存当中，产生一个新的对象（代理对象）
 * 4、return 代理对象
 *
 * @author： zxt
 *
 * @time: 2019年4月18日 下午3:44:58
 *
 */
public class MyProxy {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Object newProxyInstance(Class<?> inteface, MyInvocationHandler h) throws Exception {
		// 1、声明一段源码（动态产生代理）
		String rt = "\r\n";
		String methodStr = "";
		for(Method m : inteface.getMethods()) {
			methodStr += "	@Override" + rt
					   + "	public void " + m.getName() + "() {" + rt
					   + " 		try { " + rt
					   + " 			Method md = " + inteface.getSimpleName() + ".class.getMethod(\""
					   					  	  + m.getName() + "\");" + rt
					   + "			h.invoke(this, md);" + rt
					   + "		} catch (Exception e) { " + rt
					   + "			e.printStackTrace();" + rt
					   + "		}" + rt
					   + "	}";
		}
		String code = 
			"package com.zxt.jdkproxy;" + rt + "\n"
			+ "import java.lang.reflect.Method;" + rt
			+ "import com.zxt.staticproxy.Moveable;" + rt + "\n"
			+ "public class $MyProxy0 implements " + inteface.getSimpleName() + " {" + rt + "\n"
			+ "	private MyInvocationHandler h;" + rt + "\n"
			+ "	public $MyProxy0( MyInvocationHandler h ) {" + rt
			+ "		this.h = h;" + rt
			+ "	}" + rt + "\n"
			+ methodStr + rt + "\n"
			+ "}";
		
		
		// 由源代码生成java类文件
		String filename = System.getProperty("user.dir") + "/bin/com/zxt/jdkproxy/$MyProxy0.java";
		File file = new File(filename);
		// 使用commons-io里面的简便的工具类来写文件
		FileUtils.writeStringToFile(file, code, "UTF-8");
		
		
		// 2、编译源码（JDK Compiler API），产生新的类（代理类）
		// 拿到编译器
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		// 文件管理者
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
		// 获取文件
		Iterable units = fileManager.getJavaFileObjects(filename);
		// 获取编译任务
		CompilationTask task = compiler.getTask(null, fileManager, null, null, null, units);
		// 编译
		task.call();
		fileManager.close();
		
		// 3、加载到内存
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		Class c = cl.loadClass("com.zxt.jdkproxy.$MyProxy0");
		
		// 4、返回代理类
		Constructor ctr = c.getConstructor(MyInvocationHandler.class);
		return ctr.newInstance(h);
	}
	
	
	public static void main(String[] args) {

	}
}
