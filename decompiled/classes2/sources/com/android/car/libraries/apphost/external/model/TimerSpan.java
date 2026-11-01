package com.android.car.libraries.apphost.external.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class TimerSpan extends androidx.car.app.model.CarSpan {
    private static final long TWENTY_YEARS_IN_MS;
    private final long startTimeInMs;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        TWENTY_YEARS_IN_MS = 630720000000L;
    }

    private TimerSpan() {
        this.startTimeInMs = 0L;
    }

    public static com.android.car.libraries.apphost.external.model.TimerSpan create(long j) {
        if (j <= TWENTY_YEARS_IN_MS) {
            return new com.android.car.libraries.apphost.external.model.TimerSpan(j);
        }
        throw new java.lang.IllegalArgumentException("Start time is too far in the future. Please use elapsedRealtime");
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof com.android.car.libraries.apphost.external.model.TimerSpan) && this.startTimeInMs == ((com.android.car.libraries.apphost.external.model.TimerSpan) obj).startTimeInMs;
        }
        return true;
    }

    public long getStartTimeInMs() {
        return this.startTimeInMs;
    }

    public int hashCode() {
        return anty.M(this.startTimeInMs);
    }

    public java.lang.String toString() {
        return "[start time: " + this.startTimeInMs + ']';
    }

    private TimerSpan(long j) {
        this.startTimeInMs = j;
    }
}
