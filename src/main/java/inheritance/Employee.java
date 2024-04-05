package inheritance;

public class Employee extends Person{

    private String title;

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }
}
