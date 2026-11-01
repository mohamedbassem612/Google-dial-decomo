package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahyw {
    public static final java.util.Random a = new defpackage.ahyu();
    public static final java.security.SecureRandom b = a();
    public static final java.lang.ThreadLocal c;

    static {
        new defpackage.ahyv();
        c = new defpackage.ahyt();
    }

    public static java.security.SecureRandom a() {
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
