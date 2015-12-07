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
        countHighmark();
    }
    
    public void setUpPupilList() throws IOException
    {
        System.out.println("PupilMark: update");
        System.out.println("** Preparing to read data file.");
        
        String[] dataRows = markFile.readCSVtable();
        
        noOfPupils = dataRows.length - 1;
        
        System.out.println("** " + noOfPupils + " rows read.\n\n");
    }
    
    public void countHighmark()
    {
        
    }
}