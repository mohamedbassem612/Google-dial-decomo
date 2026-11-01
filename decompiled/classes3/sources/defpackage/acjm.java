package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acjm implements defpackage.aciu {
    public static final /* synthetic */ int c = 0;
    private static final aiof d = aiof.i("GnpSdk");
    public final defpackage.acip a;
    public final acit b;
    private final aoss e;
    private final acal f;
    private final java.util.Map g;
    private final java.util.Map h;
    private final java.util.Set i;

    public acjm(defpackage.acip acipVar, aoss aossVar, acit acitVar, acal acalVar) {
        aooh.f(acipVar, "promotionDisplayEventsListener");
        aooh.f(aossVar, "backgroundScope");
        aooh.f(acitVar, "userActionUtil");
        aooh.f(acalVar, "clearcutLogger");
        this.a = acipVar;
        this.e = aossVar;
        this.b = acitVar;
        this.f = acalVar;
        this.g = new java.util.LinkedHashMap();
        this.h = new java.util.LinkedHashMap();
        this.i = new java.util.LinkedHashSet();
    }

    private final adtz h(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, java.util.List list) {
        try {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                akkd akkdVar = (akkd) it.next();
                defpackage.akkc akkcVarB = defpackage.akkc.b(akkdVar.c);
                if (akkcVarB == null) {
                    akkcVarB = defpackage.akkc.UNSPECIFIED;
                }
                if (akkcVarB == defpackage.akkc.LIGHT) {
                    java.util.Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        akkd akkdVar2 = (akkd) it2.next();
                        defpackage.akkc akkcVarB2 = defpackage.akkc.b(akkdVar2.c);
                        if (akkcVarB2 == null) {
                            akkcVarB2 = defpackage.akkc.UNSPECIFIED;
                        }
                        if (akkcVarB2 == defpackage.akkc.DARK) {
                            return new adub(new aoiu(akkdVar, akkdVar2));
                        }
                    }
                    throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (java.util.NoSuchElementException e) {
            i(promoContext, defpackage.acir.f);
            return new defpackage.adtw(e, adty.U);
        }
    }

    private final void i(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, defpackage.acir acirVar) {
        aoov.an(this.e, (aolr) null, 0, new defpackage.xhb(this, promoContext, acirVar, (aoln) null, 13), 3);
    }

    @Override // defpackage.aciu
    public final aozh a(java.lang.String str) {
        java.lang.Object objComputeIfAbsent = j$.util.Map.-EL.computeIfAbsent(this.h, str, new defpackage.vxb(new defpackage.abiy(17), 18));
        aooh.e(objComputeIfAbsent, "computeIfAbsent(...)");
        return (aozh) objComputeIfAbsent;
    }

    @Override // defpackage.aciu
    public final void b(java.lang.String str) {
        java.util.Map map = this.g;
        if (map.containsKey(str) && map.containsKey(str)) {
            boolean zContains = this.i.contains(str);
            aiof aiofVar = d;
            if (zContains) {
                aiofVar.b().v("GnpInAppUi subscriber removed after promotion was rendered. Reporting dismissal.");
                c(str);
            } else {
                aiofVar.b().v("GnpInAppUi subscriber removed before promotion was rendered. Reporting failure.");
                d(str, defpackage.acir.h);
            }
        }
    }

    @Override // defpackage.aciu
    public final void c(java.lang.String str) {
        java.lang.String str2;
        java.lang.Object next;
        java.util.Map map = this.g;
        if (map.containsKey(str)) {
            str2 = str;
        } else {
            java.util.Iterator it = map.entrySet().iterator();
            while (true) {
                str2 = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext = (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) ((java.util.Map.Entry) next).getValue();
                if ((promoContext.c().b & 1) != 0) {
                    akhq akhqVar = promoContext.c().c;
                    if (akhqVar == null) {
                        akhqVar = akhq.a;
                    }
                    if (akhqVar.c.size() <= 0) {
                        continue;
                    } else {
                        akhq akhqVar2 = promoContext.c().c;
                        if (akhqVar2 == null) {
                            akhqVar2 = akhq.a;
                        }
                        if (aooh.n(defpackage.abxl.r(akhqVar2), str)) {
                            break;
                        }
                    }
                }
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) next;
            if (entry != null) {
                str2 = (java.lang.String) entry.getKey();
            }
        }
        if (str2 == null) {
            d.d().y("Received dismissal for unknown promotion key: %s", str);
            f(str);
            return;
        }
        java.lang.Object obj = map.get(str2);
        if (obj == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        g((com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) obj, 3);
        f(str2);
    }

    @Override // defpackage.aciu
    public final void d(java.lang.String str, defpackage.acir acirVar) {
        java.util.Set set = this.i;
        if (set.contains(str)) {
            return;
        }
        java.util.Map map = this.g;
        if (!map.containsKey(str)) {
            d.d().y("Received impression for unknown promotion key: %s", str);
            f(str);
            return;
        }
        java.lang.Object obj = map.get(str);
        if (obj == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        i((com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) obj, acirVar);
        set.add(str);
        if (acirVar != defpackage.acir.a) {
            f(str);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:126:0x0257  */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0187  */
    @Override // defpackage.aciu
    public final java.lang.Object e(android.os.Parcelable parcelable, int i, aoln aolnVar) throws aois {
        java.lang.String strValueOf;
        java.lang.String str;
        defpackage.aciv acivVar;
        boolean z;
        adtz adubVar;
        int i2;
        java.lang.Object objA;
        try {
            aooh.d(parcelable, "null cannot be cast to non-null type com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext");
            com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext = (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) parcelable;
            akjx akjxVar = promoContext.c().h;
            if (akjxVar == null) {
                akjxVar = akjx.a;
            }
            akjw akjwVarB = akjw.b(akjxVar.e);
            if (akjwVarB == null) {
                akjwVarB = akjw.a;
            }
            if (akjwVarB.ordinal() != 16) {
                i(promoContext, defpackage.acir.d);
                adubVar = new defpackage.adtw(new java.lang.IllegalArgumentException("Unsupported UI type"), adty.R);
            } else {
                akjx akjxVar2 = promoContext.c().h;
                if (akjxVar2 == null) {
                    akjxVar2 = akjx.a;
                }
                defpackage.akkh akkhVar = akjxVar2.c == 5 ? (defpackage.akkh) akjxVar2.d : defpackage.akkh.a;
                aooh.e(akkhVar, "getTooltipUi(...)");
                int i3 = akkhVar.c;
                int iA = akky.a(i3);
                if (iA == 0) {
                    throw null;
                }
                int i4 = iA - 1;
                if (i4 == 0) {
                    strValueOf = i3 == 1 ? (java.lang.String) akkhVar.d : "";
                } else if (i4 == 1) {
                    i(promoContext, defpackage.acir.d);
                    adubVar = new defpackage.adtw(new java.lang.IllegalArgumentException("Element tag isn't supported for Jetpack Compose tooltip."), adty.T);
                } else if (i4 == 2) {
                    strValueOf = java.lang.String.valueOf(i3 == 9 ? ((java.lang.Integer) akkhVar.d).intValue() : 0);
                } else {
                    if (i4 != 3) {
                        throw new aois();
                    }
                    i(promoContext, defpackage.acir.d);
                    adubVar = new defpackage.adtw(new java.lang.IllegalArgumentException("Tooltip target not set."), adty.S);
                }
                java.lang.String str2 = strValueOf;
                aooh.c(str2);
                alat alatVar = akkhVar.j;
                aooh.e(alatVar, "getStylingSchemeList(...)");
                adtz adtzVarH = h(promoContext, alatVar);
                int iB = a.b(adtzVarH);
                if (iB == 0) {
                    aoiu aoiuVar = (aoiu) ((adub) adtzVarH).a;
                    akkd akkdVar = (akkd) aoiuVar.a;
                    akkd akkdVar2 = (akkd) aoiuVar.b;
                    if ((akkhVar.b & 32) != 0) {
                        akjc akjcVar = akkhVar.k;
                        if (akjcVar == null) {
                            akjcVar = akjc.a;
                        }
                        alat alatVar2 = akjcVar.h;
                        aooh.e(alatVar2, "getStylingSchemeList(...)");
                        adtz adtzVarH2 = h(promoContext, alatVar2);
                        int iB2 = a.b(adtzVarH2);
                        if (iB2 == 0) {
                            aoiu aoiuVar2 = (aoiu) ((adub) adtzVarH2).a;
                            akkd akkdVar3 = (akkd) aoiuVar2.a;
                            akkd akkdVar4 = (akkd) aoiuVar2.b;
                            akjc akjcVar2 = akkhVar.k;
                            if (akjcVar2 == null) {
                                akjcVar2 = akjc.a;
                            }
                            java.lang.String str3 = akjcVar2.f;
                            aooh.e(str3, "getButtonText(...)");
                            akiv akivVar = akkdVar3.d;
                            if (akivVar == null) {
                                akivVar = akiv.a;
                            }
                            defpackage.amml ammlVar = akivVar.c;
                            if (ammlVar == null) {
                                ammlVar = defpackage.amml.a;
                            }
                            defpackage.amml ammlVar2 = ammlVar;
                            aooh.e(ammlVar2, "getPrimary(...)");
                            akiv akivVar2 = akkdVar4.d;
                            if (akivVar2 == null) {
                                akivVar2 = akiv.a;
                            }
                            defpackage.amml ammlVar3 = akivVar2.c;
                            if (ammlVar3 == null) {
                                ammlVar3 = defpackage.amml.a;
                            }
                            aooh.e(ammlVar3, "getPrimary(...)");
                            str = str2;
                            acivVar = new defpackage.aciv(str3, ammlVar2, ammlVar3, new ajx(this, parcelable, akkhVar, str, 12));
                        } else {
                            if (iB2 != 1) {
                                throw new aois();
                            }
                            adubVar = (adtv) adtzVarH2;
                        }
                    } else {
                        str = str2;
                        acivVar = null;
                    }
                    if (afsg.a()) {
                        akjx akjxVar3 = promoContext.c().h;
                        if (akjxVar3 == null) {
                            akjxVar3 = akjx.a;
                        }
                        int iAQ = a.aQ(akjxVar3.h);
                        if (iAQ == 0 || iAQ != 3) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    java.lang.String str4 = akkhVar.h;
                    aooh.e(str4, "getBodyText(...)");
                    java.lang.String str5 = akkhVar.g;
                    aooh.e(str5, "getHeadlineText(...)");
                    defpackage.acix acixVarM = defpackage.abxl.m(akkdVar);
                    defpackage.acix acixVarM2 = defpackage.abxl.m(akkdVar2);
                    boolean z2 = !z;
                    defpackage.akkg akkgVarB = defpackage.akkg.b(akkhVar.l);
                    if (akkgVarB == null) {
                        akkgVarB = defpackage.akkg.UNKNOWN;
                    }
                    int iOrdinal = akkgVarB.ordinal();
                    if (iOrdinal == 0) {
                        i2 = 1;
                    } else if (iOrdinal == 1) {
                        i2 = 2;
                    } else {
                        if (iOrdinal != 2) {
                            throw new aois();
                        }
                        i2 = 3;
                    }
                    adubVar = new adub(new defpackage.aciw(str, str4, str5, acixVarM, acixVarM2, 3, z2, i2, acivVar));
                } else {
                    if (iB != 1) {
                        throw new aois();
                    }
                    adubVar = (adtv) adtzVarH;
                }
            }
            if (adubVar.g()) {
                hgb.b(d.d(), "Failed to create promotion data.", adubVar.f());
                return aojh.a;
            }
            java.lang.Object objD = adubVar.d();
            if (objD == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            defpackage.aciw aciwVar = (defpackage.aciw) objD;
            java.lang.String str6 = aciwVar.a;
            java.util.Map map = this.h;
            if (map.containsKey(str6)) {
                java.lang.Object obj = map.get(str6);
                if (obj == null) {
                    throw new java.lang.IllegalStateException("Required value was null.");
                }
                if (((java.lang.Number) ((aozj) obj).b().c()).intValue() != 0) {
                    akjx akjxVar4 = promoContext.c().h;
                    if (akjxVar4 == null) {
                        akjxVar4 = akjx.a;
                    }
                    if (!akjxVar4.f) {
                        this.f.k(promoContext);
                        this.g.put(str6, parcelable);
                        java.lang.Object obj2 = map.get(str6);
                        if (obj2 == null) {
                            throw new java.lang.IllegalStateException("Required value was null.");
                        }
                        ((aozj) obj2).e(aciwVar);
                        return aojh.a;
                    }
                    java.lang.Object objA2 = this.a.a(promoContext, defpackage.acir.a, aolnVar);
                    if (objA2 == aolu.a) {
                        return objA2;
                    }
                } else {
                    objA = this.a.a(promoContext, defpackage.acir.h, aolnVar);
                    if (objA == aolu.a) {
                        return objA;
                    }
                }
            } else {
                objA = this.a.a(promoContext, defpackage.acir.h, aolnVar);
                if (objA == aolu.a) {
                    return objA;
                }
            }
            return aojh.a;
        } catch (java.lang.Exception e) {
            hgb.b(d.c(), "Invalid promoContextParcelable send for GnpInAppUi rendering", e);
            return aojh.a;
        }
    }

    public final void f(java.lang.String str) {
        aozj aozjVar = (aozj) this.h.get(str);
        if (aozjVar != null) {
            aozjVar.e((java.lang.Object) null);
        }
        this.i.remove(str);
        this.g.remove(str);
    }

    public final void g(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, int i) {
        aoov.an(this.e, (aolr) null, 0, new kgx(this, promoContext, i, (aoln) null, 11), 3);
    }
}
