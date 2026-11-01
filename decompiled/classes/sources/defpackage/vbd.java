package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vbd implements defpackage.ahjr {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/notification/receivers/VoicemailNotificationReceiver");
    private final defpackage.zjx b;
    private final defpackage.jna c;
    private final defpackage.zjm d;
    private final defpackage.zjm e;
    private final defpackage.aogc f;

    public vbd(defpackage.jna jnaVar, defpackage.zjx zjxVar, defpackage.aogc aogcVar, defpackage.zjm zjmVar, defpackage.zjm zjmVar2) {
        this.c = jnaVar;
        this.b = zjxVar;
        this.f = aogcVar;
        this.d = zjmVar;
        this.e = zjmVar2;
    }

    @Override // defpackage.ahjr
    public final defpackage.ajcq a(android.content.Intent intent, int i) {
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/voicemail/notification/receivers/VoicemailNotificationReceiver", "onReceive", 79, "VoicemailNotificationReceiver.java")).v("enter");
        defpackage.zjm zjmVar = this.e;
        if (!zjmVar.g().isPresent()) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/voicemail/notification/receivers/VoicemailNotificationReceiver", "onReceive", 84, "VoicemailNotificationReceiver.java")).v("voicemail notification modernization is disabled");
            return defpackage.ajcm.a;
        }
        intent.getAction().getClass();
        if (intent.getAction().equals("android.intent.action.NEW_VOICEMAIL") && !((defpackage.mhy) this.d.g().orElseThrow()).b()) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/voicemail/notification/receivers/VoicemailNotificationReceiver", "onReceive", 92, "VoicemailNotificationReceiver.java")).v("Dialer is not the default phone app. Another phone app should handle a voicemail notification");
            return defpackage.ajcm.a;
        }
        j$.util.Optional optionalG = zjmVar.g();
        if (true == optionalG.isPresent()) {
            optionalG = j$.util.Optional.ofNullable(((defpackage.vav) optionalG.get()).e());
        }
        defpackage.ajcq ajcqVar = (defpackage.ajcq) optionalG.orElse(defpackage.ajcm.a);
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED") && android.os.Build.VERSION.SDK_INT >= 35) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/voicemail/notification/receivers/VoicemailNotificationReceiver", "onReceive", 108, "VoicemailNotificationReceiver.java")).v("Starting a foreground service on BOOT_COMPLETED is banned after V, enqueueing a work instead.");
            return this.b.b(defpackage.vbf.b);
        }
        defpackage.jna jnaVar = this.c;
        defpackage.aogc aogcVar = this.f;
        defpackage.akzx akzxVarM = jmz.a.m();
        akzxVarM.u();
        jmz jmzVar = akzxVarM.b;
        jmzVar.b |= 1;
        jmzVar.c = true;
        akzxVarM.u();
        jmz jmzVar2 = akzxVarM.b;
        jmzVar2.d = 3;
        jmzVar2.b |= 2;
        return jnaVar.c(ajcqVar, aogcVar, (jmz) akzxVarM.r());
    }
}
