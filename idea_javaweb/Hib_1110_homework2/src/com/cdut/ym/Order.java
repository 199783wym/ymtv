package beans;

import java.util.HashSet;
import java.util.Set;

public class Order {
    private Integer o_id;
    private User user;
    private Set<Item>items=new HashSet<>();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getO_id() {
        return o_id;
    }

    public void setO_id(Integer o_id) {
        this.o_id = o_id;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Order{" +
                "o_id=" + o_id +
                ", user=" + user.getU_name() +
                ", items=" + items +
                '}'+"\n";
    }
}
