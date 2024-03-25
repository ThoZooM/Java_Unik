import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class LoaderRunnable implements Runnable{
    private String path;

    public LoaderRunnable(String path) {
        this.path = path;
    }

    @Override
    public void run() {
        FileInputStream fis;
        if(this.path != null && new File(this.path).exists()) {
            try {
                fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Product product = (Product)ois.readObject();
                System.out.println(product.toString());
            } catch (ClassNotFoundException | IOException ex) {
                System.out.println("Error loading object from path: " + this.path);
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("This file does not exist!");
        }
    }

}