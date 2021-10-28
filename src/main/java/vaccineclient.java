public class vaccineclient {
    public static void main(){
        vaccines sheep = new vaccines(0, "Moderna","July 10th");
        sheep.vaccine_summary("Yuvi");
        sheep.getVaccinationstatus();
        sheep.setVaccine_type();
        sheep.updateVaccinationstatus();
        sheep.setVaccine_date();

    }
}

