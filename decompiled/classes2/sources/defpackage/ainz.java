package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ainz extends ainh {
    private final java.lang.StackTraceElement b;

    public ainz(java.lang.StackTraceElement stackTraceElement) {
        this.b = stackTraceElement;
    }

    public final int a() {
        return java.lang.Math.max(this.b.getLineNumber(), 0);
    }

    public final java.lang.String b() {
        return this.b.getClassName();
    }

    public final java.lang.String c() {
        return this.b.getFileName();
    }

    public final java.lang.String d() {
        return this.b.getMethodName();
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.ainz) && this.b.equals(((defpackage.ainz) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
