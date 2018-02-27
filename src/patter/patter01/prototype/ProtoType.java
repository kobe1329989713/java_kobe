package patter.patter01.prototype;

import java.io.*;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/02/14/ 10:24 星期三<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>
 *      原型链模型的
 *        浅复制时：只有基本类型重新创建，其它引用类型不变。
 *        深复制时：基本类型和引用类型全部重新创建。
 *
 *        output：是输出，从内存输出来。
 *        input：是输入，输入到内存里去。
 *
 *        看你 参照的位置。一般在以内存为参数点时。(还要看当前你操作的哪个对象的位置，在是内存里，还是？？)
 *        output 输出。
 *        input 输入。
 *
 * <BR>
 */
public class ProtoType implements Cloneable,Serializable {

    private static final long serialVersionUID = 3379153113599383812L;
    private String string;

    private SerializableObject obj;

    /**
     * 浅复制
     * @return .
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        ProtoType proto = (ProtoType) super.clone();
        return proto;
    }

    /**
     * 深复制
     * @return .
     * @throws Exception
     */
    public Object deepClone() throws Exception {

        /**
         * 流的 知识。
         *   深度复制 只能采用流的方式，
         *
         *   应用场景：解决什么样问题：
         *     0.在创建对象的时候，我们不只是希望被创建的对象继承其基类的基本结构，还希望继承原型对象的数据。
         * - 希望对目标对象的修改不影响既有的原型对象（深度克隆的时候可以完全互不影响）。
         * - 隐藏克隆操作的细节。很多时候，对对象本身的克隆需要涉及到类本身的数据细节
         *
         *  现实生活中，就有许多这样的例子：
         *  生物细胞的自身复制；根据产品模型生产产品等等
         *
         *    1.创建对象，调用方法 而已。
         *
         *
         */

        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }



    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }
}
