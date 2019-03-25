public class Coffee extends Thing {
    private String Taste;
    public Coffee(Integer Weight,String Taste) {
        super(Weight);
        this.Taste=Taste;
    }
    public void PourToCoffee(Cup CupOfCoffee){
        CupOfCoffee.ToFill(this.getWeight(),"Coffee: "+this.Taste);
    }
}