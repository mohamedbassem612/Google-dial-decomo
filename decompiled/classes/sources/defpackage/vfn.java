package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vfn implements defpackage.vcc {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmAccountState");
    public final android.content.Context b;
    public final defpackage.ajct c;
    public final defpackage.vth d;
    public final defpackage.okj e;
    public final defpackage.rlv f;
    public final defpackage.aoin g;
    public final defpackage.vze h;
    public final defpackage.vvl i;
    public final defpackage.zzx j;
    public final defpackage.zjm k;
    public final defpackage.tvn l;
    public final defpackage.rsr m;
    private final defpackage.ajct n;
    private final defpackage.ajct o;
    private final defpackage.vfu p;
    private final android.os.UserManager q;
    private final defpackage.oko r;
    private final defpackage.aoin s;
    private final defpackage.zzx t;

    public vfn(android.content.Context context, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.ajct ajctVar3, defpackage.vze vzeVar, defpackage.tvn tvnVar, defpackage.rsr rsrVar, defpackage.vth vthVar, defpackage.vfu vfuVar, defpackage.zzx zzxVar, android.os.UserManager userManager, defpackage.vvl vvlVar, defpackage.okj okjVar, defpackage.oko okoVar, defpackage.rlv rlvVar, defpackage.zzx zzxVar2, defpackage.zjm zjmVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2) {
        this.b = context;
        this.c = ajctVar;
        this.n = ajctVar2;
        this.o = ajctVar3;
        this.h = vzeVar;
        this.l = tvnVar;
        this.m = rsrVar;
        this.d = vthVar;
        this.p = vfuVar;
        this.t = zzxVar;
        this.q = userManager;
        this.i = vvlVar;
        this.e = okjVar;
        this.r = okoVar;
        this.f = rlvVar;
        this.j = zzxVar2;
        this.k = zjmVar;
        this.s = aoinVar;
        this.g = aoinVar2;
    }

    @Override // defpackage.vcc
    public final defpackage.ajcq a(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.vfu vfuVar = this.p;
        defpackage.ajcq ajcqVarK = this.r.k();
        defpackage.ajcq ajcqVarN = vfuVar.n(phoneAccountHandle);
        defpackage.ajcq ajcqVarF = defpackage.ahvr.F(new vez(this, phoneAccountHandle, 3), this.o);
        return defpackage.ahvr.af(ajcqVarK, ajcqVarN, ajcqVarF).e(new tbb(ajcqVarK, ajcqVarN, ajcqVarF, 11), this.c);
    }

    @Override // defpackage.vcc
    public final defpackage.ajcq b(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.ahvr.I(this.h.b(phoneAccountHandle), new vct(this, 16), this.c);
    }

    @Override // defpackage.vcc
    public final defpackage.ajcq c(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.vze vzeVar = this.h;
        defpackage.ajcq ajcqVarX = this.m.x(phoneAccountHandle);
        defpackage.ajcq ajcqVarC = vzeVar.c();
        return defpackage.ahvr.af(ajcqVarX, ajcqVarC).e(new tbb(phoneAccountHandle, ajcqVarC, ajcqVarX, 10), this.c);
    }

    @Override // defpackage.vcc
    public final defpackage.ajcq d(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        android.os.UserManager userManager = this.q;
        j$.util.Objects.requireNonNull(userManager);
        defpackage.ajcq ajcqVarF = defpackage.ahvr.F(new vdp(userManager, 7), this.o);
        defpackage.vfu vfuVar = this.p;
        defpackage.aogc aogcVar = vfuVar.f;
        defpackage.ajcq ajcqVarH = vfuVar.h(phoneAccountHandle);
        defpackage.ajcq ajcqVarG = aogcVar.aM(phoneAccountHandle).g(new vfs(vfuVar, phoneAccountHandle, 8)).b(defpackage.mgv.VVM_IS_DISABLED_BY_DEFAULT).g();
        return defpackage.ahvr.ak(ajcqVarF, ajcqVarH, ajcqVarG).o(new kxy(this, ajcqVarF, phoneAccountHandle, ajcqVarH, ajcqVarG, 6), this.n);
    }

    @Override // defpackage.vcc
    public final defpackage.ajcq e(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        this.f.o(defpackage.rmx.VVM_ACCOUNT_STATE_REMOVE_ACCOUNT_STARTED);
        return defpackage.ahvr.ak(this.m.w(phoneAccountHandle), this.h.f(phoneAccountHandle)).o(new vez(this, phoneAccountHandle, 2), this.c);
    }

    @Override // defpackage.vcc
    public final defpackage.ajcq f(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.ahvr.F(new vez(this, phoneAccountHandle, 4), this.n);
    }

    @Override // defpackage.vcc
    public final defpackage.ajcq g(android.telecom.PhoneAccountHandle phoneAccountHandle, j$.util.Optional optional) {
        return defpackage.ahvr.E(new opo(this, phoneAccountHandle, optional, 9, (byte[]) null), this.n);
    }

    @Override // defpackage.vcc
    public final defpackage.ajcq h(android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z) {
        return defpackage.ahvr.O(new rrq(this, phoneAccountHandle, z, 2), this.n);
    }

    @Override // defpackage.vcc
    public final j$.util.Optional i(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        jyn jynVar = new jyn(this.d.b, phoneAccountHandle);
        jynVar.i();
        return j$.util.Optional.ofNullable((java.lang.String) jynVar.f("default_old_pin", (java.lang.Object) null));
    }

    @Override // defpackage.vcc
    public final void j(android.telecom.PhoneAccountHandle phoneAccountHandle, j$.util.Optional optional) {
        lop lopVarE = new jyn(this.d.b, phoneAccountHandle).e();
        lopVarE.d("default_old_pin", (java.lang.String) optional.orElse((java.lang.Object) null));
        lopVarE.a();
    }

    @Override // defpackage.vcc
    public final void k(android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z) {
        this.d.a(phoneAccountHandle, z);
    }

    @Override // defpackage.vcc
    public final boolean l(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        if (!this.q.isSystemUser()) {
            return false;
        }
        defpackage.vfu vfuVar = this.p;
        return o(phoneAccountHandle, vfuVar.r(phoneAccountHandle), ((java.lang.Boolean) vfuVar.f.aM(phoneAccountHandle).a(new vfs(vfuVar, phoneAccountHandle, 6)).a(defpackage.mgv.VVM_IS_DISABLED_BY_DEFAULT).f()).booleanValue());
    }

    final defpackage.ajcq m(android.telecom.PhoneAccountHandle phoneAccountHandle, vgm vgmVar) {
        this.f.n(defpackage.rmw.VVM_ACCOUNT_STATE_ADD_ACCOUNT_STARTED);
        defpackage.ajcq ajcqVarF = f(phoneAccountHandle);
        vef vefVar = new vef(8);
        defpackage.ajct ajctVar = this.c;
        defpackage.ajcq ajcqVarH = defpackage.ahvr.H(ajcqVarF, vefVar, ajctVar);
        return defpackage.ahvr.af(this.m.v(vgmVar), ajcqVarH, this.h.a(phoneAccountHandle)).e(new vdp(ajcqVarH, 6), ajctVar).i(new vec(this, phoneAccountHandle, 11), ajctVar).i(new vec(this, phoneAccountHandle, 12), ajctVar);
    }

    final defpackage.ajcq n(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        this.f.n(defpackage.rmw.VVM_ACCOUNT_STATE_DISABLE_ACCOUNT_STARTED);
        defpackage.akzx akzxVarM = defpackage.vzi.a.m();
        java.lang.String id = phoneAccountHandle.getId();
        akzxVarM.u();
        defpackage.vzi vziVar = (defpackage.vzi) akzxVarM.b;
        j$.util.Objects.requireNonNull(id);
        vziVar.b |= 8;
        vziVar.f = id;
        java.lang.String strFlattenToString = phoneAccountHandle.getComponentName().flattenToString();
        akzxVarM.u();
        defpackage.vzi vziVar2 = (defpackage.vzi) akzxVarM.b;
        j$.util.Objects.requireNonNull(strFlattenToString);
        vziVar2.b |= 4;
        vziVar2.e = strFlattenToString;
        akzxVarM.u();
        defpackage.vzi vziVar3 = (defpackage.vzi) akzxVarM.b;
        vziVar3.b |= 512;
        vziVar3.l = -1;
        akzxVarM.u();
        defpackage.vzi vziVar4 = (defpackage.vzi) akzxVarM.b;
        vziVar4.b |= 256;
        vziVar4.k = -1;
        akzxVarM.u();
        defpackage.vzi vziVar5 = (defpackage.vzi) akzxVarM.b;
        vziVar5.b |= 32;
        vziVar5.h = 5;
        defpackage.vzi vziVar6 = (defpackage.vzi) akzxVarM.r();
        vfm vfmVar = new vfm(this, phoneAccountHandle, 0);
        defpackage.ajct ajctVar = this.c;
        return defpackage.ahvr.Q(vfmVar, ajctVar).i(new vec(this, vziVar6, 13), ajctVar).h(new tzs(this, phoneAccountHandle, 20), ajctVar);
    }

    public final boolean o(android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z, boolean z2) {
        int iC;
        if (((java.lang.Boolean) this.s.a()).booleanValue() && z) {
            return false;
        }
        if (this.t.m() || (iC = this.d.c(phoneAccountHandle)) == 3) {
            if (z || z2) {
                return false;
            }
        } else if (iC != 1) {
            return false;
        }
        return true;
    }
}
