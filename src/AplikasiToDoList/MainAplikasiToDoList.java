package AplikasiToDoList;

public class MainAplikasiToDoList {

    public static String[] model = new String[10];

    public static void main(String[] args) {
        testShowToDoList();
    }


//menampilkan todo list

    public static void showTodoList() {
        for ( int i =0; i < model.length; i++){
            String todo = model[i];
            int no = i +1;

            if (todo != null){
                System.out.println(no + ". " + todo);
            }
        }

    }

    // test menampilkan todo ke list
    public static void testShowToDoList(){
        model[0]= "Belajar Java Dasar";
        model[1]= "Studi Kasus Java Dasar: Aplikasi TodoList";
        showTodoList();
    }




//menambah
    public static void addTodoList() {


    }
}
