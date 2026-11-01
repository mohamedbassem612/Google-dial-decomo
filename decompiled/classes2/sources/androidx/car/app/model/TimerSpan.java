package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class TimerSpan extends androidx.car.app.model.CarSpan {
    private static final long TWENTY_YEARS_IN_MS;
    private final long mElapsedRealtimeMillis;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        TWENTY_YEARS_IN_MS = 630720000000L;
    }

    private TimerSpan() {
        this.mElapsedRealtimeMillis = 0L;
    }

    public static androidx.car.app.model.TimerSpan create(long j) {
        long j2 = TWENTY_YEARS_IN_MS;
        if (j <= j2) {
            return new androidx.car.app.model.TimerSpan(j);
        }
        throw new java.lang.IllegalArgumentException("The given start time [" + j + "] cannot be larger than " + j2);
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof androidx.car.app.model.TimerSpan) && this.mElapsedRealtimeMillis == ((androidx.car.app.model.TimerSpan) obj).mElapsedRealtimeMillis;
        }
        return true;
    }

    public long getElapsedRealtimeMillis() {
        return this.mElapsedRealtimeMillis;
    }

    public int hashCode() {
        return anty.M(this.mElapsedRealtimeMillis);
    }

    public java.lang.String toString() {
        return "[start: " + this.mElapsedRealtimeMillis + ']';
    }

    private TimerSpan(long j) {
        this.mElapsedRealtimeMillis = j;
    }
}
