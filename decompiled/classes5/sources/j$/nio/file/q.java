package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class q {
    public static final j$.nio.file.q FOLLOW_LINKS;
    public static final /* synthetic */ j$.nio.file.q[] a;

    static {
        j$.nio.file.q qVar = new j$.nio.file.q("FOLLOW_LINKS", 0);
        FOLLOW_LINKS = qVar;
        a = new j$.nio.file.q[]{qVar};
    }

    public static j$.nio.file.q valueOf(java.lang.String str) {
        return (j$.nio.file.q) java.lang.Enum.valueOf(j$.nio.file.q.class, str);
    }

    public static j$.nio.file.q[] values() {
        return (j$.nio.file.q[]) a.clone();
    }
}
