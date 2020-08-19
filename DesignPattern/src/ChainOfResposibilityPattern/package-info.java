/**
 * Khắc phục việc ghép cặp giữa bộ gởi và bộ nhận thông điệp
 * 
 * Các đối tượng nhận thông điệp được kết nối thành một chuỗi và thông điệp được chuyển dọc theo 
 * chuỗi nầy đến khi gặp được đối tượng xử lý nó
 * 
 * Tránh việc gắn kết cứng giữa phần tử gởi request với phần tử nhận và xử lý request 
 * bằng cách cho phép hơn 1 đối tượng có có cơ hội xử lý request
 * 
 * Liên kết các đối tượng nhận request thành 1 dây chuyền rồi “pass” request xuyên qua từng 
 * đối tượng xử lý đến khi gặp đối tượng xử lý cụ thể
 * 
 * Yêu cầu: Request từ user khi input số tiền <= số tiền có trong tài khoản ==> ATM sẽ trả ra số tiền 
 * là bội số : 50K, 20K, 10K. ( nếu ko thể là bội số của 10K ==> error )
 */

/**
 * @author VanNam212
 *
 */
package ChainOfResposibilityPattern;