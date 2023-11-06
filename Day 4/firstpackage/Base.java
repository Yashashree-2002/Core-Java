package firstpackage;

public class Base {

		private int varPrivate = 100;
		int varDefault = 120;
		protected int varProtected = 230;
		public int varPublic = 740;
		
		private void methodPrivate()
		{
			System.out.println("Private variable:"+varPrivate);
		}
		 void methodDefault()
		{
			System.out.println("Default variable:"+varDefault);
		}
		
		protected void methodProtected()
		{
			System.out.println("Protected variable:"+varProtected);
		}
		public void methodPublic()
		{
			System.out.println("Protected variable:"+varPublic);
		}
		
		public void display()
		{
			varProtected=90;
			methodProtected();
		}

	}

