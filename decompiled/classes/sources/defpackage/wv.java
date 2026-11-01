package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class wv {
    public static final defpackage.cer a(ajw ajwVar, float f, float f2, defpackage.ajr ajrVar, defpackage.cav cavVar) {
        defpackage.ajr ajrVar2;
        java.lang.Float fValueOf = java.lang.Float.valueOf(f);
        java.lang.Float fValueOf2 = java.lang.Float.valueOf(f2);
        defpackage.nf nfVar = defpackage.alo.a;
        defpackage.cbt cbtVar = (defpackage.cbt) cavVar;
        java.lang.Object objR = cbtVar.R();
        java.lang.Object obj = defpackage.cau.a;
        if (objR == obj) {
            ajt ajtVar = new ajt(ajwVar, fValueOf, fValueOf2, nfVar, ajrVar);
            fValueOf = fValueOf;
            ajrVar2 = ajrVar;
            cbtVar.ab(ajtVar);
            objR = ajtVar;
        } else {
            ajrVar2 = ajrVar;
        }
        ajt ajtVar2 = (ajt) objR;
        boolean zD = cavVar.D(ajrVar2);
        java.lang.Object objR2 = cbtVar.R();
        if (zD || objR2 == obj) {
            ajx ajxVar = new ajx(fValueOf, ajtVar2, fValueOf2, ajrVar2, 0);
            cbtVar.ab(ajxVar);
            objR2 = ajxVar;
        }
        cavVar.r((defpackage.aomy) objR2);
        boolean zD2 = cavVar.D(ajwVar);
        java.lang.Object objR3 = cbtVar.R();
        if (zD2 || objR3 == obj) {
            objR3 = new defpackage.nz(ajwVar, ajtVar2, 9, null);
            cbtVar.ab(objR3);
        }
        defpackage.cbp.c(ajtVar2, (defpackage.aonj) objR3, cavVar);
        return ajtVar2;
    }

    public static final ajw b(defpackage.cav cavVar) {
        defpackage.cbt cbtVar = (defpackage.cbt) cavVar;
        java.lang.Object objR = cbtVar.R();
        if (objR == defpackage.cau.a) {
            objR = new ajw();
            cbtVar.ab(objR);
        }
        ajw ajwVar = (ajw) objR;
        ajwVar.a(cavVar, 0);
        return ajwVar;
    }

    public static final int c(java.lang.String str, int i) {
        defpackage.ekb ekbVar = defpackage.ekb.b;
        java.text.BreakIterator characterInstance = java.text.BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i);
    }

    public static final int d(java.lang.String str, int i) {
        defpackage.ekb ekbVar = defpackage.ekb.b;
        java.text.BreakIterator characterInstance = java.text.BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object e(defpackage.cvr cvrVar, bgw bgwVar, defpackage.aoln aolnVar) {
        bgr bgrVar;
        if (aolnVar instanceof bgr) {
            bgrVar = (bgr) aolnVar;
            int i = bgrVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                bgrVar.b = i - Integer.MIN_VALUE;
            } else {
                bgrVar = new bgr(aolnVar);
            }
        } else {
            bgrVar = new bgr(aolnVar);
        }
        java.lang.Object obj = bgrVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = bgrVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            lnb lnbVar = new lnb(cvrVar, bgwVar, (defpackage.aoln) null, 1);
            bgrVar.b = 1;
            if (defpackage.aosv.m(lnbVar, bgrVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    public static final defpackage.aonn f(defpackage.dij dijVar) {
        return (defpackage.aonn) dijVar.b.g(defpackage.did.e);
    }

    public static final void g(defpackage.dij dijVar, int i, defpackage.aonj aonjVar) {
        defpackage.cfc cfcVar = new defpackage.cfc(new defpackage.dij[16]);
        java.util.List listL = dijVar.l(false, false);
        int i2 = cfcVar.b;
        while (true) {
            cfcVar.p(i2, listL);
            while (true) {
                int i3 = cfcVar.b;
                if (i3 == 0) {
                    return;
                }
                defpackage.dij dijVar2 = (defpackage.dij) cfcVar.c(i3 - 1);
                if (!defpackage.dil.a(dijVar2)) {
                    defpackage.die dieVar = dijVar2.b;
                    if (dieVar.f(defpackage.din.j)) {
                        continue;
                    } else {
                        defpackage.dck dckVarF = dijVar2.f();
                        if (dckVarF == null) {
                            defpackage.cwh.b("Expected semantics node to have a coordinator.");
                            throw new defpackage.aoiq();
                        }
                        defpackage.dpo dpoVarJ = defpackage.dfd.j(defpackage.den.F(dckVarF, true));
                        if (dpoVarJ.b < dpoVarJ.d && dpoVarJ.c < dpoVarJ.e) {
                            defpackage.aonn aonnVarF = f(dijVar2);
                            defpackage.dic dicVar = (defpackage.dic) dieVar.g(defpackage.din.x);
                            if (aonnVarF == null || dicVar == null || ((java.lang.Number) dicVar.b.a()).floatValue() <= 0.0f) {
                                listL = dijVar2.l(false, false);
                                i2 = cfcVar.b;
                            } else {
                                int i4 = 1 + i;
                                aonjVar.a(new dhq(dijVar2, i4, dpoVarJ, dckVarF));
                                g(dijVar2, i4, aonjVar);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:148:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:23:0x00af  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:52:0x017b A[PHI: r8 r9 r10 r12 r16 r17 r31
      0x017b: PHI (r8v20 float) = (r8v9 float), (r8v9 float), (r8v9 float), (r8v28 float) binds: [B:56:0x019d, B:62:0x01b0, B:64:0x01b8, B:51:0x0173] A[DONT_GENERATE, DONT_INLINE]
      0x017b: PHI (r9v30 float) = (r9v11 float), (r9v11 float), (r9v11 float), (r9v35 float) binds: [B:56:0x019d, B:62:0x01b0, B:64:0x01b8, B:51:0x0173] A[DONT_GENERATE, DONT_INLINE]
      0x017b: PHI (r10v27 float) = (r10v6 float), (r10v6 float), (r10v6 float), (r10v31 float) binds: [B:56:0x019d, B:62:0x01b0, B:64:0x01b8, B:51:0x0173] A[DONT_GENERATE, DONT_INLINE]
      0x017b: PHI (r12v19 long) = (r12v9 long), (r12v9 long), (r12v9 long), (r12v24 long) binds: [B:56:0x019d, B:62:0x01b0, B:64:0x01b8, B:51:0x0173] A[DONT_GENERATE, DONT_INLINE]
      0x017b: PHI (r16v10 java.util.ArrayList) = (r16v3 java.util.ArrayList), (r16v3 java.util.ArrayList), (r16v3 java.util.ArrayList), (r16v13 java.util.ArrayList) binds: [B:56:0x019d, B:62:0x01b0, B:64:0x01b8, B:51:0x0173] A[DONT_GENERATE, DONT_INLINE]
      0x017b: PHI (r17v9 csw) = (r17v2 csw), (r17v2 csw), (r17v2 csw), (r17v12 csw) binds: [B:56:0x019d, B:62:0x01b0, B:64:0x01b8, B:51:0x0173] A[DONT_GENERATE, DONT_INLINE]
      0x017b: PHI (r31v6 int) = (r31v2 int), (r31v2 int), (r31v2 int), (r31v8 int) binds: [B:56:0x019d, B:62:0x01b0, B:64:0x01b8, B:51:0x0173] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x02cd  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:33:0x0105
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public static final defpackage.dhe h(android.content.res.Resources.Theme r67, android.content.res.Resources r68, android.content.res.XmlResourceParser r69, int r70) throws org.xmlpull.v1.XmlPullParserException {
        /*
            Method dump skipped, instruction units count: 1108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv.h(android.content.res.Resources$Theme, android.content.res.Resources, android.content.res.XmlResourceParser, int):dhe");
    }

    public static final defpackage.csx i(int i, defpackage.cav cavVar, int i2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        android.content.Context context = (android.content.Context) cavVar.e(defpackage.dep.b);
        android.content.res.Resources resources = (android.content.res.Resources) cavVar.e(defpackage.dep.c);
        android.content.res.Resources.Theme theme = context.getTheme();
        boolean zB = ((((i2 & 112) ^ 48) > 32 && cavVar.z(i)) || (i2 & 48) == 32) | cavVar.B(resources) | cavVar.B(theme) | cavVar.B(resources.getConfiguration());
        java.lang.Object objG = cavVar.g();
        if (zB || objG == defpackage.cau.a) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            resources.getValue(i, typedValue, true);
            android.content.res.XmlResourceParser xml = resources.getXml(i);
            defpackage.un.l(xml);
            objG = h(theme, resources, xml, typedValue.changingConfigurations).a;
            cavVar.w(objG);
        }
        return (defpackage.csx) objG;
    }

    public static final float j(int i, defpackage.cav cavVar) {
        return ((android.content.res.Resources) cavVar.e(defpackage.dep.c)).getDimension(i) / ((defpackage.dpf) cavVar.e(defpackage.dfo.e)).a();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dhg */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Map] */
    public static final defpackage.css k(int i, defpackage.cav cavVar, int i2) throws org.xmlpull.v1.XmlPullParserException, dhg, java.io.IOException {
        android.util.TypedValue typedValue;
        boolean z;
        android.content.Context context = (android.content.Context) cavVar.e(defpackage.dep.b);
        android.content.res.Resources resources = (android.content.res.Resources) cavVar.e(defpackage.dep.c);
        defpackage.ipc ipcVar = (defpackage.ipc) cavVar.e(defpackage.dep.e);
        synchronized (ipcVar) {
            java.lang.Object obj = ipcVar.a;
            typedValue = (android.util.TypedValue) ((defpackage.aco) obj).a(i);
            z = true;
            if (typedValue == null) {
                typedValue = new android.util.TypedValue();
                resources.getValue(i, typedValue, true);
                ((defpackage.aco) obj).h(i, typedValue);
            }
        }
        java.lang.CharSequence charSequence = typedValue.string;
        if (charSequence != null && defpackage.aoov.L(charSequence, ".xml")) {
            cavVar.u(-1771798434);
            android.content.res.Resources.Theme theme = context.getTheme();
            int i3 = typedValue.changingConfigurations;
            defpackage.kaw kawVar = (defpackage.kaw) cavVar.e(defpackage.dep.d);
            defpackage.dhf dhfVar = new defpackage.dhf(theme, i);
            ?? r2 = kawVar.a;
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.HashMap) r2).get(dhfVar);
            defpackage.dhe dheVarH = weakReference != null ? (defpackage.dhe) weakReference.get() : null;
            if (dheVarH == null) {
                android.content.res.XmlResourceParser xml = resources.getXml(i);
                defpackage.un.l(xml);
                if (!defpackage.aooh.n(xml.getName(), "vector")) {
                    throw new java.lang.IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                }
                dheVarH = h(theme, resources, xml, i3);
                r2.put(dhfVar, new java.lang.ref.WeakReference(dheVarH));
            }
            defpackage.ctz ctzVarF = defpackage.sl.f(dheVarH.a, cavVar);
            cavVar.o();
            return ctzVarF;
        }
        cavVar.u(-1771643000);
        java.lang.Object theme2 = context.getTheme();
        boolean zB = cavVar.B(charSequence);
        if ((((i2 & 14) ^ 6) <= 4 || !cavVar.z(i)) && (i2 & 6) != 4) {
            z = false;
        }
        boolean zB2 = zB | z | cavVar.B(theme2);
        java.lang.Object objG = cavVar.g();
        if (zB2 || objG == defpackage.cau.a) {
            try {
                android.graphics.drawable.Drawable drawable = resources.getDrawable(i, null);
                if (drawable == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                }
                objG = new defpackage.cpu(((android.graphics.drawable.BitmapDrawable) drawable).getBitmap());
                cavVar.w(objG);
            } catch (java.lang.Exception e) {
                java.util.Objects.toString(charSequence);
                throw new dhg("Error attempting to load resource: ".concat(java.lang.String.valueOf(charSequence)), e);
            }
        }
        csq csqVar = new csq((defpackage.cpu) objG);
        cavVar.o();
        return csqVar;
    }
}
