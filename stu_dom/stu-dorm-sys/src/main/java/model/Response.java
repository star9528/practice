package model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Response {
    private boolean success;
    private String code;
    private String massage;
    private Integer total;
    private Object data;
    private String stacktrace;
}
