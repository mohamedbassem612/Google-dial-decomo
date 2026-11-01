package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaym {
    public static final defpackage.aayo a;

    static {
        android.net.Uri uri = defpackage.aayn.a;
        a = defpackage.aayp.a();
    }

    public static java.lang.String a(android.content.ContentResolver contentResolver, java.lang.String str, java.lang.String str2) {
        return a.a(contentResolver, str, str2);
    }

    public static long b(android.content.ContentResolver contentResolver, long j) {
        defpackage.aayo aayoVar = a;
        defpackage.aayu aayuVar = (defpackage.aayu) aayoVar;
        aayuVar.e(contentResolver);
        aayuVar.c(contentResolver);
        aayuVar.e.lock();
        try {
            java.lang.Object obj = ((defpackage.aayu) aayoVar).j;
            java.lang.Long lValueOf = (java.lang.Long) ((defpackage.aayu) aayoVar).b(((defpackage.aayu) aayoVar).i, "android_id", java.lang.Long.valueOf(j), defpackage.aayu.c);
            aayuVar.e.unlock();
            if (lValueOf != null) {
                return lValueOf.longValue();
            }
            java.lang.String strA = aayuVar.a(contentResolver, "android_id", null);
            if (strA != null) {
                try {
                    long j2 = java.lang.Long.parseLong(strA);
                    lValueOf = java.lang.Long.valueOf(j2);
                    j = j2;
                } catch (java.lang.NumberFormatException unused) {
                }
            }
            aayuVar.d(obj, aayuVar.i, "android_id", lValueOf, defpackage.aayu.c);
            return j;
        } catch (java.lang.Throwable th) {
            aayuVar.e.unlock();
            throw th;
        }
    }
}
