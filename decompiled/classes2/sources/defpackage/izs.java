package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class izs implements defpackage.izt {
    public final aomy a;
    public final aomy b;

    public izs(aomy aomyVar, aomy aomyVar2) {
        aooh.f(aomyVar, "onRestartClicked");
        aooh.f(aomyVar2, "onSaveClicked");
        this.a = aomyVar;
        this.b = aomyVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.izs) {
            defpackage.izs izsVar = (defpackage.izs) obj;
            if (aooh.n(this.a, izsVar.a) && aooh.n(this.b, izsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "Enabled(onRestartClicked=" + this.a + ", onSaveClicked=" + this.b + ')';
    }
}
