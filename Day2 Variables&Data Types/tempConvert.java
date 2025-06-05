{
    public static void main(String[] args) {
      
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the temperature in degrees: ");
       double C = sc.nextDouble();
       
       double F = (C * 9/5) + 32;
       
       System.out.printf("The temperature in Farenheit is: %.1f°F\n" , F);
       
       sc.close();
      
    }
}