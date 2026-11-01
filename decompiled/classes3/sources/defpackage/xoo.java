package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xoo extends defpackage.xof {
    /* JADX WARN: Illegal instructions before constructor call */
    public xoo(defpackage.xjz xjzVar, java.lang.Throwable th, java.lang.String str) {
        aooh.f(xjzVar, "ref");
        if (str == null && (str = th.getMessage()) == null) {
            java.lang.Class<?> cls = th.getClass();
            aopu[] aopuVarArr = aoou.a;
            str = "Unknown onboarding task service server error " + new aooa(cls).c() + '.';
        }
        super(xjzVar, str, th);
    }
}
