package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class ageu implements java.lang.Runnable {
    public final zzx c;

    public ageu() {
        this.c = null;
    }

    protected abstract void a();

    public final void b(java.lang.Exception exc) {
        zzx zzxVar = this.c;
        if (zzxVar != null) {
            zzxVar.h(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (java.lang.Exception e) {
            b(e);
        }
    }

    public ageu(zzx zzxVar) {
        this.c = zzxVar;
    }
}
