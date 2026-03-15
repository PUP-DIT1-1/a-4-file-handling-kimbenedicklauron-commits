// Kim Benedick B. Lauron
// DIT 1-1

import java.io.*;
import java.util.*;

public class filehandling
{
    static final int max = 100;
    static String [] ids = new String[max];
    static String [] names = new String[max];
    static int [] ages = new int [max];
    static int count = 0;
    
    static final String File_Name = "records.csv";
        
    static Scanner input = new Scanner (System.in);
    
    public static void main (String [] args)
    {
        loadRecords ();
        
        int choice;
        
        do {
            System.out.println("/n======-WELCOME TO THE RECORD SYSTEM======");
            System.out.println("/n1. Add Record");
            System.out.println("2. View Record");
            System.out.println("3. Update Record");
            System.out.println("4. Delete Record");
            System.out.println("5. Exit");
            
        }
    }
}
