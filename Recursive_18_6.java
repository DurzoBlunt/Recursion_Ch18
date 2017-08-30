public class Recursive_18_6 {

    public static void main(String[] args){

        float sum = 0;
        float i = 1;
        float answer = 0;

        answer = recursion(i, sum);
    }

    public static float recursion(float i, float sum) {

        if(i < 11) {
            sum += i / (i + 1);
            System.out.println(i + " / " + (i + 1) + " = " + sum );
            return recursion(i + 1, sum);
        }
        else{
            System.out.println("final answer = " + sum);
            return sum;
        }
    }

}