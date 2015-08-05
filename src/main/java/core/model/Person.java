package core.model;

import javax.persistence.*;
import java.util.List;
import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.*;
import org.springframework.data.neo4j.support.index.IndexType;

@Entity
@Table(name = "person")
@NodeEntity
public class Person {

    @Id
    @GraphId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer person_id;

    @Indexed
    @Column(name = "first_name")
    private String FirstName;

    @Indexed
    @Column(name = "last_name")
    private String LastName;

    @Column(name = "mail")
    private String Mail;

    @Column(name = "cibus_number")
    private String cibusNumber;

    @Column(name = "status")
    private String Status;

    @OneToMany(/*mappedBy = "person_id",*/ fetch = FetchType.EAGER, cascade= CascadeType.ALL)
    @JoinColumn(name="person_id")
    private List<Address> addresses;

    @OneToMany(fetch = FetchType.EAGER, cascade= CascadeType.ALL)
    @JoinColumn(name="user_id")
    private List<Phones> phones;

    @RelatedTo(type = "Related Jobs", direction = Direction.OUTGOING)
    @OneToMany(fetch = FetchType.EAGER, cascade= CascadeType.ALL)
    @JoinColumn(name="user_id")
    private List<Job> jobs;

  /*  public Person(String firstName, String lastName)
    {
        FirstName = firstName;
        LastName = lastName;
    }*/

    public Integer getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String getCibusNumber() {
        return cibusNumber;
    }

    public void setCibusNumber(String cibusNumber) {
        this.cibusNumber = cibusNumber;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Phones> getPhones() {
        return phones;
    }

    public void setPhones(List<Phones> phones) {
        this.phones = phones;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public void setJob(Job job) {
        this.jobs.add(job);
    }
}
