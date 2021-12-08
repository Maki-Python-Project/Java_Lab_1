import java.util.Objects;

public class Officer extends Soldier{
    private int salary;
    private String rank;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public static class Builder {
        private Officer newOfficer;

        public Builder() {
            newOfficer = new Officer();
        }

        public Builder withName(String name){
            newOfficer.name = name;
            return this;
        }

        public Builder withSurname(String surName){
            newOfficer.surName = surName;
            return this;
        }

        public Builder withMiddleName(String middleName){
            newOfficer.middleName = middleName;
            return this;
        }

        public Builder withSalary(int salary){
            newOfficer.salary = salary;
            return this;
        }

        public Builder withRank(String rank){
            newOfficer.rank = rank;
            return this;
        }

        public Builder withAge(int age){
            newOfficer.age = age;
            return this;
        }

        public Builder callDate(String callDate){
            newOfficer.callDate = callDate;
            return this;
        }

        public Officer build(){
            return newOfficer;
        }

    }

    @Override
    public String toString() {
        return "Officer{" +
                "salary=" + salary +
                ", rank='" + rank + '\'' +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", callDate='" + callDate + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Officer officer = (Officer) o;
        return salary == officer.salary && rank.equals(officer.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary, rank);
    }
}
