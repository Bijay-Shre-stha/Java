import java.util.Scanner;

class OrganizationClass {
    String orgName;
    String orgAddress;
    String orgEmail;
    String orgContact;

    void setInfo(String orgName, String orgAddress, String orgEmail, String orgContact){
        this.orgName = orgName;
        this.orgAddress = orgAddress;
        this.orgEmail = orgEmail;
        this.orgContact = orgContact;
    }

    void getOrgDetails(){
        System.out.println("Enter the Organization Name:");
        Scanner sc = new Scanner(System.in);
        orgName = sc.nextLine();
        System.out.println("Enter the Organization Address:");
        orgAddress = sc.nextLine();
        System.out.println("Enter the Organization Email:");
        orgEmail = sc.nextLine();
        System.out.println("Enter the Organization Contact:");
        orgContact = sc.nextLine();
    }

    void getDisplayDetails(){
        System.out.println("\nOrganization Details:\nName : " + orgName);
        System.out.println("Organization Address: " + orgAddress);
        System.out.println("Organization Email: " + orgEmail);
        System.out.println("Organization Contact: " + orgContact);
    }
}

public class Organization {
    public static void main(String[] args) {
        System.out.println("Enter the number of Organization you want to create:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        OrganizationClass[] org = new OrganizationClass[n];
        for (int i=0;i<org.length;i++){
            org[i] = new OrganizationClass();
            org[i].getOrgDetails();
            org[i].getDisplayDetails();
            System.out.println("\n");
        }
    }
}