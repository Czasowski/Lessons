public class Escape {
    public static void main(String[] args) {
        String header = "\n \tПРОГНОЗ ПОГОДЫ:\n";
        header += "\n\tDAY\t\tMAX\tMIN\tWET\n";
        header += "\t---\t\t----\t----\t---------\n";

        String forecast = "\tSunday\t68F\t58F\t55%\n";

        System.out.print(header+forecast);
    }
}
