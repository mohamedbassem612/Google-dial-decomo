package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class aum implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ aum(bfe bfeVar, afs afsVar, int i) {
        this.$cid = i;
        this.b = bfeVar;
        this.a = null;
    }

    /* JADX WARN: Code duplicated, block: B:172:0x0447  */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v18, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v29, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v31, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v52, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v58, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v6, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v8, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v25, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final java.lang.Object a(java.lang.Object obj) {
        oc ocVar;
        cpx cpxVarP;
        dkw dkwVarA;
        djg djgVarD;
        defpackage.dkx dkxVarB;
        defpackage.dkx dkxVarB2;
        defpackage.dkx dkxVarB3;
        java.util.ArrayList arrayList;
        int i = 0;
        dks acswVar = null;
        switch (this.$cid) {
            case 0:
                ((java.lang.Long) obj).longValue();
                defpackage.auo auoVar = (defpackage.auo) this.a;
                float f = auoVar.e;
                auoVar.e = 0.0f;
                this.b.a(java.lang.Float.valueOf(f));
                return aojh.a;
            case 1:
                defpackage.aqu aquVar = (defpackage.aqu) obj;
                ((apnt) this.a).v(mni.bm(((ato) this.b).e(aquVar.a), true != aquVar.b ? 1.0f : -1.0f), 1);
                return aojh.a;
            case 2:
                float fFloatValue = ((java.lang.Float) obj).floatValue();
                aooq aooqVar = (aooq) this.b;
                float f2 = aooqVar.a - fFloatValue;
                aooqVar.a = f2;
                this.a.a(java.lang.Float.valueOf(f2));
                return aojh.a;
            case 3:
                float fFloatValue2 = ((java.lang.Float) obj).floatValue();
                aooq aooqVar2 = (aooq) this.b;
                float f3 = aooqVar2.a - fFloatValue2;
                aooqVar2.a = f3;
                this.a.a(java.lang.Float.valueOf(f3));
                return aojh.a;
            case 4:
                czb czbVar = (czb) obj;
                defpackage.ayp aypVar = (defpackage.ayp) this.a;
                boolean z = aypVar.c;
                java.lang.Object obj2 = this.b;
                if (z) {
                    czbVar.u((czc) obj2, dfd.p(czbVar, aypVar.a), dfd.p(czbVar, aypVar.b), 0.0f);
                } else {
                    czbVar.s((czc) obj2, dfd.p(czbVar, aypVar.a), dfd.p(czbVar, aypVar.b), 0.0f);
                }
                return aojh.a;
            case 5:
                czb czbVar2 = (czb) obj;
                defpackage.ayr ayrVar = (defpackage.ayr) this.a;
                long j = ((dpn) ayrVar.a.a(czbVar2)).a;
                boolean z2 = ayrVar.b;
                java.lang.Object obj3 = this.b;
                int i2 = (int) (j >> 32);
                int i3 = (int) (j & 4294967295L);
                if (z2) {
                    czb.B(czbVar2, (czc) obj3, i2, i3);
                } else {
                    czb.z(czbVar2, (czc) obj3, i2, i3, (aonj) null, 12);
                }
                return aojh.a;
            case 6:
                java.lang.Object obj4 = this.a;
                java.lang.Object obj5 = this.b;
                ((defpackage.baa) obj5).b((android.view.View) obj4);
                ocVar = new oc(obj5, obj4, 6);
                break;
            case 7:
                defpackage.bfa bfaVar = (defpackage.bfa) obj;
                int iC = bfaVar.c();
                int iD = 0;
                while (i < iC) {
                    iD += (int) (((bay) this.a).o == aso.a ? bfaVar.d(i) & 4294967295L : bfaVar.d(i) >> 32);
                    i++;
                }
                this.b.a(new absu(iD));
                return aojh.a;
            case 8:
                amwp amwpVarD = ((defpackage.bch) this.b).d(((java.lang.Integer) obj).intValue());
                int i4 = amwpVarD.a;
                ?? r15 = amwpVarD.b;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(r15.size());
                int size = r15.size();
                int i5 = 0;
                while (i < size) {
                    java.lang.Object obj6 = this.a;
                    int i6 = (int) ((defpackage.bbl) r15.get(i)).a;
                    arrayList2.add(new aoiu(java.lang.Integer.valueOf(i4), new dpd(((defpackage.bcf) obj6).b(i5, i6))));
                    i4++;
                    i5 += i6;
                    i++;
                }
                return arrayList2;
            case 9:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                defpackage.bcf bcfVar = (defpackage.bcf) this.b;
                int iA = bcfVar.a(iIntValue);
                return ((defpackage.bcd) this.a).b(iIntValue, 0, iA, bcfVar.b(0, iA));
            case 10:
                bct bctVar = (bct) this.a;
                diy diyVar = bctVar.b;
                if (diyVar != null) {
                    diyVar.b();
                }
                java.lang.Object obj7 = this.b;
                bctVar.b = null;
                bcu bcuVar = (bcu) obj7;
                aosi aosiVar = bcuVar.b;
                if (aosiVar != null) {
                    aosiVar.Q(aojh.a);
                }
                bcuVar.b = null;
                return aojh.a;
            case 11:
                aoov.an((aoss) obj, (aolr) null, 4, new defpackage.amg((bfe) this.b, (afs) null, (aoln) null, 16), 1);
                return aojh.a;
            case 12:
                dkw dkwVar = (dkw) obj;
                java.lang.Object obj8 = this.a;
                if (obj8 != null) {
                    ((defpackage.bgy) obj8).a.b(dkwVar);
                }
                ?? r14 = this.b;
                if (r14 != 0) {
                    r14.a(dkwVar);
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                czb czbVar3 = (czb) obj;
                java.util.List listAu = den.au((java.util.List) this.b, ((defpackage.bgq) this.a).a);
                if (listAu != null) {
                    int size2 = listAu.size();
                    while (i < size2) {
                        aoiu aoiuVar = (aoiu) listAu.get(i);
                        czc czcVar = (czc) aoiuVar.a;
                        aomy aomyVar = (aomy) aoiuVar.b;
                        czbVar3.t(czcVar, aomyVar != null ? ((dpn) aomyVar.a()).a : 0L, 0.0f);
                        i++;
                    }
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                cra craVar = (cra) obj;
                java.lang.Object obj9 = this.a;
                if (!((java.lang.Boolean) new defpackage.apv(obj9, 20).a()).booleanValue() || (dkwVarA = ((defpackage.bgy) obj9).a()) == null || (djgVarD = defpackage.bgy.d((djg) this.b, dkwVarA)) == null) {
                    cpxVarP = null;
                } else {
                    int i7 = djgVarD.b;
                    int i8 = djgVarD.c;
                    cpxVarP = dkwVarA.p(i7, i8);
                    cpn cpnVarJ = dkwVarA.j(i7);
                    int i9 = i8 - 1;
                    cpxVarP.o(((((long) java.lang.Float.floatToRawIntBits(dkwVarA.e(i7) == dkwVarA.e(i9) ? java.lang.Math.min(dkwVarA.j(i9).b, cpnVarJ.b) : 0.0f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(cpnVarJ.c)) & 4294967295L)) ^ (-9223372034707292160L));
                }
                acswVar = cpxVarP != null ? new acsw(cpxVarP, 1) : null;
                if (acswVar != null) {
                    craVar.z(acswVar);
                    craVar.s(true);
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                java.lang.Object obj10 = this.a;
                androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = ((defpackage.bgy) obj10).c;
                java.lang.Object obj11 = this.b;
                snapshotStateList.add(obj11);
                ocVar = new oc(obj10, obj11, 7, (byte[]) null);
                break;
            case 16:
                java.lang.Object obj12 = this.b;
                defpackage.bgt bgtVar = (defpackage.bgt) obj;
                defpackage.djw djwVar = (defpackage.djw) ((djg) obj12).a;
                defpackage.dkx dkxVarB4 = djwVar.b();
                dks dksVar = dkxVarB4 != null ? dkxVarB4.a : null;
                vx vxVar = (vx) this.a;
                dks dksVarD = (!vxVar.n() || (dkxVarB3 = djwVar.b()) == null) ? null : dkxVarB3.b;
                if (dksVar != null) {
                    dksVarD = dksVar.d(dksVarD);
                }
                dks dksVarD2 = (!vxVar.o() || (dkxVarB2 = djwVar.b()) == null) ? null : dkxVarB2.c;
                if (dksVarD != null) {
                    dksVarD2 = dksVarD.d(dksVarD2);
                }
                if (vxVar.p() && (dkxVarB = djwVar.b()) != null) {
                    acswVar = dkxVarB.d;
                }
                if (dksVarD2 != null) {
                    acswVar = dksVarD2.d(acswVar);
                }
                bgtVar.b = ((dji) bgtVar.a).b(new afx(new aoop(), obj12, acswVar, 4));
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                czb czbVar4 = (czb) obj;
                ?? r0 = this.a;
                if (r0 != 0) {
                    int size3 = r0.size();
                    for (int i10 = 0; i10 < size3; i10++) {
                        aoiu aoiuVar2 = (aoiu) r0.get(i10);
                        czbVar4.t((czc) aoiuVar2.a, ((dpn) aoiuVar2.b).a, 0.0f);
                    }
                }
                ?? r16 = this.b;
                if (r16 != 0) {
                    int size4 = r16.size();
                    while (i < size4) {
                        aoiu aoiuVar3 = (aoiu) r16.get(i);
                        czc czcVar2 = (czc) aoiuVar3.a;
                        aomy aomyVar2 = (aomy) aoiuVar3.b;
                        czbVar4.t(czcVar2, aomyVar2 != null ? ((dpn) aomyVar2.a()).a : 0L, 0.0f);
                        i++;
                    }
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                java.lang.Object obj13 = this.b;
                defpackage.bmb bmbVar = (defpackage.bmb) obj13;
                defpackage.blw blwVar = bmbVar.b;
                java.lang.Object obj14 = this.a;
                if (blwVar != null && blwVar != obj14) {
                    throw new java.lang.IllegalStateException("A SelectionState can only be bound to one SelectionContainer. Please use rememberSelectionState() to create a unique state for each container.");
                }
                if (obj14 != null && blwVar != null && blwVar != obj14) {
                    throw new java.lang.IllegalStateException("A SelectionState can only be bound to one SelectionContainer. Please use rememberSelectionState() to create a unique state for each container.");
                }
                bmbVar.b = (defpackage.blw) obj14;
                ocVar = new oc(obj13, obj14, 8);
                break;
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                aoov.an((aoss) this.b, (aolr) null, 4, new defpackage.bku((kaw) this.a, (dji) obj, null), 1);
                return aojh.a;
            default:
                defpackage.bmb bmbVar2 = (defpackage.bmb) this.b;
                bmbVar2.b((defpackage.bko) obj);
                defpackage.blw blwVar2 = (defpackage.blw) this.a;
                if (blwVar2.c() != null) {
                    defpackage.blz blzVar = blwVar2.a;
                    if (blzVar.b().c()) {
                        arrayList = aokc.a;
                    } else {
                        arrayList = new java.util.ArrayList();
                        java.util.List listC = blzVar.c(blwVar2.k());
                        java.util.ListIterator listIterator = listC.listIterator(listC.size());
                        while (listIterator.hasPrevious()) {
                            defpackage.bko bkoVar = (defpackage.bko) blzVar.b().a(((defpackage.bke) listIterator.previous()).a);
                            if (bkoVar != null) {
                                if (bkoVar.a.a != bkoVar.b.a) {
                                    if (listIterator.nextIndex() != -1) {
                                        int size5 = listC.size();
                                        while (i < size5) {
                                            defpackage.bke bkeVar = (defpackage.bke) listC.get(i);
                                            defpackage.bko bkoVar2 = (defpackage.bko) blzVar.b().a(bkeVar.a);
                                            if (bkoVar2 != null) {
                                                dji djiVarH = bkeVar.h();
                                                long jE = dfd.e(bkoVar2.a.a, bkoVar2.b.a);
                                                arrayList.add(djiVarH.c(dky.c(jE), dky.b(jE)));
                                            }
                                            i++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    arrayList = aokc.a;
                }
                bmbVar2.c(arrayList);
                return aojh.a;
        }
        return ocVar;
    }

    public /* synthetic */ aum(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ aum(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
