package bpmTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;


















import javax.imageio.stream.FileImageInputStream;




public class BpmTest4 {

	public static void main(String[] args) {
		/*		try{
		HttpClient httpClient = new HttpClient();
		File file2 = new File("D:\\{8EA4210D-50BC-44A6-B453-9759D640DDBA}.jpg");
		FileImageInputStream fis = new FileImageInputStream(file2);
	    byte[] buf = new byte[(int) file2.length()];
	    System.out.println(buf.length);
	    fis.read(buf);
	    fis.close();
		String profileUUID = "ff3953d3dbf4325a27dfddb7df9fc510";
			// URLDecoder URLDecoder = new URLDecoder();
		String fileName = URLEncoder.encode("{8EA4210D-50BC-44A6-B453-9759D640DDBA}.jpg","UTF-8");
		String url = "http://localhost:8088/services/rs/bo/"
				+ profileUUID
				+ "/upFileByFiled/31529/8751f829454dac0677016eaf1389149f/"+fileName;
		String url = "http://localhost:8088/services/rs/bo/"
				+ profileUUID
				+ "/upFileByFiled";
		PostMethod postmethod = new PostMethod(url);
		System.out.println(url);
		//PartSource partSource = new ByteArrayPartSource("bytes",buf);
		Part[] parts = {new FilePart("bytes",new ByteArrayPartSource("bytes",buf))};
		postmethod.setRequestEntity(new MultipartRequestEntity(parts, postmethod.getParams()));
		postmethod.getParams().setParameter(
				HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");
		postmethod.addParameter("boId", "32030");
		postmethod.addParameter("fieldUUID","8751f829454dac0677016eaf1389149f");
		postmethod.addParameter("fileName", "{8EA4210D-50BC-44A6-B453-9759D640DDBA}.jpg");
		//postmethod.addParameter("bytes",buf.toString());
		//postmethod.getParams().setParameter("bytes", buf);
	
		//System.out.println("postmethod.getParameter: "+postmethod.getParameter("inAccountType"));
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
	
		String sumapayResult = "";
		int statusCode = httpClient.executeMethod(postmethod);
		//System.out.println(statusCode);
			if (statusCode != HttpStatus.SC_OK) {
				// TODO 请求失败，进行相应业务处理
			
				System.out.println(statusCode);
				//return resultMap;
			} else {
				// 获取返回值
					sumapayResult = postmethod.getResponseBodyAsString();
					System.out.println("12312"+sumapayResult);
			}
		} catch (HttpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	
	}

}
