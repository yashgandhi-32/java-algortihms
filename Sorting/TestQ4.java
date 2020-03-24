
public class TestQ4 {

	public static String[] allStrings(String charSet, int len){
        String[] prevOutput = new String[1];
        prevOutput[0] = "";
        
        for (int i = 1; i <= len; i++) {
            String[] output = new String[prevOutput.length * charSet.length()];
            int l = 0;
            for (int j = 0; j < charSet.length(); j++) {
                for (int k = 0; k < prevOutput.length; k++) {
                    output[l] = prevOutput[k] + charSet.charAt(j);
                    l = l + 1;
                }
            }
            prevOutput = output;
        }
        return prevOutput;
	}
	
	public static void main(String[] args) {
		String s = "abc";
		String[] output = allStrings(s, 4);
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

}
