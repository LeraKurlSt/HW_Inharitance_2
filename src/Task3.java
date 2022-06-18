public abstract class Task3 extends Task1{

    public Task3(String surname, PaymentType paymentType, double paymentValue) {
        super(surname, paymentType, paymentValue);
    }

    private boolean noChildren = true;

    public Task3(String surname, PaymentType paymentType, double paymentValue, boolean noChildren){
        super(surname, paymentType, paymentValue);
        this.noChildren = noChildren;
    }

    @Override
    protected int getTaxRate() {
        if (noChildren){
            return (super.getTaxRate() + 5);
        }else {
            return super.getTaxRate();
        }
    }

    protected abstract void printHeadForTask_4();

    protected abstract void printBodyForTask_4();
}
