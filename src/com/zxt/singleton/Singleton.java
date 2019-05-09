package com.zxt.singleton;

/**
 * 
 * @Description: ����ģʽ������ʽ
 *
 * @author�� zxt
 *
 * @time: 2018��3��13�� ����3:13:51
 *
 */
public class Singleton {

	// �������͵�˽�г�Ա����
	private static Singleton instance;

	// ���췽������Ƴ�˽�еģ���ֹ�ⲿ����ķ��ʣ�ֻ�����ڲ�����
	private Singleton() {
		// �����߼�
	}

	// �ṩ��һ�����ⲿ���ʱ�class�ľ�̬���������ر����һ��ʵ��
	// ���ڱ���Ĺ��췽��˽�л����ⲿ�޷����ã����Է��ʽӿڱ�����Ƴɾ�̬�ģ�ͨ���������ɷ���
	public static Singleton getInstance() {
		// �ڵ�һ��ʹ��ʱ������ʵ������Ϊ����ʽ������Ч�ʸ��ã����Ǵ��ڶ��̷߳��ʲ���ȫ������
		if (instance == null) {
			instance = new Singleton();
		}

		return instance;
	}

	// ���߳�ͬʱ����ʱ�����ܻᴴ�����ʵ������ʱ��Ҫʹ��������֤ʵ��Ψһ
	public synchronized static Singleton getInstance2() {
		// �Է�������ͬ������Ӱ�����ܣ�������Ҫ����ͬ������飬������
		if (instance == null) {
			instance = new Singleton();
		}

		return instance;
	}

	// ˫������
	public static Singleton getInstance3() {
		if (instance == null) {
			
			synchronized (Singleton.class) {
				// ���μ�鱣֤ͬʱ�ж�instanceΪ�յĽ���ֻ��һ������ͬ��������
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		
		return instance;
	}
}