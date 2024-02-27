package OOPSConcept.Exceptions;

public class Bank {
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    private String currency;
    private Integer amount;

    public Integer add (Bank bankname)throws CustomException {

        if (!(bankname.currency.equalsIgnoreCase("INR"))){
            throw new CustomException("USD to INR is not possible");
        }

        Integer sum = this.amount + bankname.amount;
        return sum;
    }

}
