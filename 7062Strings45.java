class spro2
{
    public static void main(String arr[])
    {
    String s= "hello world";
    System.out.println("String: "+s);
    int x= s.length();
  
    while(x>0)
    {
      System.out.print(s.charAt(x-1));
      x--;
    }

    }
}