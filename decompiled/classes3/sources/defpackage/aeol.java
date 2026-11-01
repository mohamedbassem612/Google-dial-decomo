package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aeol implements defpackage.aeob {
    final /* synthetic */ int a;
    final /* synthetic */ ahbz b;

    public aeol(ahbz ahbzVar, int i) {
        this.a = i;
        j$.util.Objects.requireNonNull(ahbzVar);
        this.b = ahbzVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [aoin, java.lang.Object] */
    @Override // defpackage.aeob
    public final boolean a(akzx akzxVar) {
        ahbz ahbzVar = this.b;
        int i = 0;
        if (!((java.lang.Boolean) ahbzVar.e.a()).booleanValue()) {
            return false;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= ((defpackage.aenz) akzxVar.b).e.size()) {
                i2 = -1;
                break;
            }
            if (((defpackage.aenv) ((defpackage.aenz) akzxVar.b).e.get(i2)).b == 3) {
                break;
            }
            i2++;
        }
        if (i2 != -1) {
            akzxVar.u();
            defpackage.aenz aenzVar = (defpackage.aenz) akzxVar.b;
            aenzVar.b();
            aenzVar.e.remove(i2);
        }
        akzx akzxVarM = defpackage.aenx.a.m();
        int i3 = this.a;
        akzxVarM.u();
        defpackage.aenx aenxVar = (defpackage.aenx) akzxVarM.b;
        aenxVar.e = i3 - 1;
        aenxVar.b |= 2;
        alcf alcfVarDI = ajsz.dI(j$.time.Instant.now());
        akzxVarM.u();
        defpackage.aenx aenxVar2 = (defpackage.aenx) akzxVarM.b;
        j$.util.Objects.requireNonNull(alcfVarDI);
        aenxVar2.d = alcfVarDI;
        aenxVar2.b |= 1;
        if (((java.lang.Boolean) ahbzVar.c.a()).booleanValue()) {
            j$.util.stream.Stream map = j$.util.Collection.-EL.stream(((ahqm) ((defpackage.uzx) ((ahys) ahbzVar.b).a).a).d()).map(new defpackage.adci(14));
            j$.util.stream.Collector collector = aido.a;
            aify aifyVarA = defpackage.aeop.a((java.util.List) j$.util.Collection.-EL.stream((aify) map.collect(collector)).map(new defpackage.adci(6)).collect(collector), ((java.lang.Long) ahbzVar.d.a()).longValue(), ((java.lang.Long) ahbzVar.a.a()).longValue());
            int size = aifyVarA.size();
            while (i < size) {
                aphg aphgVar = (aphg) aifyVarA.get(i);
                akzx akzxVarM2 = apgw.a.m();
                akzxVarM2.u();
                apgw apgwVar = akzxVarM2.b;
                j$.util.Objects.requireNonNull(aphgVar);
                apgwVar.d = aphgVar;
                apgwVar.c = 3;
                akzx akzxVarM3 = defpackage.apha.a.m();
                akzxVarM3.u();
                defpackage.apha aphaVar = (defpackage.apha) akzxVarM3.b;
                aphaVar.b |= 2;
                aphaVar.e = true;
                defpackage.apha aphaVar2 = (defpackage.apha) akzxVarM3.p();
                akzxVarM2.u();
                apgw apgwVar2 = akzxVarM2.b;
                j$.util.Objects.requireNonNull(aphaVar2);
                apgwVar2.e = aphaVar2;
                apgwVar2.b |= 1;
                akzxVarM.aB(akzxVarM2);
                i++;
            }
        } else {
            j$.util.stream.Stream map2 = j$.util.Collection.-EL.stream(((ahqm) ((defpackage.uzx) ((ahys) ahbzVar.b).a).a).d()).map(new defpackage.adci(13));
            j$.util.stream.Collector collector2 = aido.a;
            aify aifyVarA2 = defpackage.aeop.a((java.util.List) j$.util.Collection.-EL.stream((aify) map2.collect(collector2)).map(new defpackage.adci(4)).collect(collector2), ((java.lang.Long) ahbzVar.d.a()).longValue(), ((java.lang.Long) ahbzVar.a.a()).longValue());
            int size2 = aifyVarA2.size();
            while (i < size2) {
                apfr apfrVar = (apfr) aifyVarA2.get(i);
                akzx akzxVarM4 = apgw.a.m();
                akzxVarM4.u();
                apgw apgwVar3 = akzxVarM4.b;
                j$.util.Objects.requireNonNull(apfrVar);
                apgwVar3.d = apfrVar;
                apgwVar3.c = 1;
                akzx akzxVarM5 = defpackage.apha.a.m();
                akzxVarM5.u();
                defpackage.apha aphaVar3 = (defpackage.apha) akzxVarM5.b;
                aphaVar3.b |= 2;
                aphaVar3.e = true;
                defpackage.apha aphaVar4 = (defpackage.apha) akzxVarM5.p();
                akzxVarM4.u();
                apgw apgwVar4 = akzxVarM4.b;
                j$.util.Objects.requireNonNull(aphaVar4);
                apgwVar4.e = aphaVar4;
                apgwVar4.b |= 1;
                akzxVarM.aB(akzxVarM4);
                i++;
            }
        }
        akzx akzxVarM6 = defpackage.aenv.a.m();
        defpackage.aenx aenxVar3 = (defpackage.aenx) akzxVarM.p();
        akzxVarM6.u();
        defpackage.aenv aenvVar = (defpackage.aenv) akzxVarM6.b;
        j$.util.Objects.requireNonNull(aenxVar3);
        aenvVar.c = aenxVar3;
        aenvVar.b = 3;
        akzxVar.aA(akzxVarM6);
        return true;
    }
}
