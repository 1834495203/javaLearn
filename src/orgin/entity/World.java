package orgin.entity;

import orgin.Value;

public class World {

    @Value("我的名字")
    private String name;

    public String getName() {
        return name;
    }

    @SuppressWarnings("all")
    public void setName(String name) {
        this.name = name;
    }
}
