package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aesc extends defpackage.agab implements defpackage.aeqv {
    public final defpackage.aequ a;
    public final defpackage.amwu b;
    private final defpackage.aoin c;

    static {
        new defpackage.ahyj(" -> ");
    }

    public aesc(defpackage.gou gouVar, defpackage.amwu amwuVar, java.util.concurrent.Executor executor, defpackage.aoin aoinVar) {
        new java.util.ArrayDeque();
        this.a = gouVar.D(executor, amwuVar, null);
        this.b = amwuVar;
        this.c = aoinVar;
    }

    @Override // defpackage.aeqv
    public final void n() {
        java.lang.Thread.setDefaultUncaughtExceptionHandler(new defpackage.afak(this, java.lang.Thread.getDefaultUncaughtExceptionHandler(), 1));
        defpackage.adao adaoVar = (defpackage.adao) this.c.a();
        ((defpackage.tvn) adaoVar.b).w(new defpackage.aesd(adaoVar));
    }
}
