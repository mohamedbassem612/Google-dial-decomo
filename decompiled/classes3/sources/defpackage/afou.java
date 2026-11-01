package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afou {
    public final defpackage.afot a;
    public final boolean b;
    public final java.util.List c;

    public afou(defpackage.afot afotVar, boolean z, java.util.List list) {
        aooh.f(list, "eventLogs");
        this.a = afotVar;
        this.b = z;
        this.c = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.afou) {
            defpackage.afou afouVar = (defpackage.afou) obj;
            if (aooh.n(this.a, afouVar.a) && this.b == afouVar.b && aooh.n(this.c, afouVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + anty.L(this.b)) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "GooglePhotosSection(content=" + this.a + ", hasMore=" + this.b + ", eventLogs=" + this.c + ')';
    }
}
