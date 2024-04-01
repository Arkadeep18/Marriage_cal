import java.util.*;
public class Marriage_Predictor {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				long sum=0;
				long sum2=0;
				long sum3=0;
				long flag,flag2,flag3,flag4;
				int count=0;
				String rashi="";
				String aries="aries";
				String leo="leo";
				String pisces="pisces";
				String gemini="gemini";
				String libra="libra";
				String capricorn="capricorn";
				
				//love or arrange marriage
				
				System.out.println("Your Name");
				String me = sc.nextLine();
				
				
				System.out.println("Enter your Date of Birth DDMMYYYY");
				String dob = sc.next();
			
				
				String str = dob.substring(0,2);
				
						System.out.println(str);
						int mulyank = Integer.parseInt(str);
						
						
					while(mulyank!=0) {
						flag=mulyank%10;
						sum+=flag;			//first two
						mulyank/=10;
					}
					System.out.println("Mulank:"+sum);
					
					long bhagyank = Long.parseLong(dob);
					long dob_wrt = bhagyank;
					while(bhagyank!=0) {
						flag2=bhagyank%10;					//sum of date of birth(day)
						sum2+=flag2;
						bhagyank/=10;
					}		
					while(sum2!=0) {
						flag3=sum2%10;
						sum3+=flag3;
						sum2/=10;
					}
					System.out.println("Bhagyank:"+sum3);
					
					//checking 2,4,6,1
					String allSumStr = sum+""+sum3+""+dob_wrt;    //All numbers in a row
					long allSumInt=Long.parseLong(allSumStr);
					
					//System.out.println(allSumStr);
					System.out.println();
					int numOfDigits = allSumStr.length();   //length of all
					
					int [] digits = new int[numOfDigits];
					
						for(int a=0;a<numOfDigits;a++) {
							digits[a]=(int)(allSumInt%10);
							allSumInt/=10;
						}

						boolean found = false;
						for(int digit : digits) {
							
							if(digit == 2 || digit == 4 || digit == 6 || digit == 1) {
								count++;					}
						}
						if(count>= 3) {
							found = true;
						
						}
						if(found) {
							System.out.println("love marriage");
						}else {
							System.out.println("arrange marriage");
						}

			}

}
