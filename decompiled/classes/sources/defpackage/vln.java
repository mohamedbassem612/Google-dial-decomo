package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vln implements defpackage.vcg {
    private static final defpackage.aimz d = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmConfiguration");
    public final defpackage.vth a;
    public final defpackage.ajct b;
    public final defpackage.aogc c;
    private final defpackage.aoin e;
    private final defpackage.aoin f;
    private final defpackage.oko g;
    private final defpackage.mgu h;
    private final defpackage.aogc i;

    public vln(defpackage.aogc aogcVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.vth vthVar, defpackage.ajct ajctVar, defpackage.oko okoVar, defpackage.mgu mguVar, defpackage.aogc aogcVar2) {
        this.c = aogcVar;
        this.e = aoinVar;
        this.f = aoinVar2;
        this.a = vthVar;
        this.b = ajctVar;
        this.g = okoVar;
        this.h = mguVar;
        this.i = aogcVar2;
    }

    @Override // defpackage.vcg
    public final defpackage.aihd a(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return new defpackage.aile("com.tmobile.vvm.application");
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq b(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.aiql.z(new defpackage.aile("com.tmobile.vvm.application"));
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq c(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        int iIntValue;
        defpackage.aoin aoinVar = this.f;
        if (((java.lang.Long) aoinVar.a()).longValue() < 1) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) d.d()).i(defpackage.zct.b)).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmConfiguration", "getGreetingSpecificationBlocking", (char) 192, "RestVvmConfiguration.java")).y("unexpected maxTmoRestRetrievingVoicemailGreetingEntries value %d", aoinVar.a());
            iIntValue = 0;
        } else {
            iIntValue = ((java.lang.Long) aoinVar.a()).intValue() - 1;
        }
        defpackage.alto altoVar = new defpackage.alto();
        altoVar.f(((android.os.PersistableBundle) this.g.i(phoneAccountHandle).s().orElseThrow(new vjq(5))).getInt("MaxCustomGreetingLength", 180));
        altoVar.a = iIntValue;
        altoVar.c = (byte) (altoVar.c | 2);
        return defpackage.aiql.z((vpf) new defpackage.mgr(this.i.aM(phoneAccountHandle), altoVar.e()).b(defpackage.mgv.VVM_GREETING_SPECIFICATION).d(new vga(9)));
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq d(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        vok vokVar = new vok();
        vokVar.b = 4;
        vokVar.a = 9;
        return defpackage.aiql.z((vok) new defpackage.mgr(this.i.aM(phoneAccountHandle), vokVar).b(defpackage.mgv.VVM_PIN_SPECIFICATION).d(new defpackage.thy(14)));
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq e(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.aiql.z(j$.util.Optional.empty());
    }

    @Override // defpackage.vcg
    public final /* synthetic */ defpackage.ajcq f(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.aiql.z(defpackage.aike.a);
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq g(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return (defpackage.ajcq) this.i.aM(phoneAccountHandle).g(new vfs(this, phoneAccountHandle, 9)).b(defpackage.mgv.VVM_AUDIO_PREFETCH_OPTION).f();
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq h(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return this.h.g(new pxs(this, 11)).b(defpackage.mgv.VVM_IS_CARRIER_APP_INSTALLED).g();
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq i(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.aiql.z((java.lang.Boolean) new defpackage.mgf(this.i.aM(phoneAccountHandle), true).a(defpackage.mgv.VVM_IS_CHANGE_GREETING_ENABLED).f());
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq j(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return this.i.aM(phoneAccountHandle).g(new vjq(6)).b(defpackage.mgv.VVM_IS_GOOGLE_TRANSCRIPTION_ELIGIBLE).g();
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq k(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq l(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq m(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq n(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq o() {
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq p(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    @Override // defpackage.vcg
    public final boolean q() {
        return ((java.lang.Boolean) new defpackage.mgf(this.h, ((java.lang.Boolean) this.e.a()).booleanValue()).a(defpackage.mgv.VVM_IS_AUTO_DOWNLOAD_OVER_CELLULAR_SETTING_ENABLED).f()).booleanValue();
    }

    @Override // defpackage.vcg
    public final boolean r(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return ((java.lang.Boolean) this.h.a(new pxs(this, 10)).a(defpackage.mgv.VVM_IS_CARRIER_APP_INSTALLED).f()).booleanValue();
    }

    @Override // defpackage.vcg
    public final boolean s(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return false;
    }

    @Override // defpackage.vcg
    public final boolean t() {
        return ((java.lang.Boolean) new defpackage.mgf(this.h, true).a(defpackage.mgv.VVM_IS_MWI_SYNC_ENABLED).f()).booleanValue();
    }

    @Override // defpackage.vcg
    public final boolean u(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return false;
    }
}
