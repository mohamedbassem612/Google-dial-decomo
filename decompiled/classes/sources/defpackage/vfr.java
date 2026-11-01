package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vfr implements defpackage.vfj {
    public final defpackage.agsm a;
    public final defpackage.vee b;
    public final defpackage.vgg c;
    public final defpackage.aogc d;
    private final android.content.Context e;
    private final defpackage.ajct f;
    private final defpackage.vfo g;
    private final defpackage.vfx h;
    private final defpackage.vfl i;
    private final defpackage.vfn j;
    private final defpackage.aoin k;
    private final defpackage.vze l;
    private final defpackage.rsr m;

    public vfr(android.content.Context context, defpackage.ajct ajctVar, defpackage.agsm agsmVar, defpackage.vfo vfoVar, defpackage.vfx vfxVar, defpackage.vfl vflVar, defpackage.vze vzeVar, defpackage.vee veeVar, defpackage.vgg vggVar, defpackage.rsr rsrVar, defpackage.aogc aogcVar, defpackage.vfn vfnVar, defpackage.aoin aoinVar) {
        this.e = context;
        this.f = ajctVar;
        this.a = agsmVar;
        this.g = vfoVar;
        this.h = vfxVar;
        this.i = vflVar;
        this.l = vzeVar;
        this.b = veeVar;
        this.c = vggVar;
        this.m = rsrVar;
        this.d = aogcVar;
        this.j = vfnVar;
        this.k = aoinVar;
    }

    private final defpackage.ajcq m(android.telecom.PhoneAccountHandle phoneAccountHandle, java.util.function.Supplier supplier) {
        return defpackage.ahrv.g(this.j.c(phoneAccountHandle)).i(new vfq(supplier), this.f);
    }

    @Override // defpackage.vfj
    public final defpackage.ajcq a(android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z) {
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.vfo.a.b()).i(defpackage.zct.a)).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmActivation", "activate", 't', "OmtpVvmActivation.java")).y("enter for %s", phoneAccountHandle);
        defpackage.vfo vfoVar = this.g;
        vfoVar.g.n(defpackage.rmw.VVM_ACTIVATION_STARTED);
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(vfoVar.j.q(phoneAccountHandle));
        defpackage.gat gatVar = vfoVar.k;
        j$.util.Objects.requireNonNull(gatVar);
        veb vebVar = new veb(gatVar, 12);
        defpackage.ajct ajctVar = vfoVar.e;
        return defpackage.ahvr.H(defpackage.ahrv.g(ahrvVarG.h(vebVar, ajctVar).i(new vct(phoneAccountHandle, 17), ajctVar)).i(new vec(vfoVar, phoneAccountHandle, 14), ajctVar).i(new vec(vfoVar, phoneAccountHandle, 15), ajctVar).i(new vec(vfoVar, phoneAccountHandle, 16), ajctVar).e(vcx.class, new veb(vfoVar, 11), ajctVar), new vfp(this, phoneAccountHandle, 0), this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.vfj
    public final defpackage.ajcq b(android.telecom.PhoneAccountHandle phoneAccountHandle, java.lang.String str, java.lang.String str2) {
        defpackage.rsr rsrVar = this.m;
        defpackage.ahru ahruVarA = ((defpackage.vgu) rsrVar.a).a(phoneAccountHandle);
        vgf vgfVar = new vgf(str, str2, 1, (byte[]) null);
        ?? r7 = rsrVar.b;
        return defpackage.ahvr.H(ahruVarA.d(vgfVar, r7).e().h(new vef(5), r7), new vfp(this, phoneAccountHandle, 2), this.f);
    }

    @Override // defpackage.vfj
    public final defpackage.ajcq c(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        ((defpackage.aimw) ((defpackage.aimw) defpackage.vfx.a.b()).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmDeactivation", "deactivate", 57, "OmtpVvmDeactivation.java")).y("enter for %s", phoneAccountHandle);
        defpackage.vfx vfxVar = this.h;
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(vfxVar.g.q(phoneAccountHandle));
        defpackage.gat gatVar = vfxVar.h;
        j$.util.Objects.requireNonNull(gatVar);
        vfw vfwVar = new vfw(gatVar, 2);
        defpackage.ajct ajctVar = vfxVar.b;
        return defpackage.ahrv.g(ahrvVarG.h(vfwVar, ajctVar).i(new vct(phoneAccountHandle, 20), ajctVar)).i(new vec(vfxVar, phoneAccountHandle, 19), ajctVar).i(new vec(vfxVar, phoneAccountHandle, 20), ajctVar).i(new vfv(vfxVar, phoneAccountHandle, 1), ajctVar).i(new vfv(vfxVar, phoneAccountHandle, 0), ajctVar).h(new vfw(vfxVar, 1), ajctVar).e(vcx.class, new vft(4), ajctVar);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.vfj
    public final defpackage.ajcq d(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.aogc aogcVar = this.d;
        return defpackage.ahvr.I(aogcVar.ap(phoneAccountHandle), new vct(phoneAccountHandle, 13), aogcVar.a);
    }

    @Override // defpackage.vfj
    public final defpackage.ajcq e(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return ((java.lang.Boolean) this.k.a()).booleanValue() ? m(phoneAccountHandle, new pin(this, phoneAccountHandle, 13)) : this.d.ao(phoneAccountHandle);
    }

    @Override // defpackage.vfj
    public final defpackage.ajcq f(android.telecom.PhoneAccountHandle phoneAccountHandle, vcm vcmVar, boolean z) {
        defpackage.vgg vggVar = this.c;
        defpackage.ahru ahruVarA = vggVar.g.a(phoneAccountHandle);
        vgc vgcVar = new vgc(vggVar, vcmVar, phoneAccountHandle, 0);
        defpackage.ajct ajctVar = vggVar.e;
        return ahruVarA.d(vgcVar, ajctVar).c(new vgd(z), ajctVar).e();
    }

    @Override // defpackage.vfj
    public final defpackage.ajcq g(android.telecom.PhoneAccountHandle phoneAccountHandle, veo veoVar) {
        defpackage.vfo vfoVar = this.g;
        vfoVar.e();
        return defpackage.ahvr.H(vfoVar.c(phoneAccountHandle, veoVar), new vfp(this, phoneAccountHandle, 1), this.f);
    }

    @Override // defpackage.vfj
    public final defpackage.ajcq h(android.telecom.PhoneAccountHandle phoneAccountHandle, vce vceVar, defpackage.vcr vcrVar) {
        vbs vbsVarB;
        int i = vcrVar.b;
        if (i == 2) {
            defpackage.vcp vcpVar = i == 2 ? (defpackage.vcp) vcrVar.c : defpackage.vcp.a;
            if (vcpVar.b == 1) {
                vbsVarB = vbs.b(((java.lang.Integer) vcpVar.c).intValue());
                if (vbsVarB == null) {
                    vbsVarB = vbs.H;
                }
            } else {
                vbsVarB = vbs.a;
            }
            if (vceVar.b == 1 || vbsVarB == vbs.x || vbsVarB == vbs.y) {
                defpackage.vze vzeVar = this.l;
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
                java.lang.String packageName = this.e.getPackageName();
                akzxVarM.u();
                defpackage.vzi vziVar3 = (defpackage.vzi) akzxVarM.b;
                j$.util.Objects.requireNonNull(packageName);
                vziVar3.b |= 1;
                vziVar3.c = packageName;
                akzxVarM.u();
                defpackage.vzi vziVar4 = (defpackage.vzi) akzxVarM.b;
                vziVar4.b |= 32;
                vziVar4.h = 4;
                return vzeVar.e((defpackage.vzi) akzxVarM.r());
            }
        }
        return defpackage.ajcm.a;
    }

    @Override // defpackage.vfj
    public final defpackage.ajcq i(android.telecom.PhoneAccountHandle phoneAccountHandle, vcn vcnVar, boolean z) {
        return ((java.lang.Boolean) this.k.a()).booleanValue() ? m(phoneAccountHandle, new pit(this, phoneAccountHandle, vcnVar, 4)) : this.c.j(phoneAccountHandle, vcnVar);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.vfj
    public final defpackage.ajcq j(android.telecom.PhoneAccountHandle phoneAccountHandle, vci vciVar) {
        defpackage.aogc aogcVar = this.d;
        return defpackage.ahvr.I(aogcVar.ap(phoneAccountHandle), new vec(phoneAccountHandle, vciVar, 7), aogcVar.a);
    }

    @Override // defpackage.vfj
    public final defpackage.ajcq k(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.vfl.a.b()).i(defpackage.zct.a)).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpStatusChecker", "updateStatus", 'Z', "OmtpStatusChecker.java")).y("enter for %s", phoneAccountHandle);
        defpackage.vfl vflVar = this.i;
        return defpackage.ahrv.g(defpackage.ahrv.g(vflVar.d.c(phoneAccountHandle)).i(new vec(vflVar, phoneAccountHandle, 10), vflVar.b)).i(new vec(this, phoneAccountHandle, 17), this.f);
    }

    @Override // defpackage.vfj
    public final defpackage.ajcq l(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return ((java.lang.Boolean) this.k.a()).booleanValue() ? m(phoneAccountHandle, new pin(this, phoneAccountHandle, 14)) : this.c.i(phoneAccountHandle);
    }
}
