package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tpe implements defpackage.qub {
    public final defpackage.tpf a;
    public final defpackage.toj b;
    private final aoss c;
    private final apni d;

    public tpe(aoss aossVar, defpackage.tpf tpfVar, defpackage.toj tojVar, apni apniVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(tpfVar, "sharpieSnackbarController");
        aooh.f(tojVar, "sharpieLifecycleController");
        aooh.f(apniVar, "androidJobs");
        this.c = aossVar;
        this.a = tpfVar;
        this.b = tojVar;
        this.d = apniVar;
    }

    @Override // defpackage.qub
    public final void b(android.view.View view) {
        this.d.i(aoov.an(this.c, (aolr) null, 0, new defpackage.tpd(this, (aoln) null, 2), 3));
    }

    @Override // defpackage.qub
    public final void c() {
        this.d.i(aoov.an(this.c, (aolr) null, 0, new defpackage.tpd(this, (aoln) null, 3, (byte[]) null), 3));
    }
}
