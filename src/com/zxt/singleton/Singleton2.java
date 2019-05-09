package com.zxt.singleton;

/**
 * 
 * @Description: ����ģʽ������ʽ
 *
 * @author�� zxt
 *
 * @time: 2018��3��13�� ����3:31:29
 *
 */
public class Singleton2 {
	// �������͵�˽�г�Ա�������ڳ�ʼ��ʱ���������ʵ��������ǰռ��ϵͳ��Դ���������Ӱ�ȫ
	private static Singleton2 instance = new Singleton2();

	// ���췽������Ƴ�˽�еģ���ֹ�ⲿ����ķ��ʣ�ֻ�����ڲ�����
	private Singleton2() {
		// �����߼�
	}

	// �ṩ��һ�����ⲿ���ʱ�class�ľ�̬���������ر����һ��ʵ��
	public static Singleton2 getInstance() {
		return instance;
	}
}
