package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class u7 {
    public static final j$.util.stream.u7 OP;
    public static final j$.util.stream.u7 SPLITERATOR;
    public static final j$.util.stream.u7 STREAM;
    public static final j$.util.stream.u7 TERMINAL_OP;
    public static final j$.util.stream.u7 UPSTREAM_TERMINAL_OP;
    public static final /* synthetic */ j$.util.stream.u7[] a;

    static {
        j$.util.stream.u7 u7Var = new j$.util.stream.u7("SPLITERATOR", 0);
        SPLITERATOR = u7Var;
        j$.util.stream.u7 u7Var2 = new j$.util.stream.u7("STREAM", 1);
        STREAM = u7Var2;
        j$.util.stream.u7 u7Var3 = new j$.util.stream.u7("OP", 2);
        OP = u7Var3;
        j$.util.stream.u7 u7Var4 = new j$.util.stream.u7("TERMINAL_OP", 3);
        TERMINAL_OP = u7Var4;
        j$.util.stream.u7 u7Var5 = new j$.util.stream.u7("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = u7Var5;
        a = new j$.util.stream.u7[]{u7Var, u7Var2, u7Var3, u7Var4, u7Var5};
    }

    public static j$.util.stream.u7 valueOf(java.lang.String str) {
        return (j$.util.stream.u7) java.lang.Enum.valueOf(j$.util.stream.u7.class, str);
    }

    public static j$.util.stream.u7[] values() {
        return (j$.util.stream.u7[]) a.clone();
    }
}
