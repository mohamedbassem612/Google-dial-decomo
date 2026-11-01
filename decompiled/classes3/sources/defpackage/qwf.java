package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qwf implements ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ qwf(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, boolean z, int i) {
        this.$cid = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r11v1, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.concurrent.Future] */
    public final ajcq a() {
        ajcq ajcqVarG;
        ajcq ajcqVarH;
        int i = this.$cid;
        if (i == 0) {
            return !this.a ? aiql.z(j$.util.Optional.empty()) : ahvr.H(this.b.d(), new defpackage.qgx(this.c, 9), (java.util.concurrent.Executor) this.d);
        }
        final int i2 = 0;
        if (i == 1) {
            java.lang.Object obj = this.c;
            ibk ibkVar = (ibk) obj;
            return ahrv.g(ibkVar.a(hxe.b, true, false)).i(new jsf(obj, this.a, this.d, (java.lang.String) this.b, 1), ibkVar.d);
        }
        if (i == 2) {
            return !this.a ? aiql.z(j$.util.Optional.empty()) : ahvr.H(this.b.d(), new defpackage.qgx(this.c, 7), (java.util.concurrent.Executor) this.d);
        }
        ?? r5 = this.d;
        if (i == 3) {
            boolean zBooleanValue = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) r5)).booleanValue();
            boolean zBooleanValue2 = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.b)).booleanValue();
            final boolean z = this.a;
            if ((!zBooleanValue || z) && !(zBooleanValue2 && z)) {
                return aiql.z(java.lang.Boolean.TRUE);
            }
            final java.lang.Object obj2 = ((gou) this.c).e;
            return dff.m(new dsf() { // from class: uhq
                public final java.lang.Object a(dsd dsdVar) {
                    if (i2 == 0) {
                        j$.util.Objects.requireNonNull(dsdVar);
                        ((uhs) obj2).d(z, new defpackage.ujt(dsdVar, 1));
                        return "SpamSettings.modifySpamBlockingSetting operation";
                    }
                    boolean z2 = z;
                    int i3 = true != z2 ? 100 : -100;
                    iar iarVar = ((ias) obj2).a;
                    android.media.AudioManager audioManager = iarVar.c;
                    audioManager.adjustStreamVolume(0, i3, 0);
                    if ((!audioManager.isStreamMute(0)) == z2) {
                        a.bI(iar.a.d(), "failed to adjust voice call stream mute", "com/android/dialer/audio/impl/audiocontroller/voip/VoipDownlinkAudioRecordWrapper", "setMuted", '}', "VoipDownlinkAudioRecordWrapper.java", zct.b);
                    }
                    iarVar.d.set(z2);
                    dsdVar.b(java.lang.Boolean.valueOf(z2));
                    return null;
                }
            });
        }
        boolean zBooleanValue3 = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) r5)).booleanValue();
        boolean zBooleanValue4 = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.b)).booleanValue();
        boolean z2 = this.a;
        java.lang.Object obj3 = this.c;
        if (zBooleanValue3 == z2) {
            ajcqVarG = ajcm.a;
        } else {
            defpackage.xbs.a.b().l("com/android/incallui/atlas/ui/impl/tidepods/service/callaudiomuter/HoldForMeCallAudioMuter", "setDownlinkAndUplinkMuted", 92, "HoldForMeCallAudioMuter.java").v(true != z2 ? "unmuting downlink" : "muting downlink");
            ajcqVarG = ((defpackage.xbs) obj3).f.g(z2);
        }
        if (zBooleanValue4 == z2) {
            ajcqVarH = ajcm.a;
        } else {
            defpackage.xbs.a.b().l("com/android/incallui/atlas/ui/impl/tidepods/service/callaudiomuter/HoldForMeCallAudioMuter", "setDownlinkAndUplinkMuted", 100, "HoldForMeCallAudioMuter.java").v(true != z2 ? "unmuting uplink" : "muting uplink");
            ajcqVarH = ((defpackage.xbs) obj3).f.h(z2);
        }
        return ahvr.ak(new ajcq[]{ajcqVarG, ajcqVarH}).o(new defpackage.vnc(9), ((defpackage.xbs) obj3).c);
    }

    public /* synthetic */ qwf(boolean z, amzg amzgVar, android.content.Context context, ajct ajctVar, int i) {
        this.$cid = i;
        this.a = z;
        this.b = amzgVar;
        this.c = context;
        this.d = ajctVar;
    }
}
