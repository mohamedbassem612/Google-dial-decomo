package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vwa implements oh {
    private final /* synthetic */ int $cid;
    final /* synthetic */ az a;

    public vwa(com.android.dialer.voicemail.settings.pin.VoicemailChangePinActivity voicemailChangePinActivity, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(voicemailChangePinActivity);
        this.a = voicemailChangePinActivity;
    }

    /* JADX WARN: Type inference failed for: r6v15, types: [ahgj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v21, types: [ahgj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v27, types: [ahgj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [ahgj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v31, types: [ahgj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [ahgj, java.lang.Object] */
    public final void a() {
        switch (this.$cid) {
            case 0:
                com.android.dialer.voicemail.tab.impl.ui.ArchivedVisualVoicemailActivity archivedVisualVoicemailActivity = this.a;
                archivedVisualVoicemailActivity.z();
                archivedVisualVoicemailActivity.B().i().b();
                break;
            case 1:
                com.android.dialer.voicemail.settings.pin.VoicemailChangePinActivity voicemailChangePinActivity = this.a;
                voicemailChangePinActivity.A();
                voicemailChangePinActivity.B().i().b();
                break;
            case 2:
                com.android.dialer.voicemail.tab.impl.ui.ArchivedVisualVoicemailActivity archivedVisualVoicemailActivity2 = this.a;
                if (!archivedVisualVoicemailActivity2.n) {
                    archivedVisualVoicemailActivity2.n = true;
                    archivedVisualVoicemailActivity2.b().f();
                }
                break;
            case 3:
                az azVar = this.a;
                defpackage.zsm zsmVar = (defpackage.zsm) azVar;
                if (!zsmVar.n) {
                    zsmVar.n = true;
                    zsmVar.b().f();
                }
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                az azVar2 = this.a;
                ((com.google.android.dialershared.precall.impl.PrecallActivity) azVar2).k();
                ((defpackage.zsm) azVar2).B().i().b();
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                com.google.android.libraries.user.profile.photopicker.components.googlephotos.GooglePhotosBottomSheetActivity googlePhotosBottomSheetActivity = this.a;
                com.google.android.libraries.user.profile.photopicker.components.googlephotos.GooglePhotosBottomSheetActivity googlePhotosBottomSheetActivity2 = googlePhotosBottomSheetActivity;
                if (!googlePhotosBottomSheetActivity2.s) {
                    googlePhotosBottomSheetActivity2.s = true;
                    hko hkoVarF = googlePhotosBottomSheetActivity2.b().f();
                    com.google.android.libraries.user.profile.photopicker.components.googlephotos.GooglePhotosBottomSheetActivity googlePhotosBottomSheetActivity3 = googlePhotosBottomSheetActivity;
                    googlePhotosBottomSheetActivity3.q = 139;
                    hip hipVar = hkoVarF.b.a;
                    googlePhotosBottomSheetActivity3.o = (java.lang.String) hipVar.bY.a();
                    defpackage.vaa vaaVar = (defpackage.vaa) hipVar.gZ.a();
                    ajct ajctVar = (ajct) hipVar.a.L.a();
                    defpackage.acmz acmzVar = (defpackage.acmz) hipVar.gY.a();
                    aooh.f(vaaVar, "veContext");
                    aooh.f(ajctVar, "loggingExecutorService");
                    aooh.f(acmzVar, "autoImpressionLogger");
                    new ajdc(ajctVar);
                    googlePhotosBottomSheetActivity3.r = new defpackage.vaa(vaaVar, acmzVar);
                    googlePhotosBottomSheetActivity3.p = (defpackage.acmg) hipVar.ha.a();
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                com.google.apps.tiktok.account.ui.onegoogle.expresssignin.selector.ExpressSignInActivity expressSignInActivity = this.a;
                expressSignInActivity.z();
                expressSignInActivity.B().i().b();
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                com.google.apps.tiktok.account.ui.onegoogle.expresssignin.selector.ExpressSignInActivity expressSignInActivity2 = this.a;
                if (!expressSignInActivity2.n) {
                    expressSignInActivity2.n = true;
                    expressSignInActivity2.b().f();
                }
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                az azVar3 = this.a;
                ((com.google.apps.tiktok.nav.gateway.AnimatedGatewayActivity) azVar3).j();
                ((defpackage.ahjj) azVar3).B().i().b();
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                az azVar4 = this.a;
                ((com.google.apps.tiktok.nav.gateway.GatewayActivity) azVar4).j();
                ((defpackage.ahjk) azVar4).B().i().b();
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                az azVar5 = this.a;
                defpackage.ahjj ahjjVar = (defpackage.ahjj) azVar5;
                if (!ahjjVar.n) {
                    ahjjVar.n = true;
                    ahjjVar.b().f();
                }
                break;
            default:
                az azVar6 = this.a;
                defpackage.ahjk ahjkVar = (defpackage.ahjk) azVar6;
                if (!ahjkVar.n) {
                    ahjkVar.n = true;
                    ahjkVar.b().f();
                }
                break;
        }
    }

    public vwa(com.android.dialer.voicemail.tab.impl.ui.ArchivedVisualVoicemailActivity archivedVisualVoicemailActivity, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(archivedVisualVoicemailActivity);
        this.a = archivedVisualVoicemailActivity;
    }

    public vwa(defpackage.vwn vwnVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(vwnVar);
        this.a = vwnVar;
    }

    public vwa(defpackage.zsm zsmVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(zsmVar);
        this.a = zsmVar;
    }

    public vwa(com.google.android.dialershared.precall.impl.PrecallActivity precallActivity, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(precallActivity);
        this.a = precallActivity;
    }

    public vwa(defpackage.afnz afnzVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(afnzVar);
        this.a = afnzVar;
    }

    public vwa(com.google.apps.tiktok.account.ui.onegoogle.expresssignin.selector.ExpressSignInActivity expressSignInActivity, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(expressSignInActivity);
        this.a = expressSignInActivity;
    }

    public vwa(defpackage.agrf agrfVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(agrfVar);
        this.a = agrfVar;
    }

    public vwa(com.google.apps.tiktok.nav.gateway.AnimatedGatewayActivity animatedGatewayActivity, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(animatedGatewayActivity);
        this.a = animatedGatewayActivity;
    }

    public vwa(com.google.apps.tiktok.nav.gateway.GatewayActivity gatewayActivity, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(gatewayActivity);
        this.a = gatewayActivity;
    }

    public vwa(defpackage.ahjj ahjjVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(ahjjVar);
        this.a = ahjjVar;
    }

    public vwa(defpackage.ahjk ahjkVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(ahjkVar);
        this.a = ahjkVar;
    }
}
