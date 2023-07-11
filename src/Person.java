public class Person {
    private String personName, personCpf, personEmail;
    private int personYearBirth;

    public Person(String personName, String personCpf, String personEmail, int personYearBirth) {
        this.personName = personName;
        this.personCpf = personCpf;
        this.personEmail = personEmail;
        this.personYearBirth = personYearBirth;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonCpf() {
        return personCpf;
    }

    public void setPersonCpf(String personCpf) {
        this.personCpf = personCpf;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    public int getPersonYearBirth() {
        return personYearBirth;
    }

    public void setPersonYearBirth(int personYearBirth) {
        this.personYearBirth = personYearBirth;
    }
}
