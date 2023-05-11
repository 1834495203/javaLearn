package orgin.Project;

import orgin.Value;

public final class Person implements RealPerson {

    @Value("裴橘")
    private String name;

    @Value("18")
    private int age;

    private Integer score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String getClazz() {
        return "敬请期待";
    }
}
