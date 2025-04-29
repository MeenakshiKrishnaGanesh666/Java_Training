public class ArraysofArraysDemo {

    public static void main(String[] args) {
        String[][] cartoons = {
            {"Flinstones", "Fred", "Wilma", "Pebbles", "Dino"}, 
            {"Rubbles", "Barney", "Betty"}, 
            {"Jetsons", "George", "Jane"}, 
            {"ScoobyDooGang", "ScoobyDoo", "Shaggy"}
        };
        for(int i=0; i<cartoons.length; i++){
            System.out.print(cartoons[i][0]+" ");
        for(int j=1; j<cartoons[i].length; j++){
            System.out.print(cartoons[i][j]+" ");
        }
        System.out.print("\n");
    }
}
}