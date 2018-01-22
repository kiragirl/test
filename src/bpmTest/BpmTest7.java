package bpmTest;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;

public class BpmTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 URL url = null;
         try {
             url = new URL("http://localhost:8088/services/rs/session/fe292c2ee5a3593b535cb3ad68abf199/createSession");

             // 根据URL对象打开链接
             HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
             // 设置请求的方式
             urlConnection.setRequestMethod("POST");
             // 设置请求的超时时间
             urlConnection.setReadTimeout(5000);
             urlConnection.setConnectTimeout(5000);
             // 传递的数据
             String data = "userId=" + URLEncoder.encode("admin", "UTF-8")
                     + "&pwd=" + URLEncoder.encode("123456", "UTF-8")
                     + "&lang=" + URLEncoder.encode("cn", "UTF-8")
                     + "&bip=" + URLEncoder.encode("127.0.0.1", "UTF-8");
             // 设置请求的头
             urlConnection.setRequestProperty("Connection", "keep-alive");
             // 设置请求的头
             urlConnection.setRequestProperty("Content-Type",
                     "application/x-www-form-urlencoded");
             // 设置请求的头
             urlConnection.setRequestProperty("Content-Length",
                     String.valueOf(data.getBytes().length));
             // 设置请求的头
             urlConnection
                     .setRequestProperty("User-Agent",
                             "Mozilla/5.0 (Windows NT 6.3; WOW64; rv:27.0) Gecko/20100101 Firefox/27.0");

             urlConnection.setDoOutput(true); // 发送POST请求必须设置允许输出
             urlConnection.setDoInput(true); // 发送POST请求必须设置允许输入
             //setDoInput的默认值就是true
             //获取输出流
             OutputStream os = urlConnection.getOutputStream();
             os.write(data.getBytes());
             os.flush();
             if (urlConnection.getResponseCode() == 200) {
                 // 获取响应的输入流对象
                 InputStream is = urlConnection.getInputStream();
                 // 创建字节输出流对象
                 ByteArrayOutputStream baos = new ByteArrayOutputStream();
                 // 定义读取的长度
                 int len = 0;
                 // 定义缓冲区
                 byte buffer[] = new byte[1024];
                 // 按照缓冲区的大小，循环读取
                 while ((len = is.read(buffer)) != -1) {
                     // 根据读取的长度写入到os对象中
                     baos.write(buffer, 0, len);
                 }
                 // 释放资源
                 is.close();
                 baos.close();
                 // 返回字符串
                 final String result = new String(baos.toByteArray());
                 System.out.println(result);//Log.v("debug", result);
             }
             //Log.v("debug", "12312312313123");
            // return null;
         } catch (MalformedURLException e) {
             e.printStackTrace();
         } catch (UnsupportedEncodingException e) {
             e.printStackTrace();
         } catch (ProtocolException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }
	}

}
