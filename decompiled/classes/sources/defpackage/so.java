package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class so implements java.util.concurrent.Executor {
    private final /* synthetic */ int $cid;

    public so(int i) {
        this.$cid = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        switch (this.$cid) {
            case 0:
                ((defpackage.sq) defpackage.sp.h().b).b.execute(runnable);
                break;
            case 1:
                new java.lang.Thread(runnable).start();
                break;
            case 2:
                defpackage.aooh.f(runnable, "p0");
                runnable.run();
                break;
            case 3:
                defpackage.aooh.f(runnable, "p0");
                runnable.run();
                break;
            case 4:
                runnable.run();
                break;
            case 5:
                runnable.run();
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
