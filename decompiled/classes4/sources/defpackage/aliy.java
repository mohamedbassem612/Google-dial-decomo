package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aliy implements defpackage.amkc {
    final /* synthetic */ defpackage.aliz a;

    public aliy(defpackage.aliz alizVar) {
        j$.util.Objects.requireNonNull(alizVar);
        this.a = alizVar;
    }

    @Override // defpackage.amkc
    public final void d(defpackage.amkf amkfVar) {
        int i;
        akzx akzxVarM = defpackage.amax.a.m();
        int iAN = a.aN(amkfVar.b);
        if (iAN == 0) {
            iAN = 1;
        }
        int i2 = iAN - 1;
        if (i2 == 0) {
            i = 3;
        } else if (i2 != 1) {
            i = 2;
            if (i2 == 2) {
                i = 5;
            }
        } else {
            i = 4;
        }
        defpackage.aliz alizVar = this.a;
        akzxVarM.u();
        ((defpackage.amax) akzxVarM.b).b = a.Q(i);
        long j = amkfVar.c;
        akzxVarM.u();
        ((defpackage.amax) akzxVarM.b).c = j;
        defpackage.amax amaxVar = (defpackage.amax) akzxVarM.p();
        j$.util.Optional optional = alizVar.b;
        defpackage.akxd akxdVar = new defpackage.akxd(amaxVar, 3);
        if (true == optional.isPresent()) {
            ((aprf) optional.get()).b((defpackage.amax) akxdVar.a);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [j$.time.temporal.Temporal, java.lang.Object] */
    @Override // defpackage.amkc
    public final void e(defpackage.amkl amklVar) {
        int iAN = a.aN(amklVar.c);
        if (iAN == 0) {
            iAN = 1;
        }
        defpackage.amkn amknVar = amklVar.d;
        if (amknVar == null) {
            amknVar = defpackage.amkn.a;
        }
        if (amknVar.e.size() > 0) {
            defpackage.aliz alizVar = this.a;
            if (iAN != 2) {
                aljb aljbVar = alizVar.c;
                ?? r3 = aljbVar.c;
                java.lang.Object obj = aljbVar.b;
                if (((j$.time.Duration) aljbVar.a).compareTo(j$.time.Duration.between((j$.time.temporal.Temporal) r3, j$.time.Instant.now())) < 0) {
                    alizVar.a.a = true;
                }
            }
            defpackage.amkn amknVar2 = amklVar.d;
            if (amknVar2 == null) {
                amknVar2 = defpackage.amkn.a;
            }
            akzx akzxVarM = defpackage.amaz.a.m();
            akzxVarM.bc((java.lang.Iterable) j$.util.Collection.-EL.stream(amknVar2.e).map(new defpackage.ailg(9)).collect(aido.a));
            long j = amknVar2.c;
            akzxVarM.u();
            ((defpackage.amaz) akzxVarM.b).d = j;
            long j2 = amknVar2.d;
            akzxVarM.u();
            ((defpackage.amaz) akzxVarM.b).e = j2;
            long j3 = amklVar.f;
            akzxVarM.u();
            defpackage.amaz amazVar = (defpackage.amaz) akzxVarM.b;
            amazVar.b |= 1;
            amazVar.f = j3;
            defpackage.amaz amazVar2 = (defpackage.amaz) akzxVarM.p();
            j$.util.Optional optional = alizVar.b;
            defpackage.akxd akxdVar = new defpackage.akxd(amazVar2, 2);
            if (true == optional.isPresent()) {
                ((aprf) optional.get()).c((defpackage.amaz) akxdVar.a);
            }
        }
    }

    @Override // defpackage.amkc
    public final void h() {
    }

    @Override // defpackage.amkc
    public final void c(defpackage.amke amkeVar) {
    }
}
