public class Coffe extends Thing {
    private String Taste;
    public Coffe(Integer Weight,String Taste) {
        super(Weight);
        this.Taste=Taste;
    }
    public void PourToCoffe(Cup CupOfCoffee){
        CupOfCoffee.ToFill(this.getWeight(),"Coffe "+this.Taste);
    }
}
