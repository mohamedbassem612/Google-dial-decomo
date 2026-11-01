package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajcg extends defpackage.ajab implements java.lang.Runnable {
    private defpackage.ajcq a;

    public ajcg(defpackage.ajcq ajcqVar) {
        this.a = ajcqVar;
    }

    @Override // defpackage.ajac
    protected final void a() {
        this.a = null;
    }

    @Override // defpackage.ajac
    protected final java.lang.String b() {
        defpackage.ajcq ajcqVar = this.a;
        if (ajcqVar != null) {
            return defpackage.a.bG((byte) 93, ajcqVar, "delegate=[");
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.ajcq ajcqVar = this.a;
        if (ajcqVar != null) {
            q(ajcqVar);
        }
    }
}
