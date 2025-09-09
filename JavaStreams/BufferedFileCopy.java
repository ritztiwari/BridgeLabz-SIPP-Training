import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) throws Exception {
        long start1 = System.nanoTime();
        try (FileInputStream fis = new FileInputStream("largefile.dat");
             FileOutputStream fos = new FileOutputStream("copy1.dat")) {
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
        }
        long end1 = System.nanoTime();
        long start2 = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("largefile.dat"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy2.dat"))) {
            byte[] buffer = new byte[4096];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        }
        long end2 = System.nanoTime();
        System.out.println("Unbuffered time: " + (end1 - start1));
        System.out.println("Buffered time: " + (end2 - start2));
    }
}
