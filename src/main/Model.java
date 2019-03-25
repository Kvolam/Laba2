
public class Model {
    static public Cup ToMake()  {
        Cup cup = new Cup();
        Student student = new Student(View.getNameOfStudent());
        Teapot teapot= new Teapot(23.2,( View.getVTeapot()+200),(View.getVTeapot()+500));
        Sugar sugar = new Sugar (View.getWSugar());
        Coffee coffee = new Coffee(View.getWCoffee(),View.getSortOfCoffee());
        student.MakeCoffee(teapot,coffee,cup,sugar, View.getVTeapot());
        return cup;
    }
}
