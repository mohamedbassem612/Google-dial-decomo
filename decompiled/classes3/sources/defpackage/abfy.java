package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abfy implements atw {
    final /* synthetic */ aoot a;
    final /* synthetic */ atw b;
    final /* synthetic */ aonj c;

    public abfy(aoot aootVar, atw atwVar, aonj aonjVar) {
        this.a = aootVar;
        this.b = atwVar;
        this.c = aonjVar;
    }

    public final /* synthetic */ java.lang.Object a(asv asvVar, float f, aoln aolnVar) {
        return b(asvVar, f, atx.a, aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(asv asvVar, float f, aonj aonjVar, aoln aolnVar) {
        defpackage.abfx abfxVar;
        if (aolnVar instanceof defpackage.abfx) {
            abfxVar = (defpackage.abfx) aolnVar;
            int i = abfxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                abfxVar.c = i - Integer.MIN_VALUE;
            } else {
                abfxVar = new defpackage.abfx(this, aolnVar);
            }
        } else {
            abfxVar = new defpackage.abfx(this, aolnVar);
        }
        java.lang.Object objB = abfxVar.a;
        aolu aoluVar = aolu.a;
        int i2 = abfxVar.c;
        if (i2 == 0) {
            aooc.af(objB);
            aoot aootVar = this.a;
            aootVar.a = null;
            aoop aoopVar = new aoop();
            atw atwVar = this.b;
            tfm tfmVar = new tfm(aoopVar, aootVar, aonjVar, this.c, 4);
            abfxVar.c = 1;
            objB = atwVar.b(asvVar, f, tfmVar, abfxVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objB);
        }
        return new java.lang.Float(((java.lang.Number) objB).floatValue());
    }
}
