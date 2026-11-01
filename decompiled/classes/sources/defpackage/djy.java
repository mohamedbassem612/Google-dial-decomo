package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class djy {
    public final defpackage.djz a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final java.util.List g;
    public final java.util.List h;

    public djy(defpackage.djz djzVar, long j, int i, int i2) {
        boolean z;
        int iA;
        this.a = djzVar;
        this.b = i;
        if (defpackage.dpd.d(j) != 0 || defpackage.dpd.c(j) != 0) {
            dnv.b("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = djzVar.d;
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        while (true) {
            if (i4 >= size) {
                z = false;
                break;
            }
            defpackage.dkb dkbVar = (defpackage.dkb) list.get(i4);
            defpackage.dkc dkcVar = dkbVar.a;
            int iB = defpackage.dpd.b(j);
            if (defpackage.dpd.g(j)) {
                iA = defpackage.dpd.a(j) - xa.e(f);
                if (iA < 0) {
                    iA = 0;
                }
            } else {
                iA = defpackage.dpd.a(j);
            }
            defpackage.djb djbVar = new defpackage.djb((defpackage.djc) dkcVar, this.b - i3, i2, defpackage.dpe.c(0, iB, 0, iA));
            float f2 = f + djbVar.d;
            int iF = i3 + djbVar.f();
            arrayList.add(new defpackage.dka(djbVar, dkbVar.b, dkbVar.c, i3, iF, f, f2));
            z = true;
            if (!djbVar.i()) {
                if (iF == this.b) {
                    java.util.List list2 = this.a.d;
                    if (list2 == null) {
                        defpackage.aooh.i("<this>");
                    }
                    if (i4 == list2.size() - 1) {
                    }
                }
                i4++;
                i3 = iF;
                f = f2;
            }
            i3 = iF;
            f = f2;
            break;
        }
        this.e = f;
        this.f = i3;
        this.c = z;
        this.h = arrayList;
        this.d = defpackage.dpd.b(j);
        java.util.List arrayList2 = new java.util.ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            defpackage.dka dkaVar = (defpackage.dka) arrayList.get(i5);
            java.util.List list3 = dkaVar.g.g;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(list3.size());
            int size3 = list3.size();
            for (int i6 = 0; i6 < size3; i6++) {
                defpackage.cpn cpnVar = (defpackage.cpn) list3.get(i6);
                arrayList3.add(cpnVar != null ? dkaVar.g(cpnVar) : null);
            }
            defpackage.ajsz.bv(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.a.b.size()) {
            int size4 = this.a.b.size() - arrayList2.size();
            java.util.ArrayList arrayList4 = new java.util.ArrayList(size4);
            for (int i7 = 0; i7 < size4; i7++) {
                arrayList4.add(null);
            }
            arrayList2 = defpackage.ajsz.bT(arrayList2, arrayList4);
        }
        this.g = arrayList2;
    }

    public final int a(int i, boolean z) {
        int iH;
        e(i);
        java.util.List list = this.h;
        defpackage.dka dkaVar = (defpackage.dka) list.get(xa.g(list, i));
        defpackage.djb djbVar = dkaVar.g;
        int iF = dkaVar.f(i);
        if (z) {
            defpackage.dll dllVar = djbVar.b;
            java.lang.ThreadLocal threadLocal = defpackage.dlm.a;
            android.text.Layout layout = dllVar.f;
            if (layout.getEllipsisCount(iF) <= 0 || dllVar.b != android.text.TextUtils.TruncateAt.END) {
                dlf dlfVarL = dllVar.l();
                android.text.Layout layout2 = dlfVarL.a;
                iH = dlfVarL.c(layout2.getLineEnd(iF), layout2.getLineStart(iF));
            } else {
                iH = layout.getLineStart(iF) + layout.getEllipsisStart(iF);
            }
        } else {
            iH = djbVar.b.h(iF);
        }
        return dkaVar.c(iH);
    }

    public final int b(int i) {
        int iF;
        if (i >= c().a()) {
            iF = this.h.size() - 1;
        } else {
            iF = i < 0 ? 0 : xa.f(this.h, i);
        }
        defpackage.dka dkaVar = (defpackage.dka) this.h.get(iF);
        return dkaVar.d(dkaVar.g.b.i(dkaVar.e(i)));
    }

    public final defpackage.dji c() {
        return this.a.a;
    }

    public final void d(int i) {
        if (i < 0 || i > c().c.length()) {
            dnv.b("offset(" + i + ") is out of bounds [0, " + c().a() + ']');
        }
    }

    public final void e(int i) {
        if (i < 0 || i >= this.f) {
            dnv.b("lineIndex(" + i + ") is out of bounds [0, " + this.f + ')');
        }
    }
}
