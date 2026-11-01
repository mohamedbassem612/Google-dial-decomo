package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajjs extends defpackage.ajkb {
    public final defpackage.ajju a;
    public final ajyi b;

    private ajjs(defpackage.ajju ajjuVar, ajyi ajyiVar) {
        this.a = ajjuVar;
        this.b = ajyiVar;
    }

    public static defpackage.ajjs ar(defpackage.ajju ajjuVar, ajyi ajyiVar) throws java.security.GeneralSecurityException {
        java.security.spec.ECParameterSpec eCParameterSpec;
        int iJ = ajyiVar.j();
        defpackage.ajjp ajjpVar = ajjuVar.a.a;
        java.lang.String str = "Encoded private key byte length for " + ajjpVar.toString() + " must be %d, not " + iJ;
        defpackage.ajjp ajjpVar2 = defpackage.ajjp.a;
        if (ajjpVar == ajjpVar2) {
            if (iJ != 32) {
                throw new java.security.GeneralSecurityException(java.lang.String.format(str, 32));
            }
        } else if (ajjpVar == defpackage.ajjp.b) {
            if (iJ != 48) {
                throw new java.security.GeneralSecurityException(java.lang.String.format(str, 48));
            }
        } else if (ajjpVar == defpackage.ajjp.c) {
            if (iJ != 66) {
                throw new java.security.GeneralSecurityException(java.lang.String.format(str, 66));
            }
        } else if (ajjpVar == defpackage.ajjp.f) {
            if (iJ != 32) {
                throw new java.security.GeneralSecurityException(java.lang.String.format(str, 32));
            }
        } else {
            if (ajjpVar != defpackage.ajjp.g) {
                throw new java.security.GeneralSecurityException("Unable to validate private key length for ".concat(ajjpVar.toString()));
            }
            if (iJ != 32) {
                throw new java.security.GeneralSecurityException(java.lang.String.format(str, 32));
            }
        }
        byte[] bArrC = ajjuVar.b.c();
        byte[] bArrK = ajyiVar.k();
        if (ajjpVar == ajjpVar2 || ajjpVar == defpackage.ajjp.b || ajjpVar == defpackage.ajjp.c) {
            if (ajjpVar == ajjpVar2) {
                eCParameterSpec = ajlo.a;
            } else if (ajjpVar == defpackage.ajjp.b) {
                eCParameterSpec = ajlo.b;
            } else {
                if (ajjpVar != defpackage.ajjp.c) {
                    throw new java.lang.IllegalArgumentException("Unable to determine NIST curve params for ".concat(ajjpVar.toString()));
                }
                eCParameterSpec = ajlo.c;
            }
            java.math.BigInteger order = eCParameterSpec.getOrder();
            java.math.BigInteger bigInteger = new java.math.BigInteger(1, bArrK);
            if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
                throw new java.security.GeneralSecurityException("Invalid private key.");
            }
            if (!ajlo.e(bigInteger, eCParameterSpec).equals(agmc.at(eCParameterSpec.getCurve(), ajsc.a, bArrC))) {
                throw new java.security.GeneralSecurityException("Invalid private key for public key.");
            }
        } else if (ajjpVar == defpackage.ajjp.f) {
            if (!java.util.Arrays.equals(agmc.ai(bArrK), bArrC)) {
                throw new java.security.GeneralSecurityException("Invalid private key for public key.");
            }
        } else if (ajjpVar != defpackage.ajjp.g) {
            throw new java.lang.IllegalArgumentException("Unable to validate key pair for ".concat(ajjpVar.toString()));
        }
        return new defpackage.ajjs(ajjuVar, ajyiVar);
    }

    @Override // defpackage.ajkb, defpackage.ajfc
    public final /* synthetic */ defpackage.aiql a() {
        return this.a;
    }

    @Override // defpackage.aiql
    /* JADX INFO: renamed from: ap, reason: merged with bridge method [inline-methods] */
    public final defpackage.ajjr ac() {
        return this.a.a;
    }

    @Override // defpackage.ajkb
    public final /* synthetic */ defpackage.ajkc aq() {
        return this.a;
    }
}
