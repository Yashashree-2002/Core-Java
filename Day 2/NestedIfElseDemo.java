
public class NestedIfElseDemo {

		public static void main(String[] args) {
			
			int a=25,b=15,c=30;
			if(a>b)  
			{
				if(a>c)//True
				
					System.out.println("a is the largest number"); //True
				else
					System.out.println("c is the largest number"); //False
			}
			else
			{
				if(b>c)
					System.out.println("b is the largest number"); //True
				else
					System.out.println("c is the largest number"); //False
			}

		}

	}


