package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ajhh implements defpackage.ajmi {
    private final /* synthetic */ int $cid;

    @Override // defpackage.ajmi
    public final defpackage.ajsz a(defpackage.aogc aogcVar) throws java.security.GeneralSecurityException {
        switch (this.$cid) {
            case 0:
                if (!((java.lang.String) aogcVar.b).equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new java.lang.IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(aogcVar.b)));
                }
                try {
                    return defpackage.ajhk.b(defpackage.alad.z(ajqh.a, (defpackage.akzc) aogcVar.c, defpackage.akzq.a), (defpackage.ajfe) aogcVar.a);
                } catch (defpackage.alaz e) {
                    throw new java.security.GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
                }
            case 1:
                if (!((java.lang.String) aogcVar.b).equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new java.lang.IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(aogcVar.b)));
                }
                try {
                    return new defpackage.ajha(defpackage.alad.z(ajqf.a, (defpackage.akzc) aogcVar.c, defpackage.akzq.a).b, defpackage.ajhb.b((defpackage.ajfe) aogcVar.a));
                } catch (defpackage.alaz e2) {
                    throw new java.security.GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e2);
                }
            case 2:
                return defpackage.ajhv.d(aogcVar);
            case 3:
                return defpackage.ajhw.d(aogcVar);
            case 4:
                return defpackage.ajhz.d(aogcVar);
            case 5:
                return defpackage.ajib.d(aogcVar);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.ajid.d(aogcVar);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.ajim.d(aogcVar);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.ajin.d(aogcVar);
            case 9:
                return defpackage.ajja.d(aogcVar);
            case 10:
                return ajle.f(aogcVar);
            case 11:
                return defpackage.ajkl.f(aogcVar);
            case 12:
                if (!((java.lang.String) aogcVar.b).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(aogcVar.b)));
                }
                try {
                    ajog ajogVarZ = defpackage.alad.z(ajog.a, (defpackage.akzc) aogcVar.c, defpackage.akzq.a);
                    defpackage.ajni ajniVar = new defpackage.ajni();
                    ajniVar.b(ajogVarZ.c);
                    ajoh ajohVar = ajogVarZ.d;
                    if (ajohVar == null) {
                        ajohVar = ajoh.a;
                    }
                    ajniVar.c(ajohVar.b);
                    ajniVar.c = defpackage.ajnw.b((defpackage.ajfe) aogcVar.a);
                    return ajniVar.a();
                } catch (defpackage.alaz e3) {
                    throw new java.security.GeneralSecurityException("Parsing AesCmacParameters failed: ", e3);
                }
            default:
                defpackage.ajmk ajmkVar = defpackage.ajny.a;
                if (!((java.lang.String) aogcVar.b).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new java.lang.IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(aogcVar.b)));
                }
                try {
                    ajpp ajppVarZ = defpackage.alad.z(ajpp.a, (defpackage.akzc) aogcVar.c, defpackage.akzq.a);
                    if (ajppVarZ.e != 0) {
                        throw new java.security.GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + ajppVarZ.e);
                    }
                    defpackage.annk annkVar = new defpackage.annk((byte[]) null);
                    annkVar.d(ajppVarZ.d);
                    ajpq ajpqVar = ajppVarZ.c;
                    if (ajpqVar == null) {
                        ajpqVar = ajpq.a;
                    }
                    annkVar.e(ajpqVar.c);
                    defpackage.apni apniVar = defpackage.ajny.e;
                    ajpq ajpqVar2 = ajppVarZ.c;
                    if (ajpqVar2 == null) {
                        ajpqVar2 = ajpq.a;
                    }
                    defpackage.ajpn ajpnVarB = defpackage.ajpn.b(ajpqVar2.b);
                    if (ajpnVarB == null) {
                        ajpnVarB = defpackage.ajpn.UNRECOGNIZED;
                    }
                    annkVar.c = (defpackage.ajnp) apniVar.g(ajpnVarB);
                    annkVar.a = defpackage.ajny.b((defpackage.ajfe) aogcVar.a);
                    return annkVar.c();
                } catch (defpackage.alaz e4) {
                    throw new java.security.GeneralSecurityException("Parsing HmacParameters failed: ", e4);
                }
        }
    }
}
