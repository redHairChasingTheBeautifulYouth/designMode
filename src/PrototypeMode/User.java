package PrototypeMode;
/*
 *
 * @author LiuBing
 * @date 2018/8/27 16:54
 */

public class User implements Cloneable{

    private String name;

    private People people;


    public String getName() {
        return name;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        User user = null;
        user = (User) super.clone();
        user.people = (People) this.people.clone();

        return user;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", people=" + people +
                '}';
    }
}
