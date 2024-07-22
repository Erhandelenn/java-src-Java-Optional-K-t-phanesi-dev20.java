import java.util.Optional;
public class Get {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Java Dersi");

        if (optional.isPresent()) {
            String value = optional.get();
            System.out.println("Değer: " + value);
        }
    }
}