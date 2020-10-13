package com.csse.csse_tms_back_end.exceptions;

public class JourneyIdExceptionResponse {

    private String journeyIdentifier;

    public JourneyIdExceptionResponse(String journeyIdentifier) {
        this.journeyIdentifier = journeyIdentifier;
    }

    public String getJourneyIdentifier() {
        return journeyIdentifier;
    }

    public void setJourneyIdentifier(String journeyIdentifier) {
        this.journeyIdentifier = journeyIdentifier;
    }
}
