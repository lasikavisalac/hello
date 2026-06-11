void main(){
    int[][] attendence={
            {0,1,0},
            {1,0,0},
            {1,1,1},
            {1,0,1},
            {0,0,0}
    };
    for (int row = 0; row < attendence.length;row++){
        System.out.println("Student "+( row+1)+":");
        for(int col = 0; col < attendence[row].length; col++) {
            if (attendence[row][col]==1){
                System.out.println("Class :"+(col+1)+": Present");
            }
            else{
                System.out.println("Class : "+(col+1)+": Absent");
            }
        }
        System.out.println();
    }
}
