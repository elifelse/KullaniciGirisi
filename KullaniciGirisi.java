import  java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, result, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();
        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.print("Giriş Yaptınız !");
        } else {
            System.out.println("Bilgileriniz Yanlış !");
            System.out.print("Şifrenizi yenilemek ister misiniz ? (e/h) : ");
            result = input.nextLine();
            if (result.equals("e")){
                System.out.println("Yeni gireceğiniz şifre hatalı girilen veya unutulan şifre ile aynı olamamalıdır.");
                System.out.print("Yeni Şifre : ");
                newPassword = input.nextLine();
                if (newPassword.equals("java123") || newPassword.equals(password)){
                    System.out.print("Şifre oluşturulamadı lütfen başka bir şifre giriniz.");
                } else {
                    System.out.print("Şifre oluşturuldu.");
                }
            } else if (result.equals("h")){
                System.out.print("Şifre yenileme iptal edildi.");
            } else {
                System.out.print("Geçerli bir seçim girmediniz.");
            }
        }

    }
}
