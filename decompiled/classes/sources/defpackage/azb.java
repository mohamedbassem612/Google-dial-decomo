package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class azb extends defpackage.dca {
    private final defpackage.ayy a;

    public azb(defpackage.ayy ayyVar) {
        this.a = ayyVar;
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new defpackage.aze(this.a);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        ((defpackage.aze) cmvVar).a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.azb azbVar = obj instanceof defpackage.azb ? (defpackage.azb) obj : null;
        if (azbVar == null) {
            return false;
        }
        return defpackage.aooh.n(this.a, azbVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
