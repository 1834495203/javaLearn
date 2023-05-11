package own.agency;

/**
 * @author GLaDOS
 * @date 2023/5/8 22:05
 */
public interface AgencyFunction {

    <T> void toAgency(Function<T> function, T t) throws NoSuchMethodException;

    void getType();
}
