package cz.educanet.praha;

import cz.educanet.praha.school.School;

public class SchoolCountStudentsFromClassByName {

    public static int countStudentsFromClassByItsName(School school, String className) {
            for (int i = 0;i < 2; i++){
                if (school.classes[i].name.equals(className)){
                    return school.classes[i].students.length;
                }
            }
        return 0;
    }
}
