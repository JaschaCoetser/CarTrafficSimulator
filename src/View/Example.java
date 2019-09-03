package View;
// Imports go here

// This is the Title
public class Example {

    // these are class variables
    private int a_number;
    private String a_word;

    // This is a default constructor
    public Example() {

    }

    // This is a non-default constructor
    public Example(int a_number, String a_word) {
        this.a_number = a_number;
        this.a_word = a_word;
    }

    // methods
    public void do_something_method() {
        // this is a method lol
    }

    // getters and setters

    public int getA_number() {
        return a_number;
    }

    public void setA_number(int a_number) {
        this.a_number = a_number;
    }

    public String getA_word() {
        return a_word;
    }

    public void setA_word(String a_word) {
        this.a_word = a_word;
    }
}
