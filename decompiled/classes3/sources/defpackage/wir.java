package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wir implements java.util.function.Predicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ char a;

    public /* synthetic */ wir(char c, int i) {
        this.$cid = i;
        this.a = c;
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        return this.$cid != 0 ? j$.util.function.Predicate.-CC.$default$and(this, predicate) : j$.util.function.Predicate.-CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate negate() {
        return this.$cid != 0 ? j$.util.function.Predicate.-CC.$default$negate(this) : j$.util.function.Predicate.-CC.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        return this.$cid != 0 ? j$.util.function.Predicate.-CC.$default$or(this, predicate) : j$.util.function.Predicate.-CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        return this.$cid != 0 ? ((java.lang.Character) obj).equals(java.lang.Character.valueOf(this.a)) : ((java.lang.Character) obj).equals(java.lang.Character.valueOf(this.a));
    }
}
