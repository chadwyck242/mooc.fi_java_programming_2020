
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition){
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        if(this.euros() < compared.euros()){
            return true;
        }
        
        if (this.euros() == compared.euros()){
            if(this.cents() < compared.cents()){
                return true;
            }
        }
        
        return false;
    }
    
    public Money minus(Money decreaser){
        
        int subtractEuros = this.euros - decreaser.euros;
        int subtractCents = this.cents - decreaser.cents;
        
        if (subtractEuros >= 0){
            if (subtractCents < 0){
                subtractEuros = subtractEuros - 1;
                subtractCents = subtractCents + 100;
            }
        } else {
            subtractEuros = 0;
            subtractCents = 0;
        }
        
        Money newMoney = new Money(subtractEuros, subtractCents);
        
        return newMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
