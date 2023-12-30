
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Product> productList = new ArrayList<>();

        Map<Integer, String> productMap = new HashMap<>();

        productList.add(new Product(5,"book", 200));
        productList.add(new Product(2,"Pen", 120));
        productList.add(new Product(3,"Eraser", 20));
        productList.add(new Product(1,"Crayon", 150));
        productList.add(new Product(4,"Pencil", 50));

        Collections.sort(productList);

        for (Product product : productList) {
            System.out.println(product);

//            String output = ("ID: "+ product.getProductId()+ ", Name: "+ product.getProductName() +", Price: "
//                    + product.getPrice());
            productMap.put(product.getProductId(), product.toString());
        }

        System.out.println("-------------------------------------");


        Comparator<Product> lengthComparator = Comparator.comparing(Product::getProductId);
        TreeSet<Product> products = new TreeSet<>(lengthComparator);

        products.add(new Product(9,"bag", 200));
        products.add(new Product(6,"razor", 120));
        products.add(new Product(8,"paper clips", 20));
        products.add(new Product(5,"Chalk", 150));
        products.add(new Product(7,"Marker", 50));

        for (Product product : products) {
            System.out.println(product);

//            String output = ("ID: "+ product.getProductId()+ ", Name: "+ product.getProductName() +", Price: "
//                    + product.getPrice());
            productMap.put(product.getProductId(), product.toString());
        }

        System.out.println("Enter the Id of a product in the map: 1->9");
        int id = scanner.nextInt();


        String output = productMap.get(id);

//        if (output != null) {
//            System.out.println(output);
//        } else {
//            System.out.println("Number not valid");
//        }
        System.out.println(Objects.requireNonNullElse(output, "Number not valid"));

        System.out.println("-------------------------------------");

        for (int i = 0; i < productList.size() - 1; i++) {
            for (int j = 0; j < productList.size() - 1 -i; j++) {
                if (productList.get(j).compareTo(productList.get(j + 1)) > 0) {
                    Collections.swap(productList, j, j+1);
                }
            }
        }
        System.out.println("BubbleSort Result: "+ productList);


        System.out.println("-------------------------------------");

        System.out.println("Enter the Id of a product in the ArrayList: 1->5 (BINARY SEARCH)");
        int id2 = scanner.nextInt();

        int outputSample = Collections.binarySearch(productList, new Product(id2,"", 0));
        Product answer = productList.get(outputSample);
        System.out.println(answer);


        System.out.println("-------------------------------------");

        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        System.out.println("Random number from 1 - 10: "+ randomNumber);

        System.out.println("-------------------------------------");

        double number = Math.sqrt(100);
        System.out.println("The square root of 100 is : "+ number);

        System.out.println("-------------------------------------");

        String data = "I just rounded up my assignment";
        StringTokenizer stringTokenizer = new StringTokenizer(data);

        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }

        System.out.println("-------------------------------------");

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Current date: "+date);
        System.out.println("Current time: "+time);
        System.out.println("Current date time: "+dateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateTime.format(dateTimeFormatter);
        System.out.println("Formatted Date Time: "+ formattedDateTime);


        scanner.close();


    }

}