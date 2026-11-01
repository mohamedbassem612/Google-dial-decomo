package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class airi implements defpackage.airg {
    private static final int c(java.lang.StackTraceElement[] stackTraceElementArr, java.lang.Class cls, int i) {
        java.lang.String name = cls.getName();
        boolean z = false;
        while (i < stackTraceElementArr.length) {
            if (stackTraceElementArr[i].getClassName().equals(name)) {
                z = true;
            } else if (z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    @Override // defpackage.airg
    public final java.lang.StackTraceElement a(java.lang.Class cls, int i) {
        defpackage.aiql.j((i ^ (-1)) >>> 31, "skipFrames must be >= 0");
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
        int iC = c(stackTrace, cls, i + 1);
        if (iC != -1) {
            return stackTrace[iC];
        }
        return null;
    }

    @Override // defpackage.airg
    public final java.lang.StackTraceElement[] b(java.lang.Class cls, int i, int i2) {
        if (i != -1 && i <= 0) {
            throw new java.lang.IllegalArgumentException("maxDepth must be > 0 or -1");
        }
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
        int iC = c(stackTrace, cls, i2 + 1);
        if (iC == -1) {
            return new java.lang.StackTraceElement[0];
        }
        int length = stackTrace.length - iC;
        if (i <= 0 || i >= length) {
            i = length;
        }
        java.lang.StackTraceElement[] stackTraceElementArr = new java.lang.StackTraceElement[i];
        java.lang.System.arraycopy(stackTrace, iC, stackTraceElementArr, 0, i);
        return stackTraceElementArr;
    }
}
