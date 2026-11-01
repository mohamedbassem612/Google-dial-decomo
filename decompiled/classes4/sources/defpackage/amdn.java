package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amdn implements defpackage.amdf {
    private static final aimz c = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/LearnedOptionExtractor");
    public final defpackage.alij a;
    public amgg b;
    private final defpackage.amci d;
    private final defpackage.amac e;

    public amdn(defpackage.alij alijVar, defpackage.amac amacVar, defpackage.amci amciVar) {
        this.a = alijVar;
        this.e = amacVar;
        this.d = amciVar;
    }

    public static final defpackage.amgf c(defpackage.alig aligVar, defpackage.amcp amcpVar, aify aifyVar, aift aiftVar, int i) {
        alif alifVar = aligVar.b;
        defpackage.altp altpVarB = defpackage.altp.b(alifVar.a, alifVar.b);
        java.lang.String str = amcpVar.b;
        defpackage.altp altpVarF = altpVarB.f(str);
        int i2 = altpVarF.a;
        int i3 = altpVarF.b;
        java.lang.String strH = altpVarF.h(str);
        akzx akzxVarM = defpackage.amgf.a.m();
        java.lang.String str2 = (java.lang.String) j$.util.Collection.-EL.stream(aifyVar).map(new defpackage.amcu(8)).map(new defpackage.amcu(12)).filter(new defpackage.alzc(19)).collect(j$.util.stream.Collectors.joining("|"));
        akzxVarM.u();
        defpackage.amgf amgfVar = (defpackage.amgf) akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        amgfVar.b |= 1;
        amgfVar.c = str2;
        akzxVarM.u();
        defpackage.amgf amgfVar2 = (defpackage.amgf) akzxVarM.b;
        j$.util.Objects.requireNonNull(strH);
        amgfVar2.b |= 2;
        amgfVar2.d = strH;
        akzx akzxVarM2 = defpackage.amge.a.m();
        akzxVarM2.u();
        defpackage.amge amgeVar = (defpackage.amge) akzxVarM2.b;
        amgeVar.b |= 1;
        amgeVar.c = i2 + i;
        akzxVarM2.u();
        defpackage.amge amgeVar2 = (defpackage.amge) akzxVarM2.b;
        amgeVar2.b |= 2;
        amgeVar2.d = i + i3;
        akzxVarM.u();
        defpackage.amgf amgfVar3 = (defpackage.amgf) akzxVarM.b;
        defpackage.amge amgeVar3 = (defpackage.amge) akzxVarM2.p();
        j$.util.Objects.requireNonNull(amgeVar3);
        amgfVar3.f = amgeVar3;
        amgfVar3.b |= 8;
        aify aifyVarH = aiftVar.h();
        akzxVarM.u();
        defpackage.amgf amgfVar4 = (defpackage.amgf) akzxVarM.b;
        alat alatVar = amgfVar4.g;
        if (!alatVar.c()) {
            amgfVar4.g = alad.J(alatVar);
        }
        akyl.i(aifyVarH, amgfVar4.g);
        akzx akzxVarM3 = defpackage.amfy.a.m();
        akzxVarM3.u();
        defpackage.amfy amfyVar = (defpackage.amfy) akzxVarM3.b;
        j$.util.Objects.requireNonNull(strH);
        amfyVar.b |= 1;
        amfyVar.c = strH;
        akzxVarM3.bd(amcpVar.b(defpackage.altp.b(i2, i3)));
        akzxVarM3.bd((java.lang.Iterable) j$.util.Collection.-EL.stream(aifyVar).map(new defpackage.amcu(14)).map(new defpackage.amcr(amcpVar, 4)).map(new defpackage.exw(i2, 10)).collect(aido.a));
        akzxVarM.u();
        defpackage.amgf amgfVar5 = (defpackage.amgf) akzxVarM.b;
        defpackage.amfy amfyVar2 = (defpackage.amfy) akzxVarM3.p();
        j$.util.Objects.requireNonNull(amfyVar2);
        amgfVar5.e = amfyVar2;
        amgfVar5.b |= 4;
        return (defpackage.amgf) akzxVarM.p();
    }

    private final aify d(aiga aigaVar) {
        j$.util.stream.Stream stream = j$.util.Collection.-EL.stream(aigaVar.a("output_spoken"));
        if (!this.b.q) {
            stream = j$.util.stream.Stream.-CC.concat(stream, j$.util.Collection.-EL.stream(aigaVar.a("output_free_text")));
        }
        return (aify) stream.collect(aido.a);
    }

    private static final aify e(aiga aigaVar, defpackage.altp altpVar, java.lang.String str) {
        return (aify) j$.util.Collection.-EL.stream(aigaVar.a(str)).filter(new amdh(altpVar.a, altpVar.b, 0)).collect(aido.a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0597  */
    /* JADX WARN: Code duplicated, block: B:103:0x059a A[Catch: aljs -> 0x0674, TryCatch #7 {aljs -> 0x0674, blocks: (B:92:0x054c, B:94:0x055d, B:96:0x0573, B:98:0x057d, B:100:0x0584, B:116:0x05fe, B:99:0x0582, B:103:0x059a, B:105:0x05a4, B:107:0x05ab, B:106:0x05a9, B:110:0x05c1, B:112:0x05cb, B:114:0x05d2, B:113:0x05d0, B:115:0x05e5, B:117:0x0602, B:119:0x0623, B:121:0x0629, B:122:0x0635, B:123:0x0668, B:126:0x066c, B:129:0x0671, B:124:0x0669, B:125:0x066b), top: B:153:0x054c, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x05a4 A[Catch: aljs -> 0x0674, TryCatch #7 {aljs -> 0x0674, blocks: (B:92:0x054c, B:94:0x055d, B:96:0x0573, B:98:0x057d, B:100:0x0584, B:116:0x05fe, B:99:0x0582, B:103:0x059a, B:105:0x05a4, B:107:0x05ab, B:106:0x05a9, B:110:0x05c1, B:112:0x05cb, B:114:0x05d2, B:113:0x05d0, B:115:0x05e5, B:117:0x0602, B:119:0x0623, B:121:0x0629, B:122:0x0635, B:123:0x0668, B:126:0x066c, B:129:0x0671, B:124:0x0669, B:125:0x066b), top: B:153:0x054c, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x05a9 A[Catch: aljs -> 0x0674, TryCatch #7 {aljs -> 0x0674, blocks: (B:92:0x054c, B:94:0x055d, B:96:0x0573, B:98:0x057d, B:100:0x0584, B:116:0x05fe, B:99:0x0582, B:103:0x059a, B:105:0x05a4, B:107:0x05ab, B:106:0x05a9, B:110:0x05c1, B:112:0x05cb, B:114:0x05d2, B:113:0x05d0, B:115:0x05e5, B:117:0x0602, B:119:0x0623, B:121:0x0629, B:122:0x0635, B:123:0x0668, B:126:0x066c, B:129:0x0671, B:124:0x0669, B:125:0x066b), top: B:153:0x054c, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x05be  */
    /* JADX WARN: Code duplicated, block: B:110:0x05c1 A[Catch: aljs -> 0x0674, TryCatch #7 {aljs -> 0x0674, blocks: (B:92:0x054c, B:94:0x055d, B:96:0x0573, B:98:0x057d, B:100:0x0584, B:116:0x05fe, B:99:0x0582, B:103:0x059a, B:105:0x05a4, B:107:0x05ab, B:106:0x05a9, B:110:0x05c1, B:112:0x05cb, B:114:0x05d2, B:113:0x05d0, B:115:0x05e5, B:117:0x0602, B:119:0x0623, B:121:0x0629, B:122:0x0635, B:123:0x0668, B:126:0x066c, B:129:0x0671, B:124:0x0669, B:125:0x066b), top: B:153:0x054c, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x05cb A[Catch: aljs -> 0x0674, TryCatch #7 {aljs -> 0x0674, blocks: (B:92:0x054c, B:94:0x055d, B:96:0x0573, B:98:0x057d, B:100:0x0584, B:116:0x05fe, B:99:0x0582, B:103:0x059a, B:105:0x05a4, B:107:0x05ab, B:106:0x05a9, B:110:0x05c1, B:112:0x05cb, B:114:0x05d2, B:113:0x05d0, B:115:0x05e5, B:117:0x0602, B:119:0x0623, B:121:0x0629, B:122:0x0635, B:123:0x0668, B:126:0x066c, B:129:0x0671, B:124:0x0669, B:125:0x066b), top: B:153:0x054c, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x05d0 A[Catch: aljs -> 0x0674, TryCatch #7 {aljs -> 0x0674, blocks: (B:92:0x054c, B:94:0x055d, B:96:0x0573, B:98:0x057d, B:100:0x0584, B:116:0x05fe, B:99:0x0582, B:103:0x059a, B:105:0x05a4, B:107:0x05ab, B:106:0x05a9, B:110:0x05c1, B:112:0x05cb, B:114:0x05d2, B:113:0x05d0, B:115:0x05e5, B:117:0x0602, B:119:0x0623, B:121:0x0629, B:122:0x0635, B:123:0x0668, B:126:0x066c, B:129:0x0671, B:124:0x0669, B:125:0x066b), top: B:153:0x054c, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x05e5 A[Catch: aljs -> 0x0674, TryCatch #7 {aljs -> 0x0674, blocks: (B:92:0x054c, B:94:0x055d, B:96:0x0573, B:98:0x057d, B:100:0x0584, B:116:0x05fe, B:99:0x0582, B:103:0x059a, B:105:0x05a4, B:107:0x05ab, B:106:0x05a9, B:110:0x05c1, B:112:0x05cb, B:114:0x05d2, B:113:0x05d0, B:115:0x05e5, B:117:0x0602, B:119:0x0623, B:121:0x0629, B:122:0x0635, B:123:0x0668, B:126:0x066c, B:129:0x0671, B:124:0x0669, B:125:0x066b), top: B:153:0x054c, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0669 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0152  */
    /* JADX WARN: Code duplicated, block: B:52:0x016e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0187  */
    /* JADX WARN: Code duplicated, block: B:71:0x035f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0369  */
    /* JADX WARN: Code duplicated, block: B:75:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:78:0x0421  */
    /* JADX WARN: Code duplicated, block: B:82:0x0455  */
    /* JADX WARN: Code duplicated, block: B:85:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:86:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0511  */
    /* JADX WARN: Code duplicated, block: B:90:0x0519  */
    /* JADX WARN: Code duplicated, block: B:94:0x055d A[Catch: aljs -> 0x0674, TryCatch #7 {aljs -> 0x0674, blocks: (B:92:0x054c, B:94:0x055d, B:96:0x0573, B:98:0x057d, B:100:0x0584, B:116:0x05fe, B:99:0x0582, B:103:0x059a, B:105:0x05a4, B:107:0x05ab, B:106:0x05a9, B:110:0x05c1, B:112:0x05cb, B:114:0x05d2, B:113:0x05d0, B:115:0x05e5, B:117:0x0602, B:119:0x0623, B:121:0x0629, B:122:0x0635, B:123:0x0668, B:126:0x066c, B:129:0x0671, B:124:0x0669, B:125:0x066b), top: B:153:0x054c, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0573 A[Catch: aljs -> 0x0674, TryCatch #7 {aljs -> 0x0674, blocks: (B:92:0x054c, B:94:0x055d, B:96:0x0573, B:98:0x057d, B:100:0x0584, B:116:0x05fe, B:99:0x0582, B:103:0x059a, B:105:0x05a4, B:107:0x05ab, B:106:0x05a9, B:110:0x05c1, B:112:0x05cb, B:114:0x05d2, B:113:0x05d0, B:115:0x05e5, B:117:0x0602, B:119:0x0623, B:121:0x0629, B:122:0x0635, B:123:0x0668, B:126:0x066c, B:129:0x0671, B:124:0x0669, B:125:0x066b), top: B:153:0x054c, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x057d A[Catch: aljs -> 0x0674, TryCatch #7 {aljs -> 0x0674, blocks: (B:92:0x054c, B:94:0x055d, B:96:0x0573, B:98:0x057d, B:100:0x0584, B:116:0x05fe, B:99:0x0582, B:103:0x059a, B:105:0x05a4, B:107:0x05ab, B:106:0x05a9, B:110:0x05c1, B:112:0x05cb, B:114:0x05d2, B:113:0x05d0, B:115:0x05e5, B:117:0x0602, B:119:0x0623, B:121:0x0629, B:122:0x0635, B:123:0x0668, B:126:0x066c, B:129:0x0671, B:124:0x0669, B:125:0x066b), top: B:153:0x054c, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0582 A[Catch: aljs -> 0x0674, TryCatch #7 {aljs -> 0x0674, blocks: (B:92:0x054c, B:94:0x055d, B:96:0x0573, B:98:0x057d, B:100:0x0584, B:116:0x05fe, B:99:0x0582, B:103:0x059a, B:105:0x05a4, B:107:0x05ab, B:106:0x05a9, B:110:0x05c1, B:112:0x05cb, B:114:0x05d2, B:113:0x05d0, B:115:0x05e5, B:117:0x0602, B:119:0x0623, B:121:0x0629, B:122:0x0635, B:123:0x0668, B:126:0x066c, B:129:0x0671, B:124:0x0669, B:125:0x066b), top: B:153:0x054c, inners: #2 }] */
    @Override // defpackage.amdf
    public final aify a(final defpackage.amcp amcpVar, defpackage.altp altpVar, final int i) {
        int i2;
        int i3;
        defpackage.aljs aljsVar;
        int i4;
        aify aifyVar;
        aiga aigaVar;
        defpackage.alij alijVar;
        j$.util.stream.Collector collector;
        java.util.Collection collection;
        aify aifyVar2;
        defpackage.amci amciVar;
        akzx akzxVarM;
        int size;
        int i5;
        akzx akzxVarM2;
        defpackage.amdz amdzVar;
        defpackage.amft amftVar;
        int i6;
        defpackage.amfp amfpVar;
        defpackage.amgc amgcVar;
        defpackage.amgf amgfVar;
        aify aifyVar3;
        aify aifyVar4;
        aify aifyVar5;
        aify aifyVar6;
        java.util.List list;
        aift aiftVar;
        java.lang.String str;
        int iMin;
        defpackage.alig aligVar;
        int size2;
        int i7;
        j$.util.Optional optionalA;
        whq whqVar;
        j$.util.Optional optionalA2;
        whq whqVar2;
        j$.util.Optional optional;
        defpackage.alij alijVar2 = this.a;
        boolean zContains = alijVar2.a().contains(defpackage.alik.TIME_HINTS_V0);
        java.lang.String strQ = defpackage.amev.q(amcpVar.b);
        if (!zContains) {
            strQ = defpackage.amev.r(strQ);
        }
        aify aifyVar7 = alijVar2.b;
        if (aifyVar7 == null) {
            throw new java.lang.NullPointerException("Null heads");
        }
        if (strQ == null) {
            throw new java.lang.NullPointerException("Null text");
        }
        defpackage.alie alieVarB = alijVar2.b(strQ, aifyVar7);
        try {
            defpackage.amci amciVar2 = this.d;
            akzx akzxVarM3 = defpackage.amas.a.m();
            akzx akzxVarM4 = defpackage.amar.a.m();
            akzxVarM4.u();
            defpackage.amar amarVar = (defpackage.amar) akzxVarM4.b;
            j$.util.Objects.requireNonNull(strQ);
            amarVar.c = strQ;
            akzx akzxVarM5 = defpackage.amaq.a.m();
            int i8 = altpVar.a;
            akzxVarM5.u();
            defpackage.amaq amaqVar = (defpackage.amaq) akzxVarM5.b;
            i3 = 2;
            try {
                amaqVar.b |= 1;
                amaqVar.c = i8;
                int i9 = altpVar.b;
                akzxVarM5.u();
                defpackage.amaq amaqVar2 = (defpackage.amaq) akzxVarM5.b;
                i2 = 1;
                try {
                    amaqVar2.b |= 2;
                    amaqVar2.d = i9;
                    akzxVarM4.u();
                    defpackage.amar amarVar2 = (defpackage.amar) akzxVarM4.b;
                    defpackage.amaq amaqVar3 = (defpackage.amaq) akzxVarM5.p();
                    j$.util.Objects.requireNonNull(amaqVar3);
                    amarVar2.d = amaqVar3;
                    amarVar2.b |= 1;
                    java.lang.String strSubstring = strQ.substring(java.lang.Math.max(i8, 0), java.lang.Math.min(i9, strQ.length()));
                    akzxVarM4.u();
                    defpackage.amar amarVar3 = (defpackage.amar) akzxVarM4.b;
                    j$.util.Objects.requireNonNull(strSubstring);
                    amarVar3.b |= 2;
                    amarVar3.e = strSubstring;
                    akzxVarM3.u();
                    defpackage.amas amasVar = (defpackage.amas) akzxVarM3.b;
                    defpackage.amar amarVar4 = (defpackage.amar) akzxVarM4.p();
                    j$.util.Objects.requireNonNull(amarVar4);
                    amasVar.c = amarVar4;
                    try {
                        amasVar.b = 1;
                        try {
                            if (this.b.s) {
                                try {
                                    aify aifyVar8 = alieVarB.a;
                                    if (!aifyVar8.isEmpty()) {
                                        akzxVarM3.z(((alid) aifyVar8.get(0)).b);
                                    }
                                } catch (defpackage.aljs e) {
                                    aljsVar = e;
                                    i2 = 1;
                                    i4 = i2;
                                    a.by(c.c(), "Failed to publish ModelInput.", "com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/LearnedOptionExtractor", "getIvrOptionsFromText", 'T', "LearnedOptionExtractor.java", aljsVar);
                                }
                            }
                            defpackage.amas amasVar2 = (defpackage.amas) akzxVarM3.p();
                            akzz akzzVarM = defpackage.almz.a.m();
                            defpackage.alnb alnbVar = defpackage.alnb.EVENT_PARSING_MODEL_INPUT;
                            akzzVarM.u();
                            defpackage.almz almzVar = akzzVarM.b;
                            almzVar.c = alnbVar.aN;
                            i2 = 1;
                            almzVar.b |= 1;
                            akzzVarM.bV(defpackage.aloc.b, amasVar2);
                            defpackage.almz almzVar2 = (defpackage.almz) akzzVarM.p();
                            j$.util.Optional.empty();
                            synchronized (amciVar2.a) {
                                optional = amciVar2.d;
                            }
                            amciVar2.d(almzVar2, optional);
                            i4 = 1;
                        } catch (defpackage.aljs e2) {
                            e = e2;
                            i2 = 1;
                            aljsVar = e;
                            i4 = i2;
                            a.by(c.c(), "Failed to publish ModelInput.", "com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/LearnedOptionExtractor", "getIvrOptionsFromText", 'T', "LearnedOptionExtractor.java", aljsVar);
                            aifyVar = alieVarB.a;
                            if (aifyVar.isEmpty()) {
                                c.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/LearnedOptionExtractor", "getIvrOptionsFromText", 88, "LearnedOptionExtractor.java").v("Tagging model output is empty");
                                return aike.a;
                            }
                            aigaVar = ((alid) aifyVar.get(0)).a;
                            alijVar = this.a;
                            if (!alijVar.a().contains(defpackage.alik.TIME_HINTS_V0)) {
                                aigaVar = (aiga) j$.util.Collection.-EL.stream(aigaVar.d()).collect(aido.a(new defpackage.amcu(16), new defpackage.allm(amcpVar, strQ, 7)));
                            }
                            final aiga aigaVar2 = (aiga) j$.util.Collection.-EL.stream(aigaVar.d()).filter(new defpackage.alzc(20)).collect(aido.a(new defpackage.amdk(4), new defpackage.amdk(5)));
                            aify aifyVarE = e(aigaVar2, altpVar, "output_dest");
                            j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(aifyVarE).filter(new defpackage.amcc(aigaVar2, 16));
                            collector = aido.a;
                            java.util.Collection collection2 = (aify) streamFilter.collect(collector);
                            collection = (aify) aitt.g(collection2).c(new defpackage.amcr(aigaVar2, 7)).c(new defpackage.amcr(j$.util.Comparator.-CC.comparing(new defpackage.amcu(20)), 8)).j(new defpackage.amdm(i4)).c(new defpackage.amdk(8)).c(new defpackage.amdk(9)).j(j$.util.function.Predicate.-CC.$default$negate(new defpackage.amdm(0))).d(new java.util.function.BiFunction() { // from class: amdg
                                @Override // java.util.function.BiFunction
                                public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
                                    return j$.util.function.BiFunction.-CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.BiFunction
                                public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                                    alif alifVar = ((defpackage.alig) obj).b;
                                    java.lang.String str2 = (java.lang.String) obj2;
                                    defpackage.altp altpVarB = defpackage.altp.b(alifVar.a, alifVar.b);
                                    defpackage.amcp amcpVar2 = amcpVar;
                                    java.lang.String str3 = amcpVar2.b;
                                    defpackage.altp altpVarF = altpVarB.f(str3);
                                    int i10 = altpVarF.a;
                                    int i11 = altpVarF.b;
                                    java.lang.String strH = altpVarF.h(str3);
                                    akzx akzxVarM6 = defpackage.amgc.a.m();
                                    akzxVarM6.u();
                                    defpackage.amgc amgcVar2 = (defpackage.amgc) akzxVarM6.b;
                                    j$.util.Objects.requireNonNull(str2);
                                    amgcVar2.b |= 1;
                                    amgcVar2.c = str2;
                                    akzxVarM6.u();
                                    defpackage.amgc amgcVar3 = (defpackage.amgc) akzxVarM6.b;
                                    j$.util.Objects.requireNonNull(strH);
                                    amgcVar3.b |= 4;
                                    amgcVar3.d = strH;
                                    akzx akzxVarM7 = defpackage.amgb.a.m();
                                    akzxVarM7.u();
                                    defpackage.amgb amgbVar = (defpackage.amgb) akzxVarM7.b;
                                    amgbVar.b |= 1;
                                    int i12 = i;
                                    amgbVar.c = i10 + i12;
                                    akzxVarM7.u();
                                    defpackage.amgb amgbVar2 = (defpackage.amgb) akzxVarM7.b;
                                    amgbVar2.b |= 2;
                                    amgbVar2.d = i12 + i11;
                                    akzxVarM6.u();
                                    defpackage.amgc amgcVar4 = (defpackage.amgc) akzxVarM6.b;
                                    defpackage.amgb amgbVar3 = (defpackage.amgb) akzxVarM7.p();
                                    j$.util.Objects.requireNonNull(amgbVar3);
                                    amgcVar4.f = amgbVar3;
                                    amgcVar4.b |= 16;
                                    akzx akzxVarM8 = defpackage.amfy.a.m();
                                    akzxVarM8.u();
                                    defpackage.amfy amfyVar = (defpackage.amfy) akzxVarM8.b;
                                    j$.util.Objects.requireNonNull(strH);
                                    amfyVar.b |= 1;
                                    amfyVar.c = strH;
                                    akzxVarM8.bd(amcpVar2.b(defpackage.altp.b(i10, i11)));
                                    akzxVarM6.u();
                                    defpackage.amgc amgcVar5 = (defpackage.amgc) akzxVarM6.b;
                                    defpackage.amfy amfyVar2 = (defpackage.amfy) akzxVarM8.p();
                                    j$.util.Objects.requireNonNull(amfyVar2);
                                    amgcVar5.e = amfyVar2;
                                    amgcVar5.b |= 8;
                                    return (defpackage.amgc) akzxVarM6.p();
                                }
                            }).map(new defpackage.amcu(9)).collect(collector);
                            if (this.b.e) {
                                if (this.b.e) {
                                    c.c().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/LearnedOptionExtractor", "extractIvrOptionsFromPrediction", 235, "LearnedOptionExtractor.java").y("Tagging model is missing %s head.", "output_spoken");
                                }
                                aifyVar2 = (aify) j$.util.Collection.-EL.stream(collection).sorted(j$.util.Comparator.-CC.comparing(new defpackage.amdk(0))).collect(collector);
                            } else {
                                if (this.b.e) {
                                    c.c().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/LearnedOptionExtractor", "extractIvrOptionsFromPrediction", 235, "LearnedOptionExtractor.java").y("Tagging model is missing %s head.", "output_spoken");
                                }
                                aifyVar2 = (aify) j$.util.Collection.-EL.stream(collection).sorted(j$.util.Comparator.-CC.comparing(new defpackage.amdk(0))).collect(collector);
                            }
                            try {
                                amciVar = this.d;
                                akzxVarM = defpackage.amav.a.m();
                                size = aifyVar2.size();
                                for (i5 = 0; i5 < size; i5++) {
                                    amdzVar = (defpackage.amdz) aifyVar2.get(i5);
                                    amftVar = (defpackage.amft) amdzVar.c().p();
                                    i6 = amftVar.c;
                                    if (i6 == 8) {
                                        akzx akzxVarM6 = defpackage.amau.a.m();
                                        if (amftVar.c == 8) {
                                            amgfVar = (defpackage.amgf) amftVar.d;
                                        } else {
                                            amgfVar = defpackage.amgf.a;
                                        }
                                        akzxVarM6.u();
                                        defpackage.amau amauVar = (defpackage.amau) akzxVarM6.b;
                                        j$.util.Objects.requireNonNull(amgfVar);
                                        amauVar.c = amgfVar;
                                        amauVar.b = 2;
                                        akzxVarM.bb(akzxVarM6);
                                    } else if (i6 == 2) {
                                        akzx akzxVarM7 = defpackage.amau.a.m();
                                        if (amftVar.c == 2) {
                                            amgcVar = (defpackage.amgc) amftVar.d;
                                        } else {
                                            amgcVar = defpackage.amgc.a;
                                        }
                                        akzxVarM7.u();
                                        defpackage.amau amauVar2 = (defpackage.amau) akzxVarM7.b;
                                        j$.util.Objects.requireNonNull(amgcVar);
                                        amauVar2.c = amgcVar;
                                        amauVar2.b = 1;
                                        akzxVarM.bb(akzxVarM7);
                                    } else if (i6 == 1) {
                                        akzx akzxVarM8 = defpackage.amau.a.m();
                                        if (amftVar.c == 1) {
                                            amfpVar = (defpackage.amfp) amftVar.d;
                                        } else {
                                            amfpVar = defpackage.amfp.a;
                                        }
                                        akzxVarM8.u();
                                        defpackage.amau amauVar3 = (defpackage.amau) akzxVarM8.b;
                                        j$.util.Objects.requireNonNull(amfpVar);
                                        amauVar3.c = amfpVar;
                                        amauVar3.b = 3;
                                        akzxVarM.bb(akzxVarM8);
                                    } else {
                                        c.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/LearnedOptionExtractor", "modelOutputFromParsedOptions", 150, "LearnedOptionExtractor.java").y("Unsupported parsed option: %s", amdzVar);
                                    }
                                }
                                akzxVarM2 = defpackage.amaw.a.m();
                                akzxVarM2.u();
                                defpackage.amaw amawVar = (defpackage.amaw) akzxVarM2.b;
                                defpackage.amav amavVar = (defpackage.amav) akzxVarM.p();
                                j$.util.Objects.requireNonNull(amavVar);
                                amawVar.c = amavVar;
                                amawVar.b = 1;
                                if (this.b.s) {
                                    akzxVarM2.z(((alid) aifyVar.get(0)).c);
                                }
                                defpackage.amaw amawVar2 = (defpackage.amaw) akzxVarM2.p();
                                akzz akzzVarM2 = defpackage.almz.a.m();
                                defpackage.alnb alnbVar2 = defpackage.alnb.EVENT_PARSING_MODEL_OUTPUT;
                                akzzVarM2.u();
                                defpackage.almz almzVar3 = akzzVarM2.b;
                                almzVar3.c = alnbVar2.aN;
                                almzVar3.b |= 1;
                                akzzVarM2.bV(defpackage.alod.b, amawVar2);
                                defpackage.almz almzVar4 = (defpackage.almz) akzzVarM2.p();
                                j$.util.Optional.empty();
                                synchronized (amciVar.a) {
                                    amciVar.d(almzVar4, amciVar.d);
                                    return aifyVar2;
                                }
                            } catch (defpackage.aljs e3) {
                                a.by(c.c(), "Failed to publish ModelOutput.", "com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/LearnedOptionExtractor", "getIvrOptionsFromText", 'e', "LearnedOptionExtractor.java", e3);
                            }
                        }
                    } catch (defpackage.aljs e4) {
                        e = e4;
                        i2 = 1;
                    }
                } catch (defpackage.aljs e5) {
                    e = e5;
                }
            } catch (defpackage.aljs e6) {
                e = e6;
                i2 = 1;
            }
        } catch (defpackage.aljs e7) {
            e = e7;
            i2 = 1;
            i3 = 2;
        }
        aifyVar = alieVarB.a;
        if (aifyVar.isEmpty()) {
            c.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/LearnedOptionExtractor", "getIvrOptionsFromText", 88, "LearnedOptionExtractor.java").v("Tagging model output is empty");
            return aike.a;
        }
        aigaVar = ((alid) aifyVar.get(0)).a;
        alijVar = this.a;
        if (!alijVar.a().contains(defpackage.alik.TIME_HINTS_V0)) {
            aigaVar = (aiga) j$.util.Collection.-EL.stream(aigaVar.d()).collect(aido.a(new defpackage.amcu(16), new defpackage.allm(amcpVar, strQ, 7)));
        }
        final aiga aigaVar3 = (aiga) j$.util.Collection.-EL.stream(aigaVar.d()).filter(new defpackage.alzc(20)).collect(aido.a(new defpackage.amdk(4), new defpackage.amdk(5)));
        aify aifyVarE2 = e(aigaVar3, altpVar, "output_dest");
        j$.util.stream.Stream streamFilter2 = j$.util.Collection.-EL.stream(aifyVarE2).filter(new defpackage.amcc(aigaVar3, 16));
        collector = aido.a;
        java.util.Collection collection3 = (aify) streamFilter2.collect(collector);
        collection = (aify) aitt.g(collection3).c(new defpackage.amcr(aigaVar3, 7)).c(new defpackage.amcr(j$.util.Comparator.-CC.comparing(new defpackage.amcu(20)), 8)).j(new defpackage.amdm(i4)).c(new defpackage.amdk(8)).c(new defpackage.amdk(9)).j(j$.util.function.Predicate.-CC.$default$negate(new defpackage.amdm(0))).d(new java.util.function.BiFunction() { // from class: amdg
            @Override // java.util.function.BiFunction
            public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
                return j$.util.function.BiFunction.-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                alif alifVar = ((defpackage.alig) obj).b;
                java.lang.String str2 = (java.lang.String) obj2;
                defpackage.altp altpVarB = defpackage.altp.b(alifVar.a, alifVar.b);
                defpackage.amcp amcpVar2 = amcpVar;
                java.lang.String str3 = amcpVar2.b;
                defpackage.altp altpVarF = altpVarB.f(str3);
                int i10 = altpVarF.a;
                int i11 = altpVarF.b;
                java.lang.String strH = altpVarF.h(str3);
                akzx akzxVarM9 = defpackage.amgc.a.m();
                akzxVarM9.u();
                defpackage.amgc amgcVar2 = (defpackage.amgc) akzxVarM9.b;
                j$.util.Objects.requireNonNull(str2);
                amgcVar2.b |= 1;
                amgcVar2.c = str2;
                akzxVarM9.u();
                defpackage.amgc amgcVar3 = (defpackage.amgc) akzxVarM9.b;
                j$.util.Objects.requireNonNull(strH);
                amgcVar3.b |= 4;
                amgcVar3.d = strH;
                akzx akzxVarM10 = defpackage.amgb.a.m();
                akzxVarM10.u();
                defpackage.amgb amgbVar = (defpackage.amgb) akzxVarM10.b;
                amgbVar.b |= 1;
                int i12 = i;
                amgbVar.c = i10 + i12;
                akzxVarM10.u();
                defpackage.amgb amgbVar2 = (defpackage.amgb) akzxVarM10.b;
                amgbVar2.b |= 2;
                amgbVar2.d = i12 + i11;
                akzxVarM9.u();
                defpackage.amgc amgcVar4 = (defpackage.amgc) akzxVarM9.b;
                defpackage.amgb amgbVar3 = (defpackage.amgb) akzxVarM10.p();
                j$.util.Objects.requireNonNull(amgbVar3);
                amgcVar4.f = amgbVar3;
                amgcVar4.b |= 16;
                akzx akzxVarM11 = defpackage.amfy.a.m();
                akzxVarM11.u();
                defpackage.amfy amfyVar = (defpackage.amfy) akzxVarM11.b;
                j$.util.Objects.requireNonNull(strH);
                amfyVar.b |= 1;
                amfyVar.c = strH;
                akzxVarM11.bd(amcpVar2.b(defpackage.altp.b(i10, i11)));
                akzxVarM9.u();
                defpackage.amgc amgcVar5 = (defpackage.amgc) akzxVarM9.b;
                defpackage.amfy amfyVar2 = (defpackage.amfy) akzxVarM11.p();
                j$.util.Objects.requireNonNull(amfyVar2);
                amgcVar5.e = amfyVar2;
                amgcVar5.b |= 8;
                return (defpackage.amgc) akzxVarM9.p();
            }
        }).map(new defpackage.amcu(9)).collect(collector);
        if (this.b.e || !alijVar.b.contains("output_spoken")) {
            if (this.b.e) {
                c.c().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/LearnedOptionExtractor", "extractIvrOptionsFromPrediction", 235, "LearnedOptionExtractor.java").y("Tagging model is missing %s head.", "output_spoken");
            }
            aifyVar2 = (aify) j$.util.Collection.-EL.stream(collection).sorted(j$.util.Comparator.-CC.comparing(new defpackage.amdk(0))).collect(collector);
        } else {
            aift aiftVar2 = new aift(4);
            aiftVar2.k(aigaVar3.a("output_key"));
            aify aifyVar9 = aike.a;
            amgg amggVar = this.b;
            if (amggVar.j && amggVar.p) {
                if (alijVar.b.contains("output_user_details")) {
                    collection = collection;
                    collection3 = collection3;
                    final int i10 = 0;
                    aifyVar3 = (aify) aitt.g(e(aigaVar3, altpVar, "output_user_details")).c(new defpackage.amcr(aigaVar3.a("output_user_details"), 6)).c(new defpackage.amdk(6)).d(new java.util.function.BiFunction() { // from class: amdl
                        @Override // java.util.function.BiFunction
                        public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
                            return i10 != 0 ? j$.util.function.BiFunction.-CC.$default$andThen(this, function) : j$.util.function.BiFunction.-CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.BiFunction
                        public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                            if (i10 != 0) {
                                defpackage.alig aligVar2 = (defpackage.alig) obj;
                                aify aifyVar10 = (aify) obj2;
                                aift aiftVar3 = new aift(4);
                                amgg amggVar2 = ((defpackage.amdn) amcpVar).b;
                                if (amggVar2.j && !amggVar2.p) {
                                    aiftVar3.k((java.lang.Iterable) j$.util.Collection.-EL.stream(aifyVar10).map(new defpackage.amcu(17)).filter(new defpackage.amdm(1)).map(new defpackage.amcu(18)).collect(aido.a));
                                }
                                return defpackage.amdn.c(aligVar2, (defpackage.amcp) aigaVar3, aifyVar10, aiftVar3, i);
                            }
                            defpackage.alig aligVar3 = (defpackage.alig) obj;
                            aify aifyVar11 = (aify) obj2;
                            aiga aigaVar4 = (aiga) aigaVar3;
                            j$.util.stream.Stream stream = j$.util.Collection.-EL.stream(aigaVar4.a("output_detail_name"));
                            j$.util.Objects.requireNonNull(aligVar3);
                            j$.util.stream.Stream streamSorted = stream.filter(new defpackage.amcc(aligVar3, 12)).sorted(j$.util.Comparator.-CC.comparing(new defpackage.amcu(11)));
                            j$.util.stream.Collector collector2 = aido.a;
                            aify aifyVar12 = (aify) streamSorted.collect(collector2);
                            j$.util.stream.Stream stream2 = j$.util.Collection.-EL.stream(aigaVar4.a("output_terminal_key"));
                            j$.util.Objects.requireNonNull(aligVar3);
                            aify aifyVar13 = (aify) stream2.filter(new defpackage.amcc(aligVar3, 12)).collect(collector2);
                            j$.util.stream.Stream stream3 = j$.util.Collection.-EL.stream(aigaVar4.a("output_num_digits"));
                            j$.util.Objects.requireNonNull(aligVar3);
                            aify aifyVar14 = (aify) stream3.filter(new defpackage.amcc(aligVar3, 12)).collect(collector2);
                            j$.util.Optional optionalEmpty = aifyVar13.isEmpty() ? j$.util.Optional.empty() : j$.util.Optional.of(((defpackage.alig) aifyVar13.get(0)).a);
                            int i11 = i;
                            java.lang.Object obj3 = amcpVar;
                            aift aiftVar4 = new aift(4);
                            aiftVar4.k((java.lang.Iterable) j$.util.Collection.-EL.stream(aifyVar12).map(new phs(optionalEmpty, aifyVar14, aifyVar12, 13)).collect(collector2));
                            return defpackage.amdn.c(aligVar3, (defpackage.amcp) obj3, aifyVar11, aiftVar4, i11);
                        }
                    }).map(new defpackage.amdk(7)).collect(collector);
                    aiftVar2.k(aigaVar3.a("output_user_details"));
                } else {
                    c.c().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/LearnedOptionExtractor", "extractIvrOptionsFromPrediction", 253, "LearnedOptionExtractor.java").y("Tagging model is missing %s head.", "output_user_details");
                }
                aify aifyVar10 = aifyVar3;
                aify aifyVar11 = (aify) j$.util.Collection.-EL.stream(aifyVarE2).filter(new lvq(aiftVar2, d(aigaVar3), 8)).collect(collector);
                final int i11 = 1;
                aifyVar4 = (aify) aitt.g(aifyVar11).c(new defpackage.amcr(d(aigaVar3), 5)).c(new defpackage.amcu(19)).d(new java.util.function.BiFunction() { // from class: amdl
                    @Override // java.util.function.BiFunction
                    public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
                        return i11 != 0 ? j$.util.function.BiFunction.-CC.$default$andThen(this, function) : j$.util.function.BiFunction.-CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.BiFunction
                    public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                        if (i11 != 0) {
                            defpackage.alig aligVar2 = (defpackage.alig) obj;
                            aify aifyVar12 = (aify) obj2;
                            aift aiftVar3 = new aift(4);
                            amgg amggVar2 = ((defpackage.amdn) this).b;
                            if (amggVar2.j && !amggVar2.p) {
                                aiftVar3.k((java.lang.Iterable) j$.util.Collection.-EL.stream(aifyVar12).map(new defpackage.amcu(17)).filter(new defpackage.amdm(1)).map(new defpackage.amcu(18)).collect(aido.a));
                            }
                            return defpackage.amdn.c(aligVar2, (defpackage.amcp) amcpVar, aifyVar12, aiftVar3, i);
                        }
                        defpackage.alig aligVar3 = (defpackage.alig) obj;
                        aify aifyVar13 = (aify) obj2;
                        aiga aigaVar4 = (aiga) amcpVar;
                        j$.util.stream.Stream stream = j$.util.Collection.-EL.stream(aigaVar4.a("output_detail_name"));
                        j$.util.Objects.requireNonNull(aligVar3);
                        j$.util.stream.Stream streamSorted = stream.filter(new defpackage.amcc(aligVar3, 12)).sorted(j$.util.Comparator.-CC.comparing(new defpackage.amcu(11)));
                        j$.util.stream.Collector collector2 = aido.a;
                        aify aifyVar14 = (aify) streamSorted.collect(collector2);
                        j$.util.stream.Stream stream2 = j$.util.Collection.-EL.stream(aigaVar4.a("output_terminal_key"));
                        j$.util.Objects.requireNonNull(aligVar3);
                        aify aifyVar15 = (aify) stream2.filter(new defpackage.amcc(aligVar3, 12)).collect(collector2);
                        j$.util.stream.Stream stream3 = j$.util.Collection.-EL.stream(aigaVar4.a("output_num_digits"));
                        j$.util.Objects.requireNonNull(aligVar3);
                        aify aifyVar16 = (aify) stream3.filter(new defpackage.amcc(aligVar3, 12)).collect(collector2);
                        j$.util.Optional optionalEmpty = aifyVar15.isEmpty() ? j$.util.Optional.empty() : j$.util.Optional.of(((defpackage.alig) aifyVar15.get(0)).a);
                        int i12 = i;
                        java.lang.Object obj3 = this;
                        aift aiftVar4 = new aift(4);
                        aiftVar4.k((java.lang.Iterable) j$.util.Collection.-EL.stream(aifyVar14).map(new phs(optionalEmpty, aifyVar16, aifyVar14, 13)).collect(collector2));
                        return defpackage.amdn.c(aligVar3, (defpackage.amcp) obj3, aifyVar13, aiftVar4, i12);
                    }
                }).map(new defpackage.amdk(1)).collect(collector);
                aifyVar5 = (aify) j$.util.stream.Stream.-CC.concat(j$.util.Collection.-EL.stream(collection3), j$.util.Collection.-EL.stream(aifyVar11)).collect(collector);
                if (this.b.w) {
                    aifyVar6 = aifyVar4;
                } else if (alijVar.b.contains("output_segmentation")) {
                    int i12 = altpVar.a;
                    int i13 = altpVar.b;
                    list = (aify) j$.util.stream.Stream.-CC.concat(j$.util.Collection.-EL.stream((aify) j$.util.Collection.-EL.stream(aigaVar3.a("output_segmentation")).filter(new amdh(i12, i13, i3)).filter(new defpackage.amcc(aifyVar5, 13)).collect(collector)), j$.util.Collection.-EL.stream(aifyVar5)).sorted(j$.util.Comparator.-CC.comparing(new defpackage.amcu(13))).collect(collector);
                    aiftVar = new aift(4);
                    str = amcpVar.b;
                    iMin = java.lang.Math.min(i13, str.length());
                    int i14 = i12 - 1;
                    aligVar = new defpackage.alig("", new alif(i14, i14, 0.0f));
                    size2 = list.size();
                    i7 = 0;
                    while (i7 < size2) {
                        defpackage.alig aligVar2 = (defpackage.alig) list.get(i7);
                        optionalA2 = aligVar.a(aligVar2);
                        int i15 = iMin;
                        java.util.List list2 = list;
                        whqVar2 = new whq(aiftVar, str, 17);
                        if (true == optionalA2.isPresent()) {
                            alif alifVar = (alif) optionalA2.get();
                            ((aift) whqVar2.a).i(new defpackage.alig(((java.lang.String) whqVar2.b).substring(alifVar.a, alifVar.b), alifVar));
                        }
                        aiftVar.i(aligVar2);
                        i7++;
                        aligVar = aligVar2;
                        iMin = i15;
                        list = list2;
                        aifyVar4 = aifyVar4;
                    }
                    aifyVar6 = aifyVar4;
                    int i16 = iMin + 1;
                    optionalA = aligVar.a(new defpackage.alig("", new alif(i16, i16, 0.0f)));
                    whqVar = new whq(aiftVar, str, 18);
                    if (true == optionalA.isPresent()) {
                        alif alifVar2 = (alif) optionalA.get();
                        ((aift) whqVar.a).i(new defpackage.alig(((java.lang.String) whqVar.b).substring(alifVar2.a, alifVar2.b), alifVar2));
                    }
                    final int i17 = 0;
                    aifyVar9 = (aify) j$.util.Collection.-EL.stream((aify) j$.util.Collection.-EL.stream(aiftVar.h()).filter(new defpackage.amcc(aifyVar5, 14)).collect(collector)).map(new java.util.function.Function() { // from class: amdi
                        @Override // java.util.function.Function
                        public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                            return i17 != 0 ? j$.util.function.Function.-CC.$default$andThen(this, function) : j$.util.function.Function.-CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final java.lang.Object apply(java.lang.Object obj) {
                            if (i17 != 0) {
                                return ((qke) amcpVar).a.getString(i, dxt.a().b((java.lang.String) obj));
                            }
                            alif alifVar3 = ((defpackage.alig) obj).b;
                            int i18 = alifVar3.a;
                            int i19 = alifVar3.b;
                            defpackage.amcp amcpVar2 = (defpackage.amcp) amcpVar;
                            java.lang.String str2 = amcpVar2.b;
                            defpackage.altp altpVarF = defpackage.altp.b(i18, i19).f(str2);
                            int i20 = altpVarF.a;
                            int i21 = altpVarF.b;
                            java.lang.String strH = altpVarF.h(str2);
                            akzx akzxVarM9 = defpackage.amfp.a.m();
                            akzxVarM9.u();
                            defpackage.amfp amfpVar2 = (defpackage.amfp) akzxVarM9.b;
                            j$.util.Objects.requireNonNull(strH);
                            amfpVar2.b |= 1;
                            amfpVar2.c = strH;
                            akzx akzxVarM10 = defpackage.amfo.a.m();
                            akzxVarM10.u();
                            defpackage.amfo amfoVar = (defpackage.amfo) akzxVarM10.b;
                            amfoVar.b |= 1;
                            int i22 = i;
                            amfoVar.c = i20 + i22;
                            akzxVarM10.u();
                            defpackage.amfo amfoVar2 = (defpackage.amfo) akzxVarM10.b;
                            amfoVar2.b |= 2;
                            amfoVar2.d = i22 + i21;
                            akzxVarM9.u();
                            defpackage.amfp amfpVar3 = (defpackage.amfp) akzxVarM9.b;
                            defpackage.amfo amfoVar3 = (defpackage.amfo) akzxVarM10.p();
                            j$.util.Objects.requireNonNull(amfoVar3);
                            amfpVar3.e = amfoVar3;
                            amfpVar3.b |= 4;
                            akzx akzxVarM11 = defpackage.amfy.a.m();
                            akzxVarM11.u();
                            defpackage.amfy amfyVar = (defpackage.amfy) akzxVarM11.b;
                            j$.util.Objects.requireNonNull(strH);
                            amfyVar.b |= 1;
                            amfyVar.c = strH;
                            akzxVarM11.bd(amcpVar2.b(defpackage.altp.b(i20, i21)));
                            akzxVarM9.u();
                            defpackage.amfp amfpVar4 = (defpackage.amfp) akzxVarM9.b;
                            defpackage.amfy amfyVar2 = (defpackage.amfy) akzxVarM11.p();
                            j$.util.Objects.requireNonNull(amfyVar2);
                            amfpVar4.d = amfyVar2;
                            amfpVar4.b |= 2;
                            return (defpackage.amfp) akzxVarM9.p();
                        }

                        @Override // java.util.function.Function
                        public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                            return i17 != 0 ? j$.util.function.Function.-CC.$default$compose(this, function) : j$.util.function.Function.-CC.$default$compose(this, function);
                        }
                    }).map(new defpackage.amcu(15)).collect(collector);
                } else {
                    aifyVar6 = aifyVar4;
                    c.c().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/LearnedOptionExtractor", "extractIvrOptionsFromPrediction", 292, "LearnedOptionExtractor.java").y("Tagging model is missing %s head.", "output_segmentation");
                }
                aifyVar2 = (aify) j$.util.stream.Stream.-CC.of(new j$.util.stream.Stream[]{j$.util.Collection.-EL.stream(collection), j$.util.Collection.-EL.stream(aifyVar6), j$.util.Collection.-EL.stream(aifyVar10), j$.util.Collection.-EL.stream(aifyVar9)}).flatMap(new defpackage.amdk(2)).sorted(j$.util.Comparator.-CC.comparing(new defpackage.amdk(3))).collect(collector);
            }
            aifyVar3 = aifyVar9;
            aify aifyVar12 = aifyVar3;
            aify aifyVar13 = (aify) j$.util.Collection.-EL.stream(aifyVarE2).filter(new lvq(aiftVar2, d(aigaVar3), 8)).collect(collector);
            final int i18 = 1;
            aifyVar4 = (aify) aitt.g(aifyVar13).c(new defpackage.amcr(d(aigaVar3), 5)).c(new defpackage.amcu(19)).d(new java.util.function.BiFunction() { // from class: amdl
                @Override // java.util.function.BiFunction
                public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
                    return i18 != 0 ? j$.util.function.BiFunction.-CC.$default$andThen(this, function) : j$.util.function.BiFunction.-CC.$default$andThen(this, function);
                }

                @Override // java.util.function.BiFunction
                public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                    if (i18 != 0) {
                        defpackage.alig aligVar3 = (defpackage.alig) obj;
                        aify aifyVar14 = (aify) obj2;
                        aift aiftVar3 = new aift(4);
                        amgg amggVar2 = ((defpackage.amdn) this).b;
                        if (amggVar2.j && !amggVar2.p) {
                            aiftVar3.k((java.lang.Iterable) j$.util.Collection.-EL.stream(aifyVar14).map(new defpackage.amcu(17)).filter(new defpackage.amdm(1)).map(new defpackage.amcu(18)).collect(aido.a));
                        }
                        return defpackage.amdn.c(aligVar3, (defpackage.amcp) amcpVar, aifyVar14, aiftVar3, i);
                    }
                    defpackage.alig aligVar4 = (defpackage.alig) obj;
                    aify aifyVar15 = (aify) obj2;
                    aiga aigaVar4 = (aiga) amcpVar;
                    j$.util.stream.Stream stream = j$.util.Collection.-EL.stream(aigaVar4.a("output_detail_name"));
                    j$.util.Objects.requireNonNull(aligVar4);
                    j$.util.stream.Stream streamSorted = stream.filter(new defpackage.amcc(aligVar4, 12)).sorted(j$.util.Comparator.-CC.comparing(new defpackage.amcu(11)));
                    j$.util.stream.Collector collector2 = aido.a;
                    aify aifyVar16 = (aify) streamSorted.collect(collector2);
                    j$.util.stream.Stream stream2 = j$.util.Collection.-EL.stream(aigaVar4.a("output_terminal_key"));
                    j$.util.Objects.requireNonNull(aligVar4);
                    aify aifyVar17 = (aify) stream2.filter(new defpackage.amcc(aligVar4, 12)).collect(collector2);
                    j$.util.stream.Stream stream3 = j$.util.Collection.-EL.stream(aigaVar4.a("output_num_digits"));
                    j$.util.Objects.requireNonNull(aligVar4);
                    aify aifyVar18 = (aify) stream3.filter(new defpackage.amcc(aligVar4, 12)).collect(collector2);
                    j$.util.Optional optionalEmpty = aifyVar17.isEmpty() ? j$.util.Optional.empty() : j$.util.Optional.of(((defpackage.alig) aifyVar17.get(0)).a);
                    int i19 = i;
                    java.lang.Object obj3 = this;
                    aift aiftVar4 = new aift(4);
                    aiftVar4.k((java.lang.Iterable) j$.util.Collection.-EL.stream(aifyVar16).map(new phs(optionalEmpty, aifyVar18, aifyVar16, 13)).collect(collector2));
                    return defpackage.amdn.c(aligVar4, (defpackage.amcp) obj3, aifyVar15, aiftVar4, i19);
                }
            }).map(new defpackage.amdk(1)).collect(collector);
            aifyVar5 = (aify) j$.util.stream.Stream.-CC.concat(j$.util.Collection.-EL.stream(collection3), j$.util.Collection.-EL.stream(aifyVar13)).collect(collector);
            if (this.b.w) {
                aifyVar6 = aifyVar4;
            } else if (alijVar.b.contains("output_segmentation")) {
                int i19 = altpVar.a;
                int i110 = altpVar.b;
                list = (aify) j$.util.stream.Stream.-CC.concat(j$.util.Collection.-EL.stream((aify) j$.util.Collection.-EL.stream(aigaVar3.a("output_segmentation")).filter(new amdh(i19, i110, i3)).filter(new defpackage.amcc(aifyVar5, 13)).collect(collector)), j$.util.Collection.-EL.stream(aifyVar5)).sorted(j$.util.Comparator.-CC.comparing(new defpackage.amcu(13))).collect(collector);
                aiftVar = new aift(4);
                str = amcpVar.b;
                iMin = java.lang.Math.min(i110, str.length());
                int i111 = i19 - 1;
                aligVar = new defpackage.alig("", new alif(i111, i111, 0.0f));
                size2 = list.size();
                i7 = 0;
                while (i7 < size2) {
                    defpackage.alig aligVar3 = (defpackage.alig) list.get(i7);
                    optionalA2 = aligVar.a(aligVar3);
                    int i112 = iMin;
                    java.util.List list3 = list;
                    whqVar2 = new whq(aiftVar, str, 17);
                    if (true == optionalA2.isPresent()) {
                        alif alifVar3 = (alif) optionalA2.get();
                        ((aift) whqVar2.a).i(new defpackage.alig(((java.lang.String) whqVar2.b).substring(alifVar3.a, alifVar3.b), alifVar3));
                    }
                    aiftVar.i(aligVar3);
                    i7++;
                    aligVar = aligVar3;
                    iMin = i112;
                    list = list3;
                    aifyVar4 = aifyVar4;
                }
                aifyVar6 = aifyVar4;
                int i113 = iMin + 1;
                optionalA = aligVar.a(new defpackage.alig("", new alif(i113, i113, 0.0f)));
                whqVar = new whq(aiftVar, str, 18);
                if (true == optionalA.isPresent()) {
                    alif alifVar4 = (alif) optionalA.get();
                    ((aift) whqVar.a).i(new defpackage.alig(((java.lang.String) whqVar.b).substring(alifVar4.a, alifVar4.b), alifVar4));
                }
                final int i114 = 0;
                aifyVar9 = (aify) j$.util.Collection.-EL.stream((aify) j$.util.Collection.-EL.stream(aiftVar.h()).filter(new defpackage.amcc(aifyVar5, 14)).collect(collector)).map(new java.util.function.Function() { // from class: amdi
                    @Override // java.util.function.Function
                    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                        return i114 != 0 ? j$.util.function.Function.-CC.$default$andThen(this, function) : j$.util.function.Function.-CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        if (i114 != 0) {
                            return ((qke) amcpVar).a.getString(i, dxt.a().b((java.lang.String) obj));
                        }
                        alif alifVar5 = ((defpackage.alig) obj).b;
                        int i115 = alifVar5.a;
                        int i116 = alifVar5.b;
                        defpackage.amcp amcpVar2 = (defpackage.amcp) amcpVar;
                        java.lang.String str2 = amcpVar2.b;
                        defpackage.altp altpVarF = defpackage.altp.b(i115, i116).f(str2);
                        int i20 = altpVarF.a;
                        int i21 = altpVarF.b;
                        java.lang.String strH = altpVarF.h(str2);
                        akzx akzxVarM9 = defpackage.amfp.a.m();
                        akzxVarM9.u();
                        defpackage.amfp amfpVar2 = (defpackage.amfp) akzxVarM9.b;
                        j$.util.Objects.requireNonNull(strH);
                        amfpVar2.b |= 1;
                        amfpVar2.c = strH;
                        akzx akzxVarM10 = defpackage.amfo.a.m();
                        akzxVarM10.u();
                        defpackage.amfo amfoVar = (defpackage.amfo) akzxVarM10.b;
                        amfoVar.b |= 1;
                        int i22 = i;
                        amfoVar.c = i20 + i22;
                        akzxVarM10.u();
                        defpackage.amfo amfoVar2 = (defpackage.amfo) akzxVarM10.b;
                        amfoVar2.b |= 2;
                        amfoVar2.d = i22 + i21;
                        akzxVarM9.u();
                        defpackage.amfp amfpVar3 = (defpackage.amfp) akzxVarM9.b;
                        defpackage.amfo amfoVar3 = (defpackage.amfo) akzxVarM10.p();
                        j$.util.Objects.requireNonNull(amfoVar3);
                        amfpVar3.e = amfoVar3;
                        amfpVar3.b |= 4;
                        akzx akzxVarM11 = defpackage.amfy.a.m();
                        akzxVarM11.u();
                        defpackage.amfy amfyVar = (defpackage.amfy) akzxVarM11.b;
                        j$.util.Objects.requireNonNull(strH);
                        amfyVar.b |= 1;
                        amfyVar.c = strH;
                        akzxVarM11.bd(amcpVar2.b(defpackage.altp.b(i20, i21)));
                        akzxVarM9.u();
                        defpackage.amfp amfpVar4 = (defpackage.amfp) akzxVarM9.b;
                        defpackage.amfy amfyVar2 = (defpackage.amfy) akzxVarM11.p();
                        j$.util.Objects.requireNonNull(amfyVar2);
                        amfpVar4.d = amfyVar2;
                        amfpVar4.b |= 2;
                        return (defpackage.amfp) akzxVarM9.p();
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                        return i114 != 0 ? j$.util.function.Function.-CC.$default$compose(this, function) : j$.util.function.Function.-CC.$default$compose(this, function);
                    }
                }).map(new defpackage.amcu(15)).collect(collector);
            } else {
                aifyVar6 = aifyVar4;
                c.c().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/LearnedOptionExtractor", "extractIvrOptionsFromPrediction", 292, "LearnedOptionExtractor.java").y("Tagging model is missing %s head.", "output_segmentation");
            }
            aifyVar2 = (aify) j$.util.stream.Stream.-CC.of(new j$.util.stream.Stream[]{j$.util.Collection.-EL.stream(collection), j$.util.Collection.-EL.stream(aifyVar6), j$.util.Collection.-EL.stream(aifyVar12), j$.util.Collection.-EL.stream(aifyVar9)}).flatMap(new defpackage.amdk(2)).sorted(j$.util.Comparator.-CC.comparing(new defpackage.amdk(3))).collect(collector);
        }
        amciVar = this.d;
        akzxVarM = defpackage.amav.a.m();
        size = aifyVar2.size();
        while (i5 < size) {
            amdzVar = (defpackage.amdz) aifyVar2.get(i5);
            amftVar = (defpackage.amft) amdzVar.c().p();
            i6 = amftVar.c;
            if (i6 == 8) {
                akzx akzxVarM9 = defpackage.amau.a.m();
                if (amftVar.c == 8) {
                    amgfVar = (defpackage.amgf) amftVar.d;
                } else {
                    amgfVar = defpackage.amgf.a;
                }
                akzxVarM9.u();
                defpackage.amau amauVar4 = (defpackage.amau) akzxVarM9.b;
                j$.util.Objects.requireNonNull(amgfVar);
                amauVar4.c = amgfVar;
                amauVar4.b = 2;
                akzxVarM.bb(akzxVarM9);
            } else if (i6 == 2) {
                akzx akzxVarM10 = defpackage.amau.a.m();
                if (amftVar.c == 2) {
                    amgcVar = (defpackage.amgc) amftVar.d;
                } else {
                    amgcVar = defpackage.amgc.a;
                }
                akzxVarM10.u();
                defpackage.amau amauVar5 = (defpackage.amau) akzxVarM10.b;
                j$.util.Objects.requireNonNull(amgcVar);
                amauVar5.c = amgcVar;
                amauVar5.b = 1;
                akzxVarM.bb(akzxVarM10);
            } else if (i6 == 1) {
                akzx akzxVarM11 = defpackage.amau.a.m();
                if (amftVar.c == 1) {
                    amfpVar = (defpackage.amfp) amftVar.d;
                } else {
                    amfpVar = defpackage.amfp.a;
                }
                akzxVarM11.u();
                defpackage.amau amauVar6 = (defpackage.amau) akzxVarM11.b;
                j$.util.Objects.requireNonNull(amfpVar);
                amauVar6.c = amfpVar;
                amauVar6.b = 3;
                akzxVarM.bb(akzxVarM11);
            } else {
                c.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/LearnedOptionExtractor", "modelOutputFromParsedOptions", 150, "LearnedOptionExtractor.java").y("Unsupported parsed option: %s", amdzVar);
            }
        }
        akzxVarM2 = defpackage.amaw.a.m();
        akzxVarM2.u();
        defpackage.amaw amawVar3 = (defpackage.amaw) akzxVarM2.b;
        defpackage.amav amavVar2 = (defpackage.amav) akzxVarM.p();
        j$.util.Objects.requireNonNull(amavVar2);
        amawVar3.c = amavVar2;
        amawVar3.b = 1;
        if (this.b.s && !aifyVar.isEmpty()) {
            akzxVarM2.z(((alid) aifyVar.get(0)).c);
        }
        defpackage.amaw amawVar4 = (defpackage.amaw) akzxVarM2.p();
        akzz akzzVarM3 = defpackage.almz.a.m();
        defpackage.alnb alnbVar3 = defpackage.alnb.EVENT_PARSING_MODEL_OUTPUT;
        akzzVarM3.u();
        defpackage.almz almzVar5 = akzzVarM3.b;
        almzVar5.c = alnbVar3.aN;
        almzVar5.b |= 1;
        akzzVarM3.bV(defpackage.alod.b, amawVar4);
        defpackage.almz almzVar6 = (defpackage.almz) akzzVarM3.p();
        j$.util.Optional.empty();
        synchronized (amciVar.a) {
        }
        amciVar.d(almzVar6, amciVar.d);
        return aifyVar2;
    }

    @Override // defpackage.amdf
    public final ajcq b(defpackage.alqk alqkVar) {
        apdi apdiVar = amgg.y;
        alqkVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) alqkVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        this.b = (amgg) objJ;
        return this.e.c(new defpackage.agqr(this, 10), j$.util.Optional.empty());
    }
}
