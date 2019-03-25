public class Teapot extends Thing{
    private double Temperature;
    private int Volume;
    public Teapot(double Temperature, int Volume,int Weight) {
        super(Weight);
        this.Temperature=Temperature;
        this.Volume=Volume;
    }
    public void ToPourWater(Cup CupOfCoffee) {
        CupOfCoffee.ToFill(this.Volume);
    }
    public void ToFillWater(int Volume, Cup CupOfCoffee) {
        this.Volume=Volume;
        this.HeatUpWater();
        this.ToPourWater(CupOfCoffee);
    }
    private void HeatUpWater() {
        while(this.Temperature<100)
        {
            this.Temperature+=this.Temperature/100000;
        }
    }
}