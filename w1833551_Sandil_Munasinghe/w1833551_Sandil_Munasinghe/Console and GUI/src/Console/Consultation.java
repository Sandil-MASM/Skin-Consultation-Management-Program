package Console;

import javax.crypto.SecretKey;
import java.time.LocalDate;
import java.time.LocalTime;

public class Consultation extends Patient {

    //localDateTime stores both date and time unlike Local date which stores only the date
    private int whichco;
    private LocalDate conDate;
    private LocalTime consulStart;
    private LocalTime consulEnd;
    private String docconsulId;
    private String conNote;
    private String notenkey;
    private double cost;




    public Consultation(int whichco,String name, String surname, LocalDate dateOfBirth, String phoneno, int patId, String docconsulId, LocalTime consulStart, LocalTime consulEnd, LocalDate conDate, String conNote,double cost,String notenkey) {
        super(name,surname,dateOfBirth,phoneno,patId);
        this.whichco=whichco;
        this.conDate = conDate;
        this.consulStart = consulStart;
        this.consulEnd = consulEnd;
        this.docconsulId = docconsulId;
        this.conNote = conNote;
        this.cost=cost;
        this.notenkey=notenkey;
    }

    //getters and setters
    //consultation date

    public int getWhichco() {
        return whichco;
    }

    public void setWhichco(int whichco) {
        this.whichco = whichco;
    }

    public LocalDate getConDate() {
        return conDate;
    }

    public void setConDate(LocalDate conDate) {
        this.conDate = conDate;
    }
    //consultation time
    public LocalTime getConsulStart() {
        return consulStart;
    }

    public void setConsulStart(LocalTime consulStart) {
        this.consulStart = consulStart;
    }
    //consultation slot
    public String getDocconsulId() {
        return docconsulId;
    }

    public void setDocconsulId(String docconsulId) {
        this.docconsulId = docconsulId;
    }
    //consultation note
    public String getConNote() {
        return conNote;
    }

    public void setConNote(String conNote) {
        this.conNote = conNote;
    }

    public void setConsulEnd(LocalTime consulEnd) {
        this.consulEnd = consulEnd;
    }

    public LocalTime getConsulEnd() {
        return consulEnd;
    }

    public double getCost() {return cost;}

    public void setCost(double cost) {this.cost = cost;}

    public String getNotenkey() {
        return notenkey;
    }

    public void setNotenkey(String notenkey) {
        this.notenkey = notenkey;
    }

    @Override
    public String toString() {
        return  "01.Name                 : " + this.getName() + '\n' +
                "02.SurName              : " + this.getSurname() + '\n' +
                "03.Date-of-Birth        : " + this.getDateOfBirth() + '\n' +
                "04.Mobile-No            : " + this.getMobileNo() + '\n' +
                "05.Patient-ID           : " + this.getPatientId() + '\n' +
                "06.Consultation-Date    : " + conDate +'\n'+
                "07.Start-Time           : " + consulStart +'\n'+
                "08.End-Time             : " + consulEnd +'\n'+
                "09.Consulted-Doctor     : " + docconsulId +'\n'+
                "10.Cost-for-Consultation: " + cost+'\n'+
                "11.Additional-Note      : \n" + conNote +'\n';
    }
}
