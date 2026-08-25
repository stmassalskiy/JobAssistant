public class JobAssistant {
    public static void main(String[] args) {

        int dayClicks=0;
        int dailyLimit=200;
        boolean limitReached=dayClicks >= dailyLimit;

        Vacancy[] vacancy ={
                new Vacancy("123456", "Java","Yandex","Moscow", "Mega Super", "http://"),
                new Vacancy("657896", "Ruby","Ozone","Moscow", "Mega", "http://"),
                new Vacancy("367854", "C++","WB","Moscow", "Super", "http://")};

        for(int i=0; i<vacancy.length;i++){
            System.out.println(vacancy[i].getTitle());
        }

        if (limitReached){
            System.out.println("Лимит достигнут");
        }else {
            System.out.println("Продолжаем отклики");
        }

    }
}
