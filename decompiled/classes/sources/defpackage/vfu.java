package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vfu implements defpackage.vcg {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmConfiguration");
    public final defpackage.ajct b;
    public final defpackage.vgl c;
    public final defpackage.rsr d;
    public final defpackage.aogc e;
    public final defpackage.aogc f;
    private final defpackage.ajct g;
    private final defpackage.aoin h;
    private final defpackage.mgu i;
    private final defpackage.vdc j;

    public vfu(defpackage.vgl vglVar, defpackage.vdc vdcVar, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.aogc aogcVar, defpackage.rsr rsrVar, defpackage.aoin aoinVar, defpackage.aogc aogcVar2, defpackage.mgu mguVar) {
        this.c = vglVar;
        this.j = vdcVar;
        this.b = ajctVar;
        this.g = ajctVar2;
        this.e = aogcVar;
        this.d = rsrVar;
        this.h = aoinVar;
        this.f = aogcVar2;
        this.i = mguVar;
    }

    @Override // defpackage.vcg
    public final defpackage.aihd a(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        j$.util.Optional optionalW = w(phoneAccountHandle);
        if (true == optionalW.isPresent()) {
            optionalW = j$.util.Optional.ofNullable(defpackage.aihd.o(((defpackage.vbu) optionalW.get()).g));
        }
        return (defpackage.aihd) optionalW.orElse(defpackage.aikn.a);
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq b(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.ahvr.H(v(phoneAccountHandle), new vef(18), this.b);
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq c(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return (defpackage.ajcq) this.f.aM(phoneAccountHandle).g(new pin(this, phoneAccountHandle, 19)).b(defpackage.mgv.VVM_GREETING_SPECIFICATION).f();
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq d(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return (defpackage.ajcq) this.f.aM(phoneAccountHandle).g(new pin(this, phoneAccountHandle, 18)).b(defpackage.mgv.VVM_PIN_SPECIFICATION).f();
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq e(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.ahvr.H(v(phoneAccountHandle), new vft(1), this.b);
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq f(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.ahvr.H(v(phoneAccountHandle), new vef(17), this.b);
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq g(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return (defpackage.ajcq) this.f.aM(phoneAccountHandle).g(new pin(this, phoneAccountHandle, 16)).b(defpackage.mgv.VVM_AUDIO_PREFETCH_OPTION).f();
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq h(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.ahvr.F(new vez(this, phoneAccountHandle, 5), this.g);
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq i(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return this.f.aM(phoneAccountHandle).g(new vfs(this, phoneAccountHandle, 5)).b(defpackage.mgv.VVM_IS_CHANGE_GREETING_ENABLED).g();
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq j(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return this.f.aM(phoneAccountHandle).g(new vfs(this, phoneAccountHandle, 1)).b(defpackage.mgv.VVM_IS_GOOGLE_TRANSCRIPTION_ELIGIBLE).g();
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq k(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return this.f.aM(phoneAccountHandle).g(new vfs(this, phoneAccountHandle, 7)).b(defpackage.mgv.VVM_IS_LEGACY_MODE_ENABLED).g();
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq l(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return this.f.aM(phoneAccountHandle).g(new vfs(this, phoneAccountHandle, 0)).b(defpackage.mgv.VVM_IS_NON_DDS_ALLOWED).g();
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq m(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return this.f.aM(phoneAccountHandle).g(new pin(this, phoneAccountHandle, 17)).b(defpackage.mgv.VVM_IS_CELLULAR_REQUIRED).g();
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq n(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return this.f.aM(phoneAccountHandle).g(new pin(this, phoneAccountHandle, 15)).b(defpackage.mgv.VVM_REQUIRES_DEFAULT_DATA_SIM).g();
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq o() {
        java.lang.Boolean bool = (java.lang.Boolean) new defpackage.mgf(this.i, true).a(defpackage.mgv.VVM_SUPPORTS_VOICEMAIL_SMS).f();
        bool.booleanValue();
        return defpackage.aiql.z(bool);
    }

    @Override // defpackage.vcg
    public final defpackage.ajcq p(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return this.f.aM(phoneAccountHandle).g(new vfs(this, phoneAccountHandle, 3)).b(defpackage.mgv.VVM_USE_CARRIER_TRANSCRIPTION).g();
    }

    @Override // defpackage.vcg
    public final boolean q() {
        return false;
    }

    @Override // defpackage.vcg
    public final boolean r(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return ((java.lang.Boolean) this.i.a(new pin(this, phoneAccountHandle, 20)).a(defpackage.mgv.VVM_IS_CARRIER_APP_INSTALLED).f()).booleanValue();
    }

    @Override // defpackage.vcg
    public final boolean s(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return ((java.lang.Boolean) this.f.aM(phoneAccountHandle).a(new vfs(this, phoneAccountHandle, 2)).a(defpackage.mgv.VVM_IS_LEGACY_MODE_ENABLED).f()).booleanValue();
    }

    @Override // defpackage.vcg
    public final boolean t() {
        return false;
    }

    @Override // defpackage.vcg
    public final boolean u(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return ((java.lang.Boolean) this.f.aM(phoneAccountHandle).a(new vfs(this, phoneAccountHandle, 4)).a(defpackage.mgv.VVM_REQUIRES_DEFAULT_DATA_SIM).f()).booleanValue();
    }

    public final defpackage.ajcq v(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(this.j.a(phoneAccountHandle));
        vec vecVar = new vec(this, phoneAccountHandle, 18);
        defpackage.ajct ajctVar = this.b;
        return ahrvVarG.i(vecVar, ajctVar).h(new vft(0), ajctVar);
    }

    public final j$.util.Optional w(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        j$.util.Optional optionalB = this.j.b(phoneAccountHandle);
        idc idcVar = new idc(this, phoneAccountHandle, 16, (byte[]) null);
        if (true == optionalB.isPresent()) {
            java.lang.Object obj = optionalB.get();
            java.lang.Object obj2 = idcVar.b;
            java.lang.Object obj3 = idcVar.a;
            optionalB = j$.util.Optional.ofNullable(((defpackage.vfu) obj2).c.c((defpackage.vdd) obj, (android.telecom.PhoneAccountHandle) obj3));
        }
        return (j$.util.Optional) optionalB.orElse(j$.util.Optional.empty());
    }

    public final boolean x(defpackage.vbu vbuVar) {
        return ((java.lang.Boolean) this.h.a()).booleanValue() && vbuVar.w;
    }

    public final boolean y(defpackage.vbu vbuVar) {
        return vbuVar.e && !x(vbuVar);
    }
}
