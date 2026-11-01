package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lbh {
    public final long a;
    public final kui b;
    public final long c;
    public final j$.util.Optional d;

    public lbh(long j, kui kuiVar, long j2, j$.util.Optional optional) {
        this.a = j;
        this.b = kuiVar;
        this.c = j2;
        this.d = optional;
    }

    public static defpackage.lbg a() {
        defpackage.lbg lbgVar = new defpackage.lbg();
        lbgVar.d(j$.util.Optional.empty());
        return lbgVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lbh) {
            defpackage.lbh lbhVar = (defpackage.lbh) obj;
            if (this.a == lbhVar.a && this.b.equals(lbhVar.b) && this.c == lbhVar.c && this.d.equals(lbhVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = ((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode();
        j$.util.Optional optional = this.d;
        long j2 = this.c;
        return (((iHashCode * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ optional.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.d;
        return "CallRecordingInfo{callCreationTimeMillis=" + this.a + ", callRecordingDetails=" + java.lang.String.valueOf(this.b) + ", lastModifiedTimestampMillis=" + this.c + ", callRecordingExtras=" + java.lang.String.valueOf(optional) + '}';
    }

    public lbh() {
        throw null;
    }
}
