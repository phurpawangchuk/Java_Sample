package InstanceFive;

public class Five {
    static int countInsatnce = 0;
    static final int MAX_INSTANCE=5;

    Five() {
        if(countInsatnce >= MAX_INSTANCE) {
            throw new RuntimeException("Max reached");
        }
        else {
            countInsatnce++;
        }
    }

    public static void main(String[] args) {
        for(int i=0; i<=MAX_INSTANCE; i++) {
            Five instaceFive = new Five();
            System.out.println(instaceFive+"=="+countInsatnce);
        }
    }
}
