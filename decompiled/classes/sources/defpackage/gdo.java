package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gdo {
    public final int[] a;
    public final java.util.List b;
    public final int c;
    public final java.util.List d;

    public gdo(int[] iArr, java.util.List list, int i, java.util.List list2) {
        if (iArr == null) {
            defpackage.aooh.i("originalPageOffsets");
        }
        if (list == null) {
            defpackage.aooh.i("data");
        }
        this.a = iArr;
        this.b = list;
        this.c = i;
        this.d = list2;
        if (iArr.length == 0) {
            throw new java.lang.IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage");
        }
        if (list2 == null || list2.size() == list.size()) {
            return;
        }
        if (list2 == null) {
            defpackage.aooh.g();
        }
        throw new java.lang.IllegalArgumentException("If originalIndices (size = " + list2.size() + ") is provided, it must be same length as data (size = " + list.size() + ')');
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.gdo gdoVar = (defpackage.gdo) obj;
            if (java.util.Arrays.equals(this.a, gdoVar.a) && defpackage.aooh.n(this.b, gdoVar.b) && this.c == gdoVar.c && defpackage.aooh.n(this.d, gdoVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (java.util.Arrays.hashCode(this.a) * 31) + this.b.hashCode();
        java.util.List list = this.d;
        return (((iHashCode * 31) + this.c) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "TransformablePage(originalPageOffsets=" + java.util.Arrays.toString(this.a) + ", data=" + this.b + ", hintOriginalPageOffset=" + this.c + ", hintOriginalIndices=" + this.d + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gdo(int i, java.util.List list) {
        this(new int[]{i}, list, i, null);
        if (list == null) {
            defpackage.aooh.i("data");
        }
    }
}
