package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aozp implements defpackage.aoyt {
    private final defpackage.aoyt a;
    private final defpackage.aonn b;

    public aozp(defpackage.aoyt aoytVar, defpackage.aonn aonnVar) {
        this.a = aoytVar;
        this.b = aonnVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.aoyt, defpackage.aoxh
    public final java.lang.Object fM(defpackage.aoxi aoxiVar, defpackage.aoln aolnVar) {
        defpackage.aozo aozoVar;
        if (aolnVar instanceof defpackage.aozo) {
            aozoVar = (defpackage.aozo) aolnVar;
            int i = aozoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aozoVar.c = i - Integer.MIN_VALUE;
            } else {
                aozoVar = new defpackage.aozo(this, aolnVar);
            }
        } else {
            aozoVar = new defpackage.aozo(this, aolnVar);
        }
        java.lang.Object obj = aozoVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aozoVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.aoyt aoytVar = this.a;
            defpackage.aozn aoznVar = new defpackage.aozn(aoxiVar, this.b);
            aozoVar.c = 1;
            if (defpackage.aoyw.g((defpackage.aoyw) aoytVar, aoznVar, aozoVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        throw new defpackage.aoiq();
    }
}
