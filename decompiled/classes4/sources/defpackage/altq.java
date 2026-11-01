package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class altq implements java.util.function.IntPredicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ altq(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ java.util.function.IntPredicate and(java.util.function.IntPredicate intPredicate) {
        int i = this.$cid;
        if (i == 0) {
            return j$.util.function.IntPredicate.-CC.$default$and(this, intPredicate);
        }
        if (i == 1) {
            return j$.util.function.IntPredicate.-CC.$default$and(this, intPredicate);
        }
        if (i == 2) {
            return j$.util.function.IntPredicate.-CC.$default$and(this, intPredicate);
        }
        if (i == 3) {
            return j$.util.function.IntPredicate.-CC.$default$and(this, intPredicate);
        }
        if (i != 4) {
            return i != 5 ? j$.util.function.IntPredicate.-CC.$default$and(this, intPredicate) : j$.util.function.IntPredicate.-CC.$default$and(this, intPredicate);
        }
        return j$.util.function.IntPredicate.-CC.$default$and(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ java.util.function.IntPredicate negate() {
        int i = this.$cid;
        if (i == 0) {
            return j$.util.function.IntPredicate.-CC.$default$negate(this);
        }
        if (i == 1) {
            return j$.util.function.IntPredicate.-CC.$default$negate(this);
        }
        if (i == 2) {
            return j$.util.function.IntPredicate.-CC.$default$negate(this);
        }
        if (i == 3) {
            return j$.util.function.IntPredicate.-CC.$default$negate(this);
        }
        if (i != 4) {
            return i != 5 ? j$.util.function.IntPredicate.-CC.$default$negate(this) : j$.util.function.IntPredicate.-CC.$default$negate(this);
        }
        return j$.util.function.IntPredicate.-CC.$default$negate(this);
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ java.util.function.IntPredicate or(java.util.function.IntPredicate intPredicate) {
        int i = this.$cid;
        if (i == 0) {
            return j$.util.function.IntPredicate.-CC.$default$or(this, intPredicate);
        }
        if (i == 1) {
            return j$.util.function.IntPredicate.-CC.$default$or(this, intPredicate);
        }
        if (i == 2) {
            return j$.util.function.IntPredicate.-CC.$default$or(this, intPredicate);
        }
        if (i == 3) {
            return j$.util.function.IntPredicate.-CC.$default$or(this, intPredicate);
        }
        if (i != 4) {
            return i != 5 ? j$.util.function.IntPredicate.-CC.$default$or(this, intPredicate) : j$.util.function.IntPredicate.-CC.$default$or(this, intPredicate);
        }
        return j$.util.function.IntPredicate.-CC.$default$or(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        int i2 = this.$cid;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.alnb alnbVarB = defpackage.alnb.b(((defpackage.almz) ((aify) this.a).get(i)).c);
                if (alnbVarB == null) {
                    alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
                }
                return alnbVarB.equals(defpackage.alnb.EVENT_SAY);
            }
            if (i2 == 2) {
                aify aifyVar = (aify) this.a;
                if (((java.lang.Integer) aifyVar.get(i)).intValue() != 1) {
                    return false;
                }
                if (i != 0 && ((java.lang.Integer) aifyVar.get(i - 1)).intValue() != 0) {
                    return false;
                }
            } else {
                if (i2 != 3) {
                    if (i2 == 4) {
                        java.lang.Object obj = this.a;
                        akzm akzmVar = defpackage.amcy.a;
                        return ambr.b((defpackage.amfu) obj, i);
                    }
                    java.lang.Object obj2 = this.a;
                    if (i2 != 5) {
                        akzm akzmVar2 = defpackage.amfd.a;
                        return ambr.b((defpackage.amfu) obj2, i);
                    }
                    j$.time.Duration duration = defpackage.amfa.a;
                    return ambr.b((defpackage.amfu) obj2, i);
                }
                aify aifyVar2 = (aify) this.a;
                if (((java.lang.Integer) aifyVar2.get(i)).intValue() != 1) {
                    return false;
                }
                if (i != aifyVar2.size() - 1 && ((java.lang.Integer) aifyVar2.get(i + 1)).intValue() != 0) {
                    return false;
                }
            }
        } else if (((alqn) ((defpackage.alqq) this.a).d.get(i)).d <= 0.99d) {
            return false;
        }
        return true;
    }
}
