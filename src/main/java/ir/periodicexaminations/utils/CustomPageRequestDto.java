package ir.periodicexaminations.utils;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.domain.Sort;

@Data
@AllArgsConstructor
public class CustomPageable {

    private Integer pageSize;
    private Integer pageNumber;
    private String sortBy;
    private String sortDirection;


  /*  public pageableDTO(Integer pageSize, Integer pageNumber, Sort.Direction sortDirection, String sortBy) {
        if (pageSize == null) this.pageSize = 10;
        else this.pageSize = pageSize;

        if (pageNumber == null | pageNumber > 30) this.pageNumber = 0;
        else this.pageSize = pageSize;

        if (sortBy == null) this.sortBy = "empName";
        else this.sortBy = sortBy;

        if (sortDirection == null) this.sortDirection = Sort.Direction.fromString("ASC");
        else this.sortDirection = sortDirection;
    }
    */

}
