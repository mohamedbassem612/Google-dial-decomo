package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fsw {
    public final java.lang.String a;
    public final java.lang.String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final defpackage.fta f;
    public final java.lang.String[] g;
    public final java.lang.String h;
    public final java.lang.String i;
    public final defpackage.fsw j;
    private final java.util.HashMap k;
    private final java.util.HashMap l;
    private java.util.List m;

    public fsw(java.lang.String str, java.lang.String str2, long j, long j2, defpackage.fta ftaVar, java.lang.String[] strArr, java.lang.String str3, java.lang.String str4, defpackage.fsw fswVar) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = ftaVar;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        ahvr.ci(str3);
        this.h = str3;
        this.j = fswVar;
        this.k = new java.util.HashMap();
        this.l = new java.util.HashMap();
    }

    private static android.text.SpannableStringBuilder i(java.lang.String str, java.util.Map map) {
        if (!map.containsKey(str)) {
            defpackage.esr esrVar = new defpackage.esr();
            esrVar.d(new android.text.SpannableStringBuilder());
            map.put(str, esrVar);
        }
        java.lang.CharSequence charSequence = ((defpackage.esr) map.get(str)).a;
        ahvr.ci(charSequence);
        return (android.text.SpannableStringBuilder) charSequence;
    }

    public final int a() {
        java.util.List list = this.m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final defpackage.fsw b(int i) {
        java.util.List list = this.m;
        if (list != null) {
            return (defpackage.fsw) list.get(i);
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    public final void c(defpackage.fsw fswVar) {
        if (this.m == null) {
            this.m = new java.util.ArrayList();
        }
        this.m.add(fswVar);
    }

    public final void d(java.util.TreeSet treeSet, boolean z) {
        java.lang.String str = this.a;
        boolean zEquals = "p".equals(str);
        if (z || zEquals || ("div".equals(str) && this.i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(java.lang.Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(java.lang.Long.valueOf(j2));
            }
        }
        if (this.m != null) {
            for (int i = 0; i < this.m.size(); i++) {
                defpackage.fsw fswVar = (defpackage.fsw) this.m.get(i);
                boolean z2 = true;
                if (!z && !zEquals) {
                    z2 = false;
                }
                fswVar.d(treeSet, z2);
            }
        }
    }

    public final void e(long j, java.lang.String str, java.util.List list) {
        java.lang.String str2;
        java.lang.String str3 = this.h;
        boolean zEquals = "".equals(str3);
        boolean zH = h(j);
        if (true != zEquals) {
            str = str3;
        }
        if (zH && "div".equals(this.a) && (str2 = this.i) != null) {
            list.add(new android.util.Pair(str, str2));
            return;
        }
        for (int i = 0; i < a(); i++) {
            b(i).e(j, str, list);
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:120:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:127:0x022c  */
    /* JADX WARN: Code duplicated, block: B:128:0x023b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0255  */
    /* JADX WARN: Code duplicated, block: B:133:0x025e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0269  */
    /* JADX WARN: Code duplicated, block: B:139:0x026f  */
    public final void f(long j, java.util.Map map, java.util.Map map2, java.lang.String str, java.util.Map map3) {
        defpackage.fsw fswVar;
        int i;
        defpackage.fta ftaVarI;
        int i2;
        float f;
        java.util.Iterator it;
        float f2;
        float f3;
        android.text.Layout.Alignment alignment;
        android.text.Layout.Alignment alignment2;
        android.text.style.RelativeSizeSpan[] relativeSizeSpanArr;
        int length;
        android.text.style.RelativeSizeSpan relativeSizeSpan;
        int i3;
        java.util.Map map4 = map;
        if (h(j)) {
            java.lang.String str2 = this.h;
            java.lang.String str3 = true != "".equals(str2) ? str2 : str;
            java.util.Iterator it2 = this.l.entrySet().iterator();
            while (it2.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it2.next();
                java.lang.String str4 = (java.lang.String) entry.getKey();
                java.util.HashMap map5 = this.k;
                int iIntValue = map5.containsKey(str4) ? ((java.lang.Integer) map5.get(str4)).intValue() : 0;
                int iIntValue2 = ((java.lang.Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    defpackage.esr esrVar = (defpackage.esr) map3.get(str4);
                    ahvr.ci(esrVar);
                    defpackage.fsz fszVar = (defpackage.fsz) map2.get(str3);
                    ahvr.ci(fszVar);
                    defpackage.fta ftaVarI2 = defpackage.fsu.i(this.f, this.g, map4);
                    android.text.SpannableStringBuilder spannableStringBuilder = (android.text.SpannableStringBuilder) esrVar.a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new android.text.SpannableStringBuilder();
                        esrVar.d(spannableStringBuilder);
                    }
                    if (ftaVarI2 != null) {
                        defpackage.fsw fswVar2 = this.j;
                        if (ftaVarI2.a() != -1) {
                            spannableStringBuilder.setSpan(new android.text.style.StyleSpan(ftaVarI2.a()), iIntValue, iIntValue2, 33);
                        }
                        if (ftaVarI2.f == 1) {
                            spannableStringBuilder.setSpan(new android.text.style.StrikethroughSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (ftaVarI2.g == 1) {
                            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (ftaVarI2.c) {
                            if (!ftaVarI2.c) {
                                throw new java.lang.IllegalStateException("Font color has not been defined.");
                            }
                            defpackage.hgt.aF(spannableStringBuilder, new android.text.style.ForegroundColorSpan(ftaVarI2.b), iIntValue, iIntValue2);
                        }
                        if (ftaVarI2.e) {
                            if (!ftaVarI2.e) {
                                throw new java.lang.IllegalStateException("Background color has not been defined.");
                            }
                            defpackage.hgt.aF(spannableStringBuilder, new android.text.style.BackgroundColorSpan(ftaVarI2.d), iIntValue, iIntValue2);
                        }
                        if (ftaVarI2.a != null) {
                            defpackage.hgt.aF(spannableStringBuilder, new android.text.style.TypefaceSpan(ftaVarI2.a), iIntValue, iIntValue2);
                        }
                        defpackage.fsv fsvVar = ftaVarI2.r;
                        if (fsvVar != null) {
                            int i4 = fsvVar.f;
                            if (i4 == -1) {
                                int i5 = fszVar.j;
                                i4 = (i5 == 2 || i5 == 1) ? 3 : 1;
                                i3 = 1;
                            } else {
                                i3 = fsvVar.g;
                            }
                            int i6 = fsvVar.h;
                            if (i6 == -2) {
                                i6 = 1;
                            }
                            defpackage.hgt.aF(spannableStringBuilder, new defpackage.esx(i4, i3, i6), iIntValue, iIntValue2);
                        }
                        int i7 = ftaVarI2.m;
                        if (i7 == 2) {
                            while (true) {
                                if (fswVar2 == null) {
                                    fswVar2 = null;
                                    break;
                                }
                                defpackage.fta ftaVarI3 = defpackage.fsu.i(fswVar2.f, fswVar2.g, map4);
                                if (ftaVarI3 != null && ftaVarI3.m == 1) {
                                    break;
                                } else {
                                    fswVar2 = fswVar2.j;
                                }
                            }
                            if (fswVar2 != null) {
                                java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
                                arrayDeque.push(fswVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        fswVar = null;
                                        break;
                                    }
                                    defpackage.fsw fswVar3 = (defpackage.fsw) arrayDeque.pop();
                                    defpackage.fta ftaVarI4 = defpackage.fsu.i(fswVar3.f, fswVar3.g, map4);
                                    if (ftaVarI4 != null && ftaVarI4.m == 3) {
                                        fswVar = fswVar3;
                                        break;
                                    }
                                    for (int iA = fswVar3.a() - 1; iA >= 0; iA--) {
                                        arrayDeque.push(fswVar3.b(iA));
                                    }
                                }
                                if (fswVar != null) {
                                    if (fswVar.a() == 1) {
                                        i = 0;
                                        if (fswVar.b(0).b != null) {
                                            java.lang.String str5 = fswVar.b(0).b;
                                            java.lang.String str6 = eum.a;
                                            defpackage.fta ftaVarI5 = defpackage.fsu.i(fswVar.f, fswVar.g, map4);
                                            int i8 = ftaVarI5 != null ? ftaVarI5.n : -1;
                                            if (i8 == -1 && (ftaVarI = defpackage.fsu.i(fswVar2.f, fswVar2.g, map4)) != null) {
                                                i8 = ftaVarI.n;
                                            }
                                            spannableStringBuilder.setSpan(new defpackage.esw(str5, i8), iIntValue, iIntValue2, 33);
                                        }
                                    } else {
                                        i = 0;
                                    }
                                    defpackage.etr.e("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                }
                            }
                            if (ftaVarI2.q == 1) {
                                defpackage.hgt.aF(spannableStringBuilder, new defpackage.esv(), iIntValue, iIntValue2);
                            }
                            i2 = ftaVarI2.j;
                            f = 100.0f;
                            if (i2 != 1) {
                                it = it2;
                                f2 = 100.0f;
                                defpackage.hgt.aF(spannableStringBuilder, new android.text.style.AbsoluteSizeSpan((int) ftaVarI2.k, true), iIntValue, iIntValue2);
                            } else if (i2 != 2) {
                                it = it2;
                                f2 = 100.0f;
                                defpackage.hgt.aF(spannableStringBuilder, new android.text.style.RelativeSizeSpan(ftaVarI2.k), iIntValue, iIntValue2);
                            } else if (i2 != 3) {
                                it = it2;
                                f2 = 100.0f;
                            } else {
                                float sizeChange = ftaVarI2.k / 100.0f;
                                relativeSizeSpanArr = (android.text.style.RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, android.text.style.RelativeSizeSpan.class);
                                length = relativeSizeSpanArr.length;
                                while (i < length) {
                                    float f4 = f;
                                    relativeSizeSpan = relativeSizeSpanArr[i];
                                    java.util.Iterator it3 = it2;
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) > iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                        sizeChange *= relativeSizeSpan.getSizeChange();
                                    }
                                    defpackage.hgt.aG(spannableStringBuilder, relativeSizeSpan, iIntValue, iIntValue2);
                                    i++;
                                    f = f4;
                                    it2 = it3;
                                }
                                it = it2;
                                f2 = f;
                                spannableStringBuilder.setSpan(new android.text.style.RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                            }
                            if ("p".equals(this.a)) {
                                f3 = ftaVarI2.s;
                                if (f3 != Float.MAX_VALUE) {
                                    esrVar.k = (f3 * (-90.0f)) / f2;
                                }
                                alignment = ftaVarI2.o;
                                if (alignment != null) {
                                    esrVar.b = alignment;
                                }
                                alignment2 = ftaVarI2.p;
                                if (alignment2 != null) {
                                    esrVar.c = alignment2;
                                }
                            }
                            it2 = it;
                        } else if (i7 == 3 || i7 == 4) {
                            spannableStringBuilder.setSpan(new defpackage.fsu(), iIntValue, iIntValue2, 33);
                        }
                        i = 0;
                        if (ftaVarI2.q == 1) {
                            defpackage.hgt.aF(spannableStringBuilder, new defpackage.esv(), iIntValue, iIntValue2);
                        }
                        i2 = ftaVarI2.j;
                        f = 100.0f;
                        if (i2 != 1) {
                            it = it2;
                            f2 = 100.0f;
                            defpackage.hgt.aF(spannableStringBuilder, new android.text.style.AbsoluteSizeSpan((int) ftaVarI2.k, true), iIntValue, iIntValue2);
                        } else if (i2 != 2) {
                            it = it2;
                            f2 = 100.0f;
                            defpackage.hgt.aF(spannableStringBuilder, new android.text.style.RelativeSizeSpan(ftaVarI2.k), iIntValue, iIntValue2);
                        } else if (i2 != 3) {
                            it = it2;
                            f2 = 100.0f;
                        } else {
                            float sizeChange2 = ftaVarI2.k / 100.0f;
                            relativeSizeSpanArr = (android.text.style.RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, android.text.style.RelativeSizeSpan.class);
                            length = relativeSizeSpanArr.length;
                            while (i < length) {
                                float f5 = f;
                                relativeSizeSpan = relativeSizeSpanArr[i];
                                java.util.Iterator it4 = it2;
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) > iIntValue) {
                                }
                                defpackage.hgt.aG(spannableStringBuilder, relativeSizeSpan, iIntValue, iIntValue2);
                                i++;
                                f = f5;
                                it2 = it4;
                            }
                            it = it2;
                            f2 = f;
                            spannableStringBuilder.setSpan(new android.text.style.RelativeSizeSpan(sizeChange2), iIntValue, iIntValue2, 33);
                        }
                        if ("p".equals(this.a)) {
                            f3 = ftaVarI2.s;
                            if (f3 != Float.MAX_VALUE) {
                                esrVar.k = (f3 * (-90.0f)) / f2;
                            }
                            alignment = ftaVarI2.o;
                            if (alignment != null) {
                                esrVar.b = alignment;
                            }
                            alignment2 = ftaVarI2.p;
                            if (alignment2 != null) {
                                esrVar.c = alignment2;
                            }
                        }
                        it2 = it;
                    } else {
                        continue;
                    }
                }
            }
            int i9 = 0;
            while (i9 < a()) {
                b(i9).f(j, map4, map2, str3, map3);
                i9++;
                map4 = map;
            }
        }
    }

    public final void g(long j, boolean z, java.lang.String str, java.util.Map map) {
        java.util.HashMap map2 = this.k;
        map2.clear();
        java.util.HashMap map3 = this.l;
        map3.clear();
        java.lang.String str2 = this.a;
        if ("metadata".equals(str2)) {
            return;
        }
        java.lang.String str3 = this.h;
        java.lang.String str4 = true != "".equals(str3) ? str3 : str;
        if (this.c && z) {
            android.text.SpannableStringBuilder spannableStringBuilderI = i(str4, map);
            java.lang.String str5 = this.b;
            ahvr.ci(str5);
            spannableStringBuilderI.append((java.lang.CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            i(str4, map).append('\n');
            return;
        }
        if (h(j)) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str6 = (java.lang.String) entry.getKey();
                java.lang.CharSequence charSequence = ((defpackage.esr) entry.getValue()).a;
                ahvr.ci(charSequence);
                map2.put(str6, java.lang.Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i = 0; i < a(); i++) {
                b(i).g(j, z || zEquals, str4, map);
            }
            if (zEquals) {
                android.text.SpannableStringBuilder spannableStringBuilderI2 = i(str4, map);
                int length = spannableStringBuilderI2.length();
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    if (spannableStringBuilderI2.charAt(length) != ' ') {
                        if (spannableStringBuilderI2.charAt(length) == '\n') {
                            break;
                        }
                        spannableStringBuilderI2.append('\n');
                        break;
                    }
                }
            }
            for (java.util.Map.Entry entry2 : map.entrySet()) {
                java.lang.String str7 = (java.lang.String) entry2.getKey();
                java.lang.CharSequence charSequence2 = ((defpackage.esr) entry2.getValue()).a;
                ahvr.ci(charSequence2);
                map3.put(str7, java.lang.Integer.valueOf(charSequence2.length()));
            }
        }
    }

    public final boolean h(long j) {
        long j2 = this.d;
        if (j2 == -9223372036854775807L) {
            if (this.e == -9223372036854775807L) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        if (j2 <= j && this.e == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= this.e) {
            return j2 <= j && j < this.e;
        }
        return true;
    }
}
