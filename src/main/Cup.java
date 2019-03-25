public class Cup extends Thing {
    private int Volume;
    private String Content;
    public Cup(){
        super();
        this.Volume=0;
        this.Content=null;
    }
    public void ToFill(int Volume, int Weight){
        this.Volume+=Volume;
        this.setWeight(this.getWeight()+Weight);
    }
    public void ToFill(int Volume){
        this.Volume+=Volume;
    }
    public void ToFill(int Weight,String Content){
        if(this.Content==null)
            this.Content=Content;
        else
            this.Content+=", "+Content;
        this.setWeight(this.getWeight()+Weight);
    }
    public String getContent(){
        return this.Content;
    }
    public int getVolume(){
        return this.Volume;
    }

}