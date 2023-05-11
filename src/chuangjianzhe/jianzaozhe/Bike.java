package chuangjianzhe.jianzaozhe;

/**
 * 产品对象
 */
public class Bike {

    private String frame;

    private String seat;

    //私有构造方法
    private Bike(Builder builder){
        this.frame = builder.frame;
        this.seat = builder.seat;
    }

    //重构静态内部类, 通过builder创建复杂对象
    public static final class Builder{

        private String frame;

        private String seat;

        public Builder frame(String frame){
            this.frame = frame;
            return this;
        }

        public Builder seat(String seat){
            this.seat = seat;
            return this;
        }

        public Bike build(){
            return new Bike(this);
        }
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
