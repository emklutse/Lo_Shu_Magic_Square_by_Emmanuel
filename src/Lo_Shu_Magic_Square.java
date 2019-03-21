import java.util.InputMismatchException;
import java.util.Scanner;

public class Lo_Shu_Magic_Square
{
	static Scanner KeyInput=new Scanner(System.in);

	public static void main(String[] args)
	{
		try
		{
		takearray();
		System.out.print("\n\nProgram restarted\n");
		main(args);
		}
		catch(InputMismatchException e)
		{
			System.out.print("Invalid Input program terminated");
		}
	}
	
	
	/*
	 * This method will take the input of the array from the user
	 */

	public static void takearray()
	{		
		int contents[][] = { {6, 1,8} , { 7, 5,3}, {2,9,4} };
	
		for(int i=0; i<contents.length;i++)
		{
			for (int j = 0; j < contents[i].length; j++) {
				System.out.print("Enter the value of element " + i + "," + j + ":");
				contents[i][j] = KeyInput.nextInt();
			}
		}

		printarray(contents);
		checkarray(contents);
		
	}

	/*
	 * 
	 * This method will take 2d array as argument and print it.
	 * 
	 * @args contents[][]
	 */
	
	public static void printarray(int contents[][])
	{
		for(int i=0; i<contents.length;i++)
		{
			System.out.print("\n");
		
			

			for(int j=0;j<contents[i].length;j++) {
				System.out.print(contents[i][j]+"\t");
			}
		}
				
	}

	/*
 	* This method will take the contents 2d array and check if that is the Lo shu square
 	* @args contents[][]
	*/

	public static void checkarray(int contents[][])
	{
		System.out.println("Testing the 2d array\n\n");
		int flag1=-1;
		int flag2=-1;
		int flag3=-1;
		int flag4=-1;

		if((contents[0][0]==2)|| (contents[0][0]==4) ||(contents[0][0]==6)||(contents[0][0]==8))
		{
			flag1=1;
							
		}
		if((contents[0][2]==2)|| (contents[0][2]==4) ||(contents[0][2]==6)||(contents[0][2]==8))
		{
			flag2=1;
							
		}
		if((contents[2][0]==2)|| (contents[2][0]==4) ||(contents[2][0]==6)||(contents[2][0]==8))
		{
			flag3=1;
							
		}
		if((contents[2][2]==2)|| (contents[2][2]==4) ||(contents[2][2]==6)||(contents[2][2]==8))
		{
			flag4=1;
							
		}

		if((flag1==1) &&(flag2==1) &&(flag3==1) &&(flag4==1))
			System.out.print("This is a Lo Shu square");
		else
			System.out.print("THis is not a Lo Shu square");
		
	}
	
}