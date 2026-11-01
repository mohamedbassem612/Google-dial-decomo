package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qna implements defpackage.puv {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ qna(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.puv
    public final ajcq a() {
        int i = this.$cid;
        if (i == 0) {
            defpackage.qnb.a.b().l("com/android/dialer/incall/video/activity/service/VideoForegroundBringer", "onVideoRequestReceived", 58, "VideoForegroundBringer.java").v("video request received : bring to foreground");
            return ((defpackage.qnb) this.a).a();
        }
        if (i == 1) {
            return ((defpackage.pvf) this.a).c();
        }
        java.lang.Object obj = this.a;
        if (i != 2) {
            ((defpackage.qpq) obj).k.a(qbc.bu);
            return ajcm.a;
        }
        defpackage.qnd qndVar = (defpackage.qnd) obj;
        qndVar.j.set(qndVar.n.h());
        ajcq ajcqVar = ajcm.a;
        qndVar.p.a(ajcqVar);
        return ajcqVar;
    }
}
