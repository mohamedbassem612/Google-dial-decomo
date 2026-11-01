package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class js {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int k;
    public boolean m;
    public boolean a = true;
    public int h = 0;
    public int i = 0;
    public boolean j = false;
    public java.util.List l = null;

    public final android.view.View a(defpackage.kt ktVar) {
        java.util.List list = this.l;
        if (list == null) {
            android.view.View viewN = ktVar.n(this.d);
            this.d += this.e;
            return viewN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            android.view.View view = ((defpackage.ld) this.l.get(i)).a;
            defpackage.kq kqVar = (defpackage.kq) view.getLayoutParams();
            if (!kqVar.eC() && this.d == kqVar.eA()) {
                b(view);
                return view;
            }
        }
        return null;
    }

    public final void b(android.view.View view) {
        int iEA;
        int size = this.l.size();
        int i = Integer.MAX_VALUE;
        android.view.View view2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            android.view.View view3 = ((defpackage.ld) this.l.get(i2)).a;
            defpackage.kq kqVar = (defpackage.kq) view3.getLayoutParams();
            if (view3 != view && !kqVar.eC() && (iEA = (kqVar.eA() - this.d) * this.e) >= 0 && iEA < i) {
                view2 = view3;
                if (iEA == 0) {
                    break;
                } else {
                    i = iEA;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((defpackage.kq) view2.getLayoutParams()).eA();
        }
    }

    public final boolean c(defpackage.la laVar) {
        int i = this.d;
        return i >= 0 && i < laVar.a();
    }
}
