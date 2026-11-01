package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class szq implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ defpackage.szs a;

    public /* synthetic */ szq(defpackage.szs szsVar, int i) {
        this.$cid = i;
        this.a = szsVar;
    }

    public final ajcq a(java.lang.Object obj) {
        int i = 4;
        int i2 = 2;
        switch (this.$cid) {
            case 0:
                lgj lgjVar = (lgj) obj;
                defpackage.szs szsVar = this.a;
                if (lgjVar == lgj.d) {
                    szsVar.j();
                }
                return szsVar.m.d(lgj.e);
            case 1:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.szs.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController", "startScreeningTimeout", 321, "RevelioController.java").v("Revelio outcome has already been determined, do not attempt to send the call to the user due to screening timeout");
                    return aiql.z(java.lang.Boolean.FALSE);
                }
                defpackage.szs szsVar2 = this.a;
                defpackage.szs.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController", "startScreeningTimeout", 327, "RevelioController.java").v("Revelio screening exceeded timeout and no outcome has been determined, attempt to send the call to the user.");
                ahrv ahrvVarG = ahrv.g(ahvr.F(new defpackage.sws(szsVar2, 6), szsVar2.g));
                defpackage.szq szqVar = new defpackage.szq(szsVar2, 11);
                ajcu ajcuVar = szsVar2.e;
                return ahrvVarG.i(szqVar, ajcuVar).h(new defpackage.syf(10), ajcuVar);
            case 2:
                return this.a.f(false);
            case 3:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                defpackage.szs szsVar3 = this.a;
                if (!zBooleanValue) {
                    return ahvr.H(szsVar3.b(), new defpackage.syf(7), szsVar3.e);
                }
                szsVar3.l(9);
                szsVar3.D.a(qbc.fl);
                return ahvr.I(szsVar3.h(defpackage.amrc.CALL_AUTO_REJECTED), new defpackage.szq(szsVar3, i2), szsVar3.e);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return this.a.c();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.szs.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController", "playVoicemailAudioMessages", 842, "RevelioController.java").v("revelio outcome has been determined on the call before during transfer to voicemail, does not play voicemail beep sound");
                    return ajcm.a;
                }
                defpackage.szs szsVar4 = this.a;
                defpackage.szs.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController", "playVoicemailAudioMessages", 847, "RevelioController.java").v("revelio outcome has not been determined before the voicemail timeout, play the voicemail beep sound");
                defpackage.tbj tbjVar = szsVar4.o;
                return ahvr.I(tbjVar.d.a(2131951720, "voicemail_beep_sound.ogg"), new defpackage.tai(tbjVar, 20), tbjVar.c);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return aiql.z(java.lang.Boolean.FALSE);
                }
                defpackage.szs szsVar5 = this.a;
                if (!((java.lang.Boolean) szsVar5.t.a()).booleanValue() || szsVar5.k()) {
                    return ahvr.I(szsVar5.m.b(), new defpackage.szq(szsVar5, 13), szsVar5.g);
                }
                defpackage.szs.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController", "canSendCallToUser", 697, "RevelioController.java").v("Not sending call to user, current call is not the active Revelio session.");
                return aiql.z(java.lang.Boolean.FALSE);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.szs szsVar6 = this.a;
                return ahvr.E(new defpackage.sxq(szsVar6, 4), szsVar6.g);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return this.a.f(false);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return ajcm.a;
                }
                defpackage.szs szsVar7 = this.a;
                szsVar7.D.a(qbc.fs);
                return szsVar7.a();
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.szs szsVar8 = this.a;
                int iIntValue = ((java.lang.Long) szsVar8.r.a()).intValue();
                defpackage.tbj.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/soundplayer/RevelioInCallAudioPlayer", "playRingingSoundToCaller", 97, "RevelioInCallAudioPlayer.java").w("playing ringingSound with maximum loop count: %d", iIntValue);
                if (iIntValue <= 0) {
                    return aiql.y(new java.lang.IllegalArgumentException("numLoops must be greater than zero"));
                }
                defpackage.tbj tbjVar2 = szsVar8.o;
                return ahvr.I(tbjVar2.d.a(2131951621, "ringing_sound.ogg"), new lhb(tbjVar2, iIntValue, 3), tbjVar2.c);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return this.a.b();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.amrc amrcVar = (defpackage.amrc) obj;
                defpackage.szs szsVar9 = this.a;
                return amrcVar == defpackage.amrc.CALL_AUTO_REJECTED ? szsVar9.l.c(lgq.f) : szsVar9.l.c(lgq.b);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                lgj lgjVar2 = (lgj) obj;
                if (lgjVar2 != lgj.c && lgjVar2 != lgj.d) {
                    return aiql.z(java.lang.Boolean.FALSE);
                }
                defpackage.szs szsVar10 = this.a;
                if (szsVar10.B) {
                    return aiql.z(java.lang.Boolean.TRUE);
                }
                ajcq ajcqVarF = ahvr.F(new defpackage.sws(szsVar10, 3), szsVar10.g);
                ajcq ajcqVarE = szsVar10.e();
                defpackage.syf syfVar = new defpackage.syf(9);
                ajcu ajcuVar2 = szsVar10.e;
                ajcq ajcqVarH = ahvr.H(ajcqVarE, syfVar, ajcuVar2);
                return ahvr.ak(new ajcq[]{ajcqVarF, ajcqVarH}).o(new defpackage.syg(ajcqVarF, ajcqVarH, 2), ajcuVar2);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return this.a.c();
            case 15:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return ajcm.a;
                }
                defpackage.szs szsVar11 = this.a;
                szsVar11.D.a(qbc.fw);
                return szsVar11.h(defpackage.amrc.CALLER_DISCONNECTED);
            case 16:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.szs.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController", "canAutoRejectCallDueToSpam", 645, "RevelioController.java").v("outcome has already been determined");
                    return aiql.z(java.lang.Boolean.FALSE);
                }
                defpackage.szs szsVar12 = this.a;
                return ahvr.F(new defpackage.sws(szsVar12, 8), szsVar12.g);
            case 17:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.szs.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController", "updateCallerWhileWaitingForUserWithAutoRejectTimeout", 777, "RevelioController.java").v("user took action on the call before playing transfer to voicemail message");
                    return ajcm.a;
                }
                defpackage.szs szsVar13 = this.a;
                defpackage.szs.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController", "updateCallerWhileWaitingForUserWithAutoRejectTimeout", 782, "RevelioController.java").v("ringing timed out and the user took no action, play transfer to voicemail message");
                defpackage.tbj.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/soundplayer/RevelioInCallAudioPlayer", "playTransferToVoicemailAudioMessage", 133, "RevelioInCallAudioPlayer.java").v("playing transferToVoicemailAudioMessage");
                defpackage.tbj tbjVar3 = szsVar13.o;
                ahrv ahrvVarG2 = ahrv.g(ahrv.g(tbjVar3.a().bL()).i(new defpackage.tai(tbjVar3, 19), tbjVar3.c));
                defpackage.szq szqVar2 = new defpackage.szq(szsVar13, i);
                ajcu ajcuVar3 = szsVar13.e;
                return ahrvVarG2.i(szqVar2, ajcuVar3).i(new defpackage.szq(szsVar13, 5), ajcuVar3);
            case 18:
                defpackage.szs szsVar14 = this.a;
                return ahvr.E(new defpackage.sxq(szsVar14, 3), szsVar14.g);
            case 19:
                defpackage.szs.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController", "updateCallerWhileWaitingForUserWithAutoRejectTimeout", 791, "RevelioController.java").v("schedule waiting time for revelio voicemail");
                fvl fvlVar = new fvl(7);
                defpackage.szs szsVar15 = this.a;
                return szsVar15.e.b(fvlVar, ((java.lang.Long) szsVar15.q.a()).longValue(), java.util.concurrent.TimeUnit.SECONDS);
            default:
                return this.a.c();
        }
    }
}
