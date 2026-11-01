package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajbr implements defpackage.ajas {
    final /* synthetic */ java.util.concurrent.Callable a;

    public ajbr(defpackage.ajwr ajwrVar, java.util.concurrent.Callable callable) {
        this.a = callable;
        j$.util.Objects.requireNonNull(ajwrVar);
    }

    @Override // defpackage.ajas
    public final defpackage.ajcq a() throws java.lang.Exception {
        java.lang.Object objCall = this.a.call();
        return objCall == null ? defpackage.ajcm.a : new defpackage.ajcm(objCall);
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
