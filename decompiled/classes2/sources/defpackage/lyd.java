package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lyd implements java.util.function.Predicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;

    public /* synthetic */ lyd(long j, int i) {
        this.$cid = i;
        this.a = j;
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
        if (this.$cid != 0) {
            aimz aimzVar = lbl.a;
            if (((java.io.File) obj).lastModified() < this.a) {
                return true;
            }
        } else {
            aimz aimzVar2 = defpackage.lyi.a;
            if (((defpackage.kip) obj).c != this.a) {
                return true;
            }
        }
        return false;
    }
}
