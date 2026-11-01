package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jqr implements lzj {
    private final lzk a;
    private final ker b;
    private final kgl c;

    public jqr(kgl kglVar) {
        aooh.f(kglVar, "stirShakenStorage");
        this.c = kglVar;
        this.a = lzk.d;
        defpackage.jqp jqpVar = defpackage.jqp.a;
        albn albnVarM = alad.M(defpackage.jqp.class);
        aooh.e(albnVarM, "parser(...)");
        this.b = new ker(albnVarM);
    }

    public final /* synthetic */ java.lang.Object a() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    public final java.lang.Object b(java.util.List list, aoln aolnVar) {
        defpackage.jqq jqqVar;
        ?? r5;
        defpackage.jqp jqpVarH;
        if (aolnVar instanceof defpackage.jqq) {
            jqqVar = (defpackage.jqq) aolnVar;
            int i = jqqVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jqqVar.d = i - Integer.MIN_VALUE;
            } else {
                jqqVar = new defpackage.jqq(this, aolnVar);
            }
        } else {
            jqqVar = new defpackage.jqq(this, aolnVar);
        }
        java.lang.Object objF = jqqVar.b;
        java.util.ArrayList arrayList = aolu.a;
        int i2 = jqqVar.d;
        if (i2 == 0) {
            aooc.af(objF);
            kgl kglVar = this.c;
            jqqVar.a = list;
            jqqVar.d = 1;
            objF = kglVar.f(jqqVar);
            if (objF != arrayList) {
            }
            r5 = list;
            return arrayList;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        java.lang.Object obj = jqqVar.a;
        aooc.af(objF);
        r5 = obj;
        r5 = list;
        java.util.Map map = (java.util.Map) objF;
        arrayList = new java.util.ArrayList(ajsz.bl((java.lang.Iterable) r5, 10));
        java.util.Iterator it = r5.iterator();
        while (it.hasNext()) {
            ztf ztfVar = (ztf) map.get(new java.lang.Long(((defpackage.kip) it.next()).d));
            if (ztfVar != null) {
                defpackage.ni niVarP = defpackage.hhv.p(defpackage.jqp.a.m());
                niVarP.I(ztfVar);
                jqpVarH = niVarP.H();
            } else {
                jqpVarH = null;
            }
            arrayList.add(jqpVarH);
        }
        r5 = list;
        return arrayList;
    }

    public final ker d() {
        return this.b;
    }
}
