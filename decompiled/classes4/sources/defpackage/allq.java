package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class allq implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ allq(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.alsn alsnVar = (defpackage.alsn) obj;
            aimz aimzVar = defpackage.allu.a;
            akzx akzxVarM = defpackage.alol.a.m();
            akzxVarM.u();
            defpackage.alol alolVar = (defpackage.alol) akzxVarM.b;
            alolVar.d = ((defpackage.alsz) this.a).d;
            alolVar.b |= 2;
            akzxVarM.u();
            defpackage.alol alolVar2 = (defpackage.alol) akzxVarM.b;
            alolVar2.c = ((defpackage.alsy) this.b).j;
            alolVar2.b |= 1;
            akzx akzxVarM2 = defpackage.alsw.a.m();
            akzxVarM2.u();
            defpackage.alsw alswVar = (defpackage.alsw) akzxVarM2.b;
            j$.util.Objects.requireNonNull(alsnVar);
            alswVar.c = alsnVar;
            alswVar.b = 1;
            akzxVarM.u();
            defpackage.alol alolVar3 = (defpackage.alol) akzxVarM.b;
            defpackage.alsw alswVar2 = (defpackage.alsw) akzxVarM2.p();
            j$.util.Objects.requireNonNull(alswVar2);
            alolVar3.e = alswVar2;
            alolVar3.b |= 4;
            return defpackage.allu.a((defpackage.alol) akzxVarM.p());
        }
        if (i == 1) {
            return new defpackage.aliv((java.io.InputStream) this.a, (defpackage.alqg) obj, new defpackage.aljh((defpackage.alji) this.b, 0));
        }
        if (i == 2) {
            akzx akzxVarM3 = defpackage.almm.a.m();
            java.lang.String str = (java.lang.String) ((defpackage.alvv) this.a).c.getOrDefault(obj, ((defpackage.alvu) this.b).e.c);
            akzxVarM3.u();
            defpackage.almm almmVar = (defpackage.almm) akzxVarM3.b;
            j$.util.Objects.requireNonNull(str);
            almmVar.b |= 1;
            almmVar.c = str;
            return (defpackage.almm) akzxVarM3.p();
        }
        int i2 = 3;
        if (i != 3) {
            if (i != 4) {
                return (byte[]) ahzq.c(new defpackage.amex((alqd) obj, (java.lang.String) this.a, 3));
            }
            aimz aimzVar2 = defpackage.amcx.a;
            return ((defpackage.amcm) this.a).k(this.b, aify.p((defpackage.amce) obj));
        }
        java.lang.String strTrim = ((java.lang.String) obj).trim();
        java.lang.Object obj2 = this.b;
        defpackage.alxr alxrVar = ((defpackage.alxu) obj2).e;
        if (alxrVar == null) {
            alxrVar = defpackage.alxr.a;
        }
        java.lang.String str2 = alxrVar.e;
        return (aify) j$.util.Collection.-EL.stream(str2.isEmpty() ? aify.p(strTrim) : aify.n(ahzf.d(str2).j(strTrim))).map(new defpackage.allm(this.a, obj2, i2, null)).flatMap(new defpackage.alyz(7)).collect(aido.a);
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

    public /* synthetic */ allq(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
