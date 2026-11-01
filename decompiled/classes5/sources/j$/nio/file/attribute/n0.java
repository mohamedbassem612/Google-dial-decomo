package j$.nio.file.attribute;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class n0 {
    public static final j$.nio.file.attribute.n0 GROUP_EXECUTE;
    public static final j$.nio.file.attribute.n0 GROUP_READ;
    public static final j$.nio.file.attribute.n0 GROUP_WRITE;
    public static final j$.nio.file.attribute.n0 OTHERS_EXECUTE;
    public static final j$.nio.file.attribute.n0 OTHERS_READ;
    public static final j$.nio.file.attribute.n0 OTHERS_WRITE;
    public static final j$.nio.file.attribute.n0 OWNER_EXECUTE;
    public static final j$.nio.file.attribute.n0 OWNER_READ;
    public static final j$.nio.file.attribute.n0 OWNER_WRITE;
    public static final /* synthetic */ j$.nio.file.attribute.n0[] a;

    static {
        j$.nio.file.attribute.n0 n0Var = new j$.nio.file.attribute.n0("OWNER_READ", 0);
        OWNER_READ = n0Var;
        j$.nio.file.attribute.n0 n0Var2 = new j$.nio.file.attribute.n0("OWNER_WRITE", 1);
        OWNER_WRITE = n0Var2;
        j$.nio.file.attribute.n0 n0Var3 = new j$.nio.file.attribute.n0("OWNER_EXECUTE", 2);
        OWNER_EXECUTE = n0Var3;
        j$.nio.file.attribute.n0 n0Var4 = new j$.nio.file.attribute.n0("GROUP_READ", 3);
        GROUP_READ = n0Var4;
        j$.nio.file.attribute.n0 n0Var5 = new j$.nio.file.attribute.n0("GROUP_WRITE", 4);
        GROUP_WRITE = n0Var5;
        j$.nio.file.attribute.n0 n0Var6 = new j$.nio.file.attribute.n0("GROUP_EXECUTE", 5);
        GROUP_EXECUTE = n0Var6;
        j$.nio.file.attribute.n0 n0Var7 = new j$.nio.file.attribute.n0("OTHERS_READ", 6);
        OTHERS_READ = n0Var7;
        j$.nio.file.attribute.n0 n0Var8 = new j$.nio.file.attribute.n0("OTHERS_WRITE", 7);
        OTHERS_WRITE = n0Var8;
        j$.nio.file.attribute.n0 n0Var9 = new j$.nio.file.attribute.n0("OTHERS_EXECUTE", 8);
        OTHERS_EXECUTE = n0Var9;
        a = new j$.nio.file.attribute.n0[]{n0Var, n0Var2, n0Var3, n0Var4, n0Var5, n0Var6, n0Var7, n0Var8, n0Var9};
    }

    public static j$.nio.file.attribute.n0 valueOf(java.lang.String str) {
        return (j$.nio.file.attribute.n0) java.lang.Enum.valueOf(j$.nio.file.attribute.n0.class, str);
    }

    public static j$.nio.file.attribute.n0[] values() {
        return (j$.nio.file.attribute.n0[]) a.clone();
    }
}
