public class Teapot extends Thing{
    private double Temperature;
    private int Volume;
    public Teapot(double Temperature, int Volume,int Weight) {
        super(Weight);
        this.Temperature=Temperature;
        this.Volume=Volume;
    }
    public void ToPourWater(int Volume, double Temperature, Cup CupOfCoffee) throws InterruptedException {
      this.ToFillWater(Volume,Temperature);
      CupOfCoffee.ToFill(this.Volume,this.getWeight(),this.Temperature);
    }
    public void ToFillWater(int Volume, double Temperature) throws InterruptedException {
        this.Volume=Volume;
        this.Temperature=Temperature;
        this.HeatUpWater();
    }
    private void HeatUpWater() throws InterruptedException {
        long l = 1000;
        for(int i =0;i<Temperature;i++)
        {
            this.Temperature++;
            wait(l);
        }
    }
}
