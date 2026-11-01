package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class etj implements java.util.concurrent.Executor {
    public final rai a;
    private final defpackage.etk b;

    public etj(defpackage.etk etkVar, rai raiVar) {
        this.b = etkVar;
        this.a = raiVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.b.d(new defpackage.esz(this, runnable, 2));
    }
}
