package Matteövningar;

public class CheckChar {
    public boolean isLetter(char sign) {

        return (sign >= 'a' && sign <= 'z') || (sign >= 'A' && sign <= 'Z');
    }
}
