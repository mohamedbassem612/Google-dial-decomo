package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cfr {
    public boolean a;
    public int c;
    public int d;
    public int i;
    public defpackage.can j;
    private final defpackage.cbt l;
    public final defpackage.appu k = new defpackage.appu(null, null);
    public boolean b = true;
    public final java.util.ArrayList e = new java.util.ArrayList();
    public int f = -1;
    public int g = -1;
    public int h = -1;

    public cfr(defpackage.cbt cbtVar, defpackage.can canVar) {
        this.l = cbtVar;
        this.j = canVar;
    }

    public final defpackage.cfl a() {
        return this.l.p;
    }

    public final void b() {
        if (this.a) {
            i(false);
            i(false);
            this.j.j();
            this.a = false;
        }
    }

    public final void c(java.lang.Object obj) {
        h();
        this.e.add(obj);
    }

    public final void d(int i) {
        this.c += i - a().f;
    }

    public final void e() {
        h();
        java.util.ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            this.d++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void f() {
        int i = this.d;
        if (i > 0) {
            defpackage.chi chiVar = this.j.a;
            chiVar.i(defpackage.chb.a);
            chiVar.c[chiVar.d - chiVar.a[chiVar.b - 1].b] = i;
            this.d = 0;
        }
        java.util.ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        defpackage.can canVar = this.j;
        int size = arrayList.size();
        java.lang.Object[] objArr = new java.lang.Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        if (size != 0) {
            defpackage.chi chiVar2 = canVar.a;
            chiVar2.i(defpackage.cga.a);
            defpackage.chh.a(chiVar2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void g() {
        i(false);
        j();
    }

    public final void h() {
        int i = this.i;
        if (i > 0) {
            int i2 = this.f;
            if (i2 >= 0) {
                f();
                defpackage.chi chiVar = this.j.a;
                chiVar.i(cgr.a);
                int i3 = chiVar.d - chiVar.a[chiVar.b - 1].b;
                int[] iArr = chiVar.c;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.f = -1;
            } else {
                int i4 = this.h;
                int i5 = this.g;
                f();
                defpackage.chi chiVar2 = this.j.a;
                chiVar2.i(cgl.a);
                int i6 = chiVar2.d - chiVar2.a[chiVar2.b - 1].b;
                int[] iArr2 = chiVar2.c;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.g = -1;
                this.h = -1;
            }
            this.i = 0;
        }
    }

    public final void i(boolean z) {
        int i = z ? a().h : a().f;
        int i2 = i - this.c;
        if (i2 < 0) {
            defpackage.cax.b("Tried to seek backward");
        }
        if (i2 > 0) {
            defpackage.chi chiVar = this.j.a;
            chiVar.i(defpackage.cft.a);
            chiVar.c[chiVar.d - chiVar.a[chiVar.b - 1].b] = i2;
            this.c = i;
        }
    }

    public final void j() {
        if (a().c > 0) {
            defpackage.cfl cflVarA = a();
            int i = cflVarA.h;
            defpackage.appu appuVar = this.k;
            if (appuVar.d(-2) != i) {
                if (!this.a && this.b) {
                    i(false);
                    this.j.a.i(defpackage.cgg.a);
                    this.a = true;
                }
                if (i > 0) {
                    defpackage.cfh cfhVarG = cflVarA.g(i);
                    appuVar.g(i);
                    i(false);
                    defpackage.chi chiVar = this.j.a;
                    chiVar.i(defpackage.cgf.a);
                    defpackage.chh.a(chiVar, 0, cfhVarG);
                    this.a = true;
                }
            }
        }
    }

    public final void k(int i, int i2) {
        if (i2 > 0) {
            if (i < 0) {
                defpackage.cax.b(defpackage.a.bj(i, "Invalid remove index "));
            }
            if (this.f == i) {
                this.i += i2;
                return;
            }
            h();
            this.f = i;
            this.i = i2;
        }
    }

    public final void l() {
        this.j.a.i(cgu.a);
    }

    public final void m(defpackage.can canVar, defpackage.cjb cjbVar) {
        defpackage.can canVar2 = this.j;
        if (canVar.h()) {
            defpackage.chi chiVar = canVar2.a;
            chiVar.i(cfv.a);
            defpackage.chh.b(chiVar, 0, canVar, 1, cjbVar);
        }
    }
}
