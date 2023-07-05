package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "phonebook_table", schema = "public", catalog = "phonebook")
public class PhonebookTableEntity {
    private long id;
    private String secondName;
    private String firstName;
    private String thirdName;
    private String department;
    private String postion;
    private String telNumber;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "second_name", nullable = true, length = -1)
    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Basic
    @Column(name = "first_name", nullable = true, length = -1)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "third_name", nullable = true, length = -1)
    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    @Basic
    @Column(name = "department", nullable = true, length = -1)
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Basic
    @Column(name = "postion", nullable = true, length = -1)
    public String getPostion() {
        return postion;
    }

    public void setPostion(String postion) {
        this.postion = postion;
    }

    @Basic
    @Column(name = "tel_number", nullable = true, length = -1)
    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhonebookTableEntity that = (PhonebookTableEntity) o;

        if (id != that.id) return false;
        if (secondName != null ? !secondName.equals(that.secondName) : that.secondName != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (thirdName != null ? !thirdName.equals(that.thirdName) : that.thirdName != null) return false;
        if (department != null ? !department.equals(that.department) : that.department != null) return false;
        if (postion != null ? !postion.equals(that.postion) : that.postion != null) return false;
        if (telNumber != null ? !telNumber.equals(that.telNumber) : that.telNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (thirdName != null ? thirdName.hashCode() : 0);
        result = 31 * result + (department != null ? department.hashCode() : 0);
        result = 31 * result + (postion != null ? postion.hashCode() : 0);
        result = 31 * result + (telNumber != null ? telNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PhonebookTableEntity{" +
                "id=" + id +
                ", secondName='" + secondName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", thirdName='" + thirdName + '\'' +
                ", department='" + department + '\'' +
                ", postion='" + postion + '\'' +
                ", telNumber='" + telNumber + '\'' +
                '}';
    }
}
