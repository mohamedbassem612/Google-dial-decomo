package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajre {
    public static final ajmk a = new ajmk(defpackage.ajqs.class, new defpackage.ajrf(1));
    public static final ajmk b = new ajmk("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey", new defpackage.ajrg(1));
    public static final ajmk c = new ajmk(defpackage.ajqo.class, new defpackage.ajrh(1));
    public static final ajmk d = new ajmk("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey", new defpackage.ajri(1));

    public static defpackage.ajqo a(akxm akxmVar) throws java.security.GeneralSecurityException {
        if (!((java.lang.String) akxmVar.b).equals("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesCtrHmacStreamingParameters.parseParameters");
        }
        try {
            java.lang.Object obj = akxmVar.d;
            defpackage.ajok ajokVar = (defpackage.ajok) alad.z(defpackage.ajok.a, (akzc) obj, akzq.a);
            if (ajokVar.c != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            defpackage.ajom ajomVar = ajokVar.d;
            if (ajomVar == null) {
                ajomVar = defpackage.ajom.a;
            }
            return defpackage.ajqo.ap(h(ajomVar, ajokVar.e.c()), ajyi.B(ajokVar.e.D()));
        } catch (alaz unused) {
            throw new java.security.GeneralSecurityException("Parsing AesCtrHmacStreamingKey failed");
        }
    }

    public static akxm b(defpackage.ajqo ajqoVar) throws java.security.GeneralSecurityException {
        akzx akzxVarM = defpackage.ajok.a.m();
        akzc akzcVarU = akzc.u(ajqoVar.b.k());
        akzxVarM.u();
        defpackage.ajok ajokVar = (defpackage.ajok) akzxVarM.b;
        j$.util.Objects.requireNonNull(akzcVarU);
        ajokVar.e = akzcVarU;
        defpackage.ajom ajomVarE = e(ajqoVar.a);
        akzxVarM.u();
        defpackage.ajok ajokVar2 = (defpackage.ajok) akzxVarM.b;
        j$.util.Objects.requireNonNull(ajomVarE);
        ajokVar2.d = ajomVarE;
        ajokVar2.b |= 1;
        return akxm.d("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey", ((defpackage.ajok) akzxVarM.p()).f(), defpackage.ajfd.b, ajfe.d, (java.lang.Integer) null);
    }

    public static aogc c(defpackage.ajqs ajqsVar) throws java.security.GeneralSecurityException {
        ajfe ajfeVar = ajfe.d;
        akzx akzxVarM = defpackage.ajol.a.m();
        int iF = ajqsVar.f();
        akzxVarM.u();
        ((defpackage.ajol) akzxVarM.b).d = iF;
        defpackage.ajom ajomVarE = e(ajqsVar);
        akzxVarM.u();
        defpackage.ajol ajolVar = (defpackage.ajol) akzxVarM.b;
        j$.util.Objects.requireNonNull(ajomVarE);
        ajolVar.c = ajomVarE;
        ajolVar.b |= 1;
        return aogc.C("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey", ajfeVar, ((defpackage.ajol) akzxVarM.p()).f());
    }

    public static defpackage.ajqs d(aogc aogcVar) throws java.security.GeneralSecurityException {
        if (!((java.lang.String) aogcVar.b).equals("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesCtrHmacStreamingParameters.parseParameters: ".concat(java.lang.String.valueOf(aogcVar.b)));
        }
        try {
            java.lang.Object obj = aogcVar.c;
            defpackage.ajol ajolVar = (defpackage.ajol) alad.z(defpackage.ajol.a, (akzc) obj, akzq.a);
            defpackage.ajom ajomVar = ajolVar.c;
            if (ajomVar == null) {
                ajomVar = defpackage.ajom.a;
            }
            return h(ajomVar, ajolVar.d);
        } catch (alaz e) {
            throw new java.security.GeneralSecurityException("Parsing AesCtrHmacStreamingParameters failed: ", e);
        }
    }

    private static defpackage.ajom e(defpackage.ajqs ajqsVar) throws java.security.GeneralSecurityException {
        akzx akzxVarM = defpackage.ajom.a.m();
        int iC = ajqsVar.c();
        akzxVarM.u();
        ((defpackage.ajom) akzxVarM.b).c = iC;
        int iD = ajqsVar.d();
        akzxVarM.u();
        ((defpackage.ajom) akzxVarM.b).d = iD;
        ajpn ajpnVarF = f(ajqsVar.a);
        akzxVarM.u();
        ((defpackage.ajom) akzxVarM.b).e = ajpnVarF.a();
        akzx akzxVarM2 = defpackage.ajpq.a.m();
        ajpn ajpnVarF2 = f(ajqsVar.b);
        akzxVarM2.u();
        ((defpackage.ajpq) akzxVarM2.b).b = ajpnVarF2.a();
        int iE = ajqsVar.e();
        akzxVarM2.u();
        ((defpackage.ajpq) akzxVarM2.b).c = iE;
        akzxVarM.u();
        defpackage.ajom ajomVar = (defpackage.ajom) akzxVarM.b;
        defpackage.ajpq ajpqVar = (defpackage.ajpq) akzxVarM2.p();
        j$.util.Objects.requireNonNull(ajpqVar);
        ajomVar.f = ajpqVar;
        ajomVar.b |= 1;
        return (defpackage.ajom) akzxVarM.p();
    }

    private static ajpn f(defpackage.ajqr ajqrVar) throws java.security.GeneralSecurityException {
        if (defpackage.ajqr.a.equals(ajqrVar)) {
            return ajpn.b;
        }
        if (defpackage.ajqr.b.equals(ajqrVar)) {
            return ajpn.d;
        }
        if (defpackage.ajqr.c.equals(ajqrVar)) {
            return ajpn.e;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize HashType ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajqrVar))));
    }

    private static defpackage.ajqr g(ajpn ajpnVar) throws java.security.GeneralSecurityException {
        int iOrdinal = ajpnVar.ordinal();
        if (iOrdinal == 1) {
            return defpackage.ajqr.a;
        }
        if (iOrdinal == 3) {
            return defpackage.ajqr.b;
        }
        if (iOrdinal == 4) {
            return defpackage.ajqr.c;
        }
        throw new java.security.GeneralSecurityException("Unable to parse HashType: " + ajpnVar.a());
    }

    private static defpackage.ajqs h(defpackage.ajom ajomVar, int i) {
        defpackage.ajqq ajqqVar = new defpackage.ajqq();
        ajqqVar.d(i);
        ajqqVar.c(ajomVar.d);
        ajqqVar.b(ajomVar.c);
        ajpn ajpnVarB = ajpn.b(ajomVar.e);
        if (ajpnVarB == null) {
            ajpnVarB = ajpn.g;
        }
        ajqqVar.a = g(ajpnVarB);
        defpackage.ajpq ajpqVar = ajomVar.f;
        if (ajpqVar == null) {
            ajpqVar = defpackage.ajpq.a;
        }
        ajpn ajpnVarB2 = ajpn.b(ajpqVar.b);
        if (ajpnVarB2 == null) {
            ajpnVarB2 = ajpn.g;
        }
        ajqqVar.b = g(ajpnVarB2);
        defpackage.ajpq ajpqVar2 = ajomVar.f;
        if (ajpqVar2 == null) {
            ajpqVar2 = defpackage.ajpq.a;
        }
        ajqqVar.c = java.lang.Integer.valueOf(ajpqVar2.c);
        return ajqqVar.a();
    }
}
