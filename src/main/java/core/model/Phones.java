package core.model;

import javax.persistence.*;

@Entity
@Table(name = "phones")
public class Phones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer phone_id;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private PhoneType type;

    @Column(name = "phone_number")
    private String phoneNumber;

    public Integer getPhone_id() {
        return phone_id;
    }

    public void setPhone_id(Integer phone_id) {
        this.phone_id = phone_id;
    }

    public PhoneType getType() {
        return type;
    }

    public void setType(PhoneType type) {
        this.type = type;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

