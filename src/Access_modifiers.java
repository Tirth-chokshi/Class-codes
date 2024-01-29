class Myemp{
    private int id;
    private String name;
    public int getid() {
        return id;
    }
    public void  setname(String n ) {
        name = n;
    }
    public String getname() {
        return name;
    }
    public void setid(int i) {
        id = i;
    }
}

public class Access_modifiers {
    public static void main(String[] args) {
        Myemp blade = new Myemp();

//        blade.id = 45;
//        blade.name = "Tirth"; --> Thorws an error due to private access modifier
        blade.setid(45);
        blade.setname("Tirth");

        System.out.println(blade.getid());
        System.out.println(blade.getname());
    }
}
