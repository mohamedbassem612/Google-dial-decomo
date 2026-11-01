package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class DurationSpan extends androidx.car.app.model.CarSpan {
    private final long mDurationSeconds;

    private DurationSpan() {
        this.mDurationSeconds = 0L;
    }

    public static androidx.car.app.model.DurationSpan create(j$.time.Duration duration) {
        return new androidx.car.app.model.DurationSpan(((j$.time.Duration) j$.util.Objects.requireNonNull(duration)).getSeconds());
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof androidx.car.app.model.DurationSpan) && this.mDurationSeconds == ((androidx.car.app.model.DurationSpan) obj).mDurationSeconds;
        }
        return true;
    }

    public long getDurationSeconds() {
        return this.mDurationSeconds;
    }

    public int hashCode() {
        long j = this.mDurationSeconds;
        return (int) (j ^ (j >>> 32));
    }

    public java.lang.String toString() {
        return "[seconds: " + this.mDurationSeconds + ']';
    }

    public DurationSpan(long j) {
        this.mDurationSeconds = j;
    }

    public static androidx.car.app.model.DurationSpan create(long j) {
        return new androidx.car.app.model.DurationSpan(j);
    }
}
