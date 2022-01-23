package ProjectB;

import ImportFunctionality.ClassToBeImported;

public class ProjectB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassToBeImported obj=new ClassToBeImported();
		obj.import1();
		obj.import2();
		obj.import3();
		System.out.println("number of argument"+ args.length);
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		obj.import5();
		
	}

}
