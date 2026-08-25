public class Vacancy {
    private final String id; // id вакансии
    private final String title; //название вакансии
    private final String company; // название компании
    private final String city; // город, где вакансия
    private final String description; // описание вакансии
    private final String url; // ссылка на вакансию

    public Vacancy(String id, String title, String company, String city, String description, String url) {
        this.id = id;
        this.title = title;
        this.company = company;
        this.city = city;
        this.description = description;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getCity() {
        return city;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }
}
