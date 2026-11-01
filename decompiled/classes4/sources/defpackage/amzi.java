package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amzi extends ajac implements java.lang.Runnable {
    private ajcq a;

    public amzi(ajcq ajcqVar) {
        this.a = ajcqVar;
    }

    protected final void a() {
        this.a = null;
    }

    protected final java.lang.String b() {
        ajcq ajcqVar = this.a;
        if (ajcqVar != null) {
            return a.bF((byte) 93, ajcqVar, "delegate=[");
        }
        return null;
    }

    public final boolean d() {
        return super.r();
    }

    @Override // java.lang.Runnable
    public final void run() {
        ajcq ajcqVar = this.a;
        if (ajcqVar != null) {
            q(ajcqVar);
        }
    }
}
