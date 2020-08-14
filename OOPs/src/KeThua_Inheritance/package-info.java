/**
 * tính kế thừa
 */

/**
 * Kế thừa trong java là sự liên quan giữa hai class với nhau, trong đó có class cha (superclass) và 
 * class con (subclass). Khi kế thừa class con được hưởng tất cả các phương thức và 
 * thuộc tính của class cha. Tuy nhiên, nó chỉ được truy cập các thành viên public và 
 * protected của class cha. Nó không được phép truy cập đến thành viên private của class cha.
 */

/**
 * Tư tưởng của kế thừa trong java là có thể tạo ra một class mới được xây dựng trên các lớp 
 * đang tồn tại. Khi kế thừa từ một lớp đang tồn tại bạn có sử dụng lại các phương thức và 
 * thuộc tính của lớp cha, đồng thời có thể khai báo thêm các phương thức và thuộc tính khác.
 */

/**
 * Tại sao đa kế thừa không được support trong java?
 * Để giảm thiểu sự phức tạp và đơn giản hóa ngôn ngữ, đa kế thừa không được support trong java.
 * Hãy suy xét kịch bản sau: Có 3 lớp A, B, C. Trong đó lớp C kế thừa từ các lớp A và B. 
 * Nếu các lớp A và B có phương thức giống nhau và bạn gọi nó từ đối tượng của lớp con, 
 * như vậy khó có thể xác định được việc gọi phương thức của lớp A hay B.
 */

/**
 * @author VanNam212
 *
 */
package KeThua_Inheritance;