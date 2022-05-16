package hw3JavaVariables;

public class AboutMe {
	public String myInfo; // Variable declared
	public byte age = 23; // here is initialized
	public short myYearlySalary = 32000;
	public int myBankbalance = 80000;
	public long myLastFiveYearsIncome = 4000000l;
	public float myHeight = 5.8464f;
	public double myWeight = 150.2221651562;
	public char myGender = 'M';
	public boolean iamNormal = true;

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe();

		System.out.println(" My age " + aboutMe.age + " \n My total Income since I am here "
				+ aboutMe.myLastFiveYearsIncome + ".");
	}
}
