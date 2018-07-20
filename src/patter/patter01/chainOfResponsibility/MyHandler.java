package patter.patter01.chainOfResponsibility;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/14 22:26
 * @since JDK 1.8
 */
public class MyHandler extends AbstractHandler implements IHandler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name + ": deal!");
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}
