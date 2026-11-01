package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apri implements java.io.Serializable, aprh {
    public static final aprh a;
    public static final aprh b;
    private static final java.lang.String c;
    private static final long serialVersionUID = 8782512160909720199L;

    static {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        c = "true";
        defpackage.apri apriVar = new defpackage.apri();
        a = apriVar;
        b = apriVar;
    }

    public final boolean accept(java.io.File file) {
        return true;
    }

    public final /* synthetic */ boolean matches(j$.nio.file.Path path) {
        return j$.nio.file.FileVisitResult.CONTINUE != j$.nio.file.FileVisitResult.TERMINATE;
    }

    public final java.lang.String toString() {
        return c;
    }

    public final boolean accept(java.io.File file, java.lang.String str) {
        return true;
    }
}
