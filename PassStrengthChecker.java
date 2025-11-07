import java.util.*;

class PasswordStrength{
     String password;

PasswordStrength(String password){
   this.password =password;
   }

//method for upper case

boolean uppercase(){
for(int i= 0; i<password.length(); i++){
    char ch = password.charAt(i); 
  if(ch>='A'&& ch<='z'){
   return true;
  }
 }
return false;
}

//method for Digits

boolean digit(){
for(int i= 0; i<password.length(); i++){
   char ch = password.charAt(i);
   if(ch>='0' && ch<='9'){
   return true;
   }
  }
 return false;
}

//method for symbol

boolean symbol(){
  for(int i=0; i<password.length(); i++){
   char ch = password.charAt(i);
   if(!(ch>='A'&& ch<='Z') && !(ch>='0' && ch<='9') && !(ch>='a' && ch<='z')){
   return true;
   }
  }
return false;
}

//method for check password strength

void passStrength(){

   System.out.println("-------Password Analysis--------");
   System.out.println(" ");


boolean upcase = uppercase();
boolean digits = digit();
boolean symbols =symbol();
int length = password.length();

System.out.println("Checking Upper case: "+ (upcase ? "yes it has":"Not present") );
System.out.println("Checking digit: " + (digits ? "yes it has":"Not present"));
System.out.println("Checking symbol: "+ (symbols ? "yes it has":"Not present"));
System.out.println("Checking length maintain: "+ (length >=8 ? "Yes it contains 8 characters" : " Less than 8 characters, needs atleast 8 characters."));

int score =0;

if(upcase) score++;
if(digits) score++;
if(symbols) score++;
if(length>=8) score++;

System.out.println(" ");
System.out.println("Result --> Strength of the password : " + (score >= 4 ? "Strong" :"Weak"));

}
}
public class PassStrengthChecker{
public static void main(String []args){

Scanner sc = new Scanner(System.in);
System.out.println(" ");
System.out.print("Enter your Password : ");
String character = sc.nextLine();
System.out.println(" ");

PasswordStrength pass = new PasswordStrength(character);
pass.passStrength();



}

}