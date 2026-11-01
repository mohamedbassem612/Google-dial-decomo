package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class b {
    public static final j$.nio.file.b EXECUTE;
    public static final j$.nio.file.b READ;
    public static final j$.nio.file.b WRITE;
    public static final /* synthetic */ j$.nio.file.b[] a;

    static {
        j$.nio.file.b bVar = new j$.nio.file.b("READ", 0);
        READ = bVar;
        j$.nio.file.b bVar2 = new j$.nio.file.b("WRITE", 1);
        WRITE = bVar2;
        j$.nio.file.b bVar3 = new j$.nio.file.b("EXECUTE", 2);
        EXECUTE = bVar3;
        a = new j$.nio.file.b[]{bVar, bVar2, bVar3};
    }

    public static j$.nio.file.b valueOf(java.lang.String str) {
        return (j$.nio.file.b) java.lang.Enum.valueOf(j$.nio.file.b.class, str);
    }

    public static j$.nio.file.b[] values() {
        return (j$.nio.file.b[]) a.clone();
    }
}
