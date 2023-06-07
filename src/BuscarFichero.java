public class BuscarFichero {
    public static void main(String[] args) throws FileNotFoundException {
        File fd = new File("tuFichero.txt");
        Scanner file = new Scanner(fd);

        ArrayList<String> list = new ArrayList<>();

        while (file.hasNext()) {
            list.add(file.nextLine());
        }
        file.close();

        Scanner sc = new Scanner(System.in);
        System.out.println("Indica que deseas buscar");
        String nombre = sc.nextLine();

        List<String> result = new ArrayList<>();
        for (String s : list) {
            if (s.contains(nombre)) {
                result.add(s);
            }
        }
        System.out.println(result);
    }
}