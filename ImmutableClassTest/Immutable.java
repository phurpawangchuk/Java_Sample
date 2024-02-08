package ImmutableClassTest;

public class Immutable {
    public static void main(String[] args) {
        ImmutableClass im = new ImmutableClass(4, "Phurpa Wangchuk");
        System.out.println(im.getAge() + " === " + im.getName());
    }
}
