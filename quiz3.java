class Main {
    public static void main(String[] args) {
    int credit_hours = 15;
    int first_exam = 30;
    int final_exam = 50 ;
    int total_score=(first_exam+final_exam);
    System.out.println (total_score);
    float avg = total_score/2f;
    System.out.println (avg);
    float total_fee = (credit_hours*50.5f);
    System.out.println (total_fee);
    boolean is_scholarship = avg>=85;
    System.out.println (is_scholarship);
   } 
}