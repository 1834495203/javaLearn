package own.agency;

import java.lang.reflect.Method;
import java.util.Collections;

/**
 * @author GLaDOS
 * @date 2023/5/8 22:12
 */
public class AgencyFunctionImpl implements AgencyFunction{

    private EnhanceFunction enhanceFunction;

    public AgencyFunctionImpl() {
    }

    public AgencyFunctionImpl(EnhanceFunction enhanceFunction) {
        this.enhanceFunction = enhanceFunction;
    }

    @Override
    public <T> void toAgency(Function<T> function, T t) throws NoSuchMethodException {
        
    }

    @Override
    public void getType() {

    }
}
