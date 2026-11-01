package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zao {
    public final java.util.Set a;
    public final java.util.Map b;
    public final java.util.Set c;
    public final java.util.Set d;
    public final java.util.Map e;
    public final j$.time.Duration f;
    public final defpackage.mce g;

    public zao(defpackage.mce mceVar, java.util.Set set, java.util.Map map, java.util.Set set2, java.util.Set set3, java.util.Map map2, j$.time.Duration duration) {
        if (set == null) {
            defpackage.aooh.i("cancelEvents");
        }
        if (map == null) {
            defpackage.aooh.i("endEvents");
        }
        if (set3 == null) {
            defpackage.aooh.i("definingEvents");
        }
        if (map2 == null) {
            defpackage.aooh.i("errorEvents");
        }
        this.g = mceVar;
        this.a = set;
        this.b = map;
        this.c = set2;
        this.d = set3;
        this.e = map2;
        this.f = duration;
    }

    public final java.util.Set a() {
        java.util.Map map = this.b;
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        java.util.Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((defpackage.zan) ((java.util.Map.Entry) it.next()).getValue()).b));
        }
        java.util.Map map2 = this.e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(map2.size());
        java.util.Iterator it2 = map2.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(((defpackage.zan) ((java.util.Map.Entry) it2.next()).getValue()).b));
        }
        java.util.List listBT = defpackage.ajsz.bT(arrayList, arrayList2);
        java.util.Set set = this.c;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(set.size());
        java.util.Iterator it3 = set.iterator();
        while (it3.hasNext()) {
            arrayList3.add(java.lang.Integer.valueOf(((defpackage.zam) it3.next()).b.b));
        }
        java.util.List listBT2 = defpackage.ajsz.bT(listBT, arrayList3);
        java.util.Set set2 = this.d;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it4 = set2.iterator();
        while (it4.hasNext()) {
            java.lang.Object obj = ((defpackage.aacy) it4.next()).a;
            java.lang.Integer numValueOf = obj != null ? java.lang.Integer.valueOf(((defpackage.aaif) obj).a) : null;
            if (numValueOf != null) {
                arrayList4.add(numValueOf);
            }
        }
        return defpackage.ajsz.cf(defpackage.ajsz.bT(listBT2, arrayList4));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zao) {
            defpackage.zao zaoVar = (defpackage.zao) obj;
            if (defpackage.aooh.n(this.g, zaoVar.g) && defpackage.aooh.n(this.a, zaoVar.a) && defpackage.aooh.n(this.b, zaoVar.b) && defpackage.aooh.n(this.c, zaoVar.c) && defpackage.aooh.n(this.d, zaoVar.d) && defpackage.aooh.n(this.e, zaoVar.e) && defpackage.aooh.n(this.f, zaoVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.g.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        j$.time.Duration duration = this.f;
        return (iHashCode * 31) + (duration == null ? 0 : duration.hashCode());
    }

    public final java.lang.String toString() {
        return "CuiEventConfiguration(startEvent=" + this.g + ", cancelEvents=" + this.a + ", endEvents=" + this.b + ", multiEventEndSet=" + this.c + ", definingEvents=" + this.d + ", errorEvents=" + this.e + ", timeout=" + this.f + ')';
    }
}
