package test;

public class StringReve {

	public static void main(String[] args) {
		String str = "hi welcome to wipro"; 
		
		// o/p orpiw ot emoclew ih
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		
		// o/p wipro to welcome hi 
		String[] s = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i= s.length-1;i>=0;i--) {
			sb.append(s[i]+" ");
		}
		System.out.println();
		System.out.println(sb.toString());
	}

}
