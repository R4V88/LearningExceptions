import exception.HumanLastnameWrongFormat;
import exception.HumanNameWrongFormat;
import exception.HumanNotFoundException;
import service.HumanService;

public class Main {
    public static void main(String[] args) throws HumanNotFoundException, HumanNameWrongFormat, HumanLastnameWrongFormat {
        int[] ints = {1, 5, 4, 2, 9, 10, 24, 23};

        try {
            for (int i = 0; i < ints.length + 1; i++) {
                System.out.println(ints[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bound");
        }

        HumanService humanService = new HumanService();

        System.out.println(humanService.getHumanById(9));
        System.out.println(humanService.getHumanByLastName("Superman"));

        humanService.getHumans();
    }
}
