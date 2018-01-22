package bpmTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;








import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.kxml2.kdom.Element;
import org.kxml2.kdom.Node;

public class BpmTest9 {

	public static void main(String[] args) {
		NewTheadUtil n = new NewTheadUtil();
		Map map2 = new HashMap<String,Objects>();
        map2.put("companyId",6324);
        map2.put("parentDepartmentId",6273);
        Object[] params2 = new Object[]{"getDepartmentList", NameSpace.url.orgServiceUrl,map2};
        System.out.println(n.doInBackground(params2));
        String result = (String)n.doInBackground(params2);
        String json = result.split("#")[1];
        JSONArray jsonA = JSONArray.fromObject(json);
        System.out.println(jsonA.size());;
        List hkjl = new ArrayList();
        Map khMap = new HashMap();
        for(int i=0;i<jsonA.size();i++){
        	System.out.println(jsonA.getJSONObject(i).get("id"));
        	Map map = new HashMap<String,Objects>();
	        map.put("departmentId",jsonA.getJSONObject(i).get("id"));
	        Object[] params = new Object[]{"getUserList", NameSpace.url.orgServiceUrl,map};
	        System.out.println(n.doInBackground(params));
	        String re = (String)n.doInBackground(params);
	        JSONArray jsonB = new JSONArray().fromObject(re.split("#")[1]);
	        //将用户名和userid作为id存入map id为值
	        for(int j=0;j<jsonB.size();j++){
	        	hkjl.add(String.valueOf(jsonB.getJSONObject(j).get("userName"))+"("+String.valueOf(jsonB.getJSONObject(j).get("userId"))+")");
	        	khMap.put(String.valueOf(jsonB.getJSONObject(j).get("userName"))+"("+String.valueOf(jsonB.getJSONObject(j).get("userId"))+")",String.valueOf(jsonB.getJSONObject(j).get("id")));
	        }
        }
        //System.out.println(jsonB.size());
        String[] toBeStored = (String[]) hkjl.toArray(new String[hkjl.size()]); 
      //  JSONObject jsonObject = new JSONObject(json);
		 	
	}
	
}
