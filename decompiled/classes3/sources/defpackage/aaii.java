package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaii {
    private static defpackage.aaih a;

    public static synchronized void a(defpackage.aaih aaihVar) {
        ahvr.bZ(a == null, "Redundantly setting SignatureVerificationConfiguration");
        a = aaihVar;
    }

    public static synchronized void b() {
        if (a == null) {
            a(new defpackage.aaig());
        }
    }
}
