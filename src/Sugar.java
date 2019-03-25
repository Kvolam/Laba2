public class Sugar extends Thing{
    public Sugar(Integer Weight) {
        super(Weight);
    }
    public void ToPourSugar(Cup CupOfCoffee){
        CupOfCoffee.ToFill(this.getWeight(),"Sugar");
    }
}