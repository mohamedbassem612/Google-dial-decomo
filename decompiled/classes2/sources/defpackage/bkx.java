package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bkx extends aomg implements aonn {
    int a;
    final /* synthetic */ defpackage.bjz b;
    final /* synthetic */ defpackage.bgw c;
    final /* synthetic */ defpackage.bjj d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkx(defpackage.bjz bjzVar, defpackage.bjj bjjVar, defpackage.bgw bgwVar, aoln aolnVar) {
        super(aolnVar);
        this.b = bjzVar;
        this.d = bjjVar;
        this.c = bgwVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((cwc) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0057  */
    /* JADX WARN: Type inference failed for: r14v1, types: [dgk, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object objE;
        cwc cwcVar = (cwc) this.e;
        aolu aoluVar = aolu.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                aooc.af(obj);
            } else {
                aooc.af(obj);
                objE = obj;
            }
            return aojh.a;
        }
        aooc.af(obj);
        this.e = cwcVar;
        this.a = 1;
        objE = defpackage.bai.e(cwcVar, this);
        if (objE == aoluVar) {
            return aoluVar;
        }
        defpackage.bjz bjzVar = this.b;
        cvf cvfVar = (cvf) objE;
        java.util.List list = cvfVar.a;
        defpackage.cvm cvmVar = (defpackage.cvm) list.get(0);
        java.lang.Object obj2 = bjzVar.c;
        if (obj2 != null) {
            defpackage.cvm cvmVar2 = (defpackage.cvm) obj2;
            long j = cvmVar.b - cvmVar2.b;
            ?? r14 = bjzVar.b;
            if (j >= r14.c() || !defpackage.bai.d(r14, cvmVar2, cvmVar)) {
                bjzVar.a = 1;
            } else {
                bjzVar.a++;
            }
        } else {
            bjzVar.a = 1;
        }
        bjzVar.c = cvmVar;
        if (!defpackage.bld.a(cvfVar)) {
            defpackage.bgw bgwVar = this.c;
            if (bgwVar != null) {
                int i2 = bjzVar.a;
                if (i2 == 1) {
                    this.e = null;
                    this.a = 3;
                    if (defpackage.bai.f(cwcVar, bgwVar, cvfVar, this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    this.e = null;
                    this.a = 4;
                    if (defpackage.bai.g(cwcVar, bgwVar, cvfVar, i2, this) == aoluVar) {
                        return aoluVar;
                    }
                }
            }
        } else if ((cvfVar.c & 33) != 0) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (!((defpackage.cvm) list.get(i3)).c()) {
                }
            }
            defpackage.bjj bjjVar = this.d;
            this.e = null;
            this.a = 2;
            if (defpackage.bai.i(cwcVar, bjjVar, bjzVar, cvfVar, this) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.bkx bkxVar = new defpackage.bkx(this.b, this.d, this.c, aolnVar);
        bkxVar.e = obj;
        return bkxVar;
    }
}
