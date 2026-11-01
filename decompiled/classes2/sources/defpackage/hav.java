package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hav implements defpackage.haq, defpackage.hay, defpackage.hao {
    private final java.lang.String b;
    private final boolean c;
    private final defpackage.gzs d;
    private final defpackage.hbp e;
    private boolean f;
    private final android.graphics.Path a = new android.graphics.Path();
    private final defpackage.heq g = new defpackage.heq();

    public hav(defpackage.gzs gzsVar, defpackage.hef hefVar, defpackage.heb hebVar) {
        this.b = hebVar.a;
        this.c = hebVar.c;
        this.d = gzsVar;
        defpackage.hbp hbpVarA = hebVar.b.a();
        this.e = hbpVarA;
        hefVar.i(hbpVarA);
        hbpVarA.h(this);
    }

    @Override // defpackage.hcx
    public final void a(java.lang.Object obj, defpackage.hgp hgpVar) {
        if (obj == defpackage.gzx.P) {
            this.e.d = hgpVar;
        }
    }

    @Override // defpackage.hay
    public final void d() {
        this.f = false;
        this.d.invalidateSelf();
    }

    @Override // defpackage.hcx
    public final void e(defpackage.hcw hcwVar, int i, java.util.List list, defpackage.hcw hcwVar2) {
        defpackage.hgh.d(hcwVar, i, list, hcwVar2, this);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:12:0x0027 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:21:0x0033 A[SYNTHETIC] */
    @Override // defpackage.hag
    public final void f(java.util.List list, java.util.List list2) {
        java.util.ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            defpackage.hag hagVar = (defpackage.hag) list.get(i);
            if (hagVar instanceof defpackage.hax) {
                defpackage.hax haxVar = (defpackage.hax) hagVar;
                if (haxVar.e == 1) {
                    this.g.d(haxVar);
                    haxVar.a(this);
                } else if (!(hagVar instanceof defpackage.hau)) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add((defpackage.hau) hagVar);
                }
            } else if (!(hagVar instanceof defpackage.hau)) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add((defpackage.hau) hagVar);
            }
        }
        this.e.e = arrayList;
    }

    @Override // defpackage.hag
    public final java.lang.String g() {
        return this.b;
    }

    @Override // defpackage.haq
    public final android.graphics.Path i() {
        if (this.f && this.e.d == null) {
            return this.a;
        }
        android.graphics.Path path = this.a;
        path.reset();
        if (this.c) {
            this.f = true;
        } else {
            android.graphics.Path path2 = (android.graphics.Path) this.e.e();
            if (path2 != null) {
                path.set(path2);
                path.setFillType(android.graphics.Path.FillType.EVEN_ODD);
                this.g.e(path);
                this.f = true;
            }
        }
        return path;
    }
}
