package thirdpackage;

public class SampleClass {
		private int id;
		
		private static SampleClass obj=new SampleClass();

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		private SampleClass() {
			System.out.println("Private constructor is created");
		}
		public static SampleClass getObject()
		{
		return obj;
		}

		
		public String toString() {
			return "MyClass [id=" + id + "]";
		}
		
		

	}

