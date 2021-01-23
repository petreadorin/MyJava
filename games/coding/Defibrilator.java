package games.coding;

public class Defibrilator {
    private int Id;
    private String Name;
    private String Address;
    private double Lon;
    private double Lat;

    public Defibrilator(int Id, double Lon, double Lat) {
        this.Id = Id;
        this.Lon = Lon;
        this.Lat = Lat;
    }

    public void SetName(String Name) {  // "set" usually have a void type because they dont return a value
        this.Name = Name;
    }

    public String GetName() {     // "get"  usually return something so they have a return type
        return this.Name;
    }

    public int GetId() {
        return this.Id;
    }

    public double CalculateDistance(double userLon, double userLat) {
        return Math.sqrt(Math.pow(((userLon - this.Lon) * Math.cos((this.Lat + userLat) / 2)), 2) + Math.pow((userLat - this.Lat), 2)) * 6371;
    }

}
