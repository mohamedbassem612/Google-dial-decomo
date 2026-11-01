package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vda {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/VvmServiceProviderImpl");
    public final defpackage.ajct b;
    public final defpackage.ajct c;
    public final android.content.Context d;
    public final defpackage.oko e;
    public final defpackage.aoin f;
    public final defpackage.ahbv g;
    public final defpackage.rsr h;
    public final defpackage.rsr i;
    private final defpackage.ajct j;
    private final defpackage.zrw k;
    private final defpackage.zjs l;

    public vda(defpackage.ahbv ahbvVar, defpackage.rsr rsrVar, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.ajct ajctVar3, defpackage.zrw zrwVar, android.content.Context context, defpackage.zjs zjsVar, defpackage.oko okoVar, defpackage.rsr rsrVar2, defpackage.aoin aoinVar) {
        this.g = ahbvVar;
        this.h = rsrVar;
        this.b = ajctVar;
        this.j = ajctVar2;
        this.c = ajctVar3;
        this.k = zrwVar;
        this.d = context;
        this.l = zjsVar;
        this.e = okoVar;
        this.i = rsrVar2;
        this.f = aoinVar;
    }

    public static void e(j$.util.Optional optional, j$.util.Optional optional2, j$.util.Optional optional3) {
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).i(defpackage.zct.a)).g(1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/voicemail/service/impl/VvmServiceProviderImpl", "logVvmServiceUnavailable", 217, "VvmServiceProviderImpl.java")).M("VvmService unavailable! VvmCarrierService exists?: %b, VvmConfiguration exists?: %b, VvmAccountState exists?: %b", java.lang.Boolean.valueOf(optional.isPresent()), java.lang.Boolean.valueOf(optional2.isPresent()), java.lang.Boolean.valueOf(optional3.isPresent()));
    }

    public final defpackage.ajcq a(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.zjs zjsVar = this.l;
        defpackage.ajcq ajcqVarF = defpackage.aosv.F(zjsVar.c, 0, new defpackage.unj(zjsVar, (defpackage.aoln) null, 12, (char[]) null), 3);
        defpackage.zrw zrwVar = this.k;
        defpackage.ajcq ajcqVarD = zrwVar.d();
        defpackage.ajcq ajcqVarF2 = defpackage.aosv.F(zrwVar.d, 0, new defpackage.unj(zrwVar, (defpackage.aoln) null, 15, (char[]) null), 3);
        defpackage.ahda ahdaVar = new defpackage.ahda(new defpackage.anpu(true, defpackage.aify.o(new defpackage.ajcq[]{ajcqVarF, ajcqVarD, ajcqVarF2})), (byte[]) null);
        defpackage.jio jioVar = new defpackage.jio(ajcqVarF, ajcqVarD, ajcqVarF2, 2);
        defpackage.ajct ajctVar = this.b;
        return defpackage.ahrv.g(defpackage.ahrv.g(ahdaVar.o(jioVar, ajctVar)).i(new defpackage.vmn(this, 1), ajctVar)).i(new defpackage.kjs(this, phoneAccountHandle, 14), ajctVar);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq b(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.ahbv ahbvVar = this.g;
        defpackage.ajcq ajcqVarO = ahbvVar.o(phoneAccountHandle);
        defpackage.ajcq ajcqVarP = ahbvVar.p(phoneAccountHandle);
        defpackage.ajcq ajcqVarQ = ahbvVar.q(phoneAccountHandle);
        defpackage.jyx jyxVar = new defpackage.jyx(ahbvVar, 15);
        long j = defpackage.ahqx.a;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarQ, new defpackage.ahqv(defpackage.ahns.c(false), jyxVar));
        ajcqVarQ.c(ajamVar, defpackage.aiql.t(ahbvVar.c, ajamVar));
        defpackage.ajcq ajcqVarN = ahbvVar.n(phoneAccountHandle);
        return new defpackage.ahda(new defpackage.anpu(true, defpackage.aify.o(new defpackage.ajcq[]{ajcqVarO, ajcqVarP, ajamVar, ajcqVarN})), (byte[]) null).o(new defpackage.ajxx(this, ajcqVarO, ajcqVarP, ajamVar, ajcqVarN, phoneAccountHandle, 1), this.j);
    }

    public final j$.util.Optional c(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        if (!d().booleanValue()) {
            return j$.util.Optional.empty();
        }
        defpackage.ahbv ahbvVar = this.g;
        defpackage.vcs vcsVarM = ahbvVar.m(phoneAccountHandle);
        defpackage.zzx zzxVar = (defpackage.zzx) ahbvVar.g;
        j$.util.Optional optionalEmpty = !zzxVar.k().containsKey(vcsVarM) ? j$.util.Optional.empty() : j$.util.Optional.of((defpackage.vfj) ((defpackage.aoin) zzxVar.k().get(vcsVarM)).a());
        defpackage.vcs vcsVarM2 = ahbvVar.m(phoneAccountHandle);
        defpackage.zzx zzxVar2 = (defpackage.zzx) ahbvVar.f;
        j$.util.Optional optionalEmpty2 = !zzxVar2.k().containsKey(vcsVarM2) ? j$.util.Optional.empty() : j$.util.Optional.of((defpackage.vcg) ((defpackage.aoin) zzxVar2.k().get(vcsVarM2)).a());
        defpackage.vcs vcsVarM3 = ahbvVar.m(phoneAccountHandle);
        defpackage.zzx zzxVar3 = (defpackage.zzx) ahbvVar.d;
        j$.util.Optional optionalEmpty3 = !zzxVar3.k().containsKey(vcsVarM3) ? j$.util.Optional.empty() : j$.util.Optional.of((defpackage.vcc) ((defpackage.aoin) zzxVar3.k().get(vcsVarM3)).a());
        if (!optionalEmpty.isPresent() || !optionalEmpty2.isPresent() || !optionalEmpty3.isPresent()) {
            e(optionalEmpty, optionalEmpty2, optionalEmpty3);
            return j$.util.Optional.empty();
        }
        if (!((java.lang.Boolean) this.f.a()).booleanValue()) {
            return j$.util.Optional.of(this.h.A((defpackage.vcg) optionalEmpty2.orElseThrow(), ahbvVar.r(phoneAccountHandle), (defpackage.vcc) optionalEmpty3.orElseThrow()));
        }
        defpackage.rsr rsrVar = this.i;
        if (rsrVar.B(phoneAccountHandle) == null) {
            rsrVar.C(phoneAccountHandle, this.h.A((defpackage.vcg) optionalEmpty2.orElseThrow(), ahbvVar.r(phoneAccountHandle), (defpackage.vcc) optionalEmpty3.orElseThrow()));
        }
        return j$.util.Optional.of(rsrVar.B(phoneAccountHandle));
    }

    public final java.lang.Boolean d() {
        if (this.l.x()) {
            android.content.Context context = this.d;
            defpackage.aify aifyVar = defpackage.zqz.a;
            if (defpackage.dvx.c(context, "android.permission.READ_PHONE_STATE") == 0 && defpackage.dvx.c(context, "android.permission.SEND_SMS") == 0) {
                if (android.text.TextUtils.equals(context.getPackageName(), (java.lang.CharSequence) this.e.A().orElse((java.lang.Object) null))) {
                    return java.lang.Boolean.TRUE;
                }
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).i(defpackage.zct.a)).l("com/android/dialer/voicemail/service/impl/VvmServiceProviderImpl", "isEligibleForVvmBlocking", '\\', "VvmServiceProviderImpl.java")).v("Dialer is not the VVM package");
                return java.lang.Boolean.FALSE;
            }
        }
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).i(defpackage.zct.a)).l("com/android/dialer/voicemail/service/impl/VvmServiceProviderImpl", "isEligibleForVvmBlocking", 'V', "VvmServiceProviderImpl.java")).v("Missing permissions or default dialer status");
        return java.lang.Boolean.FALSE;
    }
}
