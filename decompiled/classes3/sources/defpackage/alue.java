package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class alue implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ alue(int i, int i2, int i3) {
        this.$cid = i3;
        this.a = i;
        this.b = i2;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return this.$cid != 0 ? j$.util.function.Function.-CC.$default$andThen(this, function) : j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        if (this.$cid != 0) {
            aihd aihdVar = defpackage.qtd.a;
            return ((defpackage.qth) obj).d(new android.util.Size(this.a, this.b));
        }
        akzx akzxVarM = alwe.a.m();
        akzxVarM.u();
        alwe alweVar = akzxVarM.b;
        alweVar.b |= 1;
        alweVar.c = this.a;
        akzxVarM.u();
        alwe alweVar2 = akzxVarM.b;
        alweVar2.b |= 2;
        alweVar2.d = this.b;
        akzxVarM.u();
        alwe alweVar3 = akzxVarM.b;
        alweVar3.e = 2;
        alweVar3.b |= 4;
        return j$.util.Optional.of(akzxVarM.p());
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return this.$cid != 0 ? j$.util.function.Function.-CC.$default$compose(this, function) : j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
