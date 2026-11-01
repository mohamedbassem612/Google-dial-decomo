package androidx.car.app.hardware.common;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class CarValue {
    public static final int STATUS_SUCCESS = 1;
    public static final int STATUS_UNAVAILABLE = 3;
    public static final int STATUS_UNIMPLEMENTED = 2;
    public static final int STATUS_UNKNOWN = 0;
    private final java.util.List mCarZones;
    private final int mStatus;
    private final long mTimestampMillis;
    private final java.lang.Object mValue;
    public static final androidx.car.app.hardware.common.CarValue UNIMPLEMENTED_INTEGER = unimplemented();
    public static final androidx.car.app.hardware.common.CarValue UNKNOWN_INTEGER = unknown();
    public static final androidx.car.app.hardware.common.CarValue UNKNOWN_BOOLEAN = unknown();
    public static final androidx.car.app.hardware.common.CarValue UNKNOWN_FLOAT = unknown();
    public static final androidx.car.app.hardware.common.CarValue UNKNOWN_STRING = unknown();
    public static final androidx.car.app.hardware.common.CarValue UNIMPLEMENTED_FLOAT_LIST = unimplemented();
    public static final androidx.car.app.hardware.common.CarValue UNKNOWN_FLOAT_LIST = unknown();
    public static final androidx.car.app.hardware.common.CarValue UNKNOWN_INTEGER_LIST = unknown();
    public static final androidx.car.app.hardware.common.CarValue UNKNOWN_INTEGER_ARRAY = unknown();

    private CarValue() {
        this.mValue = null;
        this.mTimestampMillis = 0L;
        this.mStatus = 0;
        this.mCarZones = java.util.Collections.EMPTY_LIST;
    }

    private static androidx.car.app.hardware.common.CarValue unimplemented() {
        return new androidx.car.app.hardware.common.CarValue(null, 0L, 2);
    }

    private static androidx.car.app.hardware.common.CarValue unknown() {
        return new androidx.car.app.hardware.common.CarValue(null, 0L, 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.hardware.common.CarValue) {
            androidx.car.app.hardware.common.CarValue carValue = (androidx.car.app.hardware.common.CarValue) obj;
            if (j$.util.Objects.equals(this.mValue, carValue.mValue) && this.mTimestampMillis == carValue.mTimestampMillis && this.mStatus == carValue.mStatus && j$.util.Objects.equals(this.mCarZones, carValue.mCarZones)) {
                return true;
            }
        }
        return false;
    }

    public java.util.List getCarZones() {
        return this.mStatus == 2 ? java.util.Collections.EMPTY_LIST : this.mCarZones;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public long getTimestampMillis() {
        return this.mTimestampMillis;
    }

    public java.lang.Object getValue() {
        return this.mValue;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mValue, java.lang.Long.valueOf(this.mTimestampMillis), java.lang.Integer.valueOf(this.mStatus), this.mCarZones});
    }

    public java.lang.String toString() {
        return "[value: " + this.mValue + ", timestamp: " + this.mTimestampMillis + ", Status: " + this.mStatus + ", CarZones: " + this.mCarZones + ']';
    }

    public CarValue(java.lang.Object obj, long j, int i, java.util.List list) {
        this.mValue = obj;
        this.mTimestampMillis = j;
        this.mStatus = i;
        this.mCarZones = list;
    }

    public CarValue(java.lang.Object obj, long j, int i) {
        this.mValue = obj;
        this.mTimestampMillis = j;
        this.mStatus = i;
        this.mCarZones = java.util.Collections.singletonList(androidx.car.app.hardware.common.CarZone.CAR_ZONE_GLOBAL);
    }
}
