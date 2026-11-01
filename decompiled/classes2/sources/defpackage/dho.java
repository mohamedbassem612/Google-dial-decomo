package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dho {
    public final int a;
    public float b;
    private final aonn c;

    public dho(int i, aonn aonnVar) {
        this.a = i;
        this.c = aonnVar;
    }

    public final int a(int i) {
        return aooc.w(i - aopc.i(this.b), 0, this.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(float f, aoln aolnVar) {
        defpackage.dhn dhnVar;
        if (aolnVar instanceof defpackage.dhn) {
            dhnVar = (defpackage.dhn) aolnVar;
            int i = dhnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dhnVar.c = i - Integer.MIN_VALUE;
            } else {
                dhnVar = new defpackage.dhn(this, aolnVar);
            }
        } else {
            dhnVar = new defpackage.dhn(this, aolnVar);
        }
        java.lang.Object objA = dhnVar.a;
        aolu aoluVar = aolu.a;
        int i2 = dhnVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            aonn aonnVar = this.c;
            java.lang.Float f2 = new java.lang.Float(f);
            dhnVar.c = 1;
            objA = aonnVar.a(f2, dhnVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
        }
        this.b += ((java.lang.Number) objA).floatValue();
        return aojh.a;
    }

    public final java.lang.Object c(float f, aoln aolnVar) {
        java.lang.Object objB = b(f - this.b, aolnVar);
        return objB != aolu.a ? aojh.a : objB;
    }
}
