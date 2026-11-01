package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class w7 {
    public static final j$.util.stream.w7 DOUBLE_VALUE;
    public static final j$.util.stream.w7 INT_VALUE;
    public static final j$.util.stream.w7 LONG_VALUE;
    public static final j$.util.stream.w7 REFERENCE;
    public static final /* synthetic */ j$.util.stream.w7[] a;

    static {
        j$.util.stream.w7 w7Var = new j$.util.stream.w7("REFERENCE", 0);
        REFERENCE = w7Var;
        j$.util.stream.w7 w7Var2 = new j$.util.stream.w7("INT_VALUE", 1);
        INT_VALUE = w7Var2;
        j$.util.stream.w7 w7Var3 = new j$.util.stream.w7("LONG_VALUE", 2);
        LONG_VALUE = w7Var3;
        j$.util.stream.w7 w7Var4 = new j$.util.stream.w7("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = w7Var4;
        a = new j$.util.stream.w7[]{w7Var, w7Var2, w7Var3, w7Var4};
    }

    public static j$.util.stream.w7 valueOf(java.lang.String str) {
        return (j$.util.stream.w7) java.lang.Enum.valueOf(j$.util.stream.w7.class, str);
    }

    public static j$.util.stream.w7[] values() {
        return (j$.util.stream.w7[]) a.clone();
    }
}
