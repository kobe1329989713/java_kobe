package javase01.itcast20;

/**
 * @author liukun
 * @version 1.0
 * @date 2018/7/9 16:24
 * @since JDK 1.8
 */
public class CharacterDemo {
    public static void main(String[] args) {
        // 注：chara 会把 97 这种自动转换成一个字符， 因为97 对应的是一个字节。
        Character character = new Character((char) 97);
//        Character character = new Character('a');
//        System.out.println("character: " + character);


//    System.out.println(Character.BYTES);
//    System.out.println(Character.DIRECTIONALITY_COMMON_NUMBER_SEPARATOR);

//        System.out.println(Character.charCount(97222));
//        System.out.println(character.charValue());
//        System.out.println(Character.compare('a','a'));
//        System.out.println(character.compareTo(character));
        System.out.println(Character.getType('='));
        System.out.println(Character.reverseBytes('b'));
    }
}
