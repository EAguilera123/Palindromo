package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public static boolean esPalindromo(String cadena) {
        if (cadena == null) {
            return false;
        }

        // Normalizar la cadena: eliminar espacios y convertir a minúsculas
        cadena = cadena.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int inicio = 0;
        int fin = cadena.length() - 1;

        // Comparar caracteres desde los extremos hacia el centro
        while (inicio < fin) {
            if (cadena.charAt(inicio) != cadena.charAt(fin)) {
                return false;
            }
            inicio++;
            fin--;
        }

        return true;
    }
}