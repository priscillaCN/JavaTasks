import java.util.Scanner;
public class StudentGrade {


    public static int [][] collectAllSubjectScoresForEachStudent (Scanner userInput, int numberOfStudents, int numberOfSubjects) {

        int [][] studentsSubjectsAndScores = new int [numberOfStudents][numberOfSubjects];

        for(int studentIndex = 0; studentIndex < studentsSubjectsAndScores.length; studentIndex++) {
            System.out.println("\nEntering score for student " + (studentIndex + 1));

            for(int scoreIndex = 0; scoreIndex < studentsSubjectsAndScores[studentIndex].length; scoreIndex++) {

                System.out.println("Enter score for subject " + (scoreIndex + 1));
                int subjectScore =  userInput.nextInt();
                
                while (subjectScore < 0 || subjectScore > 100) {

                    System.out.println("\ninvalid score");

                    System.out.println("Enter score for subject " + (scoreIndex + 1));
                    subjectScore =  userInput.nextInt();

                }


                System.out.println("\nSaving >>>>>>>>>>>>>>>>>>>>>>>>>>>>");

                studentsSubjectsAndScores[studentIndex][scoreIndex] = subjectScore;

                System.out.println("Saved successfully\n");

            }


        }

        return studentsSubjectsAndScores;


    }


}
