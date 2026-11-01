package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajju extends defpackage.ajkc {
    public final defpackage.ajjr a;
    public final ajst b;
    public final ajst c;
    public final java.lang.Integer d;

    private ajju(defpackage.ajjr ajjrVar, ajst ajstVar, ajst ajstVar2, java.lang.Integer num) {
        this.a = ajjrVar;
        this.b = ajstVar;
        this.c = ajstVar2;
        this.d = num;
    }

    public static defpackage.ajju ap(defpackage.ajjr ajjrVar, ajst ajstVar, java.lang.Integer num) throws java.security.GeneralSecurityException {
        java.security.spec.EllipticCurve curve;
        ajst ajstVarB;
        defpackage.ajjq ajjqVar = ajjrVar.d;
        defpackage.ajjq ajjqVar2 = defpackage.ajjq.c;
        if (!ajjqVar.equals(ajjqVar2) && num == null) {
            throw new java.security.GeneralSecurityException("'idRequirement' must be non-null for " + ajjqVar.d + " variant.");
        }
        if (ajjqVar.equals(ajjqVar2) && num != null) {
            throw new java.security.GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
        defpackage.ajjp ajjpVar = ajjrVar.a;
        int iA = ajstVar.a();
        java.lang.String str = "Encoded public key byte length for " + ajjpVar.toString() + " must be %d, not " + iA;
        defpackage.ajjp ajjpVar2 = defpackage.ajjp.a;
        if (ajjpVar == ajjpVar2) {
            if (iA != 65) {
                throw new java.security.GeneralSecurityException(java.lang.String.format(str, 65));
            }
        } else if (ajjpVar == defpackage.ajjp.b) {
            if (iA != 97) {
                throw new java.security.GeneralSecurityException(java.lang.String.format(str, 97));
            }
        } else if (ajjpVar == defpackage.ajjp.c) {
            if (iA != 133) {
                throw new java.security.GeneralSecurityException(java.lang.String.format(str, 133));
            }
        } else if (ajjpVar == defpackage.ajjp.f) {
            if (iA != 32) {
                throw new java.security.GeneralSecurityException(java.lang.String.format(str, 32));
            }
        } else {
            if (ajjpVar != defpackage.ajjp.g) {
                throw new java.security.GeneralSecurityException("Unable to validate public key length for ".concat(ajjpVar.toString()));
            }
            if (iA != 1216) {
                throw new java.security.GeneralSecurityException(java.lang.String.format(str, 1216));
            }
        }
        if (ajjpVar == ajjpVar2 || ajjpVar == defpackage.ajjp.b || ajjpVar == defpackage.ajjp.c) {
            if (ajjpVar == ajjpVar2) {
                curve = ajlo.a.getCurve();
            } else if (ajjpVar == defpackage.ajjp.b) {
                curve = ajlo.b.getCurve();
            } else {
                if (ajjpVar != defpackage.ajjp.c) {
                    throw new java.lang.IllegalArgumentException("Unable to determine NIST curve type for ".concat(ajjpVar.toString()));
                }
                curve = ajlo.c.getCurve();
            }
            ajlo.f(agmc.at(curve, ajsc.a, ajstVar.c()), curve);
        }
        if (ajjqVar == ajjqVar2) {
            ajstVarB = ajmh.a;
        } else {
            if (num == null) {
                throw new java.lang.IllegalStateException("idRequirement must be non-null for HpkeParameters.Variant ".concat(ajjqVar.d));
            }
            if (ajjqVar == defpackage.ajjq.b) {
                ajstVarB = ajmh.a(num.intValue());
            } else {
                if (ajjqVar != defpackage.ajjq.a) {
                    throw new java.lang.IllegalStateException("Unknown HpkeParameters.Variant: ".concat(ajjqVar.d));
                }
                ajstVarB = ajmh.b(num.intValue());
            }
        }
        return new defpackage.ajju(ajjrVar, ajstVar, ajstVarB, num);
    }

    @Override // defpackage.aiql
    public final /* synthetic */ defpackage.ajsz ac() {
        return this.a;
    }

    @Override // defpackage.ajkc
    public final ajst ar() {
        return this.c;
    }

    @Override // defpackage.aiql
    public final java.lang.Integer m() {
        return this.d;
    }
}
