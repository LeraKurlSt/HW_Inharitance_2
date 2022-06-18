public class Task1 {

    // Разработать  и  протестировать  набор  классов  для  реше-ния  задачи
    // подсчета  зароботной  платы  сотрудников  неко-торой фирмы.
    private String surname;
    private PaymentType paymentType;
    private double paymentValue;
    private int taxRate;

    public Task1(String surname, PaymentType paymentType, double paymentValue){
        this.surname = surname;
        this.paymentType = paymentType;
        this. paymentValue = paymentValue;
    }

    public double getPaymentValue() {
        return paymentValue;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public String getSurname() {
        return surname;
    }

    protected int getTaxRate() {
        return paymentType.getTaxRate();
    }

    public double getSalaryValue() {
        return getPaymentValue() * (100 - getTaxRate()) / 100;
    }

    protected void printHeadForTask_1() {
        System.out.printf("%10s %12s %9s \n", "Surname", "PaymentType", "Net");
    }
    protected void printBodyForTask_1() {
        System.out.printf("%10s %11s %12.2f \n", getSurname(), getPaymentType(), getPaymentValue());
    }

    protected void printHead() {
        System.out.printf("%10s %12s %11s %13s \n", "Surname", "TaxRate(%)", "Gross rate", "Net rate");

    }
    protected void printBody() {
        System.out.printf("%10s %11d %12.2f %13.2f \n", getSurname(), getTaxRate(), getPaymentValue(), getSalaryValue());
    }
}
enum PaymentType{
    RATE(20), HOURLY(20), PIECEWORK(15);

    private int taxRate;

    PaymentType(int taxRate) {
        this.taxRate = taxRate;
    }

    public int getTaxRate() {
        return taxRate;
    }
}
