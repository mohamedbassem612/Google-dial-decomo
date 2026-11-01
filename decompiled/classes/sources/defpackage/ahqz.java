package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahqz {
    public final defpackage.ahpj a;

    public ahqz(defpackage.ahpj ahpjVar) {
        this.a = ahpjVar;
    }

    public static defpackage.ahqz b() {
        return new defpackage.ahqz(defpackage.ahns.c(false));
    }

    public static java.lang.Runnable c(defpackage.ahqz ahqzVar, java.lang.Runnable runnable) {
        defpackage.ahpj ahpjVar = ahqzVar.a;
        defpackage.ahvr.cj(ahpjVar, "Trying to propagate null trace");
        long j = defpackage.ahqx.a;
        defpackage.aooh.f(ahpjVar, "trace");
        return new ahqs(ahpjVar, runnable);
    }

    public static void d(defpackage.ahqz ahqzVar) {
        defpackage.ahns.u(ahqzVar.a);
    }

    public static defpackage.ahqz f() {
        return new defpackage.ahqz(defpackage.ahns.b());
    }

    public final defpackage.ahpm a() {
        defpackage.ahpj ahpjVar = this.a;
        defpackage.ahpj ahpjVarB = defpackage.ahns.b();
        defpackage.ahns.u(ahpjVar);
        return new defpackage.ahmv((java.lang.Object) ahpjVarB, 6);
    }

    public final boolean e() {
        return this.a == null;
    }

    public final java.lang.String toString() {
        defpackage.ahpj ahpjVar = this.a;
        return ahpjVar == null ? "null ref" : ahpjVar.toString();
    }
}
