package springcourse;

public class GuestsMgr {

    @Override
    public String toString() {
        return "Гостю ${Идентификатор гостя} назначена встреча сотруднику ${Идентификатор \n" +
                "сотрудника. Отдел: {имя отдела сотрудника}. Дата: {дата встречи (виртуальное время)}. До \n" +
                "встречи осталось: ${число дней (виртуальное время)}"
                + " /n" + "Встреча гостя ${идентификатор гостя} с сотрудником ${идентификатор сотрудника} \n" +
                "отменена. Отдел: {имя отдела сотрудника}. Дата встречи: ${дата встречи (виртуальное \n" +
                "время)}, дата увольнения сотрудника: ${дата увольнения *виртуальное время)}";
    }
}