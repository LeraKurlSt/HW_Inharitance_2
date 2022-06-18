public class Task6 extends Task5{
    public Task6(String surname, PaymentType paymentType, double paymentValue, boolean noChildren, boolean offShore, double benefit, int wh) {
        super(surname, paymentType, paymentValue, noChildren, offShore);
        this.benefit = benefit;
        if ((paymentType == PaymentType.HOURLY) || (paymentType == PaymentType.PIECEWORK)){
            workingHours = wh;
        }else {
            workingHours = wh * 8;
        }
    }
    private double benefit = 0;
    private int workingHours = 0;

    @Override
    public double getPaymentValue(){
        if ((workingHours <= 200) && (!isOfShore())){
            return super.getPaymentValue();
        }else {
            return super.getPaymentValue() + benefit;
        }
    }

    @Override
    public double getSalaryValueByAnotherCurrency()  {
        return super.getSalaryValueByAnotherCurrency();
    }

    @Override
    protected void printHead() {
        System.out.printf("%15s %9s %13s   %13s %24s \n", "Surname", "TaxRate(%)", "Summ", "Summ with bonus", "SalaryValue (grn/tugr)");
        System.out.printf("%76s 1/%3.2f \n","currency rate", getExchangeRate());
    }

    @Override
    protected void printBody() {
        if(getPaymentType() == PaymentType.HOURLY)
            System.out.printf("%15s %11d %14.2f  %15.2f   (%9.2f / %7.2f )   \n", getSurname(), getTaxRate(), super.getPaymentValue(),
                    getPaymentValue(), getSalaryValue(), getSalaryValueByAnotherCurrency());
        else
            System.out.printf("%15s %11d %14.2f  %15.2f  %11.2f   \n", getSurname(), getTaxRate(), super.getPaymentValue(),
                    getPaymentValue(), getSalaryValue());

    }
}
