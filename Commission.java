public class Commission extends Hourly{
  private double totalSales;
  private double commisionRate;
 
 public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commisionRate){
  super(eName, eAddress, ePhone, socSecNumber, rate);
  this.commisionRate = commisionRate;
  this.totalSales = 0;
 }
  public void addSales(double sales){
   totalSales += sales;     
  }
  @Override
  public double pay(){
   double payment = super.pay(); //menghitung gaji berdasarkan jam kerja
   payment += totalSales * commisionRate;
   totalSales = 0;
   return payment;       
  }
  @Override
  public String toString(){
   String result =super.toString();
   result += "\nTotal Sales: " + totalSales;
   result += "\nCommission Rate:" + commisionRate;
   return result;
  }
}