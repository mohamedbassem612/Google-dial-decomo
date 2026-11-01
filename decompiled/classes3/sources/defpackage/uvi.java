package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class uvi implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ uvi(java.lang.Object obj, long j, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = j;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? j$.util.function.Function.-CC.$default$andThen(this, function) : j$.util.function.Function.-CC.$default$andThen(this, function);
        }
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.uvk uvkVar = (defpackage.uvk) this.b;
            defpackage.utx utxVar = (defpackage.utx) ((aoin) uvkVar.d.k().get((defpackage.uty) obj)).a();
            long j = this.a;
            return ahrv.g(utxVar.e(j)).i(new jwi(utxVar, j, 11), uvkVar.b);
        }
        if (i == 1) {
            defpackage.utx utxVar2 = (defpackage.utx) ((aoin) obj).a();
            long j2 = this.a;
            return ahrv.g(utxVar2.e(j2)).i(new jwi(utxVar2, j2, 10), (java.util.concurrent.Executor) ((defpackage.ulw) this.b).c);
        }
        defpackage.uty utyVar = (defpackage.uty) obj;
        return ((defpackage.utx) ((aoin) ((zzx) ((defpackage.zlr) this.b).a).k().get(utyVar)).a()).d(this.a, utyVar.name());
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? j$.util.function.Function.-CC.$default$compose(this, function) : j$.util.function.Function.-CC.$default$compose(this, function);
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
