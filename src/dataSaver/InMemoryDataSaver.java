package dataSaver;

public class InMemoryDataSaver<T> implements DataSaver<T> {


    private T data ;

    @Override
    public void save(T data) {
        this.data = data;
    }

    @Override
    public T load() {
        return data;
    }

    public void Test()
    {
        System.out.println("sfdd");
    }
}
