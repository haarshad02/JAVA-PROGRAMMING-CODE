class Population 
{
	public static void main(String[] args) 
	{
		long cp = 312032486l;

		long sec = (365*24*60*60)*5;

		long birth = sec/7;
		long death = sec/13;
		long imm = sec/45;

		long np = cp+birth-death+imm;

		System.out.println("Current Population : " + cp);
		System.out.println("Population after 5 Years : " + np);
	}
}
