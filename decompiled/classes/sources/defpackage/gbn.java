package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gbn {
    public final defpackage.gbr a;
    public final java.util.List b;
    public final java.util.List c;
    public final java.util.Map d;
    public int e;
    public int f;
    public int g;
    public final defpackage.aowi h;
    public final defpackage.aowi i;
    public final java.util.Map j;
    public final defpackage.ajni k;
    private int l;
    private int m;

    public gbn(defpackage.gbr gbrVar) {
        this.a = gbrVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.b = arrayList;
        this.c = arrayList;
        this.d = new java.util.LinkedHashMap();
        this.h = defpackage.aooh.H(-1, 0, null, 6);
        this.i = defpackage.aooh.H(-1, 0, null, 6);
        this.j = new java.util.LinkedHashMap();
        defpackage.ajni ajniVar = new defpackage.ajni(null, null, null);
        ajniVar.i(defpackage.gac.a, defpackage.fzy.a);
        this.k = ajniVar;
    }

    public final int a() {
        if (this.a.c) {
            return this.m;
        }
        return 0;
    }

    public final int b() {
        if (this.a.c) {
            return this.l;
        }
        return 0;
    }

    public final int c() {
        java.util.Iterator it = this.c.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((defpackage.gco) it.next()).a.size();
        }
        return size;
    }

    public final defpackage.gcq d(defpackage.gdq gdqVar) {
        java.lang.Integer numValueOf;
        int i;
        int size;
        java.util.List list = this.c;
        java.util.List listBZ = defpackage.ajsz.bZ(list);
        if (gdqVar != null) {
            int iB = b();
            int i2 = -this.e;
            int iAZ = defpackage.ajsz.aZ(list) - this.e;
            int i3 = i2;
            while (true) {
                i = gdqVar.a;
                if (i3 >= i) {
                    break;
                }
                iB += i3 > iAZ ? this.a.a : ((defpackage.gco) list.get(this.e + i3)).a.size();
                i3++;
            }
            int i4 = gdqVar.d;
            if (i4 < 0) {
                size = (((defpackage.gco) list.get(this.e + i)).a.size() - 1) + java.lang.Math.abs(i4);
            } else {
                int i5 = gdqVar.c;
                size = i5 < 0 ? i5 : gdqVar.b;
            }
            int i6 = iB + size;
            if (i < i2) {
                i6 -= this.a.a;
            }
            numValueOf = java.lang.Integer.valueOf(i6);
        } else {
            numValueOf = null;
        }
        return new defpackage.gcq(listBZ, numValueOf, this.a, b());
    }

    public final void e(int i) {
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this.m = i;
    }

    public final void f(int i) {
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this.l = i;
    }

    public final boolean g(int i, defpackage.gac gacVar, defpackage.gco gcoVar, java.lang.Object obj) {
        if (gacVar == null) {
            defpackage.aooh.i("loadType");
        }
        if (gcoVar == null) {
            defpackage.aooh.i("page");
        }
        int iOrdinal = gacVar.ordinal();
        if (iOrdinal == 0) {
            if (!this.c.isEmpty()) {
                throw new java.lang.IllegalStateException("cannot receive multiple init calls");
            }
            if (i != 0) {
                throw new java.lang.IllegalStateException("init loadId must be the initial value, 0");
            }
            this.b.add(gcoVar);
            this.d.put(java.lang.Integer.valueOf(gcoVar.hashCode()), obj);
            this.e = 0;
            e(gcoVar.e);
            f(gcoVar.d);
            return true;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new defpackage.aois();
            }
            if (this.c.isEmpty()) {
                throw new java.lang.IllegalStateException("should've received an init before append");
            }
            if (i == this.g) {
                this.b.add(gcoVar);
                this.d.put(java.lang.Integer.valueOf(gcoVar.hashCode()), obj);
                int iA = gcoVar.e;
                e((iA != Integer.MIN_VALUE || (iA = a() - gcoVar.a.size()) >= 0) ? iA : 0);
                this.j.remove(defpackage.gac.c);
                return true;
            }
        } else {
            if (this.c.isEmpty()) {
                throw new java.lang.IllegalStateException("should've received an init before prepend");
            }
            if (i == this.f) {
                this.b.add(0, gcoVar);
                this.d.put(java.lang.Integer.valueOf(gcoVar.hashCode()), obj);
                this.e++;
                int iB = gcoVar.d;
                f((iB != Integer.MIN_VALUE || (iB = b() - gcoVar.a.size()) >= 0) ? iB : 0);
                this.j.remove(defpackage.gac.b);
                return true;
            }
        }
        return false;
    }

    public final defpackage.dzn h(defpackage.gco gcoVar, defpackage.gac gacVar) {
        int size;
        if (gcoVar == null) {
            defpackage.aooh.i("<this>");
        }
        if (gacVar == null) {
            defpackage.aooh.i("loadType");
        }
        int iOrdinal = gacVar.ordinal();
        if (iOrdinal == 0) {
            size = 0;
        } else if (iOrdinal == 1) {
            size = -this.e;
        } else {
            if (iOrdinal != 2) {
                throw new defpackage.aois();
            }
            size = (this.c.size() - this.e) - 1;
        }
        java.util.List listSingletonList = java.util.Collections.singletonList(new defpackage.gdo(size, gcoVar.a));
        defpackage.aooh.e(listSingletonList, "singletonList(...)");
        int iOrdinal2 = gacVar.ordinal();
        if (iOrdinal2 == 0) {
            return defpackage.dzn.m(listSingletonList, b(), a(), this.k.g());
        }
        if (iOrdinal2 == 1) {
            int iB = b();
            defpackage.gab gabVarG = this.k.g();
            defpackage.aooh.f(listSingletonList, "pages");
            return new defpackage.gag(defpackage.gac.b, listSingletonList, iB, -1, gabVarG);
        }
        if (iOrdinal2 != 2) {
            throw new defpackage.aois();
        }
        int iA = a();
        defpackage.gab gabVarG2 = this.k.g();
        defpackage.aooh.f(listSingletonList, "pages");
        return new defpackage.gag(defpackage.gac.c, listSingletonList, -1, iA, gabVarG2);
    }
}
