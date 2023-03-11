package Methods;

public class methodForSolvingTheHanoiTowerProblemInJava {
    /*
    В этом примере показано, как использовать метод для решения задачи о Ханойской башне (для 3 дисков).
    Является одной из популярных головоломок XIX века. Даны три стержня, на один из которых нанизаны восемь колец, причём кольца отличаются размером и лежат меньшее на большем. Задача состоит в том, чтобы перенести пирамиду из восьми колец за наименьшее число ходов на другой стержень. За один раз разрешается переносить только одно кольцо, причём нельзя класть большее кольцо на меньшее.
     */
    public static void main(String[] args) {
        int nDisks = 3;
        doTowers(nDisks, 'A', 'B', 'C');
    }
    public static void doTowers(int topN, char from, char inter, char to) {
        if (topN == 1) {
            System.out.println("Диск 1 от " + from + " до " + to);
        } else {
            doTowers(topN - 1, from, to, inter);
            System.out.println("Диск " + topN + " от " + from + " до " + to);
            doTowers(topN - 1, inter, from, to);
        }
    }
}
