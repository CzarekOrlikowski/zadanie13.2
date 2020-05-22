import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Computer> computerList = new ArrayList<>();
        computerList.add (new Computer("intel", 2500, 8));
        computerList.add (new Computer("intel", 2800, 8));
        computerList.add (new Computer("intel", 2800, 16));
        computerList.add (new Computer("amd", 2500, 8));
        computerList.add (new Computer("amd", 3000, 8));
        computerList.add (new Computer("amd", 2800, 8));

        Collections.sort(computerList);
        System.out.println(computerList);
    }
}
