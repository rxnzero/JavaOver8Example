package com.dhlee.common.string;

public class StringUtils {
	public static String replace(String source, String find, String repl) {
		return source.replace(find, repl);
	}
	public static void main(String[] args) {
		System.out.println(replace("Hello java module name", "name", "dhlee"));
	}

}
