package gof.lishidaihuan.after;

/**
 * 里氏代换原则:任何基类可以出现的地方，子类一定可以出现。通俗理解∶子类可以扩展父类的功能，但不能改变父类原有的功能.
 * 换句话说，子类继承父类时，除添加新的方法完成新增功能外，尽量不要重写父类的方法。
 * 如果通过重写父类的方法来完成新的功能，这样写起来虽然简单，但是整个继承体系的可复用性会比较差，特别是运用多态比较频繁时,程序运行出错的概率会非常大。
 */
public class RectangleDemo {
    public static void main(String[] args) {
        //创建长方形对象
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        //拓宽
        resize(rectangle);
        print(rectangle);

        //创建正方形对象
        Square square = new Square();
        square.setSide(10);
        print(square);
    }

    public static void resize(Rectangle rectangle){
        //拓宽方法, 如果宽比长小则进行扩宽操作
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }

    public static void print(Quadrilateral quadrilateral){
        System.out.println("长"+quadrilateral.getLength());
        System.out.println("宽"+quadrilateral.getWidth());
    }
}
