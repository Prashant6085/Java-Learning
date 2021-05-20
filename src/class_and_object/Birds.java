package class_and_object;

public class Birds {
    int birdNumber;
    String birdName;
    String birdSound;
    float birdWeight;
    String birdType;



    public Birds(){

    }
    public Birds(int birdNumber,String birdName, String birdSound,float birdWeight, String birdType){
        this.birdNumber=birdNumber;
        this.birdName=birdName;
        this.birdSound=birdSound;
        this.birdWeight=birdWeight;
        this.birdType=birdType;
    }

    @Override
    public String toString() {
        return "Birds{" +
                "birdNumber=" + birdNumber +
                ", birdName=" + birdName +
                ", birdSound=" + birdSound +
                ", birdWeight=" + birdWeight +
                ", birdType=" + birdType +
                '}';
    }
    public static void main(String[] args){
        //default constructor
        Birds birdOne=new Birds();
        birdOne.birdNumber=1000;
        birdOne.birdName="Parrot";
        birdOne.birdSound="squawk";
        birdOne.birdWeight=500;
        birdOne.birdType="pet";

        //parametrised constructor
        Birds birdTwo=new Birds(2000,"Peacock","scream",400,"pet");

        System.out.println(birdOne);
        System.out.println(birdTwo);

    }
}


