package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class xnl extends defpackage.xmb {
    public abstract java.lang.Object c(aoln aolnVar);

    @Override // defpackage.xmb
    public final /* bridge */ /* synthetic */ java.lang.Object eq(java.lang.Object obj, aoln aolnVar) {
        return r(aolnVar);
    }

    @Override // defpackage.xmb
    public final java.lang.Object p(defpackage.xfz xfzVar) {
        if (xfzVar.ordinal() != 1) {
            new java.lang.Integer(android.util.Log.wtf("PrecalculationTask", "Ignoring interrupt for precalculation task: " + a() + ",no handling for reason: " + xfzVar + " defined."));
        } else {
            defpackage.xkq xkqVarA = a();
            java.util.Objects.toString(xkqVarA);
            android.util.Log.i("PrecalculationTask", "Terminating stale precalculation task: ".concat(java.lang.String.valueOf(xkqVarA)));
            aosv.q(h(), (java.util.concurrent.CancellationException) null);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    protected final java.lang.Object r(aoln aolnVar) {
        defpackage.xnk xnkVar;
        if (aolnVar instanceof defpackage.xnk) {
            xnkVar = (defpackage.xnk) aolnVar;
            int i = xnkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xnkVar.c = i - Integer.MIN_VALUE;
            } else {
                xnkVar = new defpackage.xnk(this, aolnVar);
            }
        } else {
            xnkVar = new defpackage.xnk(this, aolnVar);
        }
        java.lang.Object objC = xnkVar.a;
        aolu aoluVar = aolu.a;
        int i2 = xnkVar.c;
        if (i2 == 0) {
            aooc.af(objC);
            xnkVar.c = 1;
            objC = c(xnkVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objC);
        }
        defpackage.xpa xpaVar = (defpackage.xpa) objC;
        aooh.f(xpaVar, "persistable");
        return new defpackage.xnj(xpaVar.toPersistableBundle());
    }
}
