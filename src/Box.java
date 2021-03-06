public class Box {

    int width;
    int whiteSpace;

    public Box(int width, int whiteSpace) {
        this.width = width;
        this.whiteSpace = whiteSpace;
    }

    public Box(int width) {
        this.width = width;
    }

    public Box() {
        this.width = 50;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setWhiteSpace(int whiteSpace) {
        this.whiteSpace = whiteSpace;
    }

    public void printHorizontalBorder() {
        for(int i = 0; i < width; i++)
            print("*");
        print("\n");
    }

    public void printBetweenBorder() {
        print("*");
        for(int i = 0; i < width-2; i++)
            print(" ");
        print("*\n");
    }

    public void printMessageInBox(String message) {
        printHorizontalBorder();
        printBetweenBorder();
        printTextInBox(message);
        printBetweenBorder();
        printHorizontalBorder();
    }

    public void printTextInBox(String message) {
        for(int i = 0; i < message.length(); i += width)
            printBoxLayer(message, i);
    }

    public void printBoxLayer(String message, int i) {
        print("*  ");
        if(i + width - 6 < message.length()) {
            print(message.substring(i, i += width - 6));
        }
        else {
            print(message.substring(i, message.length() - 1));
            for(int k = message.length() - i; (k + 5) % width != 0; k++)
                print(" ");
        }
        print("  *\n");
    }

    public void print(Object obj) {
        System.out.print(obj.toString());
    }
}
