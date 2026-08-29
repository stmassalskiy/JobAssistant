public class VacancyFilter {
    private final String keyword;
    private final String city;

    public VacancyFilter(String keyword, String city) {
        this.keyword = keyword;
        this.city = city;
    }

    public boolean fitsVacancy(Vacancy v){ //подходит ли вакансия под фильтр
        if((v.getTitle().toLowerCase()).contains((this.keyword).toLowerCase()) && v.getCity().equalsIgnoreCase(this.city)){
            return true;
        }else{
            return false;
        }
    }
}
