package th.ac.ku.menu.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Menu {

    //เป็นprimary key ใช้กับdatabase
    @Id
    @GeneratedValue //JDA auto geneerate ID ให้
    private UUID id;

    private String name;
    private String price;
    private String category;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
