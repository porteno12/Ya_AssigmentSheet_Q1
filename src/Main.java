public class Main {
    public static void main(String[] args) {
        int num = 45; // מספר לבדיקה
        boolean isKaprekar = isKaprekar(num);

        // הצגת התוצאה
        System.out.println("Is " + num + " a Kaprekar number? " + isKaprekar);
    }

    // פעולה לבדיקת מספר קפרקר
    public static boolean isKaprekar(int num) {
        if (num < 1) {
            return false;
        }
        int square = num * num;
        String squareStr = String.valueOf(square);
        String leftSide = squareStr.substring(0, squareStr.length() / 2);
        String rightSide = squareStr.substring(squareStr.length() / 2);
        int leftNum = 0;
        int rightNum = 0;
        if (!leftSide.isEmpty()) {
            leftNum = Integer.parseInt(leftSide);
        }
        if (!rightSide.isEmpty()) {
            rightNum = Integer.parseInt(rightSide);
        }
        return (leftNum + rightNum) == num;
    }
}