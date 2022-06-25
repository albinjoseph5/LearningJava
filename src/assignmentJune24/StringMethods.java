package assignmentJune24;

public class StringMethods {
	public static void main(String[] args) {
		// #1
		String name = "Albin Joseph";
		System.out.println("String Length : " + name.length());

		// #2
		String str1 = "Albin";
		String str2 = "Joseph";
		System.out.println(str1.concat(str2));

		// #3
		char[] chars = name.toCharArray();
		System.out.println(name);
		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
		}
		System.out.println("\n");

		// #4
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(6));
		System.out.println("\n");

		// #5
		System.out.println(str1.compareTo(str2));
		System.out.println("\n");

		// #6
		String str = "My name is Albin";
		System.out.println(str.contains(str1));
		System.out.println(str.contains(str2));
		System.out.println("\n");

		// #7
		String str3 = "MyxyznamexyzisxyzAlbinxyzJoseph";
		String[] split = str3.split("xyz");
		for (String obj : split) {
			System.out.println(obj);
		}
		System.out.println("\n");

		// #8
		System.out.println("Index of 'i' is " + str.indexOf('i'));
		System.out.println("Last index of 'i is " + str.lastIndexOf('i'));
		System.out.println("\n");

		// #9
		Integer obj = new Integer(10);
		String string1 = obj.toString();
		String string2 = obj.toString(80);
		String string3 = obj.toString(9823, 2);
		System.out.println(string1);
		System.out.println(string2);
		System.out.println(string3);
		System.out.println("\n");

		// #10
		String string4 = "niblA si eman yM";
		StringBuffer sb = new StringBuffer(string4);
		sb.reverse();
		System.out.println(sb);
		System.out.println("\n");

		// #11
		String str5 = "Shot";
		String replace = str5.replace('o', 'u');
		System.out.println(str5);
		System.out.println(replace);
		System.out.println("\n");

		// #12
		System.out.println(str.substring(3, 7));

	}

}
