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
		//设置IP和端口，写在用户名和密码之前
		ftp.connect("192.168.136.147",21);
		//设置用户用户名和密码（需要在连接IP地址之后）
		ftp.login("ftpuser", "ftpuser");
		//设置文件类型
		ftp.setFileType(FTP.BINARY_FILE_TYPE);
		InputStream is = new FileInputStream("E:/test.png");
		//上传，第一个参数是餐宿存储时名称
		ftp.storeFile("hello.png", is);
		//退出
		ftp.logout();
		System.out.println("上传成功");
	}
}
