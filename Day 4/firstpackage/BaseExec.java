package firstpackage;

public class BaseExec {

		public static void main(String[] args) {
			Base b=new Base();
			
			b.methodDefault();
			b.methodProtected();
			b.methodPublic();
			
			b.varDefault=150;
			b.varProtected=224;
			b.varPublic=667;
			

			b.methodDefault();
			b.methodProtected();
			b.methodPublic();
			
			

		}

	}

