package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ajmz extends java.lang.ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ java.lang.Object initialValue() {
        java.security.SecureRandom secureRandomA = defpackage.ajna.a();
        secureRandomA.nextLong();
        return secureRandomA;
    }
}
