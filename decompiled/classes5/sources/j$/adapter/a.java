package j$.adapter;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class a {
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;

    static {
        boolean z;
        boolean z2;
        boolean z3 = false;
        try {
            java.lang.Class.forName("java.util.StringJoiner");
            z = true;
        } catch (java.lang.ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        try {
            java.lang.Class.forName("java.nio.file.FileSystems");
            z2 = true;
        } catch (java.lang.ClassNotFoundException unused2) {
            z2 = false;
        }
        b = z2;
        try {
            java.lang.Class.forName("android.os.Build");
            z3 = true;
        } catch (java.lang.ClassNotFoundException unused3) {
        }
        c = z3;
    }
}
