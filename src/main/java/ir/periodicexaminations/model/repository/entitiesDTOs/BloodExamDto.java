package ir.periodicexaminations.model.repository.entitiesDTOs;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

import java.util.Date;

@Data
public class BloodExamDto {

    private Long DexamId;
    private Date dateExamination;
    private int  rbc;
    private int  wbc;
    private int  hemoglobin;
    private int  platelets;
    private int  fbs;
}
