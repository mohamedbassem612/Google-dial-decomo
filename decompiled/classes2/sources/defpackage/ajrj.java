package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajrj {
    public static final ajmk a = new ajmk(defpackage.ajqy.class, new defpackage.ajrf(0));
    public static final ajmk b = new ajmk("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey", new defpackage.ajrg(0));
    public static final ajmk c = new ajmk(defpackage.ajqt.class, new defpackage.ajrh(0));
    public static final ajmk d = new ajmk("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey", new defpackage.ajri(0));

    public static defpackage.ajqt a(akxm akxmVar) throws java.security.GeneralSecurityException {
        if (!((java.lang.String) akxmVar.b).equals("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesGcmHkdfStreamingParameters.parseParameters");
        }
        try {
            java.lang.Object obj = akxmVar.d;
            defpackage.ajot ajotVar = (defpackage.ajot) alad.z(defpackage.ajot.a, (akzc) obj, akzq.a);
            if (ajotVar.c != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            defpackage.ajov ajovVar = ajotVar.d;
            if (ajovVar == null) {
                ajovVar = defpackage.ajov.a;
            }
            return defpackage.ajqt.ap(f(ajovVar, ajotVar.e.c()), ajyi.B(ajotVar.e.D()));
        } catch (alaz unused) {
            throw new java.security.GeneralSecurityException("Parsing AesGcmHkdfStreamingKey failed");
        }
    }

    public static akxm b(defpackage.ajqt ajqtVar) throws java.security.GeneralSecurityException {
        akzx akzxVarM = defpackage.ajot.a.m();
        akzc akzcVarU = akzc.u(ajqtVar.b.k());
        akzxVarM.u();
        defpackage.ajot ajotVar = (defpackage.ajot) akzxVarM.b;
        j$.util.Objects.requireNonNull(akzcVarU);
        ajotVar.e = akzcVarU;
        defpackage.ajov ajovVarE = e(ajqtVar.a);
        akzxVarM.u();
        defpackage.ajot ajotVar2 = (defpackage.ajot) akzxVarM.b;
        j$.util.Objects.requireNonNull(ajovVarE);
        ajotVar2.d = ajovVarE;
        ajotVar2.b |= 1;
        return akxm.d("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey", ((defpackage.ajot) akzxVarM.p()).f(), defpackage.ajfd.b, ajfe.d, (java.lang.Integer) null);
    }

    public static aogc c(defpackage.ajqy ajqyVar) throws java.security.GeneralSecurityException {
        ajfe ajfeVar = ajfe.d;
        akzx akzxVarM = defpackage.ajou.a.m();
        int iE = ajqyVar.e();
        akzxVarM.u();
        ((defpackage.ajou) akzxVarM.b).e = iE;
        defpackage.ajov ajovVarE = e(ajqyVar);
        akzxVarM.u();
        defpackage.ajou ajouVar = (defpackage.ajou) akzxVarM.b;
        j$.util.Objects.requireNonNull(ajovVarE);
        ajouVar.d = ajovVarE;
        ajouVar.b |= 1;
        return aogc.C("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey", ajfeVar, ((defpackage.ajou) akzxVarM.p()).f());
    }

    public static defpackage.ajqy d(aogc aogcVar) throws java.security.GeneralSecurityException {
        if (!((java.lang.String) aogcVar.b).equals("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesGcmHkdfStreamingParameters.parseParameters: ".concat(java.lang.String.valueOf(aogcVar.b)));
        }
        try {
            java.lang.Object obj = aogcVar.c;
            defpackage.ajou ajouVar = (defpackage.ajou) alad.z(defpackage.ajou.a, (akzc) obj, akzq.a);
            if (ajouVar.c != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 parameters are accepted");
            }
            defpackage.ajov ajovVar = ajouVar.d;
            if (ajovVar == null) {
                ajovVar = defpackage.ajov.a;
            }
            return f(ajovVar, ajouVar.e);
        } catch (alaz e) {
            throw new java.security.GeneralSecurityException("Parsing AesGcmHkdfStreamingParameters failed: ", e);
        }
    }

    private static defpackage.ajov e(defpackage.ajqy ajqyVar) throws java.security.GeneralSecurityException {
        ajpn ajpnVar;
        akzx akzxVarM = defpackage.ajov.a.m();
        int iC = ajqyVar.c();
        akzxVarM.u();
        ((defpackage.ajov) akzxVarM.b).b = iC;
        int iD = ajqyVar.d();
        akzxVarM.u();
        ((defpackage.ajov) akzxVarM.b).c = iD;
        defpackage.ajqx ajqxVar = defpackage.ajqx.a;
        defpackage.ajqx ajqxVar2 = ajqyVar.a;
        if (ajqxVar.equals(ajqxVar2)) {
            ajpnVar = ajpn.b;
        } else if (defpackage.ajqx.b.equals(ajqxVar2)) {
            ajpnVar = ajpn.d;
        } else {
            if (!defpackage.ajqx.c.equals(ajqxVar2)) {
                throw new java.security.GeneralSecurityException("Unable to serialize HashType ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajqxVar2))));
            }
            ajpnVar = ajpn.e;
        }
        akzxVarM.u();
        ((defpackage.ajov) akzxVarM.b).d = ajpnVar.a();
        return (defpackage.ajov) akzxVarM.p();
    }

    private static defpackage.ajqy f(defpackage.ajov ajovVar, int i) throws java.security.GeneralSecurityException {
        defpackage.ajqx ajqxVar;
        defpackage.ajqw ajqwVar = new defpackage.ajqw();
        ajqwVar.d(i);
        ajqwVar.c(ajovVar.c);
        ajqwVar.b(ajovVar.b);
        ajpn ajpnVarB = ajpn.b(ajovVar.d);
        if (ajpnVarB == null) {
            ajpnVarB = ajpn.g;
        }
        int iOrdinal = ajpnVarB.ordinal();
        if (iOrdinal == 1) {
            ajqxVar = defpackage.ajqx.a;
        } else if (iOrdinal == 3) {
            ajqxVar = defpackage.ajqx.b;
        } else {
            if (iOrdinal != 4) {
                throw new java.security.GeneralSecurityException("Unable to parse HashType: " + ajpnVarB.a());
            }
            ajqxVar = defpackage.ajqx.c;
        }
        ajqwVar.c = ajqxVar;
        return ajqwVar.a();
    }
}
