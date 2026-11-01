package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class rez implements defpackage.znq {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ rez(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.znq
    public final ajcq a() {
        int i = this.$cid;
        if (i == 0) {
            defpackage.rfa rfaVar = (defpackage.rfa) this.a;
            rfaVar.c.set(false);
            ajcq ajcqVar = ajcm.a;
            rfaVar.e.a(ajcqVar);
            return ajcqVar;
        }
        if (i == 1) {
            defpackage.pqm pqmVar = (defpackage.pqm) this.a;
            return pqmVar.j(pqmVar.i);
        }
        if (i == 2) {
            java.lang.Object obj = this.a;
            defpackage.tvg tvgVar = new defpackage.tvg(obj, 4);
            defpackage.tzx tzxVar = (defpackage.tzx) obj;
            return tzxVar.k.g(tvgVar, tzxVar.e);
        }
        java.lang.Object obj2 = this.a;
        if (i == 3) {
            defpackage.wbc wbcVar = (defpackage.wbc) obj2;
            return aosv.F(wbcVar.b, 0, new defpackage.ryc(wbcVar, (aoln) null, 6, (byte[]) null), 3);
        }
        defpackage.xcy xcyVar = (defpackage.xcy) obj2;
        if (xcyVar.B) {
            xcyVar.e.b(xcyVar.r, defpackage.alex.USER_CLICK_DISCONNECTION_BUTTON);
            a.bI(defpackage.xcy.a.b(), "call state changed to disconnecting", "com/android/incallui/atlas/ui/impl/tidepods/session/HoldForMeSession", "onCallDisconnectionStarted", (char) 575, "HoldForMeSession.java", zct.a);
        }
        return ajcm.a;
    }
}
