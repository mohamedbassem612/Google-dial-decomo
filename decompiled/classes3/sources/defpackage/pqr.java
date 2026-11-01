package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pqr implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;

    public /* synthetic */ pqr(boolean z, int i) {
        this.$cid = i;
        this.a = z;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return this.$cid != 0 ? j$.util.function.Function.-CC.$default$andThen(this, function) : j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [aoss, java.lang.Object] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        if (this.$cid != 0) {
            izg izgVar = (izg) obj;
            return aosv.F((aoss) izgVar.c, 0, new jbu(izgVar, this.a, (aoln) null, 1), 3);
        }
        java.lang.String str = (java.lang.String) obj;
        if (this.a) {
            defpackage.pqv.a.b().l("com/android/dialer/incall/core/call/CallProducerModule", "produceFirstForwardedNumber", 340, "CallProducerModule.java").y("getForwardedNumbersList result (CallExtras): %s", str);
        }
        return str;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return this.$cid != 0 ? j$.util.function.Function.-CC.$default$compose(this, function) : j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
