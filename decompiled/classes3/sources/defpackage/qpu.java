package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qpu implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ qpu(java.lang.Object obj, boolean z, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = z;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        int i = this.$cid;
        if (i == 0) {
            return (this.a && ((defpackage.pgi) this.b).b()) ? j$.util.Optional.of(defpackage.qtz.SNACKBAR_NO_MOBILE_DATA) : j$.util.Optional.empty();
        }
        if (i == 1) {
            java.lang.Object obj = this.b;
            ljs ljsVar = (ljs) obj;
            java.lang.Object obj2 = ljsVar.c;
            boolean z = this.a;
            synchronized (obj2) {
                ahvr.bZ(((ljs) obj).a() == ljr.c, "Mute state cannot be set before the call flow has started");
            }
            adpe adpeVar = ljsVar.i;
            ahvr.bZ(adpeVar.h(), "setDownlinkMuteState called when callAudioManager is not initialized");
            synchronized (ljsVar.e) {
                if (z) {
                    try {
                        ljs.a.b().l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "setDownlinkMuteStateAsyncInternal", 738, "ForkedIncomingCallFlowManager.java").v("Muting downlink audio by user request");
                        adpeVar.b().d();
                        ((ljs) obj).k.set(false);
                    } catch (adpd e) {
                        throw new adof(e, defpackage.adoe.e);
                    }
                } else {
                    ljs.a.b().l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "setDownlinkMuteStateAsyncInternal", 745, "ForkedIncomingCallFlowManager.java").v("Unmuting downlink audio by user request");
                    ((ljs) obj).k.set(true);
                    ((ljs) obj).i.b().e();
                }
            }
            return null;
        }
        if (i == 2) {
            if (!this.a) {
                return j$.util.Optional.empty();
            }
            java.lang.Object obj3 = this.b;
            akzx akzxVarM = defpackage.qty.a.m();
            defpackage.qug qugVar = defpackage.qug.BUTTON_UPGRADE_TO_CARRIER_VIDEO;
            akzxVarM.u();
            defpackage.qty qtyVar = (defpackage.qty) akzxVarM.b;
            qtyVar.c = qugVar.H;
            qtyVar.b |= 1;
            android.content.Context context = (android.content.Context) obj3;
            java.lang.String string = context.getString(2132019080);
            akzxVarM.u();
            defpackage.qty qtyVar2 = (defpackage.qty) akzxVarM.b;
            j$.util.Objects.requireNonNull(string);
            qtyVar2.b |= 4;
            qtyVar2.e = string;
            akzxVarM.u();
            defpackage.qty qtyVar3 = (defpackage.qty) akzxVarM.b;
            qtyVar3.b |= 2;
            qtyVar3.d = 2131231658;
            java.lang.String string2 = context.getString(2132019080);
            akzxVarM.u();
            defpackage.qty qtyVar4 = (defpackage.qty) akzxVarM.b;
            j$.util.Objects.requireNonNull(string2);
            qtyVar4.b |= 8;
            qtyVar4.f = string2;
            akzxVarM.u();
            defpackage.qty qtyVar5 = (defpackage.qty) akzxVarM.b;
            qtyVar5.b |= 16;
            qtyVar5.g = true;
            return j$.util.Optional.of((defpackage.qty) akzxVarM.p());
        }
        if (i == 3) {
            akzx akzxVarM2 = defpackage.quf.a.m();
            defpackage.qug qugVar2 = defpackage.qug.BUTTON_ADD_CALL;
            akzxVarM2.u();
            defpackage.quf qufVar = (defpackage.quf) akzxVarM2.b;
            qufVar.e = qugVar2.H;
            qufVar.b |= 1;
            akzxVarM2.u();
            defpackage.quf qufVar2 = (defpackage.quf) akzxVarM2.b;
            qufVar2.c = 2;
            qufVar2.d = 2131231282;
            android.content.Context context2 = (android.content.Context) this.b;
            java.lang.String string3 = context2.getString(2132019063);
            akzxVarM2.u();
            defpackage.quf qufVar3 = (defpackage.quf) akzxVarM2.b;
            j$.util.Objects.requireNonNull(string3);
            qufVar3.b |= 4;
            qufVar3.g = string3;
            java.lang.String string4 = context2.getString(2132019063);
            akzxVarM2.u();
            defpackage.quf qufVar4 = (defpackage.quf) akzxVarM2.b;
            j$.util.Objects.requireNonNull(string4);
            qufVar4.b |= 8;
            qufVar4.h = string4;
            defpackage.que queVar = defpackage.que.MORE;
            akzxVarM2.u();
            defpackage.quf qufVar5 = (defpackage.quf) akzxVarM2.b;
            qufVar5.l = queVar.g;
            qufVar5.b |= 512;
            akzxVarM2.u();
            defpackage.quf qufVar6 = (defpackage.quf) akzxVarM2.b;
            qufVar6.b |= 16;
            qufVar6.i = this.a;
            return j$.util.Optional.of((defpackage.quf) akzxVarM2.p());
        }
        if (i == 4) {
            if (!this.a) {
                return j$.util.Optional.empty();
            }
            j$.util.Optional optional = (j$.util.Optional) ((defpackage.wpm) this.b).b.get();
            if (!optional.isPresent()) {
                return j$.util.Optional.empty();
            }
            if (optional.orElseThrow() != defpackage.wpl.CALL_ON_TELEPHONY_HOLD) {
                return j$.util.Optional.empty();
            }
            defpackage.rea reaVar = defpackage.rea.CONTROLLER_XATU;
            defpackage.req reqVar = new defpackage.req();
            reqVar.e(2132021063);
            reqVar.b(2132021061);
            reqVar.d(2132021062);
            reqVar.c(android.R.string.cancel);
            return j$.util.Optional.of(new defpackage.reo(reaVar, pez.bq(reqVar.a())));
        }
        if (i != 5) {
            java.lang.Object obj4 = this.b;
            defpackage.adow adowVar = (defpackage.adow) obj4;
            java.lang.Object obj5 = adowVar.c;
            boolean z2 = this.a;
            synchronized (obj5) {
                ahvr.bZ(((defpackage.adow) obj4).a() == defpackage.adov.c, "Mute state cannot be set before the call flow has started");
            }
            adpe adpeVar2 = adowVar.i;
            ahvr.bZ(adpeVar2.h(), "setDownlinkMuteState called when callAudioManager is not initialized");
            synchronized (adowVar.e) {
                if (z2) {
                    try {
                        defpackage.adow.a.b().l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager", "setDownlinkMuteStateAsyncInternal", 661, "IncomingCallFlowManager.java").v("Muting downlink audio by user request");
                        adpeVar2.b().d();
                        ((defpackage.adow) obj4).k.set(false);
                    } catch (adpd e2) {
                        throw new adof(e2, defpackage.adoe.e);
                    }
                } else {
                    defpackage.adow.a.b().l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager", "setDownlinkMuteStateAsyncInternal", 668, "IncomingCallFlowManager.java").v("Unmuting downlink audio by user request");
                    ((defpackage.adow) obj4).k.set(true);
                    ((defpackage.adow) obj4).i.b().e();
                }
            }
            return null;
        }
        boolean z3 = this.a;
        java.lang.Object obj6 = this.b;
        if (!z3) {
            defpackage.xbs xbsVar = (defpackage.xbs) obj6;
            xbsVar.c(0, false);
            xbsVar.c(6, false);
            if (!xbsVar.d.isPresent()) {
                return null;
            }
            xbsVar.d(0, ((defpackage.xbr) xbsVar.d.orElseThrow()).b());
            xbsVar.d(6, ((defpackage.xbr) xbsVar.d.orElseThrow()).a());
            xbsVar.d = j$.util.Optional.empty();
            return null;
        }
        defpackage.xbs xbsVar2 = (defpackage.xbs) obj6;
        if (!xbsVar2.d.isPresent()) {
            aimz aimzVar = defpackage.xbs.a;
            aimzVar.b().l("com/android/incallui/atlas/ui/impl/tidepods/service/callaudiomuter/HoldForMeCallAudioMuter", "setCallStreamsMuted", 146, "HoldForMeCallAudioMuter.java").v("muting call streams for the first time after it was unmuted");
            android.media.AudioManager audioManager = xbsVar2.b;
            xbsVar2.d = j$.util.Optional.of(new defpackage.xbq(audioManager.getStreamVolume(0), audioManager.getStreamVolume(6)));
            aimzVar.b().l("com/android/incallui/atlas/ui/impl/tidepods/service/callaudiomuter/HoldForMeCallAudioMuter", "setCallStreamsMuted", 154, "HoldForMeCallAudioMuter.java").y("current volume: %s", xbsVar2.d);
        }
        xbsVar2.d(0, 2);
        xbsVar2.d(6, 2);
        xbsVar2.c(0, true);
        xbsVar2.c(6, true);
        return null;
    }

    public /* synthetic */ qpu(boolean z, java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = z;
        this.b = obj;
    }
}
