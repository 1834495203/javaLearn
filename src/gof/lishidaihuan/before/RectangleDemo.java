package gof.lishidaihuan.before;

/**
 * 我们得出结论:在resize方法中，Rectangle类型的参数是不能被square类型的参数所代替，如果进行了替换就得不到预期结果
 * 因此，square类和Rectangle类之间的继承关系违反了里氏代换原则，它们之间的继承关系不成立，正方形不是长方形。
 */
public class RectangleDemo {

    public static void main(String[] args) {
        //创建长方形对象
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        print(rectangle);
        //调用resize拓宽
        resize(rectangle);
        print(rectangle);

        //创建正方形对象
        Square square = new Square();
        square.setLength(10);
        //拓宽
        resize(square);
        print(square);
    }

    public static void resize(Rectangle rectangle){
        //拓宽方法, 如果宽比长小则进行扩宽操作
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }

    public static void print(Rectangle rectangle){
        //打印长和宽
        System.out.println("长:"+rectangle.getLength());
        System.out.println("宽:"+rectangle.getWidth());
    }
}
