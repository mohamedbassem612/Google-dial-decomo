package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class otk implements defpackage.zno {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ otk(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v22, types: [aoin, java.lang.Object] */
    @Override // defpackage.zno
    public final ajcq em() {
        switch (this.$cid) {
            case 0:
                defpackage.otq otqVar = (defpackage.otq) this.a;
                defpackage.otm otmVar = new defpackage.otm(otqVar.g);
                otmVar.b(ruc.h);
                otqVar.g = otmVar.a();
                return otqVar.a(defpackage.oto.b);
            case 1:
                nwg nwgVar = (nwg) this.a;
                return aosv.F(nwgVar.a, 0, new nwf(nwgVar, (aoln) null, 1, (byte[]) null), 3);
            case 2:
                defpackage.pvf pvfVar = (defpackage.pvf) this.a;
                if (android.telecom.VideoProfile.isTransmissionEnabled(pvfVar.k.getDetails().getVideoState())) {
                    defpackage.pvf.a.b().l("com/android/dialer/incall/core/video/impl/CameraController", "onCallDialingStarted", 404, "CameraController.java").v("dialing video call, using front camera");
                    pvfVar.f(defpackage.pur.b);
                    pvfVar.g();
                }
                return ajcm.a;
            case 3:
                ((defpackage.pxm) this.a).c.set(true);
                return ajcm.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((defpackage.qgn) this.a).a(qbc.dV);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.she sheVar = (defpackage.she) this.a;
                return aosv.F(sheVar.b, 0, new defpackage.sge(sheVar, (aoln) null, 4, (byte[]) null), 3);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.uiw uiwVar = (defpackage.uiw) this.a.a();
                return aosv.F(uiwVar.b, 0, new defpackage.txf(uiwVar, (aoln) null, 15, (byte[]) null), 3);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((defpackage.wcz) this.a).a();
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                aimw aimwVarL = defpackage.wky.a.b().i(zct.a).l("com/android/dialer/xatu/impl/service/XatuController", "onCallDialingStarted", 235, "XatuController.java");
                java.lang.Object obj = this.a;
                defpackage.wky wkyVar = (defpackage.wky) obj;
                aimwVarL.y("[%s] dialing", wkyVar.m);
                adag adagVar = new adag((byte[]) null);
                adagVar.n("SELECT count(*) FROM xatu_data");
                return ahrv.g(wkyVar.n.c.F(new jsh(adagVar.B(), 17))).h(new defpackage.wie(obj, 13), wkyVar.g);
            default:
                defpackage.zqu zquVar = (defpackage.zqu) this.a;
                return aosv.F(zquVar.c, 0, new defpackage.ryc(zquVar, (aoln) null, 8, (byte[]) null), 3);
        }
    }
}
