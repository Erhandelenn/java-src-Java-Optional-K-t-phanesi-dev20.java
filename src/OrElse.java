import java.util.Optional;

public class OrElse{
    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();

        String value = optional.orElse("Yedek Değer");
        System.out.println("Değer: " + value);
    }
}