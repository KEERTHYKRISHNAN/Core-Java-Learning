package OOPSConcept.AccessModifers.thief;

import OOPSConcept.AccessModifers.Police;

public class Criminal {

    public static void main(String[] args) {
        Police theiff = new Police(10);
        System.out.println(theiff.gun);
        //theiff.canIshoot();// thief function is not allowed to shoot by changing to protected
    }
}
