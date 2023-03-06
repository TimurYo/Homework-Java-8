public class Main {
    public static void main(String[] args) {
        Post post= new Post();
        post.birthday= new FormDate();

        post.birthday.day= 17;
        post.birthday.month= 5;
        post.birthday.year= 1987;
        post.name= "Иван";
        post.passport= "4444 № 444444";
        post.patronymic="Иванович";
        post.phone= "89992228888";
        post.surname= "Иванов";
        post.subscription= true;
    }

}
