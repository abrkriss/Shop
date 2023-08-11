import java.util.ArrayList;



public class Shop implements Interf_Add_Toy, Inter_Random {
    /**
     * toys - список имеющихся в магазине игрушек
     * played_toys - список разыгранных игрушек
     */
    ArrayList<Toy> toys;
    ArrayList<Toy> played_toys;


    public Shop(){
        this.toys = new ArrayList<>();
        this.played_toys = new ArrayList<>();
    }

    /**
     * ShowShop - метод показывает список игрушек в магазине
     */
    public void ShowShop(){
        System.out.println(toys);
    }
    /**
     * addToy - метод добавляет игрушки в магазин
     */

    @Override
    public void addToy(Toy toy) {
        toys.add(toy);
    }
    /**
     * StartLottery - метод старта лотереи, рандомный выбор игрушки из массива
     * вывод,
     * добавление в список разыгранных игрушек,
     * удаление из списка игрушек в магазине
     */
    @Override
    public void StartLottery() {
        int n = (int)Math.floor(Math.random() * toys.size()+1);
        System.out.println("\nРезультат лотереи: " +  n + toys.get(n-1));
        if(n!=0){
            played_toys.add(toys.get(n-1));
        }
        else {
        System.out.println("Ошибка в диапазоне");
        }
        if(toys.size()>1){
            System.out.println("\n В МАГАЗИНЕ ЗАКОНЧИЛИСЬ ИГРУШКИ, ПОРА ПОПОЛНИТЬ ЗАПАСЫ!");
        }
        else {
            toys.remove(toys.get(n-1));
            System.out.println("Осталось игрушек в магазине: " + toys);
        }
        }

    /**
     * ShowPlayedToys - метод показывает список разыгранных игрушек на всю лоттерею
     */
    public void ShowPlayedToys(){
        System.out.println("Список разыгранных игрушек: "+ played_toys);
    }

    }


