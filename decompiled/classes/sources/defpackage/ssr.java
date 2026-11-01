package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ssr {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/phonenumbervariations/PhoneNumberVariationGenerator");
    private final defpackage.sss b;
    private final defpackage.aogc c;

    public ssr(defpackage.sss sssVar, defpackage.aogc aogcVar) {
        this.b = sssVar;
        this.c = aogcVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0098  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
    @java.lang.Deprecated
    public final defpackage.aify a(java.lang.String str, java.lang.String str2) {
        int length;
        j$.util.Optional optionalEmpty;
        akgu akguVar;
        java.lang.String[] strArrSplit;
        akfx akfxVarAI = this.c.aI();
        try {
            akgu akguVarI = akfxVarAI.i(str, defpackage.akfg.b(str2));
            defpackage.aify aifyVar = (defpackage.aify) ((defpackage.aigf) this.b.b.eZ()).get(java.lang.Integer.valueOf(akguVarI.c));
            if (aifyVar == null) {
                aifyVar = defpackage.aike.a;
            }
            if (aifyVar.isEmpty()) {
                return defpackage.aike.a;
            }
            java.lang.String strL = akfxVarAI.l(akguVarI);
            akft akftVarF = akfxVarAI.f(akfxVarAI.d(akguVarI));
            if (akftVarF != null) {
                int iV = akfxVarAI.v(akguVarI);
                int i = akguVarI.c;
                if ((akftVarF.b & 2097152) == 0 && !akguVarI.f && !akfx.b.contains(java.lang.Integer.valueOf(i))) {
                    length = 0;
                } else if (iV != 2) {
                    if (akfxVarAI.A(iV, i)) {
                        if ((akguVarI.b & 4) != 0) {
                            defpackage.akzx akzxVarL = akguVarI.L();
                            akzxVarL.u();
                            akgu akguVar2 = akzxVarL.b;
                            akguVar2.b &= -5;
                            akguVar2.e = akgu.a.e;
                            akguVar = (akgu) akzxVarL.r();
                        } else {
                            akguVar = akguVarI;
                        }
                        strArrSplit = akfx.g.split(akfxVarAI.x(akguVar, 2));
                        if (strArrSplit.length <= 3) {
                            length = 0;
                        } else if (akfxVarAI.v(akguVarI) == 2 || akfx.k(akguVarI.c).isEmpty()) {
                            length = strArrSplit[2].length();
                        } else {
                            length = strArrSplit[2].length() + strArrSplit[3].length();
                        }
                    } else {
                        length = 0;
                    }
                } else if (akfx.a.contains(java.lang.Integer.valueOf(i))) {
                    length = 0;
                } else {
                    iV = 2;
                    if (akfxVarAI.A(iV, i)) {
                        length = 0;
                    } else {
                        if ((akguVarI.b & 4) != 0) {
                            defpackage.akzx akzxVarL2 = akguVarI.L();
                            akzxVarL2.u();
                            akgu akguVar3 = akzxVarL2.b;
                            akguVar3.b &= -5;
                            akguVar3.e = akgu.a.e;
                            akguVar = (akgu) akzxVarL2.r();
                        } else {
                            akguVar = akguVarI;
                        }
                        strArrSplit = akfx.g.split(akfxVarAI.x(akguVar, 2));
                        if (strArrSplit.length <= 3) {
                            length = 0;
                        } else if (akfxVarAI.v(akguVarI) == 2) {
                            length = strArrSplit[2].length();
                        } else {
                            length = strArrSplit[2].length();
                        }
                    }
                }
            } else {
                length = 0;
            }
            if (length > 0) {
                optionalEmpty = j$.util.Optional.of(strL.substring(0, length));
                strL = strL.substring(length);
            } else {
                optionalEmpty = j$.util.Optional.empty();
            }
            int i2 = akguVarI.c;
            defpackage.aift aiftVar = new defpackage.aift(4);
            int size = aifyVar.size();
            for (int i3 = 0; i3 < size; i3++) {
                java.lang.String str3 = (java.lang.String) aifyVar.get(i3);
                if (optionalEmpty.isPresent() || !str3.contains("%2$s")) {
                    aiftVar.i(java.lang.String.format(str3, java.lang.Integer.valueOf(i2), (java.lang.String) optionalEmpty.orElse(""), strL));
                }
            }
            return aiftVar.g();
        } catch (defpackage.akfm | defpackage.akfp e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/phonenumbervariations/PhoneNumberVariationGenerator", "getVariations", 67, "PhoneNumberVariationGenerator.java")).I("Fail to get variations of phone number: %s and country: %s.", defpackage.aais.aD(str), str2);
            return defpackage.aike.a;
        }
    }
}
