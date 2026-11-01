package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vee {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/scheduler/VvmServiceSchedulerImpl");
    public final defpackage.zjx b;
    public final defpackage.aoin c;
    public final j$.util.Optional d;
    public final defpackage.ajct e;
    public final defpackage.aoin f;
    public final defpackage.vea g;
    public final defpackage.gpd h;
    private final defpackage.aoin i;
    private final defpackage.aoin j;
    private final defpackage.ahda k = new defpackage.ahda();
    private final defpackage.zzx l;
    private final defpackage.ahbv m;
    private final defpackage.aogc n;

    public vee(defpackage.aogc aogcVar, defpackage.zjx zjxVar, defpackage.vea veaVar, defpackage.ahbv ahbvVar, defpackage.gpd gpdVar, defpackage.aoin aoinVar, j$.util.Optional optional, defpackage.ajct ajctVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.zzx zzxVar, defpackage.aoin aoinVar4) {
        this.n = aogcVar;
        this.b = zjxVar;
        this.g = veaVar;
        this.m = ahbvVar;
        this.h = gpdVar;
        this.c = aoinVar;
        this.d = optional;
        this.e = ajctVar;
        this.i = aoinVar2;
        this.f = aoinVar3;
        this.l = zzxVar;
        this.j = aoinVar4;
    }

    private final defpackage.ajcq l(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.ahvr.H(this.m.n(phoneAccountHandle), new defpackage.vak(17), this.e);
    }

    public final defpackage.ajcq a(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(l(phoneAccountHandle));
        vct vctVar = new vct(phoneAccountHandle, 7);
        defpackage.ajct ajctVar = this.e;
        return ahrvVarG.i(vctVar, ajctVar).h(new defpackage.vak(18), ajctVar);
    }

    public final defpackage.ajcq b(android.telecom.PhoneAccountHandle phoneAccountHandle, vce vceVar) {
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(l(phoneAccountHandle));
        vct vctVar = new vct(phoneAccountHandle, 4);
        defpackage.ajct ajctVar = this.e;
        defpackage.ahrv ahrvVarI = ahrvVarG.i(vctVar, ajctVar).i(new sue(this, phoneAccountHandle, vceVar, 20, (byte[]) null), ajctVar);
        return ((java.lang.Boolean) this.i.a()).booleanValue() ? this.k.h(new viv(ahrvVarI, 1), ajctVar) : ahrvVarI;
    }

    public final defpackage.ajcq c(android.telecom.PhoneAccountHandle phoneAccountHandle, java.lang.String str, java.lang.String str2) {
        defpackage.akzx akzxVarM = vbn.a.m();
        akzxVarM.u();
        vbn vbnVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        vbnVar.b = str;
        akzxVarM.u();
        vbn vbnVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        vbnVar2.c = str2;
        vbn vbnVarR = akzxVarM.r();
        defpackage.akzx akzxVarM2 = vce.a.m();
        akzxVarM2.u();
        vce vceVar = akzxVarM2.b;
        j$.util.Objects.requireNonNull(vbnVarR);
        vceVar.c = vbnVarR;
        vceVar.b = 6;
        return b(phoneAccountHandle, (vce) akzxVarM2.r());
    }

    public final defpackage.ajcq d(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.akzx akzxVarM = vce.a.m();
        vbq vbqVar = vbq.a;
        akzxVarM.u();
        vce vceVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(vbqVar);
        vceVar.c = vbqVar;
        vceVar.b = 3;
        return b(phoneAccountHandle, (vce) akzxVarM.r());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq e(android.telecom.PhoneAccountHandle phoneAccountHandle, vce vceVar) {
        if (((java.lang.Boolean) this.j.a()).booleanValue() && this.l.m()) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.a)).l("com/android/dialer/voicemail/service/impl/scheduler/VvmServiceSchedulerImpl", "schedule", (char) 328, "VvmServiceSchedulerImpl.java")).v("VvmServiceSchedulerImpl: Direct Boot mode active, skipping schedule");
            return defpackage.ajcm.a;
        }
        defpackage.ainm ainmVarB = a.b();
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ainmVarB).i(defpackage.zct.a)).l("com/android/dialer/voicemail/service/impl/scheduler/VvmServiceSchedulerImpl", "schedule", (char) 334, "VvmServiceSchedulerImpl.java")).y("scheduling action: %s", vcd.a(vceVar.b).name());
        defpackage.aogc aogcVar = this.n;
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        defpackage.ajcq ajcqVarA = ((defpackage.vei) aogcVar.a).a();
        vef vefVar = new vef(2);
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(defpackage.ahvr.H(ajcqVarA, vefVar, ajbmVar));
        jsc jscVar = new jsc(aogcVar, phoneAccountHandle, vceVar, atomicReference, 9);
        ?? r10 = aogcVar.b;
        return defpackage.ahrv.g(ahrvVarG.i(jscVar, r10).h(new veb(atomicReference, 0), r10)).i(new vcu(this, phoneAccountHandle, 19), ajbmVar).i(new vct(this, 5), ajbmVar);
    }

    public final defpackage.ajcq f(android.telecom.PhoneAccountHandle phoneAccountHandle, vce vceVar) {
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(l(phoneAccountHandle));
        vct vctVar = new vct(phoneAccountHandle, 6);
        defpackage.ajct ajctVar = this.e;
        return ahrvVarG.i(vctVar, ajctVar).i(new vec(this, phoneAccountHandle, 0), ajctVar).i(new ved(this, phoneAccountHandle, vceVar, 1, (byte[]) null), ajctVar);
    }

    public final defpackage.ajcq g(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.ahvr.I(a(phoneAccountHandle), new vec(this, phoneAccountHandle, 1), this.e);
    }

    public final defpackage.ajcq h(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.akzx akzxVarM = vce.a.m();
        vbo vboVar = vbo.a;
        akzxVarM.u();
        vce vceVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(vboVar);
        vceVar.c = vboVar;
        vceVar.b = 2;
        return e(phoneAccountHandle, (vce) akzxVarM.r());
    }

    public final defpackage.ajcq i(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.ahvr.I(a(phoneAccountHandle), new vcu(this, phoneAccountHandle, 20), this.e);
    }

    public final defpackage.ajcq j(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.ahvr.I(a(phoneAccountHandle), new vcu(this, phoneAccountHandle, 18), this.e);
    }

    public final defpackage.ajcq k(android.telecom.PhoneAccountHandle phoneAccountHandle, vcn vcnVar, int i) {
        defpackage.akzx akzxVarM = amsp.a.m();
        java.lang.String string = java.util.UUID.randomUUID().toString();
        akzxVarM.u();
        amsp amspVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        amspVar.b |= 1;
        amspVar.c = string;
        akzxVarM.u();
        amsp amspVar2 = akzxVarM.b;
        amspVar2.e = 2;
        amspVar2.b |= 4;
        int i2 = i - 1;
        if (i2 == 0) {
            akzxVarM.u();
            amsp amspVar3 = akzxVarM.b;
            amspVar3.d = 4;
            amspVar3.b |= 2;
        } else if (i2 != 1) {
            akzxVarM.u();
            amsp amspVar4 = akzxVarM.b;
            amspVar4.d = 6;
            amspVar4.b |= 2;
        } else {
            akzxVarM.u();
            amsp amspVar5 = akzxVarM.b;
            amspVar5.d = 5;
            amspVar5.b |= 2;
        }
        uwl uwlVar = new uwl(this, akzxVarM, 19);
        defpackage.ajct ajctVar = this.e;
        defpackage.agsm.i(977, defpackage.ahvr.F(uwlVar, ajctVar), "failed to commit VvmSms metrics", new java.lang.Object[0]);
        return defpackage.ahvr.I(a(phoneAccountHandle), new sue(this, vcnVar, phoneAccountHandle, 19), ajctVar);
    }
}
