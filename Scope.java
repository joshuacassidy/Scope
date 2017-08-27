import java.util.Scanner;

public class Scope {
    //Creating a new integer called Scope
    private int scope;

    //Taking the new Scanner(System.in) and assigning it to scope and taking in an integer from the user and assigning it to the private in scope declared at line 5
    public Scope(Scanner scope) {
            System.out.println("Enter an number: ");
            this.scope = scope.nextInt();
    }
    //Creating a new method called scope
    public void scope(){
        //Creating a int called scope local to the for loop which is multiplied by the scope variable on line 5 to get the result.
        for (int scope = 1; scope < 13; scope++){
            System.out.printf("%d multiplied by %d equals %d\n", scope, this.scope, (scope*this.scope) );
        }
    }
}
