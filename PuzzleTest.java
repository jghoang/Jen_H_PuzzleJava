public class PuzzleTest {
    public static void main (String[] arg){
        PuzzleJava puzzle = new PuzzleJava();

        puzzle.sumAndTen(new int[] {3,5,1,2,7,9,8,13,25,32});

        String [] names = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        puzzle.shuffleNames(names);
        puzzle.shuffleAlpha();
        puzzle.random55To100();
        puzzle.sorted55To100();
        puzzle.randomString();
        puzzle.randomFiveString();
    }
}