package structural.composite;

//Leaf node in composite pattern
public class Binary extends File{


    private long size;

    public Binary(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public void ls() {
        System.out.println(getName());
    }

    @Override
    public void addFile(File file) {
       throw new UnsupportedOperationException("Leaf node doesn't support add operation ");
    }

    @Override
    public File[] getFiles() {
        throw new UnsupportedOperationException("Leaf node doesn't support add operation ");

    }

    @Override
    public boolean removeFile(File file) {
        throw new UnsupportedOperationException("Leaf node doesn't support add operation ");
    }
}
