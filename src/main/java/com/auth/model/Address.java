package main.java.com.auth.model;

public class Address {
    
    // Attributes
    private Long addressID;
    private String street;
    private String neighborhood;
    private Integer number;

    // Atributes from user
    private User user;

    // Getter and Setter for Street
    public String getStreet(){
        return this.street;
    }

    public void setStreet(String street){
        this.street = street;
    }

    // Getter and Setter for neighborhood
    public String getNeighborhood(){
        return this.neighborhood;
    }

    public void setNeighborhood(String neighborhood){
        this.neighborhood = neighborhood;
    }

    // Getter and Setter for number of the house
    public Integer getNumber(){
        return this.number;
    }

    public void setNumber(Integer number){
        this.number = number;
    }
}
