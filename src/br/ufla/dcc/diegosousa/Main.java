package br.ufla.dcc.diegosousa;

public class Main {

    public static void main(String[] args) {

        KingSort kingSort = new KingSort();

        String[] caseTest1 = {"Louis IX", "Louis VIII"};

        String[] caseTest2 = {"Louis IX", "Philippe II"};

        String[] caseTest3 = {"Richard III", "Richard I", "Richard II"};

        String[] caseTest4 = {"John X", "John I", "John L", "John V"};

        String[] caseTest5 = {"Philippe VI", "Jean II", "Charles V", "Charles VI", "Charles VII", "Louis XI"};

        String[] caseTest6 = {"Philippe II", "Philip II"};

        kingSort.getSortedList(caseTest1);
        kingSort.getSortedList(caseTest2);
        kingSort.getSortedList(caseTest3);
        kingSort.getSortedList(caseTest4);
        kingSort.getSortedList(caseTest5);
        kingSort.getSortedList(caseTest6);

        for(String s : caseTest1) {

            System.out.println(s);

        }

        System.out.println("\n\n\n");

        for(String s : caseTest2) {

            System.out.println(s);

        }

        System.out.println("\n\n\n");

        for(String s : caseTest3) {

            System.out.println(s);

        }

        System.out.println("\n\n\n");

        for(String s : caseTest4) {

            System.out.println(s);

        }

        System.out.println("\n\n\n");

        for(String s : caseTest5) {

            System.out.println(s);

        }

        System.out.println("\n\n\n");

        for(String s : caseTest6) {

            System.out.println(s);

        }

    }
}
