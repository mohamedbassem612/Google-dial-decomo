package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajhr extends defpackage.ajfv {
    public final defpackage.ajhu a;
    public final ajst b;
    public final java.lang.Integer c;
    public final ajyi d;

    private ajhr(defpackage.ajhu ajhuVar, ajyi ajyiVar, ajst ajstVar, java.lang.Integer num) {
        this.a = ajhuVar;
        this.d = ajyiVar;
        this.b = ajstVar;
        this.c = num;
    }

    public static defpackage.ajhr aq(defpackage.ajht ajhtVar, ajyi ajyiVar, java.lang.Integer num) throws java.security.GeneralSecurityException {
        ajst ajstVarB;
        defpackage.ajht ajhtVar2 = defpackage.ajht.c;
        if (ajhtVar != ajhtVar2) {
            if (num == null) {
                throw new java.security.GeneralSecurityException("For given Variant " + ajhtVar.d + " the value of idRequirement must be non-null");
            }
        } else if (num != null) {
            throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (ajyiVar.j() != 32) {
            throw new java.security.GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + ajyiVar.j());
        }
        defpackage.ajhu ajhuVar = new defpackage.ajhu(ajhtVar);
        defpackage.ajht ajhtVar3 = ajhuVar.a;
        if (ajhtVar3 == ajhtVar2) {
            ajstVarB = ajmh.a;
        } else if (ajhtVar3 == defpackage.ajht.b) {
            ajstVarB = ajmh.a(num.intValue());
        } else {
            if (ajhtVar3 != defpackage.ajht.a) {
                throw new java.lang.IllegalStateException("Unknown Variant: ".concat(ajhtVar3.d));
            }
            ajstVarB = ajmh.b(num.intValue());
        }
        return new defpackage.ajhr(ajhuVar, ajyiVar, ajstVarB, num);
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
