package demo.entity;

import lombok.Data;

import java.util.List;

@Data
public class VO<T> {

    private int code;
    private String msg;
    private int count;
    private List<T> data;

    public VO(int code, String msg, int count, List<T> data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public VO() {
    }
}
