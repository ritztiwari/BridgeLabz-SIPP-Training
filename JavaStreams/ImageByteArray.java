import java.io.*;

public class ImageByteArray {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("input.jpg");
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }
            fis.close();
            byte[] data = baos.toByteArray();
            ByteArrayInputStream bais = new ByteArrayInputStream(data);
            FileOutputStream fos = new FileOutputStream("output.jpg");
            while ((len = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
