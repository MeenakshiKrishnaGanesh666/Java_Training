public class TestArray1 {

    public static void main(String[] args) {
        String[] schoolbag = new String[4];
        schoolbag[0] = "Books";
        schoolbag[1] = "Pens";
        schoolbag[2] = "Pencil";
        schoolbag[3] = "Notebooks";
        String[] schoolbag1 = {"Books", "Pens", "Pencils", "Notebooks"};
        int size = schoolbag1.length;
        System.out.println("The size of array is:" +size);
        for(int i=0; i<size; i++){
            System.out.println("Index["+i+"] = " +schoolbag1[i] );
        }
    }
}