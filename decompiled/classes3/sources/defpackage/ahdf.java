package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahdf {
    public final boolean a;
    public final boolean b;
    public final long c;
    private final java.lang.String d;
    private final long e;
    private final int f;
    private final int g;

    public ahdf(java.lang.String str, boolean z, boolean z2, long j, long j2, int i, int i2) {
        this.d = str;
        this.a = z;
        this.b = z2;
        this.c = j;
        this.e = j2;
        this.f = i;
        this.g = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ahdf) {
            defpackage.ahdf ahdfVar = (defpackage.ahdf) obj;
            if (aooh.n(this.d, ahdfVar.d) && this.a == ahdfVar.a && this.b == ahdfVar.b && this.c == ahdfVar.c && this.e == ahdfVar.e && this.f == ahdfVar.f && this.g == ahdfVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.d;
        return ((((((((((((str == null ? 0 : str.hashCode()) * 31) + anty.L(this.a)) * 31) + anty.L(this.b)) * 31) + anty.M(this.c)) * 31) + anty.M(this.e)) * 31) + this.f) * 31) + this.g;
    }

    public final java.lang.String toString() {
        return "ReapRejectedEvent(processName=" + this.d + ", exceededScheduleDeviationTolerance=" + this.a + ", tooImportant=" + this.b + ", elapsedRealtimeSinceNewValuesMillis=" + this.c + ", scheduleDeviationMillis=" + this.e + ", importance=" + this.f + ", importanceReasonCode=" + this.g + ')';
    }
}
