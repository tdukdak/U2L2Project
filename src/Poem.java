public class Poem {
    private String name;

    public Poem(String yourName) {
        name = yourName;
    }

    // this method prints the entire poem
    public void printPoem() {
        printFirstHalf();
    }

    public void printFirstHalf() {
        printLine2();
        System.out.println("Hello " + name + "!");
    }

    public void printLine2() {
        System.out.println("I have a poem for you");
        printLine3();
    }

    public void printLine3() {
        printSecondHalf();
        System.out.println("Roses are red");
    }

    public void printSecondHalf() {
        System.out.println("Violets are blue");
        printLastLine();
        System.out.println("AP CSA is awesome!");
    }

    public void printLastLine() {
        System.out.println("And that's the end - see you!");
    }
}
