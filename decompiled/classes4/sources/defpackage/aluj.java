package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class aluj implements java.util.function.BiPredicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ aluj(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.BiPredicate
    public final /* synthetic */ java.util.function.BiPredicate and(java.util.function.BiPredicate biPredicate) {
        return this.$cid != 0 ? j$.util.function.BiPredicate.-CC.$default$and(this, biPredicate) : j$.util.function.BiPredicate.-CC.$default$and(this, biPredicate);
    }

    @Override // java.util.function.BiPredicate
    public final /* synthetic */ java.util.function.BiPredicate negate() {
        return this.$cid != 0 ? j$.util.function.BiPredicate.-CC.$default$negate(this) : j$.util.function.BiPredicate.-CC.$default$negate(this);
    }

    @Override // java.util.function.BiPredicate
    public final /* synthetic */ java.util.function.BiPredicate or(java.util.function.BiPredicate biPredicate) {
        return this.$cid != 0 ? j$.util.function.BiPredicate.-CC.$default$or(this, biPredicate) : j$.util.function.BiPredicate.-CC.$default$or(this, biPredicate);
    }

    @Override // java.util.function.BiPredicate
    public final boolean test(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid == 0) {
            defpackage.alyi alyiVar = (defpackage.alyi) obj;
            defpackage.alyi alyiVar2 = (defpackage.alyi) obj2;
            if (!alyiVar.d.equals(alyiVar2.d)) {
                return false;
            }
            if (((defpackage.aluk) this.a).h()) {
                int iAN = a.aN(alyiVar.e);
                if (iAN == 0) {
                    iAN = 1;
                }
                int iAN2 = a.aN(alyiVar2.e);
                if (iAN2 == 0) {
                    iAN2 = 1;
                }
                if (iAN != iAN2) {
                    return false;
                }
            }
        } else if (((java.lang.Integer) obj2).intValue() - ((java.lang.Integer) obj).intValue() < ((defpackage.alty) this.a).b - 1) {
            return false;
        }
        return true;
    }
}
