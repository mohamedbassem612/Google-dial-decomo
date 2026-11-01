package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anui extends defpackage.anxr {
    public static final /* synthetic */ int i = 0;
    public final java.lang.Object a;
    public final java.util.Collection b;
    public boolean c;
    public boolean d;
    public anqw e;
    public boolean f;
    public boolean g;
    final /* synthetic */ defpackage.anuj h;
    private int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anui(defpackage.anuj anujVar, int i2, defpackage.aodj aodjVar, java.lang.Object obj, aodq aodqVar) {
        super(i2, aodjVar, aodqVar);
        j$.util.Objects.requireNonNull(anujVar);
        this.h = anujVar;
        this.b = new java.util.ArrayList();
        this.d = false;
        this.a = obj;
    }

    @Override // defpackage.anzw
    public final void a(int i2) {
        defpackage.anuj anujVar = this.h;
        ahvr.cj(anujVar.l, "stream must not be null");
        int i3 = this.u - i2;
        this.u = i3;
        if (i3 != 0 || this.f) {
            return;
        }
        if (android.util.Log.isLoggable("grpc-java-cronet", 2)) {
            android.util.Log.v("grpc-java-cronet", "BidirectionalStream.read");
        }
        anujVar.l.read(java.nio.ByteBuffer.allocateDirect(anujVar.q));
    }

    @Override // defpackage.anzw
    public final void b(java.lang.Throwable th) {
        c(anqw.d(th), true, new anph());
    }

    @Override // defpackage.anxr
    protected final void c(anqw anqwVar, boolean z, anph anphVar) {
        defpackage.anuj anujVar = this.h;
        ahvr.cj(anujVar.l, "stream must not be null");
        anujVar.l.cancel();
        l(anqwVar, z, anphVar);
    }

    @Override // defpackage.anur
    protected final void d() {
        super.d();
    }

    @Override // defpackage.anuu
    public final void e(java.lang.Runnable runnable) {
        synchronized (this.a) {
            runnable.run();
        }
    }

    public final void f(java.nio.ByteBuffer byteBuffer) {
        this.u += byteBuffer.remaining();
        defpackage.aoaw aoawVar = defpackage.aoba.a;
        super.n(new defpackage.aoaz(byteBuffer), false);
    }
}
