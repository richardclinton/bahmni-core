package org.bahmni.module.bahmnicore.model;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class BahmniLabResult {

    private String encounterUuid;
    private String accessionNumber;
    private String patientUuid;
    private String testUuid;
    private String result;
    private String comments;
    private List<String> notes = new ArrayList<>();
    private String panelUuid;

    public BahmniLabResult() {
    }

    public BahmniLabResult(String encounterUuid, String accessionNumber, String patientUuid, String testUuid, String panelUuid, String result, String comments, List<String> notes) {
        this.encounterUuid = encounterUuid;
        this.accessionNumber = accessionNumber;
        this.patientUuid = patientUuid;
        this.testUuid = testUuid;
        this.panelUuid = panelUuid;
        this.result = result;
        this.comments = comments;
        this.notes = notes;
    }

    public boolean isValid() {
        return !(StringUtils.isEmpty(encounterUuid) || StringUtils.isEmpty(testUuid));
    }

    public String getEncounterUuid() {
        return encounterUuid;
    }

    public void setEncounterUuid(String encounterUuid) {
        this.encounterUuid = encounterUuid;
    }

    public String getAccessionNumber() {
        return accessionNumber;
    }

    public void setAccessionNumber(String accessionNumber) {
        this.accessionNumber = accessionNumber;
    }

    public String getPatientUuid() {
        return patientUuid;
    }

    public void setPatientUuid(String patientUuid) {
        this.patientUuid = patientUuid;
    }

    public String getTestUuid() {
        return testUuid;
    }

    public void setTestUuid(String testUuid) {
        this.testUuid = testUuid;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public void setPanelUuid(String panelUuid) {
        this.panelUuid = panelUuid;
    }

    public String getPanelUuid() {
        return panelUuid;
    }
}
