package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fhq {
    public final long a;
    public final long b;

    public fhq(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.fhq) {
            defpackage.fhq fhqVar = (defpackage.fhq) obj;
            if (this.a == fhqVar.a && this.b == fhqVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
