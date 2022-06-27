package phonebook;

import java.util.Objects;

public class PhoneBookEntry {

    private String surname;
    private String phone;

    /**
     * @param surname
     * @param phone
     */
    public PhoneBookEntry(String surname, String phone) {
        Objects.nonNull(surname);
        Objects.nonNull(phone);
        this.surname = surname;
        this.phone = phone;
    }
    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }
    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        Objects.nonNull(surname);
        this.surname = surname;
    }
    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }
    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        Objects.nonNull(phone);
        this.phone = phone;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "PhoneBookEntry [phone=" + phone + ", surname=" + surname + "]";
    }

    

    
    
}
