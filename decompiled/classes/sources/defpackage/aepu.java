package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aepu {
    public android.os.Handler e;
    public defpackage.aenj h;
    public int a = 0;
    public int b = 0;
    public boolean c = true;
    public boolean d = true;
    public final java.util.Set g = new java.util.HashSet();
    public final java.lang.Runnable f = new defpackage.abqg(this, 3);

    public aepu(android.content.Context context) {
        this.e = null;
        this.e = new android.os.Handler(context.getMainLooper());
        ((android.app.Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new defpackage.aeps(this));
    }

    public final void a() {
        if (this.a == 0 && this.c) {
            for (defpackage.aepi aepiVar : this.g) {
            }
            this.d = true;
        }
    }
}
