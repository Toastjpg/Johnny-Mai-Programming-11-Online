public class Main {
    public static String dayOfYear(int month, int dayOfMonth, int year) {
        int dayOfYear = 0;
        int[] totalDayInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month >= 1 && month <= 12 && dayOfMonth > 0 && dayOfMonth <= totalDayInMonth[month - 1] && year > 0){
            for(int i = 1; i <= month - 1; i++){
                dayOfYear += totalDayInMonth[i];
            }
            dayOfYear += dayOfMonth;
        }
        else{
            return "invalid input(s)";
        }
        return String.valueOf(dayOfYear);
    }
    public static void main(String[] args) {
        System.out.println(dayOfYear(1, 29,2062));
    }
}
