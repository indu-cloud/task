
class Prime
{
    public static void main(String args[])
    {
      System.out.println("Enter the range:");
      int n;
      int count=0;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      for(int i=2;i<n;i++)
      {
          if(n%i==0)
          {
              count=count+1;
          }
      }
      if(count==2)
      {
          System.out.println(n+"is a prime number");
      }
      else
      {
          System.out.println(n+ "is not a prime number");
      }
          
    }
}
