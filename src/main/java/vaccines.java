public class vaccines {
    private int vaccinesRemaining;
    private String vaccine_type;
    private String vaccine_date;
    public vaccines(int v, String t, String d){
        vaccinesRemaining = v;
        vaccine_type = t;
        vaccine_date = d;
    }
    public int getVaccinationstatus(){
        if (vaccinesRemaining != 0){
            System.out.println("You have " + vaccinesRemaining + " to go.");
            return vaccinesRemaining;
        }
        else{
            System.out.println("You are fully vaccinated");
            return vaccinesRemaining;
        }
    }
    public void updateVaccinationstatus(){
        vaccinesRemaining -= 1;
    }
    public void setVaccine_date(String x){
        vaccine_date = x;
    }
    public void setVaccine_type(String x){
        vaccine_type = x;
    }
    public void vaccine_summary(String name){
        System.out.println(name + getVaccinationstatus() + ", with your last vaccination coming on the day of " + vaccine_date + ", where you received the vaccine from " + vaccine_type);
    }

}
