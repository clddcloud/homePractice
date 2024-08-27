package LiveClassAssignments;

public class Degree {
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{

}
class Masters extends Degree{
    void getPrerequisite() {
        System.out.println("To get a master degree you need high school diploma & bachelor degree");
    }
}

class DegreeTester{
    public static void main(String[] args) {
        Degree obj=new Degree();
        Bachelors objB=new Bachelors();
        Masters objM=new Masters();
        obj.getPrerequisite();
        objB.getPrerequisite();
        objM.getPrerequisite();
    }
}


