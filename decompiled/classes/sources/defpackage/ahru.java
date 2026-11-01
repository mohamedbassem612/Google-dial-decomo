package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahru {
    public final defpackage.ajbg a;

    public ahru(defpackage.ajbg ajbgVar) {
        this.a = ajbgVar;
    }

    public static defpackage.ahru b(defpackage.ajcq ajcqVar) {
        return new defpackage.ahru(new defpackage.ajbg(ajcqVar));
    }

    public final defpackage.ahru a(java.lang.Class cls, defpackage.ajbc ajbcVar, java.util.concurrent.Executor executor) {
        return new defpackage.ahru(this.a.a(cls, defpackage.ahqx.e(ajbcVar), executor));
    }

    public final defpackage.ahru c(defpackage.ajbc ajbcVar, java.util.concurrent.Executor executor) {
        return new defpackage.ahru(this.a.c(defpackage.ahqx.e(ajbcVar), executor));
    }

    public final defpackage.ahru d(defpackage.ajba ajbaVar, java.util.concurrent.Executor executor) {
        return new defpackage.ahru(this.a.d(defpackage.ahqx.d(ajbaVar), executor));
    }

    public final defpackage.ahrv e() {
        return defpackage.ahrv.g(this.a.h());
    }

    public final java.lang.String toString() {
        return "PropagatedClosingFuture[" + this.a.toString() + ']';
    }
}
