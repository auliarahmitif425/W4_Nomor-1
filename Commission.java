public class Commission extends Hourly{
  // menyimpan total penjualan yang dilakukan pegawai
  private double totalSales;
  // menyimpan persentase komisi dari penjualan
  private double commissionRate;
 
  // constructor Commission
 public Commission(String eName, String eAddress, String ePhone, 
                   String socSecNumber, double rate, double commissionRate){

   // memanggil constructor parent class (Hourly)
   super(eName, eAddress, ePhone, socSecNumber, rate);
   
   this.commissionRate = commissionRate;
   this.totalSales = 0;
  }
  
  // method untuk menambahkan total penjualan pegawai
  public void addSales(double sales){
    totalSales += sales;     
  }
  
  
  // method untuk menghitung gaji pegawai Commission
  @Override
  public double pay(){
    double payment = super.pay(); //menghitung gaji berdasarkan jam kerja
    payment += totalSales * commissionRate;
    totalSales = 0;
    return payment;       
  }
  
  // menampilkan informasi pegawai Commission
  @Override
  public String toString(){
    String result =super.toString();
    result += "\nTotal Sales: " + totalSales;
    result += "\nCommission Rate:" + commissionRate;
    return result;
  }
}