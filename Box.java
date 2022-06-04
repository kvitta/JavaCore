package Lesson_3.BoxesWithFruit;

public class Box <T> {
    private int amount;
    private double weight;
    private String type;
    public Box(String type,int amount, double weight) {
        this.type = type;
        this.amount = amount;
        this.weight = weight;
    }
    public  double getWeightOfBox() {
        return amount * weight;


    }
    public  boolean compare( Box<?> boxToCompare) {
        if (Math.abs(getWeightOfBox() - boxToCompare.getWeightOfBox()) < 0.01) {
            System.out.println("Коробка " + boxToCompare +  " равна с текцщей коробкой по весу." );}
        else
            System.out.println("Коробка " + boxToCompare +  " НЕ равна с текцщей коробкой по весу." );
        return false;
    }

    @Override
    public String toString() {
        return "Коробка { " +
                "фрукты = "+ type+
                ", количесво = " + amount +
                '}';
    }

    public void pour (Box <T> box){
    box.amount = amount + box.amount;
    amount = 0;
        System.out.println("Количесвто фруктов в коробке "+ box.getType() +"( в которую пересыпали) = "+ box.amount + "шт.");
        System.out.println("Количесвто фруктов в коробке "+ type +" (из которой пересыпали) = "+ amount + "шт.");
}
    public int addFruit ( int a){
        return amount = amount + a;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

   public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
