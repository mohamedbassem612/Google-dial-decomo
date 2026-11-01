package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abbd extends aazc {
    public final int a;
    public final boolean b;
    private final java.lang.String c;
    private final java.lang.String d;
    private final java.util.Map e;

    public abbd(java.lang.String str, java.lang.String str2, java.util.Map map, int i, boolean z) {
        this.c = str;
        this.d = str2;
        this.e = map;
        this.a = i;
        this.b = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abbd) {
            defpackage.abbd abbdVar = (defpackage.abbd) obj;
            if (aooh.n(this.c, abbdVar.c) && aooh.n(this.d, abbdVar.d) && aooh.n(this.e, abbdVar.e) && this.a == abbdVar.a && this.b == abbdVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() * 31) + this.d.hashCode();
        java.util.Map map = this.e;
        return (((((iHashCode * 31) + (map == null ? 0 : map.hashCode())) * 31) + this.a) * 31) + anty.L(this.b);
    }
}
