package ir.periodicexaminations.utils;

import ir.periodicexaminations.exceptions.SortByDirectionInvalidException;
import ir.periodicexaminations.exceptions.SortByIsInvalidException;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.lang.reflect.Field;
import java.util.*;


@Data
@AllArgsConstructor
public class CustomPageRequestDto<T> {
    //    @DefaultValue(1)
    @Min(value = 0, message = " sharmande")
    private Integer pageNumber;
    @Range(min = 1, max = 50, message = " Goh nakhor")
    private Integer pageSize;
    private HashMap<String, String> sort = new HashMap<>();
    private Long empId;

    public PageRequest getPageRequest(Class<T> clazz) throws Exception {
        ArrayList<Sort.Order> orders = new ArrayList<Sort.Order>();
        var classFieldNames = Arrays.stream(clazz.getDeclaredFields()).map(Field::getName).toArray();
        if (!new HashSet<>(Arrays.asList(classFieldNames)).containsAll(Arrays.asList(sort.keySet().toArray())))
            throw new SortByIsInvalidException();
        System.out.println(sort.values());
        if (!List.of("ASC", "DESC").containsAll(sort.values().stream().toList()))
            throw new SortByDirectionInvalidException();
        sort.forEach((key, value) -> {
            orders.add(new Sort.Order(Sort.Direction.fromString(value), key));
            System.out.println(value + "      " + key);
        });

        return PageRequest.of(pageNumber, pageSize, Sort.by(orders));
    }

    public void setSort(String key, String value) {
        HashMap<String, String> sort = new HashMap<>();
        sort.put(key, value);
        this.sort = sort;
    }
}

