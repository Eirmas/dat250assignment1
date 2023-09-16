package no.hvl.dat250.jpa.tutorial.creditcards.driver;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import no.hvl.dat250.jpa.tutorial.creditcards.*;

public class CreditCardsMain {

  static final String PERSISTENCE_UNIT_NAME = "jpa-tutorial";

  public static void main(String[] args) {
    try (EntityManagerFactory factory = Persistence.createEntityManagerFactory(
        PERSISTENCE_UNIT_NAME); EntityManager em = factory.createEntityManager()) {
      em.getTransaction().begin();
      createObjects(em);
      em.getTransaction().commit();
    }
  }

  private static void createObjects(EntityManager em) {
    Customer customer = new Customer();
    customer.setName("Max Mustermann");

    Address address = new Address();
    address.setStreet("Inndalsveien");
    address.setNumber(28);

    Set<Address> addresses = new HashSet<Address>();
    addresses.add(address);

    customer.setAddresses(addresses);

    em.persist(address);

    Bank bank = new Bank();
    bank.setName("Pengebank");

    em.persist(bank);

    Pincode pincode = new Pincode();
    pincode.setCode("123");
    pincode.setCount(1);

    em.persist(pincode);

    CreditCard creditCard1 = new CreditCard();
    creditCard1.setNumber(12345);
    creditCard1.setBalance(-5000);
    creditCard1.setCreditLimit(-10000);
    creditCard1.setOwningBank(bank);
    creditCard1.setPincode(pincode);

    CreditCard creditCard2 = new CreditCard();
    creditCard2.setNumber(123);
    creditCard2.setBalance(1);
    creditCard2.setCreditLimit(2000);
    creditCard2.setOwningBank(bank);
    creditCard2.setPincode(pincode);

    em.persist(creditCard1);
    em.persist(creditCard2);

    Set<CreditCard> creditCards = new HashSet<CreditCard>();
    creditCards.add(creditCard1);
    creditCards.add(creditCard2);
    customer.setCreditCards(creditCards);

    em.persist(customer);
  }
}
