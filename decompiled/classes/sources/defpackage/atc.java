package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class atc {
    public static final defpackage.asv a = new defpackage.asy();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object a(defpackage.ato atoVar, long j, defpackage.aoln aolnVar) {
        asz aszVar;
        aooq aooqVar;
        defpackage.ato atoVar2;
        if (aolnVar instanceof asz) {
            aszVar = (asz) aolnVar;
            int i = aszVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aszVar.b = i - Integer.MIN_VALUE;
            } else {
                aszVar = new asz(aolnVar);
            }
        } else {
            aszVar = new asz(aolnVar);
        }
        java.lang.Object obj = aszVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aszVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            aooqVar = new aooq();
            aoc aocVar = aoc.a;
            atb atbVar = new atb(atoVar, j, aooqVar, (defpackage.aoln) null);
            aszVar.c = atoVar;
            aszVar.d = aooqVar;
            aszVar.b = 1;
            if (atoVar.i(aocVar, atbVar, aszVar) == aoluVar) {
                return aoluVar;
            }
            atoVar2 = atoVar;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooq aooqVar2 = aszVar.d;
            defpackage.ato atoVar3 = aszVar.c;
            defpackage.aooc.af(obj);
            aooqVar = aooqVar2;
            atoVar2 = atoVar3;
        }
        return new defpackage.cpm(atoVar2.f(aooqVar.a));
    }
}
