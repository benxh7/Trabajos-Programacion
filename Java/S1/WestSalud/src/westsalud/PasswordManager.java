package westsalud;

public class PasswordManager {
    private String password;

    // Constructor que recibe la contrase�a ingresada por el usuario
    public PasswordManager(String password) {
        this.password = password;
    }

    // Metodo para validar si la contrase�a ingresada es v�lida
    public boolean isValid() {
        return hasMinimumLength() && hasLetter() && hasDigit() && hasSpecialChar();
    }

    // Verifica si la contrase�a tiene al menos 6 caracteres
    private boolean hasMinimumLength() {
        return password.length() >= 6;
    }

    // Verifica si la contrase�a contiene al menos una letra
    private boolean hasLetter() {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetter(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    // Verifica si la contrase�a contiene al menos un d�gito
    private boolean hasDigit() {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    // Verifica si la contrase�a contiene al menos un car�cter especial
    private boolean hasSpecialChar() {
        for (int i = 0; i < password.length(); i++) {
            char x = password.charAt(i);
            if (!Character.isLetterOrDigit(x)) {
                return true;
            }
        }
        return false;
    }
}