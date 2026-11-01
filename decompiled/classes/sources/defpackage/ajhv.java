package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajhv {
    public static final defpackage.ajmk a = new defpackage.ajmk(defpackage.ajgc.class, new defpackage.ajhg(2));
    public static final defpackage.ajmk b = new defpackage.ajmk("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", new defpackage.ajhh(2));
    public static final defpackage.ajmk c = new defpackage.ajmk(defpackage.ajfx.class, new defpackage.ajhi(2));
    public static final defpackage.ajmk d = new defpackage.ajmk("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", new defpackage.ajhj(2));

    public static defpackage.ajfx a(akxm akxmVar) throws java.security.GeneralSecurityException {
        if (!((java.lang.String) akxmVar.b).equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            java.lang.Object obj = akxmVar.d;
            defpackage.ajoi ajoiVar = (defpackage.ajoi) defpackage.alad.z(defpackage.ajoi.a, (defpackage.akzc) obj, defpackage.akzq.a);
            if (ajoiVar.c != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            ajon ajonVar = ajoiVar.d;
            if (ajonVar == null) {
                ajonVar = ajon.a;
            }
            if (ajonVar.c != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            defpackage.ajpo ajpoVar = ajoiVar.e;
            if (ajpoVar == null) {
                ajpoVar = defpackage.ajpo.a;
            }
            if (ajpoVar.c != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            defpackage.ajje ajjeVar = new defpackage.ajje((byte[]) null);
            ajon ajonVar2 = ajoiVar.d;
            if (ajonVar2 == null) {
                ajonVar2 = ajon.a;
            }
            ajjeVar.c(ajonVar2.e.c());
            defpackage.ajpo ajpoVar2 = ajoiVar.e;
            if (ajpoVar2 == null) {
                ajpoVar2 = defpackage.ajpo.a;
            }
            ajjeVar.d(ajpoVar2.e.c());
            ajon ajonVar3 = ajoiVar.d;
            if (ajonVar3 == null) {
                ajonVar3 = ajon.a;
            }
            ajop ajopVar = ajonVar3.d;
            if (ajopVar == null) {
                ajopVar = ajop.a;
            }
            ajjeVar.e(ajopVar.b);
            defpackage.ajpo ajpoVar3 = ajoiVar.e;
            if (ajpoVar3 == null) {
                ajpoVar3 = defpackage.ajpo.a;
            }
            ajpq ajpqVar = ajpoVar3.d;
            if (ajpqVar == null) {
                ajpqVar = ajpq.a;
            }
            ajjeVar.f(ajpqVar.c);
            defpackage.ajpo ajpoVar4 = ajoiVar.e;
            if (ajpoVar4 == null) {
                ajpoVar4 = defpackage.ajpo.a;
            }
            ajpq ajpqVar2 = ajpoVar4.d;
            if (ajpqVar2 == null) {
                ajpqVar2 = ajpq.a;
            }
            defpackage.ajpn ajpnVarB = defpackage.ajpn.b(ajpqVar2.b);
            if (ajpnVarB == null) {
                ajpnVarB = defpackage.ajpn.UNRECOGNIZED;
            }
            ajjeVar.d = f(ajpnVarB);
            ajjeVar.a = g((defpackage.ajfe) akxmVar.c);
            defpackage.ajgc ajgcVarB = ajjeVar.b();
            ajon ajonVar4 = ajoiVar.d;
            if (ajonVar4 == null) {
                ajonVar4 = ajon.a;
            }
            ajyi ajyiVarB = ajyi.B(ajonVar4.e.D());
            defpackage.ajpo ajpoVar5 = ajoiVar.e;
            if (ajpoVar5 == null) {
                ajpoVar5 = defpackage.ajpo.a;
            }
            return aftt.W(ajgcVarB, ajyiVarB, ajyi.B(ajpoVar5.e.D()), (java.lang.Integer) akxmVar.a);
        } catch (defpackage.alaz unused) {
            throw new java.security.GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    public static akxm b(defpackage.ajfx ajfxVar) throws java.security.GeneralSecurityException {
        defpackage.akzx akzxVarM = defpackage.ajoi.a.m();
        defpackage.akzx akzxVarM2 = ajon.a.m();
        defpackage.akzx akzxVarM3 = ajop.a.m();
        akzxVarM3.u();
        ajop ajopVar = akzxVarM3.b;
        defpackage.ajgc ajgcVar = ajfxVar.a;
        ajopVar.b = ajgcVar.c;
        ajop ajopVarR = akzxVarM3.r();
        akzxVarM2.u();
        ajon ajonVar = akzxVarM2.b;
        j$.util.Objects.requireNonNull(ajopVarR);
        ajonVar.d = ajopVarR;
        ajonVar.b |= 1;
        defpackage.akzc akzcVarU = defpackage.akzc.u(ajfxVar.d.k());
        akzxVarM2.u();
        ajon ajonVar2 = akzxVarM2.b;
        j$.util.Objects.requireNonNull(akzcVarU);
        ajonVar2.e = akzcVarU;
        ajon ajonVarR = akzxVarM2.r();
        akzxVarM.u();
        defpackage.ajoi ajoiVar = (defpackage.ajoi) akzxVarM.b;
        j$.util.Objects.requireNonNull(ajonVarR);
        ajoiVar.d = ajonVarR;
        ajoiVar.b |= 1;
        defpackage.akzx akzxVarM4 = defpackage.ajpo.a.m();
        ajpq ajpqVarH = h(ajgcVar);
        akzxVarM4.u();
        defpackage.ajpo ajpoVar = (defpackage.ajpo) akzxVarM4.b;
        j$.util.Objects.requireNonNull(ajpqVarH);
        ajpoVar.d = ajpqVarH;
        ajpoVar.b |= 1;
        defpackage.akzc akzcVarU2 = defpackage.akzc.u(ajfxVar.e.k());
        akzxVarM4.u();
        defpackage.ajpo ajpoVar2 = (defpackage.ajpo) akzxVarM4.b;
        j$.util.Objects.requireNonNull(akzcVarU2);
        ajpoVar2.e = akzcVarU2;
        defpackage.ajpo ajpoVar3 = (defpackage.ajpo) akzxVarM4.r();
        akzxVarM.u();
        defpackage.ajoi ajoiVar2 = (defpackage.ajoi) akzxVarM.b;
        j$.util.Objects.requireNonNull(ajpoVar3);
        ajoiVar2.e = ajpoVar3;
        ajoiVar2.b |= 2;
        return akxm.d("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((defpackage.ajoi) akzxVarM.r()).f(), ajfd.b, e(ajgcVar.e), ajfxVar.c);
    }

    public static defpackage.aogc c(defpackage.ajgc ajgcVar) throws java.security.GeneralSecurityException {
        defpackage.ajfe ajfeVarE = e(ajgcVar.e);
        defpackage.akzx akzxVarM = ajoj.a.m();
        defpackage.akzx akzxVarM2 = ajoo.a.m();
        defpackage.akzx akzxVarM3 = ajop.a.m();
        akzxVarM3.u();
        akzxVarM3.b.b = ajgcVar.c;
        ajop ajopVarR = akzxVarM3.r();
        akzxVarM2.u();
        ajoo ajooVar = akzxVarM2.b;
        j$.util.Objects.requireNonNull(ajopVarR);
        ajooVar.c = ajopVarR;
        ajooVar.b |= 1;
        akzxVarM2.u();
        akzxVarM2.b.d = ajgcVar.a;
        ajoo ajooVarR = akzxVarM2.r();
        akzxVarM.u();
        ajoj ajojVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(ajooVarR);
        ajojVar.c = ajooVarR;
        ajojVar.b |= 1;
        defpackage.akzx akzxVarM4 = ajpp.a.m();
        ajpq ajpqVarH = h(ajgcVar);
        akzxVarM4.u();
        ajpp ajppVar = akzxVarM4.b;
        j$.util.Objects.requireNonNull(ajpqVarH);
        ajppVar.c = ajpqVarH;
        ajppVar.b |= 1;
        akzxVarM4.u();
        akzxVarM4.b.d = ajgcVar.b;
        ajpp ajppVarR = akzxVarM4.r();
        akzxVarM.u();
        ajoj ajojVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(ajppVarR);
        ajojVar2.d = ajppVarR;
        ajojVar2.b |= 2;
        return defpackage.aogc.C("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ajfeVarE, akzxVarM.r().f());
    }

    public static defpackage.ajgc d(defpackage.aogc aogcVar) throws java.security.GeneralSecurityException {
        if (!((java.lang.String) aogcVar.b).equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(aogcVar.b)));
        }
        try {
            java.lang.Object obj = aogcVar.c;
            ajoj ajojVarZ = defpackage.alad.z(ajoj.a, (defpackage.akzc) obj, defpackage.akzq.a);
            ajpp ajppVar = ajojVarZ.d;
            if (ajppVar == null) {
                ajppVar = ajpp.a;
            }
            if (ajppVar.e != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            defpackage.ajje ajjeVar = new defpackage.ajje((byte[]) null);
            ajoo ajooVar = ajojVarZ.c;
            if (ajooVar == null) {
                ajooVar = ajoo.a;
            }
            ajjeVar.c(ajooVar.d);
            ajpp ajppVar2 = ajojVarZ.d;
            if (ajppVar2 == null) {
                ajppVar2 = ajpp.a;
            }
            ajjeVar.d(ajppVar2.d);
            ajoo ajooVar2 = ajojVarZ.c;
            if (ajooVar2 == null) {
                ajooVar2 = ajoo.a;
            }
            ajop ajopVar = ajooVar2.c;
            if (ajopVar == null) {
                ajopVar = ajop.a;
            }
            ajjeVar.e(ajopVar.b);
            ajpp ajppVar3 = ajojVarZ.d;
            if (ajppVar3 == null) {
                ajppVar3 = ajpp.a;
            }
            ajpq ajpqVar = ajppVar3.c;
            if (ajpqVar == null) {
                ajpqVar = ajpq.a;
            }
            ajjeVar.f(ajpqVar.c);
            ajpp ajppVar4 = ajojVarZ.d;
            if (ajppVar4 == null) {
                ajppVar4 = ajpp.a;
            }
            ajpq ajpqVar2 = ajppVar4.c;
            if (ajpqVar2 == null) {
                ajpqVar2 = ajpq.a;
            }
            defpackage.ajpn ajpnVarB = defpackage.ajpn.b(ajpqVar2.b);
            if (ajpnVarB == null) {
                ajpnVarB = defpackage.ajpn.UNRECOGNIZED;
            }
            ajjeVar.d = f(ajpnVarB);
            ajjeVar.a = g((defpackage.ajfe) aogcVar.a);
            return ajjeVar.b();
        } catch (defpackage.alaz e) {
            throw new java.security.GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
        }
    }

    private static defpackage.ajfe e(defpackage.ajgb ajgbVar) throws java.security.GeneralSecurityException {
        if (ajgbVar.equals(defpackage.ajgb.a)) {
            return defpackage.ajfe.b;
        }
        if (ajgbVar.equals(defpackage.ajgb.b)) {
            return defpackage.ajfe.e;
        }
        if (ajgbVar.equals(defpackage.ajgb.c)) {
            return defpackage.ajfe.d;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajgbVar))));
    }

    private static defpackage.ajga f(defpackage.ajpn ajpnVar) throws java.security.GeneralSecurityException {
        int iOrdinal = ajpnVar.ordinal();
        if (iOrdinal == 1) {
            return defpackage.ajga.a;
        }
        if (iOrdinal == 2) {
            return defpackage.ajga.d;
        }
        if (iOrdinal == 3) {
            return defpackage.ajga.c;
        }
        if (iOrdinal == 4) {
            return defpackage.ajga.e;
        }
        if (iOrdinal == 5) {
            return defpackage.ajga.b;
        }
        throw new java.security.GeneralSecurityException("Unable to parse HashType: " + ajpnVar.a());
    }

    private static defpackage.ajgb g(defpackage.ajfe ajfeVar) throws java.security.GeneralSecurityException {
        if (ajfeVar == defpackage.ajfe.b) {
            return defpackage.ajgb.a;
        }
        if (ajfeVar == defpackage.ajfe.e || ajfeVar == defpackage.ajfe.c) {
            return defpackage.ajgb.b;
        }
        if (ajfeVar == defpackage.ajfe.d) {
            return defpackage.ajgb.c;
        }
        throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajfeVar))));
    }

    private static ajpq h(defpackage.ajgc ajgcVar) throws java.security.GeneralSecurityException {
        defpackage.ajpn ajpnVar;
        defpackage.akzx akzxVarM = ajpq.a.m();
        akzxVarM.u();
        akzxVarM.b.c = ajgcVar.d;
        defpackage.ajga ajgaVar = ajgcVar.f;
        if (ajgaVar.equals(defpackage.ajga.a)) {
            ajpnVar = defpackage.ajpn.SHA1;
        } else if (ajgaVar.equals(defpackage.ajga.b)) {
            ajpnVar = defpackage.ajpn.SHA224;
        } else if (ajgaVar.equals(defpackage.ajga.c)) {
            ajpnVar = defpackage.ajpn.SHA256;
        } else if (ajgaVar.equals(defpackage.ajga.d)) {
            ajpnVar = defpackage.ajpn.SHA384;
        } else {
            if (!ajgaVar.equals(defpackage.ajga.e)) {
                throw new java.security.GeneralSecurityException("Unable to serialize HashType ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajgaVar))));
            }
            ajpnVar = defpackage.ajpn.SHA512;
        }
        akzxVarM.u();
        akzxVarM.b.b = ajpnVar.a();
        return akzxVarM.r();
    }
}
