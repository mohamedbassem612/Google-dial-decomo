package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vqt {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/settings/pin/SchedulerPinChanger");
    public final ajct b;
    public final zjm c;
    private final vze d;

    public vqt(zjm zjmVar, ajct ajctVar, vze vzeVar) {
        this.c = zjmVar;
        this.b = ajctVar;
        this.d = vzeVar;
    }

    public final ajcq a(android.telecom.PhoneAccountHandle phoneAccountHandle, java.lang.String str, java.lang.String str2) {
        j$.util.Optional optionalG = this.c.g();
        defpackage.vmu vmuVar = new defpackage.vmu(phoneAccountHandle, 7);
        if (true == optionalG.isPresent()) {
            optionalG = ((vda) optionalG.get()).c((android.telecom.PhoneAccountHandle) vmuVar.a);
            optionalG.getClass();
        }
        return !optionalG.isPresent() ? aiql.y(new java.lang.IllegalStateException("PhoneAccount not supported")) : ahvr.H(((vee) ((defpackage.abtr) optionalG.orElseThrow()).d).c(phoneAccountHandle, str, str2), new defpackage.vmj(16), this.b);
    }

    public final j$.util.Optional b(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        j$.util.Optional optionalR = zjm.r(this.c, phoneAccountHandle);
        defpackage.vmu vmuVar = new defpackage.vmu(phoneAccountHandle, 8);
        if (true == optionalR.isPresent()) {
            optionalR = j$.util.Optional.ofNullable(((vcc) optionalR.get()).i((android.telecom.PhoneAccountHandle) vmuVar.a));
        }
        return (j$.util.Optional) optionalR.orElse(j$.util.Optional.empty());
    }

    public final void c(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        j$.util.Optional optionalR = zjm.r(this.c, phoneAccountHandle);
        defpackage.vdi vdiVar = new defpackage.vdi(phoneAccountHandle, 14);
        if (true == optionalR.isPresent()) {
            java.lang.Object obj = optionalR.get();
            ((vcc) obj).j((android.telecom.PhoneAccountHandle) vdiVar.a, j$.util.Optional.ofNullable((java.lang.Object) null));
        }
        vze vzeVar = this.d;
        vze.a.b().l("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusDataServiceImpl", "clearPinNotSetError", 177, "VoicemailStatusDataServiceImpl.java").v("enter");
        ajcq ajcqVarBl = vzeVar.h.bl(new defpackage.tbd(phoneAccountHandle, 4));
        vzeVar.h(ajcqVarBl);
        agsm.i(1003, vzeVar.g.p(ajcqVarBl), "failed to clear set pin error.", new java.lang.Object[0]);
    }
}
