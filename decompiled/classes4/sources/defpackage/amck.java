package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class amck implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ amck(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        int i = this.$cid;
        if (i == 0) {
            return j$.util.function.Function.-CC.$default$andThen(this, function);
        }
        if (i == 1) {
            return j$.util.function.Function.-CC.$default$andThen(this, function);
        }
        if (i == 2) {
            return j$.util.function.Function.-CC.$default$andThen(this, function);
        }
        if (i != 3) {
            return i != 4 ? j$.util.function.Function.-CC.$default$andThen(this, function) : j$.util.function.Function.-CC.$default$andThen(this, function);
        }
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return aify.n(((defpackage.amcm) this.a).a.subList(0, ((java.lang.Integer) obj).intValue() + 1));
        }
        if (i == 1) {
            return j$.time.Duration.between((j$.time.Instant) obj, ((defpackage.amcj) this.a).c.a());
        }
        if (i == 2) {
            return (java.io.InputStream) ahzq.c(new defpackage.amex((defpackage.amey) this.a, (alqd) obj, 0));
        }
        if (i == 3) {
            return (java.io.BufferedReader) ahzq.c(new defpackage.amex((defpackage.amey) this.a, (alqd) obj, 1));
        }
        if (i != 4) {
            return (defpackage.alim) ahzq.c(new afgu(this.a, (alqd) obj, 20));
        }
        return (java.io.BufferedReader) ahzq.c(new defpackage.amex((defpackage.amey) this.a, (alqd) obj, 2));
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        int i = this.$cid;
        if (i == 0) {
            return j$.util.function.Function.-CC.$default$compose(this, function);
        }
        if (i == 1) {
            return j$.util.function.Function.-CC.$default$compose(this, function);
        }
        if (i == 2) {
            return j$.util.function.Function.-CC.$default$compose(this, function);
        }
        if (i != 3) {
            return i != 4 ? j$.util.function.Function.-CC.$default$compose(this, function) : j$.util.function.Function.-CC.$default$compose(this, function);
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
