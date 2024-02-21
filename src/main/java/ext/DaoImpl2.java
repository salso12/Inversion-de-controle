package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version Capteurs");
        double temp = 1180;
        return temp;
    }
}
