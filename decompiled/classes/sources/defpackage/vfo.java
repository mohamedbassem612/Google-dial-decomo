package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vfo {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmActivation");
    public static final defpackage.aenj b = new defpackage.aenj("OMTP_VVM_SERVICE_ACTIVATION_MEMORY_SNAPSHOT");
    public static final defpackage.vcr c;
    public final android.content.Context d;
    public final defpackage.ajct e;
    public final defpackage.vku f;
    public final defpackage.rlv g;
    public final defpackage.ruc h;
    public final defpackage.gpd i;
    public final defpackage.ahbv j;
    public final defpackage.gat k;
    private final defpackage.vfn l;
    private final j$.util.Optional m;
    private final defpackage.aoin n;
    private final defpackage.zjm o;

    static {
        defpackage.akzx akzxVarM = defpackage.vcr.a.m();
        defpackage.vcq vcqVar = defpackage.vcq.a;
        akzxVarM.u();
        defpackage.vcr vcrVar = (defpackage.vcr) akzxVarM.b;
        j$.util.Objects.requireNonNull(vcqVar);
        vcrVar.c = vcqVar;
        vcrVar.b = 1;
        c = (defpackage.vcr) akzxVarM.r();
    }

    public vfo(android.content.Context context, defpackage.vku vkuVar, defpackage.ajct ajctVar, defpackage.gat gatVar, defpackage.ahbv ahbvVar, defpackage.vfn vfnVar, defpackage.rlv rlvVar, defpackage.ruc rucVar, defpackage.zjm zjmVar, defpackage.gpd gpdVar, j$.util.Optional optional, defpackage.aoin aoinVar) {
        this.d = context;
        this.f = vkuVar;
        this.e = ajctVar;
        this.k = gatVar;
        this.j = ahbvVar;
        this.l = vfnVar;
        this.g = rlvVar;
        this.h = rucVar;
        this.o = zjmVar;
        this.i = gpdVar;
        this.m = optional;
        this.n = aoinVar;
    }

    public final defpackage.ajcq a(android.telecom.PhoneAccountHandle phoneAccountHandle, veo veoVar) {
        defpackage.ajcq ajcqVar;
        this.g.n(defpackage.rmw.VVM_ACTIVATION_ADD_ACCOUNT_STARTED);
        if (((java.lang.Boolean) this.n.a()).booleanValue()) {
            ajcqVar = defpackage.ajcm.a;
        } else {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmActivation", "clearMwiNotification", 347, "OmtpVvmActivation.java")).y("Clear MWI notification for %s", phoneAccountHandle);
            j$.util.Optional optionalG = this.o.g();
            vdj vdjVar = new vdj(phoneAccountHandle, 5);
            if (true == optionalG.isPresent()) {
                optionalG = j$.util.Optional.ofNullable(((defpackage.val) optionalG.get()).a((android.telecom.PhoneAccountHandle) vdjVar.a));
            }
            ajcqVar = (defpackage.ajcq) optionalG.orElse(defpackage.ahvr.E(new rqy(this, phoneAccountHandle, 13), this.e));
        }
        defpackage.vfn vfnVar = this.l;
        vgm vgmVar = veoVar.e;
        if (vgmVar == null) {
            vgmVar = vgm.a;
        }
        defpackage.ajcq ajcqVarM = vfnVar.m(phoneAccountHandle, vgmVar);
        veb vebVar = new veb(this, 15);
        defpackage.ajct ajctVar = this.e;
        return defpackage.ahvr.ak(ajcqVar, defpackage.ahvr.H(ajcqVarM, vebVar, ajctVar)).o(new vdp(this, 8), ajctVar);
    }

    public final defpackage.ajcq b(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.gat gatVar = this.k;
        defpackage.ajcq ajcqVarQ = this.j.q(phoneAccountHandle);
        j$.util.Objects.requireNonNull(gatVar);
        return defpackage.ahvr.H(ajcqVarQ, new veb(gatVar, 17), this.e);
    }

    public final defpackage.ajcq c(android.telecom.PhoneAccountHandle phoneAccountHandle, veo veoVar) {
        defpackage.ajcq ajcqVarB = b(phoneAccountHandle);
        vct vctVar = new vct(veoVar, 19);
        defpackage.ajct ajctVar = this.e;
        return defpackage.ahvr.I(defpackage.ahvr.I(ajcqVarB, vctVar, ajctVar), new ved(this, veoVar, phoneAccountHandle, 5, (char[]) null), ajctVar);
    }

    public final defpackage.ajcq d(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        this.g.n(defpackage.rmw.VVM_ACTIVATION_REMOVE_ACCOUNT_STARTED);
        return defpackage.ahvr.H(this.l.n(phoneAccountHandle), new veb(this, 14), this.e);
    }

    public final void e() {
        this.m.isPresent();
    }
}
