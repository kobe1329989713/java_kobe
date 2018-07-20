package patter.patter01.chainOfResponsibility;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/14 22:23
 * @since JDK 1.8
 */
public abstract class AbstractHandler implements IHandler {

    private IHandler handler;

    public IHandler getHandler() {
        return handler;
    }

    public void setHandler(IHandler handler) {
        this.handler = handler;
    }
}
