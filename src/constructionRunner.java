import java.util.Scanner;

public class constructionRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How many boards of lumber needed ");
        int numberOfBoards = s.nextInt();
        System.out.print("How many windows needed ");
        int numberOfWindows = s.nextInt();
        System.out.print("Tax rate in the area ");
        double taxRate = s.nextDouble();
        ConstructionPricer build = new ConstructionPricer(numberOfBoards, numberOfWindows, taxRate);
        System.out.println("total materials cost: " + build.materialsCost(numberOfBoards, numberOfWindows));
        System.out.println("total after tax: " + build.totalWithTax(build.materialsCost(numberOfBoards, numberOfWindows)));

}
}
