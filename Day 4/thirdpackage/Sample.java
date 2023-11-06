package thirdpackage;

public class Sample {

		public static void main(String[] args) {
			
			
			SampleClass s1=SampleClass.getObject();
			s1.setId(101);
			System.out.println(s1);
			
			SampleClass s2=SampleClass.getObject();
			s2.setId(102);
			System.out.println(s2);
			


		}

	}

