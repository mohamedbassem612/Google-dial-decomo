package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jdb implements lzj {
    private final lzk a;
    private final ker b;
    private final kgl c;
    private final kcq d;

    public jdb(kgl kglVar, kcq kcqVar) {
        aooh.f(kglVar, "beeslySot");
        this.c = kglVar;
        this.d = kcqVar;
        this.a = lzk.c;
        isq isqVar = isq.a;
        albn albnVarM = alad.M(isq.class);
        aooh.e(albnVarM, "parser(...)");
        this.b = new ker(albnVarM);
    }

    public final /* synthetic */ java.lang.Object a() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    public final java.lang.Object b(java.util.List list, aoln aolnVar) {
        defpackage.jda jdaVar;
        ?? r5;
        if (aolnVar instanceof defpackage.jda) {
            jdaVar = (defpackage.jda) aolnVar;
            int i = jdaVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jdaVar.d = i - Integer.MIN_VALUE;
            } else {
                jdaVar = new defpackage.jda(this, aolnVar);
            }
        } else {
            jdaVar = new defpackage.jda(this, aolnVar);
        }
        java.lang.Object objO = jdaVar.b;
        java.util.ArrayList arrayList = aolu.a;
        int i2 = jdaVar.d;
        if (i2 == 0) {
            aooc.af(objO);
            kgl kglVar = this.c;
            jdaVar.a = list;
            jdaVar.d = 1;
            objO = kglVar.o(jdaVar);
            if (objO != arrayList) {
            }
            r5 = list;
            return arrayList;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        java.lang.Object obj = jdaVar.a;
        aooc.af(objO);
        r5 = obj;
        r5 = list;
        java.util.Map map = (java.util.Map) objO;
        arrayList = new java.util.ArrayList(ajsz.bl((java.lang.Iterable) r5, 10));
        java.util.Iterator it = r5.iterator();
        while (it.hasNext()) {
            arrayList.add(kcq.B((defpackage.itc) map.get(new defpackage.ity(((defpackage.kip) it.next()).d))));
        }
        r5 = list;
        return arrayList;
    }

    public final ker d() {
        return this.b;
    }
}
