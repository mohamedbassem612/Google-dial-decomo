package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ajsl extends java.lang.ThreadLocal {
    final /* synthetic */ defpackage.ajsm a;

    public ajsl(defpackage.ajsm ajsmVar) {
        j$.util.Objects.requireNonNull(ajsmVar);
        this.a = ajsmVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final javax.crypto.Mac initialValue() {
        try {
            defpackage.ajse ajseVar = defpackage.ajse.b;
            defpackage.ajsm ajsmVar = this.a;
            javax.crypto.Mac mac = (javax.crypto.Mac) ajseVar.a(ajsmVar.a);
            mac.init(ajsmVar.b);
            return mac;
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }
}
