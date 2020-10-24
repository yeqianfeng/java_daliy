package daily_java.day05;

/**
 * @ClassName Rectangle
 * @Description TODO
 * @Author QIAN-feng
 * @Date 2020/10/24
 **/
public class Rectangle extends BaseGraph{
    private final double length;
    private final double width;

    public Rectangle(double length,double width){
        super();
        this.length = length;
        this.width = width;
    }
    @Override
    public double getCircumference(){
        return 2 * (length + width);
    }

}
