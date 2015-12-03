public class PUPIL
{
    private String firstname;
    private String surname;
    private int mark;
    
    public PUPIL()
    {
        firstname = "";
        surname = "";
        mark = 0;
    }
    
    public void readpupildetails(String dataItems)
    {
        String [] rowItems = dataItems.split(",");
        firstname = rowItems[0];
        surname = rowItems[1];
        mark = Integer.parseInt(rowItems[2]);
    }
    
    public String writeDetails()
    {
        String pupilData = "";
        pupilData = pupilData.concat(firstname);
        pupilData = pupilData.concat(",");
        pupilData = pupilData.concat(surname);
        pupilData = pupilData.concat(",");
        pupilData = pupilData.concat(Integer.toString(mark));
        return pupilData;
    }
}