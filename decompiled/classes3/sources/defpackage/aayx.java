package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class aayx {
    public static android.content.ContentResolver a;
    protected final java.lang.String b;
    protected final java.lang.Object c;

    protected aayx(java.lang.String str, java.lang.Object obj) {
        this.b = str;
        this.c = obj;
    }

    public static void b(android.content.Context context) {
        a = context.getContentResolver();
    }

    public static defpackage.aayx c(java.lang.String str) {
        return new defpackage.aayv(str, java.lang.Boolean.FALSE);
    }

    public abstract java.lang.Object a();
}
