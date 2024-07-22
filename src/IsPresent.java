import java.util.Optional;

public class IsPresent{
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Java Dersi");

        if (optional.isPresent()) {
            System.out.println("Değer mevcut.");
        } else {
            System.out.println("Değer mevcut değil.");
        }
    }
}