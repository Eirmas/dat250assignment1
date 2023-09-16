package no.hvl.dat250.jpa.tutorial.creditcards;

import jakarta.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "bank")
    private Set<CreditCard> creditCards;

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String bankName) {
        this.name = bankName;
    }

    public Collection<CreditCard> getOwnedCards() {
        return this.creditCards;
    }
}
