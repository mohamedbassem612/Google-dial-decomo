package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xwy implements defpackage.xxe {
    public final boolean a;
    private final defpackage.xxe b;
    private final defpackage.xwx c;
    private final defpackage.xuo d;
    private int e;
    private boolean f;

    public xwy(defpackage.xxe xxeVar, boolean z, defpackage.xuo xuoVar, defpackage.xwx xwxVar) {
        anty.aI(xxeVar, "Argument must not be null");
        this.b = xxeVar;
        this.a = z;
        this.d = xuoVar;
        anty.aI(xwxVar, "Argument must not be null");
        this.c = xwxVar;
    }

    @Override // defpackage.xxe
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.xxe
    public final java.lang.Class b() {
        return this.b.b();
    }

    @Override // defpackage.xxe
    public final java.lang.Object c() {
        return this.b.c();
    }

    public final synchronized void d() {
        if (this.f) {
            throw new java.lang.IllegalStateException("Cannot acquire a recycled resource");
        }
        this.e++;
    }

    @Override // defpackage.xxe
    public final synchronized void e() {
        if (this.e > 0) {
            throw new java.lang.IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f) {
            throw new java.lang.IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f = true;
        this.b.e();
    }

    public final void f() {
        int i;
        synchronized (this) {
            int i2 = this.e;
            if (i2 <= 0) {
                throw new java.lang.IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            i = i2 - 1;
            this.e = i;
        }
        if (i == 0) {
            defpackage.xwx xwxVar = this.c;
            defpackage.xuo xuoVar = this.d;
            defpackage.xwq xwqVar = (defpackage.xwq) xwxVar;
            xwqVar.c.d(xuoVar);
            if (this.a) {
                xwqVar.d.d(xuoVar, this);
            } else {
                xwqVar.e.f(this, false);
            }
        }
    }

    public final synchronized boolean g() {
        if (this.e == 0) {
            return false;
        }
        d();
        return true;
    }

    public final synchronized java.lang.String toString() {
        defpackage.xxe xxeVar;
        defpackage.xuo xuoVar;
        xxeVar = this.b;
        xuoVar = this.d;
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.c.toString() + ", key=" + java.lang.String.valueOf(xuoVar) + ", acquired=" + this.e + ", isRecycled=" + this.f + ", resource=" + xxeVar.toString() + '}';
    }
}
