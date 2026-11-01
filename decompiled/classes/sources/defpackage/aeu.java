package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeu extends defpackage.dca {
    private final defpackage.cer a;
    private final defpackage.aex b;
    private final ett d;

    public aeu(ett ettVar, defpackage.cer cerVar, defpackage.aex aexVar) {
        this.d = ettVar;
        this.a = cerVar;
        this.b = aexVar;
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new defpackage.aew(this.d, this.a, this.b);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        defpackage.aew aewVar = (defpackage.aew) cmvVar;
        aewVar.g = this.d;
        aewVar.a = this.a;
        aewVar.b = this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.aeu) {
            defpackage.aeu aeuVar = (defpackage.aeu) obj;
            if (defpackage.aooh.n(aeuVar.d, this.d) && defpackage.aooh.n(aeuVar.a, this.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        ett ettVar = this.d;
        return ((iHashCode + (ettVar != null ? ettVar.hashCode() : 0)) * 31) + this.a.hashCode();
    }
}
