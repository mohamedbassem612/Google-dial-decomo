package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vku {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/omtp/sms/VvmSmsRequestSender");
    public static final defpackage.aihd b = defpackage.aihd.r(101, 4);
    public final android.content.Context c;
    public final defpackage.ajcu d;
    public final defpackage.vew e;
    public final defpackage.vkp f;
    public final defpackage.aoin g;
    public final defpackage.aoin h;
    public final defpackage.zjv i;
    public final defpackage.vgj j;
    private final defpackage.ajct k;
    private final defpackage.vkx l;
    private final defpackage.vdq m;

    public vku(android.content.Context context, defpackage.ajcu ajcuVar, defpackage.vew vewVar, defpackage.ajct ajctVar, defpackage.vgj vgjVar, defpackage.vkp vkpVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.vkx vkxVar, defpackage.vdq vdqVar, defpackage.zjv zjvVar) {
        this.c = context;
        this.d = ajcuVar;
        this.e = vewVar;
        this.k = ajctVar;
        this.j = vgjVar;
        this.f = vkpVar;
        this.g = aoinVar;
        this.h = aoinVar2;
        this.l = vkxVar;
        this.m = vdqVar;
        this.i = zjvVar;
    }

    public final vkt a(android.telecom.PhoneAccountHandle phoneAccountHandle, int i) {
        vkt vktVar = new vkt(this, phoneAccountHandle, i);
        defpackage.vkx vkxVar = this.l;
        if (vkxVar.b.isPresent()) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.vkx.a.d()).i(defpackage.zct.b)).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/sms/receiver/VvmSendSmsResultReceiver", "addResultCodeListener", 'b', "VvmSendSmsResultReceiver.java")).v("replace existing listener");
        }
        vkxVar.b = j$.util.Optional.of(vktVar);
        return vktVar;
    }

    public final defpackage.ajcq b(android.telecom.PhoneAccountHandle phoneAccountHandle, java.lang.String str, int i) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        pth pthVar = new pth(this, i, 4);
        defpackage.ajcu ajcuVar = this.d;
        defpackage.ahrv ahrvVarE = defpackage.ahvr.Q(pthVar, ajcuVar).i(new vkn(this, phoneAccountHandle, 3), ajcuVar).e(vex.class, new uqy(this, i, 3), ajcuVar);
        vkt vktVarA = a(phoneAccountHandle, i);
        j$.util.Objects.requireNonNull(vktVarA);
        return defpackage.ahvr.af(c(phoneAccountHandle, str, new vel(vktVarA, 10), ((java.lang.Long) this.g.a()).longValue(), i), ahrvVarE).e(new vks(this, i, jElapsedRealtime, ahrvVarE), ajcuVar);
    }

    public final defpackage.ajcq c(android.telecom.PhoneAccountHandle phoneAccountHandle, java.lang.String str, java.util.function.Consumer consumer, long j, int i) {
        vfm vfmVar = new vfm(this, phoneAccountHandle, 6);
        defpackage.ajcu ajcuVar = this.d;
        return defpackage.ahrv.g(defpackage.ahvr.I(defpackage.ahvr.Q(vfmVar, ajcuVar).i(new vlq(this, phoneAccountHandle, i, str, 1), this.k), new vkr(consumer), ajcuVar)).j(j, java.util.concurrent.TimeUnit.MILLISECONDS, ajcuVar).f(java.lang.Exception.class, new lhb(this, i, 7), ajcuVar);
    }

    public final void d(int i, j$.util.Optional optional, j$.util.Optional optional2, int i2) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        defpackage.akzx akzxVarM = amsp.a.m();
        java.lang.String string = java.util.UUID.randomUUID().toString();
        akzxVarM.u();
        amsp amspVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        amspVar.b |= 1;
        amspVar.c = string;
        akzxVarM.u();
        amsp amspVar2 = akzxVarM.b;
        amspVar2.d = i - 1;
        amspVar2.b |= 2;
        akzxVarM.u();
        amsp amspVar3 = akzxVarM.b;
        amspVar3.e = 1;
        amspVar3.b |= 4;
        akzxVarM.u();
        amsp amspVar4 = akzxVarM.b;
        amspVar4.h = i2 - 1;
        amspVar4.b |= 32;
        if (optional.isPresent()) {
            long jIntValue = ((java.lang.Integer) optional.orElseThrow()).intValue();
            akzxVarM.u();
            amsp amspVar5 = akzxVarM.b;
            amspVar5.b |= 8;
            amspVar5.f = jIntValue;
        }
        if (optional2.isPresent()) {
            long jLongValue = jElapsedRealtime - ((java.lang.Long) optional2.orElseThrow()).longValue();
            akzxVarM.u();
            amsp amspVar6 = akzxVarM.b;
            amspVar6.b |= 16;
            amspVar6.g = jLongValue;
        }
        this.m.c((amsp) akzxVarM.r());
    }

    public final void e(int i, int i2, int i3) {
        defpackage.mgv mgvVar;
        int i4 = i - 1;
        if (i4 != 1) {
            mgvVar = i4 != 2 ? defpackage.mgv.VVM_UPDATE_STATUS_EVENTS : defpackage.mgv.VVM_DEACTIVATION_EVENTS;
        } else {
            mgvVar = defpackage.mgv.VVM_ACTIVATION_EVENTS;
        }
        this.i.h(mgvVar, defpackage.aike.a, defpackage.gus.aw(i2 != 3 ? "GET_RESPONSE_SMS_MESSAGE" : "SEND_REQUEST_SMS_TO_CARRIER_SERVER"), i3);
    }
}
