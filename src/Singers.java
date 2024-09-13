import java.util.Date;

public class Singers {
        private int singerId;
        private String singerName;
        private String singerAddress;
        private Date dateOfBirth;
        private int noOfAlbPublished;

    public Singers(){
        this.singerId = 0;
        this.singerName = "";
        this.singerAddress = "";
        this.dateOfBirth = null;
        this.noOfAlbPublished = 0;
    }

    public int getSingerId() {
        return singerId;
    }
    public String getSingerName() {
        return singerName;
    }
    public String getSingerAddress() {
        return singerAddress;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public int getNoOfAlbPublished() {
        return noOfAlbPublished;
    }
    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }
    public void setSingerName(String singerName) {
        this.singerName = singerName;

    }
    public void setSingerAddress(String singerAddress) {
        this.singerAddress = singerAddress;

    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setNoOfAlbPublished(int noOfAlbPublished) {
        this.noOfAlbPublished = noOfAlbPublished;
    }
    public void setWhole(int singerId,String singerName,String singerAddress,Date dateOfBirth,int noOfAlbPublished) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.noOfAlbPublished = noOfAlbPublished;
    }
    public void displaySingerDetails() {
        System.out.println("Singer ID: " + singerId);
        System.out.println("Singer Name: " + singerName);
        System.out.println("Singer Address: " + singerAddress);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Number of Album Published: " + noOfAlbPublished);
    }
}
