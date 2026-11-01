package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class b9 {
    public static final j$.util.stream.b9 MAYBE_MORE;
    public static final j$.util.stream.b9 NO_MORE;
    public static final j$.util.stream.b9 UNLIMITED;
    public static final /* synthetic */ j$.util.stream.b9[] a;

    static {
        j$.util.stream.b9 b9Var = new j$.util.stream.b9("NO_MORE", 0);
        NO_MORE = b9Var;
        j$.util.stream.b9 b9Var2 = new j$.util.stream.b9("MAYBE_MORE", 1);
        MAYBE_MORE = b9Var2;
        j$.util.stream.b9 b9Var3 = new j$.util.stream.b9("UNLIMITED", 2);
        UNLIMITED = b9Var3;
        a = new j$.util.stream.b9[]{b9Var, b9Var2, b9Var3};
    }

    public static j$.util.stream.b9 valueOf(java.lang.String str) {
        return (j$.util.stream.b9) java.lang.Enum.valueOf(j$.util.stream.b9.class, str);
    }

    public static j$.util.stream.b9[] values() {
        return (j$.util.stream.b9[]) a.clone();
    }
}
