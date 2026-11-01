package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class euw implements defpackage.eqx {
    public final long a;
    public final long b;
    public final long c;

    public euw(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // defpackage.eqx
    public final /* synthetic */ defpackage.eqg a() {
        return null;
    }

    @Override // defpackage.eqx
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.euw) {
            defpackage.euw euwVar = (defpackage.euw) obj;
            if (this.a == euwVar.a && this.b == euwVar.b && this.c == euwVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((anty.M(this.a) + 527) * 31) + anty.M(this.b)) * 31) + anty.M(this.c);
    }

    public final java.lang.String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }

    @Override // defpackage.eqx
    public final /* synthetic */ void b(defpackage.eqv eqvVar) {
    }
}
