import java.util.*;

public class ComputerComparator implements Comparator <Computer> {

    @Override
    public int compare(Computer o1, Computer o2) {
        return 0;
    }

    public static class CpuComparator implements Comparator<Computer> {
        @Override
        public int compare(Computer o1, Computer o2) {
            if (o1.getCpu() > o2.getCpu())
                return -1;
            else if (o1.getCpu() < o2.getCpu())
                return 1;
            else return 0;
        }
    }

    public static class MemoryComparator implements Comparator<Computer> {
        @Override
        public int compare(Computer o1, Computer o2) {
            if (o1.getMemory() > o2.getMemory())
                return -1;
            else if (o1.getMemory() < o2.getMemory())
                return 1;
            else return 0;
        }
    }

    public static class NameComparator implements Comparator<Computer> {
        @Override
        public int compare(Computer o1, Computer o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static void compareComputer (List computerList){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj rodzaj sortowania (cpu-1, memory-2, name-3): ");
        int sortIndex = scanner.nextInt();

        switch (sortIndex) {
            case (1):
                ComputerComparator.CpuComparator cpuComparator = new ComputerComparator.CpuComparator();
                Collections.sort(computerList, cpuComparator);
                System.out.println("Produkty posortowane po częstoliwości procesora:");
                System.out.println(computerList);
                break;
            case (2):
                ComputerComparator.MemoryComparator memoryComparator = new ComputerComparator.MemoryComparator();
                Collections.sort(computerList, memoryComparator);
                System.out.println("Produkty posortowane po wielkości pamięci:");
                System.out.println(computerList);
                break;
            default:
                ComputerComparator.NameComparator nameComparator = new ComputerComparator.NameComparator();
                Collections.sort(computerList, nameComparator);
                System.out.println("Produkty posortowane po nazwie:");
                System.out.println(computerList);
                scanner.close();
        }
    }
}
