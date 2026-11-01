package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class amer implements java.util.function.Function {
    private final /* synthetic */ int $cid;

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        int i = this.$cid;
        if (i == 0) {
            return j$.util.function.Function.-CC.$default$andThen(this, function);
        }
        if (i == 1) {
            return j$.util.function.Function.-CC.$default$andThen(this, function);
        }
        if (i != 2) {
            return i != 3 ? j$.util.function.Function.-CC.$default$andThen(this, function) : j$.util.function.Function.-CC.$default$andThen(this, function);
        }
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            aimz aimzVar = defpackage.amev.a;
            return (java.lang.String) ((java.util.List) obj).get(0);
        }
        if (i == 1) {
            aimz aimzVar2 = defpackage.amev.a;
            return ((java.lang.String) obj).replaceAll("^[., ]+", "").replaceAll("[., ]+$", "");
        }
        if (i != 2) {
            return i != 3 ? java.util.regex.Pattern.quote((java.lang.String) obj) : defpackage.amev.b.j(defpackage.amev.m((java.lang.String) obj));
        }
        java.lang.String str = (java.lang.String) obj;
        aimz aimzVar3 = defpackage.amev.a;
        return !str.matches("[0-9*#]+") ? (java.lang.String) defpackage.amev.c.getOrDefault(ahvr.p(str), "") : str;
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
        if (i != 2) {
            return i != 3 ? j$.util.function.Function.-CC.$default$compose(this, function) : j$.util.function.Function.-CC.$default$compose(this, function);
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
