public class day8 {
     record CourseRecord( String course, String department){
     }
    static void main() {
        CourseRecord courseRecord = new CourseRecord("java","Bsc AI&DS");
        System.out.println(courseRecord.course());
        System.out.println(courseRecord.department());
    }
}
