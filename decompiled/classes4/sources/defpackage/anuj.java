package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anuj extends defpackage.anup {
    public static final java.nio.ByteBuffer a = java.nio.ByteBuffer.allocateDirect(0);

    @java.lang.Deprecated
    static final anma b = new anma("cronet-annotation", (java.lang.Object) null);
    public static final anma c = new anma("cronet-annotations", (java.lang.Object) null);
    public static final anma d = new anma("cronet-read-buffer-size", 4096);
    public final java.lang.String e;
    public final java.lang.String f;
    public final defpackage.aodj g;
    public final java.util.concurrent.Executor h;
    public final anph i;
    public final defpackage.anul j;
    public final java.lang.Runnable k;
    public org.chromium.net.BidirectionalStream l;
    public final boolean m;
    public final java.lang.Object n;
    public final java.util.Collection o;
    public final defpackage.anui p;
    final int q;
    public defpackage.anud r;
    private final defpackage.anuh w;

    public anuj(java.lang.String str, java.lang.String str2, java.util.concurrent.Executor executor, anph anphVar, defpackage.anul anulVar, java.lang.Runnable runnable, java.lang.Object obj, int i, defpackage.anpk anpkVar, defpackage.aodj aodjVar, anmb anmbVar, aodq aodqVar) {
        super(new defpackage.aofr(1), aodjVar, aodqVar, anphVar, anmbVar);
        this.w = new defpackage.anuh(this);
        this.e = str;
        this.f = str2;
        this.g = aodjVar;
        this.h = executor;
        ahvr.cj(anphVar, "headers");
        this.i = anphVar;
        this.j = anulVar;
        this.k = runnable;
        this.m = anpkVar.a == defpackage.anpj.a;
        this.n = anmbVar.f(b);
        this.o = (java.util.Collection) anmbVar.f(c);
        this.p = new defpackage.anui(this, i, aodjVar, obj, aodqVar);
        this.q = ((java.lang.Integer) anmbVar.f(d)).intValue();
        f();
    }

    @Override // defpackage.anvp
    public final defpackage.anlw a() {
        return defpackage.anlw.a;
    }

    @Override // defpackage.anup
    protected final /* synthetic */ defpackage.anuo p() {
        return this.w;
    }

    @Override // defpackage.anup, defpackage.anus
    protected final /* synthetic */ defpackage.anur q() {
        return this.p;
    }

    public final void r(anqw anqwVar) {
        this.j.a(this, anqwVar);
    }

    public final void s(java.nio.ByteBuffer byteBuffer, boolean z, boolean z2) {
        if (this.l != null) {
            if (android.util.Log.isLoggable("grpc-java-cronet", 2)) {
                android.util.Log.v("grpc-java-cronet", "BidirectionalStream.write");
            }
            this.l.write(byteBuffer, z);
            if (z2) {
                if (android.util.Log.isLoggable("grpc-java-cronet", 2)) {
                    android.util.Log.v("grpc-java-cronet", "BidirectionalStream.flush");
                }
                this.l.flush();
            }
        }
    }

    @Override // defpackage.anup
    protected final /* synthetic */ defpackage.anur t() {
        return this.p;
    }
}
