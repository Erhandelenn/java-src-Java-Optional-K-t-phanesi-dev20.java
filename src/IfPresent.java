import java.util.Optional;

public class IfPresent {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Merhaba Dünya");

        optional.ifPresent(value -> System.out.println("Değer: " + value));
    }
}