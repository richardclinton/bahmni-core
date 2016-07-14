package org.bahmni.module.bahmnicore.contract.patient.search;

import org.apache.commons.lang.StringEscapeUtils;
import org.openmrs.Location;
import org.openmrs.module.bahmniemrapi.visitlocation.BahmniVisitLocationServiceImpl;

public class PatientVisitLocationQueryHelper {

    private Location visitLocation;

    public PatientVisitLocationQueryHelper(String loginLocationUuid) {

        BahmniVisitLocationServiceImpl bahmniVisitLocationService = new BahmniVisitLocationServiceImpl();
        this.visitLocation = bahmniVisitLocationService.getVisitLocationForLoginLocation1(loginLocationUuid);

    }


    public String appendWhereClause(String where) {
        if(visitLocation == null){
            return where;
        }
        String condition = " v.location_id=" + visitLocation.getLocationId();
        return String.format("%s %s %s", where, "and", condition);

    }
}
