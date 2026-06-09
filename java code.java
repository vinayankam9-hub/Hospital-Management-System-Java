SQL DATABASE CODE
CREATE DATABASE hospitaldb;
USE hospitaldb;
CREATE TABLE patients (
    patient_id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    disease VARCHAR(100)
);
CREATE TABLE appointments (
    patient_id INT,
    doctor_name VARCHAR(50),
    appointment_date VARCHAR(30)
);
CREATE TABLE billing (
    patient_id INT,
    amount DOUBLE
);
CREATE TABLE records (
    patient_id INT,
    medical_record VARCHAR(200)
);
JAVA CODE
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.ArrayList;
class Person {
    protected String name;
    protected int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Patient extends Person {
    private int patientId;
    private String disease;
    public Patient(int patientId, String name, int age, String disease) {
        super(name, age);
        this.patientId = patientId;
        this.disease = disease;
    }
    public int getPatientId() {
        return patientId;
    }
    public String getDisease() {
        return disease;
    }
}
class Doctor extends Person {
    private int doctorId;
    private String specialization;
    public Doctor(int doctorId, String name, int age, String specialization) {
        super(name, age);
        this.doctorId = doctorId;
        this.specialization = specialization;
    }
}
public class HospitalManagementSystem extends JFrame {
    ArrayList<Patient> patientList = new ArrayList<>();
    Connection con;
    public void connectDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hospitaldb",
                "root",
                "password"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void registerPatient() {
        try {
            String query = "INSERT INTO patients VALUES (?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void bookAppointment() {
        try {
            String query = "INSERT INTO appointments VALUES (?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void generateBill() {
        try {
            String query = "INSERT INTO billing VALUES (?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void saveMedicalRecord() {
        try {
            String query = "INSERT INTO records VALUES (?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new HospitalManagementSystem();
    }
}