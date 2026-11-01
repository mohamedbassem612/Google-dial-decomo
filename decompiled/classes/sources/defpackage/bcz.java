package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bcz extends defpackage.dca {
    private final defpackage.bdu a;

    public bcz(defpackage.bdu bduVar) {
        this.a = bduVar;
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new defpackage.bda(this.a);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        defpackage.bda bdaVar = (defpackage.bda) cmvVar;
        defpackage.bdu bduVar = bdaVar.a;
        defpackage.bdu bduVar2 = this.a;
        if (defpackage.aooh.n(bduVar, bduVar2) || !bdaVar.t.D) {
            return;
        }
        bdaVar.a.b();
        bduVar2.b = bdaVar;
        bdaVar.a = bduVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.bcz) && defpackage.aooh.n(this.a, ((defpackage.bcz) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.a + ')';
    }
}
