import java.util.Locale;

public class TerceiroPrograma {
    public static void main(String[] args) {
        // Obtém o locale padrão do sistema (inclui idioma e país)
        Locale locale = Locale.getDefault();

        // Mostra o idioma
        System.out.println("Idioma do sistema operacional: " + locale.getDisplayLanguage());
        System.out.println("Código do idioma: " + locale.getLanguage());
    }
}