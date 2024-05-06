public class CompoundInterest {
    public static void main(String[] args){
        double principal = 1000.0;
        int totalYears = 10;

        System.out.println();
        System.out.println();

        System.out.println("Year | Amount on deposit");
        System.out.println();

        for (int year =1; year <= totalYears; year++){
            principal *= 1.05;
            System.out.printf("%4d  $%, .2f\n", year, principal);
        }
    }
    
}
