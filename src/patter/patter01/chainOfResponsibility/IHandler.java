package patter.patter01.chainOfResponsibility;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/14 22:21
 * @since JDK 1.8
 *
 * 责任链模式：netty 用到了。
 */
public interface IHandler {
    /**
     * 操作方法。
     */
    void operator();
}
