package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class acib extends aomh implements aonn {
    int a;
    final /* synthetic */ ajcq b;
    final /* synthetic */ acig c;
    final /* synthetic */ java.lang.String d;
    final /* synthetic */ akst e;
    final /* synthetic */ akhf f;
    private /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acib(ajcq ajcqVar, acig acigVar, java.lang.String str, akst akstVar, akhf akhfVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = ajcqVar;
        this.c = acigVar;
        this.d = str;
        this.e = akstVar;
        this.f = akhfVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:18:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:21:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:23:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:26:0x0110 A[LOOP:0: B:24:0x010a->B:26:0x0110, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        aoss aossVar;
        java.lang.Object objD;
        java.lang.Object objAj;
        adtv adtvVar;
        int iR;
        akhn akhnVar;
        java.lang.String str;
        java.util.ArrayList arrayList;
        ailj ailjVarK;
        java.lang.Object objV;
        aolu aoluVar = aolu.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                aossVar = (aoss) this.g;
                aooc.af(obj);
                objD = obj;
            } else if (i != 2) {
                aooc.af(obj);
                objV = obj;
            } else {
                aossVar = (aoss) this.g;
                aooc.af(obj);
                objAj = obj;
                adtvVar = (adtz) objAj;
                iR = anty.R(adtvVar);
                if (iR != 0) {
                    if (iR == 1) {
                        return adtvVar;
                    }
                    throw new aois();
                }
                akhnVar = (akhn) ((adub) adtvVar).a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                acig acigVar = this.c;
                str = this.d;
                arrayList2.add(aoov.am(aossVar, 0, new defpackage.abvg(acigVar, str, (aoln) null, 14), 3));
                aile aileVar = acigVar.d;
                arrayList = new java.util.ArrayList(ajsz.bl(aileVar, 10));
                ailjVarK = aileVar.k();
                while (ailjVarK.hasNext()) {
                    java.lang.String str2 = str;
                    akhn akhnVar2 = akhnVar;
                    defpackage.xhb xhbVar = new defpackage.xhb((acle) ailjVarK.next(), str2, akhnVar2, (aoln) null, 9);
                    str = str2;
                    akhnVar = akhnVar2;
                    arrayList.add(aoov.am(aossVar, 0, xhbVar, 3));
                }
                arrayList2.addAll(arrayList);
                arrayList2.add(aoov.am(aossVar, 0, new defpackage.uhy(acigVar, akhnVar, str, this.e, (aoln) null, 5), 3));
                this.g = null;
                this.a = 3;
                objV = aooh.v(arrayList2, this);
                if (objV == aoluVar) {
                    return aoluVar;
                }
            }
            return agab.bV((java.util.List) objV, acig.a);
        }
        aooc.af(obj);
        aossVar = (aoss) this.g;
        ajcq ajcqVar = this.b;
        this.g = aossVar;
        this.a = 1;
        objD = aosv.D(ajcqVar, this);
        if (objD == aoluVar) {
            return aoluVar;
        }
        akhf akhfVar = this.f;
        akzx akzxVarM = akhj.a.m();
        aooh.f(akzxVarM, "builder");
        aooh.f(akhfVar, "value");
        akzxVarM.u();
        akhj akhjVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(akhfVar);
        akhjVar.c = akhfVar;
        akhjVar.b |= 1;
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(akzxVarM.b.d);
        aooh.e(listUnmodifiableList, "getPresentedPromoList(...)");
        new alct(listUnmodifiableList);
        java.util.Collection collectionValues = ((java.util.Map) objD).values();
        aooh.f(collectionValues, "values");
        akzxVarM.u();
        akhj akhjVar2 = akzxVarM.b;
        alat alatVar = akhjVar2.d;
        if (!alatVar.c()) {
            akhjVar2.d = alad.J(alatVar);
        }
        akyl.i(collectionValues, akhjVar2.d);
        akhj akhjVarP = akzxVarM.p();
        aooh.e(akhjVarP, "build(...)");
        akhj akhjVar3 = akhjVarP;
        acig acigVar2 = this.c;
        java.lang.String str3 = this.d;
        akst akstVar = this.e;
        this.g = aossVar;
        this.a = 2;
        acem acemVar = acigVar2.c;
        objAj = aoov.aj(acemVar.b, new defpackage.aceh(acemVar, akhjVar3, str3, akstVar, null), this);
        if (objAj == aoluVar) {
            return aoluVar;
        }
        adtvVar = (adtz) objAj;
        iR = anty.R(adtvVar);
        if (iR != 0) {
            if (iR == 1) {
                return adtvVar;
            }
            throw new aois();
        }
        akhnVar = (akhn) ((adub) adtvVar).a;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        acig acigVar3 = this.c;
        str = this.d;
        arrayList3.add(aoov.am(aossVar, 0, new defpackage.abvg(acigVar3, str, (aoln) null, 14), 3));
        aile aileVar2 = acigVar3.d;
        arrayList = new java.util.ArrayList(ajsz.bl(aileVar2, 10));
        ailjVarK = aileVar2.k();
        while (ailjVarK.hasNext()) {
            java.lang.String str4 = str;
            akhn akhnVar3 = akhnVar;
            defpackage.xhb xhbVar2 = new defpackage.xhb((acle) ailjVarK.next(), str4, akhnVar3, (aoln) null, 9);
            str = str4;
            akhnVar = akhnVar3;
            arrayList.add(aoov.am(aossVar, 0, xhbVar2, 3));
        }
        arrayList3.addAll(arrayList);
        arrayList3.add(aoov.am(aossVar, 0, new defpackage.uhy(acigVar3, akhnVar, str, this.e, (aoln) null, 5), 3));
        this.g = null;
        this.a = 3;
        objV = aooh.v(arrayList3, this);
        if (objV == aoluVar) {
            return aoluVar;
        }
        return agab.bV((java.util.List) objV, acig.a);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.acib acibVar = new defpackage.acib(this.b, this.c, this.d, this.e, this.f, aolnVar);
        acibVar.g = obj;
        return acibVar;
    }
}
