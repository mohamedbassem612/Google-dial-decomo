package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fg {
    defpackage.dzz b;
    public boolean c;
    private android.view.animation.Interpolator e;
    private long d = -1;
    private final defpackage.eaa f = new defpackage.ff(this);
    public final java.util.ArrayList a = new java.util.ArrayList();

    public final void a() {
        if (this.c) {
            java.util.ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((defpackage.ni) arrayList.get(i)).j();
            }
            this.c = false;
        }
    }

    public final void b() {
        android.view.View view;
        if (this.c) {
            return;
        }
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            defpackage.ni niVar = (defpackage.ni) arrayList.get(i);
            long j = this.d;
            if (j >= 0) {
                niVar.l(j);
            }
            android.view.animation.Interpolator interpolator = this.e;
            if (interpolator != null && (view = (android.view.View) ((java.lang.ref.WeakReference) niVar.a).get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.b != null) {
                niVar.m(this.f);
            }
            android.view.View view2 = (android.view.View) ((java.lang.ref.WeakReference) niVar.a).get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.c = true;
    }

    public final void c() {
        if (this.c) {
            return;
        }
        this.d = 250L;
    }

    public final void d(android.view.animation.Interpolator interpolator) {
        if (this.c) {
            return;
        }
        this.e = interpolator;
    }

    public final void e(defpackage.dzz dzzVar) {
        if (this.c) {
            return;
        }
        this.b = dzzVar;
    }

    public final void f(defpackage.ni niVar) {
        if (this.c) {
            return;
        }
        this.a.add(niVar);
    }
}
