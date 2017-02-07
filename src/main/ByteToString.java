package main;

import java.util.ArrayList;
import java.util.List;

/**
 * 16进制字节转字符串
 * @author carol
 *
 */
public class ByteToString {
	public static void main(String[] args) {
		Byte[] req = new Byte[20];
		 List<String> strs = new ArrayList<String>();
	        for(int i = 0;i<req.length;i++){
	        	int v = req[i] & 0xFF;
	        	String hv = Integer.toHexString(v).toUpperCase();
	        	if(hv.length() < 2){
	        		strs.add("0"+hv);
	        	}
	        	else{
	        		strs.add(hv);
	        	}
	        }
	        String[] datas = (String[])strs.toArray(new String[strs.size()]);
	        StringBuffer sb = new StringBuffer();
	        for(int i = 0;i<datas.length;i++){
	        	sb.append(datas[i].toUpperCase());
	        }
	        System.out.println(sb.toString());
	}
}
