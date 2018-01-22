package bpmTest;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.stream.FileImageOutputStream;

import org.apache.commons.io.IOUtils;

public class BpmTest2 {

	public static void main(String[] args) {
		//图片读取
		 String profileUUID = "ff3953d3dbf4325a27dfddb7df9fc510";
		// URLDecoder URLDecoder = new URLDecoder();
		 String fileName = "";
		 int boid = 32030;
		 try {
			 fileName = URLEncoder.encode("{7A163D4D-4A47-43FA-887E-18180B717220}.jpg","UTF-8");
			 
		} catch (UnsupportedEncodingException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		 String url = "http://localhost:8088/services/rs/bo/" + profileUUID + "/downloadFileByFiled/"+boid+"/8751f829454dac0677016eaf1389149f/"+fileName;//%7B8EA4210D-50BC-44A6-B453-9759D640DDBA%7D.jpg
		 // localhost改成真实IP，8088改成真实端口 /downloadFileByFiled/{boId}/{fieldUUID}/{fileName} /31529/8751f829454dac0677016eaf1389149f/{8EA4210D-50BC-44A6-B453-9759D640DDBA}.jpg
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
		connection.setDoOutput(true);  
		 ByteArrayOutputStream bos = new ByteArrayOutputStream(); 
		 
		 /*	try {
			//	byte[]  b1 = BOInstanceAPI.getInstance().downloadFileByFiled(31529, "8751f829454dac0677016eaf1389149f", "{8EA4210D-50BC-44A6-B453-9759D640DDBA}.jpg");
			//	System.out.println(b1.length); 
				
				File file2 = new File("D:\\{8EA4210D-50BC-44A6-B453-9759D640DDBA}.jpg");
				FileImageInputStream fis = new FileImageInputStream(file2);
			    byte[] buf = new byte[(int) file2.length()];
			    System.out.println(buf.length);
			    fis.read(buf);
			    fis.close();
			    BOInstanceAPI.getInstance().upFileByFiled(31529, buf, "8751f829454dac0677016eaf1389149f", "{8EA4210D-50BC-44A6-B453-9759D640DDBA}.jpg");
			} catch (AWSSDKException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		 ///31529/8751f829454dac0677016eaf1389149f/{8EA4210D-50BC-44A6-B453-9759D640DDBA}.jpg
	/*	 try {
			bos.write("boId=31529&fieldUUID=8751f829454dac0677016eaf1389149f&fileName={8EA4210D-50BC-44A6-B453-9759D640DDBA}.jpg".getBytes());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		 try {
			IOUtils.copy(connection.getInputStream(), bos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 connection.disconnect();
		 try {
			byte[] buf = bos.toByteArray();
			String newFilename="e:\\1.png";
	        FileImageOutputStream imgout=new FileImageOutputStream(new File(newFilename));
			imgout.write(buf);
			imgout.close();
			//System.out.println(bos.toString("utf-8"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}
