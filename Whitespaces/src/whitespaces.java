
public class whitespaces {

	public static void main(String args[]){
		String str ="Wipro Technologies Pune";
		char[] strArray = str.toCharArray();
		StringBuffer strbuffer = new StringBuffer();
		
		for(int i=0;i<strArray.length;i++){
			if((strArray[i] !=' ') && (strArray[i]!='\t')){
				strbuffer.append(strArray[i]);
			}
		}
		
		String s = strbuffer.toString();
		System.out.println(s);
	}
}
