package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ajhj implements defpackage.ajls {
    private final /* synthetic */ int $cid;

    @Override // defpackage.ajls
    public final defpackage.aiql a(akxm akxmVar, ajfk ajfkVar) throws java.security.GeneralSecurityException {
        switch (this.$cid) {
            case 0:
                if (!((java.lang.String) akxmVar.b).equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new java.lang.IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                }
                try {
                    defpackage.ajqg ajqgVar = (defpackage.ajqg) defpackage.alad.z(defpackage.ajqg.a, (defpackage.akzc) akxmVar.d, defpackage.akzq.a);
                    if (ajqgVar.c != 0) {
                        throw new java.security.GeneralSecurityException(defpackage.a.bH(ajqgVar, "KmsEnvelopeAeadKeys are only accepted with version 0, got "));
                    }
                    ajqh ajqhVar = ajqgVar.d;
                    if (ajqhVar == null) {
                        ajqhVar = ajqh.a;
                    }
                    java.lang.Object obj = akxmVar.c;
                    defpackage.ajfe ajfeVar = defpackage.ajfe.b;
                    if (obj == ajfeVar || obj == (ajfeVar = defpackage.ajfe.d)) {
                        return defpackage.ajhc.aq(defpackage.ajhk.b(ajqhVar, ajfeVar), (java.lang.Integer) akxmVar.a);
                    }
                    throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj))));
                } catch (defpackage.alaz e) {
                    throw new java.security.GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
                }
            case 1:
                if (!((java.lang.String) akxmVar.b).equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new java.lang.IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                }
                try {
                    defpackage.ajqe ajqeVar = (defpackage.ajqe) defpackage.alad.z(defpackage.ajqe.a, (defpackage.akzc) akxmVar.d, defpackage.akzq.a);
                    if (ajqeVar.c != 0) {
                        throw new java.security.GeneralSecurityException(defpackage.a.bH(ajqeVar, "KmsAeadKey are only accepted with version 0, got "));
                    }
                    ajqf ajqfVar = ajqeVar.d;
                    if (ajqfVar == null) {
                        ajqfVar = ajqf.a;
                    }
                    return defpackage.ajgy.aq(new defpackage.ajha(ajqfVar.b, defpackage.ajhb.b((defpackage.ajfe) akxmVar.c)), (java.lang.Integer) akxmVar.a);
                } catch (defpackage.alaz e2) {
                    throw new java.security.GeneralSecurityException("Parsing KmsAeadKey failed: ", e2);
                }
            case 2:
                return defpackage.ajhv.a(akxmVar);
            case 3:
                return defpackage.ajhw.a(akxmVar);
            case 4:
                return defpackage.ajhz.a(akxmVar);
            case 5:
                return defpackage.ajib.a(akxmVar);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.ajid.a(akxmVar);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.ajim.a(akxmVar);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.ajin.a(akxmVar);
            case 9:
                java.lang.Object obj2 = akxmVar.b;
                defpackage.ajmk ajmkVar = defpackage.ajja.a;
                if (!((java.lang.String) obj2).equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
                }
                try {
                    defpackage.ajpa ajpaVar = (defpackage.ajpa) defpackage.alad.z(defpackage.ajpa.a, (defpackage.akzc) akxmVar.d, defpackage.akzq.a);
                    if (ajpaVar.b != 0) {
                        throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    defpackage.ajiu ajiuVar = new defpackage.ajiu();
                    ajiuVar.b(ajpaVar.c.c());
                    ajiuVar.a = defpackage.ajja.b((defpackage.ajfe) akxmVar.c);
                    return aftt.S(ajiuVar.a(), ajyi.B(ajpaVar.c.D()), (java.lang.Integer) akxmVar.a);
                } catch (defpackage.alaz unused) {
                    throw new java.security.GeneralSecurityException("Parsing AesSivKey failed");
                }
            case 10:
                return ajle.a(akxmVar);
            case 11:
                return ajle.c(akxmVar);
            case 12:
                return defpackage.ajkl.a(akxmVar);
            case 13:
                return defpackage.ajkl.c(akxmVar);
            case 14:
                if (!((java.lang.String) akxmVar.b).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                }
                try {
                    defpackage.ajof ajofVar = (defpackage.ajof) defpackage.alad.z(defpackage.ajof.a, (defpackage.akzc) akxmVar.d, defpackage.akzq.a);
                    if (ajofVar.c != 0) {
                        throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    defpackage.ajni ajniVar = new defpackage.ajni();
                    ajniVar.b(ajofVar.d.c());
                    ajoh ajohVar = ajofVar.e;
                    if (ajohVar == null) {
                        ajohVar = ajoh.a;
                    }
                    ajniVar.c(ajohVar.b);
                    ajniVar.c = defpackage.ajnw.b((defpackage.ajfe) akxmVar.c);
                    return aftt.Q(ajniVar.a(), ajyi.B(ajofVar.d.D()), (java.lang.Integer) akxmVar.a);
                } catch (defpackage.alaz | java.lang.IllegalArgumentException unused2) {
                    throw new java.security.GeneralSecurityException("Parsing AesCmacKey failed");
                }
            default:
                java.lang.Object obj3 = akxmVar.b;
                defpackage.ajmk ajmkVar2 = defpackage.ajny.a;
                if (!((java.lang.String) obj3).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new java.lang.IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    defpackage.ajpo ajpoVar = (defpackage.ajpo) defpackage.alad.z(defpackage.ajpo.a, (defpackage.akzc) akxmVar.d, defpackage.akzq.a);
                    if (ajpoVar.c != 0) {
                        throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    defpackage.annk annkVar = new defpackage.annk((byte[]) null);
                    annkVar.d(ajpoVar.e.c());
                    ajpq ajpqVar = ajpoVar.d;
                    if (ajpqVar == null) {
                        ajpqVar = ajpq.a;
                    }
                    annkVar.e(ajpqVar.c);
                    defpackage.apni apniVar = defpackage.ajny.e;
                    ajpq ajpqVar2 = ajpoVar.d;
                    if (ajpqVar2 == null) {
                        ajpqVar2 = ajpq.a;
                    }
                    defpackage.ajpn ajpnVarB = defpackage.ajpn.b(ajpqVar2.b);
                    if (ajpnVarB == null) {
                        ajpnVarB = defpackage.ajpn.UNRECOGNIZED;
                    }
                    annkVar.c = (defpackage.ajnp) apniVar.g(ajpnVarB);
                    annkVar.a = defpackage.ajny.b((defpackage.ajfe) akxmVar.c);
                    return agmc.aB(annkVar.c(), ajyi.B(ajpoVar.e.D()), (java.lang.Integer) akxmVar.a);
                } catch (defpackage.alaz | java.lang.IllegalArgumentException unused3) {
                    throw new java.security.GeneralSecurityException("Parsing HmacKey failed");
                }
        }
    }
}
