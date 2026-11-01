package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class udt implements java.util.concurrent.Callable {
    public final /* synthetic */ udy a;
    public final /* synthetic */ akzx b;

    public /* synthetic */ udt(udy udyVar, akzx akzxVar) {
        this.a = udyVar;
        this.b = akzxVar;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        akzx akzxVar = this.b;
        j$.util.Optional optionalG = this.a.g((defpackage.ucq) akzxVar.p());
        if (!optionalG.isPresent()) {
            return null;
        }
        java.lang.Object obj = ((defpackage.taq) optionalG.orElseThrow()).a;
        aivu aivuVar = ((defpackage.ucq) akzxVar.b).c;
        if (aivuVar == null) {
            aivuVar = aivu.a;
        }
        akzx akzxVarP = aivuVar.p();
        defpackage.ucu ucuVar = (defpackage.ucu) obj;
        if (j$.time.Instant.now().toEpochMilli() - ucuVar.c < 604800000) {
            java.lang.String str = ucuVar.h;
            akzxVarP.u();
            aivu aivuVar2 = akzxVarP.b;
            j$.util.Objects.requireNonNull(str);
            aivuVar2.b |= 67108864;
            aivuVar2.y = str;
        }
        if ((ucuVar.b & 32) != 0) {
            int iAQ = a.aQ(ucuVar.g);
            if (iAQ == 0) {
                iAQ = 1;
            }
            aiyh aiyhVarBT = wsc.bT(iAQ);
            akzxVarP.u();
            aivu aivuVar3 = akzxVarP.b;
            aivuVar3.v = aiyhVarBT.d;
            aivuVar3.b |= 8388608;
        }
        if ((ucuVar.b & 8) != 0) {
            udk udkVarB = udk.b(ucuVar.e);
            if (udkVarB == null) {
                udkVarB = udk.a;
            }
            aiyn aiynVarBS = wsc.bS(udkVarB);
            akzxVarP.u();
            aivu aivuVar4 = akzxVarP.b;
            aivuVar4.x = aiynVarBS.e;
            aivuVar4.b |= 33554432;
        }
        if ((ucuVar.b & 256) != 0) {
            aivr aivrVar = ucuVar.j;
            if (aivrVar == null) {
                aivrVar = aivr.b;
            }
            akzxVarP.u();
            aivu aivuVar5 = akzxVarP.b;
            j$.util.Objects.requireNonNull(aivrVar);
            aivuVar5.A = aivrVar;
            aivuVar5.b |= 268435456;
        }
        if ((ucuVar.b & 512) != 0) {
            int iAP = a.aP(ucuVar.k);
            if (iAP == 0) {
                iAP = 1;
            }
            akzxVarP.u();
            aivu aivuVar6 = akzxVarP.b;
            aivuVar6.B = iAP - 1;
            aivuVar6.b |= 536870912;
        }
        if ((ucuVar.b & 1024) != 0) {
            aiyi aiyiVar = ucuVar.l;
            if (aiyiVar == null) {
                aiyiVar = aiyi.a;
            }
            akzxVarP.u();
            aivu aivuVar7 = akzxVarP.b;
            j$.util.Objects.requireNonNull(aiyiVar);
            aivuVar7.C = aiyiVar;
            aivuVar7.b |= 1073741824;
        }
        if ((ucuVar.b & 2048) != 0) {
            aiyg aiygVarB = aiyg.b(ucuVar.m);
            if (aiygVarB == null) {
                aiygVarB = aiyg.a;
            }
            akzxVarP.u();
            aivu aivuVar8 = akzxVarP.b;
            aivuVar8.E = aiygVarB.c;
            aivuVar8.c |= 1;
        }
        if ((ucuVar.b & 8192) != 0) {
            aixl aixlVar = ucuVar.o;
            if (aixlVar == null) {
                aixlVar = aixl.a;
            }
            akzxVarP.u();
            aivu aivuVar9 = akzxVarP.b;
            j$.util.Objects.requireNonNull(aixlVar);
            aivuVar9.I = aixlVar;
            aivuVar9.c |= 8;
        }
        akzxVar.u();
        defpackage.ucq ucqVar = (defpackage.ucq) akzxVar.b;
        aivu aivuVarP = akzxVarP.p();
        j$.util.Objects.requireNonNull(aivuVarP);
        ucqVar.c = aivuVarP;
        ucqVar.b |= 1;
        return null;
    }
}
