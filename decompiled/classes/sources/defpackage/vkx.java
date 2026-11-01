package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vkx implements defpackage.ahjr {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/omtp/sms/receiver/VvmSendSmsResultReceiver");
    public j$.util.Optional b = j$.util.Optional.empty();
    private final defpackage.ajct c;
    private final defpackage.jna d;
    private final defpackage.aogc e;

    public vkx(defpackage.jna jnaVar, defpackage.aogc aogcVar, defpackage.ajct ajctVar) {
        this.d = jnaVar;
        this.e = aogcVar;
        this.c = ajctVar;
    }

    @Override // defpackage.ahjr
    public final defpackage.ajcq a(android.content.Intent intent, int i) {
        defpackage.ajcq ajcqVarH;
        if (this.b.isPresent()) {
            vkt vktVar = (vkt) this.b.orElseThrow();
            if (i == -1) {
                ((defpackage.aimw) ((defpackage.aimw) defpackage.vku.a.b()).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/sms/VvmSmsRequestSender$SendSmsResultCodeListener", "onResultCodeReceived", 408, "VvmSmsRequestSender.java")).y("send SMS completed successfully for %s", vktVar.a);
            } else {
                ((defpackage.aimw) ((defpackage.aimw) defpackage.vku.a.d()).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/sms/VvmSmsRequestSender$SendSmsResultCodeListener", "onResultCodeReceived", 410, "VvmSmsRequestSender.java")).I("received result code: %s for %s", new defpackage.aepg(java.lang.Character.forDigit(i, 10)), vktVar.a);
            }
            defpackage.vku vkuVar = vktVar.d;
            vkuVar.i.h(defpackage.mgv.VVM_SEND_REQUEST_SMS_TO_SERVER_RESULT_CODE, defpackage.aike.a, defpackage.gus.au(i), 2);
            ajcqVarH = defpackage.ahvr.H(defpackage.ahvr.E(new eyd(vktVar, i, 9), vkuVar.d), new vfw(this, 11), this.c);
        } else {
            ajcqVarH = defpackage.ajcm.a;
        }
        defpackage.jna jnaVar = this.d;
        defpackage.aogc aogcVar = this.e;
        defpackage.akzx akzxVarM = jmz.a.m();
        akzxVarM.u();
        jmz jmzVar = akzxVarM.b;
        jmzVar.b |= 1;
        jmzVar.c = true;
        akzxVarM.u();
        jmz jmzVar2 = akzxVarM.b;
        jmzVar2.d = 9;
        jmzVar2.b |= 2;
        return jnaVar.c(ajcqVarH, aogcVar, (jmz) akzxVarM.r());
    }
}
