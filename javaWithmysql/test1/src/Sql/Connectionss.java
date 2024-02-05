package Sql;

import java.util.Scanner;

public class Connectionss {
static void op(){
    for (int i = 0;true; i++) {
        

Scanner sc = new Scanner(System.in);
System.out.println("1- Insertion , 2 - Deletion , 3 - Updation ,4- Show Data 5 - exit");
int x= sc.nextInt();
if (x==1) {
    insertion.insert();
} else if (x==2) {
Delete.delete();
}
else if (x==3) {
    UpdateData.update();
}
else if (x==4) {
    App.Showdata();
}
else{
    System.exit(x);
}
}
}
    
}