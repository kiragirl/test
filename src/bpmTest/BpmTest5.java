package bpmTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

import javax.imageio.stream.FileImageInputStream;


import com.actionsoft.awf.services.WSDKException;
import com.actionsoft.sdk.services.JWS;

public class BpmTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	try{
			
		JWS.Workflow wf = JWS.Workflow.create("http://IP:PORT/services/WorkflowService", "流程策略UUID"); JWS.WorkflowTask wftask =
				//提示：如果客户端环境引入以上目弽类库文件后，出现Jar包冲突，可将冲突Jar包替换为对应较高版本。
		JWS.WorkflowTask.create("http://IP:PORT/services/WorkflowTaskService", "流程任务策略UUID"); 
			HttpClient httpClient = new HttpClient();
			File file2 = new File("D:\\{8EA4210D-50BC-44A6-B453-9759D640DDBA}.jpg");
			FileImageInputStream fis;
			try {
				fis = new FileImageInputStream(file2);
				byte[] buf = new byte[(int) file2.length()];
			    System.out.println(buf.length);
			    fis.read(buf);
			    fis.close();
			    JWS.BO bo = JWS.BO.create("http://localhost:8088/services/BOService", "ff3953d3dbf4325a27dfddb7df9fc510");
				bo.upFileByFiled(32030, buf, "8751f829454dac0677016eaf1389149f", "{8EA4210D-50BC-44A6-B453-9759D640DDBA}.jpg");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		
		int processInstanceId = wf.createProcessInstance("feb4036f2297456600d67c8c0d1277fa", "admin", "29日VIP套餐"); 
		// 创建任务实例
		int[] processTaskInstanceIds = wftask.createProcessTaskInstance("admin", processInstanceId, 1, "admin", "29日VIP套餐");
		Hashtable recordData = new Hashtable();
		// 初始化BO数据 
		recordData.put("F1", "NO20100311320");
		recordData.put("F2", "彩铃服务"); 
		int boId = bo.createBOData("BO_DEV_T1", recordData, processInstanceId, "admin"); 
		Vector recordDatas = new Vector();
		Hashtable subRecordData1 = new Hashtable();
		subRecordData1.put("S1", "CX001"); 
		subRecordData1.put("S2", "A类"); subRecordData1.put("S3", "329");
		recordDatas.add(subRecordData1); 
		Hashtable subRecordData2 = new Hashtable(); 
		subRecordData2.put("S1", "CX002"); 
		subRecordData2.put("S2", "B类"); 
		subRecordData2.put("S3", "98"); 
		recordDatas.add(subRecordData2);
		int[] boIds = bo.createBOData("BO_DEV_T2", recordDatas, processInstanceId, "admin"); 
		} catch (WSDKException ae) { 
			ae.printStackTrace(System.err);
			} */
		}
	
}
