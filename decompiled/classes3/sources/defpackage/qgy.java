package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qgy implements java.util.function.IntConsumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ qgy(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int i2 = this.$cid;
        if (i2 == 0) {
            ((defpackage.qhj) this.a).l.H().getWindow().setSoftInputMode(i);
            return;
        }
        if (i2 == 1) {
            eyc eycVar = ((eyb) this.a).c;
            if (eycVar.u) {
                return;
            }
            eycVar.G(1, 19, java.lang.Integer.valueOf(i));
            return;
        }
        if (i2 == 2) {
            akzx akzxVar = (akzx) this.a;
            akzxVar.u();
            defpackage.rga rgaVar = (defpackage.rga) akzxVar.b;
            defpackage.rga rgaVar2 = defpackage.rga.a;
            rgaVar.b |= 1;
            rgaVar.f = i;
            return;
        }
        if (i2 == 3) {
            oju ojuVar = (oju) this.a;
            ojuVar.f.setRingerMode(i);
            zjv.i(ojuVar.d, mgv.dG, ajsz.aY(gus.au(i)), (mhc) null, 0, 28);
            return;
        }
        if (i2 == 4) {
            ((defpackage.xcn) this.a).b.setStreamVolume(2, i, 0);
            return;
        }
        java.lang.Object obj = this.a;
        if (i2 != 5) {
            ((akzx) obj).bO(i);
            return;
        }
        rwi rwiVar = (rwi) obj;
        rwiVar.d.setInterruptionFilter(i);
        zjv.i(rwiVar.f, mgv.cz, aify.p(gus.au(i)), (mhc) null, 0, 28);
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        int i = this.$cid;
        if (i == 0) {
            return j$.util.function.IntConsumer.-CC.$default$andThen(this, intConsumer);
        }
        if (i == 1) {
            return j$.util.function.IntConsumer.-CC.$default$andThen(this, intConsumer);
        }
        if (i == 2) {
            return j$.util.function.IntConsumer.-CC.$default$andThen(this, intConsumer);
        }
        if (i == 3) {
            return j$.util.function.IntConsumer.-CC.$default$andThen(this, intConsumer);
        }
        if (i != 4) {
            return i != 5 ? j$.util.function.IntConsumer.-CC.$default$andThen(this, intConsumer) : j$.util.function.IntConsumer.-CC.$default$andThen(this, intConsumer);
        }
        return j$.util.function.IntConsumer.-CC.$default$andThen(this, intConsumer);
    }
}
