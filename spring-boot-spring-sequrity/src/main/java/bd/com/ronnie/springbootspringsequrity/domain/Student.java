package bd.com.ronnie.springbootspringsequrity.domain;

public class Student {

    private final Integer id;
    private final String name;

    public Student(Integer idd, String name) {
        this.id = idd;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
