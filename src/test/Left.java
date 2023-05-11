package test;

public interface Left {

    static int a = 10;

    static int test(){
        return 10;
    }

    int output();
}

class LeftImpl implements Left{

    @Override
    public int output() {
        return Left.test();
    }
}
