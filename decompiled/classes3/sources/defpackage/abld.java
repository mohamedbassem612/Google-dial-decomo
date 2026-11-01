package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abld {
    public final java.lang.String a;
    public final aomy b;

    public abld(java.lang.String str, aomy aomyVar) {
        aooh.f(str, "text");
        this.a = str;
        this.b = aomyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abld) {
            defpackage.abld abldVar = (defpackage.abld) obj;
            if (aooh.n(this.a, abldVar.a) && aooh.n(this.b, abldVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "SecondaryAlertCardButton(text=" + this.a + ", onClick=" + this.b + ')';
    }
}
