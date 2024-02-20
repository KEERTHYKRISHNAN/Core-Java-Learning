package OOPSConcept.AccessModifers;

public class Police {

    public int gun;

    public Police(int gun) {
        this.gun = gun;
    }

    protected void canIshoot(){
        System.out.println("Ofcourse - shoot!");
    }


}
