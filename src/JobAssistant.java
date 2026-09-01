public class JobAssistant {
  private final VacancyFilter vacancyFilter; // фильтр
  private final ApplicationCounter applicationCounter; //

    public JobAssistant(VacancyFilter vacancyFilter, ApplicationCounter applicationCounter) {
        this.vacancyFilter = vacancyFilter;
        this.applicationCounter = applicationCounter;
    }

    public boolean canProcessVacancy(Vacancy vacancy){ //вакансия подходит + лимит не достигнут
        if(vacancyFilter.fitsVacancy(vacancy) && applicationCounter.canApply()){
            return true;
        }else {
            return false;
        }
    }

    public boolean registerSuccessfulApplication(){
        if(applicationCounter.registerApplication()){
            return true;
        }else {
            return false;
        }
    }



}
