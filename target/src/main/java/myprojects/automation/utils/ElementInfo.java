package myprojects.automation.utils;

import java.util.ArrayList;

public class ElementInfo {

    private String id;
    private String className;
    private String pageTitle;

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    private static ArrayList<ElementInfo> listElementInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public static ArrayList<ElementInfo> getList() {

        listElementInfo = new ArrayList<ElementInfo>();
        listElementInfo.add(0, new ElementInfo());
        listElementInfo.get(0).setId("tab-AdminDashboard");
        listElementInfo.get(0).setClassName("page-title");
        listElementInfo.get(0).setPageTitle("Пульт");

        listElementInfo.add(1, new ElementInfo());
        listElementInfo.get(1).setId("subtab-AdminParentOrders");
        listElementInfo.get(1).setClassName("page-title");
        listElementInfo.get(1).setPageTitle("Заказы");

        listElementInfo.add(2, new ElementInfo());
        listElementInfo.get(2).setId("subtab-AdminParentCustomer");
        listElementInfo.get(2).setClassName("page-title");
        listElementInfo.get(2).setPageTitle("Управление клиентами");

        listElementInfo.add(3, new ElementInfo());
        listElementInfo.get(3).setId("subtab-AdminParentCustomerThreads");
        listElementInfo.get(3).setClassName("page-title");
        listElementInfo.get(3).setPageTitle("Customer Service");

        listElementInfo.add(4, new ElementInfo());
        listElementInfo.get(4).setId("subtab-AdminStats");
        listElementInfo.get(4).setClassName("page-title");
        listElementInfo.get(4).setPageTitle("Статистика");

        listElementInfo.add(5, new ElementInfo());
        listElementInfo.get(5).setId("subtab-AdminParentThemes");
        listElementInfo.get(5).setClassName("page-title");
        listElementInfo.get(5).setPageTitle("Шаблоны > Шаблон");

        listElementInfo.add(6, new ElementInfo());
        listElementInfo.get(6).setId("subtab-AdminParentShipping");
        listElementInfo.get(6).setClassName("page-title");
        listElementInfo.get(6).setPageTitle("Перевозчики");

        listElementInfo.add(7, new ElementInfo());
        listElementInfo.get(7).setId("subtab-AdminParentPayment");
        listElementInfo.get(7).setClassName("page-title");
        listElementInfo.get(7).setPageTitle("Payment Methods");

        listElementInfo.add(8, new ElementInfo());
        listElementInfo.get(8).setId("subtab-AdminInternational");
        listElementInfo.get(8).setClassName("page-title");
        listElementInfo.get(8).setPageTitle("Локализация");

        listElementInfo.add(9, new ElementInfo());
        listElementInfo.get(9).setId("subtab-ShopParameters");
        listElementInfo.get(9).setClassName("page-title");
        listElementInfo.get(9).setPageTitle("General");

        listElementInfo.add(10, new ElementInfo());
        listElementInfo.get(10).setId("subtab-AdminAdvancedParameters");
        listElementInfo.get(10).setClassName("page-title");
        listElementInfo.get(10).setPageTitle("Information");

        return listElementInfo;
    }


}

