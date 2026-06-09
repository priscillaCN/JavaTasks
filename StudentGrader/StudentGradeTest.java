import java.util.Scanner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentGradeTest {

    @Test
    public void testThatAllSubjectScoresForEachStudentAreStoredInA2DArray() {

        int numberOfStudents = 3;
        int numberOfSubjects = 4;
        String input = "45\n67\n53\n50\n67\n50\n99\n78\n34\n77\n63\n60";
        Scanner testInput = new Scanner(input);
        int [][] expected = {{45, 67, 53, 50}, {67, 50, 99, 78}, {34, 77, 63, 60}};

        assertArrayEquals(expected, StudentGrade.collectAllSubjectScoresForEachStudent(testInput, 3, 4));        

    }


    @Test
    public void testThatTheTotalScoreOfEachStudentIsCalculatedAndStoredInAnArray() {
    
        int numberOfStudents = 3;
        int [][] studentsSubjectsAndScores = {{45, 67, 53, 50}, {67, 50, 99, 78}, {34, 77, 63, 60}};
        int [] expected = {215, 294, 234};

        assertArrayEquals(expected, StudentGrade.calculateTheTotalScoreOfEveryStudent(studentsSubjectsAndScores, 3));

    }


    @Test
    public void testThatTheAverageScoreOfEachStudentIsCalculatedAndStoredInAnArray() {
    
        int numberOfSubjects = 4;
        int [] studentsTotalScores = {215, 294, 234};
        double [] expected = {53.75, 73.50, 58.50};

        assertArrayEquals(expected, StudentGrade.calculateTheAverageScoreOfEveryStudent(studentsTotalScores, 4));

    }


    @Test
    public void testThatThePositionOfEachStudentIsCalculatedAndStoredInAnArray() {
    
        int [] studentsTotalScores = {215, 294, 234};
        int [] expected = {3, 1, 2};

        assertArrayEquals(expected, StudentGrade.calculateThePositionOfEveryStudent(studentsTotalScores));

    }

    @Test
    public void testThatTheNumberOfPassesInEachSubjectIsCalculatedAndStoredInAnArray() {
    
        int numberOfSubjects = 4;
        int [][] studentsSubjectsAndScores = {{45, 67, 53, 50}, {67, 50, 99, 78}, {34, 77, 43, 60}};
        int [] expected = {1, 3, 2, 3};

        assertArrayEquals(expected, StudentGrade.calculateTheNumberOfPassesForEverySubject(studentsSubjectsAndScores, 4));

    }


    @Test
    public void testThatTheNumberOfFailsInEachSubjectIsCalculatedAndStoredInAnArray() {
    
        int numberOfSubjects = 4;
        int [][] studentsSubjectsAndScores = {{45, 67, 53, 50}, {67, 50, 99, 78}, {34, 77, 43, 60}};
        int [] expected = {2, 0, 1, 0};

        assertArrayEquals(expected, StudentGrade.calculateTheNumberOfFailsForEverySubject(studentsSubjectsAndScores, 4));

    }


    @Test
    public void testThatTheHighestScoreForEachSubjectIsObtainedAndStoredInAnArray() {
    
        int numberOfSubjects = 4;
        int [][] studentsSubjectsAndScores = {{45, 67, 53, 50}, {67, 50, 99, 78}, {34, 77, 43, 60}};
        int [] expected = {67, 77, 99, 78};

        assertArrayEquals(expected, StudentGrade.getTheHighestScoreForEverySubject(studentsSubjectsAndScores, 4));

    }


    @Test
    public void testThatTheLowestScoreForEachSubjectIsObtainedAndStoredInAnArray() {
    
        int numberOfSubjects = 4;
        int [][] studentsSubjectsAndScores = {{45, 67, 53, 50}, {67, 50, 99, 78}, {34, 77, 43, 60}};
        int [] expected = {34, 50, 43, 50};

        assertArrayEquals(expected, StudentGrade.getTheLowestScoreForEverySubject(studentsSubjectsAndScores, 4));

    }



}

