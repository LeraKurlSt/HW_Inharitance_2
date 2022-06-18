public class Task4 extends Task3{
    public Task4(String surname, PaymentType paymentType, double paymentValue, boolean noChildren) {
        super(surname, paymentType, paymentValue, noChildren);
    }

    @Override
    protected void printHeadForTask_4() {

    }

    @Override
    protected void printBodyForTask_4() {

    }

    private static double exchangeRate = 0;

    public static double getExchangeRate() {
        return exchangeRate;
    }

    public static void setExchangeRate(double exchangeRate) {
        Task4.exchangeRate = exchangeRate;
    }

    @Override
    public double getSalaryValue(){
        if (getPaymentType() == PaymentType.HOURLY){
            return (super.getSalaryValue() / 2);
        }else {
            return (super.getSalaryValue());
        }
    }

    public double getSalaryValueByAnotherCurrency() {
        if (getPaymentType() == PaymentType.HOURLY){
            return (super.getSalaryValue() / 2) * exchangeRate;
        }
        else{
            return 0;
        }
    }

    @Override
    protected void printHead(){
        System.out.printf("%15s %12s %13s %24s \n", "Surname", "TaxRate(%)", "Gross rate", "Net rate (UAH/USD)");
        System.out.printf("%60s 1/%3.3f \n","exchange rate", exchangeRate);
    }

    @Override
    protected void printBody(){
        if (getPaymentType() == PaymentType.HOURLY) {
            System.out.printf("%15s %10d %14.2f   (%7.2f / %5.2f )   \n", getSurname(), getTaxRate(), getPaymentValue(), getSalaryValue(), getSalaryValueByAnotherCurrency());
        }else{
            System.out.printf("%15s %10d %14.2f   %10.2f   \n", getSurname(), getTaxRate(), getPaymentValue(), getSalaryValue());
            }
    }
}
