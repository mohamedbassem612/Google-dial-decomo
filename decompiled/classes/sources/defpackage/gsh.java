package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gsh {
    public static final java.lang.Object a = new java.lang.Object();
    public static volatile defpackage.gsh b;
    public final int c;

    public gsh(int i) {
        this.c = i;
    }

    public static defpackage.gsh a() {
        defpackage.gsh gshVar;
        synchronized (a) {
            if (b == null) {
                b = new defpackage.gsh(3);
            }
            gshVar = b;
        }
        return gshVar;
    }

    public static java.lang.String b(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(23);
        sb.append("WM-");
        if (str.length() >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public final void c(java.lang.String str, java.lang.String str2) {
        if (this.c <= 3) {
            android.util.Log.d(str, str2);
        }
    }

    public final void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (this.c <= 3) {
            android.util.Log.d(str, str2, th);
        }
    }
}
