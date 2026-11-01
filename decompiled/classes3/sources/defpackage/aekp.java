package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aekp {
    public final defpackage.aeko a;
    public final defpackage.aeks b;

    public aekp(defpackage.aeko aekoVar, defpackage.aeks aeksVar) {
        this.a = aekoVar;
        this.b = aeksVar;
    }

    public static defpackage.afmm a() {
        defpackage.afmm afmmVar = new defpackage.afmm();
        afmmVar.c(defpackage.aeks.a().a());
        return afmmVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aekp) {
            defpackage.aekp aekpVar = (defpackage.aekp) obj;
            if (this.a.equals(aekpVar.a) && this.b.equals(aekpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.aeks aeksVar = this.b;
        return "ExpressSignInSpec{onContinueWithAccountListenerWithAsyncCallback=" + java.lang.String.valueOf(this.a) + ", features=" + java.lang.String.valueOf(aeksVar) + '}';
    }

    public aekp() {
        throw null;
    }
}
