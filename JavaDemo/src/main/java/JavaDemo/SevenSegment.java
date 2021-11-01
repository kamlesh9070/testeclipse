package JavaDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class SevenSegment {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int Length = Integer.parseInt(br.readLine().trim());
            String N = br.readLine();

            int out_ = Solve(Length, N);
            System.out.println(out_);
            
         }

         wr.close();
         br.close();
    }
	/*static int Solve(int Length, String N){
	       // Write your code here
	       int seg[]={6,2,5,5,4,5,5,3,7,6};
	       int count=0;
	       for(int i =0;i<Length;i++){
	           int ele = Integer.parseInt(N.charAt(i)+"");
	           count+=seg[ele];
	       }
	       return count;
	    
	    }*/
	static int Solve(int Length, String N){
	
	String s[]={"1111110","0110000","1101101","1111001","0110011","1011011","0011111",      "1110000","11111111","1110011"};
	String str="00000000";
	int count=0;
	for(int i=0;i<Length;i++){
	    String str2=s[Integer.parseInt(N.charAt(i)+"")];
	    for(int j=0;j<7;j++){
	        char ch1=str.charAt(j);
	        char ch2=str2.charAt(j);
	        if(ch1!=ch2){
	            count++;
	        }
	    }
	    str=str2;
	}
	return count;
	
	}
	/*public static void main(String args[]) throws Exception {
	
		int arr[] = new int[] { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		StringBuilder str = new StringBuilder("");
		while (test-- != 0) {
			int count = 0;
			String st = br.readLine();
			for (int i = 0; i < st.length(); i++) {
				count += arr[st.charAt(i) - '0'];
			}
			if (count % 2 == 1) {
				str.append("7");
				count -= 3;
				for (int i = 0; i < count; i += 2) {
					str.append("1");
				}
			} else {
				for (int i = 0; i < count; i += 2) {
					str.append("1");
				}
			}
			str.append("\n");
		}
		System.out.println(str);
	}*/
}
