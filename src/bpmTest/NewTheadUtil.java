package bpmTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.kxml2.kdom.Element;
import org.kxml2.kdom.Node;

public class NewTheadUtil {
	 private final static String sessionNameSpace="http://session.level1.services.sdk.actionsoft.com/";
	    private final static String sessionAuthid="0b8d36e06972b9f44a44cb5e5fba6301";
	    private final static String orgNameSpace="http://org.level0.services.sdk.actionsoft.com/";
	    private final static String orgAuthid="0b8d36e0695cb6a70e4387771b0a8b05";
	    private  final static String serviceUrl=  "http://101.200.156.124:80/services/";
	    private  final static String headerNameSpace=  "http://services.sdk.actionsoft.com/";
	    private  final static String AwsHeader=  "AwsHeader";
	    private  final static String authidN=  "authid";
	    protected Object doInBackground(Object[] params) {
	        String result = "";
	        // WSDL文档的URL，192.168.17.156为PC的ID地址
	        // 定义调用的WebService方法名
	        String methodName = (String)params[0];
	        String nameSpace = "";
	        String serviceUrlN = "";
	        String authid = "";
	        switch ((String)params[1]){
	            case NameSpace.url.sessionServiceUrl:
	                serviceUrlN = serviceUrl+NameSpace.url.sessionServiceUrl;
	                nameSpace = sessionNameSpace;
	                authid = sessionAuthid;
	                break;
	            case NameSpace.url.orgServiceUrl:
	                serviceUrlN = serviceUrl+NameSpace.url.orgServiceUrl;
	                nameSpace = orgNameSpace;
	                authid = orgAuthid;
	                break;
	            default:return "fail#"+"参数不正确";
	        }
	        // 第1步：创建SoapObject对象，并指定WebService的命名空间和调用的方法名
	        SoapObject request = new SoapObject(nameSpace, methodName);
	        // 第2步：设置WebService方法的参数
	        Element[] header = new Element[1];
	        header[0] = new Element().createElement(headerNameSpace, AwsHeader);
	        Element username = new Element();
	        username.setName(authidN);
	        username.addChild(Node.TEXT, authid);
	        header[0].addChild(Node.ELEMENT, username);
	        Map map = (HashMap<String,Object>)params[2];
	        Iterator iter = map.entrySet().iterator();
	        while (iter.hasNext()) {
	            Map.Entry entry = (Map.Entry) iter.next();
	            String key = (String)entry.getKey();
	            Object val = entry.getValue();
	            request.addProperty(key, val);
	            }
	        //Log.v("debug", ip);//不识别ipv6地址
	        // 第3步：创建SoapSerializationEnvelope对象，并指定WebService的版本
	        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
	        // 设置bodyOut属性
	        envelope.headerOut = header;
	        envelope.bodyOut = request;
	        // 第4步：创建HttpTransportSE对象，并指定WSDL文档的URL
	        HttpTransportSE ht = new HttpTransportSE(serviceUrlN);
	        //ht.debug = true;
	        try
	        {
	            // 第5步：调用WebServicex.;
	            ht.call("", envelope);
	            if (envelope.getResponse() != null)
	            {
	                // 第6步：使用getResponse方法获得WebService方法的返回结果
	                SoapPrimitive soapObject = (SoapPrimitive) envelope.getResponse();
	                result=soapObject.toString();
	               // System.out.println("success:"+result);
	            }
	            else {
	               // Log.d("debug","333333333333333333333333333333");
	            }
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	            System.out.println(e.getMessage());
	            return "fail#"+e.getMessage();
	        }
	        return "success#"+result;
	    }
}
