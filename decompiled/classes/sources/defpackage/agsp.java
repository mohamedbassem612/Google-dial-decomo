package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agsp {
    public int c;
    private boolean e;
    private boolean f;
    public final java.lang.Object a = new java.lang.Object();
    public final java.util.Set b = new java.util.HashSet();
    public final android.app.Application.ActivityLifecycleCallbacks d = new defpackage.agso(this, 0);

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public final void a(boolean z) throws afeb {
        defpackage.afec.c();
        synchronized (this.a) {
            if (z != this.f) {
                this.e = z;
                java.util.Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((java.lang.Runnable) it.next()).run();
                }
                this.f = z;
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.e;
        }
        return z;
    }
}
