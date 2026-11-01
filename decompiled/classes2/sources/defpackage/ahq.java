package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ahq extends dca {
    private final ajl a;
    private final cmj b;
    private final aonn d = null;

    public ahq(ajl ajlVar, cmj cmjVar) {
        this.a = ajlVar;
        this.b = cmjVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.aht(this.a, this.b);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.aht ahtVar = (defpackage.aht) cmvVar;
        ahtVar.a = this.a;
        ahtVar.b = this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ahq) {
            defpackage.ahq ahqVar = (defpackage.ahq) obj;
            if (aooh.n(ahqVar.a, this.a)) {
                aonn aonnVar = ahqVar.d;
                if (aooh.n(ahqVar.b, this.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
    }
}
