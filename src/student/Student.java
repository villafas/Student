/*
Author:Sebastian Villafane
Date: Jan/28/2022
 */
package student;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Student{
    private String studentId;
    private String studentName;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    /*
    //for sorting
    public int compareTo(Student o){
        if(age < o.age){
            return -1; //for less than
        } else if(age > o.age){
            return 1; //for greater than
        } else{
            return 0; //for equal
        }
    }
    */
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        char[] myWord = new char[7];
        myWord[0] = 's';
        myWord[1] = 't';
        myWord[2] = 'u';
        myWord[3] = 'd';
        myWord[4] = 'e';
        myWord[5] = 'n';
        myWord[6] = 't';
        
        for(int i = 0; i < myWord.length; i++){
            System.out.print(myWord[i]);
        }
        System.out.println();
        for(int i = myWord.length-1; i >= 0; i--){
            System.out.print(myWord[i]);
        }
        System.out.println();
*/
        
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = in.nextLine();
        
        char[] myLetters = new char[word.length()];
        for( int i = 0; i < myLetters.length ; i++){
            myLetters[i] = word.charAt(i);
            System.out.println(myLetters[i]);
        }
    }
        
    }
   
