package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anns {
    public static final java.util.concurrent.atomic.AtomicLong a = new java.util.concurrent.atomic.AtomicLong();
    public final long b;
    private final java.lang.String c;
    private final java.lang.String d;

    public anns(java.lang.String str, java.lang.String str2, long j) {
        if (str == null) {
            throw new java.lang.NullPointerException("typeName");
        }
        if (str.isEmpty()) {
            throw new java.lang.IllegalArgumentException("empty type");
        }
        this.c = str;
        this.d = str2;
        this.b = j;
    }

    public static defpackage.anns a(java.lang.Class cls, java.lang.String str) {
        return new defpackage.anns(c(cls), str, a.incrementAndGet());
    }

    public static defpackage.anns b(java.lang.String str, java.lang.String str2) {
        return new defpackage.anns(str, str2, a.incrementAndGet());
    }

    public static java.lang.String c(java.lang.Class cls) {
        if (cls == null) {
            throw new java.lang.NullPointerException("type");
        }
        java.lang.String simpleName = cls.getSimpleName();
        return simpleName.isEmpty() ? cls.getName().substring(cls.getPackage().getName().length() + 1) : simpleName;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.c + '<' + this.b + '>');
        java.lang.String str = this.d;
        if (str != null) {
            sb.append(": (");
            sb.append(str);
            sb.append(')');
        }
        return sb.toString();
    }
}
