package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gay implements aoxh {
    final /* synthetic */ aoxh a;
    final /* synthetic */ int b;

    public gay(aoxh aoxhVar, int i) {
        this.a = aoxhVar;
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object fM(aoxi aoxiVar, aoln aolnVar) {
        defpackage.gav gavVar;
        if (aolnVar instanceof defpackage.gav) {
            gavVar = (defpackage.gav) aolnVar;
            int i = gavVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                gavVar.b = i - Integer.MIN_VALUE;
            } else {
                gavVar = new defpackage.gav(this, aolnVar);
            }
        } else {
            gavVar = new defpackage.gav(this, aolnVar);
        }
        java.lang.Object obj = gavVar.a;
        aolu aoluVar = aolu.a;
        int i2 = gavVar.b;
        if (i2 == 0) {
            aooc.af(obj);
            aoxh aoxhVar = this.a;
            defpackage.gax gaxVar = new defpackage.gax(aoxiVar, this.b);
            gavVar.d = null;
            gavVar.e = null;
            gavVar.f = null;
            gavVar.b = 1;
            if (aoxhVar.fM(gaxVar, gavVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj2 = gavVar.f;
            java.lang.Object obj3 = gavVar.e;
            java.lang.Object obj4 = gavVar.d;
            aooc.af(obj);
        }
        return aojh.a;
    }
}
