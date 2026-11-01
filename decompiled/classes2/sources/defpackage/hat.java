package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hat implements defpackage.hai, defpackage.haq, defpackage.han, defpackage.hay, defpackage.hao {
    private final android.graphics.Matrix a = new android.graphics.Matrix();
    private final android.graphics.Path b = new android.graphics.Path();
    private final defpackage.gzs c;
    private final defpackage.hef d;
    private final java.lang.String e;
    private final boolean f;
    private final defpackage.hbd g;
    private final defpackage.hbd h;
    private final defpackage.hbt i;
    private defpackage.hah j;

    public hat(defpackage.gzs gzsVar, defpackage.hef hefVar, defpackage.hdw hdwVar) {
        this.c = gzsVar;
        this.d = hefVar;
        this.e = hdwVar.a;
        this.f = hdwVar.e;
        defpackage.hbd hbdVarA = hdwVar.b.a();
        this.g = hbdVarA;
        hefVar.i(hbdVarA);
        hbdVarA.h(this);
        defpackage.hbd hbdVarA2 = hdwVar.c.a();
        this.h = hbdVarA2;
        hefVar.i(hbdVarA2);
        hbdVarA2.h(this);
        defpackage.hbt hbtVar = new defpackage.hbt(hdwVar.d);
        this.i = hbtVar;
        hbtVar.c(hefVar);
        hbtVar.d(this);
    }

    @Override // defpackage.hcx
    public final void a(java.lang.Object obj, defpackage.hgp hgpVar) {
        defpackage.hbd hbdVar;
        if (this.i.e(obj, hgpVar)) {
            return;
        }
        if (obj == defpackage.gzx.u) {
            hbdVar = this.g;
        } else if (obj != defpackage.gzx.v) {
            return;
        } else {
            hbdVar = this.h;
        }
        hbdVar.d = hgpVar;
    }

    @Override // defpackage.hai
    public final void b(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) {
        float fFloatValue = ((java.lang.Float) this.g.e()).floatValue();
        float fFloatValue2 = ((java.lang.Float) this.h.e()).floatValue();
        defpackage.hbt hbtVar = this.i;
        float fFloatValue3 = ((java.lang.Float) hbtVar.h.e()).floatValue() / 100.0f;
        float fFloatValue4 = ((java.lang.Float) hbtVar.i.e()).floatValue() / 100.0f;
        int i2 = (int) fFloatValue;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            android.graphics.Matrix matrix2 = this.a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(hbtVar.b(f + fFloatValue2));
            int i3 = defpackage.hgh.a;
            this.j.b(canvas, matrix2, (int) (i * (((f / fFloatValue) * (fFloatValue4 - fFloatValue3)) + fFloatValue3)));
        }
    }

    @Override // defpackage.hai
    public final void c(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        this.j.c(rectF, matrix, z);
    }

    @Override // defpackage.hay
    public final void d() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.hcx
    public final void e(defpackage.hcw hcwVar, int i, java.util.List list, defpackage.hcw hcwVar2) {
        defpackage.hgh.d(hcwVar, i, list, hcwVar2, this);
        for (int i2 = 0; i2 < this.j.a.size(); i2++) {
            defpackage.hag hagVar = (defpackage.hag) this.j.a.get(i2);
            if (hagVar instanceof defpackage.hao) {
                defpackage.hgh.d(hcwVar, i, list, hcwVar2, (defpackage.hao) hagVar);
            }
        }
    }

    @Override // defpackage.hag
    public final void f(java.util.List list, java.util.List list2) {
        this.j.f(list, list2);
    }

    @Override // defpackage.hag
    public final java.lang.String g() {
        return this.e;
    }

    @Override // defpackage.han
    public final void h(java.util.ListIterator listIterator) {
        if (this.j == null) {
            while (listIterator.hasPrevious() && listIterator.previous() != this) {
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add((defpackage.hag) listIterator.previous());
                listIterator.remove();
            }
            java.util.Collections.reverse(arrayList);
            this.j = new defpackage.hah(this.c, this.d, "Repeater", this.f, arrayList, null);
        }
    }

    @Override // defpackage.haq
    public final android.graphics.Path i() {
        android.graphics.Path pathI = this.j.i();
        android.graphics.Path path = this.b;
        path.reset();
        float fFloatValue = ((java.lang.Float) this.g.e()).floatValue();
        float fFloatValue2 = ((java.lang.Float) this.h.e()).floatValue();
        int i = (int) fFloatValue;
        while (true) {
            i--;
            if (i < 0) {
                return path;
            }
            android.graphics.Matrix matrix = this.a;
            matrix.set(this.i.b(i + fFloatValue2));
            path.addPath(pathI, matrix);
        }
    }
}
