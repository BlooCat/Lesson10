import java.util.EnumMap;

class EnumMapDemo {
    enum Hardware {
        MONITOR, MOUSE, KEYBOARD;
    }

    public static void main(String[] args) {
        EnumMap<Hardware, String> enumMap = new EnumMap<>(Hardware.class);
        enumMap.put(Hardware.MONITOR, "DELL");
        enumMap.put(Hardware.MOUSE, "Logitech G102");
        enumMap.put(Hardware.KEYBOARD, "Leopold");
        System.out.println("Total of hardware: " + enumMap.size());
        System.out.println(enumMap.get(Hardware.MONITOR));
        System.out.println(enumMap.get(Hardware.MOUSE));
        System.out.println(enumMap.get(Hardware.KEYBOARD));
    }
}
