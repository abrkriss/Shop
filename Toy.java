/**
 * toy_id - идентификатор игрушки
 * toy_name - наименование игрушки
 * amount - количество игрушек
 * chance - вероятность выпадения игрушки
 */
public class Toy implements Inter_ChangeChance{
    int toy_id;
    String toy_name;
    int amount;
    double chance;

   public Toy (int toy_id, String toy_name, int amount, double chance){
    this.toy_id = toy_id;
    this.toy_name = toy_name;
    this.amount = amount;
    this.chance = chance;
    }

    @Override
    public String toString() {
        return "\n Игрушка " +
                 toy_id +
                " название " + toy_name  +
                " количество = " + amount +
                " вероятность выпадения = " + chance ;
    }
    /**
     * ChangeChance - интерфейс, метод изменения вероятность выпадения игрушки
     */
    @Override
    public void ChangeChance(double val) {
        chance = val;
        System.out.println(" \n  Ввероятность выпадения игрушки " + toy_name + " теперь равна " + chance);
    }


}
