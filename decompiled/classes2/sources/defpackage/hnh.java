package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hnh {
    public final java.lang.String a;
    public final abwd b;

    public hnh(java.lang.String str, abwd abwdVar) {
        aooh.f(abwdVar, "photoInfo");
        this.a = str;
        this.b = abwdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.hnh) {
            defpackage.hnh hnhVar = (defpackage.hnh) obj;
            if (aooh.n(this.a, hnhVar.a) && aooh.n(this.b, hnhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "CarBackgroundCallData(displayName=" + this.a + ", photoInfo=" + this.b + ')';
    }
}
