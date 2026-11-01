package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mtm {
    public final abko a;
    public final java.lang.String b;
    public final aomy c;

    public mtm(abko abkoVar, java.lang.String str, aomy aomyVar) {
        this.a = abkoVar;
        this.b = str;
        this.c = aomyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.mtm) {
            defpackage.mtm mtmVar = (defpackage.mtm) obj;
            if (aooh.n(this.a, mtmVar.a) && aooh.n(this.b, mtmVar.b) && aooh.n(this.c, mtmVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.String str = this.b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "DobbyInCallContactGridData(monogram2UiData=" + this.a + ", displayName=" + this.b + ", getElapsedTimeMillis=" + this.c + ')';
    }
}
