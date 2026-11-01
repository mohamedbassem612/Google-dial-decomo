package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aayp {
    private static defpackage.aayo a;

    public static synchronized defpackage.aayo a() {
        if (a == null) {
            b(new defpackage.aayu());
        }
        return a;
    }

    public static synchronized void b(defpackage.aayo aayoVar) {
        if (a != null) {
            throw new java.lang.IllegalStateException("init() already called");
        }
        a = aayoVar;
    }
}
