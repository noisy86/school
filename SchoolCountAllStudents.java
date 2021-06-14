package cz.educanet.praha;

import cz.educanet.praha.school.School;

public class SchoolCountAllStudents {

    public static int countAllStudents(School school) {
        int allStudents = 0;
        for (int i = 0; i < school.classes.length; i++){
            allStudents += school.classes[i].students.length;
        }
        return allStudents;
    }
}
