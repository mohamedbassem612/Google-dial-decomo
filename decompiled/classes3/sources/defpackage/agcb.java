package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agcb {
    private static defpackage.agcb e;
    public final java.lang.Object a = new java.lang.Object();
    public final android.os.Handler b = new android.os.Handler(android.os.Looper.getMainLooper(), new defpackage.agbz(this));
    public defpackage.agca c;
    public defpackage.agca d;

    private agcb() {
    }

    public static defpackage.agcb a() {
        defpackage.agcb agcbVar = e;
        if (agcbVar != null) {
            return agcbVar;
        }
        defpackage.agcb agcbVar2 = new defpackage.agcb();
        e = agcbVar2;
        return agcbVar2;
    }

    public final void b(defpackage.agca agcaVar) {
        int i = agcaVar.a;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            android.os.Handler handler = this.b;
            handler.removeCallbacksAndMessages(agcaVar);
            handler.sendMessageDelayed(android.os.Message.obtain(handler, 0, agcaVar), i);
        }
    }

    public final void c() {
        defpackage.agca agcaVar = this.d;
        if (agcaVar != null) {
            this.c = agcaVar;
            this.d = null;
            defpackage.aprf aprfVar = (defpackage.aprf) ((java.lang.ref.WeakReference) agcaVar.c).get();
            if (aprfVar == null) {
                this.c = null;
                return;
            }
            java.lang.Object obj = aprfVar.a;
            android.os.Handler handler = defpackage.agbv.a;
            handler.sendMessage(handler.obtainMessage(0, obj));
        }
    }

    public final boolean d(defpackage.agca agcaVar, int i) {
        defpackage.aprf aprfVar = (defpackage.aprf) ((java.lang.ref.WeakReference) agcaVar.c).get();
        if (aprfVar == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(agcaVar);
        java.lang.Object obj = aprfVar.a;
        android.os.Handler handler = defpackage.agbv.a;
        handler.sendMessage(handler.obtainMessage(1, i, 0, obj));
        return true;
    }

    public final void e(defpackage.aprf aprfVar) {
        synchronized (this.a) {
            if (g(aprfVar)) {
                defpackage.agca agcaVar = this.c;
                if (!agcaVar.b) {
                    agcaVar.b = true;
                    this.b.removeCallbacksAndMessages(agcaVar);
                }
            }
        }
    }

    public final void f(defpackage.aprf aprfVar) {
        synchronized (this.a) {
            if (g(aprfVar)) {
                defpackage.agca agcaVar = this.c;
                if (agcaVar.b) {
                    agcaVar.b = false;
                    b(agcaVar);
                }
            }
        }
    }

    public final boolean g(defpackage.aprf aprfVar) {
        defpackage.agca agcaVar = this.c;
        return agcaVar != null && agcaVar.a(aprfVar);
    }

    public final boolean h(defpackage.aprf aprfVar) {
        defpackage.agca agcaVar = this.d;
        return agcaVar != null && agcaVar.a(aprfVar);
    }
}
