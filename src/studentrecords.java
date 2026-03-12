// Kim Benedick B. Lauron
// DIT 1-1

import java.util.*;

public class studentrecords 
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        String names [] = new String [10];
        double grades [] = new double [10];
        
        System.out.println("===Welcome to Student Record System===");
        System.out.println(" ");
        System.out.println("Please enter the Students' Names & Grades respectively.");
        System.out.println(" ");
        
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Enter Student " + (i + 1) + " Name: ");
            names[i] = scan.nextLine();

            System.out.print("Enter Student " + (i + 1) + " Grade: ");
            grades[i] = scan.nextDouble();
            scan.nextLine();
        }
        
        double sum = 0;
        for (int i = 0; i < grades.length; i++)
        {
            sum += grades[i];
        }
        
        double ave = sum / grades.length;
        System.out.println(" ");
        System.out.println("Average Grade of the Students: " + ave);
        
        for (int i = 0; i < grades.length - 1; i++)
        {
            for (int j = 0; j < grades.length - 1 - i; j++)
            {
                if (grades [j] > grades [j + 1])
                {
                    double tempGrade = grades[j];
                    grades [j] = grades [j + 1];
                    grades [j + 1] = tempGrade;
                    
                    String tempName = names[j];
                    names [j] = names [j + 1];
                    names [j + 1] = tempName;
                }
            }
        }
        
        System.out.println(" ");
        System.out.println("Students Sorted by Grade (Ascending): ");
        for (int i = 0; i < grades.length; i++)
        {
            System.out.println(names [i] + " - " + grades [i]);
        }
        
        System.out.println(" ");
        System.out.print("Enter Student's Name to Search: ");
        String searchedName = scan.nextLine();
        boolean found = false;
        
        for (int i = 0; i < names.length; i++)
        {
            if (names[i].equalsIgnoreCase(searchedName))
            {
                System.out.println(" ");
                System.out.println("Student Found! " + names [i] + " - Grade: " + grades [i]);
                System.out.println(" ");
                System.out.println("Thanks for using the Student Record System!");
                found = true;
                break;
            }
        }
        
        if (!found)
        {
            System.out.println("");
            System.out.println("Student Not Found. Please try again.");
        }
        
        scan.close();
    }
}