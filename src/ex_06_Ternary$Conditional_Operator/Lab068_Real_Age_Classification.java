package ex_06_Ternary$Conditional_Operator;

public class Lab068_Real_Age_Classification {
//   User Input : A user will give you an age.
//    Check if user is minor, adult or senior citizen
static void main(String[] args) {
//       User will give input via CLI Command Line (Args)
//    3 dots -> Edit Configuration -> CLI Argument
    String age_input_string = args[3];
    System.out.println(age_input_string instanceof String); // true
//     Instanceof String will check if the input/argument is string or not
//     String to Integer Typecasting is not allowed as they are incompatible
//    Hence we use a function Integer.parseInt(string name)
    int age_user_interger = Integer.parseInt(age_input_string); //25

    String result = (age_user_interger < 18) ? "Minor" : (age_user_interger <= 60) ? "Adult" : "Sr. Citizen";
    System.out.println(result);

}
}
