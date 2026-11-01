package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aiqj extends aipk {
    public static final aipk a = new defpackage.aiqj();

    public final ainh a(java.lang.Class cls, int i) {
        java.lang.StackTraceElement stackTraceElementA = aird.a(cls, i + 1);
        return stackTraceElementA != null ? new defpackage.ainz(stackTraceElementA) : ainh.a;
    }

    public final java.lang.String b(java.lang.Class cls) {
        java.lang.StackTraceElement stackTraceElementA = aird.a(cls, 1);
        if (stackTraceElementA != null) {
            return stackTraceElementA.getClassName();
        }
        throw new java.lang.IllegalStateException("no caller found on the stack for: ".concat(java.lang.String.valueOf(cls.getName())));
    }

    public final java.lang.String toString() {
        return "Default stack-based caller finder";
    }
}
