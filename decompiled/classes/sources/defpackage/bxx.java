package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bxx extends defpackage.dca {
    private final defpackage.aonj a;

    public bxx(defpackage.aonj aonjVar) {
        this.a = aonjVar;
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new defpackage.bxw(this.a);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        defpackage.bxw bxwVar = (defpackage.bxw) cmvVar;
        bxwVar.a = this.a;
        defpackage.den.s(bxwVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.bxx) && this.a == ((defpackage.bxx) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
