package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class isj implements defpackage.kel {
    private final defpackage.ken a;
    private final defpackage.ker b;
    private final defpackage.kgl c;
    private final defpackage.kcq d;

    public isj(defpackage.kgl kglVar, defpackage.kcq kcqVar) {
        if (kglVar == null) {
            defpackage.aooh.i("beeslySot");
        }
        this.c = kglVar;
        this.d = kcqVar;
        this.a = defpackage.ken.BEESLY;
        defpackage.isq isqVar = defpackage.isq.a;
        defpackage.albn albnVarM = defpackage.alad.M(defpackage.isq.class);
        defpackage.aooh.e(albnVarM, "parser(...)");
        this.b = new defpackage.ker(albnVarM);
    }

    @Override // defpackage.kes
    public final /* synthetic */ java.lang.Object a() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [aolu] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    @Override // defpackage.kes
    public final java.lang.Object b(java.util.List list, defpackage.aoln aolnVar) {
        isi isiVar;
        ?? r5;
        if (aolnVar instanceof isi) {
            isiVar = (isi) aolnVar;
            int i = isiVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                isiVar.d = i - Integer.MIN_VALUE;
            } else {
                isiVar = new isi(this, aolnVar);
            }
        } else {
            isiVar = new isi(this, aolnVar);
        }
        java.lang.Object objO = isiVar.b;
        ?? arrayList = defpackage.aolu.a;
        int i2 = isiVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(objO);
            defpackage.kgl kglVar = this.c;
            isiVar.a = list;
            isiVar.d = 1;
            objO = kglVar.o(isiVar);
            if (objO != arrayList) {
            }
            r5 = list;
            return arrayList;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        java.lang.Object obj = isiVar.a;
        defpackage.aooc.af(objO);
        r5 = obj;
        r5 = list;
        java.util.Map map = (java.util.Map) objO;
        arrayList = new java.util.ArrayList(defpackage.ajsz.bl(r5, 10));
        java.util.Iterator it = r5.iterator();
        while (it.hasNext()) {
            arrayList.add(defpackage.kcq.B((itc) map.get(new ity(((kdy) it.next()).b))));
        }
        r5 = list;
        return arrayList;
    }

    @Override // defpackage.kel
    public final /* synthetic */ boolean c(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.aooh.f((defpackage.isq) obj, "data1");
        return false;
    }

    @Override // defpackage.kes
    public final defpackage.ker d() {
        return this.b;
    }
}
