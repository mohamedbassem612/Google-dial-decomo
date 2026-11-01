package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajgy extends defpackage.ajfv {
    public final defpackage.ajha a;
    public final ajst b;
    public final java.lang.Integer c;

    private ajgy(defpackage.ajha ajhaVar, ajst ajstVar, java.lang.Integer num) {
        this.a = ajhaVar;
        this.b = ajstVar;
        this.c = num;
    }

    public static defpackage.ajgy aq(defpackage.ajha ajhaVar, java.lang.Integer num) throws java.security.GeneralSecurityException {
        ajst ajstVarB;
        ajgz ajgzVar = ajhaVar.b;
        if (ajgzVar == ajgz.a) {
            if (num == null) {
                throw new java.security.GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            ajstVarB = ajst.b(java.nio.ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (ajgzVar != ajgz.b) {
                throw new java.security.GeneralSecurityException("Unknown Variant: ".concat(ajgzVar.c));
            }
            if (num != null) {
                throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            ajstVarB = ajst.b(new byte[0]);
        }
        return new defpackage.ajgy(ajhaVar, ajstVarB, num);
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
