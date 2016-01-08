import javax.swing.JOptionPane;
import java.io.*;

public class CLASSROOM
{
    private PUPIL pupilList[];
    int noOfPupils;
    READFILECSV markFile;
    
    public CLASSROOM()
    {
        markFile = new READFILECSV();
    }
    
    public void processClassroom() throws IOException
    {
        setUpPupilList();
        
    }
    
    public void setUpPupilList() throws IOException
    {
        System.out.println("PupilMark: update");
        System.out.println("** Preparing to read data file.");
        
        String[] dataRows = markFile.readCSVtable();
        
        noOfPupils = dataRows.length - 1;
        
        System.out.println("** " + noOfPupils + " rows read.\n\n");
        
        pupilList = new PUPIL[noOfPupils];
        
        for (int i = 0; i < noOfPupils; i++)
        {
            pupilList[i] = new PUPIL();
            
            pupilList[i].readpupildetails(dataRows[i+1]);
        }
    }
    
    public void highMark()
    {
        int maxMarkPosition= 0;
        
        for (int i=1; i<50; i++)
        {
            
            if(pupilList[i].getMark() > pupilList[maxMarkPosition].getMark())
            {
                maxMarkPosition = i;
            }
        }
        
        System.out.print("Person with highest mark is: ");
        System.out.print(pupilList[maxMarkPosition].getFirstname() + " ");
        System.out.print(pupilList[maxMarkPosition].getSurname() + ", ");
        System.out.println(pupilList[maxMarkPosition].getMark());
        System.out.println();
    }
}