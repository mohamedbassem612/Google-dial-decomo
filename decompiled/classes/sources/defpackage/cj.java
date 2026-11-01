package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class cj {
    public final defpackage.aw a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final java.util.List g;
    public int h;
    public int i;
    private final java.util.List j;
    private final java.util.List k;

    public cj(int i, int i2, defpackage.aw awVar) {
        if (awVar == null) {
            defpackage.aooh.i("fragment");
        }
        this.h = i;
        this.i = i2;
        this.a = awVar;
        this.j = new java.util.ArrayList();
        this.f = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.k = arrayList;
        this.g = arrayList;
    }

    public void a() {
        this.e = false;
        if (this.c) {
            return;
        }
        if (defpackage.bo.Z(2)) {
            android.util.Log.v("FragmentManager", defpackage.a.bg(this, "SpecialEffectsController: ", " has called complete."));
        }
        this.c = true;
        java.util.Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
    }

    public void b() {
        this.e = true;
    }

    public final void c(java.lang.Runnable runnable) {
        this.j.add(runnable);
    }

    public final void d(ch chVar) {
        this.k.add(chVar);
    }

    public final void e(android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            defpackage.aooh.i("container");
        }
        this.e = false;
        if (this.b) {
            return;
        }
        this.b = true;
        if (this.k.isEmpty()) {
            a();
            return;
        }
        for (ch chVar : defpackage.ajsz.bZ(this.g)) {
            if (viewGroup == null) {
                defpackage.aooh.i("container");
            }
            if (!chVar.j) {
                chVar.a(viewGroup);
            }
            chVar.j = true;
        }
    }

    public final void f(ch chVar) {
        java.util.List list = this.k;
        if (list.remove(chVar) && list.isEmpty()) {
            a();
        }
    }

    public final void g() {
        this.f = false;
    }

    public final void h(int i, int i2) {
        int i3 = i2 - 1;
        if (i3 == 1) {
            if (this.h == 1) {
                if (defpackage.bo.Z(2)) {
                    android.util.Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.a + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + ((java.lang.Object) defpackage.den.bU(this.i)) + " to ADDING.");
                }
                this.h = 2;
                this.i = 2;
                this.f = true;
                return;
            }
            return;
        }
        if (i3 != 2) {
            if (this.h != 1) {
                if (defpackage.bo.Z(2)) {
                    android.util.Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.a + " mFinalState = " + ((java.lang.Object) defpackage.den.bQ(this.h)) + " -> " + ((java.lang.Object) defpackage.den.bQ(i)) + '.');
                }
                this.h = i;
                return;
            }
            return;
        }
        if (defpackage.bo.Z(2)) {
            android.util.Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.a + " mFinalState = " + ((java.lang.Object) defpackage.den.bQ(this.h)) + " -> REMOVED. mLifecycleImpact  = " + ((java.lang.Object) defpackage.den.bU(this.i)) + " to REMOVING.");
        }
        this.h = 1;
        this.i = 3;
        this.f = true;
    }

    public final java.lang.String toString() {
        return "Operation {" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + "} {finalState = " + ((java.lang.Object) defpackage.den.bQ(this.h)) + " lifecycleImpact = " + ((java.lang.Object) defpackage.den.bU(this.i)) + " fragment = " + this.a + '}';
    }
}
