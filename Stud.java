// Class for Student
class Student {
    int academicScore;

    // Constructor
    Student(int academicScore) {
        this.academicScore = academicScore;
    }
}

// Class for Sports
class Sports {
    int sportsScore;

    // Constructor
    Sports(int sportsScore) {
        this.sportsScore = sportsScore;
    }
}

// Class Result inherits from Student and Sports
class Result extends Student {
    Sports sports;

    // Constructor
    Result(int academicScore, int sportsScore) {
        super(academicScore); // Calling Student's constructor
        this.sports = new Sports(sportsScore); // Creating an instance of Sports
    }

    // Method to display the academic and sports scores
    void display() {
        System.out.println("Academic Score: " + academicScore);
        System.out.println("Sports Score: " + sports.sportsScore);
    }
}

// Main class
public class Stud {
    public static void main(String[] args) {
        // Creating an object of Result
        Result studentResult = new Result(85, 90);

        // Displaying the scores
        studentResult.display();
    }
}
