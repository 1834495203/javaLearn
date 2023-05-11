package own.agency;

import java.lang.reflect.Method;

/**
 * @author GLaDOS
 * @date 2023/5/8 22:06
 */
public abstract class Function<T>{

    Type type;

    public Function(Type type) {
        this.type = type;
    }

    abstract void originalFunction();

    abstract void enhanceFunction();

    public void start(){
        originalFunction();
        enhanceFunction();
    }
}
