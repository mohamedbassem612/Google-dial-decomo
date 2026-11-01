package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class xcw implements defpackage.znd {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ xcw(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.znd
    public final void a() {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        if (i != 0) {
            defpackage.toj tojVar = (defpackage.toj) obj;
            tojVar.E.i(aoov.an(tojVar.c, (aolr) null, 0, new defpackage.tkx(tojVar, (aoln) null, 16, (short[]) null), 3));
            return;
        }
        defpackage.xcy xcyVar = (defpackage.xcy) obj;
        if (xcyVar.B) {
            a.bI(defpackage.xcy.a.b(), "call was made into a conference call", "com/android/incallui/atlas/ui/impl/tidepods/session/HoldForMeSession", "onParentChanged", (char) 597, "HoldForMeSession.java", zct.a);
            defpackage.wxm wxmVar = xcyVar.e;
            long j = xcyVar.r;
            wxmVar.b(j, defpackage.alex.ATLAS_TELEPHONY_CONFERENCE_CALL);
            wxmVar.b(j, defpackage.alex.ATLAS_STOP_ITSELF);
            agsm.i(1175, xcyVar.a(true), "Failed to stop session.", new java.lang.Object[0]);
        }
    }
}
