package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rae extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.String b;
    final /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rae(java.lang.String str, android.os.PersistableBundle persistableBundle, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = str;
        this.c = persistableBundle;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((defpackage.rab) obj, (aoln) obj2).b(aojh.a);
        }
        if (i == 1) {
            return c((ixh) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 2) {
            return c((efx) obj, (aoln) obj2).b(aojh.a);
        }
        return c((twk) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x014f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0153  */
    /* JADX WARN: Code duplicated, block: B:61:0x0158  */
    public final java.lang.Object b(java.lang.Object obj) {
        ixe ixeVar;
        int i = this.$cid;
        if (i == 0) {
            aooc.af(obj);
            akzx akzxVarP = ((defpackage.rab) this.a).p();
            aooh.f(akzxVarP, "builder");
            java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(j$.util.DesugarCollections.unmodifiableMap(((defpackage.rab) akzxVarP.b).b));
            aooh.e(mapUnmodifiableMap, "getVoicePromoDataMap(...)");
            new alcv(mapUnmodifiableMap);
            java.lang.String str = this.b;
            aooh.f(str, "key");
            java.lang.Object obj2 = this.c;
            aooh.f(obj2, "value");
            j$.util.Objects.requireNonNull(str);
            j$.util.Objects.requireNonNull(obj2);
            akzxVarP.u();
            defpackage.rab rabVar = (defpackage.rab) akzxVarP.b;
            albe albeVar = rabVar.b;
            if (!albeVar.b) {
                rabVar.b = albeVar.a();
            }
            rabVar.b.put(str, obj2);
            alad aladVarP = akzxVarP.p();
            aooh.e(aladVarP, "build(...)");
            return (defpackage.rab) aladVarP;
        }
        if (i != 1) {
            if (i == 2) {
                aooc.af(obj);
                defpackage.uzx uzxVarCh = wsc.ch(((twk) this.a).p());
                uzxVarCh.B();
                uzxVarCh.A(this.b, (defpackage.tvz) this.c);
                return uzxVarCh.z();
            }
            aooc.af(obj);
            efx efxVar = (efx) this.a;
            java.lang.String str2 = this.b;
            java.lang.Object obj3 = this.c;
            efw efwVarS = dzk.s(str2);
            aooh.f(obj3, "<this>");
            android.os.Parcel parcelObtain = android.os.Parcel.obtain();
            aooh.e(parcelObtain, "obtain(...)");
            try {
                parcelObtain.writePersistableBundle((android.os.PersistableBundle) obj3);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                aooh.c(bArrMarshall);
                efxVar.e(efwVarS, bArrMarshall);
                return aojh.a;
            } catch (java.lang.Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        aooc.af(obj);
        ixh ixhVar = (ixh) this.a;
        alat alatVar = ixhVar.e;
        aooh.e(alatVar, "getBeeslyGreetingsList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj4 : alatVar) {
            ixd ixdVar = (ixd) obj4;
            int i2 = ixdVar.b;
            if (ixc.a(i2) == ixc.a) {
                if (aooh.n(java.util.Locale.forLanguageTag((i2 == 1 ? (ixe) ixdVar.c : ixe.a).c).getLanguage(), this.b)) {
                    arrayList2.add(obj4);
                }
            }
            arrayList.add(obj4);
        }
        aoiu aoiuVar = new aoiu(arrayList, arrayList2);
        java.lang.Object obj5 = aoiuVar.a;
        java.lang.Object obj6 = aoiuVar.b;
        java.lang.Object obj7 = this.c;
        java.util.List list = (java.util.List) obj5;
        java.util.List<ixd> list2 = (java.util.List) obj6;
        her herVarM = hhb.m(ixhVar.p());
        herVarM.n();
        herVarM.m();
        herVarM.n();
        herVarM.k(list);
        herVarM.n();
        ixd ixdVar2 = (ixd) obj7;
        herVarM.l(ixdVar2);
        boolean z = false;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (ixc.a(((ixd) it.next()).b) == ixc.b) {
                    z = true;
                    break;
                }
            }
        }
        if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
            for (ixd ixdVar3 : list2) {
                if (aooh.n((ixdVar3.b == 1 ? (ixe) ixdVar3.c : ixe.a).b, ixhVar.d)) {
                    java.lang.String str3 = (ixdVar2.b == 1 ? (ixe) ixdVar2.c : ixe.a).b;
                    aooh.e(str3, "getId(...)");
                    herVarM.i(str3);
                }
            }
            if (!z) {
                if (ixdVar2.b == 1) {
                    ixeVar = (ixe) ixdVar2.c;
                } else {
                    ixeVar = ixe.a;
                }
                java.lang.String str4 = ixeVar.b;
                aooh.e(str4, "getId(...)");
                herVarM.i(str4);
                herVarM.j(ixg.b);
            }
        } else if (!z) {
            if (ixdVar2.b == 1) {
                ixeVar = (ixe) ixdVar2.c;
            } else {
                ixeVar = ixe.a;
            }
            java.lang.String str5 = ixeVar.b;
            aooh.e(str5, "getId(...)");
            herVarM.i(str5);
            herVarM.j(ixg.b);
        }
        return herVarM.h();
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.rae raeVar = new defpackage.rae(this.b, (defpackage.raa) this.c, aolnVar, 0);
            raeVar.a = obj;
            return raeVar;
        }
        if (i == 1) {
            defpackage.rae raeVar2 = new defpackage.rae(this.b, (ixd) this.c, aolnVar, 1);
            raeVar2.a = obj;
            return raeVar2;
        }
        if (i != 2) {
            defpackage.rae raeVar3 = new defpackage.rae(this.b, (android.os.PersistableBundle) this.c, aolnVar, 3);
            raeVar3.a = obj;
            return raeVar3;
        }
        defpackage.rae raeVar4 = new defpackage.rae(this.b, (defpackage.tvz) this.c, aolnVar, 2);
        raeVar4.a = obj;
        return raeVar4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rae(java.lang.String str, ixd ixdVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = str;
        this.c = ixdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rae(java.lang.String str, defpackage.raa raaVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = str;
        this.c = raaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rae(java.lang.String str, defpackage.tvz tvzVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = str;
        this.c = tvzVar;
    }
}
