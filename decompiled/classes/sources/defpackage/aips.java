package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
class aips extends defpackage.aipk {
    @Override // defpackage.aipk
    public defpackage.ainh a(java.lang.Class cls, int i) {
        return defpackage.ainh.a;
    }

    @Override // defpackage.aipk
    public java.lang.String b(java.lang.Class cls) {
        java.lang.StackTraceElement stackTraceElementA;
        if (defpackage.aipu.a) {
            try {
                if (cls.equals(defpackage.aipu.p())) {
                    return dalvik.system.VMStack.getStackClass2().getName();
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        if (!defpackage.aipu.b || (stackTraceElementA = defpackage.aird.a(cls, 1)) == null) {
            return null;
        }
        return stackTraceElementA.getClassName();
    }
}
