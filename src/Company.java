public class Company {

    private int totalEmployes;
    private double profit;

    public Company(int totalEmployees, double profit){
        this.totalEmployes = totalEmployees;
        this.profit = profit;
    }

    public double getTotalProfitParticipation(String occupation, int performance){
        CompanyProfitOperations profitOperations = new CompanyProfitOperations(occupation, performance, this.profit, this.totalEmployes);
        if(profitOperations.validateParticipation()){
            return profitOperations.getProfitParticipation();
        } else {
          return 0;
        }
    }
}
