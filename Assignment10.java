package assignment.day1.day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment10 {

    public static void readCSVFile(String csvFile, String errorFile) throws IOException {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(csvFile));
            writer = new BufferedWriter(new FileWriter(errorFile));

            String line;
            System.out.println(reader.readLine());
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length == 5) {
                    String stdNo = data[0].trim();
                    String stdName = data[1].trim();
                    String stdPhone = data[2].trim();
                    String stdEmail = data[3].trim();
                    String gradePoint = data[4].trim();

                    // Kiểm tra định dạng số điện thoại và email
                    if (!isValidPhone(stdPhone)) {
                        writer.write(data[0] + " - Loi sai dinh dang: " + stdPhone);
                        writer.newLine();
                    }
                    if (!isValidEmail(stdEmail)) {
                        writer.write(data[0] + " - Loi sai dinh dang: " + stdEmail);
                        writer.newLine();
                    }

                    // Hiển thị thông tin sinh viên
                    System.out.println("Mã số sinh viên: " + stdNo);
                    System.out.println("Họ và tên: " + stdName);
                    System.out.println("Số điện thoại: " + stdPhone);
                    System.out.println("Email: " + stdEmail);
                    System.out.println("Điểm trung bình: " + gradePoint);
                    System.out.println("------------------------------------");
                }
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
    }

    public static boolean isValidPhone(String phone) {
        // Kiểm tra định dạng số điện thoại
        // giả sử số điện thoại hợp lệ khi có 10 chữ số
        return phone.matches("\\d{10}");
    }

    public static boolean isValidEmail(String email) {
        // Kiểm tra định dạng email
        // regular expression đơn giản
        // return email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}");
        return email.matches("[A-Za-z0-9._%+-]+@gmail.com");
    }

    public static void main(String[] args) {
        String csvFile = "data/grades.csv";
        String errorFile = "data/error.txt";

        try {
            readCSVFile(csvFile, errorFile);
            System.out.println("Đọc file CSV thành công");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc file CSV: " + e.getMessage());
        }
    }
}
