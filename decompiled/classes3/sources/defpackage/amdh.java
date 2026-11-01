package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class amdh implements java.util.function.Predicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ amdh(int i, int i2, int i3) {
        this.$cid = i3;
        this.a = i;
        this.b = i2;
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? j$.util.function.Predicate.-CC.$default$and(this, predicate) : j$.util.function.Predicate.-CC.$default$and(this, predicate);
        }
        return j$.util.function.Predicate.-CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate negate() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? j$.util.function.Predicate.-CC.$default$negate(this) : j$.util.function.Predicate.-CC.$default$negate(this);
        }
        return j$.util.function.Predicate.-CC.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? j$.util.function.Predicate.-CC.$default$or(this, predicate) : j$.util.function.Predicate.-CC.$default$or(this, predicate);
        }
        return j$.util.function.Predicate.-CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.alif alifVar = ((alig) obj).b;
            if (alifVar.a >= this.a) {
                if (alifVar.b <= this.b) {
                    return true;
                }
            }
        } else if (i != 1) {
            defpackage.alif alifVar2 = ((alig) obj).b;
            if (alifVar2.a >= this.a) {
                if (alifVar2.b <= this.b) {
                    return true;
                }
            }
        } else {
            android.util.Size size = (android.util.Size) obj;
            aimz aimzVar = defpackage.pvf.a;
            if (size.getWidth() <= this.a) {
                if (size.getHeight() <= this.b) {
                    return true;
                }
            }
        }
        return false;
    }
}
