package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class d0 {
    public static final j$.time.format.d0 ALWAYS;
    public static final j$.time.format.d0 EXCEEDS_PAD;
    public static final j$.time.format.d0 NEVER;
    public static final j$.time.format.d0 NORMAL;
    public static final j$.time.format.d0 NOT_NEGATIVE;
    public static final /* synthetic */ j$.time.format.d0[] a;

    static {
        j$.time.format.d0 d0Var = new j$.time.format.d0("NORMAL", 0);
        NORMAL = d0Var;
        j$.time.format.d0 d0Var2 = new j$.time.format.d0("ALWAYS", 1);
        ALWAYS = d0Var2;
        j$.time.format.d0 d0Var3 = new j$.time.format.d0("NEVER", 2);
        NEVER = d0Var3;
        j$.time.format.d0 d0Var4 = new j$.time.format.d0("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = d0Var4;
        j$.time.format.d0 d0Var5 = new j$.time.format.d0("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = d0Var5;
        a = new j$.time.format.d0[]{d0Var, d0Var2, d0Var3, d0Var4, d0Var5};
    }

    public static j$.time.format.d0 valueOf(java.lang.String str) {
        return (j$.time.format.d0) java.lang.Enum.valueOf(j$.time.format.d0.class, str);
    }

    public static j$.time.format.d0[] values() {
        return (j$.time.format.d0[]) a.clone();
    }
}
