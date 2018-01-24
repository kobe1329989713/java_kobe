package Gdish.G005.g01;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2018/01/22/ 18:57 星期一<BR>
 * <p>
 * <B>系统名称：</B>java_kobe<BR>
 * <B>概要说明：</B>java_kobe<BR>
 */
public final class Data {
    private String id;
    private String name;

    public Data(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
