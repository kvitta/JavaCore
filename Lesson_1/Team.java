package Lesson_1;

public class Team implements CanGetCourse {
    private String name;
    private int speed;//Скорость участника
    private int energy;// Энергия, необходимая для прохождения препятствия

    public Team(String name, int speed, int energy) {
        this.name = name;
        this.speed = speed;
        this.energy = energy;

    }
    public int getCourse(Course course) {
        int timeToOvercome = course.getLength() / speed;// время, которое потребовалось для прохождения препятствия
        if (timeToOvercome <= course.getTimeToPass()&& energy >= course.getEnergyNeeded()) { //препятствие пройдено, если участник уложился в норматив и ему хватило энергии
            System.out.println(name + " удачно прохошел препятствие " + course.getType() + " за " + timeToOvercome + "мин.");
            return timeToOvercome;

        }
        System.out.println(name + " не прошел испытание " + course.getType()+ "(результат "+ timeToOvercome+"мин.)");
            return timeToOvercome ;


    }

    public String toString() {
        return name + ", скорость - " + speed + ", энергия - " + energy;
    }
    public void teamInfo (){
        System.out.println(toString());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}
