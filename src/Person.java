public class Person {
    private int age;
    private String university;

    public void setUniversities(String setUni){
        if (setUni.length() > 0 && setUni.length() < 10)
            university = setUni;
    }

    public String getUniversities(){
        return university;
    }

    public void setAge(int newAge){
        if (newAge > 0 && newAge <= 120)
            age = newAge;
    }

    public int getAge(){
        return age;
    }

}


