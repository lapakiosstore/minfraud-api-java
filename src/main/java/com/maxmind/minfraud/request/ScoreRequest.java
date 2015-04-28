package com.maxmind.minfraud.request;

public class ScoreRequest extends AbstractRequest {
    private ScoreRequest(ScoreRequest.Builder builder) {
        super(builder);
    }

    public static final class Builder extends AbstractRequest.Builder<ScoreRequest.Builder> {
        public Builder(Device device) {
            super(device);
        }

        public ScoreRequest build() {
            return new ScoreRequest(this);
        }
    }
}