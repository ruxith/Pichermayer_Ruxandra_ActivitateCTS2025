public interface DepartamentAbstract {

    void addNod(DepartamentAbstract departament) throws Exception;
    DepartamentAbstract getNod(int index) throws Exception;
    void deleteNod(DepartamentAbstract departament) throws Exception;
    void getInfo(String intend);
}
