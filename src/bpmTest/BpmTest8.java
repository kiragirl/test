package bpmTest;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

import com.actionsoft.awf.services.WSDKException;
import com.actionsoft.sdk.services.JWS;

public class BpmTest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		    JWS.Session bo = JWS.Session.create("http://localhost:8088/services/SessionService", "fe292c2ee5a3593b535cb3ad68abf199");
			System.out.println(bo.createSession("admin", "123456", "cn", "192.168.1.63"));;
			//(32030, buf, "8751f829454dac0677016eaf1389149f", "{8EA4210D-50BC-44A6-B453-9759D640DDBA}.jpg");
		} catch (WSDKException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }

}
