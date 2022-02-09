
   
class Abc extends Thread 
{
	@Override
	public void run()
	{
		for(char ch='a';ch<='z';ch++)
		{
			System.out.println(ch);
			 try
			 {
				 Thread.sleep(500);
			 }
			 catch(InterruptedException e)
			 {
				 e.printStackTrace();
			 }
		}
	}
}
public class ThreadByExtending {

	public static void main(String[] args) {
		
      Thread ab=new Abc();
    		  ab.start();
    		  for(int i=1;i<=50;i++)
    		  {
    			  System.out.println(i);
    			  try
    			  {
    				  Thread.sleep(500);
    			  }
    			  catch(InterruptedException e)
    				 {
    					 e.printStackTrace();
    				 }
    		  }
	}

}






class Xyz implements Runnable

{
 @Override
 public void run()
 {
	 for(char ch='a';ch<='z';ch++)
	 {
		 System.out.println(ch);
		 try
		 {
			 Thread.sleep(500);
		 }
		 catch(InterruptedException e)
		 {
			 e.printStackTrace();
		 }
      }
   }
}
public class ThreadByRunnable {

	public static void main(String[] args) {
		Runnable ab=new Xyz();
		Thread m=new Thread(ab);
		  m.start();
		  for(int i=1;i<=50;i++)
		  {
			  System.out.println(i);
			  try
			  {
				  Thread.sleep(500);
			  }
			  catch(InterruptedException e)
				 {
					 e.printStackTrace();
				 }
		      }
		   }
		}

	