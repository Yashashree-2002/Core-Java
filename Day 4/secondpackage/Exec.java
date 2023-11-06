package secondpackage;

	import firstpackage.Base;

	public class Exec extends Base {

		public static void main(String[] args) {
			Base b = new Base();

			
			b.methodPublic();
			b.display();

			
			b.varPublic = 67;

			
			b.methodPublic();


		}

	}

