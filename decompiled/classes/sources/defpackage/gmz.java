package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gmz {
    public static final /* synthetic */ int a = 0;
    private static final java.lang.String b;

    static {
        defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
        b = new defpackage.aooa(defpackage.gmz.class).c();
    }

    private gmz() {
    }

    public static final int a() {
        try {
            return ddz$.ExternalSyntheticApiModelOutline0.m(ddz$.ExternalSyntheticApiModelOutline0.m());
        } catch (java.lang.NoClassDefFoundError unused) {
            if (gmw.a != defpackage.gnh.b) {
                return 0;
            }
            android.util.Log.d(b, "Embedding extension version not found");
            return 0;
        } catch (java.lang.NullPointerException unused2) {
            if (gmw.a != defpackage.gnh.b) {
                return 0;
            }
            android.util.Log.d(b, "Error with Extension implementation");
            return 0;
        } catch (java.lang.UnsupportedOperationException unused3) {
            if (gmw.a != defpackage.gnh.b) {
                return 0;
            }
            android.util.Log.d(b, "Stub Extension");
            return 0;
        }
    }
}
