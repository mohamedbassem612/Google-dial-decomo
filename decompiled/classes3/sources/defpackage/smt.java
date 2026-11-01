package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class smt implements ahth {
    public final defpackage.sjz a;

    public smt(defpackage.sjz sjzVar) {
        this.a = sjzVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.smt) && aooh.n(this.a, ((defpackage.smt) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        defpackage.sjz sjzVar = this.a;
        if (sjzVar == null) {
            return 0;
        }
        return sjzVar.hashCode();
    }

    public final java.lang.String toString() {
        return "FontStyleSelectedEvent(selectedFontStyle=" + this.a + ')';
    }
}
