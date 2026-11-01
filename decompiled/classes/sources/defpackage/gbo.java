package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gbo implements defpackage.gcr {
    public static final defpackage.gbo a;
    public int b;
    public int c;
    public int d;
    private final java.util.List e;

    static {
        java.util.List listAY = defpackage.ajsz.aY(new defpackage.gdo(0, defpackage.aokc.a));
        defpackage.fzz fzzVar = defpackage.fzz.b;
        defpackage.fzz fzzVar2 = defpackage.fzz.a;
        a = new defpackage.gbo(defpackage.dzn.m(listAY, 0, 0, new defpackage.gab(fzzVar, fzzVar2, fzzVar2)));
    }

    public gbo(java.util.List list, int i, int i2) {
        if (list == null) {
            defpackage.aooh.i("pages");
        }
        if (list == null) {
            defpackage.aooh.i("<this>");
        }
        this.e = new java.util.ArrayList(list);
        this.b = k(list);
        this.c = i;
        this.d = i2;
    }

    private static final int k(java.util.List list) {
        java.util.Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((defpackage.gdo) it.next()).b.size();
        }
        return size;
    }

    @Override // defpackage.gcr
    public final int a() {
        return this.b;
    }

    public final int b() {
        java.lang.Integer numValueOf;
        java.util.List list = this.e;
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        int[] iArr = ((defpackage.gdo) list.get(0)).a;
        if (iArr == null) {
            defpackage.aooh.i("<this>");
        }
        int length = iArr.length;
        if (length == 0) {
            numValueOf = null;
        } else {
            int i = iArr[0];
            if (iArr == null) {
                defpackage.aooh.i("<this>");
            }
            int i2 = length - 1;
            if (i2 > 0) {
                int i3 = 1;
                while (true) {
                    int i4 = iArr[i3];
                    if (i > i4) {
                        i = i4;
                    }
                    if (i3 == i2) {
                        break;
                    }
                    i3++;
                }
            }
            numValueOf = java.lang.Integer.valueOf(i);
        }
        if (numValueOf == null) {
            defpackage.aooh.g();
        }
        return numValueOf.intValue();
    }

    public final int c() {
        java.lang.Integer numValueOf;
        java.util.List list = this.e;
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        int[] iArr = ((defpackage.gdo) list.get(list.size() - 1)).a;
        if (iArr == null) {
            defpackage.aooh.i("<this>");
        }
        int length = iArr.length;
        if (length == 0) {
            numValueOf = null;
        } else {
            int i = iArr[0];
            if (iArr == null) {
                defpackage.aooh.i("<this>");
            }
            int i2 = length - 1;
            if (i2 > 0) {
                int i3 = 1;
                while (true) {
                    int i4 = iArr[i3];
                    if (i < i4) {
                        i = i4;
                    }
                    if (i3 == i2) {
                        break;
                    }
                    i3++;
                }
            }
            numValueOf = java.lang.Integer.valueOf(i);
        }
        if (numValueOf == null) {
            defpackage.aooh.g();
        }
        return numValueOf.intValue();
    }

    @Override // defpackage.gcr
    public final int d() {
        return this.c;
    }

    @Override // defpackage.gcr
    public final int e() {
        return this.c + this.b + this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof defpackage.gbo)) {
            return false;
        }
        defpackage.gbo gboVar = (defpackage.gbo) obj;
        return b() == gboVar.b() && c() == gboVar.c() && this.c == gboVar.c && this.d == gboVar.d && defpackage.aooh.n(this.e, gboVar.e);
    }

    public final defpackage.fzt f() {
        int i = this.c;
        int i2 = this.d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.e.iterator();
        while (it.hasNext()) {
            defpackage.ajsz.bv(arrayList, ((defpackage.gdo) it.next()).b);
        }
        return new defpackage.fzt(i, i2, arrayList);
    }

    public final defpackage.gdq g(int i) {
        java.util.List list;
        int iIntValue = i - this.c;
        int i2 = 0;
        while (true) {
            list = this.e;
            if (iIntValue < ((defpackage.gdo) list.get(i2)).b.size() || i2 >= defpackage.ajsz.aZ(list)) {
                break;
            }
            iIntValue -= ((defpackage.gdo) list.get(i2)).b.size();
            i2++;
        }
        defpackage.gdo gdoVar = (defpackage.gdo) list.get(i2);
        int i3 = i - this.c;
        int iE = (e() - i) - this.d;
        int iB = b();
        int iC = c();
        int i4 = gdoVar.c;
        java.util.List list2 = gdoVar.d;
        if (list2 != null && defpackage.ajsz.bf(list2).e(iIntValue)) {
            iIntValue = ((java.lang.Number) list2.get(iIntValue)).intValue();
        }
        return new defpackage.gdq(i4, iIntValue, i3, iE - 1, iB, iC);
    }

    public final java.lang.Object h(int i) {
        if (i >= 0 && i < e()) {
            int i2 = i - this.c;
            if (i2 < 0 || i2 >= this.b) {
                return null;
            }
            return i(i2);
        }
        throw new java.lang.IndexOutOfBoundsException("Index: " + i + ", Size: " + e());
    }

    public final int hashCode() {
        int iB = b() * 31;
        int iC = c() * 31;
        int i = this.c * 31;
        return iB + iC + i + (this.d * 31) + (this.e.hashCode() * 31);
    }

    @Override // defpackage.gcr
    public final java.lang.Object i(int i) {
        java.util.List list = this.e;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((defpackage.gdo) list.get(i2)).b.size();
            if (size2 > i) {
                break;
            }
            i2++;
            i -= size2;
        }
        return ((defpackage.gdo) list.get(i2)).b.get(i);
    }

    public final defpackage.dzn j(defpackage.dzn dznVar) {
        defpackage.aooh.f(dznVar, "pageEvent");
        if (!(dznVar instanceof defpackage.gag)) {
            if (!(dznVar instanceof defpackage.gae)) {
                throw new java.lang.IllegalStateException("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
            }
            defpackage.gae gaeVar = (defpackage.gae) dznVar;
            defpackage.aopq aopqVar = new defpackage.aopq(gaeVar.b, gaeVar.c);
            java.util.Iterator it = this.e.iterator();
            int size = 0;
            while (it.hasNext()) {
                defpackage.gdo gdoVar = (defpackage.gdo) it.next();
                for (int i : gdoVar.a) {
                    if (aopqVar.e(i)) {
                        size += gdoVar.b.size();
                        it.remove();
                        break;
                    }
                }
            }
            int i2 = this.b - size;
            this.b = i2;
            if (gaeVar.a == defpackage.gac.b) {
                int i3 = this.c;
                int i4 = gaeVar.d;
                this.c = i4;
                return new gby(size, i4, i3);
            }
            int i5 = this.d;
            int i6 = gaeVar.d;
            this.d = i6;
            return new gbx(this.c + i2, size, i6, i5);
        }
        defpackage.gag gagVar = (defpackage.gag) dznVar;
        java.util.List list = gagVar.b;
        int iK = k(list);
        int iOrdinal = gagVar.a.ordinal();
        if (iOrdinal == 0) {
            throw new java.lang.IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
        }
        if (iOrdinal == 1) {
            int i7 = this.c;
            this.e.addAll(0, list);
            this.b += iK;
            this.c = gagVar.c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                defpackage.ajsz.bv(arrayList, ((defpackage.gdo) it2.next()).b);
            }
            return new gbz(arrayList, this.c, i7);
        }
        if (iOrdinal != 2) {
            throw new defpackage.aois();
        }
        int i8 = this.d;
        int i9 = this.b;
        java.util.List list2 = this.e;
        list2.addAll(list2.size(), list);
        this.b += iK;
        this.d = gagVar.d;
        int i10 = this.c + i9;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            defpackage.ajsz.bv(arrayList2, ((defpackage.gdo) it3.next()).b);
        }
        return new gbw(i10, arrayList2, this.d, i8);
    }

    public final java.lang.String toString() throws java.io.IOException {
        int i = this.b;
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(i(i2));
        }
        java.lang.String strCr = defpackage.ajsz.cr(arrayList, null, null, null, null, 63);
        return "[(" + this.c + " placeholders), " + strCr + ", (" + this.d + " placeholders)]";
    }

    public gbo(defpackage.gag gagVar) {
        this(gagVar.b, gagVar.c, gagVar.d);
    }
}
