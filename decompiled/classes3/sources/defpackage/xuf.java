package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xuf extends java.io.IOException {
    private static final long serialVersionUID = 1;
    public final int a;

    public xuf(java.lang.String str, int i, java.lang.Throwable th) {
        super(str + ", status code: " + i, th);
        this.a = i;
    }
}
