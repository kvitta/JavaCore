package Lesson_1;

public class Course {
    private String type;//тип препятствия
    private int length;//длина препятствия
    private int timeToPass;//норматив, в который необходимо уложиться участникам
    private int energyNeeded;//энергия(сила), необходимая для прохождения препятствия

    public Course (String type, int length, int timeToPass, int energyNeeded){
        this.type = type;
        this.length = length;
        this.timeToPass = timeToPass;
        this.energyNeeded = energyNeeded;
    }

    public int getTimeToOvercome (CanGetCourse team){
        return team.getCourse(this);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getTimeToPass() {
        return timeToPass;
    }

    public void setTimeToPass(int timeToPass) {
        this.timeToPass = timeToPass;
    }

    public int getEnergyNeeded() {
        return energyNeeded;
    }

    public void setEnergyNeeded(int energyNeeded) {
        this.energyNeeded = energyNeeded;
    }
}
