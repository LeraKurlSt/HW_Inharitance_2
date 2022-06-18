public class Task5 extends Task4{
    private boolean offShore;
    public Task5(String surname, PaymentType paymentType, double paymentValue, boolean noChildren, boolean offShore) {
        super(surname, paymentType, paymentValue, noChildren);
        this.offShore = offShore;
    }

    public void setOffShore(boolean ofShore) {
        offShore = ofShore;
    }
    public boolean isOfShore() {
        return offShore;
    }

    @Override
    protected int getTaxRate(){
        if (offShore){
            return 0;
        }else {
            return super.getTaxRate();
        }
    }
}
