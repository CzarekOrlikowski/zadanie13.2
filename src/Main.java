import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Computer> computerList = new ArrayList<>();

        computerList.add(new Computer("intel", 2500, 8));
        computerList.add(new Computer("intel", 2700, 4));
        computerList.add(new Computer("intel", 2800, 16));
        computerList.add(new Computer("amd", 2500, 16));
        computerList.add(new Computer("amd", 3200, 4));
        computerList.add(new Computer("amd", 2800, 8));

        ComputerComparator.compareComputer(computerList);
    }
}
