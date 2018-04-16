public class CompanyProfitOperations {

    private String occupation;
    private int performance;
    private double profit;
    private int totalEmployees;

    public CompanyProfitOperations(String occupation, int performance, double profit, int totalEmployees) {
        this.occupation = occupation;
        this.performance = performance;
        this.profit = profit;
        this.totalEmployees = totalEmployees;
    }

    private int getOccupationMultiplication(){
        return Constants.OCCUPATION.get(this.occupation.toUpperCase());
    }

    private double getProfitPercentage(){
        return Constants.profitPercentage * this.profit;
    }

    private double getProfitThresholdByEmployees(){
        return Constants.thresholdValue * this.totalEmployees;
    }

    public double getProfitParticipation(){
        return this.performance * this.getOccupationMultiplication() * (this.getProfitPercentage() / this.totalEmployees);
    }

    public boolean validateParticipation(){
        return this.profit > getProfitThresholdByEmployees();
    }
}
