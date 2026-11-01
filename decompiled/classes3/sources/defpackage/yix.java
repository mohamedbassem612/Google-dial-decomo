package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class yix implements defpackage.yhp {
    public final java.util.List a;
    final /* synthetic */ defpackage.yjh b;
    private float c;
    private float d;
    private defpackage.yiy e;
    private boolean f;
    private boolean g;
    private int h;
    private boolean i;

    public yix(defpackage.yjh yjhVar, defpackage.yho yhoVar) {
        j$.util.Objects.requireNonNull(yjhVar);
        this.b = yjhVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.a = arrayList;
        this.e = null;
        this.f = false;
        this.g = true;
        this.h = -1;
        if (yhoVar != null) {
            yhoVar.e(this);
            if (this.i) {
                this.e.a((defpackage.yiy) arrayList.get(this.h));
                arrayList.set(this.h, this.e);
                this.i = false;
            }
            defpackage.yiy yiyVar = this.e;
            if (yiyVar != null) {
                arrayList.add(yiyVar);
            }
        }
    }

    @Override // defpackage.yhp
    public final void b(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        this.f = true;
        this.g = false;
        defpackage.yiy yiyVar = this.e;
        defpackage.yjh.c(yiyVar.a, yiyVar.b, f, f2, f3, z, z2, f4, f5, this);
        this.g = true;
        this.i = false;
    }

    @Override // defpackage.yhp
    public final void c() {
        this.a.add(this.e);
        f(this.c, this.d);
        this.i = true;
    }

    @Override // defpackage.yhp
    public final void d(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.g || this.f) {
            this.e.b(f, f2);
            this.a.add(this.e);
            this.f = false;
        }
        this.e = new defpackage.yiy(this.b, f5, f6, f5 - f3, f6 - f4);
        this.i = false;
    }

    @Override // defpackage.yhp
    public final void f(float f, float f2) {
        this.e.b(f, f2);
        this.a.add(this.e);
        defpackage.yiy yiyVar = this.e;
        this.e = new defpackage.yiy(this.b, f, f2, f - yiyVar.a, f2 - yiyVar.b);
        this.i = false;
    }

    @Override // defpackage.yhp
    public final void g(float f, float f2) {
        if (this.i) {
            defpackage.yiy yiyVar = this.e;
            java.util.List list = this.a;
            yiyVar.a((defpackage.yiy) list.get(this.h));
            list.set(this.h, this.e);
            this.i = false;
        }
        defpackage.yiy yiyVar2 = this.e;
        if (yiyVar2 != null) {
            this.a.add(yiyVar2);
        }
        this.c = f;
        this.d = f2;
        this.e = new defpackage.yiy(this.b, f, f2, 0.0f, 0.0f);
        this.h = this.a.size();
    }

    @Override // defpackage.yhp
    public final void h(float f, float f2, float f3, float f4) {
        this.e.b(f, f2);
        this.a.add(this.e);
        this.e = new defpackage.yiy(this.b, f3, f4, f3 - f, f4 - f2);
        this.i = false;
    }
}
