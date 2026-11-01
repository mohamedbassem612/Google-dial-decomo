package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abhh {
    public final java.lang.String a;
    public final aomy b;

    public abhh(java.lang.String str, aomy aomyVar) {
        aooh.f(str, "text");
        this.a = str;
        this.b = aomyVar;
    }

    public static /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        azj azjVar = (azj) obj;
        cav cavVar = (cav) obj2;
        int iIntValue = ((java.lang.Integer) obj3).intValue();
        aooh.f(azjVar, "$this$BannerHeader");
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != cavVar.B(azjVar) ? 2 : 4;
        }
        if (cavVar.H((iIntValue & 19) != 18, iIntValue & 1)) {
            throw null;
        }
        cavVar.s();
        return aojh.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abhh) {
            defpackage.abhh abhhVar = (defpackage.abhh) obj;
            if (aooh.n(this.a, abhhVar.a) && aooh.n(this.b, abhhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "BannerButtonData(text=" + this.a + ", onClick=" + this.b + ')';
    }
}
