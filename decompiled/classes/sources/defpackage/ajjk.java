package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajjk extends defpackage.ajkb {
    public final defpackage.ajjl a;
    public final ajyi b;
    public final ajyi c;

    public ajjk(defpackage.ajjl ajjlVar, ajyi ajyiVar, ajyi ajyiVar2) {
        this.a = ajjlVar;
        this.c = ajyiVar;
        this.b = ajyiVar2;
    }

    public static defpackage.ajjk ar(defpackage.ajjl ajjlVar, ajyi ajyiVar) throws java.security.GeneralSecurityException {
        java.security.spec.ECPoint eCPoint = ajjlVar.b;
        if (eCPoint == null) {
            throw new java.security.GeneralSecurityException("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
        }
        java.lang.Object obj = ajyiVar.a;
        defpackage.ajjf ajjfVar = ajjlVar.a.b;
        java.math.BigInteger order = at(ajjfVar).getOrder();
        java.math.BigInteger bigInteger = (java.math.BigInteger) obj;
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            throw new java.security.GeneralSecurityException("Invalid private value");
        }
        if (ajlo.e(bigInteger, at(ajjfVar)).equals(eCPoint)) {
            return new defpackage.ajjk(ajjlVar, ajyiVar, null);
        }
        throw new java.security.GeneralSecurityException("Invalid private value");
    }

    private static java.security.spec.ECParameterSpec at(defpackage.ajjf ajjfVar) {
        if (ajjfVar == defpackage.ajjf.a) {
            return ajlo.a;
        }
        if (ajjfVar == defpackage.ajjf.b) {
            return ajlo.b;
        }
        if (ajjfVar == defpackage.ajjf.c) {
            return ajlo.c;
        }
        throw new java.lang.IllegalArgumentException("Unable to determine NIST curve type for ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajjfVar))));
    }

    @Override // defpackage.ajkb, defpackage.ajfc
    public final /* synthetic */ defpackage.aiql a() {
        return this.a;
    }

    @Override // defpackage.aiql
    /* JADX INFO: renamed from: ap, reason: merged with bridge method [inline-methods] */
    public final defpackage.ajjj ac() {
        return this.a.a;
    }

    @Override // defpackage.ajkb
    public final /* synthetic */ defpackage.ajkc aq() {
        return this.a;
    }
}
