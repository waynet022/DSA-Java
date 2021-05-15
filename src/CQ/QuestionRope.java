package CQ;

public class QuestionRope {
    private int sum;

    public QuestionRope(int sum){
        this.sum = sum;
        this.calculate();
    }

    public void calculate(){

        int three;
        int two=0;

        three = sum/3;
        if(sum - three*3 == 1){
            three--;
            two = 2;

        }
        else if(sum - three*3 == 2){
            two = 1;
        }

        System.out.println(Math.pow(3,three) * Math.pow(2,two));
    }
}
