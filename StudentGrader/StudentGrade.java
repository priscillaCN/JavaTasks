import java.util.Scanner;
import java.util.Arrays;

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


    public static int [] calculateTheTotalScoreOfEveryStudent (int [][] studentsSubjectsAndScores, int numberOfStudents) {

        int [] studentsTotalScores = new int [numberOfStudents];

        for(int studentIndex = 0; studentIndex < studentsSubjectsAndScores.length; studentIndex++) {

            int sumOfAllScoresPerStudent = 0;

            for(int scoreIndex = 0; scoreIndex < studentsSubjectsAndScores[studentIndex].length; scoreIndex++) {

                int subjectScore = studentsSubjectsAndScores[studentIndex][scoreIndex];
                sumOfAllScoresPerStudent += subjectScore;
            }

            studentsTotalScores[studentIndex] = sumOfAllScoresPerStudent;

            

        }

        return studentsTotalScores;

    }


    public static double [] calculateTheAverageScoreOfEveryStudent (int [] studentsTotalScores, int numberOfSubjects) {
        
        double [] studentsAverageScores = new double [studentsTotalScores.length];

        for(int studentsTotalIndex = 0;  studentsTotalIndex < studentsTotalScores.length; studentsTotalIndex++) {
            studentsAverageScores[studentsTotalIndex] = (double)studentsTotalScores[studentsTotalIndex] / numberOfSubjects;
        }

        return studentsAverageScores;
    }


    public static int [] calculateThePositionOfEveryStudent (int [] studentsTotalScores) {

        int [] studentsPositions = new int [studentsTotalScores.length];

        int [] studentsTotalScoresClone = studentsTotalScores.clone();
        Arrays.sort(studentsTotalScoresClone);

        for(int studentsTotalIndex = 0; studentsTotalIndex < studentsTotalScores.length; studentsTotalIndex++) {

            for(int studentsTotalCloneIndex = studentsTotalScoresClone.length - 1; studentsTotalCloneIndex >= 0; studentsTotalCloneIndex--) {

                 if(studentsTotalScores[studentsTotalIndex] == studentsTotalScoresClone[studentsTotalCloneIndex] )
                    studentsPositions[studentsTotalIndex] = studentsTotalScoresClone.length -studentsTotalCloneIndex;

            }

        }

        return studentsPositions;
    }


    public static int [] calculateTheNumberOfPassesForEverySubject (int [][] studentsSubjectsAndScores, int numberOfSubjects) {

        int [] numberOfPassesForEachSubject = new int [numberOfSubjects];

        for(int scoreIndex = 0; scoreIndex < studentsSubjectsAndScores[0].length; scoreIndex++) {
            
            int passCounter = 0;

            for(int studentIndex = 0; studentIndex < studentsSubjectsAndScores.length; studentIndex++) {

                if(studentsSubjectsAndScores[studentIndex][scoreIndex] >= 50) passCounter++;

            }

            numberOfPassesForEachSubject[scoreIndex] = passCounter;

        }

        return numberOfPassesForEachSubject;

    }


    public static int [] calculateTheNumberOfFailsForEverySubject (int [][] studentsSubjectsAndScores, int numberOfSubjects) {

        int [] numberOfFailsForEachSubject = new int [numberOfSubjects];

        for(int scoreIndex = 0; scoreIndex < studentsSubjectsAndScores[0].length; scoreIndex++) {
            
            int failCounter = 0;

            for(int studentIndex = 0; studentIndex < studentsSubjectsAndScores.length; studentIndex++) {

                if(studentsSubjectsAndScores[studentIndex][scoreIndex] < 50) failCounter++;

            }

            numberOfFailsForEachSubject[scoreIndex] = failCounter;

        }

        return numberOfFailsForEachSubject;

    }


    public static int [] getTheHighestScoreForEverySubject (int [][] studentsSubjectsAndScores, int numberOfSubjects) {
    
        int [] highestScoreForeachSubject = new int [numberOfSubjects];

        for(int scoreIndex = 0; scoreIndex < studentsSubjectsAndScores[0].length; scoreIndex++) {

            int highestScore = studentsSubjectsAndScores[0][scoreIndex];

            for(int studentIndex = 0; studentIndex < studentsSubjectsAndScores.length; studentIndex++) {

                if(highestScore < studentsSubjectsAndScores[studentIndex][scoreIndex])
                    highestScore = studentsSubjectsAndScores[studentIndex][scoreIndex];
     
            }

            highestScoreForeachSubject[scoreIndex] = highestScore;

        }

        return highestScoreForeachSubject;

    }


    public static int [] getTheLowestScoreForEverySubject (int [][] studentsSubjectsAndScores, int numberOfSubjects) {
    
        int [] lowestScoreForeachSubject = new int [numberOfSubjects];

        for(int scoreIndex = 0; scoreIndex < studentsSubjectsAndScores[0].length; scoreIndex++) {

            int lowestScore = studentsSubjectsAndScores[0][scoreIndex];

            for(int studentIndex = 0; studentIndex < studentsSubjectsAndScores.length; studentIndex++) {

                if(lowestScore > studentsSubjectsAndScores[studentIndex][scoreIndex])
                    lowestScore = studentsSubjectsAndScores[studentIndex][scoreIndex];
     
            }

            lowestScoreForeachSubject[scoreIndex] = lowestScore;

        }

        return lowestScoreForeachSubject;

    }


}
