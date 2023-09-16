package no.hvl.dat250.jpa.tutorial.creditcards;

import java.util.Collection;
import java.util.Set;

import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany
    private Set<Address> addresses;

    @ManyToMany
    private Set<CreditCard> creditCards;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Address> getAddresses() {
        return this.addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public Collection<CreditCard> getCreditCards() {
        return this.creditCards;
    }

    public void setCreditCards(Set<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }
}
