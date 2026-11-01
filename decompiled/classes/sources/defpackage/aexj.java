package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aexj extends java.lang.RuntimeException {
    public final int a;

    /* JADX WARN: Illegal instructions before constructor call */
    public aexj(int i, java.lang.String str, java.lang.Throwable th) {
        java.lang.String strValueOf;
        if (str != null) {
            strValueOf = i + ": " + str;
        } else {
            strValueOf = java.lang.String.valueOf(i);
        }
        super(strValueOf, th);
        this.a = i;
    }
}
