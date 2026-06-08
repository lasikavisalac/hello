void main(){
    int[] marks={87,44,89,32,23};
    System.out.print("pass marks: ");
    for (int i = 0; i < marks.length; i++){
            if (marks[i] >= 40) {
                System.out.print(marks[i] + " GI");
            }
              }
                System.out.println();

    System.out.print("Fail marks: ");
    for( int i = 0; i<marks.length;i++){
        if(marks[i] < 40){
            System.out.print(marks[i] + " ");

        }
    }

}