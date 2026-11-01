package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hlj implements defpackage.soq {
    private final defpackage.hmd a;
    private final defpackage.apni b;

    public hlj(defpackage.apni apniVar, defpackage.hmd hmdVar) {
        if (apniVar == null) {
            defpackage.aooh.i("androidJobs");
        }
        if (hmdVar == null) {
            defpackage.aooh.i("dialerCarAppServiceStateUpdater");
        }
        this.b = apniVar;
        this.a = hmdVar;
    }

    @Override // defpackage.soq
    public final void a() {
        defpackage.hmd hmdVar = this.a;
        this.b.i(defpackage.ahvr.ag(hmdVar.d, hmdVar.h, new defpackage.hmb(hmdVar, null)));
    }
}
