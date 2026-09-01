public class Main {
    public static void main(String[] args) {
        Vacancy java = new Vacancy("1234567","GO","Yandex","Moscow","dev","https://");
        VacancyFilter vf = new VacancyFilter("Java", "Moscow");
        ApplicationCounter ac = new ApplicationCounter(200);
        JobAssistant ja = new JobAssistant(vf,ac);
        System.out.println(ja.canProcessVacancy(java));

    }
}
