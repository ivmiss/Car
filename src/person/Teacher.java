
package person;


public class Teacher  extends Person {
 
    private String mainSubject;
    private int yearsOfExperience;
    private String gender;
    
    public Teacher(String name, String surname, String jmbg, String mainSubject, int yearsOfExperience, String gender)
    {
        super(name, surname, jmbg);
        this.mainSubject = mainSubject;
        this.yearsOfExperience = yearsOfExperience;
        this.gender = gender;
        
    }
            
public void showData(){
    super.showDate();
    System.out.println("Main subject: " + this.mainSubject);
    System.out.println("Years of experience: " + this.yearsOfExperience);
    System.out.println("Gender: " + this.gender);
}    
    
    public String getMainSubject(){
        return this.mainSubject;
    } 
    
    public void setMainSubject(String mainSubject){
        this.mainSubject = mainSubject;
    }
    
     public int getYearsOfExperience(){
        return this.yearsOfExperience;
    } 
    
    public void setYearsOfExperience(int yearsOfExperience){
        this.yearsOfExperience = yearsOfExperience;
    }
    
    public String getGender(){
        return this.gender;
    } 
    
    public void setGender(String gender){
        this.gender = gender;
    }
}
