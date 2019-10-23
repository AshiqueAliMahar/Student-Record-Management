
package bean;

public class StudentBean {

    private int ID;
    private String Fname;
    private String TempAdd;
    private String PermAdd;

    public StudentBean(int ID, String Fname, String TempAdd, String PermAdd) {
        this.ID = ID;
        this.Fname = Fname;
        this.TempAdd = TempAdd;
        this.PermAdd = PermAdd;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getTempAdd() {
        return TempAdd;
    }

    public void setTempAdd(String TempAdd) {
        this.TempAdd = TempAdd;
    }

    public String getPermAdd() {
        return PermAdd;
    }

    public void setPermAdd(String PermAdd) {
        this.PermAdd = PermAdd;
    }
    
    
    
    
    
    
    
}
