package com.yzq.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

public class VsftpdTest {
	public static void main(String[] args) throws SocketException, IOException {
		FTPClient ftp = new FTPClient();
		//����IP�Ͷ˿ڣ�д���û���������֮ǰ
		ftp.connect("192.168.136.147",21);
		//�����û��û��������루��Ҫ������IP��ַ֮��
		ftp.login("ftpuser", "ftpuser");
		//�����ļ�����
		ftp.setFileType(FTP.BINARY_FILE_TYPE);
		InputStream is = new FileInputStream("E:/test.png");
		//�ϴ�����һ�������ǲ��޴洢ʱ����
		ftp.storeFile("hello.png", is);
		//�˳�
		ftp.logout();
		System.out.println("�ϴ��ɹ�");
	}
}
