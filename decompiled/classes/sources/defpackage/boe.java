package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class boe extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ defpackage.aii b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ defpackage.avj e;
    final /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public boe(defpackage.aii aiiVar, float f, boolean z, defpackage.avj avjVar, defpackage.ccp ccpVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = aiiVar;
        this.c = f;
        this.d = z;
        this.e = avjVar;
        this.f = ccpVar;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return ((defpackage.boe) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        return ((defpackage.boe) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [ccp, java.lang.Object] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.avj avbVar;
        if (this.$cid == 0) {
            defpackage.aolu aoluVar = defpackage.aolu.a;
            if (this.a == 0) {
                defpackage.aooc.af(obj);
                defpackage.aii aiiVar = this.b;
                float f = ((defpackage.dpi) aiiVar.c()).a;
                float f2 = this.c;
                if (!defpackage.dpi.c(f, f2)) {
                    if (this.d) {
                        defpackage.avj avjVar = (defpackage.avj) this.f.a();
                        defpackage.avj avjVar2 = this.e;
                        this.a = 2;
                        if (byl.a(aiiVar, f2, avjVar, avjVar2, this) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        defpackage.dpi dpiVar = new defpackage.dpi(f2);
                        this.a = 1;
                        if (aiiVar.f(dpiVar, this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                }
                return defpackage.aojh.a;
            }
            defpackage.aooc.af(obj);
            this.f.b(this.e);
            return defpackage.aojh.a;
        }
        defpackage.aolu aoluVar2 = defpackage.aolu.a;
        if (this.a != 0) {
            defpackage.aooc.af(obj);
        } else {
            defpackage.aooc.af(obj);
            defpackage.aii aiiVar2 = this.b;
            float f3 = ((defpackage.dpi) aiiVar2.c()).a;
            float f4 = this.c;
            if (!defpackage.dpi.c(f3, f4)) {
                if (this.d) {
                    float f5 = ((defpackage.dpi) aiiVar2.c()).a;
                    if (defpackage.dpi.c(f5, 0.0f)) {
                        avbVar = new defpackage.avl(0L);
                    } else if (defpackage.dpi.c(f5, 1.0f)) {
                        avbVar = new defpackage.avh();
                    } else if (defpackage.dpi.c(f5, 0.0f)) {
                        avbVar = new defpackage.avd();
                    } else {
                        avbVar = defpackage.dpi.c(f5, 6.0f) ? new defpackage.avb() : null;
                    }
                    defpackage.avj avjVar3 = this.e;
                    this.a = 2;
                    if (byl.a(aiiVar2, f4, avbVar, avjVar3, this) == aoluVar2) {
                        return aoluVar2;
                    }
                } else {
                    defpackage.dpi dpiVar2 = new defpackage.dpi(f4);
                    this.a = 1;
                    if (aiiVar2.f(dpiVar2, this) == aoluVar2) {
                        return aoluVar2;
                    }
                }
            }
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [ccp, java.lang.Object] */
    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        if (this.$cid == 0) {
            return new defpackage.boe(this.b, this.c, this.d, this.e, (defpackage.ccp) this.f, aolnVar, 0);
        }
        return new defpackage.boe(this.b, this.c, this.d, (defpackage.bnx) this.f, this.e, aolnVar, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public boe(defpackage.aii aiiVar, float f, boolean z, defpackage.bnx bnxVar, defpackage.avj avjVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = aiiVar;
        this.c = f;
        this.d = z;
        this.f = bnxVar;
        this.e = avjVar;
    }
}
