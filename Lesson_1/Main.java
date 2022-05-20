package Lesson_1;

public class Main {
    public static void main (String [] args){
        Team [] champions = {new Team("Иван", 5, 10),//Создаем команду
                new Team("Петр", 8, 15),
                new Team("Антон", 8, 13),
                new Team("Лев", 10, 12),
                new Team("Дмитрий", 9,14)};
        System.out.println("Участники команды: ");
        for (Team team: champions){//выводим информацию об участниках команды
            team.teamInfo ();
        }
        Course [] obstacleCourse = { new Course("Бег", 30, 8, 12),//создаем массив для полосы препятствий
                new Course("Плавание", 50, 9,13),
                new Course("Велопробег", 200, 40,15)
        };
        System.out.println("----------------------------------- ");
        System.out.println("Участники проходят испытание: ");
        for (Team team: champions){// просим команду пройти полосу препятствий
            team.getCourse(obstacleCourse[0]);
            team.getCourse(obstacleCourse[1]);
            team.getCourse(obstacleCourse[2]);
            System.out.println("----------------------- ");
}


    }
}
