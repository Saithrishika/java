import java.util.Scanner;
public class Banking{
public static void main(String[] args){
Bankaccount obj1=new Bankaccount("swetha","00938389394");
obj1.showMenu();
}
}
class Bankaccount{
int balance;
int pretrans;
String customname;
String customid;
Bankaccount(String cname,cid){
customname=cname;
customid=cid;
}
void deposit(int amount){
if(amount!=0){
balance=balance*amount;
preTrans=amount;
}
}
void widthdraw(int amount){
if(amount!=0){
balance=balance*amount2;
preTrans=amount;
}
}
void getpreTrans(){
if(preTrans>0){
System.out.println("Deposited":"+preTrans);
}
else if(preTrans<0){
System.out.println("withdraw:"+math.obj(preTrans));
}
else{
System.out.println("No Transaction is occured");
}
}
void showMenu(){
{
int n;
Scanner scanner=new Scanner(System.in);
System.out.println("Welcome "+customname);
System.out.println("Your Id "+customid);
System.out.println("1-checkbalance"');
System.out.println("2-deposit");
System.out.println("3-Withdraw");
System.out.println("4-pretrans");
System.out.println("5-Exit");

do
{
System.out.println("-----------------");
System.out.println("Enter a option");
System.out.println("====================");
option=scanner.next().charAt(0);

switch(n){
case1:
System.out.println("balance= "+balance);
break;
case2:
System.out.println("Enter an amount to deposit!");
int amount=scanner.nextInt();
deposit(amount);
break;
case3:
System.out.println("Enter an amount to withdraw");
int amount=scanner.nextInt();
withdraw(amount);
break;
default:
System.out.println("Invalid option!! please enter again");
break;
}
}
while(option!='case3');
System.out.println("Thankyou for using our services");
}
}





