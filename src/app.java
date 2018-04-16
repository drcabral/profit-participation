import java.util.Scanner;

public class app {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int totalEmployees = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the company profit of this year: ");
        double profit = Double.parseDouble(scanner.nextLine());

        Company company = new Company(totalEmployees, profit);

        System.out.println("\nTo check profit participation please insert the next values");
        System.out.print("Enter the employee occupation: ");
        String occupation = scanner.nextLine();
        System.out.print("Enter the employee performance: ");
        int performance = Integer.parseInt(scanner.nextLine());

        double totalProfitParticipation = company.getTotalProfitParticipation(occupation, performance);

        System.out.printf("The total value of profit participation was %.3f %n", totalProfitParticipation);
    }

}
