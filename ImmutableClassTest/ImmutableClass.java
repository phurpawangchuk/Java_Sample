package ImmutableClassTest;

public final class ImmutableClass {
    private final int age;
    private final String name;

    ImmutableClass(int a, String n) {
        this.age = a;
        this.name = n;
    }

    int getAge() {
        return 3 * age;
    }

    String getName() {
        return name;
    }

}
