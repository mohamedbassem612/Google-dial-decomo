package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xtp {
    public final cmw a;
    public final defpackage.xff b;

    public xtp(defpackage.xff xffVar, cmw cmwVar) {
        aooh.f(cmwVar, "modifier");
        this.b = xffVar;
        this.a = cmwVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xtp) {
            defpackage.xtp xtpVar = (defpackage.xtp) obj;
            if (aooh.n(this.b, xtpVar.b) && aooh.n(this.a, xtpVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "SizeAndModifier(size=" + this.b + ", modifier=" + this.a + ')';
    }
}
