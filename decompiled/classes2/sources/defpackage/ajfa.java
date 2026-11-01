package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajfa {
    private static final java.util.concurrent.CopyOnWriteArrayList a = new java.util.concurrent.CopyOnWriteArrayList();

    public static defpackage.ajez a(java.lang.String str) throws java.security.GeneralSecurityException {
        for (defpackage.ajez ajezVar : a) {
            if (ajezVar.b(str)) {
                return ajezVar;
            }
        }
        throw new java.security.GeneralSecurityException("No KMS client does support: ".concat(java.lang.String.valueOf(str)));
    }
}
