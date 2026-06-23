 class  day14 {
     static class Student {
         String name;
         int age;
         int regNo;


         Student(Builder builder) {
             this.name = builder.name;
             this.age = builder.age;
             this.regNo = builder.regNo;

         }

         static class Builder {
             private String name;
             private int age;
             private int regNo;

             public Builder name(String nameValue) {
                 this.name = nameValue;
                 return this;
             }

             public Builder age(int ageValue) {
                 this.age = ageValue;
                 return this;
             }

             public Builder regNo(int regNoValue) {
                 this.regNo = regNoValue;
                 return this;
             }

             public Student build() {
                 return new Student(this);
             }

         }

     }
         static void main() {
             Student builder = new Student.Builder()
                     .name("lasika")
                     .age(19)
                     .regNo(534637)
                     .build();
             System.out.println(builder.name);
             System.out.println(builder.age);
             System.out.println(builder.regNo);





         }
     }
