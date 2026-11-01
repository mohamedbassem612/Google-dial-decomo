package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dkv {
    public final defpackage.dji a;
    public final defpackage.dkz b;
    public final java.util.List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final defpackage.dpf g;
    public final defpackage.dpq h;
    public final defpackage.dnx i;
    public final long j;
    public final defpackage.gat k;

    public dkv(defpackage.dji djiVar, defpackage.dkz dkzVar, java.util.List list, int i, boolean z, int i2, defpackage.dpf dpfVar, defpackage.dpq dpqVar, defpackage.gat gatVar, defpackage.dnx dnxVar, long j) {
        this.a = djiVar;
        this.b = dkzVar;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = dpfVar;
        this.h = dpqVar;
        this.k = gatVar;
        this.i = dnxVar;
        this.j = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dkv) {
            defpackage.dkv dkvVar = (defpackage.dkv) obj;
            if (defpackage.aooh.n(this.a, dkvVar.a) && defpackage.aooh.n(this.b, dkvVar.b) && defpackage.aooh.n(this.c, dkvVar.c) && this.d == dkvVar.d && this.e == dkvVar.e && this.f == dkvVar.f && defpackage.aooh.n(this.g, dkvVar.g) && this.h == dkvVar.h && defpackage.aooh.n(this.k, dkvVar.k) && defpackage.aooh.n(this.i, dkvVar.i) && this.j == dkvVar.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        boolean z = this.e;
        int iHashCode2 = (((((((((((((iHashCode * 31) + this.d) * 31) + (true != z ? 1237 : 1231)) * 31) + this.f) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.k.hashCode()) * 31) + this.i.hashCode();
        long j = this.j;
        return (iHashCode2 * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.f;
        if (i == 1) {
            str = "Clip";
        } else if (i == 2) {
            str = "Ellipsis";
        } else {
            str = i == 3 ? "Visible" : "Invalid";
        }
        boolean z = this.e;
        int i2 = this.d;
        java.util.List list = this.c;
        defpackage.dkz dkzVar = this.b;
        defpackage.dji djiVar = this.a;
        return "TextLayoutInput(text=" + ((java.lang.Object) djiVar) + ", style=" + dkzVar + ", placeholders=" + list + ", maxLines=" + i2 + ", softWrap=" + z + ", overflow=" + str + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.k + ", defaultLocaleList=" + this.i + ", constraints=" + defpackage.dpd.e(this.j) + ')';
    }
}
