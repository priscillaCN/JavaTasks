import java.util.Scanner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StudentGradeTest {

    @Test
    public void testThatAllSubjectScoresForEachStudentAreInputedInA2DArray() {

        int numberOfStudents = 3;
        int numberOfSubjects = 4;
        String input = "45\n67\n53\n50\n67\n50\n99\n78\n34\n77\n63\n60";
        Scanner testInput = new Scanner(input);
        int [][] expected = {{45, 67, 53, 50}, {67, 50, 99, 78}, {34, 77, 63, 60}};

        assertArrayEquals(expected, StudentGrade.collectAllSubjectScoresForEachStudent(testInput, 3, 4));        

    }

    @Test
    public void testThat




}

