package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aorz implements defpackage.aosa {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public aorz(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [aotj, java.lang.Object, java.util.concurrent.Future] */
    @Override // defpackage.aosa
    public final void b(java.lang.Throwable th) {
        int i = this.$cid;
        if (i == 0) {
            this.a.a(th);
            return;
        }
        ?? r1 = this.a;
        if (i != 1) {
            r1.fz();
        } else {
            r1.cancel(false);
        }
    }

    public final java.lang.String toString() {
        int i = this.$cid;
        if (i == 0) {
            return "CancelHandler.UserSupplied[" + defpackage.aosv.a(this.a) + '@' + defpackage.aosv.b(this) + ']';
        }
        java.lang.Object obj = this.a;
        if (i != 1) {
            return "DisposeOnCancel[" + obj + ']';
        }
        return "CancelFutureOnCancel[" + obj + ']';
    }
}
