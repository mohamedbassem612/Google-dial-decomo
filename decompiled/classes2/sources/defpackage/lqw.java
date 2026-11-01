package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lqw implements defpackage.odm {
    private static final aimz g = aimz.i("com/android/dialer/conference/impl/ui/ManageConferenceFragmentPeer");
    public final defpackage.lqt a;
    public final defpackage.lqp b;
    public final agzc c;
    public final defpackage.odo d;
    public ahak e;
    public final afpl f;
    private final zpm h;

    public lqw(defpackage.lqt lqtVar, afpl afplVar, defpackage.lqp lqpVar, zpm zpmVar, agzc agzcVar, defpackage.odo odoVar) {
        this.a = lqtVar;
        this.f = afplVar;
        this.b = lqpVar;
        this.h = zpmVar;
        this.c = agzcVar;
        this.d = odoVar;
    }

    private final void c(qbc qbcVar) {
        j$.util.Optional optionalH = this.h.h();
        if (optionalH.isPresent()) {
            ((defpackage.lqu) ((apqr) optionalH.orElseThrow()).a(defpackage.lqu.class)).cp().c(qbcVar);
        } else {
            a.bI(g.c().m(aioa.b), "Operation attempted on primary call scope that no longer exists", "com/android/dialer/conference/impl/ui/ManageConferenceFragmentPeer", "logImpressionOnceOnPrimaryCall", (char) 174, "ManageConferenceFragmentPeer.java", zct.b);
        }
    }

    @Override // defpackage.odm
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
        j$.util.Optional optional = (j$.util.Optional) obj;
        if (optional.isPresent()) {
            this.e.x(((defpackage.lqj) optional.orElseThrow()).b);
            c(qbc.fP);
        } else {
            c(qbc.fQ);
            this.a.f();
        }
    }

    @Override // defpackage.odm
    public final void b(java.lang.Throwable th) {
        a.bq(g.c(), "Unable to load conference model.", "com/android/dialer/conference/impl/ui/ManageConferenceFragmentPeer", "onDataLoadError", (char) 156, "ManageConferenceFragmentPeer.java", th, zct.b);
    }
}
