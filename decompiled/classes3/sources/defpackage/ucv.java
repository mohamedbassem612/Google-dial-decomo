package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ucv {
    private static final aimz a = aimz.i("com/android/dialer/spam/call/database/Converters");

    public static defpackage.ucu a(byte[] bArr) {
        try {
            return (defpackage.ucu) alad.B(defpackage.ucu.a, bArr, akzq.a());
        } catch (alaz e) {
            a.bq(a.c(), "unable to deserialize spam status", "com/android/dialer/spam/call/database/Converters", "fromBytes", (char) 23, "Converters.java", e, zct.b);
            return defpackage.ucu.a;
        }
    }
}
