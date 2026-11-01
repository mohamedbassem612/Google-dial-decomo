package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class eph extends defpackage.epn implements java.lang.Runnable {
    boolean a;
    final /* synthetic */ defpackage.epi b;

    public eph(defpackage.epi epiVar) {
        this.b = epiVar;
    }

    @Override // defpackage.epn
    public final java.lang.Object a() {
        try {
            return this.b.a();
        } catch (defpackage.dxg e) {
            if (f()) {
                return null;
            }
            throw e;
        }
    }

    @Override // defpackage.epn
    public final void b(java.lang.Object obj) {
        this.b.c(this, obj);
    }

    @Override // defpackage.epn
    public final void c(java.lang.Object obj) {
        defpackage.epi epiVar = this.b;
        if (epiVar.a != this) {
            epiVar.c(this, obj);
            return;
        }
        if (epiVar.j) {
            epiVar.f(obj);
            return;
        }
        epiVar.m = false;
        android.os.SystemClock.uptimeMillis();
        epiVar.a = null;
        epiVar.k(obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = false;
        this.b.e();
    }
}
