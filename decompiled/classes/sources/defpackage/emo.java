package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class emo {
    public emo() {
    }

    public static defpackage.emp a(defpackage.emq emqVar) {
        if (emqVar == null) {
            defpackage.aooh.i("state");
        }
        int iOrdinal = emqVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return null;
        }
        if (iOrdinal == 2) {
            return defpackage.emp.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return defpackage.emp.ON_STOP;
        }
        if (iOrdinal == 4) {
            return defpackage.emp.ON_PAUSE;
        }
        throw new defpackage.aois();
    }

    public static defpackage.emp b(defpackage.emq emqVar) {
        if (emqVar == null) {
            defpackage.aooh.i("state");
        }
        int iOrdinal = emqVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return defpackage.emp.ON_CREATE;
            }
            if (iOrdinal == 2) {
                return defpackage.emp.ON_START;
            }
            if (iOrdinal == 3) {
                return defpackage.emp.ON_RESUME;
            }
            if (iOrdinal != 4) {
                throw new defpackage.aois();
            }
        }
        return null;
    }

    public static defpackage.emp c(defpackage.emq emqVar) {
        if (emqVar == null) {
            defpackage.aooh.i("state");
        }
        int iOrdinal = emqVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return null;
        }
        if (iOrdinal == 2) {
            return defpackage.emp.ON_CREATE;
        }
        if (iOrdinal == 3) {
            return defpackage.emp.ON_START;
        }
        if (iOrdinal == 4) {
            return defpackage.emp.ON_RESUME;
        }
        throw new defpackage.aois();
    }

    public static void g(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    public static boolean h(byte b) {
        return b > -65;
    }

    public static boolean i(byte b) {
        return b >= 0;
    }

    public emo(byte[] bArr) {
    }

    public void d(android.view.View view) {
    }

    public void e(android.view.View view) {
    }

    public void f(android.view.View view) {
    }
}
