package Bai3;

public class Girl {
    private String Name;
    public Girl(String Name){
        this.Name= Name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    @Override
    public String toString(){
        return "Girl(" + this.Name + ")";
    }
}
