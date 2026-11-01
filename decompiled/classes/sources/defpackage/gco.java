package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gco extends defpackage.gfz implements java.lang.Iterable, defpackage.aoow {
    public final java.util.List a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final int d;
    public final int e;

    static {
        new defpackage.gco(defpackage.aokc.a, null, null, 0, 0);
    }

    public gco(java.util.List list, java.lang.Object obj, java.lang.Object obj2, int i, int i2) {
        if (list == null) {
            defpackage.aooh.i("data");
        }
        this.a = list;
        this.b = obj;
        this.c = obj2;
        this.d = i;
        this.e = i2;
        if (i != Integer.MIN_VALUE && i < 0) {
            throw new java.lang.IllegalArgumentException("itemsBefore cannot be negative");
        }
        if (i2 != Integer.MIN_VALUE && i2 < 0) {
            throw new java.lang.IllegalArgumentException("itemsAfter cannot be negative");
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gco) {
            defpackage.gco gcoVar = (defpackage.gco) obj;
            if (defpackage.aooh.n(this.a, gcoVar.a) && defpackage.aooh.n(this.b, gcoVar.b) && defpackage.aooh.n(this.c, gcoVar.c) && this.d == gcoVar.d && this.e == gcoVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.Object obj = this.b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        java.lang.Object obj2 = this.c;
        return ((((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.d) * 31) + this.e;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.a.listIterator();
    }

    public final java.lang.String toString() {
        java.util.List list = this.a;
        return defpackage.aoov.n("LoadResult.Page(\n                    |   data size: " + list.size() + "\n                    |   first Item: " + defpackage.ajsz.bG(list) + "\n                    |   last Item: " + defpackage.ajsz.bJ(list) + "\n                    |   nextKey: " + this.c + "\n                    |   prevKey: " + this.b + "\n                    |   itemsBefore: " + this.d + "\n                    |   itemsAfter: " + this.e + "\n                    |) ");
    }
}
