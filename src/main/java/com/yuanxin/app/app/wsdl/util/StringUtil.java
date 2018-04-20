package com.yuanxin.app.app.wsdl.util;

public class StringUtil {

	private static final String ENGLISH_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	/**
	 * 获取首字母或汉字来，用来进行绘制头像
	 * 
	 * @param nick
	 * @return
	 */
	public static String getCharString(String nick) {
		String name = "";
		if (nick == null) {
			return String.valueOf(ENGLISH_CHARS.charAt((int) (Math.random() * 26)));
		}
		char c1 = 0;
		char c2 = 0;
		char c3 = 0;
		char[] chars = nick.toCharArray();
		//System.out.println(chars.length);
		if (chars.length > 0) {

			char c = chars[0];
			c1 = chars[0];
			c2 = chars[1];
			

			if (Character.isLetter(c)) {
				// 是字母
				if (Character.isLowerCase(c)) {
					// 是否是小写字母
					c = Character.toUpperCase(c);
					return String.valueOf(c);
				} else {
					if (chars.length == 3) {
						c3 = chars[2];
						name = String.valueOf(chars[1]) + String.valueOf(chars[2]);
					}else if (chars.length == 4) {
						name = String.valueOf(chars[2]) + String.valueOf(chars[3]);
					}else {
						name = String.valueOf(chars[0]) + String.valueOf(chars[1]);
					}
					
					return name;
				}
			} else {
				// 不是字母返回
				return String.valueOf(c);
			}
		}
		return String.valueOf(ENGLISH_CHARS.charAt((int) (Math.random() * 26)));
	}

}