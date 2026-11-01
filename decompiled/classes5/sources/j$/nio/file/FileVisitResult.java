package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class FileVisitResult {
    public static final j$.nio.file.FileVisitResult CONTINUE;
    public static final j$.nio.file.FileVisitResult SKIP_SIBLINGS;
    public static final j$.nio.file.FileVisitResult SKIP_SUBTREE;
    public static final j$.nio.file.FileVisitResult TERMINATE;
    public static final /* synthetic */ j$.nio.file.FileVisitResult[] a;

    static {
        j$.nio.file.FileVisitResult fileVisitResult = new j$.nio.file.FileVisitResult("CONTINUE", 0);
        CONTINUE = fileVisitResult;
        j$.nio.file.FileVisitResult fileVisitResult2 = new j$.nio.file.FileVisitResult("TERMINATE", 1);
        TERMINATE = fileVisitResult2;
        j$.nio.file.FileVisitResult fileVisitResult3 = new j$.nio.file.FileVisitResult("SKIP_SUBTREE", 2);
        SKIP_SUBTREE = fileVisitResult3;
        j$.nio.file.FileVisitResult fileVisitResult4 = new j$.nio.file.FileVisitResult("SKIP_SIBLINGS", 3);
        SKIP_SIBLINGS = fileVisitResult4;
        a = new j$.nio.file.FileVisitResult[]{fileVisitResult, fileVisitResult2, fileVisitResult3, fileVisitResult4};
    }

    public static j$.nio.file.FileVisitResult valueOf(java.lang.String str) {
        return (j$.nio.file.FileVisitResult) java.lang.Enum.valueOf(j$.nio.file.FileVisitResult.class, str);
    }

    public static j$.nio.file.FileVisitResult[] values() {
        return (j$.nio.file.FileVisitResult[]) a.clone();
    }
}
