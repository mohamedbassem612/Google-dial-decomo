package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aozf extends defpackage.aomh implements defpackage.aono {
    int a;
    /* synthetic */ int b;
    final /* synthetic */ defpackage.aozg c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aozf(defpackage.aozg aozgVar, defpackage.aoln aolnVar) {
        super(3, aolnVar);
        this.c = aozgVar;
    }

    @Override // defpackage.aono
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int iIntValue = ((java.lang.Number) obj2).intValue();
        defpackage.aozf aozfVar = new defpackage.aozf(this.c, (defpackage.aoln) obj3);
        aozfVar.d = (defpackage.aoxi) obj;
        aozfVar.b = iIntValue;
        return aozfVar.b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [aoxi] */
    /* JADX WARN: Type inference failed for: r9v1, types: [aoxi, java.lang.Object] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        ?? r1;
        defpackage.aoyz aoyzVar;
        ?? r2;
        defpackage.aozg aozgVar;
        ?? r3;
        defpackage.aoyz aoyzVar2;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    java.lang.Object obj2 = this.d;
                    defpackage.aooc.af(obj);
                    r1 = obj2;
                    r3 = r1;
                    if (this.c.b > 0) {
                        aoyzVar = defpackage.aoyz.b;
                        this.d = r1;
                        this.a = 3;
                        if (r1.a(aoyzVar, this) == aoluVar) {
                            r2 = r1;
                            return aoluVar;
                        }
                        r2 = r1;
                        aozgVar = this.c;
                        this.d = r2;
                        this.a = 4;
                        r3 = r2;
                        if (defpackage.aosv.j(aozgVar.b, this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                } else if (i == 3) {
                    java.lang.Object obj3 = this.d;
                    defpackage.aooc.af(obj);
                    r2 = obj3;
                    r2 = r1;
                    aozgVar = this.c;
                    this.d = r2;
                    this.a = 4;
                    r3 = r2;
                    if (defpackage.aosv.j(aozgVar.b, this) == aoluVar) {
                        return aoluVar;
                    }
                } else if (i == 4) {
                    java.lang.Object obj4 = this.d;
                    defpackage.aooc.af(obj);
                    r3 = obj4;
                }
                aoyzVar2 = defpackage.aoyz.c;
                this.d = null;
                this.a = 5;
                if (r3.a(aoyzVar2, this) == aoluVar) {
                    return aoluVar;
                }
            }
            defpackage.aooc.af(obj);
        } else {
            defpackage.aooc.af(obj);
            ?? r9 = this.d;
            if (this.b > 0) {
                defpackage.aoyz aoyzVar3 = defpackage.aoyz.a;
                this.a = 1;
                if (r9.a(aoyzVar3, this) == aoluVar) {
                    return aoluVar;
                }
            } else {
                defpackage.aozg aozgVar2 = this.c;
                this.a = 2;
                if (defpackage.aosv.j(aozgVar2.a, this) == aoluVar) {
                    return aoluVar;
                }
                r1 = r9;
                r3 = r1;
                if (this.c.b > 0) {
                    aoyzVar = defpackage.aoyz.b;
                    this.d = r1;
                    this.a = 3;
                    if (r1.a(aoyzVar, this) == aoluVar) {
                        r2 = r1;
                        return aoluVar;
                    }
                    r2 = r1;
                    aozgVar = this.c;
                    this.d = r2;
                    this.a = 4;
                    r3 = r2;
                    if (defpackage.aosv.j(aozgVar.b, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                aoyzVar2 = defpackage.aoyz.c;
                this.d = null;
                this.a = 5;
                if (r3.a(aoyzVar2, this) == aoluVar) {
                    return aoluVar;
                }
            }
        }
        return defpackage.aojh.a;
    }
}
