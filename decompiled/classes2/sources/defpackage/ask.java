package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class ask {
    public final aonn c;
    public dpf d;
    public boolean e;
    public final ato f;
    public final vx g = new vx((byte[]) null, (byte[]) null);

    public ask(ato atoVar, aonn aonnVar, dpf dpfVar) {
        this.f = atoVar;
        this.c = aonnVar;
        this.d = dpfVar;
    }

    public static final void n(cvf cvfVar) {
        java.util.List list = cvfVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.cvm) list.get(i)).b();
        }
    }

    protected abstract boolean f(cvf cvfVar);

    protected abstract boolean j(cvf cvfVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object m(aonn aonnVar, aoln aolnVar) {
        defpackage.asj asjVar;
        if (aolnVar instanceof defpackage.asj) {
            asjVar = (defpackage.asj) aolnVar;
            int i = asjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                asjVar.c = i - Integer.MIN_VALUE;
            } else {
                asjVar = new defpackage.asj(this, aolnVar);
            }
        } else {
            asjVar = new defpackage.asj(this, aolnVar);
        }
        java.lang.Object obj = asjVar.a;
        aolu aoluVar = aolu.a;
        int i2 = asjVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            this.e = true;
            defpackage.amg amgVar = new defpackage.amg(this, aonnVar, (aoln) null, 11);
            asjVar.c = 1;
            if (aooh.O(amgVar, asjVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        this.e = false;
        return aojh.a;
    }

    public final void o(cvf cvfVar, defpackage.cvg cvgVar) {
        java.util.List list = cvfVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((defpackage.cvm) list.get(i)).c()) {
                return;
            }
        }
        if (f(cvfVar)) {
            if (cvgVar == defpackage.cvg.a && this.e) {
                j(cvfVar);
                n(cvfVar);
            }
            if (cvgVar == defpackage.cvg.b && !this.e && j(cvfVar)) {
                n(cvfVar);
            }
        }
    }
}
