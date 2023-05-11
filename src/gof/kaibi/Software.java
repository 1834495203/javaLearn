package gof.kaibi;

/**
 * 开闭原则
 * 对扩展开放，对修改关闭。
 * 在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。
 * 简言之，是为了使程序的扩展性好，易于维护和升级。
 * 想要达到这样的效果，我们需要使用接口和抽象类(案例中的AbstractSkin)。
 * 因为抽象灵活性好，适应性广，只要抽象的合理，可以基本保持软件架构的稳定。
 * 而软件中易变的细节可以从抽象派生来的实现类来进行扩展(案例中的DefaultSkin和NewSkin).
 * 当软件需要发生变化时，只需要根据需求重新派生一个实现类来扩展就可以了。
 */

public class Software {

    private AbstractSkin abstractSkin;
    private int var;

    public Software(int var) {
        this.var = var;
    }

    public Software(){}

    public void setAbstractSkin(AbstractSkin abstractSkin) {
        this.abstractSkin = abstractSkin;
    }

    public void display(){
        abstractSkin.display();
        Rendering(var);
    }

    private void Rendering(int var){
        abstractSkin.toRender(var);
    }
}
