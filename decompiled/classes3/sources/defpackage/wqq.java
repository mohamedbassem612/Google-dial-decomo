package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wqq implements afii {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ alad b;

    public /* synthetic */ wqq(long j, alad aladVar, int i) {
        this.$cid = i;
        this.a = j;
        this.b = aladVar;
    }

    public final void a(adag adagVar) {
        int i = this.$cid;
        long j = this.a;
        if (i != 0) {
            j$.util.Optional optionalJ = wqr.j(adagVar, j);
            boolean zIsPresent = optionalJ.isPresent();
            alad aladVar = this.b;
            if (!zIsPresent) {
                wqr.k(adagVar, wqr.g(j, (defpackage.wgu) aladVar));
                return;
            }
            defpackage.wqp wqpVar = (defpackage.wqp) optionalJ.orElseThrow();
            defpackage.wqt wqtVar = wqpVar.e;
            if (wqtVar == null) {
                wqtVar = defpackage.wqt.a;
            }
            defpackage.wgu wguVar = wqtVar.d;
            if (wguVar == null) {
                wguVar = defpackage.wgu.a;
            }
            akzx akzxVarP = wguVar.p();
            akzxVarP.z(aladVar);
            defpackage.wgu wguVar2 = (defpackage.wgu) akzxVarP.p();
            akzx akzxVarP2 = wqpVar.p();
            long epochMilli = j$.time.Instant.now().toEpochMilli();
            akzxVarP2.u();
            defpackage.wqp wqpVar2 = (defpackage.wqp) akzxVarP2.b;
            wqpVar2.b |= 2;
            wqpVar2.d = epochMilli;
            defpackage.wqt wqtVar2 = wqpVar.e;
            if (wqtVar2 == null) {
                wqtVar2 = defpackage.wqt.a;
            }
            akzx akzxVarP3 = wqtVar2.p();
            akzxVarP3.u();
            defpackage.wqt wqtVar3 = (defpackage.wqt) akzxVarP3.b;
            j$.util.Objects.requireNonNull(wguVar2);
            wqtVar3.d = wguVar2;
            wqtVar3.b |= 2;
            defpackage.wqt wqtVar4 = (defpackage.wqt) akzxVarP3.p();
            akzxVarP2.u();
            defpackage.wqp wqpVar3 = (defpackage.wqp) akzxVarP2.b;
            j$.util.Objects.requireNonNull(wqtVar4);
            wqpVar3.e = wqtVar4;
            wqpVar3.b |= 4;
            wqr.k(adagVar, (defpackage.wqp) akzxVarP2.p());
            return;
        }
        j$.util.Optional optionalJ2 = wqr.j(adagVar, j);
        boolean zIsPresent2 = optionalJ2.isPresent();
        alad aladVar2 = this.b;
        if (!zIsPresent2) {
            akzx akzxVarM = defpackage.wqp.a.m();
            akzxVarM.u();
            defpackage.wqp wqpVar4 = (defpackage.wqp) akzxVarM.b;
            wqpVar4.b |= 1;
            wqpVar4.c = j;
            long epochMilli2 = j$.time.Instant.now().toEpochMilli();
            akzxVarM.u();
            defpackage.wqp wqpVar5 = (defpackage.wqp) akzxVarM.b;
            wqpVar5.b |= 2;
            wqpVar5.d = epochMilli2;
            akzx akzxVarM2 = defpackage.wqt.a.m();
            defpackage.wgu wguVar3 = defpackage.wgu.a;
            akzxVarM2.u();
            defpackage.wqt wqtVar5 = (defpackage.wqt) akzxVarM2.b;
            j$.util.Objects.requireNonNull(wguVar3);
            wqtVar5.d = wguVar3;
            wqtVar5.b |= 2;
            akzxVarM2.u();
            defpackage.wqt wqtVar6 = (defpackage.wqt) akzxVarM2.b;
            j$.util.Objects.requireNonNull(aladVar2);
            wqtVar6.c = (defpackage.wqs) aladVar2;
            wqtVar6.b |= 1;
            defpackage.wqt wqtVar7 = (defpackage.wqt) akzxVarM2.p();
            akzxVarM.u();
            defpackage.wqp wqpVar6 = (defpackage.wqp) akzxVarM.b;
            j$.util.Objects.requireNonNull(wqtVar7);
            wqpVar6.e = wqtVar7;
            wqpVar6.b |= 4;
            wqr.k(adagVar, (defpackage.wqp) akzxVarM.p());
            return;
        }
        defpackage.wqp wqpVar7 = (defpackage.wqp) optionalJ2.orElseThrow();
        defpackage.wqt wqtVar8 = wqpVar7.e;
        if (wqtVar8 == null) {
            wqtVar8 = defpackage.wqt.a;
        }
        defpackage.wqs wqsVar = wqtVar8.c;
        if (wqsVar == null) {
            wqsVar = defpackage.wqs.a;
        }
        akzx akzxVarP4 = wqsVar.p();
        akzxVarP4.z(aladVar2);
        defpackage.wqs wqsVar2 = (defpackage.wqs) akzxVarP4.p();
        akzx akzxVarP5 = wqpVar7.p();
        long epochMilli3 = j$.time.Instant.now().toEpochMilli();
        akzxVarP5.u();
        defpackage.wqp wqpVar8 = (defpackage.wqp) akzxVarP5.b;
        wqpVar8.b |= 2;
        wqpVar8.d = epochMilli3;
        defpackage.wqt wqtVar9 = wqpVar7.e;
        if (wqtVar9 == null) {
            wqtVar9 = defpackage.wqt.a;
        }
        akzx akzxVarP6 = wqtVar9.p();
        akzxVarP6.u();
        defpackage.wqt wqtVar10 = (defpackage.wqt) akzxVarP6.b;
        j$.util.Objects.requireNonNull(wqsVar2);
        wqtVar10.c = wqsVar2;
        wqtVar10.b |= 1;
        defpackage.wqt wqtVar11 = (defpackage.wqt) akzxVarP6.p();
        akzxVarP5.u();
        defpackage.wqp wqpVar9 = (defpackage.wqp) akzxVarP5.b;
        j$.util.Objects.requireNonNull(wqtVar11);
        wqpVar9.e = wqtVar11;
        wqpVar9.b |= 4;
        wqr.k(adagVar, (defpackage.wqp) akzxVarP5.p());
    }
}
