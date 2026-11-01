package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gax implements aoxi {
    final /* synthetic */ aoxi a;
    final /* synthetic */ int b;

    public gax(aoxi aoxiVar, int i) {
        this.a = aoxiVar;
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(java.lang.Object obj, aoln aolnVar) {
        defpackage.gaw gawVar;
        if (aolnVar instanceof defpackage.gaw) {
            gawVar = (defpackage.gaw) aolnVar;
            int i = gawVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                gawVar.b = i - Integer.MIN_VALUE;
            } else {
                gawVar = new defpackage.gaw(this, aolnVar);
            }
        } else {
            gawVar = new defpackage.gaw(this, aolnVar);
        }
        java.lang.Object obj2 = gawVar.a;
        aolu aoluVar = aolu.a;
        int i2 = gawVar.b;
        if (i2 == 0) {
            aooc.af(obj2);
            aoxi aoxiVar = this.a;
            fzs fzsVar = new fzs(this.b, (gds) obj);
            gawVar.c = null;
            gawVar.e = null;
            gawVar.f = null;
            gawVar.g = null;
            gawVar.b = 1;
            if (aoxiVar.a(fzsVar, gawVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj3 = gawVar.g;
            java.lang.Object obj4 = gawVar.f;
            java.lang.Object obj5 = gawVar.e;
            java.lang.Object obj6 = gawVar.c;
            aooc.af(obj2);
        }
        return aojh.a;
    }
}
