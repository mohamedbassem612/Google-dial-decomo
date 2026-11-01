package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aclq implements defpackage.aclr {
    public final defpackage.ajct a;
    public final java.util.Set b;

    public aclq(defpackage.ajct ajctVar, java.util.Set set) {
        this.a = ajctVar;
        this.b = set;
    }

    @Override // defpackage.aclr
    public final defpackage.ajcq a(defpackage.aclv aclvVar) {
        defpackage.lkf lkfVar = new defpackage.lkf(this, aclvVar, 6);
        long j = defpackage.ahqx.a;
        defpackage.ajdk ajdkVar = new defpackage.ajdk(new defpackage.ahqt(defpackage.ahns.c(false), lkfVar, 0));
        this.a.execute(ajdkVar);
        return ajdkVar;
    }
}
