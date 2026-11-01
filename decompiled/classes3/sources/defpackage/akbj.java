package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akbj extends ajsz {
    public anty c;
    private final ajcq e;
    private final anmv f;
    private final anmb g;
    private final java.util.concurrent.Executor j = new ajdc(ajbm.a);
    public final java.util.Queue a = new java.util.ArrayDeque();
    public ajsz d = null;
    public boolean b = false;

    public akbj(ajcq ajcqVar, anmv anmvVar, anmb anmbVar) {
        this.e = ajcqVar;
        this.f = anmvVar;
        this.g = anmbVar;
    }

    private final void c(java.lang.Runnable runnable) {
        this.j.execute(ahqx.h(new defpackage.agrz(this, runnable, 20)));
    }

    public final void a(anty antyVar, anph anphVar) {
        this.c = defpackage.agwm.t(this.f, this.g, antyVar);
        ahvr.J(this.e, new defpackage.uwo(this, 15), this.j);
        c(new defpackage.agrz(this, anphVar, 19));
    }

    public final void dv(java.lang.String str, java.lang.Throwable th) {
        c(new akaz(this, str, th, 5));
    }

    public final void dw() {
        c(new defpackage.ahts(this, 14));
    }

    public final void dx(int i) {
        c(new akbd(this, i, 2));
    }

    public final void dy(java.lang.Object obj) {
        c(new akbr(this, obj, 1, (byte[]) null));
    }

    public final java.lang.String toString() {
        return super/*java.lang.Object*/.toString() + "delegate=[" + java.lang.String.valueOf(this.d) + ']';
    }
}
