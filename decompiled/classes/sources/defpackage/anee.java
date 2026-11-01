package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anee {
    public static final defpackage.adag a;
    private static volatile java.lang.String b;
    private static final defpackage.aeyz c;

    static {
        defpackage.aeza aezaVar = new defpackage.aeza(new defpackage.agqh(14));
        aezaVar.b(defpackage.aihd.s("DROIDGUARD", "DROIDGUARD_ONDEVICE", "STREAMZ_DROIDGUARD"));
        defpackage.aeyz aeyzVarA = aezaVar.a();
        c = aeyzVarA;
        a = new defpackage.adag("com.google.android.gms.droidguardclient", (java.lang.Object) aeyzVarA);
        b = null;
    }

    private anee() {
    }

    public static java.lang.String a(android.content.Context context) {
        java.lang.String str = b;
        if (str == null) {
            synchronized (defpackage.anee.class) {
                str = b;
                if (str == null) {
                    java.lang.String strE = defpackage.aewo.e(context, "com.google.android.gms.droidguardclient");
                    b = strE;
                    str = strE;
                }
            }
        }
        return str;
    }
}
