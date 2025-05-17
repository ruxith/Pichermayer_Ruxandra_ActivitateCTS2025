public interface ComponentaFlota {
    ComponentaFlota getNod(int index) throws Exception;
    void addNod(ComponentaFlota componenta) throws Exception;
    void removeNod(ComponentaFlota componenta) throws Exception;
    void getInfo(String indent);

}
