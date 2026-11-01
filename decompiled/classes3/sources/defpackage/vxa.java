package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vxa implements android.view.View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ vxa(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, oqx] */
    /* JADX WARN: Type inference failed for: r6v19, types: [aonj, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        switch (this.$cid) {
            case 0:
                defpackage.vxq vxqVar = (defpackage.vxq) this.a;
                vxqVar.m.n(rmw.bh);
                ahqx.l(vxqVar.g, new android.content.Intent(vxqVar.b, (java.lang.Class<?>) com.android.dialer.voicemail.tab.impl.ui.ArchivedVisualVoicemailActivity.class));
                break;
            case 1:
                defpackage.vwk vwkVar = (defpackage.vwk) this.a;
                if (vwkVar.f.isPresent() && (((defpackage.vtx) vwkVar.f.orElseThrow()).b & 16) != 0) {
                    defpackage.vvb vvbVar = vwkVar.g;
                    aw awVar = vwkVar.a;
                    defpackage.vtw vtwVar = ((defpackage.vtx) vwkVar.f.orElseThrow()).g;
                    if (vtwVar == null) {
                        vtwVar = defpackage.vtw.a;
                    }
                    int iAd = a.ad(vtwVar.c);
                    int i = iAd != 0 ? iAd : 1;
                    vzi vziVar = ((defpackage.vtx) vwkVar.f.orElseThrow()).c;
                    if (vziVar == null) {
                        vziVar = vzi.a;
                    }
                    vvbVar.d(awVar, i, vziVar);
                    break;
                }
                break;
            case 2:
                this.a.e();
                break;
            case 3:
                ahvr.j(new defpackage.vxv(((kiu) this.a).d), view);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                ahvr.j(new defpackage.vxu(((kiu) this.a).d), view);
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                ((gc) this.a).f();
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aooh.f(view, "p0");
                this.a.a(view);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                az azVarE = com.android.dialer.widget.DialerMaterialToolbar.E(((com.android.dialer.widget.DialerMaterialToolbar) this.a).getContext());
                if (azVarE instanceof az) {
                    azVarE.fc().e();
                }
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                android.app.Activity activityE = com.android.dialer.widget.DialerMaterialToolbar.E(((com.android.dialer.widget.DialerMaterialToolbar) this.a).getContext());
                if (activityE != null) {
                    activityE.finish();
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                ((android.app.Activity) this.a).finish();
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                ((com.android.dialer.widget.DialerToolbar) this.a).getContext().fc().e();
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                ahvr.j(defpackage.wej.a, ((defpackage.wel) this.a).a);
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                ahvr.j(defpackage.wej.a, ((defpackage.wel) this.a).b);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                ahvr.j(defpackage.wek.a, ((defpackage.wel) this.a).c);
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                j$.util.Optional optionalB = ((defpackage.wtk) this.a).b();
                if (true == optionalB.isPresent()) {
                    defpackage.wkp wkpVar = (defpackage.wkp) optionalB.get();
                    defpackage.wha whaVar = defpackage.wha.ADDON_FEATURE_KEY_HOLD_FOR_ME;
                    aimz aimzVar = zih.a;
                    aoov.al(wkpVar.b, zih.b.plus(aols.a), 1, new defpackage.tgn((aoln) null, wkpVar, whaVar, 10));
                }
                break;
            case 15:
                ((defpackage.agbv) this.a).e(3);
                break;
            case 16:
                ((defpackage.agbv) this.a).e(3);
                break;
            case 17:
                ((defpackage.agbv) this.a).e(3);
                break;
            case 18:
                defpackage.wtk wtkVar = (defpackage.wtk) this.a;
                wtkVar.u(28);
                wtkVar.e(defpackage.wre.USER_ENDED);
                break;
            case 19:
                ((defpackage.agbv) this.a).e(3);
                break;
            default:
                defpackage.wtk wtkVar2 = (defpackage.wtk) this.a;
                wtkVar2.u(29);
                wtkVar2.e(defpackage.wre.USER_ENDED);
                break;
        }
    }

    public vxa(defpackage.vwk vwkVar, int i) {
        this.$cid = i;
        this.a = vwkVar;
    }
}
