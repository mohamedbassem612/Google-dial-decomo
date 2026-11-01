package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ogv implements zdu {
    private static final aimz a = aimz.i("com/android/dialer/expresso/remote/ExpressoRemoteMixins");
    private final aoin b;
    private final pgi c;

    public ogv(aoin aoinVar, pgi pgiVar) {
        aooh.f(aoinVar, "enableExpresso");
        this.b = aoinVar;
        this.c = pgiVar;
    }

    public final java.lang.Object a(byte[] bArr, aoln aolnVar) {
        try {
            return (defpackage.ogp) alad.v(defpackage.ogp.a, akzc.u(bArr));
        } catch (alaz e) {
            a.c().k(e).l("com/android/dialer/expresso/remote/ExpressoRemoteMixins", "decodeRawData", 36, "ExpressoRemoteMixins.kt").v("Invalid data provided to capability, throwing it on the ground.");
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ java.lang.Object b(albh albhVar, aoln aolnVar) {
        return ((defpackage.ogp) albhVar).i();
    }

    public final java.lang.Object c(aoln aolnVar) {
        return ((java.lang.Boolean) this.b.a()).booleanValue() ? this.c.h(aolnVar) : java.lang.Boolean.FALSE;
    }
}
