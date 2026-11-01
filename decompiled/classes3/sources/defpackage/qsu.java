package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qsu implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ qsu(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v23, types: [java.lang.Object, zas] */
    /* JADX WARN: Type inference failed for: r10v24, types: [java.lang.Object, zas] */
    @Override // java.lang.Runnable
    public final void run() {
        qbc qbcVar;
        int i = 11;
        switch (this.$cid) {
            case 0:
                ((defpackage.pnb) this.a).e();
                return;
            case 1:
                aihd aihdVar = defpackage.qtd.a;
                ((android.view.View) this.a).setVisibility(4);
                return;
            case 2:
                java.lang.Object obj = this.a;
                defpackage.qtm qtmVar = (defpackage.qtm) obj;
                int andSet = qtmVar.d.getAndSet(0);
                java.util.concurrent.atomic.AtomicInteger atomicInteger = qtmVar.f;
                int i2 = atomicInteger.get();
                if (andSet == 0) {
                    j$.util.Optional optionalH = qtmVar.g.h();
                    defpackage.qst qstVar = new defpackage.qst(obj, i);
                    if (true == optionalH.isPresent()) {
                        java.lang.Object obj2 = optionalH.get();
                        java.lang.Object obj3 = qstVar.a;
                        defpackage.qbe qbeVarCp = ((defpackage.qtk) ((defpackage.apqr) obj2).a(defpackage.qtk.class)).cp();
                        int iOrdinal = ((defpackage.qtm) obj3).b.ordinal();
                        if (iOrdinal == 0) {
                            qbcVar = qbc.ht;
                        } else if (iOrdinal == 1) {
                            qbcVar = qbc.hu;
                        } else {
                            if (iOrdinal != 2) {
                                throw new java.lang.AssertionError("exhaustive switch");
                            }
                            qbcVar = qbc.hv;
                        }
                        qbeVarCp.a(qbcVar);
                    }
                    andSet = 0;
                }
                if ((andSet == 0) != (i2 == 0) || java.lang.Math.abs(andSet - i2) >= 5) {
                    defpackage.qtm.a.b().l("com/android/dialer/incall/video/view/SurfaceTextureTracker", "track", 130, "SurfaceTextureTracker.java").G("%s fps: %d", qtmVar.b, andSet);
                    atomicInteger.set(andSet);
                    return;
                }
                return;
            case 3:
                this.a.b(mce.gO);
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                this.a.b(mce.gP);
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.rap rapVar = (defpackage.rap) this.a;
                if (rapVar.m > 0) {
                    rapVar.g();
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.rap rapVar2 = (defpackage.rap) this.a;
                akzx akzxVarP = rapVar2.l.p();
                akzxVarP.u();
                defpackage.rce rceVar = (defpackage.rce) akzxVarP.b;
                rceVar.b &= -3;
                rceVar.d = 0;
                rapVar2.l = (defpackage.rce) akzxVarP.p();
                defpackage.rcd rcdVarB = defpackage.rcd.b(rapVar2.l.c);
                if (rcdVarB == null) {
                    rcdVarB = defpackage.rcd.EMPTY;
                }
                if (rcdVarB == defpackage.rcd.MULTIBINDING_PROVIDED_FRAGMENT) {
                    defpackage.rce rceVar2 = defpackage.rcf.a;
                    rapVar2.l = defpackage.rcf.a;
                    rapVar2.p.a(ajcm.a);
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.rap rapVar3 = (defpackage.rap) this.a;
                defpackage.rce rceVar3 = rapVar3.l;
                defpackage.rce rceVar4 = defpackage.rcf.a;
                if (rceVar3.equals(defpackage.rcf.a(defpackage.qtr.AUDIO_ROUTE_SELECTOR))) {
                    rapVar3.l = defpackage.rcf.a;
                    rapVar3.e(qbc.gp);
                    rapVar3.p.a(ajcm.a);
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.lang.Object obj4 = this.a;
                defpackage.rap rapVar4 = (defpackage.rap) obj4;
                int i3 = rapVar4.m + 1;
                rapVar4.m = i3;
                if (i3 == 1) {
                    defpackage.rak rakVar = rapVar4.j;
                    ajcq ajcqVarH = ahvr.H(rakVar.b(), new defpackage.qgx(obj4, i), rapVar4.k);
                    agsm agsmVar = rapVar4.h;
                    agsmVar.g(ajcqVarH, 5L, java.util.concurrent.TimeUnit.SECONDS);
                    agsmVar.g(rakVar.f.g(new raj(rakVar, 1), rakVar.d), 5L, java.util.concurrent.TimeUnit.SECONDS);
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.rap rapVar5 = (defpackage.rap) this.a;
                int i4 = rapVar5.n + 1;
                rapVar5.n = i4;
                if (i4 == 2) {
                    rapVar5.g();
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.rdk rdkVar = (defpackage.rdk) this.a;
                j$.util.Optional optionalH2 = rdkVar.G.h();
                aooh.e(optionalH2, "getPrimaryCallScope(...)");
                defpackage.apqr apqrVar = (defpackage.apqr) aooh.q(optionalH2);
                rdkVar.J.i((java.lang.String) (apqrVar != null ? apqrVar.b : null)).b(mce.bf);
                return;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.rhp rhpVar = (defpackage.rhp) this.a;
                if (!rhpVar.e.get() && rhpVar.f.get()) {
                    rhpVar.i.a(qbc.ej);
                }
                rhpVar.d.set(true);
                rhpVar.k.s(ajcm.a, defpackage.rhp.a);
                return;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.rqz.a.b().l("com/android/dialer/main/impl/ui/searchcontainer/DialpadSearchFragmentPeer", "onViewCreated$<anonymous>$<anonymous>", 217, "DialpadSearchFragmentPeer.kt").v("view drawn");
                defpackage.rqz rqzVar = (defpackage.rqz) this.a;
                rqzVar.c(mce.eS);
                rqzVar.g.h(defpackage.rhx.b(rqzVar.c) ? defpackage.rua.d : rtz.d, rqzVar.d);
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.rri.b.b().l("com/android/dialer/main/impl/ui/searchcontainer/NewDialpadSearchFragmentPeer", "onViewCreated$<anonymous>$<anonymous>", 211, "NewDialpadSearchFragmentPeer.kt").v("view drawn");
                defpackage.rri rriVar = (defpackage.rri) this.a;
                rriVar.c(mce.eS);
                rriVar.h.h(defpackage.rhx.b(rriVar.d) ? defpackage.rua.d : rtz.d, rriVar.e);
                return;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.rrm rrmVar = (defpackage.rrm) this.a;
                rrmVar.g.i((java.lang.String) null).b(mce.y);
                rrmVar.e.h(rtz.d, rrmVar.b);
                return;
            case 15:
                defpackage.rrr rrrVar = (defpackage.rrr) this.a;
                rrrVar.h.i((java.lang.String) null).b(mce.y);
                rrrVar.f.h(rtz.d, rrrVar.b);
                return;
            case 16:
                ((gpd) ((rsq) this.a).a.b).i((java.lang.String) null).b(mce.gJ);
                return;
            case 17:
                ((gpd) ((rsq) this.a).a.b).i((java.lang.String) null).b(mce.gM);
                return;
            case 18:
                ((defpackage.rtp) this.a).n.i((java.lang.String) null).b(mce.gJ);
                return;
            case 19:
                ((defpackage.rtp) this.a).n.i((java.lang.String) null).b(mce.gM);
                return;
            default:
                android.content.Context context = (android.content.Context) this.a;
                android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class);
                if (notificationManager == null) {
                    return;
                }
                java.util.Set setC = rwu.c(context);
                java.util.Iterator it = notificationManager.getNotificationChannels().iterator();
                while (it.hasNext()) {
                    java.lang.String id = defpackage.aa$$ExternalSyntheticApiModelOutline0.m(it.next()).getId();
                    if (id.startsWith("phone_voicemail_account_") && !setC.contains(id)) {
                        try {
                            da$.ExternalSyntheticApiModelOutline1.m(notificationManager, id);
                        } catch (java.lang.SecurityException e) {
                            rwu.a.d().k(e).l("com/android/dialer/notification/channel/VoicemailChannelUtils", "deleteObsoleteVoicemailChannels", 130, "VoicemailChannelUtils.java").y("deleteObsoleteVoicemailChannels failed for channel %s", id);
                        }
                    }
                }
                return;
        }
    }
}
