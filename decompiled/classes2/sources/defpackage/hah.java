package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hah implements defpackage.hai, defpackage.haq, defpackage.hay, defpackage.hcx {
    public final java.util.List a;
    private final android.graphics.Matrix b;
    private final android.graphics.Path c;
    private final android.graphics.RectF d;
    private final java.lang.String e;
    private final boolean f;
    private final defpackage.gzs g;
    private java.util.List h;
    private defpackage.hbt i;

    public hah(defpackage.gzs gzsVar, defpackage.hef hefVar, java.lang.String str, boolean z, java.util.List list, defpackage.hdk hdkVar) {
        new defpackage.hae();
        new android.graphics.RectF();
        this.b = new android.graphics.Matrix();
        this.c = new android.graphics.Path();
        this.d = new android.graphics.RectF();
        this.e = str;
        this.g = gzsVar;
        this.f = z;
        this.a = list;
        if (hdkVar != null) {
            defpackage.hbt hbtVar = new defpackage.hbt(hdkVar);
            this.i = hbtVar;
            hbtVar.c(hefVar);
            this.i.d(this);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            defpackage.hag hagVar = (defpackage.hag) list.get(size);
            if (hagVar instanceof defpackage.han) {
                arrayList.add((defpackage.han) hagVar);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                ((defpackage.han) arrayList.get(size2)).h(list.listIterator(list.size()));
            }
        }
    }

    @Override // defpackage.hcx
    public final void a(java.lang.Object obj, defpackage.hgp hgpVar) {
        defpackage.hbt hbtVar = this.i;
        if (hbtVar != null) {
            hbtVar.e(obj, hgpVar);
        }
    }

    @Override // defpackage.hai
    public final void b(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) {
        if (this.f) {
            return;
        }
        android.graphics.Matrix matrix2 = this.b;
        matrix2.set(matrix);
        defpackage.hbt hbtVar = this.i;
        if (hbtVar != null) {
            matrix2.preConcat(hbtVar.a());
            defpackage.hbd hbdVar = this.i.e;
            i = (int) (((((hbdVar == null ? 100 : ((java.lang.Integer) hbdVar.e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        java.util.List list = this.a;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            java.lang.Object obj = list.get(size);
            if (obj instanceof defpackage.hai) {
                ((defpackage.hai) obj).b(canvas, matrix2, i);
            }
        }
    }

    @Override // defpackage.hai
    public final void c(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        android.graphics.Matrix matrix2 = this.b;
        matrix2.set(matrix);
        defpackage.hbt hbtVar = this.i;
        if (hbtVar != null) {
            matrix2.preConcat(hbtVar.a());
        }
        android.graphics.RectF rectF2 = this.d;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        java.util.List list = this.a;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            defpackage.hag hagVar = (defpackage.hag) list.get(size);
            if (hagVar instanceof defpackage.hai) {
                ((defpackage.hai) hagVar).c(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    @Override // defpackage.hay
    public final void d() {
        this.g.invalidateSelf();
    }

    @Override // defpackage.hcx
    public final void e(defpackage.hcw hcwVar, int i, java.util.List list, defpackage.hcw hcwVar2) {
        java.lang.String str = this.e;
        if (!hcwVar.e(str, i) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            hcwVar2 = hcwVar2.b(str);
            if (hcwVar.d(str, i)) {
                list.add(hcwVar2.c(this));
            }
        }
        if (!hcwVar.f(str, i)) {
            return;
        }
        int iA = i + hcwVar.a(str, i);
        int i2 = 0;
        while (true) {
            java.util.List list2 = this.a;
            if (i2 >= list2.size()) {
                return;
            }
            defpackage.hag hagVar = (defpackage.hag) list2.get(i2);
            if (hagVar instanceof defpackage.hcx) {
                ((defpackage.hcx) hagVar).e(hcwVar, iA, list, hcwVar2);
            }
            i2++;
        }
    }

    @Override // defpackage.hag
    public final void f(java.util.List list, java.util.List list2) {
        java.util.List list3 = this.a;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + list3.size());
        arrayList.addAll(list);
        int size = list3.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            defpackage.hag hagVar = (defpackage.hag) list3.get(size);
            hagVar.f(arrayList, list3.subList(0, size));
            arrayList.add(hagVar);
        }
    }

    @Override // defpackage.hag
    public final java.lang.String g() {
        throw null;
    }

    final android.graphics.Matrix h() {
        defpackage.hbt hbtVar = this.i;
        if (hbtVar != null) {
            return hbtVar.a();
        }
        android.graphics.Matrix matrix = this.b;
        matrix.reset();
        return matrix;
    }

    @Override // defpackage.haq
    public final android.graphics.Path i() {
        android.graphics.Matrix matrix = this.b;
        matrix.reset();
        defpackage.hbt hbtVar = this.i;
        if (hbtVar != null) {
            matrix.set(hbtVar.a());
        }
        android.graphics.Path path = this.c;
        path.reset();
        if (!this.f) {
            java.util.List list = this.a;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                defpackage.hag hagVar = (defpackage.hag) list.get(size);
                if (hagVar instanceof defpackage.haq) {
                    path.addPath(((defpackage.haq) hagVar).i(), matrix);
                }
            }
        }
        return path;
    }

    final java.util.List j() {
        if (this.h == null) {
            this.h = new java.util.ArrayList();
            int i = 0;
            while (true) {
                java.util.List list = this.a;
                if (i >= list.size()) {
                    break;
                }
                defpackage.hag hagVar = (defpackage.hag) list.get(i);
                if (hagVar instanceof defpackage.haq) {
                    this.h.add((defpackage.haq) hagVar);
                }
                i++;
            }
        }
        return this.h;
    }

    public hah(defpackage.gzs gzsVar, defpackage.hef hefVar, defpackage.hea heaVar, defpackage.gzh gzhVar) {
        defpackage.hdk hdkVar;
        java.lang.String str = heaVar.a;
        boolean z = heaVar.c;
        java.util.List list = heaVar.b;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            defpackage.hag hagVarA = ((defpackage.hdo) list.get(i)).a(gzsVar, gzhVar, hefVar);
            if (hagVarA != null) {
                arrayList.add(hagVarA);
            }
        }
        java.util.List list2 = heaVar.b;
        for (int i2 = 0; i2 < list2.size(); i2++) {
            defpackage.hdo hdoVar = (defpackage.hdo) list2.get(i2);
            if (hdoVar instanceof defpackage.hdk) {
                hdkVar = (defpackage.hdk) hdoVar;
                this(gzsVar, hefVar, str, z, arrayList, hdkVar);
            }
        }
        hdkVar = null;
        this(gzsVar, hefVar, str, z, arrayList, hdkVar);
    }
}
