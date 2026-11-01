package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xss {
    public final dxz b;
    public final xtq c;
    public final defpackage.uyg d;
    public final xtq e;
    public final xtq f;
    public final defpackage.uyg g;
    private final defpackage.xvg i;
    private final xtq j;
    public final defpackage.uyg h = new defpackage.uyg((byte[]) null, (byte[]) null, (byte[]) null);
    public final defpackage.yeg a = new defpackage.yeg();

    public xss() {
        defpackage.ygg yggVar = new defpackage.ygg(new dyb(20), new defpackage.xyh(2), new defpackage.yge());
        this.b = yggVar;
        this.d = new defpackage.uyg(yggVar);
        this.e = new xtq((char[]) null, (byte[]) null);
        this.g = new defpackage.uyg((byte[]) null, (byte[]) null);
        this.c = new xtq((char[]) null);
        this.i = new defpackage.xvg();
        this.f = new xtq((byte[]) null, (byte[]) null, (byte[]) null);
        this.j = new xtq((byte[]) null, (byte[]) null);
        java.util.List listAsList = java.util.Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        java.util.ArrayList arrayList = new java.util.ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        java.util.Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) it.next());
        }
        arrayList.add("legacy_append");
        this.g.G(arrayList);
    }

    public final defpackage.xvd a(java.lang.Object obj) {
        return this.i.a(obj);
    }

    public final java.util.List b() {
        java.util.List listN = this.j.n();
        if (listN.isEmpty()) {
            throw new defpackage.xso();
        }
        return listN;
    }

    public final java.util.List c(java.lang.Object obj) {
        java.util.List listO = this.d.o(obj.getClass());
        if (listO.isEmpty()) {
            throw new defpackage.xsp(obj);
        }
        int size = listO.size();
        java.util.List arrayList = java.util.Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            defpackage.xzp xzpVar = (defpackage.xzp) listO.get(i);
            if (xzpVar.a(obj)) {
                if (z) {
                    arrayList = new java.util.ArrayList(size - i);
                }
                arrayList.add(xzpVar);
                z = false;
            }
        }
        if (arrayList.isEmpty()) {
            throw new defpackage.xsp(obj, listO);
        }
        return arrayList;
    }

    public final void d(java.lang.Class cls, defpackage.xue xueVar) {
        this.e.q(cls, xueVar);
    }

    public final void e(java.lang.Class cls, defpackage.xuv xuvVar) {
        this.c.m(cls, xuvVar);
    }

    public final void f(java.lang.Class cls, java.lang.Class cls2, defpackage.xzq xzqVar) {
        this.d.p(cls, cls2, xzqVar);
    }

    public final void g(java.lang.String str, java.lang.Class cls, java.lang.Class cls2, defpackage.xuu xuuVar) {
        this.g.F(str, xuuVar, cls, cls2);
    }

    public final void h(java.lang.Class cls, java.lang.Class cls2, defpackage.xzq xzqVar) {
        this.d.q(cls, cls2, xzqVar);
    }

    public final void i(java.lang.Class cls, java.lang.Class cls2, defpackage.xuu xuuVar) {
        this.g.H(xuuVar, cls, cls2);
    }

    public final void j(defpackage.xug xugVar) {
        this.j.o(xugVar);
    }

    public final void k(defpackage.xvc xvcVar) {
        this.i.b(xvcVar);
    }

    public final void l(java.lang.Class cls, java.lang.Class cls2, defpackage.ydf ydfVar) {
        this.f.t(cls, cls2, ydfVar);
    }
}
