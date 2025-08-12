public class Array_Example {
    public static void main(String[] args) {
        int[] roll_num=new int[50];
        int start_rollNo=50301;
        for(int i=0; i<roll_num.length;i++){
            roll_num[i]=start_rollNo+i;
        }
        for (int i=0; i<roll_num.length; i++){
            System.out.println("Index "+i+" Roll Number "+roll_num[i]);
        }
    }
}
