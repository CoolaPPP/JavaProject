import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);
        coffee cofDB = new coffee();


        int num;

        System.out.println("Coffee Data Management");
        System.out.println("*************************");
        System.out.println("press following number");
        System.out.println("1 for add new data");
        System.out.println("2 for edit data");
        System.out.println("3 for delete data");
        System.out.println("4 for show data");
        System.out.println("or any number to exit");
        System.out.println("*************************");
        System.out.print("Enter number : ");
        num = src.nextInt();

        switch (num) {
            //add
            case 1: {
                int select;
                System.out.println("*****************************************");
                System.out.println("press following number for select table");
                System.out.println("1 for Coffee Bean");
                System.out.println("2 for Coffee Region");
                System.out.println("3 for Coffee Product");
                System.out.println("or any number to exit");
                System.out.println("*****************************************");
                System.out.print("Enter number : ");
                select = src.nextInt();

                    if(select==1) {
                        //add coffee bean
                        String bean_id, name, region;
                        System.out.println("*****************************************");
                        System.out.println("Add Coffee Bean Data");
                        System.out.println("*****************************************");
                        System.out.print("Enter coffee ID : ");
                        bean_id = src.next();
                        System.out.print("Enter coffee name : ");
                        name = src.next();
                        System.out.print("Enter coffee region : ");
                        region = src.next();
                        cofDB.insertCoffeeBeanData(bean_id, name, region);
                    } if (select==2) {
                        //add coffee location
                        String locate_id, name, city, country, level;
                        System.out.println("*****************************************");
                        System.out.println("Add Coffee Region Data");
                        System.out.println("*****************************************");
                        System.out.print("Enter region ID : ");
                        locate_id = src.next();
                        System.out.print("Enter region name : ");
                        name = src.next();
                        System.out.print("Enter city : ");
                        city = src.next();
                        System.out.print("Enter country : ");
                        country = src.next();
                        System.out.print("Enter location sea level : ");
                        level = src.next();
                        cofDB.insertCoffeeLocateData(locate_id,name,city,country,level);
                    } if (select==3) {
                        //add coffee product
                        String product_id, name, detail;
                        float price;
                        System.out.println("*****************************************");
                        System.out.println("Add Coffee Product Data");
                        System.out.println("*****************************************");
                        System.out.print("Enter product ID : ");
                        product_id = src.next();
                        System.out.print("Enter product name : ");
                        name = src.next();
                        System.out.print("Enter product detail : ");
                        detail = src.next();
                        System.out.print("Enter price : ");
                        price = src.nextInt();
                        cofDB.insertCoffeeProductData(product_id,name,detail,price);
                    } else {
                        cofDB.CloseDb();
                    }
                
                break;
            }
            case 2:{
                //edit
                int select;
                System.out.println("*****************************************");
                System.out.println("press following number for select table");
                System.out.println("1 for Coffee Bean");
                System.out.println("2 for Coffee Region");
                System.out.println("3 for Coffee Product");
                System.out.println("or any number to exit");
                System.out.println("*****************************************");
                System.out.print("Enter number : ");
                select = src.nextInt();
                if(select==1) {
                        //edit coffee bean
                        String bean_id, name, region;
                        System.out.println("*****************************************");
                        System.out.println("Edit Coffee Bean Data");
                        System.out.println("*****************************************");
                        System.out.print("Enter coffee ID : ");
                        bean_id = src.next();
                        System.out.print("Enter coffee name : ");
                        name = src.next();
                        System.out.print("Enter coffee region : ");
                        region = src.next();
                        cofDB.updateCoffeeBeanData(bean_id, name, region);
                    } if (select==2) {
                        //edit coffee location
                        String locate_id, name, city, country, level;
                        System.out.println("*****************************************");
                        System.out.println("Edit Coffee Region Data");
                        System.out.println("*****************************************");
                        System.out.print("Enter region ID : ");
                        locate_id = src.next();
                        System.out.print("Enter region name : ");
                        name = src.next();
                        System.out.print("Enter city : ");
                        city = src.next();
                        System.out.print("Enter country : ");
                        country = src.next();
                        System.out.print("Enter location sea level : ");
                        level = src.next();
                        cofDB.updateCoffeeLocateData(locate_id, name, city, country, level);
                    } if (select==3) {
                        //edit coffee product
                        String product_id, name, detail;
                        float price;
                        System.out.println("*****************************************");
                        System.out.println("Edit Coffee Product Data");
                        System.out.println("*****************************************");
                        System.out.print("Enter product ID : ");
                        product_id = src.next();
                        System.out.print("Enter product name : ");
                        name = src.next();
                        System.out.print("Enter product detail : ");
                        detail = src.next();
                        System.out.print("Enter price : ");
                        price = src.nextInt();
                        cofDB.updateCoffeeProductData(product_id, name, detail, price);
                    } else {
                        cofDB.CloseDb();
                    }
                break;
            }
            case 3:{
                //delete
                int select;
                System.out.println("*****************************************");
                System.out.println("press following number for select table");
                System.out.println("1 for Coffee Bean");
                System.out.println("2 for Coffee Region");
                System.out.println("3 for Coffee Product");
                System.out.println("or any number to exit");
                System.out.println("*****************************************");
                System.out.print("Enter number : ");
                select = src.nextInt();
                if(select==1) {
                    //delete coffee bean
                    String bean_id;
                    System.out.println("*****************************************");
                    System.out.println("Delete Coffee Bean Data");
                    System.out.println("*****************************************");
                    System.out.print("Enter coffee ID : ");
                    bean_id = src.next();
                    cofDB.DeleteCoffeeBeanData(bean_id);
                } if (select==2) {
                    //delete coffee location
                    String locate_id;
                    System.out.println("*****************************************");
                    System.out.println("Delete Coffee Region Data");
                    System.out.println("*****************************************");
                    System.out.print("Enter region ID : ");
                    locate_id = src.next();
                    cofDB.DeleteCoffeeLocateData(locate_id);
                } if (select==3) {
                    //delete coffee product
                    String product_id;
                    System.out.println("*****************************************");
                    System.out.println("Delete Coffee Product Data");
                    System.out.println("*****************************************");
                    System.out.print("Enter product ID : ");
                    product_id = src.next();
                    cofDB.DeleteCoffeeProductData(product_id);
                } else {
                    cofDB.CloseDb();
                }
                break;
            }
            case 4:{
                //show
                int select;
                System.out.println("*****************************************");
                System.out.println("press following number for select table");
                System.out.println("1 for Coffee Bean");
                System.out.println("2 for Coffee Region");
                System.out.println("3 for Coffee Product");
                System.out.println("4 for all table");
                System.out.println("or any number to exit");
                System.out.println("*****************************************");
                System.out.print("Enter number : ");
                select = src.nextInt();
                if (select==1) {
                    cofDB.showCoffeeBeanData();
                } if (select==2) {
                    cofDB.showCoffeeLocateData();
                } if (select==3) {
                    cofDB.showCoffeeProductData();
                } if (select==4) {
                    cofDB.displayAllData();
                } else {
                    cofDB.CloseDb();
                }
                break;
            }
            default:
                //other number
                cofDB.CloseDb();
                break;
        }
        
    }
}