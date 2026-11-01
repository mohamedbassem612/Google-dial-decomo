package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class adbq implements java.util.concurrent.Callable {
    public final /* synthetic */ java.util.Map a;
    public final /* synthetic */ java.util.Map b;
    public final /* synthetic */ java.util.concurrent.atomic.AtomicLong c;
    public final /* synthetic */ int d;
    public final /* synthetic */ agqj e;

    public /* synthetic */ adbq(agqj agqjVar, java.util.Map map, java.util.Map map2, java.util.concurrent.atomic.AtomicLong atomicLong, int i) {
        this.e = agqjVar;
        this.a = map;
        this.b = map2;
        this.c = atomicLong;
        this.d = i;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [acxa, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        akzx akzxVarM = aixc.a.m();
        java.util.Map map = this.a;
        agqj agqjVar = this.e;
        for (java.lang.String str : map.keySet()) {
            java.util.Map map2 = this.b;
            defpackage.adbr adbrVar = (defpackage.adbr) map.get(str);
            java.util.List listJ = ahzf.d("|").j(str);
            akzx akzxVarM2 = aiwm.a.m();
            java.lang.String str2 = (java.lang.String) listJ.get(0);
            akzxVarM2.u();
            aiwm aiwmVar = akzxVarM2.b;
            j$.util.Objects.requireNonNull(str2);
            aiwmVar.b |= 1;
            aiwmVar.c = str2;
            java.lang.String str3 = (java.lang.String) listJ.get(1);
            akzxVarM2.u();
            aiwm aiwmVar2 = akzxVarM2.b;
            j$.util.Objects.requireNonNull(str3);
            aiwmVar2.b |= 4;
            aiwmVar2.e = str3;
            int i = adbrVar.e;
            akzxVarM2.u();
            aiwm aiwmVar3 = akzxVarM2.b;
            aiwmVar3.b |= 8;
            aiwmVar3.f = i;
            int i2 = adbrVar.f;
            akzxVarM2.u();
            aiwm aiwmVar4 = akzxVarM2.b;
            aiwmVar4.b |= 16;
            aiwmVar4.g = i2;
            defpackage.acvu acvuVar = (defpackage.acvu) map2.get(str);
            if (acvuVar == null) {
                akzxVarM2.u();
                aiwm aiwmVar5 = akzxVarM2.b;
                aiwmVar5.b |= 2;
                aiwmVar5.d = -1;
            } else {
                int i3 = acvuVar.f;
                akzxVarM2.u();
                aiwm aiwmVar6 = akzxVarM2.b;
                aiwmVar6.b |= 2;
                aiwmVar6.d = i3;
                long j = acvuVar.s;
                akzxVarM2.u();
                aiwm aiwmVar7 = akzxVarM2.b;
                aiwmVar7.b |= 64;
                aiwmVar7.i = j;
                java.lang.String str4 = acvuVar.t;
                akzxVarM2.u();
                aiwm aiwmVar8 = akzxVarM2.b;
                j$.util.Objects.requireNonNull(str4);
                aiwmVar8.b |= 128;
                aiwmVar8.j = str4;
            }
            aiwm aiwmVarP = akzxVarM2.p();
            akzxVarM.u();
            aixc aixcVar = akzxVarM.b;
            j$.util.Objects.requireNonNull(aiwmVarP);
            alat alatVar = aixcVar.c;
            if (!alatVar.c()) {
                aixcVar.c = alad.J(alatVar);
            }
            aixcVar.c.add(aiwmVarP);
            long j2 = adbrVar.a;
            akzxVarM.u();
            aixc aixcVar2 = akzxVarM.b;
            alan alanVar = aixcVar2.d;
            if (!alanVar.c()) {
                aixcVar2.d = alad.I(alanVar);
            }
            aixcVar2.d.g(j2);
            long j3 = adbrVar.b;
            akzxVarM.u();
            aixc aixcVar3 = akzxVarM.b;
            alan alanVar2 = aixcVar3.e;
            if (!alanVar2.c()) {
                aixcVar3.e = alad.I(alanVar2);
            }
            aixcVar3.e.g(j3);
            long j4 = adbrVar.c;
            akzxVarM.u();
            aixc aixcVar4 = akzxVarM.b;
            alan alanVar3 = aixcVar4.f;
            if (!alanVar3.c()) {
                aixcVar4.f = alad.I(alanVar3);
            }
            aixcVar4.f.g(j4);
            long j5 = adbrVar.d;
            akzxVarM.u();
            aixc aixcVar5 = akzxVarM.b;
            alan alanVar4 = aixcVar5.g;
            if (!alanVar4.c()) {
                aixcVar5.g = alad.I(alanVar4);
            }
            aixcVar5.g.g(j5);
        }
        long j6 = this.c.get();
        akzxVarM.u();
        aixc aixcVar6 = akzxVarM.b;
        aixcVar6.b |= 1;
        aixcVar6.h = j6;
        long jLongValue = 0;
        try {
            android.net.Uri uriL = abrz.L((android.content.Context) agqjVar.h, (ahyn) agqjVar.e);
            java.lang.Object obj = agqjVar.f;
            if (((aogc) obj).R(uriL)) {
                jLongValue = ((java.lang.Long) ((aogc) obj).M(uriL, new defpackage.affm(4))).longValue();
            }
        } catch (java.io.IOException e) {
            adbe.g(e, "%s: Failed to call Mobstore to compute MDD Directory bytes used!", new java.lang.Object[]{"StorageLogger"});
            agqjVar.g.a();
        }
        int i4 = this.d;
        akzxVarM.u();
        aixc aixcVar7 = akzxVarM.b;
        aixcVar7.b |= 2;
        aixcVar7.i = jLongValue;
        akzxVarM.u();
        aixc aixcVar8 = akzxVarM.b;
        aixcVar8.b |= 4;
        aixcVar8.j = i4;
        return akzxVarM.p();
    }
}
