import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class User {
	
	@Id
    private String _id;  // De vuelta a String para que Mongo genere el ObjectId automáticamente
    private String name;
    private String email;
    private String address;
    private double lat;
    private double lng;
    private List<String> available_books = new ArrayList<>();
    private String registration_date;
    
    
    public User() {}

    public User(String name, String email, String address, double lat, double lng, String registration_date) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.lat = lat;
        this.lng = lng;
        this.available_books = available_books;
        this.registration_date = registration_date;
    }
    
 // Getters y Setters
    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String[] getAvailableBooks() {
        return available_books;
    }

    public void setAvailableBooks(String[] available_books) {
        this.available_books = available_books;
    }

    public String getRegistrationDate() {
        return registration_date;
    }

    public void setRegistrationDate(String registration_date) {
        this.registration_date = registration_date;
    }
}
