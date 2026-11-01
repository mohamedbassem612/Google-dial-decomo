package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class c0 {
    public static final j$.time.format.c0 LENIENT;
    public static final j$.time.format.c0 SMART;
    public static final j$.time.format.c0 STRICT;
    public static final /* synthetic */ j$.time.format.c0[] a;

    static {
        j$.time.format.c0 c0Var = new j$.time.format.c0("STRICT", 0);
        STRICT = c0Var;
        j$.time.format.c0 c0Var2 = new j$.time.format.c0("SMART", 1);
        SMART = c0Var2;
        j$.time.format.c0 c0Var3 = new j$.time.format.c0("LENIENT", 2);
        LENIENT = c0Var3;
        a = new j$.time.format.c0[]{c0Var, c0Var2, c0Var3};
    }

    public static j$.time.format.c0 valueOf(java.lang.String str) {
        return (j$.time.format.c0) java.lang.Enum.valueOf(j$.time.format.c0.class, str);
    }

    public static j$.time.format.c0[] values() {
        return (j$.time.format.c0[]) a.clone();
    }
}
