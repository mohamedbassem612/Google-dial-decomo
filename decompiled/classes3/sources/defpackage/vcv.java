package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vcv extends java.lang.RuntimeException {
    public final vcp a;

    /* JADX WARN: Illegal instructions before constructor call */
    public vcv(defpackage.vbs vbsVar, java.lang.String str, java.lang.Throwable th) {
        akzx akzxVarM = vcp.a.m();
        akzxVarM.u();
        vcp vcpVar = akzxVarM.b;
        vcpVar.c = java.lang.Integer.valueOf(vbsVar.a());
        vcpVar.b = 1;
        this(akzxVarM.p(), str, th);
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.vbs vbsVarB;
        defpackage.vbs vbsVarB2;
        defpackage.vbw vbwVarB;
        defpackage.vbw vbwVarB2;
        defpackage.vbx vbxVarB;
        defpackage.vbx vbxVarB2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.vcv) {
            defpackage.vcv vcvVar = (defpackage.vcv) obj;
            vcp vcpVar = this.a;
            if (vcpVar.b == 1) {
                vbsVarB = defpackage.vbs.b(((java.lang.Integer) vcpVar.c).intValue());
                if (vbsVarB == null) {
                    vbsVarB = defpackage.vbs.UNRECOGNIZED;
                }
            } else {
                vbsVarB = defpackage.vbs.UNSPECIFIED;
            }
            vcp vcpVar2 = vcvVar.a;
            if (vcpVar2.b == 1) {
                vbsVarB2 = defpackage.vbs.b(((java.lang.Integer) vcpVar2.c).intValue());
                if (vbsVarB2 == null) {
                    vbsVarB2 = defpackage.vbs.UNRECOGNIZED;
                }
            } else {
                vbsVarB2 = defpackage.vbs.UNSPECIFIED;
            }
            if (vbsVarB == vbsVarB2) {
                if (vcpVar.b == 3) {
                    vbwVarB = defpackage.vbw.b(((java.lang.Integer) vcpVar.c).intValue());
                    if (vbwVarB == null) {
                        vbwVarB = defpackage.vbw.UNRECOGNIZED;
                    }
                } else {
                    vbwVarB = defpackage.vbw.OMTP_UNSPECIFIED;
                }
                if (vcpVar2.b == 3) {
                    vbwVarB2 = defpackage.vbw.b(((java.lang.Integer) vcpVar2.c).intValue());
                    if (vbwVarB2 == null) {
                        vbwVarB2 = defpackage.vbw.UNRECOGNIZED;
                    }
                } else {
                    vbwVarB2 = defpackage.vbw.OMTP_UNSPECIFIED;
                }
                if (vbwVarB == vbwVarB2) {
                    if (vcpVar.b == 2) {
                        vbxVarB = defpackage.vbx.b(((java.lang.Integer) vcpVar.c).intValue());
                        if (vbxVarB == null) {
                            vbxVarB = defpackage.vbx.UNRECOGNIZED;
                        }
                    } else {
                        vbxVarB = defpackage.vbx.REST_UNSPECIFIED;
                    }
                    if (vcpVar2.b == 2) {
                        vbxVarB2 = defpackage.vbx.b(((java.lang.Integer) vcpVar2.c).intValue());
                        if (vbxVarB2 == null) {
                            vbxVarB2 = defpackage.vbx.UNRECOGNIZED;
                        }
                    } else {
                        vbxVarB2 = defpackage.vbx.REST_UNSPECIFIED;
                    }
                    if (vbxVarB == vbxVarB2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a});
    }

    public vcv(defpackage.vbs vbsVar) {
        this(vbsVar, "General VVM failure reason: " + vbsVar.a(), (java.lang.Throwable) null);
    }

    public vcv(defpackage.vbw vbwVar) {
        this(vbwVar, "OMTP VVM failure reason: " + vbwVar.a(), (java.lang.Throwable) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public vcv(defpackage.vbw vbwVar, java.lang.String str, java.lang.Throwable th) {
        akzx akzxVarM = vcp.a.m();
        akzxVarM.u();
        vcp vcpVar = akzxVarM.b;
        vcpVar.c = java.lang.Integer.valueOf(vbwVar.a());
        vcpVar.b = 3;
        this(akzxVarM.p(), str, th);
    }

    public vcv(vcp vcpVar, java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        this.a = vcpVar;
    }
}
