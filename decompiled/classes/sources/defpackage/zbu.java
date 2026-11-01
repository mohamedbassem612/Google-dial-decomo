package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zbu implements defpackage.zbo {
    public final int a;
    public final defpackage.aenj b;
    public final defpackage.zar c;
    public final long d;
    public final long e;
    public final java.lang.String f;

    public zbu(int i, defpackage.aenj aenjVar, defpackage.zar zarVar, long j, long j2, java.lang.String str) {
        this.a = i;
        this.b = aenjVar;
        this.c = zarVar;
        this.d = j;
        this.e = j2;
        this.f = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zbu) {
            defpackage.zbu zbuVar = (defpackage.zbu) obj;
            if (this.a == zbuVar.a && defpackage.aooh.n(this.b, zbuVar.b) && this.c == zbuVar.c && this.d == zbuVar.d && this.e == zbuVar.e && defpackage.aooh.n(this.f, zbuVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        java.lang.String str = this.f;
        return (((((iHashCode * 31) + defpackage.anty.M(this.d)) * 31) + defpackage.anty.M(this.e)) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        return "CuiCompletionEvent(semanticEventId=" + this.a + ", cuiName=" + this.b + ", resultCode=" + this.c + ", startMillis=" + this.d + ", endMillis=" + this.e + ", uniqueCallId=" + this.f + ')';
    }
}
