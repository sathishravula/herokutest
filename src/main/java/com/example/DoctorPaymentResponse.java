package com.example;


import java.util.List;

/**
 * Created by ehc on 27/5/16.
 */
public class DoctorPaymentResponse {
    private List<Object[]> data;
    private int draw;
    private Long recordsTotal;
    private Long recordsFiltered;
    private Long extra=5l;
    private Long extra1=5l;
    private String extra2="hai";

    public Long getExtra1() {
        return extra1;
    }

    public void setExtra1(Long extra1) {
        this.extra1 = extra1;
    }

    public String getExtra2() {
        return extra2;
    }

    public void setExtra2(String extra2) {
        this.extra2 = extra2;
    }

    public Long getExtra() {
        return extra;
    }

    public void setExtra(Long extra) {
        this.extra = extra;
    }

    public List<Object[]> getData() {
        return data;
    }

    public void setData(List<Object[]> data) {
        this.data = data;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public Long getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(Long recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public Long getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(Long recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    @Override
    public String toString() {
        return "DoctorPaymentResponse{" +
                "data=" + data +
                ", draw=" + draw +
                ", recordsTotal=" + recordsTotal +
                ", recordsFiltered=" + recordsFiltered +
                ", extra=" + extra +
                ", extra1=" + extra1 +
                ", extra2='" + extra2 + '\'' +
                '}';
    }
}
