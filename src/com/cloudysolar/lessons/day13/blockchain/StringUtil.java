package com.cloudysolar.lessons.day13.blockchain;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class StringUtil {

	// SHA256 해시 생성 메소드
	public static String applySHA256(String input) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");

			byte[] hash = digest.digest(input.getBytes(StandardCharsets.UTF_8));

			StringBuffer hexString = new StringBuffer();

			for (int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);

				if (hexString.length() == 1) {
					hexString.append('0');
				}

				hexString.append(hex);
			}

			return hexString.toString();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}