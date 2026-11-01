package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajhn extends defpackage.ajfv {
    public final defpackage.ajhq a;
    public final ajst b;
    public final java.lang.Integer c;
    public final ajyi d;

    private ajhn(defpackage.ajhq ajhqVar, ajyi ajyiVar, ajst ajstVar, java.lang.Integer num) {
        this.a = ajhqVar;
        this.d = ajyiVar;
        this.b = ajstVar;
        this.c = num;
    }

    public static defpackage.ajhn aq(defpackage.ajhq ajhqVar, ajyi ajyiVar, java.lang.Integer num) throws java.security.GeneralSecurityException {
        ajst ajstVarB;
        defpackage.ajhp ajhpVar = ajhqVar.a;
        defpackage.ajhp ajhpVar2 = defpackage.ajhp.b;
        if (ajhpVar != ajhpVar2) {
            if (num == null) {
                throw new java.security.GeneralSecurityException("For given Variant " + ajhpVar.c + " the value of idRequirement must be non-null");
            }
        } else if (num != null) {
            throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (ajyiVar.j() != 32) {
            throw new java.security.GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + ajyiVar.j());
        }
        if (ajhpVar == ajhpVar2) {
            ajstVarB = ajmh.a;
        } else {
            if (ajhpVar != defpackage.ajhp.a) {
                throw new java.lang.IllegalStateException("Unknown Variant: ".concat(ajhpVar.c));
            }
            ajstVarB = ajmh.b(num.intValue());
        }
        return new defpackage.ajhn(ajhqVar, ajyiVar, ajstVarB, num);
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
