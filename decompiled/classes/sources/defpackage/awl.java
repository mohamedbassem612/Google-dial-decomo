package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class awl extends defpackage.dca {
    private final defpackage.cmj a;

    public awl(defpackage.cmj cmjVar) {
        this.a = cmjVar;
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new defpackage.awm(this.a);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        ((defpackage.awm) cmvVar).a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        defpackage.awl awlVar = obj instanceof defpackage.awl ? (defpackage.awl) obj : null;
        return awlVar != null && defpackage.aooh.n(this.a, awlVar.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1237;
    }
}
