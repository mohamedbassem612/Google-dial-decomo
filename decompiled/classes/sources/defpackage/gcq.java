package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gcq {
    public final java.util.List a;
    public final java.lang.Integer b;
    public final defpackage.gbr c;
    private final int d;

    public gcq(java.util.List list, java.lang.Integer num, defpackage.gbr gbrVar, int i) {
        defpackage.aooh.f(list, "pages");
        this.a = list;
        this.b = num;
        this.c = gbrVar;
        this.d = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.gcq) {
            defpackage.gcq gcqVar = (defpackage.gcq) obj;
            if (defpackage.aooh.n(this.a, gcqVar.a) && defpackage.aooh.n(this.b, gcqVar.b) && defpackage.aooh.n(this.c, gcqVar.c) && this.d == gcqVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Integer num = this.b;
        return this.a.hashCode() + (num != null ? num.hashCode() : 0) + this.c.hashCode() + this.d;
    }

    public final java.lang.String toString() {
        return "PagingState(pages=" + this.a + ", anchorPosition=" + this.b + ", config=" + this.c + ", leadingPlaceholderCount=" + this.d + ')';
    }
}
