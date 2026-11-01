package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajgr extends defpackage.ajfv {
    public final defpackage.ajgu a;
    public final ajst b;
    public final java.lang.Integer c;
    public final ajyi d;

    private ajgr(defpackage.ajgu ajguVar, ajyi ajyiVar, ajst ajstVar, java.lang.Integer num) {
        this.a = ajguVar;
        this.d = ajyiVar;
        this.b = ajstVar;
        this.c = num;
    }

    public static defpackage.ajgr aq(defpackage.ajgt ajgtVar, ajyi ajyiVar, java.lang.Integer num) throws java.security.GeneralSecurityException {
        ajst ajstVarB;
        defpackage.ajgt ajgtVar2 = defpackage.ajgt.c;
        if (ajgtVar != ajgtVar2) {
            if (num == null) {
                throw new java.security.GeneralSecurityException("For given Variant " + ajgtVar.d + " the value of idRequirement must be non-null");
            }
        } else if (num != null) {
            throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (ajyiVar.j() != 32) {
            throw new java.security.GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + ajyiVar.j());
        }
        defpackage.ajgu ajguVar = new defpackage.ajgu(ajgtVar);
        defpackage.ajgt ajgtVar3 = ajguVar.a;
        if (ajgtVar3 == ajgtVar2) {
            ajstVarB = ajmh.a;
        } else if (ajgtVar3 == defpackage.ajgt.b) {
            ajstVarB = ajmh.a(num.intValue());
        } else {
            if (ajgtVar3 != defpackage.ajgt.a) {
                throw new java.lang.IllegalStateException("Unknown Variant: ".concat(ajgtVar3.d));
            }
            ajstVarB = ajmh.b(num.intValue());
        }
        return new defpackage.ajgr(ajguVar, ajyiVar, ajstVarB, num);
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
