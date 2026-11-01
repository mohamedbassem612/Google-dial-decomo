package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class sxq implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public sxq(com.android.dialer.playback.CallRecordingPlayer callRecordingPlayer, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(callRecordingPlayer);
        this.a = callRecordingPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                android.content.Intent intent = new android.content.Intent();
                intent.setAction("com.android.dialer.revelio.ACTION_SET_DEFAULT_REVELIO_SETTINGS");
                android.content.Context context = ((defpackage.sxr) this.a).a;
                intent.setPackage(context.getPackageName());
                context.sendBroadcast(intent);
                break;
            case 1:
                com.android.dialer.playback.CallRecordingPlayer callRecordingPlayer = (com.android.dialer.playback.CallRecordingPlayer) this.a;
                callRecordingPlayer.o.setProgress(callRecordingPlayer.e.getCurrentPosition());
                callRecordingPlayer.c.postDelayed(this, 50L);
                break;
            case 2:
                defpackage.szs szsVar = (defpackage.szs) this.a;
                szsVar.z = true;
                szsVar.E.a(ajcm.a);
                break;
            case 3:
                aimz aimzVar = defpackage.szs.a;
                aimzVar.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController", "resumeRecordingAndCallerTranscript", 874, "RevelioController.java").v("enter");
                defpackage.szs szsVar2 = (defpackage.szs) this.a;
                szsVar2.p.d(false);
                j$.util.Optional optional = szsVar2.m.h;
                if (true == optional.isPresent()) {
                    java.lang.Object obj = optional.get();
                    aimzVar.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController", "resumeRecordingAndCallerTranscript", 880, "RevelioController.java").v("resume recording");
                    ((java.util.concurrent.atomic.AtomicBoolean) ((vwb) obj).b).set(false);
                }
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                aimz aimzVar2 = defpackage.szs.a;
                aimzVar2.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController", "pauseRecordingAndCallerTranscript", 858, "RevelioController.java").v("enter");
                defpackage.szs szsVar3 = (defpackage.szs) this.a;
                szsVar3.p.d(true);
                j$.util.Optional optional2 = szsVar3.m.h;
                if (true == optional2.isPresent()) {
                    java.lang.Object obj2 = optional2.get();
                    aimzVar2.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController", "pauseRecordingAndCallerTranscript", 864, "RevelioController.java").v("pause recording");
                    ((java.util.concurrent.atomic.AtomicBoolean) ((vwb) obj2).b).set(true);
                }
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                ((defpackage.szs) this.a).w = true;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.tam tamVar = (defpackage.tam) this.a;
                tamVar.n = false;
                tamVar.q.a(ajcm.a);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                ((defpackage.tcl) this.a).a();
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.tcl tclVar = (defpackage.tcl) this.a;
                tclVar.a();
                defpackage.tcl.b.b().l("com/android/dialer/ringing/RingingManager", "activateFlipToSilence", 303, "RingingManager.java").v("flip observed");
                tclVar.m.o(rmx.dF);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                java.lang.Object obj3 = this.a;
                ((defpackage.tja) obj3).b.n(rmw.fb);
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Object obj4 = this.a;
                ((defpackage.tja) obj4).b.n(rmw.fb);
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                java.lang.Object obj5 = this.a;
                ((defpackage.tja) obj5).b.n(rmw.fb);
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                android.view.animation.Interpolator interpolator = defpackage.tji.a;
                ((com.google.android.material.card.MaterialCardView) this.a).getLayoutParams().height = -2;
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                ((defpackage.tkd) this.a).al.e();
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((defpackage.tkd) this.a).al.C(aike.a, 1);
                break;
            case 15:
                java.lang.Object obj6 = this.a;
                defpackage.tvg tvgVar = new defpackage.tvg(obj6, 7);
                defpackage.uaq uaqVar = (defpackage.uaq) obj6;
                uaqVar.g.g(uaqVar.m.g(tvgVar, uaqVar.f), 5L, java.util.concurrent.TimeUnit.SECONDS);
                break;
            case 16:
                ((defpackage.uaq) this.a).c();
                break;
            case 17:
                ((uhs) this.a).d.set(false);
                break;
            case 18:
                ((defpackage.uoo) this.a).x.i((java.lang.String) null).b(mce.fk);
                break;
            case 19:
                ((rlv) ((uqe) this.a).e.a()).o(rmx.gY);
                break;
            default:
                aimw aimwVarL = uqf.a.b().l("com/android/dialer/startup/mainactivitystartup/MainActivityStartupMonitor", "onApplicationCreated$<anonymous>", 32, "MainActivityStartupMonitor.kt");
                uqf uqfVar = (uqf) this.a;
                aimwVarL.y("mainActivityCreated: %b", java.lang.Boolean.valueOf(uqfVar.b));
                if (!uqfVar.b) {
                    uqfVar.c.i((java.lang.String) null).b(mce.c);
                }
                break;
        }
    }

    public /* synthetic */ sxq(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
