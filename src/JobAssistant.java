public class JobAssistant {
    public static void main(String[] args) {

        int dayClicks=0;
        int dailyLimit=200;

        Vacancy vacancy = new Vacancy("123456",
                "Java","Yandex","Moscow",
                "Mega Super", "http://");

        System.out.println("Название вакансии: " + vacancy.getTitle());
        System.out.println("Название компании: " + vacancy.getCompany());

        if (dayClicks>=dailyLimit){
            System.out.println("Лимит превышен");
        }else {
            System.out.println("Продолжаем отклики");
        }

    }
}
