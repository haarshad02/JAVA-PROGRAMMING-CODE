class OtpGenerator 
{
	public static void main(String[] args) 
	{
		String otp = "";
		int cnt = 0;

		while(true){
			otp += (int)(Math.random()*1000000);
			if(otp.length() == 6){
				System.out.println(otp);
				cnt++;
			}
			if(cnt == 10) break;
			otp = "";
		}
		System.out.println();
	}
}
