package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iqh implements iqj {
    final /* synthetic */ aonj a;

    public iqh(aonj aonjVar) {
        this.a = aonjVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(albh albhVar, aoln aolnVar) {
        defpackage.iqg iqgVar;
        if (aolnVar instanceof defpackage.iqg) {
            iqgVar = (defpackage.iqg) aolnVar;
            int i = iqgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iqgVar.c = i - Integer.MIN_VALUE;
            } else {
                iqgVar = new defpackage.iqg(this, aolnVar);
            }
        } else {
            iqgVar = new defpackage.iqg(this, aolnVar);
        }
        java.lang.Object obj = iqgVar.a;
        aolu aoluVar = aolu.a;
        int i2 = iqgVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            ajcq ajcqVar = (ajcq) this.a.a(albhVar);
            iqgVar.c = 1;
            if (aosv.D(ajcqVar, iqgVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }
}
