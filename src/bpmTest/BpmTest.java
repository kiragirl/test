package bpmTest;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.IOUtils;

public class BpmTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		String ss = "";
		int size = null == ss?1:ss;*/
	 String profileUUID = "fe3290f8df09a07f605ea9f558ef51e2";
	 String url = "http://localhost:8088/services/rs/md/" + profileUUID + "/getBusinessCategoryList";
	 // localhost改成真实IP，8088改成真实端口
	 HttpURLConnection connection = null;
	try {
		connection = (HttpURLConnection) new URL(url).openConnection();
	} catch (MalformedURLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	 ByteArrayOutputStream bos = new ByteArrayOutputStream(); 
	 try {
		IOUtils.copy(connection.getInputStream(), bos);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 connection.disconnect();
	 try {
		System.out.println(bos.toString("utf-8"));
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 }
}
