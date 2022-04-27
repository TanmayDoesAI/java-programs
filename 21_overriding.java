class vehicle
  {  
    void run()
    {
      System.out.println("Vehicle");}  
  }  
  class bike extends vehicle
  {  
    void run()
    {System.out.println("Bike");}  
  }  
class overriding
{
  public static void main(String args[])
    {  
      bike obj = new bike();  
      obj.run();  
    }  
}
