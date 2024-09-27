package module5;

public class Pattern4 {
public static void main(String[] args) {
	int row=5;
	int coloumns=5;
	char a='A';
	
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			System.out.print((char)(a+i+j) + " ");
		}
		System.out.println();
	}
}
}
