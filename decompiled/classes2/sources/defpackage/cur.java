package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cur extends dca {
    private final cun a;
    private final cuq b;

    public cur(cun cunVar, cuq cuqVar) {
        this.a = cunVar;
        this.b = cuqVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new cuu(this.a, this.b);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        cuu cuuVar = (cuu) cmvVar;
        cuuVar.a = this.a;
        cuuVar.g();
        cuq cuqVar = this.b;
        if (cuqVar == null) {
            cuuVar.b = new cuq();
        } else if (!aooh.n(cuqVar, cuuVar.b)) {
            cuuVar.b = cuqVar;
        }
        if (((cmv) cuuVar).D) {
            cuuVar.h();
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.cur)) {
            return false;
        }
        defpackage.cur curVar = (defpackage.cur) obj;
        return aooh.n(curVar.a, this.a) && aooh.n(curVar.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        cuq cuqVar = this.b;
        return iHashCode + (cuqVar != null ? cuqVar.hashCode() : 0);
    }
}
