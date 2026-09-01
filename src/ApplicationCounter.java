// логика класса, можно ли вообще откликаться еще

public class ApplicationCounter {
    private int currentCount; // текущее количество откликов
    private final int dayliLimit; // текущий лимит за день

    public ApplicationCounter(int daylyLimit) {
        currentCount =0;
        this.dayliLimit = daylyLimit;
    }

    public int getCurrentCount() {
        return currentCount;
    }

    public boolean canApply(){ // метод возможности отклика
        if(currentCount<dayliLimit){
            return true;
        }else {
            return false;
        }
    }

    public int remainingApplications(){ // сколько откликов еще осталось
        return dayliLimit-currentCount; // возвращает количество соатвшихся откликов

    }

    public boolean registerApplication(){ // метод регистрирует факт успешного отклика
        if(canApply()){
            currentCount++;
            return true;
        }else {
            return false;
        }
    }
}
