package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tpc implements defpackage.qub {
    private final /* synthetic */ int $cid;
    public final java.lang.Object a;
    private final aoss b;
    private final java.lang.Object c;

    public tpc(aoss aossVar, agsm agsmVar, defpackage.tpf tpfVar, int i) {
        this.$cid = i;
        aooh.f(aossVar, "lightweightScope");
        aooh.f(agsmVar, "androidFutures");
        aooh.f(tpfVar, "expressoSnackbarController");
        this.b = aossVar;
        this.c = agsmVar;
        this.a = tpfVar;
    }

    @Override // defpackage.qub
    public final void b(android.view.View view) {
        if (this.$cid == 1) {
            throw new java.lang.IllegalStateException("Expresso snackbar message does not have action text.");
        }
    }

    @Override // defpackage.qub
    public final void c() {
        int i = this.$cid;
        if (i == 0) {
            ((apni) this.c).i(aoov.an(this.b, (aolr) null, 0, new defpackage.tpd(this, (aoln) null, 1), 3));
        } else if (i != 1) {
            ((apni) this.c).i(aoov.an(this.b, (aolr) null, 0, new defpackage.tpd(this, (aoln) null, 0, (byte[]) null), 3));
        } else {
            ajcq ajcqVarF = aosv.F(this.b, 0, new ogf(this, (aoln) null, 7), 3);
            ((agsm) this.c).g(ajcqVarF, 5L, java.util.concurrent.TimeUnit.SECONDS);
        }
    }

    public tpc(aoss aossVar, defpackage.tpf tpfVar, apni apniVar, int i) {
        this.$cid = i;
        aooh.f(aossVar, "lightweightScope");
        aooh.f(tpfVar, "sharpieSnackbarController");
        aooh.f(apniVar, "androidJobs");
        this.b = aossVar;
        this.a = tpfVar;
        this.c = apniVar;
    }

    public tpc(aoss aossVar, defpackage.tpf tpfVar, apni apniVar, int i, byte[] bArr) {
        this.$cid = i;
        aooh.f(aossVar, "lightweightScope");
        aooh.f(tpfVar, "sharpieSnackbarController");
        aooh.f(apniVar, "androidJobs");
        this.b = aossVar;
        this.a = tpfVar;
        this.c = apniVar;
    }
}
