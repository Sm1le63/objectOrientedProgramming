public class Main {

    public FormDate birthday;

    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();


        post.birthday.day = "25";
        post.birthday.month = "02";
        post.birthday.year = "1993";
        post.name = "Иван";
        post.passport = "3306 " + "№" + " 015015";
        post.patronymic = "Иванович";
        post.phone = "+7(927)-007-07-07";
        post.surname = "Иванов";
        post.subscription = true;
    }
}



