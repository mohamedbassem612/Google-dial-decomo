package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abpr {
    public final java.lang.String a;
    public final aomy b;

    public abpr(java.lang.String str, aomy aomyVar) {
        this.a = str;
        this.b = aomyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abpr) {
            defpackage.abpr abprVar = (defpackage.abpr) obj;
            if (aooh.n(this.a, abprVar.a) && aooh.n(this.b, abprVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "Action(text=" + this.a + ", onClick=" + this.b + ')';
    }
}
