package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akfp extends java.lang.Exception {
    public final akfo a;

    public akfp(akfo akfoVar, java.lang.String str) {
        super(str);
        this.a = akfoVar;
    }

    @Override // java.lang.Throwable
    public final synchronized java.lang.Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        return "Error type: " + java.lang.String.valueOf(this.a) + ". " + getMessage();
    }
}
