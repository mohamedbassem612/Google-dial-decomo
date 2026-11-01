package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class tno implements defpackage.znw {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ tno(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.znw
    public final ajcq a() {
        int i = this.$cid;
        if (i == 0) {
            defpackage.toj tojVar = (defpackage.toj) this.a;
            return tojVar.a(new defpackage.sbm(tojVar, (aoln) null, 8, (char[]) null));
        }
        if (i == 1) {
            return ((lev) this.a).x.k(2);
        }
        if (i == 2) {
            aimw aimwVarL = defpackage.wky.a.b().i(zct.a).l("com/android/dialer/xatu/impl/service/XatuController", "onCallSuspended", 270, "XatuController.java");
            defpackage.wky wkyVar = (defpackage.wky) this.a;
            aimwVarL.y("[%s] suspended", wkyVar.m);
            return wkyVar.b();
        }
        defpackage.xcy xcyVar = (defpackage.xcy) this.a;
        if (!xcyVar.B) {
            return ajcm.a;
        }
        a.bI(defpackage.xcy.a.b(), "call on telephony hold", "com/android/incallui/atlas/ui/impl/tidepods/session/HoldForMeSession", "onCallSuspended", (char) 493, "HoldForMeSession.java", zct.a);
        defpackage.wxm wxmVar = xcyVar.e;
        long j = xcyVar.r;
        wxmVar.b(j, defpackage.alex.ATLAS_RECEIVE_TELEPHONY_HOLD);
        wxmVar.b(j, defpackage.alex.ATLAS_STOP_ITSELF);
        return xcyVar.a(true);
    }
}
