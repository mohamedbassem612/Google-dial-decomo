package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aprd extends defpackage.aprg {
    public static final /* synthetic */ int b = 0;
    public final defpackage.aprb a;
    private final java.util.function.UnaryOperator c;

    public aprd(defpackage.apra apraVar) {
        this.a = apraVar.b;
        this.c = apraVar.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aprd) {
            return j$.util.Objects.equals(this.a, ((defpackage.aprd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a});
    }

    public final /* bridge */ /* synthetic */ j$.nio.file.FileVisitResult postVisitDirectory(java.lang.Object obj, java.io.IOException iOException) {
        this.a.b.a();
        return j$.nio.file.FileVisitResult.CONTINUE;
    }

    public final /* bridge */ /* synthetic */ j$.nio.file.FileVisitResult preVisitDirectory(java.lang.Object obj, j$.nio.file.attribute.BasicFileAttributes basicFileAttributes) {
        return j$.nio.file.FileVisitResult.CONTINUE != j$.nio.file.FileVisitResult.CONTINUE ? j$.nio.file.FileVisitResult.SKIP_SUBTREE : j$.nio.file.FileVisitResult.CONTINUE;
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }

    public final /* bridge */ /* synthetic */ j$.nio.file.FileVisitResult visitFile(java.lang.Object obj, j$.nio.file.attribute.BasicFileAttributes basicFileAttributes) {
        if (j$.nio.file.Files.exists((j$.nio.file.Path) obj, new j$.nio.file.LinkOption[0]) && j$.nio.file.FileVisitResult.CONTINUE == j$.nio.file.FileVisitResult.CONTINUE) {
            defpackage.aprb aprbVar = this.a;
            aprbVar.c.a();
            aprbVar.a.a += basicFileAttributes.size();
        }
        return j$.nio.file.FileVisitResult.CONTINUE;
    }
}
