public class Cup extends Thing {
    private int Volume;
    private String Content;
    private double Temperature;
    public Cup(int Weight, String Content, int Volume, double Temperature) {
        super(Weight);
        this.Temperature=Temperature;
        this.Content=Content;
        this.Volume=Volume;
    }
    public Cup(){
        super();
        this.Temperature=0;
        this.Volume=0;
    }
    public void ToFill(int Volume, int Weight, double Temperature){
        int TempWeight=0;
        this.Volume+=Volume;
        this.Temperature=Temperature;
        TempWeight=this.getWeight();
        this.setWeight(TempWeight+Weight);
    }
    public void ToFill(int Weight,String Content){
        int TempWeight=0;
        if(this.Content.isEmpty())
            this.Content=Content;
        else
            this.Content+=", "+Content;
        TempWeight=this.getWeight();
        this.setWeight(TempWeight+Weight);
    }


}
