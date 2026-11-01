package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class tbn implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;

    public /* synthetic */ tbn(int i, int i2) {
        this.$cid = i2;
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ((lkq) obj).b(j$.util.OptionalInt.of(this.a));
            return;
        }
        if (i != 1) {
            if (i != 2) {
                akzx akzxVar = (akzx) obj;
                akzxVar.u();
                defpackage.amto amtoVar = (defpackage.amto) akzxVar.b;
                defpackage.amto amtoVar2 = defpackage.amto.a;
                amtoVar.n = this.a - 1;
                amtoVar.b |= 64;
                return;
            }
            akzx akzxVar2 = (akzx) obj;
            akzxVar2.u();
            amry amryVar = akzxVar2.b;
            amry amryVar2 = amry.a;
            amryVar.d = this.a - 1;
            amryVar.b |= 2;
            return;
        }
        lkq lkqVar = (lkq) obj;
        ljy ljyVar = lkqVar.g.c;
        if (ljyVar == null) {
            ljyVar = ljy.a;
        }
        int i2 = this.a;
        akzx akzxVarP = ljyVar.p();
        akzxVarP.u();
        ljy ljyVar2 = akzxVarP.b;
        ljyVar2.b |= 1;
        ljyVar2.c = false;
        akzxVarP.u();
        ljy ljyVar3 = akzxVarP.b;
        ljyVar3.b |= 2;
        ljyVar3.d = false;
        akzxVarP.u();
        ljy ljyVar4 = akzxVarP.b;
        ljyVar4.e = i2 - 1;
        ljyVar4.b |= 4;
        ljy ljyVarP = akzxVarP.p();
        akzx akzxVarP2 = lkqVar.g.p();
        akzxVarP2.u();
        ljx ljxVar = akzxVarP2.b;
        j$.util.Objects.requireNonNull(ljyVarP);
        ljxVar.c = ljyVarP;
        ljxVar.b |= 1;
        lkqVar.g = akzxVarP2.p();
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        int i = this.$cid;
        if (i == 0) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i != 1) {
            return i != 2 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
