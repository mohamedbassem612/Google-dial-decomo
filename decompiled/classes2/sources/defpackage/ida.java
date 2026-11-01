package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ida implements java.util.function.Predicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ida(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            default:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate negate() {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            default:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            default:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r3v23, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return ((defpackage.iax) obj).j.equals(((defpackage.idh) this.a).a);
            case 1:
                return a.w((aonj) this.a, obj);
            case 2:
                return ((defpackage.iax) obj).j.equals(((defpackage.idh) this.a).a);
            case 3:
                return a.w((aonj) this.a, obj);
            case 4:
                return a.w((aonj) this.a, obj);
            case 5:
                if (((zms) this.a).a() != zmw.a) {
                    return false;
                }
                break;
            case 6:
                if (((java.util.concurrent.atomic.AtomicBoolean) ((defpackage.her) this.a).a).get()) {
                    return false;
                }
                break;
            case 7:
                return ((java.lang.Enum) this.a).equals((qup) obj);
            case 8:
                java.lang.Character ch = (java.lang.Character) obj;
                java.lang.String str = (java.lang.String) this.a;
                if (str.length() != 1 || !str.equals(java.lang.String.valueOf(ch))) {
                    return false;
                }
                break;
            case 9:
                return a.w((aonj) this.a, obj);
            case 10:
                return a.w((aonj) this.a, obj);
            case 11:
                if (((java.lang.Float) obj).floatValue() <= ((almj) this.a).c) {
                    return false;
                }
                break;
            default:
                return ((aigf) this.a).containsKey((alyd) obj);
        }
        return true;
    }
}
