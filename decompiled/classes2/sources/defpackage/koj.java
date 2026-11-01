package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class koj {
    public boolean a;
    private final android.content.Context b;
    private final kiu c;
    private java.lang.CharSequence d = "";
    private final aify e = aike.a;
    private j$.util.Optional f = j$.util.Optional.empty();

    public koj(android.content.Context context, kiu kiuVar) {
        this.b = context;
        this.c = kiuVar;
    }

    private static java.lang.String d(java.util.List list) {
        return android.text.TextUtils.join(", ", (java.lang.Iterable) j$.util.Collection.-EL.stream(list).filter(new defpackage.jvr(8)).collect(j$.util.stream.Collectors.toCollection(new defpackage.iaz(4))));
    }

    private static boolean e(kiu kiuVar, int i) {
        return (kiuVar.o & i) == i;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:134:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:136:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:138:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00df  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ed  */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, java.util.List] */
    public final java.lang.CharSequence a() {
        int i;
        j$.util.Optional optionalEmpty;
        int i2;
        defpackage.kiw kiwVar;
        java.lang.String str;
        defpackage.kiw kiwVar2;
        aify aifyVarN;
        defpackage.kiw kiwVar3;
        java.lang.CharSequence charSequenceExpandTemplate;
        kgu kguVarB;
        android.content.Context context = this.b;
        aeqx aeqxVarMy = defpackage.hgz.S(context).my();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kiu kiuVar = this.c;
        arrayList.add(aeqxVarMy.d(kiuVar, true));
        defpackage.kiw kiwVar4 = kiuVar.r;
        if (kiwVar4 == null) {
            kiwVar4 = defpackage.kiw.a;
        }
        java.lang.String str2 = kiwVar4.h;
        if (!android.text.TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
        }
        int i3 = kiuVar.B;
        int i4 = 2;
        if (i3 > 1) {
            arrayList.add(context.getString(e(kiuVar, 1) ? 2132017183 : e(kiuVar, 32) ? 2132017182 : 2132017181, java.lang.Integer.valueOf(i3)));
        } else {
            int i5 = kiuVar.q;
            if (i5 == 1) {
                if (e(kiuVar, 1)) {
                    i = 2132017171;
                } else if (e(kiuVar, 32)) {
                    i = 2132017170;
                } else {
                    i = 2132017169;
                }
            } else if (i5 != 2) {
                if (i5 == 4) {
                    throw new java.lang.IllegalStateException("Voicemails not expected in conversation history");
                }
                if (i5 != 5) {
                    if (i5 != 6) {
                        if (i5 != 7) {
                            i = e(kiuVar, 1) ? 2132017180 : e(kiuVar, 32) ? 2132017179 : 2132017178;
                        } else if (e(kiuVar, 1)) {
                            i = 2132017171;
                        } else if (e(kiuVar, 32)) {
                            i = 2132017170;
                        } else {
                            i = 2132017169;
                        }
                    } else if (e(kiuVar, 1)) {
                        i = 2132017174;
                    } else {
                        i = e(kiuVar, 32) ? 2132017173 : 2132017172;
                    }
                } else if (e(kiuVar, 1)) {
                    i = 2132017177;
                } else {
                    i = e(kiuVar, 32) ? 2132017176 : 2132017175;
                }
            } else if (e(kiuVar, 1)) {
                i = 2132017187;
            } else {
                i = e(kiuVar, 32) ? 2132017186 : 2132017184;
            }
            arrayList.add(context.getString(i));
        }
        java.lang.String strD = d(arrayList);
        aify aifyVar = this.e;
        if (aifyVar.isEmpty()) {
            optionalEmpty = j$.util.Optional.empty();
        } else {
            if (aifyVar == null) {
                throw new java.lang.NullPointerException("Null callFeaturesList");
            }
            optionalEmpty = j$.util.Optional.ofNullable(new defpackage.kok(aifyVar));
        }
        j$.util.Optional optional = this.f;
        defpackage.kiw kiwVar5 = kiuVar.r;
        if (kiwVar5 == null) {
            kiwVar5 = defpackage.kiw.a;
        }
        java.lang.Object obj = null;
        if (kiwVar5.r) {
            aifyVarN = aify.p(defpackage.hgu.r((android.content.Context) aeqxVarMy.b, j$.time.Instant.now().toEpochMilli(), kiuVar.e, false));
            i4 = 2;
            i2 = 0;
            obj = null;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            defpackage.kiw kiwVar6 = kiuVar.r;
            if (kiwVar6 == null) {
                kiwVar6 = defpackage.kiw.a;
            }
            if (kiwVar6.j) {
                i2 = 0;
                arrayList2.add(((android.content.Context) aeqxVarMy.b).getText(2132019474));
            } else {
                i2 = 0;
                if (((tkk) aeqxVarMy.f).a() && ((tkl) aeqxVarMy.m).t(kiuVar)) {
                    arrayList2.add(aeqxVarMy.f(kiuVar));
                } else if (((tkl) aeqxVarMy.m).v(kiuVar)) {
                    arrayList2.add(yee.c((android.content.Context) aeqxVarMy.b));
                } else {
                    j$.util.Optional optionalC = aeqxVarMy.c(kiuVar);
                    if (optionalC.isPresent()) {
                        arrayList2.add((java.lang.CharSequence) optionalC.orElseThrow());
                    }
                }
            }
            java.lang.Object obj2 = aeqxVarMy.b;
            android.content.Context context2 = (android.content.Context) obj2;
            arrayList2.add(defpackage.hgu.r(context2, j$.time.Instant.now().toEpochMilli(), kiuVar.e, false));
            aify aifyVar2 = (aify) optional.orElse((java.lang.Object) null);
            if (aifyVar2 == null) {
                defpackage.hvp hvpVar = new defpackage.hvp(aeqxVarMy, arrayList2, 7, null);
                if (true == optionalEmpty.isPresent()) {
                    java.lang.Object obj3 = optionalEmpty.get();
                    java.lang.Object obj4 = hvpVar.b;
                    ?? r7 = hvpVar.a;
                    defpackage.kok kokVar = (defpackage.kok) obj3;
                    android.content.Context context3 = (android.content.Context) ((aeqx) obj4).b;
                    java.lang.CharSequence text = context3.getText(2132018195);
                    java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[1];
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    if (kokVar.b == 0) {
                        throw null;
                    }
                    if (kokVar.c == 0) {
                        throw null;
                    }
                    if (kokVar.d == 0) {
                        throw null;
                    }
                    aike aikeVar = kokVar.a;
                    for (int i6 = i2; i6 < aikeVar.d; i6++) {
                        defpackage.koh kohVar = (defpackage.koh) aikeVar.get(i6);
                        if (kohVar != defpackage.koh.HD && kohVar != defpackage.koh.LTE && kohVar != defpackage.koh.WIFI) {
                            sb.append(context3.getString(kohVar.k));
                            sb.append(',');
                        }
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    charSequenceArr[i2] = sb.toString();
                    r7.add(android.text.TextUtils.expandTemplate(text, charSequenceArr));
                }
                kiwVar = kiuVar.r;
                if (kiwVar == null) {
                    kiwVar = defpackage.kiw.a;
                }
                if (kiwVar.q.isEmpty()) {
                    str = kiuVar.l;
                } else {
                    kiwVar3 = kiuVar.r;
                    if (kiwVar3 == null) {
                        kiwVar3 = defpackage.kiw.a;
                    }
                    str = kiwVar3.q;
                }
                kiwVar2 = kiuVar.r;
                if (kiwVar2 == null) {
                    kiwVar2 = defpackage.kiw.a;
                }
                if (!kiwVar2.j && !((tkl) aeqxVarMy.m).v(kiuVar) && !str.isEmpty()) {
                    java.lang.CharSequence text2 = context2.getText(2132018194);
                    java.lang.CharSequence[] charSequenceArr2 = new java.lang.CharSequence[1];
                    charSequenceArr2[i2] = str;
                    arrayList2.add(android.text.TextUtils.expandTemplate(text2, charSequenceArr2));
                }
                aifyVarN = aify.n(arrayList2);
            } else if (!aifyVar2.isEmpty()) {
                java.lang.CharSequence text3 = context2.getText(2132018195);
                java.lang.CharSequence[] charSequenceArr3 = new java.lang.CharSequence[1];
                j$.util.stream.Stream map = j$.util.Collection.-EL.stream(aifyVar2).filter(new defpackage.jvr(10)).map(new defpackage.kle(2));
                j$.util.Objects.requireNonNull(obj2);
                charSequenceArr3[i2] = (java.lang.String) map.map(new defpackage.jil(obj2, 5)).collect(j$.util.stream.Collectors.joining(", "));
                arrayList2.add(android.text.TextUtils.expandTemplate(text3, charSequenceArr3));
            }
            kiwVar = kiuVar.r;
            if (kiwVar == null) {
                kiwVar = defpackage.kiw.a;
            }
            if (kiwVar.q.isEmpty()) {
                kiwVar3 = kiuVar.r;
                if (kiwVar3 == null) {
                    kiwVar3 = defpackage.kiw.a;
                }
                str = kiwVar3.q;
            } else {
                str = kiuVar.l;
            }
            kiwVar2 = kiuVar.r;
            if (kiwVar2 == null) {
                kiwVar2 = defpackage.kiw.a;
            }
            if (!kiwVar2.j) {
                java.lang.CharSequence text4 = context2.getText(2132018194);
                java.lang.CharSequence[] charSequenceArr4 = new java.lang.CharSequence[1];
                charSequenceArr4[i2] = str;
                arrayList2.add(android.text.TextUtils.expandTemplate(text4, charSequenceArr4));
            }
            aifyVarN = aify.n(arrayList2);
        }
        java.lang.String strD2 = d(aifyVarN);
        boolean z = this.a;
        java.lang.CharSequence charSequence = this.d;
        boolean zAH = defpackage.hgu.aH(((kog) agab.aH(context, kog.class)).qS(), kiuVar);
        java.lang.CharSequence text5 = context.getResources().getText(2132017219);
        java.lang.CharSequence[] charSequenceArr5 = new java.lang.CharSequence[1];
        charSequenceArr5[i2] = charSequence;
        java.lang.CharSequence charSequenceExpandTemplate2 = android.text.TextUtils.expandTemplate(text5, charSequenceArr5);
        if (z) {
            koi koiVarS = defpackage.hgz.S(context);
            j$.util.Optional optionalB = koiVarS.bM().b(kiuVar.m, kiuVar.n);
            kgz kgzVar = (kgz) koiVarS.mZ().g().orElse(obj);
            if (kgzVar != null && (kguVarB = kgzVar.b(kiuVar)) != null) {
                charSequenceExpandTemplate = kguVarB.e;
            } else if (((java.lang.Boolean) (true != optionalB.isPresent() ? optionalB : j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((sot) optionalB.get()).c.isEmpty()))).orElse(java.lang.Boolean.TRUE)).booleanValue() || kiuVar.h.isEmpty()) {
                charSequenceExpandTemplate = "";
            } else {
                java.lang.CharSequence text6 = context.getResources().getText(2132017226);
                java.lang.CharSequence[] charSequenceArr6 = new java.lang.CharSequence[1];
                charSequenceArr6[i2] = ((sot) optionalB.orElseThrow()).c;
                charSequenceExpandTemplate = android.text.TextUtils.expandTemplate(text6, charSequenceArr6);
            }
            if (!android.text.TextUtils.isEmpty(charSequenceExpandTemplate)) {
                if (!zAH) {
                    java.lang.CharSequence text7 = context.getResources().getText(2132017222);
                    java.lang.CharSequence[] charSequenceArr7 = new java.lang.CharSequence[3];
                    charSequenceArr7[i2] = strD;
                    charSequenceArr7[1] = strD2;
                    charSequenceArr7[i4] = charSequenceExpandTemplate;
                    return android.text.TextUtils.expandTemplate(text7, charSequenceArr7);
                }
                java.lang.CharSequence text8 = context.getResources().getText(2132017223);
                java.lang.CharSequence[] charSequenceArr8 = new java.lang.CharSequence[4];
                charSequenceArr8[i2] = strD;
                charSequenceArr8[1] = strD2;
                charSequenceArr8[i4] = charSequenceExpandTemplate;
                charSequenceArr8[3] = charSequenceExpandTemplate2;
                return android.text.TextUtils.expandTemplate(text8, charSequenceArr8);
            }
        }
        if (!zAH) {
            java.lang.CharSequence text9 = context.getResources().getText(2132017224);
            java.lang.CharSequence[] charSequenceArr9 = new java.lang.CharSequence[i4];
            charSequenceArr9[i2] = strD;
            charSequenceArr9[1] = strD2;
            return android.text.TextUtils.expandTemplate(text9, charSequenceArr9);
        }
        java.lang.CharSequence text10 = context.getResources().getText(2132017225);
        java.lang.CharSequence[] charSequenceArr10 = new java.lang.CharSequence[3];
        charSequenceArr10[i2] = strD;
        charSequenceArr10[1] = strD2;
        charSequenceArr10[i4] = charSequenceExpandTemplate2;
        return android.text.TextUtils.expandTemplate(text10, charSequenceArr10);
    }

    public final void b(aify aifyVar) {
        this.f = j$.util.Optional.of(aifyVar);
    }

    public final void c(java.lang.CharSequence charSequence) {
        ahvr.ci(charSequence);
        this.d = charSequence;
    }
}
