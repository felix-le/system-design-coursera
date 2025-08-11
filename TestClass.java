public class TestClass {

    // section 1:
    private String testName;

    // section 2:
    public TestClass( String name, int i ) {
        this.testName = name;
    }

    // section 3:
    public void countToThree() {
        for (int m = 1; m <= 3; m++) {
            System.out.println( "Count is: " + m );
        }
    }
}

/**
 * section 1: member variable
section 2: constructor
section 3: method
 */

//  As an established Java convention, what would it mean if the name of a variable was spelled in all uppercase?
// The variable is a constant, whose value should not change.


// int errorInteger = 200;
// String comment;

// switch (errorInteger) {
//     case 150:
//         comment = "Javascript error.";
//     break;
//     case 240:
//         comment = "Comment error.";
//     break;
//     case 300:
//         comment = "Function error.";
//     break;
//     case 200:
//         comment = "New error.";
//     break;
//     default:
//         comment = "No error.";
//     break;
// }
// System.out.println( comment );

// What would be the resulting output from this code?

// New error



// ========
// public class Test {
//     private String testName;

//     public Test( String name ) {
//         this.testName = name;
//     }
  
//     public setTestName( String name ) {
//         this.testName = name;
//     }
// }

// What would be the proper way to construct a Test object with member variable 
// testName initially being "old", then later changed to "new"

// Test testObj = new Test( "old" );
// testObj.setTestName( "new" );