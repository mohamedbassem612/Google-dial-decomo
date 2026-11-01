package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wza {
    private static final aimz a = aimz.i("com/android/incallui/atlas/ui/impl/database/AtlasDataTypeConverter");

    public static defpackage.wxp a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return (defpackage.wxp) alad.B(defpackage.wxp.a, bArr, akzq.a());
        } catch (alaz e) {
            a.by(a.c(), "unable to deserialize atlas call details", "com/android/incallui/atlas/ui/impl/database/AtlasDataTypeConverter", "atlasCallDetailsFromBytes", (char) 26, "AtlasDataTypeConverter.java", e);
            return defpackage.wxp.a;
        }
    }

    public static defpackage.xac b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return (defpackage.xac) alad.B(defpackage.xac.a, bArr, akzq.a());
        } catch (alaz e) {
            a.by(a.c(), "unable to deserialize detection metrics", "com/android/incallui/atlas/ui/impl/database/AtlasDataTypeConverter", "detectionMetricsFromBytes", '.', "AtlasDataTypeConverter.java", e);
            return defpackage.xac.a;
        }
    }

    public static byte[] c(defpackage.wxp wxpVar) {
        if (wxpVar == null) {
            return null;
        }
        return wxpVar.i();
    }

    public static byte[] d(defpackage.xac xacVar) {
        if (xacVar == null) {
            return null;
        }
        return xacVar.i();
    }
}
