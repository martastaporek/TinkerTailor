import java.util.ArrayList;
import java.util.List;

public class TinkerTailor {

    private int N; //number of elements
    private int K; // fold
    private List <Integer> array = new ArrayList<>();

    public TinkerTailor(int n, int k) {
        this.N = n;
        this.K = k;
    }

    public int getWinner(){
        generateArray();
        int index = 0;
        while (this.array.size() > 1){
            index = (index + this.K - 1) % this.array.size();
            this.array.remove(this.array.get(index));
        }
        return this.array.get(0);

    }

    private void generateArray(){
        for(int i =1; i <= this.N; i++){
            array.add(i);
        }
    }
}
