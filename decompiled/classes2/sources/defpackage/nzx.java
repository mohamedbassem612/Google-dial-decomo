package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class nzx implements zof {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ nzx(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final void a() {
        int i = this.$cid;
        if (i == 0) {
            aimz aimzVar = zih.a;
            aolr aolrVarPlus = zih.b.plus(aols.a);
            oac oacVar = (oac) this.a;
            aoov.al(oacVar.e, aolrVarPlus, 1, new defpackage.loe((aoln) null, oacVar, 13));
            return;
        }
        if (i == 1) {
            aimz aimzVar2 = zih.a;
            aolr aolrVarPlus2 = zih.b.plus(aols.a);
            hvy hvyVar = (hvy) this.a;
            aoov.al(hvyVar.c, aolrVarPlus2, 1, new defpackage.dqx((aoln) null, hvyVar, 7));
            return;
        }
        if (i == 2) {
            pff pffVar = (pff) this.a;
            if (pffVar.f.isPresent() && ((pfh) pffVar.f.orElseThrow()).b) {
                ahzi ahziVar = pffVar.b;
                if (((j$.util.Optional) ahziVar.eZ()).isPresent()) {
                    pff.a.b().l("com/android/dialer/incall/bubble/dialerbubble/DialerBubbleController", "onAllCallsRemoved", 162, "DialerBubbleController.java").v("showing call ended toast");
                    wdx wdxVar = (wdx) ((j$.util.Optional) ahziVar.eZ()).orElseThrow();
                    java.lang.String string = pffVar.c.getString(2132019028);
                    wdx.a.b().l("com/android/dialer/widget/bubble/impl/BubbleImpl", "showText", 570, "BubbleImpl.java").y("text: %s", string);
                    agsm.i(1051, ahvr.E(new wdm(wdxVar, string, 0), wdxVar.f), "Failed to show bubble toast: %s", new java.lang.Object[]{string});
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            j$.util.Optional optional = (j$.util.Optional) ((pvk) this.a).c.getAndSet(j$.util.Optional.empty());
            if (true == optional.isPresent()) {
                pxj pxjVar = (pxj) optional.get();
                pvk.a.b().l("com/android/dialer/incall/core/video/impl/SingletonVideoSurfaceCache", "onAllCallsRemoved", 43, "SingletonVideoSurfaceCache.java").v("releasing the SurfaceTextures.");
                pxjVar.c.release();
                pxjVar.a.release();
                pxjVar.d.release();
                pxjVar.b.release();
                return;
            }
            return;
        }
        if (i == 4) {
            qbx.a.b().l("com/android/dialer/incall/motorolaincalluinotifier/MotorolaInCallUiNotifier", "allCallsRemovedListener$<anonymous>", 27, "MotorolaInCallUiNotifier.kt").v("all calls removed, notifying state");
            ((qbx) this.a).a(false);
        } else if (i != 5) {
            if (((qqm) this.a).c.getAndSet(false)) {
                a.bI(qqm.a.d(), "isDialogShowing leaks unexpectedly", "com/android/dialer/incall/video/service/VideoDialogMonitor", "onAllCallsRemoved", '+', "VideoDialogMonitor.java", zct.b);
            }
        } else {
            qdu.a.b().l("com/android/dialer/incall/proximitysensor/impl/incall/InCallProximityController", "onAllCallsRemoved", 188, "InCallProximityController.java").v("enableInCallProximityControllerSequencer enabled; Using sequenced proximity sensor events");
            java.lang.Object obj = this.a;
            defpackage.omj omjVar = new defpackage.omj(obj, 20);
            qdu qduVar = (qdu) obj;
            agsm.i(591, qduVar.k.g(omjVar, qduVar.i), "Failed to disable proximity sensor on all calls removal.", new java.lang.Object[0]);
        }
    }
}
