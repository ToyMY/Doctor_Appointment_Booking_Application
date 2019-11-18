package coms.example.asus.doctor_appointment.Model;

public class Doctors {
    private String doctorName, speciality, fees, image, department, doctorid, date, time;
    public Doctors()
    {

    }

    public Doctors(String doctorName, String speciality, String fees, String image, String department, String doctorid, String date, String time) {
        this.doctorName = doctorName;
        this.speciality = speciality;
        this.fees = fees;
        this.image = image;
        this.department = department;
        this.doctorid= doctorid;
        this.date = date;
        this.time = time;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(String doctorid) {
        this.doctorid = doctorid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
