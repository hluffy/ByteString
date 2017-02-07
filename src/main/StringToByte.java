package main;

/**
 * 字符串转字节
 * @author carol
 *
 */
public class StringToByte {
	public static void main(String[] args) {
		String hexString = "";
		hexString = hexString.toUpperCase();   
        int length = hexString.length() / 2;   
        char[] hexChars = hexString.toCharArray();   
        byte[] d = new byte[length];   
        for (int i = 0; i < length; i++) {   
            int pos = i * 2;   
            d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));   
        } 
	}
	
	 private static byte charToByte(char c) {   
	        return (byte) "0123456789ABCDEF".indexOf(c);   
	 } 

}
