package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fnn implements defpackage.fnm {
    private final long a;
    private final long b;
    private final boolean c;
    private final defpackage.eqi d;

    public fnn(long j, long j2, boolean z, defpackage.eqi eqiVar) {
        boolean z2 = true;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L && j > j2) {
            z2 = false;
        }
        ahvr.bM(z2);
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = eqiVar;
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
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.fnn fnnVar = (defpackage.fnn) obj;
            if (this.a == fnnVar.a && this.b == fnnVar.b && this.c == fnnVar.c && j$.util.Objects.equals(this.d, fnnVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.eqi eqiVar = this.d;
        return ((((((anty.M(this.a) + 527) * 31) + anty.M(this.b)) * 31) + (this.c ? 1 : 0)) * 31) + (eqiVar != null ? eqiVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        long j = this.a;
        java.lang.Object objValueOf = j == -9223372036854775807L ? "UNSET" : java.lang.Long.valueOf(j);
        long j2 = this.b;
        java.lang.String string = objValueOf.toString();
        java.lang.String strBz = j2 == -9223372036854775807L ? "" : a.bz(j2, ", endTimeMs=");
        boolean z = this.c;
        defpackage.eqi eqiVar = this.d;
        java.lang.String strConcat = eqiVar == null ? "" : ", title=".concat(eqiVar.toString());
        return "Chapter: startTimeMs=" + string + strBz + (true == z ? ", hidden" : "") + strConcat;
    }

    @Override // defpackage.eqx
    public final /* synthetic */ void b(defpackage.eqv eqvVar) {
    }
}
