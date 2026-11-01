package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pof {
    public final defpackage.abwd a;

    public /* synthetic */ pof(defpackage.abwd abwdVar, int i) {
        this(i != 0 ? defpackage.abxl.F(defpackage.abwd.a.m()).ad() : abwdVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.pof) && aooh.n(this.a, ((defpackage.pof) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Avatar(photoInfo=" + this.a + ')';
    }

    public pof(defpackage.abwd abwdVar) {
        aooh.f(abwdVar, "photoInfo");
        this.a = abwdVar;
    }

    public pof() {
        this(null, 1);
    }
}
