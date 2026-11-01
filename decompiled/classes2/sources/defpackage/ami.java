package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ami extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ aoub c;
    final /* synthetic */ long d;
    final /* synthetic */ kaw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ami(aoub aoubVar, long j, kaw kawVar, aoln aolnVar) {
        super(2, aolnVar);
        this.c = aoubVar;
        this.d = j;
        this.e = kawVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [avj] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final java.lang.Object b(java.lang.Object obj) {
        ?? r1;
        kaw kawVar;
        aolu aoluVar = aolu.a;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                aooc.af(obj);
            } else if (i != 2) {
                aooc.af(obj);
            } else {
                java.lang.Object obj2 = this.a;
                aooc.af(obj);
                r1 = obj2;
                kawVar = this.e;
                this.a = null;
                this.b = 3;
                if (kawVar.av((avj) r1, this) == aoluVar) {
                    return aoluVar;
                }
            }
            return aojh.a;
        }
        aooc.af(obj);
        aoub aoubVar = this.c;
        this.b = 1;
        if (aoubVar.n(this) == aoluVar) {
            return aoluVar;
        }
        avl avlVar = new avl(this.d);
        defpackage.avm avmVar = new defpackage.avm(avlVar);
        kaw kawVar2 = this.e;
        this.a = avmVar;
        this.b = 2;
        r1 = avmVar;
        if (kawVar2.av(avlVar, this) == aoluVar) {
            return aoluVar;
        }
        kawVar = this.e;
        this.a = null;
        this.b = 3;
        if (kawVar.av((avj) r1, this) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.ami(this.c, this.d, this.e, aolnVar);
    }
}
