/**
 * Serialization trong Java là cơ chế chuyển đổi trạng thái của một đối tượng (giá trị các thuộc tính 
 * trong object) thành một chuỗi byte sao cho chuỗi byte này có thể chuyển đổi ngược lại thành một đối tượng.
 * 
 * Quá trình chuyển đổi chuỗi byte thành đối tượng gọi là deserialization.
 */

/**
 * Tại sao cần Serialization?
 * 
 * Trong Java, khi trao đổi dữ liệu giữa các thành phần khác nhau (giữa các module cùng viết bằng Java)
 * thì dữ liệu được thể hiện dưới dạng byte chứ không phải là đối tượng. 
 * Do đó ta cần có một cơ chế để hiểu các đối tượng được gửi và nhận.
 * 
 * Quá trình serilization hoàn toàn độc lập với platform (không phụ thuộc vào hệ điều hành) 
 * nên việc chuyển đổi giữa byte và object giữa các module được đảm bảo.
 */

/**
 * Một số lưu ý về Serialization trong Java:
 * 
 * Nếu class cha implement Serializable thì các class con không cần thực hiện implement Serializable nữa
 * Các thuộc tính static và transient sẽ không được serialization
 * Hàm khởi tạo (constructor) sẽ không được gọi khi một đối tượng được deserialization
 * 
 * Khi thực hiện serialization một đối tượng thì tất cả các thuộc tính bên trong nó đều phải là serializable 
 * (áp dụng với các thuộc tính có kiểu đối tượng, ví dụ object Person có thuộc tính Address thì thuộc tính 
 * Address đó cũng phải implement Serializable nếu không sẽ bị lỗi java.io.NotSerializableException 
 * khi thực hiện serialization đối tượng person).
 */

/**
 * @author VanNam212
 *
 */
public class info {

}
