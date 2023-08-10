package Session06.Example03.myCode09082023;

public class Number {
    private String name;

    public Number(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    //They use the equals and hashCode method to see if it is the same element or not
    @Override
    public boolean equals(Object obj) {
        //Same Instance
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        //Different Classes
        if(getClass() != obj.getClass()) {
            return false;
        }

        Number num = (Number) obj;

        return name.equals(num.getName());
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

}
