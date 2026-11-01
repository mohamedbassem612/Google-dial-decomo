package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class vak implements defpackage.ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ vak(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ahyc
    public final java.lang.Object apply(java.lang.Object obj) {
        vbs vbsVarB;
        vbs vbsVarB2;
        vbs vbsVarB3;
        switch (this.$cid) {
            case 0:
                return java.lang.Boolean.valueOf(!((java.lang.Boolean) obj).booleanValue());
            case 1:
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) vai.a.b()).i(defpackage.zct.a)).l("com/android/dialer/voicemail/dualsim/impl/VoicemailDualSimImpl", "deleteVoicemailFuture", 77, "VoicemailDualSimImpl.java")).y("delete %d voicemails", (java.lang.Integer) obj);
                return null;
            case 2:
                j$.util.Optional optionalS = ((defpackage.oko) obj).s();
                if (true == optionalS.isPresent()) {
                    optionalS = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((android.os.PersistableBundle) optionalS.get()).getBoolean("voicemail_notification_persistent_bool")));
                }
                return (java.lang.Boolean) optionalS.orElse(java.lang.Boolean.FALSE);
            case 3:
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((android.telecom.PhoneAccount) optionalOfNullable.get()).hasCapabilities(4)));
                }
                return (java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE);
            case 4:
                j$.util.Optional optional = (j$.util.Optional) obj;
                return true == optional.isPresent() ? j$.util.Optional.ofNullable(((abtr) optional.get()).d) : optional;
            case 5:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                return true == optional2.isPresent() ? j$.util.Optional.ofNullable(((abtr) optional2.get()).f) : optional2;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                j$.util.Optional optional3 = (j$.util.Optional) obj;
                return true == optional3.isPresent() ? ((abtr) optional3.get()).b : optional3;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return null;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return null;
            case 9:
                return java.lang.Boolean.valueOf(((j$.util.Optional) obj).isPresent());
            case 10:
                switch (((defpackage.vcs) obj).ordinal()) {
                    case 0:
                    case 10:
                        return "vvm_type_disabled";
                    case 1:
                        return "vvm_type_rest";
                    case 2:
                        return "vvm_type_cvvm";
                    case 3:
                        return "vvm_type_omtp";
                    case 4:
                        return "vvm_type_omtp_1_2";
                    case 5:
                        return "vvm_type_omtp_1_3";
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        return "vvm_type_advvm";
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return "vvm_type_vvm3";
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return "vvm_type_vvm3_mvno";
                    case 9:
                        return "vvm_type_test";
                    default:
                        throw new java.lang.AssertionError("exhaustive switch, should not get here");
                }
            case 11:
                switch (((defpackage.vcs) obj).ordinal()) {
                    case 0:
                    case 10:
                        return amsh.a;
                    case 1:
                        return amsh.b;
                    case 2:
                        return amsh.c;
                    case 3:
                        return amsh.d;
                    case 4:
                        return amsh.e;
                    case 5:
                        return amsh.f;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        return amsh.g;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        return amsh.h;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        return amsh.i;
                    case 9:
                        return amsh.j;
                    default:
                        throw new java.lang.AssertionError("exhaustive switch, should not get here");
                }
            case 12:
                defpackage.aimz aimzVar = defpackage.vdo.a;
                return java.lang.Integer.valueOf((int) j$.util.Collection.-EL.stream((java.util.List) obj).filter(new sqj(13)).count());
            case 13:
                defpackage.vcr vcrVar = (defpackage.vcr) obj;
                int i = vcrVar.b;
                if (i == 1) {
                    return vcw.a;
                }
                defpackage.vcp vcpVar = i == 2 ? (defpackage.vcp) vcrVar.c : defpackage.vcp.a;
                if (vcpVar.b == 1) {
                    vbsVarB = vbs.b(((java.lang.Integer) vcpVar.c).intValue());
                    if (vbsVarB == null) {
                        vbsVarB = vbs.H;
                    }
                } else {
                    vbsVarB = vbs.a;
                }
                if (vbsVarB == vbs.i) {
                    return vcw.c;
                }
                defpackage.vcp vcpVar2 = vcrVar.b == 2 ? (defpackage.vcp) vcrVar.c : defpackage.vcp.a;
                if (vcpVar2.b == 1) {
                    vbsVarB2 = vbs.b(((java.lang.Integer) vcpVar2.c).intValue());
                    if (vbsVarB2 == null) {
                        vbsVarB2 = vbs.H;
                    }
                } else {
                    vbsVarB2 = vbs.a;
                }
                if (vbsVarB2 != vbs.c) {
                    if (vcpVar2.b == 1) {
                        vbsVarB3 = vbs.b(((java.lang.Integer) vcpVar2.c).intValue());
                        if (vbsVarB3 == null) {
                            vbsVarB3 = vbs.H;
                        }
                    } else {
                        vbsVarB3 = vbs.a;
                    }
                    if (vbsVarB3 != vbs.g && vcpVar2.d) {
                        return vcw.b;
                    }
                }
                return vcw.d;
            case 14:
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.vea.a.c()).i(defpackage.zct.b)).i(defpackage.zct.a)).k((java.lang.Exception) obj)).l("com/android/dialer/voicemail/service/impl/scheduler/VvmExecutorImpl", "execute", 208, "VvmExecutorImpl.java")).v("Could not complete scheduled vvm work");
                return vcw.d;
            case 15:
                return java.lang.Boolean.valueOf(((java.lang.Integer) ((j$.util.Optional) obj).orElse(-1)).intValue() == 0);
            case 16:
                defpackage.akzx akzxVarM = defpackage.vcr.a.m();
                defpackage.akzx akzxVarM2 = defpackage.vcp.a.m();
                vbs vbsVar = vbs.h;
                akzxVarM2.u();
                defpackage.vcp vcpVar3 = (defpackage.vcp) akzxVarM2.b;
                vcpVar3.c = java.lang.Integer.valueOf(vbsVar.a());
                vcpVar3.b = 1;
                akzxVarM.u();
                defpackage.vcr vcrVar2 = (defpackage.vcr) akzxVarM.b;
                defpackage.vcp vcpVar4 = (defpackage.vcp) akzxVarM2.r();
                j$.util.Objects.requireNonNull(vcpVar4);
                vcrVar2.c = vcpVar4;
                vcrVar2.b = 2;
                return (defpackage.vcr) akzxVarM.r();
            case 17:
                return (defpackage.vcc) ((j$.util.Optional) obj).orElseThrow(new rqc(8));
            case 18:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return null;
                }
                throw new java.lang.IllegalStateException("VVM is turned off");
            case 19:
                return new defpackage.gsf();
            default:
                return new gse();
        }
    }
}
