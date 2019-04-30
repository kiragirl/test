import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 请求富友工具类 Title: FuiouOperationUtil Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年3月1日
 *
 */
public class FuiouOperationUtil{

	public static <T extends ReqData> T rspWebDataToBean(T t) {
		System.out.println(t.getSignature());
		return t;
	}

	public static boolean isEmpty(String value) {
		return value == null || value.length() == 0;

	}

	private static String getMethodName(String fildeName) {
		byte[] items = fildeName.getBytes();
		items[0] = (byte) ((char) items[0] - 'a' + 'A');
		return new String(items);
	}

	public static String getSignature(ReqData ReqData) {
		// 拿到该类
		Class<?> clz = ReqData.getClass();
		// 获取实体类的所有属性，返回Field数组
		Field[] fields = clz.getDeclaredFields();
		List<String> list = new ArrayList<String>();
		// 获取实体类的所有属性，返回Field数组
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			if (field.getGenericType().toString().equals("class java.lang.String")) {
				list.add(field.getName());
			}
		}
		// 拿到父类该类
		Class<?> clzSuper = ReqData.getClass().getSuperclass();
		if (null != clzSuper) {
			Field[] fieldsSuper = clzSuper.getDeclaredFields();
			for (int i = 0; i < fieldsSuper.length; i++) {
				Field field = fieldsSuper[i];
				if (!list.contains(field.getName())) {
					if (field.getGenericType().toString().equals("class java.lang.String")) {
						list.add(field.getName());
					}
				}
			}
		}

		String[] arrayToSort = list.toArray(new String[list.size()]);
		Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
		String signature = "";
		for (String ss : arrayToSort) {
			String val = null;
			try {
				Method m = clz.getMethod("get" + getMethodName(ss));
				val = (String) m.invoke(ReqData);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			}
			if (!isEmpty(val)) {
				signature = signature + val + "|";
			}
		}
		if (signature.charAt(signature.length() - 1) == '|') {
			signature = signature.substring(0, signature.length() - 1);
		}
		return signature;
	}

}
