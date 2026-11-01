package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class mkm implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ mkm(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x036f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a4  */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v52, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, ucw] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v35, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v63, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v30, types: [cxi, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj) {
        android.content.res.ColorStateList colorStateListValueOf;
        java.lang.String str;
        pdv pdvVarB;
        aonj aonjVarE;
        boolean z = false;
        akyp akypVar = null;
        switch (this.$cid) {
            case 0:
                diq diqVar = (diq) obj;
                aooh.f(diqVar, "$this$semantics");
                dfb.o(diqVar, 0);
                dfb.q(diqVar, (java.lang.String) this.a);
                dfb.h(diqVar, (java.lang.String) this.b, new defpackage.kgq(this.c, 17));
                return aojh.a;
            case 1:
                java.lang.Object obj2 = this.b;
                ahpz ahpzVar = ((defpackage.kxr) obj2).i;
                java.lang.Object obj3 = this.a;
                ahok ahokVarF = ahpzVar.f(231, "CallRecorder.onMediaPlayerPrepared");
                try {
                    defpackage.kxr.a.b().l("com/android/dialer/callrecording/impl/service/CallRecorder", "playAudio", 508, "CallRecorder.java").y("set state: %s", obj3);
                    ((defpackage.kxr) obj2).k.set(obj3);
                    ((defpackage.kxr) obj2).o.a(ajcm.a);
                    java.lang.Object obj4 = this.c;
                    ahokVarF.close();
                    ((defpackage.oii) obj4).m();
                    return aojh.a;
                } catch (java.lang.Throwable th) {
                    try {
                        ahokVarF.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case 2:
                bar barVar = (bar) obj;
                aooh.f(barVar, "$this$LazyRow");
                java.util.Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    barVar.a((java.lang.Object) null, (java.lang.Object) null, new cja(780123116, true, new jai((oui) it.next(), this.c, this.a, 3, (byte[]) null)));
                }
                return aojh.a;
            case 3:
                return this.b == zmw.b ? android.text.TextUtils.concat(((android.content.Context) this.a).getText(2132017465), " ", (java.lang.String) obj).toString() : this.c;
            case 4:
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) obj;
                aooh.f(linearLayout, "iconsContainer");
                aimz aimzVar = pnb.a;
                aimw aimwVarL = aimzVar.b().l("com/android/dialer/incall/contactgrid/ContactGridSubscriber", "updateBottomRow$<anonymous>", 653, "ContactGridSubscriber.kt");
                pom pomVar = (pom) this.c;
                java.util.List<pmr> list = pomVar.k;
                int size = list.size();
                java.lang.Object obj5 = this.b;
                aimwVarL.B("updating to %d icons with color scheme: %s", size, obj5);
                linearLayout.removeAllViews();
                if (list.isEmpty()) {
                    linearLayout.setVisibility(8);
                    return aojh.a;
                }
                pnb pnbVar = (pnb) this.a;
                j$.util.Optional optionalE = pnbVar.k.e(pomVar.a);
                aooh.e(optionalE, "get(...)");
                if (((apqr) aooh.q(optionalE)) == null) {
                    aimzVar.d().i(zct.b).l("com/android/dialer/incall/contactgrid/ContactGridSubscriber", "updateBottomRow$<anonymous>", 662, "ContactGridSubscriber.kt").v("callScope is not found");
                    linearLayout.setVisibility(8);
                    return aojh.a;
                }
                linearLayout.setVisibility(0);
                android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(linearLayout.getContext());
                aooh.e(layoutInflaterFrom, "from(...)");
                for (pmr pmrVar : list) {
                    android.view.View viewInflate = layoutInflaterFrom.inflate(2131624103, (android.view.ViewGroup) linearLayout, false);
                    aooh.d(viewInflate, "null cannot be cast to non-null type android.widget.ImageView");
                    android.widget.ImageView imageView = (android.widget.ImageView) viewInflate;
                    imageView.setTag(2131428357, pmrVar.a);
                    imageView.setImageDrawable(pmrVar.d);
                    imageView.setContentDescription(pmrVar.b);
                    if (obj5 != poh.c) {
                        android.content.Context context = linearLayout.getContext();
                        aooh.e(context, "getContext(...)");
                        if (pnbVar.m((poh) obj5, context)) {
                            colorStateListValueOf = android.content.res.ColorStateList.valueOf(pnbVar.b.getColor(2131099860));
                        } else {
                            colorStateListValueOf = android.content.res.ColorStateList.valueOf(urg.c(pnbVar.b, 2130968958));
                        }
                    } else {
                        colorStateListValueOf = android.content.res.ColorStateList.valueOf(pnbVar.b.getColor(2131099860));
                    }
                    imageView.setImageTintList(colorStateListValueOf);
                    imageView.setImportantForAccessibility(2);
                    linearLayout.addView(imageView);
                }
                return aojh.a;
            case 5:
                pom pomVar2 = (pom) this.b;
                if (pnb.o(pomVar2.l) && !pomVar2.m) {
                    ((pnb) this.a).f(mce.E, (java.lang.String) this.c);
                }
                return aojh.a;
            case 6:
                abxt abxtVar = (abxt) obj;
                if (abxtVar == null) {
                    str = null;
                } else {
                    abxp abxpVar = abxtVar.c;
                    if (abxpVar == null) {
                        abxpVar = abxp.a;
                    }
                    if (abxpVar == null) {
                        str = null;
                    } else {
                        abxs abxsVar = abxpVar.b == 1 ? (abxs) abxpVar.c : abxs.a;
                        if (abxsVar != null) {
                            str = abxsVar.f;
                        } else {
                            str = null;
                        }
                    }
                }
                java.lang.Object obj6 = this.a;
                java.lang.Object obj7 = this.b;
                if (abxtVar != null && str != null) {
                    abxp abxpVar2 = abxtVar.c;
                    if (abxpVar2 == null) {
                        abxpVar2 = abxp.a;
                    }
                    if (abxpVar2 != null) {
                        abxs abxsVar2 = abxpVar2.b == 1 ? (abxs) abxpVar2.c : abxs.a;
                        if (abxsVar2 != null) {
                            akypVar = abxsVar2.f;
                        }
                    }
                    if (akypVar == null) {
                        pdvVarB = pez.e(pdv.a.m()).b();
                    } else {
                        oyx oyxVarE = pez.e(pdv.a.m());
                        oyx oyxVarF = pez.f(pdu.a.m());
                        if ((abxtVar.b & 1) != 0) {
                            abxp abxpVar3 = abxtVar.c;
                            if ((abxpVar3 == null ? abxp.a : abxpVar3).b == 1) {
                                if (abxpVar3 == null) {
                                    abxpVar3 = abxp.a;
                                }
                                oyxVarF.f((abxpVar3.b == 1 ? (abxs) abxpVar3.c : abxs.a).c);
                                oyxVarF.g((abxpVar3.b == 1 ? (abxs) abxpVar3.c : abxs.a).d);
                                oyxVarF.h((abxpVar3.b == 1 ? (abxs) abxpVar3.c : abxs.a).e);
                                abxs abxsVar3 = abxpVar3.b == 1 ? (abxs) abxpVar3.c : abxs.a;
                                aooh.e(abxsVar3, "getFullScreenImage(...)");
                                oyxVarF.i(saa.g(abxsVar3));
                            }
                        }
                        oyxVarF.e(akypVar);
                        oyxVarE.c(oyxVarF.d());
                        pdvVarB = oyxVarE.b();
                    }
                    ((aoot) this.c).a = pdvVarB;
                    if (obj7 != null) {
                        ((saa) obj6).e((aeun) obj7, rub.b);
                    }
                } else if (obj7 != null) {
                    ((saa) obj6).e((aeun) obj7, rub.d);
                }
                return aojh.a;
            case 7:
                abjl abjlVar = (abjl) obj;
                aooh.f(abjlVar, "transformationUiData");
                ?? r0 = this.c;
                if (r0 != 0) {
                    r0.a(abjlVar);
                }
                if (!aooh.n(abjlVar, this.b)) {
                    smj.i((ccp) this.a);
                }
                return aojh.a;
            case 8:
                java.lang.Object obj8 = this.c;
                ?? r1 = this.b;
                java.lang.String str2 = (java.lang.String) obj8;
                taq taqVarD = r1.d(str2);
                java.lang.Object obj9 = this.a;
                if (taqVarD == null) {
                    dez.m(((ucy) r1).a, false, true, new slv((java.lang.Object) r1, new taq(str2, (ucu) obj9), 15));
                } else {
                    akzx akzxVarP = ((alad) taqVarD.a).p();
                    akzxVarP.z((alad) obj9);
                    ((java.lang.Integer) dez.m(((ucy) r1).a, false, true, new slv(akzxVarP.p(), obj8, 14, (byte[]) null))).intValue();
                }
                return aojh.a;
            case 9:
                yui yuiVar = (yui) this.b;
                j$.util.concurrent.ConcurrentHashMap concurrentHashMap = yuiVar.g;
                java.lang.Object obj10 = this.c;
                concurrentHashMap.remove(obj10);
                aoov.an(yuiVar.e, (aolr) null, 0, new yuf((uyg) this.a, (java.util.UUID) obj10, (aoln) null, 0), 3);
                return aojh.a;
            case 10:
                defpackage.tw twVar = (defpackage.tw) obj;
                aooh.f(twVar, "$this$protectionComponent");
                java.lang.Object obj11 = this.a;
                aooh.f(obj11, "<this>");
                acuh acuhVar = (acuh) obj11;
                if ((acuhVar.b & 16) != 0 && (akypVar = acuhVar.g) == null) {
                    akypVar = akyp.a;
                }
                if (akypVar == null) {
                    throw new java.lang.IllegalStateException("File group " + ((acui) this.b).i + " has no custom metadata for file " + acuhVar.c);
                }
                if (!akypVar.b.equals("type.googleapis.com/google.internal.abuse.ondevicesafety.v2.ProtectionComponentMetadata")) {
                    throw new java.lang.IllegalArgumentException("Invalid protection component metadata");
                }
                java.lang.Object obj12 = this.c;
                aklb aklbVarZ = alad.z(aklb.a, akypVar.c, akzq.a());
                aooh.e(aklbVarZ, "parseFrom(...)");
                twVar.a = java.lang.Integer.valueOf(aklbVarZ.b);
                twVar.b = new xms(obj12, 18);
                return aojh.a;
            case 11:
                diq diqVar2 = (diq) obj;
                int i = abew.a;
                aooh.f(diqVar2, "$this$semantics");
                ?? r2 = this.c;
                if (r2.size() > 0) {
                    cxi cxiVarA = abew.a((ccp) this.b);
                    aokv aokvVar = new aokv(10);
                    for (abeq abeqVar : r2) {
                        if (abeqVar.e() != null) {
                            java.lang.String strD = abeqVar.d();
                            if (strD == null) {
                                strD = ((android.content.Context) this.a).getString(2132017325);
                                aooh.e(strD, "getString(...)");
                            }
                            aokvVar.add(new defpackage.dhw(strD, new xtu(abeqVar, cxiVarA, 3, (byte[]) null)));
                            if (aokvVar.b >= 31) {
                                dfb.k(diqVar2, ajsz.aX(aokvVar));
                            }
                        }
                    }
                    dfb.k(diqVar2, ajsz.aX(aokvVar));
                }
                return aojh.a;
            default:
                cpm cpmVar = (cpm) obj;
                int i2 = abew.a;
                java.lang.Object obj13 = this.b;
                if (obj13 != null) {
                    ?? r3 = this.a;
                    if (r3 == 0) {
                        throw new java.lang.IllegalStateException("layoutCoordinates should never be null!");
                    }
                    ?? r13 = this.c;
                    long j = cpmVar.a;
                    int iH = ((dkw) obj13).h(j);
                    long jM = r3.m(j);
                    for (abeq abeqVar2 : r13) {
                        if (iH >= abeqVar2.b() && iH < abeqVar2.a() && (aonjVarE = abeqVar2.e()) != null && ((java.lang.Boolean) aonjVarE.a(new cpm(jM))).booleanValue()) {
                            z = true;
                        }
                    }
                }
                return java.lang.Boolean.valueOf(z);
        }
    }

    public /* synthetic */ mkm(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ mkm(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ mkm(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ mkm(java.util.List list, android.content.Context context, ccp ccpVar, int i) {
        this.$cid = i;
        this.c = list;
        this.a = context;
        this.b = ccpVar;
    }
}
