package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class aidj implements java.util.function.BinaryOperator {
    private final /* synthetic */ int $cid;

    public /* synthetic */ aidj(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
        int i = this.$cid;
        if (i == 0) {
            return j$.util.function.BiFunction.-CC.$default$andThen(this, function);
        }
        if (i != 1) {
            return i != 2 ? j$.util.function.BiFunction.-CC.$default$andThen(this, function) : j$.util.function.BiFunction.-CC.$default$andThen(this, function);
        }
        return j$.util.function.BiFunction.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Iterable, java.lang.Object] */
    @Override // java.util.function.BiFunction
    public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.aift aiftVar = (defpackage.aift) obj;
            defpackage.aift aiftVar2 = (defpackage.aift) obj2;
            aiftVar.a(aiftVar2.a, aiftVar2.b);
            return aiftVar;
        }
        if (i == 1) {
            uzx uzxVar = (uzx) obj;
            java.util.Iterator it = ((uzx) obj2).a.iterator();
            while (it.hasNext()) {
                uzxVar.aL((aikb) it.next());
            }
            return uzxVar;
        }
        if (i != 2) {
            defpackage.aigb aigbVar = (defpackage.aigb) obj;
            aigbVar.h((defpackage.aigb) obj2);
            return aigbVar;
        }
        defpackage.aihb aihbVar = (defpackage.aihb) obj;
        aihbVar.l((defpackage.aihb) obj2);
        return aihbVar;
    }
}
