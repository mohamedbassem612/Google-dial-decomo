package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bpq {
    public float a;
    public float b;
    public float c;
    public float d;
    public final aii e;
    private avj f;
    private avj g;

    public bpq(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = new aii(new dpi(f), alo.c, (java.lang.Object) null, "Animatable");
    }

    private final float c(avj avjVar) {
        if (avjVar instanceof avl) {
            return this.b;
        }
        if (avjVar instanceof avh) {
            return this.c;
        }
        return avjVar instanceof avd ? this.d : this.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object a(avj avjVar, aoln aolnVar) {
        defpackage.bpo bpoVar;
        if (aolnVar instanceof defpackage.bpo) {
            bpoVar = (defpackage.bpo) aolnVar;
            int i = bpoVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bpoVar.d = i - Integer.MIN_VALUE;
            } else {
                bpoVar = new defpackage.bpo(this, aolnVar);
            }
        } else {
            bpoVar = new defpackage.bpo(this, aolnVar);
        }
        java.lang.Object obj = bpoVar.b;
        aolu aoluVar = aolu.a;
        int i2 = bpoVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                float fC = c(avjVar);
                this.g = avjVar;
                aii aiiVar = this.e;
                avjVar = avjVar;
                if (!dpi.c(((dpi) aiiVar.c()).a, fC)) {
                    avj avjVar2 = this.f;
                    bpoVar.a = avjVar;
                    bpoVar.d = 1;
                    if (defpackage.byl.a(aiiVar, fC, avjVar2, avjVar, bpoVar) == aoluVar) {
                        avjVar = avjVar;
                        return aoluVar;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj2 = bpoVar.a;
                aooc.af(obj);
                avjVar = obj2;
            }
            avjVar = avjVar;
            this.f = avjVar;
            return aojh.a;
        } catch (java.lang.Throwable th) {
            this.f = avjVar;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.bpp bppVar;
        if (aolnVar instanceof defpackage.bpp) {
            bppVar = (defpackage.bpp) aolnVar;
            int i = bppVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bppVar.c = i - Integer.MIN_VALUE;
            } else {
                bppVar = new defpackage.bpp(this, aolnVar);
            }
        } else {
            bppVar = new defpackage.bpp(this, aolnVar);
        }
        java.lang.Object obj = bppVar.a;
        aolu aoluVar = aolu.a;
        int i2 = bppVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                float fC = c(this.g);
                aii aiiVar = this.e;
                if (!dpi.c(((dpi) aiiVar.c()).a, fC)) {
                    dpi dpiVar = new dpi(fC);
                    bppVar.c = 1;
                    if (aiiVar.f(dpiVar, bppVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
            this.f = this.g;
            return aojh.a;
        } catch (java.lang.Throwable th) {
            this.f = this.g;
            throw th;
        }
    }
}
