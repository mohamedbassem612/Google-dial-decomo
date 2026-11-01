package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adyg implements defpackage.adye, defpackage.zzb {
    public static final defpackage.aiof a = defpackage.aiof.i("GnpSdk");
    public final defpackage.aeeg b;
    public final defpackage.aeco c;
    private final defpackage.aata d;
    private final java.util.Set e;
    private final java.util.Set f;
    private final defpackage.aoss g;
    private final defpackage.aoin h;
    private final android.content.Context i;
    private final defpackage.aduu j;
    private final java.util.Set k;
    private final java.util.concurrent.atomic.AtomicBoolean l;

    public adyg(defpackage.aeeg aeegVar, defpackage.aata aataVar, java.util.Set set, java.util.Set set2, defpackage.aazc aazcVar, defpackage.aeco aecoVar, defpackage.aoss aossVar, defpackage.aoin aoinVar, android.content.Context context, defpackage.aduu aduuVar) {
        defpackage.aooh.f(aazcVar, "clock");
        defpackage.aooh.f(aossVar, "backgroundScope");
        defpackage.aooh.f(aoinVar, "clientStreamz");
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(aduuVar, "gnpConfig");
        this.b = aeegVar;
        this.d = aataVar;
        this.e = set;
        this.f = set2;
        this.c = aecoVar;
        this.g = aossVar;
        this.h = aoinVar;
        this.i = context;
        this.j = aduuVar;
        this.k = defpackage.ajsz.aJ(defpackage.ajsz.aI(set, set2), "CHIME");
        this.l = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // defpackage.zzb
    public final void a(defpackage.zzc zzcVar) {
        java.lang.String str;
        adtx adtxVar;
        java.lang.String str2;
        java.lang.String simpleName;
        java.lang.String str3 = zzcVar.j;
        if (str3 == null || !this.k.contains(str3) || ((defpackage.zzd) zzcVar.a).d() || (str = zzcVar.i) == null) {
            return;
        }
        android.content.Context context = this.i;
        defpackage.aeeg aeegVar = this.b;
        defpackage.aeco aecoVar = this.c;
        java.lang.String packageName = context.getPackageName();
        java.util.List listAY = defpackage.ajsz.aY(aecp.b);
        defpackage.aooh.f(listAY, "experimentTypes");
        defpackage.aeeu aeeuVar = (defpackage.aeeu) aeegVar;
        java.util.Map map = (java.util.Map) aeeuVar.c.get();
        if (map != null) {
            adtxVar = new defpackage.adub(defpackage.aeeu.f(map, str, listAY));
        } else {
            defpackage.aosy aosyVarAm = defpackage.aoov.am(aeeuVar.b, 0, new uhy(aeeuVar, aecoVar, str, listAY, (defpackage.aoln) null, 9), 3);
            adtxVar = aosyVarAm.x() ? (defpackage.adtz) aosyVarAm.b() : new adtx("Experiments are not available yet.", defpackage.adty.J);
        }
        if (adtxVar instanceof defpackage.adub) {
            java.util.List list = (java.util.List) ((defpackage.adub) adtxVar).a;
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Integer.valueOf(((aecq) it.next()).c));
            }
            zzcVar.g(defpackage.ajsz.cm(arrayList));
            str2 = packageName;
            ((defpackage.aeey) this.h.a()).f(str2, this.j.a, aecoVar.name(), "SUCCESS", "");
        } else {
            str2 = packageName;
        }
        if (adtxVar instanceof defpackage.adtv) {
            defpackage.adtv adtvVar = (defpackage.adtv) adtxVar;
            boolean z = adtvVar instanceof adud;
            if (z) {
                adtvVar.b();
                defpackage.aesg.p(str);
                adtvVar.b().getMessage();
                simpleName = "";
            } else {
                simpleName = adtvVar.b().getClass().getSimpleName();
                defpackage.aooh.e(simpleName, "getSimpleName(...)");
                ((defpackage.aiob) ((defpackage.aiob) a.d()).k(adtvVar.b())).y("Could not retrieve experiments for account %s", defpackage.aesg.p(str));
            }
            java.lang.String str4 = simpleName;
            java.lang.String str5 = true != z ? "FAILURE" : "TRANSIENT_FAILURE";
            ((defpackage.aeey) this.h.a()).f(str2, this.j.a, aecoVar.name(), str5, str4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0126  */
    /* JADX WARN: Code duplicated, block: B:42:0x012d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0147 A[LOOP:0: B:43:0x0141->B:45:0x0147, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x015f  */
    /* JADX WARN: Code duplicated, block: B:51:0x016d A[LOOP:1: B:49:0x0167->B:51:0x016d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.adye
    public final java.lang.Object b(java.lang.String str, java.util.List list, java.util.List list2, defpackage.aoln aolnVar) {
        adyf adyfVar;
        java.lang.String packageName;
        java.lang.String str2;
        defpackage.adtz adtzVar;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        int[] iArrCm;
        defpackage.ailj it2;
        if (aolnVar instanceof adyf) {
            adyfVar = (adyf) aolnVar;
            int i = adyfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                adyfVar.c = i - Integer.MIN_VALUE;
            } else {
                adyfVar = new adyf(this, aolnVar);
            }
        } else {
            adyfVar = new adyf(this, aolnVar);
        }
        java.lang.Object objBQ = adyfVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = adyfVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                packageName = adyfVar.d;
                defpackage.aooc.af(objBQ);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.String str3 = adyfVar.d;
                defpackage.aooc.af(objBQ);
                str2 = str3;
            }
            adtzVar = (defpackage.adtz) objBQ;
            if (adtzVar instanceof defpackage.adub) {
                java.util.List list3 = (java.util.List) ((defpackage.adub) adtzVar).a;
                arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(new java.lang.Integer(((aecq) it.next()).c));
                }
                iArrCm = defpackage.ajsz.cm(arrayList);
                if (iArrCm.length != 0) {
                    it2 = ((defpackage.aile) this.f).iterator();
                    while (it2.hasNext()) {
                        this.d.s(iArrCm, "GNP_NAMESPACE#".concat(java.lang.String.valueOf(str2)), (java.lang.String) it2.next());
                    }
                }
                ((defpackage.aeey) this.h.a()).f(str2, this.j.a, this.c.name(), "SUCCESS", "");
            }
            if (adtzVar instanceof defpackage.adtv) {
                defpackage.adtv adtvVar = (defpackage.adtv) adtzVar;
                ((defpackage.aiob) ((defpackage.aiob) a.d()).k(adtvVar.b())).v("Failed to get experiments, continue without setting external experiment IDs.");
                ((defpackage.aeey) this.h.a()).f(str2, this.j.a, this.c.name(), "FAILURE", adtvVar.b().getClass().getSimpleName());
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(objBQ);
        c();
        android.content.Context context = this.i;
        j$.time.Instant instantNow = j$.time.Instant.now();
        packageName = context.getPackageName();
        defpackage.aokv aokvVar = new defpackage.aokv(10);
        if (!list.isEmpty()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
            java.util.Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                int iIntValue = ((java.lang.Number) it3.next()).intValue();
                aecp aecpVar = aecp.b;
                defpackage.aooh.c(instantNow);
                arrayList2.add(new aecq(0, str, iIntValue, aecpVar, instantNow, this.c));
            }
            aokvVar.addAll(arrayList2);
        }
        if (!list2.isEmpty()) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(defpackage.ajsz.bl(list2, 10));
            java.util.Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                int iIntValue2 = ((java.lang.Number) it4.next()).intValue();
                aecp aecpVar2 = aecp.c;
                defpackage.aooh.c(instantNow);
                arrayList3.add(new aecq(0, str, iIntValue2, aecpVar2, instantNow, this.c));
            }
            aokvVar.addAll(arrayList3);
        }
        java.util.List listAX = defpackage.ajsz.aX(aokvVar);
        if (!listAX.isEmpty()) {
            defpackage.aeeg aeegVar = this.b;
            defpackage.aeco aecoVar = this.c;
            adyfVar.d = packageName;
            adyfVar.c = 1;
            defpackage.aeeu aeeuVar = (defpackage.aeeu) aeegVar;
            objBQ = defpackage.agab.bQ(aeeuVar.d, new aeer(aeeuVar, aecoVar, listAX, (defpackage.aoln) null, 0), adyfVar);
            if (objBQ == aoluVar) {
                return aoluVar;
            }
        }
        defpackage.aeeg aeegVar2 = this.b;
        defpackage.aeco aecoVar2 = this.c;
        java.util.List listBb = defpackage.ajsz.bb(aecp.c, aecp.b);
        adyfVar.d = packageName;
        adyfVar.c = 2;
        objBQ = aeegVar2.a(aecoVar2, listBb, adyfVar);
        if (objBQ != aoluVar) {
            return aoluVar;
        }
        str2 = packageName;
        adtzVar = (defpackage.adtz) objBQ;
        if (adtzVar instanceof defpackage.adub) {
            java.util.List list4 = (java.util.List) ((defpackage.adub) adtzVar).a;
            arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list4, 10));
            it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(new java.lang.Integer(((aecq) it.next()).c));
            }
            iArrCm = defpackage.ajsz.cm(arrayList);
            if (iArrCm.length != 0) {
                it2 = ((defpackage.aile) this.f).iterator();
                while (it2.hasNext()) {
                    this.d.s(iArrCm, "GNP_NAMESPACE#".concat(java.lang.String.valueOf(str2)), (java.lang.String) it2.next());
                }
            }
            ((defpackage.aeey) this.h.a()).f(str2, this.j.a, this.c.name(), "SUCCESS", "");
        }
        if (adtzVar instanceof defpackage.adtv) {
            defpackage.adtv adtvVar2 = (defpackage.adtv) adtzVar;
            ((defpackage.aiob) ((defpackage.aiob) a.d()).k(adtvVar2.b())).v("Failed to get experiments, continue without setting external experiment IDs.");
            ((defpackage.aeey) this.h.a()).f(str2, this.j.a, this.c.name(), "FAILURE", adtvVar2.b().getClass().getSimpleName());
        }
        return defpackage.aojh.a;
        defpackage.adtz adtzVar2 = (defpackage.adtz) objBQ;
        if (adtzVar2 instanceof defpackage.adtv) {
            ((defpackage.aiob) ((defpackage.aiob) a.d()).k(((defpackage.adtv) adtzVar2).b())).v("Failed to insert experiments, continuing without setting external experiment IDs.");
        }
        defpackage.aeeg aeegVar3 = this.b;
        defpackage.aeco aecoVar3 = this.c;
        java.util.List listBb2 = defpackage.ajsz.bb(aecp.c, aecp.b);
        adyfVar.d = packageName;
        adyfVar.c = 2;
        objBQ = aeegVar3.a(aecoVar3, listBb2, adyfVar);
        if (objBQ != aoluVar) {
            return aoluVar;
        }
        str2 = packageName;
        adtzVar = (defpackage.adtz) objBQ;
        if (adtzVar instanceof defpackage.adub) {
            java.util.List list5 = (java.util.List) ((defpackage.adub) adtzVar).a;
            arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list5, 10));
            it = list5.iterator();
            while (it.hasNext()) {
                arrayList.add(new java.lang.Integer(((aecq) it.next()).c));
            }
            iArrCm = defpackage.ajsz.cm(arrayList);
            if (iArrCm.length != 0) {
                it2 = ((defpackage.aile) this.f).iterator();
                while (it2.hasNext()) {
                    this.d.s(iArrCm, "GNP_NAMESPACE#".concat(java.lang.String.valueOf(str2)), (java.lang.String) it2.next());
                }
            }
            ((defpackage.aeey) this.h.a()).f(str2, this.j.a, this.c.name(), "SUCCESS", "");
        }
        if (adtzVar instanceof defpackage.adtv) {
            defpackage.adtv adtvVar3 = (defpackage.adtv) adtzVar;
            ((defpackage.aiob) ((defpackage.aiob) a.d()).k(adtvVar3.b())).v("Failed to get experiments, continue without setting external experiment IDs.");
            ((defpackage.aeey) this.h.a()).f(str2, this.j.a, this.c.name(), "FAILURE", adtvVar3.b().getClass().getSimpleName());
        }
        return defpackage.aojh.a;
    }

    @Override // defpackage.adye
    public final void c() {
        if (this.l.compareAndSet(false, true)) {
            defpackage.zzd.j(this);
            defpackage.aoov.an(this.g, null, 0, new acbt(this, (defpackage.aoln) null, 20), 3);
        }
    }
}
