package beans;

import java.util.HashSet;
import java.util.Set;

public class Item {
    private Integer i_id;
    private String i_name;
    private Set<Order> orderSet=new HashSet<>();

    public Set<Order> getOrderSet() {
        return orderSet;
    }

    public void setOrderSet(Set<Order> orderSet) {
        this.orderSet = orderSet;
    }

    public Integer getI_id() {
        return i_id;
    }

    public void setI_id(Integer i_id) {
        this.i_id = i_id;
    }

    public String getI_name() {
        return i_name;
    }

    public void setI_name(String i_name) {
        this.i_name = i_name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "i_id=" + i_id +
                ", i_name='" + i_name + '\'' +

                '}'+"\n";
    }
}
