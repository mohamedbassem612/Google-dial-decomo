package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amev {
    public static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/Utils");
    public static final ahzf b = ahzf.c(ahxm.b).f();
    public static final aigf c;
    public static final aihd d;

    static {
        aitt aittVarC = new aitn(j$.util.stream.Stream.-CC.of(new java.util.List[]{java.util.Arrays.asList("0", "zero", "xero"), java.util.Arrays.asList("1", "one", "once"), java.util.Arrays.asList("2", "two", "to", "too", "do", "t", "tea", "tooth", "tool"), java.util.Arrays.asList("3", "three", "tree", "free", "through"), java.util.Arrays.asList("4", "four", "for", "more", "form", "full", "fall"), java.util.Arrays.asList("5", "five", "fine", "file"), java.util.Arrays.asList("6", "six", "fix", "sticks"), java.util.Arrays.asList("7", "seven"), java.util.Arrays.asList("8", "eight", "it"), java.util.Arrays.asList("9", "nine", "line"), java.util.Arrays.asList("#", "pound", "hash", "hush", "number"), java.util.Arrays.asList("*", "star", "start", "stark")}), j$.util.function.Function.-CC.identity(), j$.util.function.Function.-CC.identity()).c(new defpackage.amer(0));
        final defpackage.amdk amdkVar = new defpackage.amdk(17);
        final java.util.function.BiFunction biFunction = new java.util.function.BiFunction() { // from class: aitc
            @Override // java.util.function.BiFunction
            public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
                return j$.util.function.BiFunction.-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return (j$.util.stream.Stream) amdkVar.apply(obj);
            }
        };
        c = aitt.m(aittVarC.d(new java.util.function.BiFunction() { // from class: aitb
            @Override // java.util.function.BiFunction
            public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
                return j$.util.function.BiFunction.-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                j$.util.stream.Stream streamEmpty = (j$.util.stream.Stream) biFunction.apply(obj, obj2);
                if (streamEmpty == null) {
                    streamEmpty = j$.util.stream.Stream.-CC.empty();
                }
                return streamEmpty.map(new defpackage.aite(obj2, 0));
            }
        }).flatMap(j$.util.function.Function.-CC.identity())).f();
        d = aihd.r(defpackage.amfw.MATCHED_CACHE, defpackage.amfw.PREDICTED_BY_CACHE);
    }

    public static aify a(defpackage.amcp amcpVar, int i, int i2, long j) {
        aift aiftVar = new aift(4);
        defpackage.altp altpVarB = defpackage.altp.b(i, i2);
        defpackage.amen amenVar = amcpVar.f;
        aify aifyVarA = amenVar.d.a(amcpVar, altpVarB);
        int i3 = altpVarB.a;
        aify aifyVarA2 = amcpVar.a();
        aift aiftVar2 = new aift(4);
        int iIntValue = i3;
        for (int i4 = 0; i4 < aifyVarA.size(); i4++) {
            for (int i5 = 0; i5 < aifyVarA2.size() && ((java.lang.Integer) aifyVarA2.get(i5)).intValue() < ((java.lang.Integer) aifyVarA.get(i4)).intValue(); i5++) {
                iIntValue = java.lang.Math.max(iIntValue, ((java.lang.Integer) aifyVarA2.get(i5)).intValue());
            }
            java.lang.String strTrim = defpackage.altp.b(iIntValue, ((java.lang.Integer) aifyVarA.get(i4)).intValue()).h(amcpVar.b).trim();
            int length = strTrim.length();
            int length2 = strTrim.split(" ").length;
            if (length >= amenVar.b && length2 >= amenVar.c) {
                aiftVar2.i((java.lang.Integer) aifyVarA.get(i4));
                iIntValue = ((java.lang.Integer) aifyVarA.get(i4)).intValue();
            }
        }
        aify aifyVarH = aiftVar2.h();
        aift aiftVar3 = new aift(4);
        aiftVar3.k(amcpVar.a());
        aiftVar3.k(aifyVarH);
        int i6 = 2;
        j$.util.stream.Stream streamDistinct = j$.util.stream.Stream.-CC.concat(j$.util.Collection.-EL.stream(aiftVar3.h()), j$.util.stream.Stream.-CC.of(new java.lang.Integer[]{java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(altpVarB.b)})).filter(new defpackage.amcc(altpVarB, 6)).sorted().distinct();
        j$.util.stream.Collector collector = aido.a;
        aify aifyVar = (aify) streamDistinct.collect(collector);
        aify aifyVar2 = (aify) new aits(j$.util.Collection.-EL.stream(aifyVar).limit(aifyVar.size() - 1), j$.util.Collection.-EL.stream(aifyVar).skip(1L)).d(new defpackage.aitf(7)).collect(collector);
        int size = aifyVar2.size();
        long j2 = j;
        for (int i7 = 0; i7 < size; i7++) {
            j$.util.Optional optionalD = amcpVar.d((defpackage.altp) aifyVar2.get(i7), j2);
            j$.util.Objects.requireNonNull(aiftVar);
            defpackage.amdj amdjVar = new defpackage.amdj(aiftVar, i6);
            if (true == optionalD.isPresent()) {
                ((aift) amdjVar.a).i(optionalD.get());
            }
            j2++;
        }
        return aiftVar.h();
    }

    public static aify b(java.lang.String str, java.lang.String str2) {
        aift aiftVar = new aift(4);
        aihd aihdVarR = aihd.r(",", ".");
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            while (i < str2.length() && str2.charAt(i) != str.charAt(i3) && aihdVarR.contains(java.lang.Character.toString(str2.charAt(i)))) {
                i2++;
                i++;
            }
            aiftVar.i(java.lang.Integer.valueOf(i2));
            i++;
        }
        if (i < str2.length() && aihdVarR.contains(java.lang.Character.toString(str2.charAt(i)))) {
            aiftVar.i(java.lang.Integer.valueOf(i2 + 1));
        }
        return aiftVar.h();
    }

    public static aigf c(aigf aigfVar) {
        return (aigf) j$.util.Collection.-EL.stream(aigfVar.e()).filter(new defpackage.amdm(6)).collect(aigf.r());
    }

    public static defpackage.amft d(defpackage.amft amftVar, defpackage.amfx amfxVar) {
        akzx akzxVarP = amftVar.p();
        int i = amftVar.c;
        int iE = defpackage.amjk.e(i);
        if (iE == 0) {
            throw null;
        }
        int i2 = 1;
        switch (iE - 1) {
            case 0:
                defpackage.amfy amfyVar = (i == 1 ? (defpackage.amfp) amftVar.d : defpackage.amfp.a).d;
                if (amfyVar == null) {
                    amfyVar = defpackage.amfy.a;
                }
                akzx akzxVarP2 = amfyVar.p();
                akzxVarP2.be(amfxVar);
                akzx akzxVarP3 = (amftVar.c == 1 ? (defpackage.amfp) amftVar.d : defpackage.amfp.a).p();
                akzxVarP3.u();
                defpackage.amfp amfpVar = (defpackage.amfp) akzxVarP3.b;
                defpackage.amfy amfyVar2 = (defpackage.amfy) akzxVarP2.p();
                j$.util.Objects.requireNonNull(amfyVar2);
                amfpVar.d = amfyVar2;
                amfpVar.b |= 2;
                akzxVarP.u();
                defpackage.amft amftVar2 = (defpackage.amft) akzxVarP.b;
                defpackage.amfp amfpVar2 = (defpackage.amfp) akzxVarP3.p();
                j$.util.Objects.requireNonNull(amfpVar2);
                amftVar2.d = amfpVar2;
                amftVar2.c = 1;
                return (defpackage.amft) akzxVarP.p();
            case 1:
                defpackage.amgc amgcVar = i == 2 ? (defpackage.amgc) amftVar.d : defpackage.amgc.a;
                defpackage.amfy amfyVar3 = amgcVar.e;
                if (amfyVar3 == null) {
                    amfyVar3 = defpackage.amfy.a;
                }
                akzx akzxVarP4 = amfyVar3.p();
                akzxVarP4.be(amfxVar);
                akzx akzxVarP5 = amgcVar.p();
                akzxVarP5.u();
                defpackage.amgc amgcVar2 = (defpackage.amgc) akzxVarP5.b;
                defpackage.amfy amfyVar4 = (defpackage.amfy) akzxVarP4.p();
                j$.util.Objects.requireNonNull(amfyVar4);
                amgcVar2.e = amfyVar4;
                amgcVar2.b |= 8;
                int iAN = a.aN(amgcVar.g);
                if (iAN == 0 || iAN == 1) {
                    i2 = 3;
                } else {
                    int iAN2 = a.aN(amgcVar.g);
                    if (iAN2 != 0) {
                        i2 = iAN2;
                    }
                }
                akzxVarP5.u();
                defpackage.amgc amgcVar3 = (defpackage.amgc) akzxVarP5.b;
                amgcVar3.g = i2 - 1;
                amgcVar3.b |= 32;
                akzxVarP.u();
                defpackage.amft amftVar3 = (defpackage.amft) akzxVarP.b;
                defpackage.amgc amgcVar4 = (defpackage.amgc) akzxVarP5.p();
                j$.util.Objects.requireNonNull(amgcVar4);
                amftVar3.d = amgcVar4;
                amftVar3.c = 2;
                return (defpackage.amft) akzxVarP.p();
            case 2:
            case 3:
            case 4:
            case 6:
                return amftVar;
            case 5:
                defpackage.amfy amfyVar5 = (i == 8 ? (defpackage.amgf) amftVar.d : defpackage.amgf.a).e;
                if (amfyVar5 == null) {
                    amfyVar5 = defpackage.amfy.a;
                }
                akzx akzxVarP6 = amfyVar5.p();
                akzxVarP6.be(amfxVar);
                akzx akzxVarP7 = (amftVar.c == 8 ? (defpackage.amgf) amftVar.d : defpackage.amgf.a).p();
                akzxVarP7.u();
                defpackage.amgf amgfVar = (defpackage.amgf) akzxVarP7.b;
                defpackage.amfy amfyVar6 = (defpackage.amfy) akzxVarP6.p();
                j$.util.Objects.requireNonNull(amfyVar6);
                amgfVar.e = amfyVar6;
                amgfVar.b |= 4;
                akzxVarP.u();
                defpackage.amft amftVar4 = (defpackage.amft) akzxVarP.b;
                defpackage.amgf amgfVar2 = (defpackage.amgf) akzxVarP7.p();
                j$.util.Objects.requireNonNull(amgfVar2);
                amftVar4.d = amgfVar2;
                amftVar4.c = 8;
                return (defpackage.amft) akzxVarP.p();
            default:
                a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/Utils", "addAnnotation", 834, "Utils.java").v("Setting an annotation on an unset AMItem");
                return amftVar;
        }
    }

    public static defpackage.amft e(defpackage.amft amftVar, int i) {
        int length = n(amftVar).length();
        if (i > 0) {
            akzx akzxVarM = defpackage.amfx.a.m();
            defpackage.amfw amfwVar = defpackage.amfw.MATCHED_CACHE;
            akzxVarM.u();
            defpackage.amfx amfxVar = (defpackage.amfx) akzxVarM.b;
            amfxVar.e = amfwVar.f;
            amfxVar.b |= 4;
            akzxVarM.u();
            defpackage.amfx amfxVar2 = (defpackage.amfx) akzxVarM.b;
            amfxVar2.b |= 1;
            amfxVar2.c = 0;
            akzxVarM.u();
            defpackage.amfx amfxVar3 = (defpackage.amfx) akzxVarM.b;
            amfxVar3.b |= 2;
            amfxVar3.d = i;
            amftVar = d(amftVar, (defpackage.amfx) akzxVarM.p());
        }
        if (i >= length) {
            return amftVar;
        }
        if (i > 0) {
            i++;
        }
        akzx akzxVarM2 = defpackage.amfx.a.m();
        defpackage.amfw amfwVar2 = defpackage.amfw.PREDICTED_BY_CACHE;
        akzxVarM2.u();
        defpackage.amfx amfxVar4 = (defpackage.amfx) akzxVarM2.b;
        amfxVar4.e = amfwVar2.f;
        amfxVar4.b |= 4;
        akzxVarM2.u();
        defpackage.amfx amfxVar5 = (defpackage.amfx) akzxVarM2.b;
        amfxVar5.b |= 1;
        amfxVar5.c = i;
        akzxVarM2.u();
        defpackage.amfx amfxVar6 = (defpackage.amfx) akzxVarM2.b;
        amfxVar6.b |= 2;
        amfxVar6.d = length;
        return d(amftVar, (defpackage.amfx) akzxVarM2.p());
    }

    public static defpackage.amft f(defpackage.amft amftVar, defpackage.amfy amfyVar) {
        akzx akzxVarP = amftVar.p();
        int i = amftVar.c;
        int iE = defpackage.amjk.e(i);
        if (iE == 0) {
            throw null;
        }
        switch (iE - 1) {
            case 0:
                akzx akzxVarP2 = (i == 1 ? (defpackage.amfp) amftVar.d : defpackage.amfp.a).p();
                akzxVarP2.u();
                defpackage.amfp amfpVar = (defpackage.amfp) akzxVarP2.b;
                j$.util.Objects.requireNonNull(amfyVar);
                amfpVar.d = amfyVar;
                amfpVar.b |= 2;
                defpackage.amfp amfpVar2 = (defpackage.amfp) akzxVarP2.p();
                akzxVarP.u();
                defpackage.amft amftVar2 = (defpackage.amft) akzxVarP.b;
                j$.util.Objects.requireNonNull(amfpVar2);
                amftVar2.d = amfpVar2;
                amftVar2.c = 1;
                return (defpackage.amft) akzxVarP.p();
            case 1:
                akzx akzxVarP3 = (i == 2 ? (defpackage.amgc) amftVar.d : defpackage.amgc.a).p();
                akzxVarP3.u();
                defpackage.amgc amgcVar = (defpackage.amgc) akzxVarP3.b;
                j$.util.Objects.requireNonNull(amfyVar);
                amgcVar.e = amfyVar;
                amgcVar.b |= 8;
                defpackage.amgc amgcVar2 = (defpackage.amgc) akzxVarP3.p();
                akzxVarP.u();
                defpackage.amft amftVar3 = (defpackage.amft) akzxVarP.b;
                j$.util.Objects.requireNonNull(amgcVar2);
                amftVar3.d = amgcVar2;
                amftVar3.c = 2;
                return (defpackage.amft) akzxVarP.p();
            case 2:
            case 3:
            case 4:
            case 6:
                a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/Utils", "changeAnnotatedText", 580, "Utils.java").v("Changing text on a non-textual AMItem");
                return amftVar;
            case 5:
                akzx akzxVarP4 = (i == 8 ? (defpackage.amgf) amftVar.d : defpackage.amgf.a).p();
                akzxVarP4.u();
                defpackage.amgf amgfVar = (defpackage.amgf) akzxVarP4.b;
                j$.util.Objects.requireNonNull(amfyVar);
                amgfVar.e = amfyVar;
                amgfVar.b |= 4;
                defpackage.amgf amgfVar2 = (defpackage.amgf) akzxVarP4.p();
                akzxVarP.u();
                defpackage.amft amftVar4 = (defpackage.amft) akzxVarP.b;
                j$.util.Objects.requireNonNull(amgfVar2);
                amftVar4.d = amgfVar2;
                amftVar4.c = 8;
                return (defpackage.amft) akzxVarP.p();
            default:
                a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/Utils", "changeAnnotatedText", 584, "Utils.java").v("Changing text on an unset AMItem");
                return amftVar;
        }
    }

    public static defpackage.amft g(defpackage.amft amftVar) {
        aify aifyVar = (aify) j$.util.Collection.-EL.stream(t(amftVar)).filter(new defpackage.amdm(8)).collect(aido.a);
        j$.util.Optional optionalK = k(amftVar);
        if (optionalK.isEmpty()) {
            a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/Utils", "clearCacheAnnotations", 851, "Utils.java").v("Attempt to clear annotations from item with no text.");
            return amftVar;
        }
        akzx akzxVarP = ((alad) optionalK.get()).p();
        akzxVarP.u();
        ((defpackage.amfy) akzxVarP.b).d = albq.a;
        akzxVarP.bd(aifyVar);
        return f(amftVar, (defpackage.amfy) akzxVarP.p());
    }

    public static defpackage.amft h(defpackage.amft amftVar, java.lang.String str, defpackage.altp altpVar) {
        akzx akzxVarP = amftVar.p();
        defpackage.amft amftVar2 = (defpackage.amft) akzxVarP.b;
        int i = amftVar2.c;
        if (i == 2) {
            akzx akzxVarP2 = ((defpackage.amgc) amftVar2.d).p();
            akzx akzxVarM = defpackage.amgb.a.m();
            int i2 = altpVar.a;
            akzxVarM.u();
            defpackage.amgb amgbVar = (defpackage.amgb) akzxVarM.b;
            amgbVar.b |= 1;
            amgbVar.c = i2;
            int i3 = altpVar.b;
            akzxVarM.u();
            defpackage.amgb amgbVar2 = (defpackage.amgb) akzxVarM.b;
            amgbVar2.b |= 2;
            amgbVar2.d = i3;
            defpackage.amgb amgbVar3 = (defpackage.amgb) akzxVarM.p();
            akzxVarP2.u();
            defpackage.amgc amgcVar = (defpackage.amgc) akzxVarP2.b;
            j$.util.Objects.requireNonNull(amgbVar3);
            amgcVar.f = amgbVar3;
            amgcVar.b |= 16;
            defpackage.amfy amfyVar = ((defpackage.amgc) akzxVarP2.b).e;
            if (amfyVar == null) {
                amfyVar = defpackage.amfy.a;
            }
            if (!amfyVar.c.equals(str)) {
                akzx akzxVarP3 = x(amfyVar, str.length()).p();
                akzxVarP3.u();
                defpackage.amfy amfyVar2 = (defpackage.amfy) akzxVarP3.b;
                j$.util.Objects.requireNonNull(str);
                amfyVar2.b |= 1;
                amfyVar2.c = str;
                defpackage.amfy amfyVar3 = (defpackage.amfy) akzxVarP3.p();
                akzxVarP2.u();
                defpackage.amgc amgcVar2 = (defpackage.amgc) akzxVarP2.b;
                j$.util.Objects.requireNonNull(amfyVar3);
                amgcVar2.e = amfyVar3;
                amgcVar2.b |= 8;
            }
            defpackage.amgc amgcVar3 = (defpackage.amgc) akzxVarP2.p();
            akzxVarP.u();
            defpackage.amft amftVar3 = (defpackage.amft) akzxVarP.b;
            j$.util.Objects.requireNonNull(amgcVar3);
            amftVar3.d = amgcVar3;
            amftVar3.c = 2;
            return (defpackage.amft) akzxVarP.p();
        }
        if (i == 8) {
            akzx akzxVarP4 = ((defpackage.amgf) amftVar2.d).p();
            akzx akzxVarM2 = defpackage.amge.a.m();
            int i4 = altpVar.a;
            akzxVarM2.u();
            defpackage.amge amgeVar = (defpackage.amge) akzxVarM2.b;
            amgeVar.b |= 1;
            amgeVar.c = i4;
            int i5 = altpVar.b;
            akzxVarM2.u();
            defpackage.amge amgeVar2 = (defpackage.amge) akzxVarM2.b;
            amgeVar2.b |= 2;
            amgeVar2.d = i5;
            defpackage.amge amgeVar3 = (defpackage.amge) akzxVarM2.p();
            akzxVarP4.u();
            defpackage.amgf amgfVar = (defpackage.amgf) akzxVarP4.b;
            j$.util.Objects.requireNonNull(amgeVar3);
            amgfVar.f = amgeVar3;
            amgfVar.b |= 8;
            defpackage.amfy amfyVar4 = ((defpackage.amgf) akzxVarP4.b).e;
            if (amfyVar4 == null) {
                amfyVar4 = defpackage.amfy.a;
            }
            if (!amfyVar4.c.equals(str)) {
                akzx akzxVarP5 = x(amfyVar4, str.length()).p();
                akzxVarP5.u();
                defpackage.amfy amfyVar5 = (defpackage.amfy) akzxVarP5.b;
                j$.util.Objects.requireNonNull(str);
                amfyVar5.b |= 1;
                amfyVar5.c = str;
                defpackage.amfy amfyVar6 = (defpackage.amfy) akzxVarP5.p();
                akzxVarP4.u();
                defpackage.amgf amgfVar2 = (defpackage.amgf) akzxVarP4.b;
                j$.util.Objects.requireNonNull(amfyVar6);
                amgfVar2.e = amfyVar6;
                amgfVar2.b |= 4;
            }
            defpackage.amgf amgfVar3 = (defpackage.amgf) akzxVarP4.p();
            akzxVarP.u();
            defpackage.amft amftVar4 = (defpackage.amft) akzxVarP.b;
            j$.util.Objects.requireNonNull(amgfVar3);
            amftVar4.d = amgfVar3;
            amftVar4.c = 8;
            return (defpackage.amft) akzxVarP.p();
        }
        if (i != 1) {
            return (defpackage.amft) akzxVarP.p();
        }
        akzx akzxVarP6 = ((defpackage.amfp) amftVar2.d).p();
        akzx akzxVarM3 = defpackage.amfo.a.m();
        int i6 = altpVar.a;
        akzxVarM3.u();
        defpackage.amfo amfoVar = (defpackage.amfo) akzxVarM3.b;
        amfoVar.b |= 1;
        amfoVar.c = i6;
        int i7 = altpVar.b;
        akzxVarM3.u();
        defpackage.amfo amfoVar2 = (defpackage.amfo) akzxVarM3.b;
        amfoVar2.b |= 2;
        amfoVar2.d = i7;
        defpackage.amfo amfoVar3 = (defpackage.amfo) akzxVarM3.p();
        akzxVarP6.u();
        defpackage.amfp amfpVar = (defpackage.amfp) akzxVarP6.b;
        j$.util.Objects.requireNonNull(amfoVar3);
        amfpVar.e = amfoVar3;
        amfpVar.b |= 4;
        defpackage.amfy amfyVar7 = ((defpackage.amfp) akzxVarP6.b).d;
        if (amfyVar7 == null) {
            amfyVar7 = defpackage.amfy.a;
        }
        if (!amfyVar7.c.equals(str)) {
            akzx akzxVarP7 = x(amfyVar7, str.length()).p();
            akzxVarP7.u();
            defpackage.amfy amfyVar8 = (defpackage.amfy) akzxVarP7.b;
            j$.util.Objects.requireNonNull(str);
            amfyVar8.b |= 1;
            amfyVar8.c = str;
            defpackage.amfy amfyVar9 = (defpackage.amfy) akzxVarP7.p();
            akzxVarP6.u();
            defpackage.amfp amfpVar2 = (defpackage.amfp) akzxVarP6.b;
            j$.util.Objects.requireNonNull(amfyVar9);
            amfpVar2.d = amfyVar9;
            amfpVar2.b |= 2;
        }
        defpackage.amfp amfpVar3 = (defpackage.amfp) akzxVarP6.p();
        akzxVarP.u();
        defpackage.amft amftVar5 = (defpackage.amft) akzxVarP.b;
        j$.util.Objects.requireNonNull(amfpVar3);
        amftVar5.d = amfpVar3;
        amftVar5.c = 1;
        return (defpackage.amft) akzxVarP.p();
    }

    public static defpackage.amfy i(defpackage.amfy amfyVar, int i) {
        java.lang.String strS = s(amfyVar.c, i);
        if (strS.isEmpty()) {
            return defpackage.amfy.a;
        }
        if (strS.equals(amfyVar.c)) {
            return amfyVar;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList((java.util.Collection) amfyVar.d);
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                akzx akzxVarP = amfyVar.p();
                akzxVarP.u();
                defpackage.amfy amfyVar2 = (defpackage.amfy) akzxVarP.b;
                j$.util.Objects.requireNonNull(strS);
                amfyVar2.b |= 1;
                amfyVar2.c = strS;
                akzxVarP.u();
                ((defpackage.amfy) akzxVarP.b).d = albq.a;
                akzxVarP.bd(arrayList);
                return (defpackage.amfy) akzxVarP.p();
            }
            defpackage.amfx amfxVar = (defpackage.amfx) arrayList.get(size);
            if (amfxVar.c > strS.length()) {
                arrayList.remove(size);
            } else if (amfxVar.d >= strS.length()) {
                akzx akzxVarP2 = amfxVar.p();
                int i2 = amfxVar.c;
                akzxVarP2.u();
                defpackage.amfx amfxVar2 = (defpackage.amfx) akzxVarP2.b;
                amfxVar2.b |= 1;
                amfxVar2.c = i2;
                int length = strS.length();
                akzxVarP2.u();
                defpackage.amfx amfxVar3 = (defpackage.amfx) akzxVarP2.b;
                amfxVar3.b |= 2;
                amfxVar3.d = length;
                arrayList.set(size, (defpackage.amfx) akzxVarP2.p());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, java.util.Map] */
    public static j$.util.Optional j(java.lang.String str, java.lang.String str2, boolean z) {
        aigf aigfVarI;
        if (str2.isEmpty()) {
            return j$.util.Optional.empty();
        }
        ahzf ahzfVarD = ahzf.d(" ");
        aify aifyVarN = aify.n(ahzfVarD.j(str2));
        aify aifyVarN2 = aify.n(ahzfVarD.j(str));
        defpackage.ames amesVar = z ? defpackage.ames.b : defpackage.ames.c;
        int i = 17;
        j$.util.stream.Stream streamFlatMap = j$.util.Collection.-EL.stream(aifyVarN).map(new defpackage.amer(3)).flatMap(new defpackage.amdk(i));
        j$.util.stream.Collector collector = aido.a;
        aify aifyVar = (aify) streamFlatMap.collect(collector);
        aify aifyVar2 = (aify) j$.util.Collection.-EL.stream(aifyVarN2).map(new defpackage.amdk(18)).flatMap(new defpackage.amdk(i)).collect(collector);
        int iOrdinal = amesVar.ordinal();
        if (iOrdinal == 0) {
            defpackage.amee.a().a();
            j$.util.Optional optionalD = defpackage.amef.d(aifyVar, aifyVar2);
            aigfVarI = optionalD.isPresent() ? aigf.i((java.util.Map) optionalD.get()) : aikj.b;
        } else if (iOrdinal == 1) {
            aigf aigfVar = defpackage.amef.a;
            aigfVarI = defpackage.amef.b(aifyVar, aifyVar2, new defpackage.ameb(1));
        } else if (iOrdinal != 2) {
            a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/Utils", "alignTokens", 958, "Utils.java").y("Unsupported sequence alignment type %s.", amesVar);
            aigfVarI = aikj.b;
        } else {
            aigf aigfVar2 = defpackage.amef.a;
            aigfVarI = defpackage.amef.b(aifyVar, aifyVar2, new defpackage.ameb(0));
        }
        aify aifyVarW = w(aifyVarN);
        aify aifyVarW2 = w(aifyVarN2);
        j$.util.stream.Stream stream = j$.util.Collection.-EL.stream(aigfVarI.f());
        j$.util.Objects.requireNonNull(aifyVarW);
        aigf aigfVar3 = (aigf) stream.collect(aido.c(new defpackage.amcr(aifyVarW, 13), new defpackage.allm(aifyVarW2, aigfVarI, 8), new defpackage.vfd(6)));
        if (aigfVar3.isEmpty()) {
            return j$.util.Optional.empty();
        }
        java.lang.String strB = new ahyj(" ").b(aifyVarN.b(((java.lang.Integer) java.util.Collections.min(aigfVar3.f())).intValue(), ((java.lang.Integer) java.util.Collections.max(aigfVar3.f())).intValue() + 1));
        return ((double) ailn.a.bt(strB).w(str, Integer.MAX_VALUE)) / ((double) strB.length()) > 0.5d ? j$.util.Optional.empty() : j$.util.Optional.of(strB);
    }

    public static j$.util.Optional k(defpackage.amft amftVar) {
        int i = amftVar.c;
        int iE = defpackage.amjk.e(i);
        if (iE == 0) {
            throw null;
        }
        switch (iE - 1) {
            case 0:
                defpackage.amfy amfyVar = (i == 1 ? (defpackage.amfp) amftVar.d : defpackage.amfp.a).d;
                if (amfyVar == null) {
                    amfyVar = defpackage.amfy.a;
                }
                return j$.util.Optional.of(amfyVar);
            case 1:
                defpackage.amfy amfyVar2 = (i == 2 ? (defpackage.amgc) amftVar.d : defpackage.amgc.a).e;
                if (amfyVar2 == null) {
                    amfyVar2 = defpackage.amfy.a;
                }
                return j$.util.Optional.of(amfyVar2);
            case 2:
            case 3:
            case 4:
            case 6:
                a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/Utils", "getAMItemAnnotatedText", 477, "Utils.java").v("Getting text from non-textual AMItem");
                return j$.util.Optional.empty();
            case 5:
                defpackage.amfy amfyVar3 = (i == 8 ? (defpackage.amgf) amftVar.d : defpackage.amgf.a).e;
                if (amfyVar3 == null) {
                    amfyVar3 = defpackage.amfy.a;
                }
                return j$.util.Optional.of(amfyVar3);
            default:
                a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/Utils", "getAMItemAnnotatedText", 481, "Utils.java").v("Getting text from AMItem with no .item");
                return j$.util.Optional.empty();
        }
    }

    public static j$.util.Optional l(java.lang.String str) {
        return ahvr.cp(str) ? j$.util.Optional.empty() : j$.util.Optional.ofNullable(ahvr.cn((java.lang.String) j$.util.DesugarArrays.stream(str.split(" ")).map(new defpackage.amer(1)).map(new defpackage.amer(2)).filter(new defpackage.amdm(7)).collect(j$.util.stream.Collectors.joining(" "))));
    }

    public static java.lang.String m(java.lang.String str) {
        return str.replace(".", " dot ").replace("@", " at ").replace("/", " slash ").replace("www", "w w w").replace('-', ' ');
    }

    public static java.lang.String n(defpackage.amft amftVar) {
        j$.util.Optional optionalK = k(amftVar);
        if (true == optionalK.isPresent()) {
            optionalK = j$.util.Optional.ofNullable(((defpackage.amfy) optionalK.get()).c);
        }
        return (java.lang.String) optionalK.orElse("");
    }

    public static java.lang.String o(aify aifyVar) {
        int size = aifyVar.size();
        int i = size - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            if (((defpackage.amce) aifyVar.get(i2)).p()) {
                if (i2 != i) {
                    aifyVar = aifyVar.b(i2 + 1, size);
                    break;
                }
                aifyVar = aike.a;
                break;
            }
            if (((defpackage.amce) aifyVar.get(i2)).c.intValue() > 0) {
                aifyVar = aifyVar.b(i2, size);
                break;
            }
        }
        return (java.lang.String) j$.util.Collection.-EL.stream(aifyVar).map(new defpackage.amdk(19)).filter(new defpackage.amdm(4)).collect(j$.util.stream.Collectors.joining(" "));
    }

    public static java.lang.String p(java.util.List list) {
        return (java.lang.String) j$.util.Collection.-EL.stream(list).map(new defpackage.amdk(20)).filter(new defpackage.amdm(5)).collect(j$.util.stream.Collectors.joining(" "));
    }

    public static java.lang.String q(java.lang.String str) {
        java.util.regex.Pattern pattern = defpackage.aprl.a;
        if (str != null && str.length() != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.text.Normalizer.normalize(str, java.text.Normalizer.Form.NFKD));
            for (int i = 0; i < sb.length(); i++) {
                char cCharAt = sb.charAt(i);
                if (cCharAt == 272) {
                    sb.setCharAt(i, 'D');
                } else if (cCharAt == 273) {
                    sb.setCharAt(i, 'd');
                } else if (cCharAt == 321) {
                    sb.setCharAt(i, 'L');
                } else if (cCharAt == 322) {
                    sb.setCharAt(i, 'l');
                } else if (cCharAt == 358) {
                    sb.setCharAt(i, 'T');
                } else if (cCharAt == 359) {
                    sb.setCharAt(i, 't');
                } else if (cCharAt == 407) {
                    sb.setCharAt(i, 'I');
                } else if (cCharAt == 580) {
                    sb.setCharAt(i, 'U');
                } else if (cCharAt == 616) {
                    sb.setCharAt(i, 'i');
                } else if (cCharAt == 649) {
                    sb.setCharAt(i, 'u');
                } else if (cCharAt == 7547) {
                    sb.setCharAt(i, 'I');
                } else if (cCharAt == 7550) {
                    sb.setCharAt(i, 'U');
                } else if (cCharAt == 7588) {
                    sb.setCharAt(i, 'i');
                } else if (cCharAt == 7591) {
                    sb.setCharAt(i, 'I');
                } else if (cCharAt == 7606) {
                    sb.setCharAt(i, 'u');
                }
            }
            str = defpackage.aprl.a.matcher(sb).replaceAll("");
        }
        return ahvr.p(str);
    }

    public static java.lang.String r(java.lang.String str) {
        return str.replaceAll("[.,]\\s", " ").replaceAll("[.,]$", "");
    }

    public static java.lang.String s(java.lang.String str, int i) {
        java.util.List listJ = b.j(str);
        return i >= listJ.size() ? "" : (java.lang.String) j$.util.Collection.-EL.stream(listJ).limit(listJ.size() - i).collect(j$.util.stream.Collectors.joining(" "));
    }

    public static java.util.List t(defpackage.amft amftVar) {
        j$.util.Optional optionalK = k(amftVar);
        return optionalK.isEmpty() ? aike.a : ((defpackage.amfy) optionalK.get()).d;
    }

    public static boolean u(java.lang.String str) {
        for (java.lang.String str2 : str.split(" ", 0)) {
            if (str2.length() > 1 && !j$.util.DesugarArrays.stream(str2.split("", 0)).anyMatch(new defpackage.amdm(9))) {
                return true;
            }
        }
        return false;
    }

    public static boolean v(defpackage.amft amftVar) {
        int i = amftVar.c;
        return i == 2 || i == 8;
    }

    private static aify w(aify aifyVar) {
        aift aiftVar = new aift(4);
        int size = aifyVar.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            for (java.lang.String str : b.h(m((java.lang.String) aifyVar.get(i)))) {
                aiftVar.i(java.lang.Integer.valueOf(i2));
            }
            i++;
            i2++;
        }
        return aiftVar.h();
    }

    private static defpackage.amfy x(defpackage.amfy amfyVar, int i) {
        akzx akzxVarP = amfyVar.p();
        akzxVarP.u();
        ((defpackage.amfy) akzxVarP.b).d = albq.a;
        for (defpackage.amfx amfxVar : amfyVar.d) {
            aihd aihdVar = d;
            defpackage.amfw amfwVarB = defpackage.amfw.b(amfxVar.e);
            if (amfwVarB == null) {
                amfwVarB = defpackage.amfw.UNKNOWN;
            }
            if (!aihdVar.contains(amfwVarB) && amfxVar.c <= i) {
                akzx akzxVarP2 = amfxVar.p();
                if (amfxVar.d > i) {
                    akzxVarP2.u();
                    defpackage.amfx amfxVar2 = (defpackage.amfx) akzxVarP2.b;
                    amfxVar2.b |= 2;
                    amfxVar2.d = i;
                }
                akzxVarP.u();
                defpackage.amfy amfyVar2 = (defpackage.amfy) akzxVarP.b;
                defpackage.amfx amfxVar3 = (defpackage.amfx) akzxVarP2.p();
                j$.util.Objects.requireNonNull(amfxVar3);
                amfyVar2.b();
                amfyVar2.d.add(amfxVar3);
            }
        }
        return (defpackage.amfy) akzxVarP.p();
    }
}
