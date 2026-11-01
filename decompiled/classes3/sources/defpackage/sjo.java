package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sjo extends snl {
    public final defpackage.abxt a;

    public sjo(defpackage.abxt abxtVar) {
        aooh.f(abxtVar, "updatedPatrickData");
        this.a = abxtVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.sjo) && aooh.n(this.a, ((defpackage.sjo) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Success(updatedPatrickData=" + this.a + ')';
    }
}
