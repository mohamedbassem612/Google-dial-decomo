package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajmc {
    public static final defpackage.ajmc a = new defpackage.ajmc();
    private final java.util.concurrent.ConcurrentMap b = new j$.util.concurrent.ConcurrentHashMap();

    public final void a(defpackage.ajmb ajmbVar, java.lang.Class cls) throws java.security.GeneralSecurityException {
        defpackage.ajmb ajmbVar2 = (defpackage.ajmb) this.b.putIfAbsent(cls, ajmbVar);
        if (ajmbVar2 != null && !ajmbVar2.equals(ajmbVar)) {
            throw new java.security.GeneralSecurityException("Different key creator for parameters class already inserted");
        }
    }
}
