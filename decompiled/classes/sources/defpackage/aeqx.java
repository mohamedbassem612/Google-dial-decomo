package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeqx {
    public final defpackage.aoin a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;
    public final java.lang.Object g;
    public final java.lang.Object h;
    public final java.lang.Object i;
    public final java.lang.Object j;
    public final java.lang.Object k;
    public final java.lang.Object l;
    public final java.lang.Object m;

    public aeqx(android.content.Context context, defpackage.ahyn ahynVar, java.lang.String str, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.adao adaoVar, defpackage.ahyn ahynVar2, defpackage.ahyn ahynVar3, defpackage.ahyn ahynVar4) {
        this.b = context;
        this.a = aoinVar;
        this.c = context.getPackageName();
        android.app.ActivityManager activityManager = defpackage.aepw.a;
        this.d = defpackage.aepw.c(context.getPackageName(), defpackage.aepw.b());
        if (ahynVar.f()) {
        }
        this.i = null;
        this.e = str;
        this.f = defpackage.ahvr.bI(new defpackage.fff(context, aoinVar2, 7, null));
        this.g = new defpackage.vwb(context);
        this.h = defpackage.ahvr.bI(new defpackage.aell(this, 11));
        this.m = adaoVar;
        this.j = ahynVar2;
        this.k = ahynVar3;
        this.l = ahynVar4;
    }

    public static java.lang.String i(java.util.List list) {
        return android.text.TextUtils.join(" • ", (java.lang.Iterable) j$.util.Collection.-EL.stream(list).filter(new jvr(9)).collect(defpackage.aido.a));
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [aoin, java.lang.Object] */
    public final defpackage.oko a(android.telecom.PhoneAccountHandle phoneAccountHandle, android.telephony.TelephonyManager telephonyManager) {
        defpackage.aoss aossVar = (defpackage.aoss) this.m.a();
        aossVar.getClass();
        java.util.concurrent.Executor executor = (java.util.concurrent.Executor) this.g.a();
        executor.getClass();
        defpackage.aoss aossVar2 = (defpackage.aoss) this.h.a();
        aossVar2.getClass();
        defpackage.aolr aolrVar = (defpackage.aolr) this.b.a();
        aolrVar.getClass();
        android.content.Context context = (android.content.Context) this.l.a();
        context.getClass();
        defpackage.zjv zjvVar = (defpackage.zjv) this.f.a();
        zjvVar.getClass();
        defpackage.aeqx aeqxVar = (defpackage.aeqx) this.j.a();
        aeqxVar.getClass();
        android.telecom.TelecomManager telecomManager = (android.telecom.TelecomManager) this.a.a();
        telecomManager.getClass();
        android.content.pm.PackageManager packageManager = (android.content.pm.PackageManager) this.d.a();
        packageManager.getClass();
        defpackage.aogc aogcVar = (defpackage.aogc) this.e.a();
        aogcVar.getClass();
        defpackage.okh okhVar = (defpackage.okh) this.k.a();
        okhVar.getClass();
        defpackage.rlv rlvVar = (defpackage.rlv) this.c.a();
        rlvVar.getClass();
        telephonyManager.getClass();
        return new defpackage.oko(aossVar, executor, aossVar2, aolrVar, context, zjvVar, aeqxVar, telecomManager, packageManager, aogcVar, okhVar, rlvVar, this.i, phoneAccountHandle, telephonyManager);
    }

    public final defpackage.kgu b(defpackage.kiu kiuVar) {
        defpackage.kgz kgzVar = (defpackage.kgz) ((defpackage.zjm) this.d).g().orElse((java.lang.Object) null);
        if (kgzVar != null) {
            return kgzVar.b(kiuVar);
        }
        return null;
    }

    public final j$.util.Optional c(defpackage.kiu kiuVar) {
        omz omzVar = kiuVar.J;
        if (omzVar == null) {
            omzVar = omz.a;
        }
        if (omzVar.c) {
            defpackage.zjm zjmVar = (defpackage.zjm) this.c;
            if (zjmVar.g().isPresent()) {
                return j$.util.Optional.of(((android.content.Context) ((defpackage.kaw) zjmVar.g().orElseThrow()).a).getText(2132018731));
            }
        }
        return j$.util.Optional.empty();
    }

    public final java.lang.CharSequence d(defpackage.kiu kiuVar, boolean z) {
        kiw kiwVar = kiuVar.r;
        if (kiwVar == null) {
            kiwVar = kiw.a;
        }
        if (kiwVar.r) {
            return ((android.content.Context) this.b).getText(2132018528);
        }
        if (((defpackage.kaw) this.l).t(kiuVar)) {
            return ((android.content.Context) this.b).getText(2132019476);
        }
        defpackage.kgu kguVarB = b(kiuVar);
        if (kguVarB != null && !kguVarB.h.isEmpty()) {
            return kguVarB.h;
        }
        j$.util.Optional optionalR = ((defpackage.rsr) this.i).r(kiuVar.i);
        if (optionalR.isPresent()) {
            return (java.lang.CharSequence) optionalR.orElseThrow();
        }
        if (kiuVar.s && !kiuVar.t.isEmpty()) {
            return kiuVar.t;
        }
        java.lang.Object obj = this.g;
        kiw kiwVar2 = kiuVar.r;
        if (kiwVar2 == null) {
            kiwVar2 = kiw.a;
        }
        java.lang.String strA = ((defpackage.kaw) obj).a(kiwVar2);
        if (android.text.TextUtils.isEmpty(strA)) {
            boolean zIsEmpty = android.text.TextUtils.isEmpty(kiuVar.h);
            java.lang.Object obj2 = this.b;
            return !zIsEmpty ? defpackage.pez.aq((android.content.Context) obj2, kiuVar.h) : ((android.content.Context) obj2).getText(2132019476);
        }
        if (strA.equals(kiuVar.h)) {
            return defpackage.pez.aq((android.content.Context) this.b, strA);
        }
        if (z) {
            j$.util.Optional optionalA = sos.a(kiuVar.m, kiuVar.n);
            idc idcVar = new idc(this, kiuVar, 3, (byte[]) null);
            if (true == optionalA.isPresent()) {
                java.lang.Object obj3 = optionalA.get();
                java.lang.Object obj4 = idcVar.b;
                kiw kiwVar3 = ((defpackage.kiu) idcVar.a).r;
                if (kiwVar3 == null) {
                    kiwVar3 = kiw.a;
                }
                defpackage.rmt rmtVarB = defpackage.rmt.b(kiwVar3.o);
                if (rmtVarB == null) {
                    rmtVarB = defpackage.rmt.UNKNOWN_SOURCE_TYPE;
                }
                optionalA = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.sry) ((defpackage.aeqx) obj4).j).a(rmtVarB, (android.telecom.PhoneAccountHandle) obj3, false)));
            }
            if (((java.lang.Boolean) optionalA.orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                return ((android.content.Context) this.b).getString(2132017908, strA);
            }
        }
        return strA;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [aoin, java.lang.Object] */
    public final java.lang.CharSequence e(defpackage.kiu kiuVar) {
        kiw kiwVar = kiuVar.r;
        if (kiwVar == null) {
            kiwVar = kiw.a;
        }
        java.lang.String str = kiwVar.h;
        if (!android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        defpackage.zjm zjmVar = (defpackage.zjm) this.h;
        if (zjmVar.g().isPresent()) {
            defpackage.jvv jvvVar = (defpackage.jvv) zjmVar.g().orElseThrow();
            kiw kiwVar2 = kiuVar.r;
            if (kiwVar2 == null) {
                kiwVar2 = kiw.a;
            }
            zag zagVar = kiwVar2.u;
            if (zagVar == null) {
                zagVar = zag.a;
            }
            zai zaiVar = zagVar.c;
            if (zaiVar == null) {
                zaiVar = zai.a;
            }
            if (jvvVar.d(zaiVar)) {
                if (((java.lang.Boolean) this.e.a()).booleanValue() && java.util.Locale.getDefault().getLanguage().equals("de")) {
                    java.lang.CharSequence text = ((android.content.Context) this.b).getText(2132020058);
                    java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[1];
                    kiw kiwVar3 = kiuVar.r;
                    if (kiwVar3 == null) {
                        kiwVar3 = kiw.a;
                    }
                    zag zagVar2 = kiwVar3.u;
                    if (zagVar2 == null) {
                        zagVar2 = zag.a;
                    }
                    zai zaiVar2 = zagVar2.c;
                    if (zaiVar2 == null) {
                        zaiVar2 = zai.a;
                    }
                    charSequenceArr[0] = zaiVar2.d;
                    return android.text.TextUtils.expandTemplate(text, charSequenceArr);
                }
                java.lang.CharSequence text2 = ((android.content.Context) this.b).getText(2132020058);
                java.lang.CharSequence[] charSequenceArr2 = new java.lang.CharSequence[1];
                kiw kiwVar4 = kiuVar.r;
                if (kiwVar4 == null) {
                    kiwVar4 = kiw.a;
                }
                zag zagVar3 = kiwVar4.u;
                if (zagVar3 == null) {
                    zagVar3 = zag.a;
                }
                zai zaiVar3 = zagVar3.c;
                if (zaiVar3 == null) {
                    zaiVar3 = zai.a;
                }
                charSequenceArr2[0] = zaiVar3.d;
                return defpackage.afsq.cr(android.text.TextUtils.expandTemplate(text2, charSequenceArr2));
            }
        }
        kiw kiwVar5 = kiuVar.r;
        if (kiwVar5 == null) {
            kiwVar5 = kiw.a;
        }
        if (kiwVar5.q.isEmpty()) {
            return kiuVar.l;
        }
        kiw kiwVar6 = kiuVar.r;
        if (kiwVar6 == null) {
            kiwVar6 = kiw.a;
        }
        return kiwVar6.q;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:35:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public final java.lang.CharSequence f(defpackage.kiu kiuVar) {
        kiw kiwVar;
        int iAQ;
        defpackage.isq isqVarQ;
        kiw kiwVar2;
        int iAQ2;
        int iAW;
        int iAR;
        tki tkiVarB;
        int iAW2;
        int iAR2;
        defpackage.tkl tklVar = (defpackage.tkl) this.m;
        defpackage.tkj tkjVarR = tklVar.r(kiuVar);
        int i = 2;
        if (tkjVarR == null) {
            kiwVar = kiuVar.r;
            if (kiwVar == null) {
                kiwVar = kiw.a;
            }
            iAQ = defpackage.a.aQ(kiwVar.m);
            if ((iAQ != 0 || iAQ != 2) && ((isqVarQ = tklVar.q(kiuVar)) == null || (iAW2 = defpackage.a.aW(isqVarQ.h)) == 0 || iAW2 != 5 || (iAR2 = defpackage.a.aR(isqVarQ.j)) == 0 || iAR2 != 3)) {
                if (tkjVarR == null) {
                    kiwVar2 = kiuVar.r;
                    if (kiwVar2 == null) {
                        kiwVar2 = kiw.a;
                    }
                    iAQ2 = defpackage.a.aQ(kiwVar2.n);
                    if ((iAQ2 == 0 && iAQ2 == 2) || (isqVarQ != null && (iAW = defpackage.a.aW(isqVarQ.h)) != 0 && iAW == 5 && (iAR = defpackage.a.aR(isqVarQ.j)) != 0 && iAR == 4)) {
                        i = 1;
                    }
                } else {
                    tkiVarB = tki.b(tkjVarR.f);
                    if (tkiVarB == null) {
                        tkiVarB = tki.d;
                    }
                    if (tkiVarB != tki.b) {
                        kiwVar2 = kiuVar.r;
                        if (kiwVar2 == null) {
                            kiwVar2 = kiw.a;
                        }
                        iAQ2 = defpackage.a.aQ(kiwVar2.n);
                        i = iAQ2 == 0 ? 3 : 3;
                    } else {
                        i = 1;
                    }
                }
            }
        } else {
            tki tkiVarB2 = tki.b(tkjVarR.g);
            if (tkiVarB2 == null) {
                tkiVarB2 = tki.d;
            }
            if (tkiVarB2 != tki.b) {
                kiwVar = kiuVar.r;
                if (kiwVar == null) {
                    kiwVar = kiw.a;
                }
                iAQ = defpackage.a.aQ(kiwVar.m);
                if (iAQ != 0) {
                    if (tkjVarR == null) {
                        kiwVar2 = kiuVar.r;
                        if (kiwVar2 == null) {
                            kiwVar2 = kiw.a;
                        }
                        iAQ2 = defpackage.a.aQ(kiwVar2.n);
                        if (iAQ2 == 0) {
                        }
                    } else {
                        tkiVarB = tki.b(tkjVarR.f);
                        if (tkiVarB == null) {
                            tkiVarB = tki.d;
                        }
                        if (tkiVarB != tki.b) {
                            kiwVar2 = kiuVar.r;
                            if (kiwVar2 == null) {
                                kiwVar2 = kiw.a;
                            }
                            iAQ2 = defpackage.a.aQ(kiwVar2.n);
                            if (iAQ2 == 0) {
                            }
                        } else {
                            i = 1;
                        }
                    }
                } else if (tkjVarR == null) {
                    kiwVar2 = kiuVar.r;
                    if (kiwVar2 == null) {
                        kiwVar2 = kiw.a;
                    }
                    iAQ2 = defpackage.a.aQ(kiwVar2.n);
                    if (iAQ2 == 0) {
                    }
                } else {
                    tkiVarB = tki.b(tkjVarR.f);
                    if (tkiVarB == null) {
                        tkiVarB = tki.d;
                    }
                    if (tkiVarB != tki.b) {
                        kiwVar2 = kiuVar.r;
                        if (kiwVar2 == null) {
                            kiwVar2 = kiw.a;
                        }
                        iAQ2 = defpackage.a.aQ(kiwVar2.n);
                        if (iAQ2 == 0) {
                        }
                    } else {
                        i = 1;
                    }
                }
            }
        }
        int i2 = i - 1;
        if (i2 == 0) {
            return ((android.content.Context) this.b).getText(2132017711);
        }
        if (i2 == 1) {
            return ((android.content.Context) this.b).getText(2132017712);
        }
        throw new java.lang.IllegalStateException("Source of scam verdict is unknown when it should be either user or ML.");
    }

    public final java.lang.String g(defpackage.kiu kiuVar) {
        return i(j(kiuVar));
    }

    public final java.lang.String h(defpackage.kiu kiuVar) {
        return i(j(kiuVar).a());
    }

    final defpackage.aify j(defpackage.kiu kiuVar) {
        j$.util.Optional optionalOf;
        kiw kiwVar = kiuVar.r;
        if (kiwVar == null) {
            kiwVar = kiw.a;
        }
        if (kiwVar.r) {
            return defpackage.aify.p(hgu.r((android.content.Context) this.b, j$.time.Instant.now().toEpochMilli(), kiuVar.e, true));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.kgu kguVarB = b(kiuVar);
        if (kguVarB == null || kguVarB.e.isEmpty()) {
            kiw kiwVar2 = kiuVar.r;
            if (kiwVar2 == null) {
                kiwVar2 = kiw.a;
            }
            if (kiwVar2.j) {
                arrayList.add(((android.content.Context) this.b).getText(2132019474));
            } else {
                defpackage.tkl tklVar = (defpackage.tkl) this.m;
                if (tklVar.t(kiuVar)) {
                    arrayList.add(f(kiuVar));
                } else if (tklVar.v(kiuVar)) {
                    arrayList.add(yee.c((android.content.Context) this.b));
                } else if (((defpackage.kaw) this.l).t(kiuVar)) {
                    java.lang.Object obj = this.g;
                    kiw kiwVar3 = kiuVar.r;
                    if (kiwVar3 == null) {
                        kiwVar3 = kiw.a;
                    }
                    java.lang.String strA = ((defpackage.kaw) obj).a(kiwVar3);
                    if (strA.isEmpty()) {
                        strA = ((android.content.Context) this.b).getString(2132019822);
                    }
                    java.lang.CharSequence charSequenceExpandTemplate = android.text.TextUtils.expandTemplate(((android.content.Context) this.b).getText(2132020250), strA);
                    if (charSequenceExpandTemplate.length() > 24) {
                        charSequenceExpandTemplate = java.lang.String.valueOf(android.text.TextUtils.substring(charSequenceExpandTemplate, 0, 23)).concat("…");
                    }
                    arrayList.add(charSequenceExpandTemplate);
                } else {
                    j$.util.Optional optionalG = ((defpackage.zjm) ((defpackage.kaw) this.k).a).g();
                    kdb kdbVar = new kdb(kiuVar, 9);
                    if (true == optionalG.isPresent()) {
                        optionalG = j$.util.Optional.ofNullable(((defpackage.kaw) optionalG.get()).w((defpackage.kiu) kdbVar.a));
                    }
                    defpackage.odu oduVar = (defpackage.odu) optionalG.orElse((java.lang.Object) null);
                    if (oduVar == null) {
                        oduVar = defpackage.odu.a;
                    }
                    oet oetVarB = oet.b(oduVar.c);
                    if (oetVarB == null) {
                        oetVarB = oet.c;
                    }
                    if (oetVarB == oet.b) {
                        arrayList.add(((android.content.Context) this.b).getText(2132020661));
                    } else {
                        j$.util.Optional optionalC = c(kiuVar);
                        if (optionalC.isPresent()) {
                            arrayList.add((java.lang.CharSequence) optionalC.orElseThrow());
                        }
                        int i = kiuVar.o;
                        if ((i & 1) == 1) {
                            optionalOf = j$.util.Optional.of(((android.content.Context) this.b).getText(true != kiuVar.m.startsWith("com.google.android.apps.tachyon") ? 2132019462 : 2132019470));
                        } else {
                            optionalOf = (i & 32) == 32 ? j$.util.Optional.of(((android.content.Context) this.b).getText(2132019473)) : j$.util.Optional.empty();
                        }
                        arrayList.add((java.lang.CharSequence) optionalOf.orElse(e(kiuVar)));
                    }
                }
            }
        } else {
            arrayList.add(kguVarB.e);
        }
        arrayList.add(hgu.r((android.content.Context) this.b, j$.time.Instant.now().toEpochMilli(), kiuVar.e, true));
        return defpackage.aify.n(arrayList);
    }

    public aeqx(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5, defpackage.aoin aoinVar6, defpackage.aoin aoinVar7, defpackage.aoin aoinVar8, defpackage.aoin aoinVar9, defpackage.aoin aoinVar10, defpackage.aoin aoinVar11, defpackage.aoin aoinVar12, defpackage.aoin aoinVar13) {
        aoinVar.getClass();
        this.m = aoinVar;
        aoinVar2.getClass();
        this.g = aoinVar2;
        aoinVar3.getClass();
        this.h = aoinVar3;
        aoinVar4.getClass();
        this.b = aoinVar4;
        aoinVar5.getClass();
        this.l = aoinVar5;
        aoinVar6.getClass();
        this.f = aoinVar6;
        aoinVar7.getClass();
        this.j = aoinVar7;
        aoinVar8.getClass();
        this.a = aoinVar8;
        aoinVar9.getClass();
        this.d = aoinVar9;
        aoinVar10.getClass();
        this.e = aoinVar10;
        aoinVar11.getClass();
        this.k = aoinVar11;
        aoinVar12.getClass();
        this.c = aoinVar12;
        aoinVar13.getClass();
        this.i = aoinVar13;
    }

    public aeqx(android.content.Context context, defpackage.rsr rsrVar, defpackage.kaw kawVar, defpackage.zjm zjmVar, defpackage.zjm zjmVar2, defpackage.tkk tkkVar, defpackage.tkl tklVar, defpackage.kaw kawVar2, defpackage.kaw kawVar3, defpackage.aoin aoinVar, defpackage.zjm zjmVar3, defpackage.aoin aoinVar2, defpackage.sry sryVar) {
        this.b = context;
        this.i = rsrVar;
        this.g = kawVar;
        this.h = zjmVar;
        this.c = zjmVar2;
        this.f = tkkVar;
        this.m = tklVar;
        this.k = kawVar2;
        this.l = kawVar3;
        this.e = aoinVar;
        this.d = zjmVar3;
        this.a = aoinVar2;
        this.j = sryVar;
    }
}
