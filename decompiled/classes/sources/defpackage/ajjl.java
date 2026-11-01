package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajjl extends defpackage.ajkc {
    public final defpackage.ajjj a;
    public final java.security.spec.ECPoint b;
    public final ajst c;
    public final ajst d;
    public final java.lang.Integer e;

    private ajjl(defpackage.ajjj ajjjVar, java.security.spec.ECPoint eCPoint, ajst ajstVar, ajst ajstVar2, java.lang.Integer num) {
        this.a = ajjjVar;
        this.b = eCPoint;
        this.c = ajstVar;
        this.d = ajstVar2;
        this.e = num;
    }

    public static defpackage.ajjl ap(defpackage.ajjj ajjjVar, ajst ajstVar, java.lang.Integer num) throws java.security.GeneralSecurityException {
        if (!ajjjVar.b.equals(defpackage.ajjf.d)) {
            throw new java.security.GeneralSecurityException("createForCurveX25519 may only be called with parameters for curve X25519");
        }
        defpackage.ajji ajjiVar = ajjjVar.e;
        at(ajjiVar, num);
        if (ajstVar.a() == 32) {
            return new defpackage.ajjl(ajjjVar, null, ajstVar, as(ajjiVar, num), num);
        }
        throw new java.security.GeneralSecurityException("Encoded public point byte length for X25519 curve must be 32");
    }

    public static defpackage.ajjl aq(defpackage.ajjj ajjjVar, java.security.spec.ECPoint eCPoint, java.lang.Integer num) throws java.security.GeneralSecurityException {
        java.security.spec.EllipticCurve curve;
        defpackage.ajjf ajjfVar = ajjjVar.b;
        if (ajjfVar.equals(defpackage.ajjf.d)) {
            throw new java.security.GeneralSecurityException("createForNistCurve may only be called with parameters for NIST curve");
        }
        defpackage.ajji ajjiVar = ajjjVar.e;
        at(ajjiVar, num);
        if (ajjfVar == defpackage.ajjf.a) {
            curve = ajlo.a.getCurve();
        } else if (ajjfVar == defpackage.ajjf.b) {
            curve = ajlo.b.getCurve();
        } else {
            if (ajjfVar != defpackage.ajjf.c) {
                throw new java.lang.IllegalArgumentException("Unable to determine NIST curve type for ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajjfVar))));
            }
            curve = ajlo.c.getCurve();
        }
        ajlo.f(eCPoint, curve);
        return new defpackage.ajjl(ajjjVar, eCPoint, null, as(ajjiVar, num), num);
    }

    private static ajst as(defpackage.ajji ajjiVar, java.lang.Integer num) {
        if (ajjiVar == defpackage.ajji.c) {
            return ajmh.a;
        }
        if (num == null) {
            throw new java.lang.IllegalStateException("idRequirement must be non-null for EciesParameters.Variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajjiVar))));
        }
        if (ajjiVar == defpackage.ajji.b) {
            return ajmh.a(num.intValue());
        }
        if (ajjiVar == defpackage.ajji.a) {
            return ajmh.b(num.intValue());
        }
        throw new java.lang.IllegalStateException("Unknown EciesParameters.Variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajjiVar))));
    }

    private static void at(defpackage.ajji ajjiVar, java.lang.Integer num) throws java.security.GeneralSecurityException {
        defpackage.ajji ajjiVar2 = defpackage.ajji.c;
        if (!ajjiVar.equals(ajjiVar2) && num == null) {
            throw new java.security.GeneralSecurityException(defpackage.hgb.i(ajjiVar, "'idRequirement' must be non-null for ", " variant."));
        }
        if (ajjiVar.equals(ajjiVar2) && num != null) {
            throw new java.security.GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
    }

    @Override // defpackage.aiql
    public final /* synthetic */ defpackage.ajsz ac() {
        return this.a;
    }

    @Override // defpackage.ajkc
    public final ajst ar() {
        return this.d;
    }

    @Override // defpackage.aiql
    public final java.lang.Integer m() {
        return this.e;
    }
}
