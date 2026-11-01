package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class luh implements zdu {
    private static final aimz a = aimz.i("com/android/dialer/contactchecker/remote/ContactCheckerRemoteMixins");
    private final aoin b;

    public luh(aoin aoinVar) {
        aooh.f(aoinVar, "enableContactChecker");
        this.b = aoinVar;
    }

    public final java.lang.Object a(byte[] bArr, aoln aolnVar) {
        try {
            return (defpackage.ltu) alad.v(defpackage.ltu.a, akzc.u(bArr));
        } catch (alaz e) {
            a.c().k(e).l("com/android/dialer/contactchecker/remote/ContactCheckerRemoteMixins", "decodeRawData", 32, "ContactCheckerRemoteMixins.kt").v("Invalid data provided to capability, throwing it on the ground.");
            return null;
        }
    }

    public final /* synthetic */ java.lang.Object b(albh albhVar, aoln aolnVar) {
        return ((defpackage.ltu) albhVar).i();
    }

    public final java.lang.Object c(aoln aolnVar) {
        java.lang.Object objA = this.b.a();
        aooh.e(objA, "get(...)");
        return objA;
    }
}
