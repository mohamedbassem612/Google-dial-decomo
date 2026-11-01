package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wjv implements igc {
    private final defpackage.wrh a;
    private final aoin b;
    private final defpackage.wle c;

    public wjv(defpackage.wrh wrhVar, defpackage.wle wleVar, aoin aoinVar) {
        aooh.f(wleVar, "xatuAudioPrismPipelineResultListener");
        aooh.f(aoinVar, "minAmplitudeForAudioDetection");
        this.a = wrhVar;
        this.c = wleVar;
        this.b = aoinVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(igb igbVar, aoln aolnVar) {
        defpackage.wju wjuVar;
        boolean z;
        if (aolnVar instanceof defpackage.wju) {
            wjuVar = (defpackage.wju) aolnVar;
            int i = wjuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wjuVar.c = i - Integer.MIN_VALUE;
            } else {
                wjuVar = new defpackage.wju(this, aolnVar);
            }
        } else {
            wjuVar = new defpackage.wju(this, aolnVar);
        }
        java.lang.Object obj = wjuVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wjuVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            defpackage.wrh wrhVar = this.a;
            akzc akzcVar = igbVar.c;
            defpackage.wqo wqoVar = wrhVar.b;
            ajcq ajcqVarF = ahvr.F(new defpackage.whv(wqoVar, akzcVar, 7), wqoVar.a);
            wjuVar.d = igbVar;
            wjuVar.c = 1;
            if (aosv.D(ajcqVarF, wjuVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            igbVar = wjuVar.d;
            aooc.af(obj);
        }
        defpackage.wle wleVar = this.c;
        akzc akzcVar2 = igbVar.c;
        aooh.e(akzcVar2, "getData(...)");
        java.nio.ShortBuffer shortBufferAsShortBuffer = akzcVar2.j().order(java.nio.ByteOrder.nativeOrder()).asShortBuffer();
        aooh.e(shortBufferAsShortBuffer, "asShortBuffer(...)");
        defpackage.aokj aokjVarA = aooc.C(0, shortBufferAsShortBuffer.limit()).a();
        while (true) {
            if (!((defpackage.aopp) aokjVarA).a) {
                z = false;
                break;
            }
            if (java.lang.Math.abs((int) shortBufferAsShortBuffer.get(aokjVarA.a())) > ((java.lang.Number) this.b.a()).longValue()) {
                z = true;
                break;
            }
        }
        if (wleVar.d()) {
            akzx akzxVarM = defpackage.wor.a.m();
            if (z) {
                defpackage.wnt wntVar = defpackage.wnt.a;
                akzxVarM.u();
                defpackage.wor worVar = (defpackage.wor) akzxVarM.b;
                j$.util.Objects.requireNonNull(wntVar);
                worVar.c = wntVar;
                worVar.b = 1;
            } else {
                defpackage.wnn wnnVar = defpackage.wnn.a;
                akzxVarM.u();
                defpackage.wor worVar2 = (defpackage.wor) akzxVarM.b;
                j$.util.Objects.requireNonNull(wnnVar);
                worVar2.c = wnnVar;
                worVar2.b = 2;
            }
            agsm.i(1094, wleVar.l.o((defpackage.wor) akzxVarM.p()), "Failed to update audio detection result", new java.lang.Object[0]);
        }
        return aojh.a;
    }

    public final /* synthetic */ java.lang.Object b(igb igbVar, aoln aolnVar) {
        return aojh.a;
    }
}
