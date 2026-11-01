package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vew {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/sms/VvmSmsDispatcherImpl");
    public final defpackage.ajcu b;
    public final java.util.concurrent.Executor c;
    public final defpackage.ven d;
    public j$.util.Optional e = j$.util.Optional.empty();
    public final defpackage.zzx f;
    private final defpackage.ahbv g;

    public vew(defpackage.ajcu ajcuVar, defpackage.ahbv ahbvVar, defpackage.zzx zzxVar, defpackage.ven venVar) {
        this.b = ajcuVar;
        this.c = new defpackage.ajdc(ajcuVar);
        this.g = ahbvVar;
        this.f = zzxVar;
        this.d = venVar;
    }

    public final defpackage.ajcq a(android.telecom.PhoneAccountHandle phoneAccountHandle, vek vekVar) {
        defpackage.ajcq ajcqVarQ = this.g.q(phoneAccountHandle);
        veb vebVar = new veb(this, 6);
        defpackage.ajcu ajcuVar = this.b;
        return defpackage.ahrv.g(defpackage.ahvr.F(new uwl(this, vekVar, 20, (byte[]) null), this.c)).i(new vct(defpackage.ahvr.H(ajcqVarQ, vebVar, ajcuVar), 9), ajcuVar).i(new vct(vekVar, 10), ajcuVar).h(new vef(3), ajcuVar);
    }

    public final void b() {
        j$.util.Optional optional = this.e;
        vdi vdiVar = new vdi(this, 8);
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            java.lang.Object obj2 = vdiVar.a;
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/voicemail/service/impl/sms/VvmSmsDispatcherImpl", "removeSmsListenerInternal", 184, "VvmSmsDispatcherImpl.java")).w("remove sms listener: %d", java.lang.System.identityHashCode(obj));
            ((defpackage.vew) obj2).e = j$.util.Optional.empty();
        }
    }
}
