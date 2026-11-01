package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bcp implements beq {
    final /* synthetic */ defpackage.bcl a;

    public bcp(defpackage.bcl bclVar) {
        this.a = bclVar;
    }

    public final float a() {
        defpackage.bcl bclVar = this.a;
        return den.aB(bclVar.b(), bclVar.c(), bclVar.g());
    }

    public final float b() {
        defpackage.bcl bclVar = this.a;
        return bclVar.c() + (bclVar.b() * 500);
    }

    public final int c() {
        defpackage.bcl bclVar = this.a;
        return bclVar.i().a() + bclVar.i().p;
    }

    public final int d() {
        defpackage.bcl bclVar = this.a;
        return (int) (bclVar.i().o == aso.a ? bclVar.i().d() & 4294967295L : bclVar.i().d() >> 32);
    }

    public final dhu e() {
        return new dhu(-1, -1);
    }

    public final java.lang.Object f(int i, aoln aolnVar) {
        ckb ckbVar = defpackage.bcl.a;
        defpackage.bcl bclVar = this.a;
        java.lang.Object objD = bclVar.d(defpackage.aoc.a, new defpackage.bck(bclVar, i, (aoln) null, 0), aolnVar);
        aolu aoluVar = aolu.a;
        if (objD != aoluVar) {
            objD = aojh.a;
        }
        return objD != aoluVar ? aojh.a : objD;
    }
}
