package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bak implements defpackage.beq {
    final /* synthetic */ defpackage.bbh a;
    final /* synthetic */ boolean b;
    private final defpackage.cer c;

    public bak(defpackage.bbh bbhVar, boolean z) {
        this.a = bbhVar;
        this.b = z;
        this.c = new defpackage.cbg(new defpackage.ml(bbhVar, 12));
    }

    private final int g() {
        return ((java.lang.Number) this.c.a()).intValue();
    }

    @Override // defpackage.beq
    public final float a() {
        defpackage.bbh bbhVar = this.a;
        return defpackage.den.aB(bbhVar.b(), bbhVar.c(), bbhVar.g());
    }

    @Override // defpackage.beq
    public final float b() {
        defpackage.bbh bbhVar = this.a;
        return bbhVar.c() + (bbhVar.b() * 500);
    }

    @Override // defpackage.beq
    public final int c() {
        defpackage.bbh bbhVar = this.a;
        return bbhVar.j().a() + bbhVar.j().p;
    }

    @Override // defpackage.beq
    public final int d() {
        defpackage.bbh bbhVar = this.a;
        return (int) (bbhVar.j().o == defpackage.aso.a ? bbhVar.j().d() & 4294967295L : bbhVar.j().d() >> 32);
    }

    @Override // defpackage.beq
    public final defpackage.dhu e() {
        return this.b ? new defpackage.dhu(g(), 1) : new defpackage.dhu(1, g());
    }

    @Override // defpackage.beq
    public final java.lang.Object f(int i, defpackage.aoln aolnVar) {
        defpackage.ckb ckbVar = defpackage.bbh.a;
        java.lang.Object objL = this.a.l(i, aolnVar);
        return objL != defpackage.aolu.a ? defpackage.aojh.a : objL;
    }
}
