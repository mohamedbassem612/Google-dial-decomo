package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vea {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/scheduler/VvmExecutorImpl");
    public final android.content.Context b;
    public final defpackage.vei c;
    public final defpackage.ajct d;
    public final defpackage.oko e;
    public final defpackage.aoin f;
    public final defpackage.rlv g;
    public final defpackage.aoin h;
    public final defpackage.vth i;
    public final defpackage.vaf j;
    public final defpackage.aoin k;
    public final defpackage.aoin l;
    public final defpackage.ahbv m;
    private final defpackage.vdq n;
    private final defpackage.ajct o;
    private final defpackage.aoin p;
    private final defpackage.vze q;
    private final defpackage.ahda r = new defpackage.ahda();

    public vea(android.content.Context context, defpackage.vei veiVar, defpackage.ahbv ahbvVar, defpackage.vdq vdqVar, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.oko okoVar, defpackage.aoin aoinVar, defpackage.vze vzeVar, defpackage.rlv rlvVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.vth vthVar, defpackage.vaf vafVar, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5) {
        this.b = context;
        this.c = veiVar;
        this.m = ahbvVar;
        this.n = vdqVar;
        this.d = ajctVar;
        this.o = ajctVar2;
        this.e = okoVar;
        this.f = aoinVar;
        this.q = vzeVar;
        this.g = rlvVar;
        this.p = aoinVar2;
        this.h = aoinVar3;
        this.i = vthVar;
        this.j = vafVar;
        this.k = aoinVar4;
        this.l = aoinVar5;
    }

    public static defpackage.aepd a(defpackage.vcp vcpVar) {
        vbs vbsVarB;
        if (vcpVar.b == 1) {
            vbsVarB = vbs.b(((java.lang.Integer) vcpVar.c).intValue());
            if (vbsVarB == null) {
                vbsVarB = vbs.H;
            }
        } else {
            vbsVarB = vbs.a;
        }
        return new defpackage.aepg((java.lang.Enum) vbsVarB);
    }

    public static defpackage.aepd b(defpackage.vcp vcpVar) {
        vbw vbwVarB;
        if (vcpVar.b == 3) {
            vbwVarB = vbw.b(((java.lang.Integer) vcpVar.c).intValue());
            if (vbwVarB == null) {
                vbwVarB = vbw.ab;
            }
        } else {
            vbwVarB = vbw.a;
        }
        return new defpackage.aepg((java.lang.Enum) vbwVarB);
    }

    public static defpackage.aepd c(defpackage.vcp vcpVar) {
        vbx vbxVarB;
        if (vcpVar.b == 2) {
            vbxVarB = vbx.b(((java.lang.Integer) vcpVar.c).intValue());
            if (vbxVarB == null) {
                vbxVarB = vbx.o;
            }
        } else {
            vbxVarB = vbx.a;
        }
        return new defpackage.aepg((java.lang.Enum) vbxVarB);
    }

    public static j$.util.Optional h(vce vceVar, android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z) {
        switch (vcd.a(vceVar.b).ordinal()) {
            case 0:
                return j$.util.Optional.of(new vds(phoneAccountHandle, z, 1));
            case 1:
                return j$.util.Optional.of(new vdr(phoneAccountHandle, 1));
            case 2:
                return j$.util.Optional.of(new vdr(phoneAccountHandle, 0));
            case 3:
                return j$.util.Optional.of(new vds(phoneAccountHandle, z, 0));
            case 4:
                return j$.util.Optional.of(new vdr(phoneAccountHandle, 2));
            case 5:
                return j$.util.Optional.of(new vdt(phoneAccountHandle, vceVar.b == 6 ? (vbn) vceVar.c : vbn.a, 2));
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return j$.util.Optional.of(new vdu(phoneAccountHandle, vceVar.b == 7 ? (vbz) vceVar.c : vbz.a, z));
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return j$.util.Optional.of(new vdt(phoneAccountHandle, vceVar.b == 8 ? (vcb) vceVar.c : vcb.a, 3));
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return j$.util.Optional.of(new vdt(phoneAccountHandle, vceVar.b == 9 ? (vbr) vceVar.c : vbr.a, 1));
            case 9:
                return j$.util.Optional.of(new vdr(phoneAccountHandle, 3));
            case 10:
                return j$.util.Optional.of(new vdt(phoneAccountHandle, vceVar, 0));
            case 11:
                return j$.util.Optional.empty();
            default:
                throw new java.lang.AssertionError("Fail to get job for provided VvmAction.");
        }
    }

    public static java.lang.String i(defpackage.vcp vcpVar) {
        vbs vbsVarB;
        vbx vbxVarB;
        vbw vbwVarB;
        if (vcpVar.b == 1) {
            vbsVarB = vbs.b(((java.lang.Integer) vcpVar.c).intValue());
            if (vbsVarB == null) {
                vbsVarB = vbs.H;
            }
        } else {
            vbsVarB = vbs.a;
        }
        java.lang.String strName = vbsVarB.name();
        if (vcpVar.b == 2) {
            vbxVarB = vbx.b(((java.lang.Integer) vcpVar.c).intValue());
            if (vbxVarB == null) {
                vbxVarB = vbx.o;
            }
        } else {
            vbxVarB = vbx.a;
        }
        java.lang.String strName2 = vbxVarB.name();
        if (vcpVar.b == 3) {
            vbwVarB = vbw.b(((java.lang.Integer) vcpVar.c).intValue());
            if (vbwVarB == null) {
                vbwVarB = vbw.ab;
            }
        } else {
            vbwVarB = vbw.a;
        }
        return java.lang.String.format("[GeneralFailureReason: %s, RestFailureReason: %s, OmtpFailureReason: %s]", strName, strName2, vbwVarB.name());
    }

    public final defpackage.ajcq d() {
        return defpackage.ahvr.F(new vdp(this, 2), this.o);
    }

    public final defpackage.ajcq e(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(this.e.n(phoneAccountHandle));
        qgk qgkVar = new qgk(11);
        defpackage.ajct ajctVar = this.d;
        return ahrvVarG.i(qgkVar, ajctVar).h(new defpackage.vak(15), ajctVar);
    }

    public final defpackage.ajcq f(android.telecom.PhoneAccountHandle phoneAccountHandle, vcv vcvVar) {
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
        java.lang.String packageName = this.b.getPackageName();
        akzxVarM.u();
        defpackage.vzi vziVar3 = (defpackage.vzi) akzxVarM.b;
        j$.util.Objects.requireNonNull(packageName);
        vziVar3.b |= 1;
        vziVar3.c = packageName;
        akzxVarM.u();
        defpackage.vzi vziVar4 = (defpackage.vzi) akzxVarM.b;
        defpackage.vcp vcpVar = vcvVar.a;
        j$.util.Objects.requireNonNull(vcpVar);
        vziVar4.g = vcpVar;
        vziVar4.b |= 16;
        return defpackage.ahvr.H(this.q.e((defpackage.vzi) akzxVarM.r()), new van(vcvVar, 17), this.d);
    }

    public final defpackage.ajcq g(android.telecom.PhoneAccountHandle phoneAccountHandle, vcx vcxVar) {
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
        java.lang.String packageName = this.b.getPackageName();
        akzxVarM.u();
        defpackage.vzi vziVar3 = (defpackage.vzi) akzxVarM.b;
        j$.util.Objects.requireNonNull(packageName);
        vziVar3.b |= 1;
        vziVar3.c = packageName;
        defpackage.vcr vcrVar = vcxVar.a;
        defpackage.vcp vcpVar = vcrVar.b == 2 ? (defpackage.vcp) vcrVar.c : defpackage.vcp.a;
        defpackage.vze vzeVar = this.q;
        akzxVarM.u();
        defpackage.vzi vziVar4 = (defpackage.vzi) akzxVarM.b;
        j$.util.Objects.requireNonNull(vcpVar);
        vziVar4.g = vcpVar;
        vziVar4.b |= 16;
        return defpackage.ahvr.H(vzeVar.e((defpackage.vzi) akzxVarM.r()), new van(vcxVar, 14), this.d);
    }

    public final void j(defpackage.amsq amsqVar) {
        defpackage.vdq vdqVar = this.n;
        uwl uwlVar = new uwl(vdqVar, amsqVar, 18);
        java.util.concurrent.Executor executor = vdqVar.d;
        defpackage.agsm.i(975, defpackage.ahvr.F(uwlVar, executor), "failed to add VvmWorkMetrics", new java.lang.Object[0]);
        amsn amsnVar = vdqVar.b.e;
        if (amsnVar == null) {
            amsnVar = amsn.a;
        }
        if (amsnVar.b == 2) {
            defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) defpackage.vdq.a.b()).l("com/android/dialer/voicemail/service/impl/logger/VoicemailLogger", "commitMetrics", 169, "VoicemailLogger.java");
            amsn amsnVar2 = vdqVar.b.e;
            if (amsnVar2 == null) {
                amsnVar2 = amsn.a;
            }
            vbs vbsVarB = vbs.b((amsnVar2.b == 2 ? (amsl) amsnVar2.c : amsl.a).f);
            if (vbsVarB == null) {
                vbsVarB = vbs.a;
            }
            aimwVar.y("VVM failure reason: %s", vbsVarB);
        }
        defpackage.agsm.i(976, defpackage.ahvr.F(new vdp(vdqVar, 0), executor), "failed to commit VVM metrics", new java.lang.Object[0]);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq k(android.telecom.PhoneAccountHandle phoneAccountHandle, vce vceVar, int i, int i2, amsi amsiVar) {
        defpackage.ahbv ahbvVar = this.m;
        defpackage.ajcq ajcqVarH = defpackage.ahvr.H(ahbvVar.q(phoneAccountHandle), new defpackage.vak(11), ahbvVar.c);
        defpackage.ajcq ajcqVarO = ahbvVar.o(phoneAccountHandle);
        defpackage.ajcq ajcqVarN = ahbvVar.n(phoneAccountHandle);
        return defpackage.ahvr.ak(ajcqVarH, ajcqVarO, ajcqVarN).p(new vdw(this, vceVar, i, phoneAccountHandle, ajcqVarH, i2, amsiVar, ajcqVarO, ajcqVarN), this.d);
    }

    public final defpackage.ajcq l(android.telecom.PhoneAccountHandle phoneAccountHandle, vce vceVar, int i, int i2, amsi amsiVar) {
        return ((java.lang.Boolean) this.p.a()).booleanValue() ? defpackage.ahvr.H(k(phoneAccountHandle, vceVar, i, i2, amsiVar), new van(phoneAccountHandle, 16), this.d) : this.r.h(new vdx(this, phoneAccountHandle, vceVar, i, i2, amsiVar), this.d);
    }
}
