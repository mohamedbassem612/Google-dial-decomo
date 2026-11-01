package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajhc extends defpackage.ajfv {
    public final defpackage.ajhf a;
    public final ajst b;
    public final java.lang.Integer c;

    private ajhc(defpackage.ajhf ajhfVar, ajst ajstVar, java.lang.Integer num) {
        this.a = ajhfVar;
        this.b = ajstVar;
        this.c = num;
    }

    public static defpackage.ajhc aq(defpackage.ajhf ajhfVar, java.lang.Integer num) throws java.security.GeneralSecurityException {
        ajst ajstVarB;
        ajhe ajheVar = ajhfVar.a;
        if (ajheVar == ajhe.b) {
            if (num != null) {
                throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            ajstVarB = ajmh.a;
        } else {
            if (ajheVar != ajhe.a) {
                throw new java.security.GeneralSecurityException("Unknown Variant: ".concat(ajheVar.c));
            }
            if (num == null) {
                throw new java.security.GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            ajstVarB = ajmh.b(num.intValue());
        }
        return new defpackage.ajhc(ajhfVar, ajstVarB, num);
    }

    @Override // defpackage.aiql
    public final /* synthetic */ defpackage.ajsz ac() {
        return this.a;
    }

    @Override // defpackage.ajfv
    public final ajst ap() {
        return this.b;
    }

    @Override // defpackage.aiql
    public final java.lang.Integer m() {
        return this.c;
    }
}
