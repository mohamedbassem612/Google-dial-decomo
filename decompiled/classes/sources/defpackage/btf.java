package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class btf extends defpackage.aomh implements defpackage.aonn {
    int a;
    final /* synthetic */ defpackage.aii b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ defpackage.avj e;
    final /* synthetic */ defpackage.ccp f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btf(defpackage.aii aiiVar, float f, boolean z, defpackage.avj avjVar, defpackage.ccp ccpVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.b = aiiVar;
        this.c = f;
        this.d = z;
        this.e = avjVar;
        this.f = ccpVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.btf) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.aolu aoluVar = defpackage.aolu.a;
        if (this.a == 0) {
            defpackage.aooc.af(obj);
            defpackage.aii aiiVar = this.b;
            float f = ((defpackage.dpi) aiiVar.c()).a;
            float f2 = this.c;
            if (java.lang.Float.compare(f, f2) != 0) {
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

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        return new defpackage.btf(this.b, this.c, this.d, this.e, this.f, aolnVar);
    }
}
