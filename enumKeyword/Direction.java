package enumKeyword;

public enum Direction {
    EAST, WEST, SOUTH, NORTH;
    
    public class EnumExample{
        public static void main(String[] args) {
            String input = "EAST";
            Direction direction = Direction.valueOf(input);
            System.out.println(direction);
            System.out.println(Direction.EAST.ordinal());
            System.out.println(Direction.WEST.ordinal());
        }

    }
}
