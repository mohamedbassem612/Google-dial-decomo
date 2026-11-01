package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class esu {
    public static final java.lang.String a;
    public static final java.lang.String b = "1";
    public static final java.lang.String c = "2";
    public static final java.lang.String d = "3";
    public static final java.lang.String e = "4";

    static {
        java.lang.String str = eum.a;
        a = "0";
    }

    public static android.os.Bundle a(android.text.Spanned spanned, java.lang.Object obj, int i, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt(a, spanned.getSpanStart(obj));
        bundle2.putInt(b, spanned.getSpanEnd(obj));
        bundle2.putInt(c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i);
        if (bundle != null) {
            bundle2.putBundle(e, bundle);
        }
        return bundle2;
    }
}
