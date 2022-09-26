package dataSaver;

public class FileDataSaver<T> implements DataSaver<T>{


    private T data;

    @Override
    public void save(T data) {
        System.out.println("ukladani do souboru");
        this.data = data;
    }

    @Override
    public T load() {
        System.out.println("nacitani do souboru");
        return data;
    }
}
