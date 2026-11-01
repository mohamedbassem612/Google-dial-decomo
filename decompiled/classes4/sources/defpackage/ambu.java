package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ambu {
    public static final ahzf a = ahzf.c(ahxm.b).a().f();
    private static final aimz d = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AmCache");
    public final long b;
    public final java.lang.String c;
    private j$.util.Optional e = j$.util.Optional.empty();
    private j$.util.Optional f = j$.util.Optional.empty();
    private j$.util.Optional g = j$.util.Optional.empty();
    private j$.util.Optional h = j$.util.Optional.empty();
    private final defpackage.apjb i;

    public ambu(defpackage.amfl amflVar) throws defpackage.amde {
        if (amflVar.b.size() == 0) {
            throw new defpackage.amde();
        }
        d.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AmCache", "<init>", 149, "AmCache.java").v("Cache initialized");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (defpackage.amfm amfmVar : amflVar.b) {
            linkedHashMap.put(java.lang.Integer.valueOf(amfmVar.e), new defpackage.amcs(new defpackage.amcf(amfmVar), amfmVar.e, amfmVar.f.size() > 0 ? j$.util.Optional.of(java.lang.Integer.valueOf(amfmVar.f.e(0))) : j$.util.Optional.empty(), aihd.o(amfmVar.g), (aigf) j$.util.Collection.-EL.stream(j$.util.DesugarCollections.unmodifiableMap(amfmVar.h).keySet()).collect(aido.b(new defpackage.alzr(19), new defpackage.amcr(amfmVar, 0)))));
        }
        aihd aihdVarO = aihd.o(amflVar.c);
        this.i = new defpackage.apjb(linkedHashMap, aihdVarO.isEmpty() ? new aile(java.lang.Integer.valueOf(((defpackage.amfm) amflVar.b.get(0)).e)) : aihdVarO);
        this.b = amflVar.d;
        this.c = amflVar.e;
    }

    public static aify a(aify aifyVar) {
        return (aify) j$.util.Collection.-EL.stream(aifyVar).map(new defpackage.alzr(8)).flatMap(new defpackage.alzr(9)).collect(aido.a);
    }

    public static final defpackage.amea c(java.lang.String str, defpackage.amcb amcbVar, defpackage.ambs ambsVar) {
        boolean z;
        defpackage.amea ameaVarF = f(str, amcbVar, ambsVar);
        if (ameaVarF.a.isPresent()) {
            return ameaVarF;
        }
        defpackage.amdo amdoVar = new defpackage.amdo(amcbVar.a);
        aify aifyVar = ambsVar.a;
        if (j$.util.Collection.-EL.stream(aifyVar).anyMatch(new defpackage.alzc(9))) {
            amdoVar.k(true);
            z = true;
        } else {
            z = false;
        }
        if (defpackage.amev.u(str) || j$.util.Collection.-EL.stream(aifyVar).anyMatch(new defpackage.alzc(10))) {
            amdoVar.j(true);
        } else if (!z) {
            return ameaVarF;
        }
        defpackage.antt anttVar = new defpackage.antt(amcbVar);
        anttVar.f(amdoVar.a());
        return f(str, anttVar.d(), ambsVar);
    }

    private final defpackage.amdq d(java.lang.String str, defpackage.amcb amcbVar, aihd aihdVar) {
        defpackage.apjb apjbVar = this.i;
        j$.util.stream.Stream stream = j$.util.Collection.-EL.stream(aihdVar);
        j$.util.Objects.requireNonNull(apjbVar);
        aify aifyVar = (aify) j$.util.Collection.-EL.stream((aihd) stream.map(new defpackage.alyy(apjbVar, 11)).collect(aido.b)).map(new defpackage.allm(str, amcbVar, 4, null)).sorted().collect(aido.a);
        if (aifyVar.isEmpty()) {
            return defpackage.amdq.a(23);
        }
        defpackage.wn wnVarB = defpackage.amdq.b();
        wnVarB.c(aifyVar);
        if (!j$.util.Collection.-EL.stream(aifyVar).anyMatch(new defpackage.alzc(6))) {
            wnVarB.d(24);
            return wnVarB.a();
        }
        defpackage.amea ameaVar = (defpackage.amea) aifyVar.get(0);
        if (aifyVar.size() != 1 && ameaVar.compareTo((defpackage.amea) aifyVar.get(1)) == 0) {
            wnVarB.d(12);
            return wnVarB.a();
        }
        wnVarB.d(ameaVar.c);
        wnVarB.b(ameaVar.a);
        return wnVarB.a();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0064  */
    private final defpackage.amdq e(java.lang.String str, defpackage.amcb amcbVar, aify aifyVar) {
        aihd aihdVar;
        j$.util.Optional optionalFindFirst = j$.util.Collection.-EL.stream(aifyVar.a()).filter(new defpackage.alzc(11)).findFirst();
        if (optionalFindFirst.isEmpty()) {
            return d(str, amcbVar, (aihd) this.i.b);
        }
        java.lang.Integer num = (java.lang.Integer) ((defpackage.amce) optionalFindFirst.get()).d.get();
        num.intValue();
        defpackage.apjb apjbVar = this.i;
        j$.util.Optional optional = amcbVar.b;
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) apjbVar.a;
        defpackage.amcs amcsVar = (defpackage.amcs) linkedHashMap.get(num);
        if (optional.isPresent()) {
            aigf aigfVar = amcsVar.d;
            if (aigfVar.containsKey(optional.get())) {
                aihdVar = (aihd) aigfVar.get(optional.get());
            } else {
                aihdVar = ((defpackage.amcs) linkedHashMap.get(num)).c;
            }
        } else {
            aihdVar = ((defpackage.amcs) linkedHashMap.get(num)).c;
        }
        return d(str, amcbVar, aihdVar);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x055d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x055f  */
    /* JADX WARN: Code duplicated, block: B:120:0x059c  */
    /* JADX WARN: Code duplicated, block: B:122:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:126:0x05d8 A[EDGE_INSN: B:126:0x05d8->B:131:0x0625 BREAK  A[LOOP:0: B:119:0x059a->B:130:0x0621]] */
    /* JADX WARN: Code duplicated, block: B:127:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:129:0x0610  */
    /* JADX WARN: Code duplicated, block: B:133:0x063a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0644  */
    /* JADX WARN: Code duplicated, block: B:138:0x064c A[LOOP:1: B:132:0x0638->B:138:0x064c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:142:0x0666  */
    /* JADX WARN: Code duplicated, block: B:144:0x067e  */
    /* JADX WARN: Code duplicated, block: B:146:0x0682  */
    /* JADX WARN: Code duplicated, block: B:148:0x068c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0690  */
    /* JADX WARN: Code duplicated, block: B:157:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:159:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:161:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:163:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:165:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:166:0x0723  */
    /* JADX WARN: Code duplicated, block: B:180:0x0625 A[EDGE_INSN: B:180:0x0625->B:131:0x0625 BREAK  A[LOOP:0: B:119:0x059a->B:130:0x0621], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x05b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0621 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0657 A[EDGE_INSN: B:185:0x0657->B:139:0x0657 BREAK  A[LOOP:1: B:132:0x0638->B:138:0x064c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x064a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x06c4 A[EDGE_INSN: B:187:0x06c4->B:155:0x06c4 BREAK  A[LOOP:2: B:140:0x0662->B:154:0x06bb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x06c4 A[EDGE_INSN: B:188:0x06c4->B:155:0x06c4 BREAK  A[LOOP:2: B:140:0x0662->B:154:0x06bb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x06b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0371 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x03f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0377  */
    /* JADX WARN: Code duplicated, block: B:83:0x0381  */
    /* JADX WARN: Code duplicated, block: B:84:0x0395  */
    /* JADX WARN: Code duplicated, block: B:86:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:88:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:89:0x03df  */
    /* JADX WARN: Code duplicated, block: B:92:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:94:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:98:0x0417  */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.lang.Object, java.util.Map] */
    private static final defpackage.amea f(java.lang.String str, defpackage.amcb amcbVar, defpackage.ambs ambsVar) {
        aify aifyVarA;
        ahzf ahzfVar;
        java.util.ArrayList arrayList;
        java.util.List list;
        int i;
        int i2;
        defpackage.amby ambyVarA;
        int i3;
        defpackage.ambw ambwVar;
        int i4;
        j$.util.Optional optionalEmpty;
        java.lang.String str2;
        int i5;
        java.lang.Integer numValueOf;
        int iIntValue;
        float fA;
        int i6;
        int i7;
        int i8;
        int i9;
        int iIntValue2;
        java.lang.String strReplace;
        aify aifyVar;
        aify aifyVarN;
        java.util.ArrayList arrayList2;
        int size;
        int i10;
        int i11;
        java.util.ArrayList arrayList3;
        aify aifyVarN2;
        int size2;
        int i12;
        int i13;
        int i14;
        aify aifyVarN3;
        int size3;
        int i15;
        int i16;
        java.util.List list2;
        defpackage.wn wnVar;
        double d2;
        int i17;
        aify aifyVarN4;
        defpackage.amcf amcfVar;
        int size4;
        int i18;
        defpackage.ameu ameuVar;
        int i19;
        defpackage.ameu ameuVar2;
        int i20;
        int i21;
        int i22;
        defpackage.wn wnVar2 = new defpackage.wn(null);
        wnVar2.g(j$.util.Optional.empty());
        wnVar2.f(aike.a);
        java.util.List list3 = ambsVar.a;
        if (list3.isEmpty()) {
            d.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AmCache", "alignAsrToCacheSegments", 373, "AmCache.java").v("Cache mismatch reason: no segments");
            wnVar2.a = 18;
            return wnVar2.e();
        }
        wnVar2.f(list3);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        defpackage.amdp amdpVar = amcbVar.a;
        boolean z = amdpVar.p;
        int i23 = 7;
        if (z || amdpVar.q) {
            aift aiftVar = new aift(4);
            aify aifyVarA2 = a(list3);
            int size5 = aifyVarA2.size();
            int i24 = 0;
            while (i24 < size5) {
                java.lang.String str3 = (java.lang.String) aifyVarA2.get(i24);
                aify aifyVarP = aify.p(str3);
                if (z) {
                    aifyVarP = aify.n(defpackage.amev.b.j(defpackage.amev.m(str3)));
                }
                if (amdpVar.q) {
                    aifyVarP = (aify) j$.util.Collection.-EL.stream(aifyVarP).map(new defpackage.alzr(i23)).flatMap(new defpackage.alzr(6)).collect(aido.a);
                }
                aiftVar.i(aifyVarP);
                i24++;
                i23 = 7;
            }
            aike aikeVarH = aiftVar.h();
            int i25 = aikeVarH.d;
            int size6 = 0;
            for (int i26 = 0; i26 < i25; i26++) {
                aify aifyVar2 = (aify) aikeVarH.get(i26);
                if (aifyVar2.size() > 1) {
                    arrayList4.add(new defpackage.ameu(size6, aifyVar2.size() + size6));
                }
                size6 += aifyVar2.size();
            }
            aifyVarA = (aify) j$.util.Collection.-EL.stream(aikeVarH).flatMap(new defpackage.alzr(6)).collect(aido.a);
        } else {
            aifyVarA = a(list3);
        }
        ahzf ahzfVar2 = a;
        aify aifyVarN5 = aify.n(ahzfVar2.j(defpackage.amev.m(str)));
        aigf aigfVar = defpackage.amef.a;
        j$.util.stream.Stream map = j$.util.Collection.-EL.stream(aifyVarN5).map(new defpackage.amdk(14));
        j$.util.stream.Collector collector = aido.a;
        aify aifyVar3 = (aify) map.collect(collector);
        if (amdpVar.q) {
            aifyVar3 = (aify) j$.util.Collection.-EL.stream(aifyVar3).map(new defpackage.alzr(7)).flatMap(new defpackage.alzr(6)).collect(collector);
        }
        defpackage.ambt ambtVar = new defpackage.ambt(0, java.lang.Math.min(aifyVar3.size() + 8, aifyVarA.size() - 1));
        int i27 = ambtVar.a;
        aify aifyVarB = aifyVarA.b(i27, ambtVar.b + 1);
        defpackage.amee.a().a();
        j$.util.Optional optionalD = defpackage.amef.d(aifyVarB, aifyVar3);
        if (optionalD.isEmpty()) {
            d.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AmCache", "alignAsrToCacheSegments", 421, "AmCache.java").v("Cache mismatch reason: no alignment");
            wnVar2.a = 19;
            return wnVar2.e();
        }
        ?? r13 = optionalD.get();
        if (r13.isEmpty()) {
            d.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AmCache", "alignAsrToCacheSegments", 427, "AmCache.java").v("Cache mismatch reason: empty alignment");
            wnVar2.a = 20;
            return wnVar2.e();
        }
        defpackage.ambt ambtVar2 = new defpackage.ambt(((java.lang.Integer) java.util.Collections.min(r13.keySet())).intValue(), ((java.lang.Integer) java.util.Collections.max(r13.keySet())).intValue());
        int i28 = ambtVar2.a;
        if (((java.lang.Integer) r13.get(java.lang.Integer.valueOf(i28))).intValue() > 5 || i28 > amdpVar.n || aifyVar3.size() - ((java.lang.Integer) r13.get(java.lang.Integer.valueOf(ambtVar2.b))).intValue() > 3) {
            d.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AmCache", "alignAsrToCacheSegments", 431, "AmCache.java").I("Cache mismatch reason: isSignificantAsrPortionNotAligned. Alignment: %s, asrWords: %s", (java.lang.Object) r13, aifyVar3);
            wnVar2.a = 21;
            return wnVar2.e();
        }
        if (aifyVarB == null) {
            throw new java.lang.NullPointerException("Null candidateCacheWords");
        }
        if (aifyVar3 == null) {
            throw new java.lang.NullPointerException("Null asrWords");
        }
        if (amdpVar == null) {
            throw new java.lang.NullPointerException("Null matchingParams");
        }
        if (list3 == null) {
            throw new java.lang.NullPointerException("Null cacheSegments");
        }
        aimz aimzVar = defpackage.ambz.a;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.util.HashMap map2 = new java.util.HashMap();
        aigf aigfVarI = aigf.i((java.util.Map) r13);
        aify aifyVarN6 = aify.n(aifyVarB);
        aify aifyVarN7 = aify.n(aifyVar3);
        aify aifyVar4 = aifyVar3;
        java.lang.Float fValueOf = java.lang.Float.valueOf(1.0f);
        java.util.ArrayList arrayList7 = new java.util.ArrayList(java.util.Collections.nCopies(i27, fValueOf));
        int size7 = aifyVarN7.size();
        int i29 = amdpVar.j;
        defpackage.wn wnVar3 = wnVar2;
        java.lang.String str4 = "AmCacheMatchProcessor.java";
        if (size7 >= i29) {
            ahzfVar = ahzfVar2;
            arrayList = arrayList7;
            defpackage.ambw ambwVar2 = new defpackage.ambw(((java.lang.Integer) j$.util.Collection.-EL.stream(aigfVarI.keySet()).min(new aeov(4)).get()).intValue(), ((java.lang.Integer) j$.util.Collection.-EL.stream(aigfVarI.keySet()).max(new aeov(4)).get()).intValue());
            int i30 = ambwVar2.a;
            arrayList6.addAll(java.util.Collections.nCopies(i30, fValueOf));
            int i31 = 0;
            int i32 = -1;
            int i33 = 0;
            int i34 = -1;
            int i35 = 0;
            while (true) {
                int i36 = ambwVar2.b;
                if (i30 > i36) {
                    list = list3;
                    int i37 = i31;
                    java.lang.String str5 = str4;
                    int i38 = i35;
                    if (defpackage.ambz.c(i38, i37, aifyVarN7, amdpVar) >= amdpVar.e) {
                        if (defpackage.ambz.d(i37, map2, aigfVarI, aifyVarN7, amdpVar) >= amdpVar.i) {
                            if (i32 != -1 && (i3 = i34) != -1) {
                                defpackage.ambx ambxVar = new defpackage.ambx();
                                ambxVar.a = new ahyj(" ").b(arrayList5);
                                ambxVar.b = java.lang.Integer.valueOf(i36);
                                ahyj ahyjVar = new ahyj(" ");
                                java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i32);
                                i2 = 0;
                                double dA = ((double) defpackage.ambz.a(ahyjVar.b(aifyVarN7.b(((java.lang.Integer) aigfVarI.get(numValueOf2)).intValue(), ((java.lang.Integer) aigfVarI.get(java.lang.Integer.valueOf(i3))).intValue() + 1)), ambr.a(aifyVarN6.b(0, i3 + 1)))) + (((double) i32) * 0.05d) + (((double) ((java.lang.Integer) aigfVarI.get(numValueOf2)).intValue()) * 0.05d);
                                if (aifyVarN7.size() > arrayList5.size()) {
                                    dA += ((double) ((aifyVarN7.size() - arrayList5.size()) - ((java.lang.Integer) aigfVarI.get(numValueOf2)).intValue())) * 0.05d;
                                }
                                ambxVar.c(dA);
                                ambxVar.b(((java.lang.Integer) aigfVarI.get(numValueOf2)).intValue());
                                i = 3;
                                ambxVar.c = 3;
                                ambxVar.d(aify.n(arrayList6));
                                ambyVarA = ambxVar.a();
                                break;
                            }
                            i = 3;
                            i2 = 0;
                            ambyVarA = defpackage.amby.a(1006);
                            break;
                        }
                        defpackage.ambz.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AmCacheMatchProcessor", "process", 385, str5).y("Returning empty match: small suffix match ratio = %f", java.lang.Float.valueOf(defpackage.ambz.d(i37, map2, aigfVarI, aifyVarN7, amdpVar)));
                        ambyVarA = defpackage.amby.a(1005);
                    } else {
                        defpackage.ambz.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AmCacheMatchProcessor", "process", 380, str5).y("Returning empty match: small match ratio = %f", java.lang.Float.valueOf(defpackage.ambz.c(i38, i37, aifyVarN7, amdpVar)));
                        ambyVarA = defpackage.amby.a(1004);
                    }
                } else {
                    if (i30 == 0) {
                        str2 = str4;
                        list = list3;
                        ambwVar = ambwVar2;
                        i4 = i31;
                    } else {
                        int i39 = i30 + i27;
                        ambwVar = ambwVar2;
                        int size8 = list3.size();
                        i4 = i31;
                        int i40 = 0;
                        int i41 = 0;
                        while (true) {
                            if (i40 >= size8) {
                                optionalEmpty = j$.util.Optional.empty();
                                break;
                            }
                            defpackage.amcf amcfVar2 = (defpackage.amcf) list3.get(i40);
                            int i42 = size8;
                            int i43 = i40;
                            int size9 = i41 + defpackage.ambz.b.j(amcfVar2.c()).size();
                            if (size9 > i39) {
                                optionalEmpty = j$.util.Optional.of(amcfVar2);
                                break;
                            }
                            i40 = i43 + 1;
                            i41 = size9;
                            size8 = i42;
                        }
                        java.lang.String str6 = (java.lang.String) aifyVarN6.get(i30);
                        if (!optionalEmpty.isEmpty() && ((defpackage.amcf) optionalEmpty.get()).b().c == 2 && defpackage.ambz.b(str6)) {
                            list = list3;
                            str2 = str4;
                            if (j$.util.Collection.-EL.stream(defpackage.ambz.c).anyMatch(new defpackage.amcc(ahvr.p((java.lang.String) aifyVarN6.get(i30 - 1)), 1))) {
                                java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(i30);
                                if (aigfVarI.containsKey(numValueOf3)) {
                                    java.lang.String str7 = (java.lang.String) aifyVarN7.get(((java.lang.Integer) aigfVarI.get(numValueOf3)).intValue());
                                    if (defpackage.ambz.b(str7) && defpackage.ambz.a(str7, str6) > 0.35d) {
                                        i5 = 1012;
                                    }
                                } else {
                                    i5 = 1011;
                                }
                            }
                            if (i5 != 3) {
                                ambyVarA = defpackage.amby.a(i5);
                            } else {
                                numValueOf = java.lang.Integer.valueOf(i30);
                                if (aigfVarI.containsKey(numValueOf)) {
                                    iIntValue = ((java.lang.Integer) aigfVarI.get(numValueOf)).intValue();
                                    fA = defpackage.ambz.a((java.lang.String) aifyVarN7.get(((java.lang.Integer) aigfVarI.get(numValueOf)).intValue()), (java.lang.String) aifyVarN6.get(i30));
                                    if (fA >= amdpVar.g) {
                                        i4 = iIntValue;
                                        if (((java.lang.Integer) aigfVarI.get(numValueOf)).intValue() < aifyVarN7.size() - amdpVar.l) {
                                            map2.put(numValueOf, java.lang.Boolean.FALSE);
                                            i7 = i33 + 1;
                                            i8 = i7;
                                            i6 = i35;
                                        }
                                        if (i7 > amdpVar.f) {
                                            defpackage.ambz.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AmCacheMatchProcessor", "process", 374, str2).w("Returning empty match: processStandardStep(%d)=false", i30);
                                            ambyVarA = defpackage.amby.a(1003);
                                        } else {
                                            arrayList5.add((java.lang.String) aifyVarN6.get(i30));
                                            arrayList6.add(java.lang.Float.valueOf(fA));
                                            i35 = i6;
                                            i33 = i8;
                                        }
                                    } else {
                                        i4 = iIntValue;
                                    }
                                    i6 = i35 + 1;
                                    map2.put(numValueOf, java.lang.Boolean.TRUE);
                                    if (i32 == -1) {
                                        i32 = i30;
                                        i34 = i32;
                                    } else {
                                        i34 = i30;
                                    }
                                    i7 = 0;
                                    i8 = 0;
                                    if (i7 > amdpVar.f) {
                                        defpackage.ambz.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AmCacheMatchProcessor", "process", 374, str2).w("Returning empty match: processStandardStep(%d)=false", i30);
                                        ambyVarA = defpackage.amby.a(1003);
                                    } else {
                                        arrayList5.add((java.lang.String) aifyVarN6.get(i30));
                                        arrayList6.add(java.lang.Float.valueOf(fA));
                                        i35 = i6;
                                        i33 = i8;
                                    }
                                } else {
                                    arrayList5.add((java.lang.String) aifyVarN6.get(i30));
                                    arrayList6.add(java.lang.Float.valueOf(1.0f));
                                }
                                i30++;
                                str4 = str2;
                                ambwVar2 = ambwVar;
                                i31 = i4;
                                list3 = list;
                            }
                        } else {
                            str2 = str4;
                            list = list3;
                        }
                    }
                    i5 = 3;
                    if (i5 != 3) {
                        ambyVarA = defpackage.amby.a(i5);
                    } else {
                        numValueOf = java.lang.Integer.valueOf(i30);
                        if (aigfVarI.containsKey(numValueOf)) {
                            arrayList5.add((java.lang.String) aifyVarN6.get(i30));
                            arrayList6.add(java.lang.Float.valueOf(1.0f));
                        } else {
                            iIntValue = ((java.lang.Integer) aigfVarI.get(numValueOf)).intValue();
                            fA = defpackage.ambz.a((java.lang.String) aifyVarN7.get(((java.lang.Integer) aigfVarI.get(numValueOf)).intValue()), (java.lang.String) aifyVarN6.get(i30));
                            if (fA >= amdpVar.g) {
                                i4 = iIntValue;
                                if (((java.lang.Integer) aigfVarI.get(numValueOf)).intValue() < aifyVarN7.size() - amdpVar.l) {
                                    map2.put(numValueOf, java.lang.Boolean.FALSE);
                                    i7 = i33 + 1;
                                    i8 = i7;
                                    i6 = i35;
                                }
                                if (i7 > amdpVar.f) {
                                    defpackage.ambz.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AmCacheMatchProcessor", "process", 374, str2).w("Returning empty match: processStandardStep(%d)=false", i30);
                                    ambyVarA = defpackage.amby.a(1003);
                                } else {
                                    arrayList5.add((java.lang.String) aifyVarN6.get(i30));
                                    arrayList6.add(java.lang.Float.valueOf(fA));
                                    i35 = i6;
                                    i33 = i8;
                                }
                            } else {
                                i4 = iIntValue;
                            }
                            i6 = i35 + 1;
                            map2.put(numValueOf, java.lang.Boolean.TRUE);
                            if (i32 == -1) {
                                i32 = i30;
                                i34 = i32;
                            } else {
                                i34 = i30;
                            }
                            i7 = 0;
                            i8 = 0;
                            if (i7 > amdpVar.f) {
                                defpackage.ambz.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AmCacheMatchProcessor", "process", 374, str2).w("Returning empty match: processStandardStep(%d)=false", i30);
                                ambyVarA = defpackage.amby.a(1003);
                            } else {
                                arrayList5.add((java.lang.String) aifyVarN6.get(i30));
                                arrayList6.add(java.lang.Float.valueOf(fA));
                                i35 = i6;
                                i33 = i8;
                            }
                        }
                        i30++;
                        str4 = str2;
                        ambwVar2 = ambwVar;
                        i31 = i4;
                        list3 = list;
                    }
                }
            }
            i9 = ambyVarA.f;
            if (i9 != 0) {
                throw 0;
            }
            if (i9 == i) {
                d.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AmCache", "alignAsrToCacheSegments", 458, "AmCache.java").M("Cache mismatch reason: processor returned empty. candidate cache words: %s, asrWords: %s, alignment: %s", aifyVarB, aifyVar4, (java.lang.Object) r13);
                wnVar3.a = i9;
                return wnVar3.e();
            }
            iIntValue2 = ambyVarA.b.intValue() + i27;
            strReplace = ambyVarA.a.replace(" slash ", "/").replace(" dot com", ".com").replace(" dot gov", ".gov").replace("w w w dot ", "www.");
            aifyVar = ambyVarA.e;
            aifyVarN = aify.n(arrayList4);
            arrayList2 = new java.util.ArrayList((java.util.Collection) aifyVar);
            size = aifyVarN.size();
            i10 = i2;
            i11 = i10;
            while (i10 < size) {
                ameuVar2 = (defpackage.ameu) aifyVarN.get(i10);
                i20 = ameuVar2.a;
                if (i20 < iIntValue2) {
                    break;
                }
                i21 = i20 - i11;
                if (ameuVar2.a(iIntValue2)) {
                    arrayList2.set(i21, java.lang.Float.valueOf((float) j$.util.Collection.-EL.stream(aifyVar.b(i20, iIntValue2 + 1)).mapToDouble(new defpackage.alyx(3)).average().orElse(1.0d)));
                    if (ameuVar2.b > i20) {
                        break;
                    }
                    arrayList2.subList(i21 + 1, (iIntValue2 - i11) + 1).clear();
                    break;
                }
                i22 = ameuVar2.b;
                arrayList2.set(i21, java.lang.Float.valueOf((float) j$.util.Collection.-EL.stream(aifyVar.b(i20, i22)).mapToDouble(new defpackage.alyx(4)).average().orElse(1.0d)));
                if (i22 > i20) {
                    arrayList2.subList(i21 + 1, i22 - i11).clear();
                    i11 += (i22 - i20) - 1;
                }
                i10++;
            }
            arrayList3 = arrayList;
            arrayList3.addAll(aify.n(arrayList2));
            aifyVarN2 = aify.n(arrayList4);
            size2 = aifyVarN2.size();
            i12 = 0;
            for (i13 = 0; i13 < size2; i13++) {
                ameuVar = (defpackage.ameu) aifyVarN2.get(i13);
                i19 = ameuVar.a;
                if (i19 >= iIntValue2) {
                    break;
                }
                if (ameuVar.a(iIntValue2)) {
                    iIntValue2 = i19;
                    break;
                }
                i12 += (ameuVar.b - i19) - 1;
            }
            i14 = iIntValue2 - i12;
            aifyVarN3 = aify.n(arrayList3);
            size3 = list.size();
            i15 = 0;
            i16 = 0;
            while (true) {
                list2 = list;
                if (i16 < size3) {
                    break;
                }
                amcfVar = (defpackage.amcf) list2.get(i16);
                ahzf ahzfVar3 = ahzfVar;
                size4 = ahzfVar3.j(amcfVar.c()).size();
                i18 = i15 + size4;
                if (i18 <= 0) {
                    if (i18 <= i14 + 1) {
                        break;
                    }
                    if (!defpackage.amev.v(amcfVar.b())) {
                        i15 = i18;
                    } else if (j$.util.Collection.-EL.stream(aifyVarN3.b(i15, i18)).filter(new defpackage.alzc(8)).count() / size4 < 0.5f) {
                        defpackage.wn wnVar4 = wnVar3;
                        wnVar4.a = 25;
                        return wnVar4.e();
                    }
                } else {
                    i15 = i18;
                }
                i16++;
                list = list2;
                ahzfVar = ahzfVar3;
                wnVar3 = wnVar3;
            }
            wnVar = wnVar3;
            wnVar.a = 3;
            if (strReplace != null) {
                throw new java.lang.NullPointerException("Null text");
            }
            d2 = ambyVarA.c;
            i17 = ambyVarA.d;
            aifyVarN4 = aify.n(arrayList3);
            if (aifyVarN4 != null) {
                throw new java.lang.NullPointerException("Null wordCosts");
            }
            wnVar.g(j$.util.Optional.of(new defpackage.ambv(strReplace, i14, d2, list2, i17, amcbVar, aifyVarN4)));
            return wnVar.e();
        }
        defpackage.ambz.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AmCacheMatchProcessor", "process", 350, "AmCacheMatchProcessor.java").z("Returning empty match: didn't reach minimal asr tokens: %d < %d", aifyVarN7.size(), i29);
        ambyVarA = defpackage.amby.a(1002);
        ahzfVar = ahzfVar2;
        list = list3;
        arrayList = arrayList7;
        i = 3;
        i2 = 0;
        i9 = ambyVarA.f;
        if (i9 != 0) {
            throw 0;
        }
        if (i9 == i) {
            d.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AmCache", "alignAsrToCacheSegments", 458, "AmCache.java").M("Cache mismatch reason: processor returned empty. candidate cache words: %s, asrWords: %s, alignment: %s", aifyVarB, aifyVar4, (java.lang.Object) r13);
            wnVar3.a = i9;
            return wnVar3.e();
        }
        iIntValue2 = ambyVarA.b.intValue() + i27;
        strReplace = ambyVarA.a.replace(" slash ", "/").replace(" dot com", ".com").replace(" dot gov", ".gov").replace("w w w dot ", "www.");
        aifyVar = ambyVarA.e;
        aifyVarN = aify.n(arrayList4);
        arrayList2 = new java.util.ArrayList((java.util.Collection) aifyVar);
        size = aifyVarN.size();
        i10 = i2;
        i11 = i10;
        while (i10 < size) {
            ameuVar2 = (defpackage.ameu) aifyVarN.get(i10);
            i20 = ameuVar2.a;
            if (i20 < iIntValue2) {
                break;
                break;
            }
            i21 = i20 - i11;
            if (ameuVar2.a(iIntValue2)) {
                arrayList2.set(i21, java.lang.Float.valueOf((float) j$.util.Collection.-EL.stream(aifyVar.b(i20, iIntValue2 + 1)).mapToDouble(new defpackage.alyx(3)).average().orElse(1.0d)));
                if (ameuVar2.b > i20) {
                    break;
                }
                arrayList2.subList(i21 + 1, (iIntValue2 - i11) + 1).clear();
                break;
            }
            i22 = ameuVar2.b;
            arrayList2.set(i21, java.lang.Float.valueOf((float) j$.util.Collection.-EL.stream(aifyVar.b(i20, i22)).mapToDouble(new defpackage.alyx(4)).average().orElse(1.0d)));
            if (i22 > i20) {
                arrayList2.subList(i21 + 1, i22 - i11).clear();
                i11 += (i22 - i20) - 1;
            }
            i10++;
        }
        arrayList3 = arrayList;
        arrayList3.addAll(aify.n(arrayList2));
        aifyVarN2 = aify.n(arrayList4);
        size2 = aifyVarN2.size();
        i12 = 0;
        while (i13 < size2) {
            ameuVar = (defpackage.ameu) aifyVarN2.get(i13);
            i19 = ameuVar.a;
            if (i19 >= iIntValue2) {
                break;
                break;
            }
            if (ameuVar.a(iIntValue2)) {
                iIntValue2 = i19;
                break;
            }
            i12 += (ameuVar.b - i19) - 1;
        }
        i14 = iIntValue2 - i12;
        aifyVarN3 = aify.n(arrayList3);
        size3 = list.size();
        i15 = 0;
        i16 = 0;
        while (true) {
            list2 = list;
            if (i16 < size3) {
                break;
                break;
            }
            amcfVar = (defpackage.amcf) list2.get(i16);
            ahzf ahzfVar4 = ahzfVar;
            size4 = ahzfVar4.j(amcfVar.c()).size();
            i18 = i15 + size4;
            if (i18 <= 0) {
                if (i18 <= i14 + 1) {
                    break;
                    break;
                }
                if (!defpackage.amev.v(amcfVar.b())) {
                    i15 = i18;
                } else if (j$.util.Collection.-EL.stream(aifyVarN3.b(i15, i18)).filter(new defpackage.alzc(8)).count() / size4 < 0.5f) {
                    defpackage.wn wnVar5 = wnVar3;
                    wnVar5.a = 25;
                    return wnVar5.e();
                }
            } else {
                i15 = i18;
            }
            i16++;
            list = list2;
            ahzfVar = ahzfVar4;
            wnVar3 = wnVar3;
        }
        wnVar = wnVar3;
        wnVar.a = 3;
        if (strReplace != null) {
            throw new java.lang.NullPointerException("Null text");
        }
        d2 = ambyVarA.c;
        i17 = ambyVarA.d;
        aifyVarN4 = aify.n(arrayList3);
        if (aifyVarN4 != null) {
            throw new java.lang.NullPointerException("Null wordCosts");
        }
        wnVar.g(j$.util.Optional.of(new defpackage.ambv(strReplace, i14, d2, list2, i17, amcbVar, aifyVarN4)));
        return wnVar.e();
    }

    public final defpackage.amdq b(defpackage.ameo ameoVar, aify aifyVar, defpackage.amcb amcbVar) {
        defpackage.amdq amdqVarA;
        if (this.h.isPresent() && j$.util.Optional.of(ameoVar).equals(this.e) && j$.util.Optional.of(aifyVar).equals(this.f) && j$.util.Optional.of(amcbVar).equals(this.g)) {
            return (defpackage.amdq) this.h.get();
        }
        this.e = j$.util.Optional.of(ameoVar);
        this.f = j$.util.Optional.of(aifyVar);
        this.g = j$.util.Optional.of(amcbVar);
        java.lang.String str = ameoVar.a;
        if (aifyVar.isEmpty()) {
            amdqVarA = d(str, amcbVar, (aihd) this.i.b);
        } else if (amcbVar.a.o) {
            j$.util.Optional optionalFindFirst = j$.util.Collection.-EL.stream(aifyVar.a()).filter(new defpackage.alzc(7)).findFirst();
            if (optionalFindFirst.isPresent() && ((defpackage.amce) optionalFindFirst.get()).l()) {
                aike aikeVarO = this.i.o(((java.lang.Integer) ((defpackage.amce) optionalFindFirst.get()).d.get()).intValue());
                int i = aikeVarO.d;
                int i2 = 0;
                while (i2 < i) {
                    defpackage.amcf amcfVar = (defpackage.amcf) aikeVarO.get(i2);
                    i2++;
                    if (defpackage.amev.v(amcfVar.b())) {
                        amdqVarA = d(str, amcbVar, new aile(java.lang.Integer.valueOf(amcfVar.a())));
                    }
                }
                amdqVarA = e(str, amcbVar, aifyVar);
            } else {
                amdqVarA = e(str, amcbVar, aifyVar);
            }
        } else {
            defpackage.amce amceVar = (defpackage.amce) ahvr.bk(aifyVar);
            j$.util.Optional optional = amceVar.e;
            if (optional.isPresent()) {
                amdqVarA = d(str, amcbVar, new aile(optional.get()));
            } else if (amceVar.f) {
                amdqVarA = e(str, amcbVar, aifyVar);
            } else {
                j$.util.Optional optional2 = amceVar.d;
                if (optional2.isEmpty()) {
                    amdqVarA = defpackage.amdq.a(13);
                } else {
                    int iIntValue = ((java.lang.Integer) optional2.get()).intValue();
                    if (amceVar.j()) {
                        defpackage.apjb apjbVar = this.i;
                        if (apjbVar.p(iIntValue).isEmpty()) {
                            d.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AmCache", "correctWithFullyMatchedPrevItem", 310, "AmCache.java").v("Cache mismatch reason: Unknown next segment ID.");
                            amdqVarA = defpackage.amdq.a(15);
                        } else {
                            aify aifyVarO = apjbVar.o(((java.lang.Integer) apjbVar.p(iIntValue).get()).intValue());
                            if (aifyVarO.isEmpty()) {
                                d.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AmCache", "correctWithFullyMatchedPrevItem", 318, "AmCache.java").v("Cache mismatch reason: No followup segments.");
                                amdqVarA = defpackage.amdq.a(16);
                            } else {
                                defpackage.amea ameaVarC = c(str, amcbVar, defpackage.ambs.a(aifyVarO));
                                j$.util.Optional optional3 = ameaVarC.a;
                                if (optional3.isPresent()) {
                                    defpackage.wn wnVarB = defpackage.amdq.b();
                                    wnVarB.b(optional3);
                                    wnVarB.c(aify.p(ameaVarC));
                                    wnVarB.d(ameaVarC.c);
                                    amdqVarA = wnVarB.a();
                                } else {
                                    amdqVarA = defpackage.amdq.a(ameaVarC.c);
                                }
                            }
                        }
                    } else {
                        d.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AmCache", "computeCorrectionForTranscriptionResult", 274, "AmCache.java").v("Invalid last persistent item.");
                        amdqVarA = defpackage.amdq.a(14);
                    }
                }
            }
        }
        this.h = j$.util.Optional.of(amdqVarA);
        return amdqVarA;
    }
}
