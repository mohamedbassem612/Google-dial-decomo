package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
abstract class dl {
    private android.content.BroadcastReceiver a;
    final /* synthetic */ dq c;

    public dl(dq dqVar) {
        this.c = dqVar;
    }

    public abstract android.content.IntentFilter a();

    public abstract void b();

    final void c() {
        android.content.BroadcastReceiver broadcastReceiver = this.a;
        if (broadcastReceiver != null) {
            try {
                this.c.k.unregisterReceiver(broadcastReceiver);
            } catch (java.lang.IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    final void d() {
        c();
        android.content.IntentFilter intentFilterA = a();
        if (intentFilterA.countActions() != 0) {
            if (this.a == null) {
                this.a = new defpackage.dk(this);
            }
            dq dqVar = this.c;
            dqVar.k.registerReceiver(this.a, intentFilterA);
        }
    }
}
