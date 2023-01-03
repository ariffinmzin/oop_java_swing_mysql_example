public class Student {

    private String name;
    private String mobile;
    private String gender;
    private String dateOfBirth;
    private String address;

    //setters
    public void setName(String name){
        this.name = name;
    }

    public void setMobile(String mobile){
        this.mobile = mobile;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public void setAddress(String address){
        this.address = address;
    }

    //getters

    public String getName(){
        return name;
    }

    public String getMobile(){
        return mobile;
    }

    public String getGender(){
        return gender;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public String getAddress(){
        return address;
    }
    
}
