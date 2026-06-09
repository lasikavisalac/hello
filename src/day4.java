void main() {
    //int[] marks = int[5];
    int[][] marks = new int[5][3];
    int[][] studentMarks = {
            {78, 90, 34},
            {89, 65, 89},
            {12, 34, 56},
            {66, 12, 89},
            {33, 77, 88}

    };
    for (int row = 0; row < studentMarks.length; row++) {
        //0{79.90,34},
        //1{89,65,89},
        //2{66,12,89},
        //3{66,12,89},
        //4{66,12,89},
        //5{33,77,88}\
        for (int col = 0; col < studentMarks[row].length; col++) {
            System.out.print(studentMarks[row][col] + " ");
        }
        System.out.println();
    }
}