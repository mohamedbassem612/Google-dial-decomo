package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class afgc {
    static {
        akzx akzxVarM = defpackage.amlt.a.m();
        defpackage.amln amlnVar = defpackage.amln.a;
        akzxVarM.u();
        defpackage.amlt amltVar = (defpackage.amlt) akzxVarM.b;
        j$.util.Objects.requireNonNull(amlnVar);
        amltVar.c = amlnVar;
        amltVar.b = 1;
        akzx akzxVarM2 = defpackage.amlt.a.m();
        defpackage.amlr amlrVar = defpackage.amlr.a;
        akzxVarM2.u();
        defpackage.amlt amltVar2 = (defpackage.amlt) akzxVarM2.b;
        j$.util.Objects.requireNonNull(amlrVar);
        amltVar2.c = amlrVar;
        amltVar2.b = 2;
        akzx akzxVarM3 = defpackage.amlt.a.m();
        defpackage.amls amlsVar = defpackage.amls.a;
        akzxVarM3.u();
        defpackage.amlt amltVar3 = (defpackage.amlt) akzxVarM3.b;
        j$.util.Objects.requireNonNull(amlsVar);
        amltVar3.c = amlsVar;
        amltVar3.b = 3;
    }

    public static java.lang.String a(amlu amluVar) {
        int i;
        java.lang.String strConcat;
        aift aiftVar = new aift(4);
        for (defpackage.amlt amltVar : amluVar.b) {
            int i2 = amltVar.b;
            switch (i2) {
                case 0:
                    i = 7;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 5;
                    break;
                case 6:
                    i = 6;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (i == 0) {
                throw null;
            }
            int i3 = i - 1;
            if (i3 == 0) {
                strConcat = "compress";
            } else if (i3 != 1) {
                java.lang.String str = "";
                if (i3 == 2) {
                    defpackage.amls amlsVar = i2 == 3 ? (defpackage.amls) amltVar.c : defpackage.amls.a;
                    int i4 = amlsVar.b;
                    strConcat = i4 == 1 ? "integrity(sha256=" + b(i4 == 1 ? (java.lang.String) amlsVar.c : "") + ')' : "integrity";
                } else if (i3 == 3) {
                    defpackage.amlv amlvVar = i2 == 4 ? (defpackage.amlv) amltVar.c : defpackage.amlv.a;
                    ahvr.bM(1 == (amlvVar.b & 1));
                    strConcat = "zip(target=" + b(amlvVar.c) + ')';
                } else if (i3 == 4) {
                    defpackage.amlp amlpVar = i2 == 5 ? (defpackage.amlp) amltVar.c : defpackage.amlp.a;
                    if (amlpVar.c.size() > 0) {
                        aift aiftVar2 = new aift(4);
                        for (defpackage.amlo amloVar : amlpVar.c) {
                            ahvr.bM(1 == (amloVar.b & 1));
                            if ((amloVar.b & 2) != 0) {
                                aiftVar2.i(amloVar.c + '=' + b(amloVar.d));
                            } else {
                                aiftVar2.i(amloVar.c);
                            }
                        }
                        str = "(" + new ahyj(",").b(aiftVar2.h()) + ')';
                    }
                    strConcat = java.lang.String.valueOf(amlpVar.b).concat(str);
                } else {
                    if (i3 != 5) {
                        throw new java.lang.IllegalArgumentException("No transform specified");
                    }
                    strConcat = "defrag";
                }
            } else {
                defpackage.amlr amlrVar = i2 == 2 ? (defpackage.amlr) amltVar.c : defpackage.amlr.a;
                int i5 = amlrVar.b;
                if (i5 == 1) {
                    strConcat = "encrypt(aes_gcm_key=" + b((java.lang.String) amlrVar.c) + ')';
                } else if (i5 == 2) {
                    strConcat = "encrypt(aes_gcm_hkdf_key=" + b((java.lang.String) amlrVar.c) + ')';
                } else {
                    strConcat = "encrypt";
                }
            }
            aiftVar.i(strConcat);
        }
        return affh.a(aiftVar.h());
    }

    private static final java.lang.String b(java.lang.String str) {
        try {
            return j$.net.URLEncoder.encode(str, java.nio.charset.StandardCharsets.UTF_8.name());
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }
}
