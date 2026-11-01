package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pzk implements defpackage.qbb {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public pzk(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.qbb
    public final ajcq a() {
        int i = this.$cid;
        if (i != 0) {
            java.lang.Object obj = this.a;
            if (i != 1) {
                return ((defpackage.qpr) aooc.ar(((defpackage.afpl) obj).Y(), defpackage.qpr.class)).bQ();
            }
            ldn ldnVar = (ldn) obj;
            return ahvr.F(new ldk(ldnVar), ldnVar.g);
        }
        akzx akzxVarM = defpackage.ampz.a.m();
        aooh.f(akzxVarM, "builder");
        long j = ((defpackage.pzj) ((her) this.a).a).d;
        akzxVarM.u();
        defpackage.ampz ampzVar = (defpackage.ampz) akzxVarM.b;
        ampzVar.b |= 1;
        ampzVar.c = j;
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        return aiql.z((defpackage.ampz) aladVarP);
    }

    @Override // defpackage.qbb
    public final /* synthetic */ void b(akzx akzxVar, java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.ampz ampzVar = (defpackage.ampz) obj;
            akzxVar.u();
            amow amowVar = akzxVar.b;
            amow amowVar2 = amow.a;
            j$.util.Objects.requireNonNull(ampzVar);
            amowVar.ae = ampzVar;
            amowVar.c |= 134217728;
            return;
        }
        if (i == 1) {
            ampb ampbVar = (ampb) obj;
            akzxVar.u();
            amow amowVar3 = akzxVar.b;
            amow amowVar4 = amow.a;
            j$.util.Objects.requireNonNull(ampbVar);
            amowVar3.ac = ampbVar;
            amowVar3.c |= 33554432;
            return;
        }
        j$.util.Optional optional = (j$.util.Optional) obj;
        j$.util.Objects.requireNonNull(akzxVar);
        defpackage.qmp qmpVar = new defpackage.qmp(akzxVar, 12);
        if (true == optional.isPresent()) {
            defpackage.amsc amscVar = (defpackage.amsc) optional.get();
            akzx akzxVar2 = (akzx) qmpVar.a;
            akzxVar2.u();
            amow amowVar5 = akzxVar2.b;
            amow amowVar6 = amow.a;
            j$.util.Objects.requireNonNull(amscVar);
            amowVar5.aa = amscVar;
            amowVar5.c |= 8388608;
        }
    }
}
