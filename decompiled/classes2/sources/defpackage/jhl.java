package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jhl {
    public final defpackage.jhq a;
    public final aomy b;

    public jhl(defpackage.jhq jhqVar, aomy aomyVar) {
        this.a = jhqVar;
        this.b = aomyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.jhl) {
            defpackage.jhl jhlVar = (defpackage.jhl) obj;
            if (aooh.n(this.a, jhlVar.a) && aooh.n(this.b, jhlVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "BeeslyInCallComposableUiModel(beeslyInCallUiModel=" + this.a + ", onAnswerCallClicked=" + this.b + ')';
    }
}
