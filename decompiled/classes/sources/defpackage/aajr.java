package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class aajr implements java.util.concurrent.Executor {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public aajr(defpackage.gou gouVar, int i) {
        this.$cid = i;
        this.a = gouVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        int i = this.$cid;
        if (i == 0) {
            ((android.os.Handler) this.a).post(runnable);
            return;
        }
        if (i == 1) {
            ((android.os.Handler) ((defpackage.gou) this.a).d).post(runnable);
            return;
        }
        if (i == 2) {
            if (runnable == null) {
                defpackage.aooh.i("p0");
            }
            ((defpackage.adnp) this.a).e(runnable);
        } else {
            if (i == 3) {
                defpackage.a.be((defpackage.adnp) this.a, runnable);
                return;
            }
            if (i == 4) {
                if (runnable == null) {
                    defpackage.aooh.i("p0");
                }
                ((defpackage.adnp) this.a).e(runnable);
            } else {
                if (i == 5) {
                    defpackage.a.be((defpackage.adnp) this.a, runnable);
                    return;
                }
                if (runnable == null) {
                    defpackage.aooh.i("p0");
                }
                ((defpackage.adnp) this.a).e(runnable);
            }
        }
    }

    public /* synthetic */ aajr(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
