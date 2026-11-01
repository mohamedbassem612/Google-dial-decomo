package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class euh implements defpackage.etk {
    public static final java.util.List a = new java.util.ArrayList(50);
    public final android.os.Handler b;

    public euh(android.os.Handler handler) {
        this.b = handler;
    }

    public static defpackage.yz l() {
        defpackage.yz yzVar;
        java.util.List list = a;
        synchronized (list) {
            yzVar = list.isEmpty() ? new defpackage.yz() : (defpackage.yz) list.remove(list.size() - 1);
        }
        return yzVar;
    }

    @Override // defpackage.etk
    public final android.os.Looper a() {
        return this.b.getLooper();
    }

    @Override // defpackage.etk
    public final void b(int i) {
        this.b.removeMessages(i);
    }

    @Override // defpackage.etk
    public final boolean c(int i) {
        return this.b.hasMessages(i);
    }

    @Override // defpackage.etk
    public final void d(java.lang.Runnable runnable) {
        this.b.post(runnable);
    }

    @Override // defpackage.etk
    public final void e() {
        this.b.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.etk
    public final void f(int i) {
        this.b.sendEmptyMessage(i);
    }

    @Override // defpackage.etk
    public final void g(int i, int i2) {
        this.b.sendEmptyMessageDelayed(i, i2);
    }

    @Override // defpackage.etk
    public final defpackage.yz h(int i) {
        defpackage.yz yzVarL = l();
        yzVarL.a = this.b.obtainMessage(i);
        return yzVarL;
    }

    @Override // defpackage.etk
    public final defpackage.yz i(int i, java.lang.Object obj) {
        defpackage.yz yzVarL = l();
        yzVarL.a = this.b.obtainMessage(i, obj);
        return yzVarL;
    }

    @Override // defpackage.etk
    public final defpackage.yz j(int i, int i2, int i3) {
        defpackage.yz yzVarL = l();
        yzVarL.a = this.b.obtainMessage(i, i2, i3);
        return yzVarL;
    }

    @Override // defpackage.etk
    public final void k(defpackage.yz yzVar) {
        java.lang.Object obj = yzVar.a;
        ahvr.ci(obj);
        this.b.sendMessageAtFrontOfQueue((android.os.Message) obj);
        yzVar.a();
    }
}
