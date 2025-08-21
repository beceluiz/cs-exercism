public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
         return daysSkipped >= 5 ? 0.85 : 1.0; 
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold >= 20 ? productsSold * 13 : productsSold * 10;       
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = (1000.0 * salaryMultiplier(daysSkipped)) + bonusForProductsSold(productsSold);
        return salary < 2000.0 ? salary : 2000.0;
    } 
}
