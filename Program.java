public class Program {
    public static void main(String[] args) {
        Toy bear = new Toy(1, "Мишка", 1, 0.25);
        Toy doll = new Toy(2, "Кукла", 1, 0.25);
        Toy ball = new Toy(3, "Мяч", 1, 0.25);
        Toy hourse = new Toy(4, "Лошадка", 1, 0.25);
        Shop shop = new Shop();
        shop.addToy(bear);
        shop.addToy(doll);
        shop.addToy(ball);
        shop.addToy(hourse);
        shop.ShowShop();
        doll.ChangeChance(0.3);
        shop.StartLottery();
        shop.StartLottery();
        shop.StartLottery();
        shop.StartLottery();
        shop.ShowPlayedToys();



    }


}
