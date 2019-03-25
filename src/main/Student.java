public class Student {
    private String Name;
    Student(String Name )
    {
        this.Name=Name;
    }
    public void MakeCoffee(Teapot teapot, Coffee coffee, Cup cup, Sugar sugar, int Volume) {
        sugar.ToPourSugar(cup);
        coffee.PourToCoffee(cup);
        teapot.ToFillWater(Volume, cup);
    }
}