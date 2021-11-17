package db;




public class ReportBuilder {
    private БазаДаних DataBase;
    public ReportBuilder(БазаДаних db) {
        this.DataBase = db;
    }

    public String getUserData() {
        return DataBase.отриматиДаніКористувача();
    }

    public String getStatisticData() {
        return DataBase.отриматиСтатистичніДані();
    }
    }

