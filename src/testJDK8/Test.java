package testJDK8;
public class Test {
	   public static void main( String [] args ) {
		   int i = 0, t;
		   for(t = 0;t <= 5;t++)
		   {
		   i = i++;
		   System.out.println(i);
		   }

	      P b = new B(); //                                              01
	      System.out.println( b.a ); //                                  15
	   }
	   static class P {
	      public int a;
	      public P() { //                                                04
	         a = 11; //                                                  05
	         a = 22; //                                                  06
	         diplay(); //                                                07
	      }
	      public void diplay() {
	         System.out.println( "I am in P, value is " + a );
	      }
	   }
	   static class B extends P {
	      int a;
	      public B() { //                                                02
	         super(); //                                                 03
	         a = 33; //                                                  10
	         a = 44; //                                                  11
	         diplay(); //                                                12
	      }
	      public void diplay() { //                                      08, 13
	         System.out.println( "I am in B, value is " + a ); //        09, 14
	      }
	   }
	}
