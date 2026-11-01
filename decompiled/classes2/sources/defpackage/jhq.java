package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jhq {
    public final java.lang.String a;
    public final java.lang.String b;
    public final abko c;
    public final aomy d;
    public final defpackage.aboq e;

    public jhq(java.lang.String str, java.lang.String str2, abko abkoVar, aomy aomyVar, defpackage.aboq aboqVar) {
        aooh.f(str, "callId");
        this.a = str;
        this.b = str2;
        this.c = abkoVar;
        this.d = aomyVar;
        this.e = aboqVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.jhq) {
            defpackage.jhq jhqVar = (defpackage.jhq) obj;
            if (aooh.n(this.a, jhqVar.a) && aooh.n(this.b, jhqVar.b) && aooh.n(this.c, jhqVar.c) && aooh.n(this.d, jhqVar.d) && aooh.n(this.e, jhqVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.String str = this.b;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final java.lang.String toString() {
        return "BeeslyInCallUiModel(callId=" + this.a + ", displayName=" + this.b + ", monogram2UiData=" + this.c + ", getElapsedTimeMillis=" + this.d + ", messageList=" + this.e + ')';
    }
}
