package com.jaime.flinder.repositories;

import com.jaime.flinder.POJO.Homework;
import com.jaime.flinder.POJO.Subject;

import java.util.ArrayList;

/**
 * Created by jaime on 06/01/2017.
 */

public class HomeworkRepository extends ArrayList<Homework> {
    private static HomeworkRepository instance;

    public static HomeworkRepository getInstance() {
        if (instance == null)
            instance = new HomeworkRepository();

        return instance;
    }

    private HomeworkRepository() {
        add(new Homework(new Subject("Matemáticas", 0),
                "Entrega ejercicios desde el 1 hasta el 8 de la página 67, tema 4",
                "9 Enero, 2017"));
        add(new Homework(new Subject("Programación", 0),
                "Examen POO y colecciones, tema 3",
                "9 Enero, 2017"));
        add(new Homework(new Subject("Física", 0),
                "Entrega de proyecto audiovisual sobre los puntos máximos y mínimos de energía potencial y energía cinética. Al menos tres ejemplos distintos",
                "10 Enero, 2017"));
        add(new Homework(new Subject("Base de datos", 0),
                "Tener preparado tres tablas en la base de datos, una vez creadas prácticar inserción de datos en ellas con algunos datos",
                "11 Enero, 2017"));
    }
}
