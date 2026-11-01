package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qpj implements defpackage.puw {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ qpj(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.puw
    public final void a() {
        int i = this.$cid;
        if (i != 0) {
            if (i == 1) {
                java.lang.Object obj = this.a;
                defpackage.pvr pvrVar = (defpackage.pvr) obj;
                pvrVar.i();
                agsm.i(545, ahvr.H(pvrVar.d(), new defpackage.phr(obj, 8), pvrVar.f), "Failed to check if Pause state is incorrectly set", new java.lang.Object[0]);
                return;
            }
            java.lang.Object obj2 = this.a;
            if (i != 2) {
                ((defpackage.qrv) obj2).l.set(false);
                return;
            } else {
                ((defpackage.qql) obj2).a();
                return;
            }
        }
        defpackage.qpn qpnVar = (defpackage.qpn) this.a;
        if (qpnVar.f.getDetails().getVideoState() == 4) {
            qpnVar.p = true;
            qpnVar.s++;
            qpnVar.q = android.os.SystemClock.elapsedRealtime();
        } else if (qpnVar.p) {
            qpnVar.p = false;
            qpnVar.r += android.os.SystemClock.elapsedRealtime() - qpnVar.q;
        }
    }
}
