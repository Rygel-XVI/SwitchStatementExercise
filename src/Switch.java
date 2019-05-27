import java.sql.SQLOutput;

public class Switch {

    public static void main(String[] args) {
        switchStatement('A');
        switchStatement('B');
        switchStatement('C');
        switchStatement('D');
        switchStatement('E');
        switchStatement('F');
    }

    public static void switchStatement(char character) {
        switch(character) {
            case 'A': case 'B':case 'C':case 'D':case 'E':
                System.out.println("character is " + character);
                break;

            default:
                System.out.println("Not Found");
                break;
        }
    }
}


// Create a new switch statement using char instead of int
// create a new char variable
// create a switch statement testing for
// A, B, C, D, or E
// display a message if any of these are found and then break
// Add a default which displays a message saying not found