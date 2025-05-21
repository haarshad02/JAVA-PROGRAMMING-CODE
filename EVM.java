import java.util.Scanner;
class EVM 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int bjp=0, cng=0, ss=0, aap=0, mns=0, nota=0;
		System.out.println("************* WELCOME ***************");
		System.out.println();
		System.out.print("Enter the Population : ");
		int pop = sc.nextInt();

		for(int i=1; i<=pop; i++){
			System.out.println("************ List of Parties ********");
			System.out.println("1. BJP");
			System.out.println("2. Congress");
			System.out.println("3. Shiv Sena");
			System.out.println("4. AAP");
			System.out.println("5. MNS");
			System.out.println("6. NOTA");
			System.out.println();
			System.out.print("Enter your Option : ");
			int op = sc.nextInt();

			if(op>=1 && op<=6){
				if(op == 1) {
					bjp++;
					System.out.println("You have Entered BJP");
				}
				if(op == 2){
					cng++;
					System.out.println("You have Entered Congress");
				}
				if(op == 3){
					ss++;
					System.out.println("You have Entered Shiv Sena");
				}
				if(op == 4){
					aap++;
					System.out.println("You have Entered AAP");
				}
				if(op == 5){
					mns++;
					System.out.println("You have Entered MNS");
				}
				if(op == 6){
					nota++;
					System.out.println("You have Entered NOTA");
				}
			}

			if(!(op>=1 && op<=6)){
				System.out.println("Invalid Response");
				i--;
			}
		}

		System.out.println();

		if(bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota){
			System.out.println("BJP has won the elections by "+bjp+" votes");
		}
		if(cng>=bjp && cng>=ss && cng>=aap && cng>=mns && cng>=nota){
			System.out.println("Congress has won the elections by "+cng+" votes");
		}
		if(ss>=cng && ss>=bjp && ss>=aap && ss>=mns && ss>=nota){
			System.out.println("Shiv Sena has won the elections by "+ss+" votes");
		}
		if(aap>=cng && aap>=ss && aap>=bjp && aap>=mns && aap>=nota){
			System.out.println("AAP has won the elections by "+aap+" votes");
		}
		if(mns>=cng && mns>=ss && mns>=aap && mns>=bjp && mns>=nota){
			System.out.println("MNS has won the elections by "+mns+" votes");
		}
		if(nota>=cng && nota>=ss && nota>=aap && nota>=mns && nota>=bjp){
			System.out.println("NOTA has won the elections by "+nota+" votes");
		}


	}
}
