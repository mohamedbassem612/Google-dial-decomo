package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aody extends anty {
    final /* synthetic */ aowi a;
    final /* synthetic */ defpackage.apjb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aody(aowi aowiVar, defpackage.apjb apjbVar) {
        super((byte[]) null, (byte[]) null, (byte[]) null);
        this.a = aowiVar;
        this.b = apjbVar;
    }

    public final void a(anqw anqwVar, anph anphVar) {
        aooh.f(anqwVar, "status");
        aooh.f(anphVar, "trailersMetadata");
        this.a.e(anqwVar.h() ? null : new anqx(anqwVar, anphVar));
    }

    public final void d(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object objB = this.a.b(obj);
        if (objB instanceof aowl) {
            java.lang.Throwable thB = aowm.b(objB);
            if (thB != null) {
                throw thB;
            }
            throw new java.lang.AssertionError("onMessage should never be called until responses is ready");
        }
    }

    public final void e() throws java.lang.Throwable {
        this.b.i();
    }
}
