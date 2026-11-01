package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class djb {
    public final defpackage.djc a;
    public final defpackage.dll b;
    public final java.lang.CharSequence c;
    public float d;
    public boolean e;
    public float f;
    public final java.util.List g;
    private final int h;
    private final int i;
    private final long j;

    /* JADX WARN: Code duplicated, block: B:102:0x0178  */
    /* JADX WARN: Code duplicated, block: B:123:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:174:0x0264  */
    /* JADX WARN: Code duplicated, block: B:192:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:195:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:197:0x02df  */
    /* JADX WARN: Code duplicated, block: B:200:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:201:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:203:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:206:0x030b  */
    /* JADX WARN: Code duplicated, block: B:209:0x030f A[LOOP:1: B:207:0x030c->B:209:0x030f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:212:0x0338  */
    /* JADX WARN: Code duplicated, block: B:213:0x033c  */
    /* JADX WARN: Code duplicated, block: B:215:0x0353  */
    /* JADX WARN: Code duplicated, block: B:220:0x0384  */
    /* JADX WARN: Code duplicated, block: B:53:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0100  */
    /* JADX WARN: Code duplicated, block: B:61:0x0102  */
    /* JADX WARN: Code duplicated, block: B:65:0x0109  */
    /* JADX WARN: Code duplicated, block: B:68:0x0110  */
    /* JADX WARN: Code duplicated, block: B:69:0x0112  */
    /* JADX WARN: Code duplicated, block: B:72:0x011b  */
    /* JADX WARN: Code duplicated, block: B:74:0x011f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0121  */
    /* JADX WARN: Code duplicated, block: B:76:0x0123  */
    /* JADX WARN: Code duplicated, block: B:79:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x012e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0132  */
    /* JADX WARN: Code duplicated, block: B:83:0x0134  */
    /* JADX WARN: Code duplicated, block: B:86:0x0141 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0143  */
    /* JADX WARN: Code duplicated, block: B:88:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0147  */
    /* JADX WARN: Code duplicated, block: B:90:0x0149 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x014b  */
    /* JADX WARN: Code duplicated, block: B:96:0x015b  */
    /* JADX WARN: Code duplicated, block: B:98:0x015f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0169  */
    /* JADX WARN: Multi-variable type inference failed */
    public djb(defpackage.djc djcVar, int i, int i2, long j) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequence2;
        int iC;
        int i3;
        int i4;
        boolean z;
        int i5;
        int iB;
        int i6;
        int iB2;
        int iB3;
        int i7;
        int i8;
        android.text.TextUtils.TruncateAt truncateAt;
        defpackage.dll dllVarL;
        java.lang.Object[] objArr;
        java.lang.CharSequence charSequence3;
        android.text.Spanned spanned;
        java.lang.Object[] spans;
        java.util.ArrayList arrayList;
        int length;
        int i9;
        java.util.List list;
        int i10;
        boolean z2;
        int i11;
        java.lang.CharSequence charSequenceM;
        java.lang.CharSequence charSequenceM2;
        int i12;
        float f;
        android.graphics.Paint.FontMetricsInt fontMetricsInt;
        this.a = djcVar;
        this.h = i;
        this.i = i2;
        this.j = j;
        if (defpackage.dpd.c(j) != 0 || defpackage.dpd.d(j) != 0) {
            dnv.b("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i <= 0) {
            dnv.b("maxLines should be greater than 0");
        }
        java.lang.CharSequence charSequence4 = djcVar.d;
        android.text.Spanned spanned2 = charSequence4 instanceof android.text.Spanned ? (android.text.Spanned) charSequence4 : null;
        boolean z3 = spanned2 != null && n(spanned2, android.text.style.LineHeightSpan.class);
        long jI = djcVar.a.i();
        defpackage.dpt[] dptVarArr = defpackage.dps.a;
        this.e = ((jI & 1095216660480L) == 0 || z3) ? false : true;
        defpackage.dkz dkzVar = djcVar.a;
        if (i2 == 2 && dkzVar.h() != 4294967296L && dkzVar.h() != 2143289344 && dkzVar.c() != 0 && dkzVar.c() != 5 && dkzVar.c() != 4) {
            java.lang.CharSequence charSequence5 = djcVar.d;
            if (charSequence5.length() == 0) {
                charSequence2 = charSequence5;
                th = null;
            } else {
                android.text.Spannable spannable = charSequence5 instanceof android.text.Spannable ? (android.text.Spannable) charSequence5 : null;
                android.text.Spannable spannableString = spannable == null ? new android.text.SpannableString(charSequence5) : spannable;
                if (defpackage.den.w(spannableString, defpackage.dlq.class)) {
                    th = null;
                    charSequence = spannableString;
                } else {
                    th = null;
                    spannableString.setSpan(new defpackage.dlq(), spannableString.length() - 1, spannableString.length() - 1, 33);
                    charSequence = spannableString;
                }
            }
            this.c = charSequence2;
            if (this.e) {
                this.d = defpackage.dfb.w(dkzVar.i(), h().getTextSize(), djcVar.b);
            }
            iC = dkzVar.c();
            i3 = 3;
            if (iC == 1) {
                i4 = 3;
            } else if (iC == 2) {
                i4 = 4;
            } else if (iC == 3) {
                i4 = 2;
            } else if (iC == 5 && iC == 6) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (dkzVar.c() == 4) {
                z = true;
            } else {
                z = false;
            }
            if (dkzVar.c.h == 2) {
                i5 = 0;
            } else if (android.os.Build.VERSION.SDK_INT <= 32) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            iB = dkzVar.b() & 255;
            if (iB == 1) {
                i6 = 0;
            } else if (iB == 2) {
                i6 = 1;
            } else if (iB == 3) {
                i6 = 2;
            } else {
                i6 = 0;
            }
            iB2 = (dkzVar.b() >> 8) & 255;
            if (iB2 == 1) {
                i3 = 0;
            } else if (iB2 == 2) {
                i3 = 1;
            } else if (iB2 == 3) {
                i3 = 2;
            } else if (iB2 != 4) {
                i3 = 0;
            }
            iB3 = (dkzVar.b() >> 16) & 255;
            if (iB3 == 1 && iB3 == 2) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            if (i2 == 2) {
                truncateAt = android.text.TextUtils.TruncateAt.END;
                i8 = i6;
            } else {
                i8 = i6;
                truncateAt = th;
            }
            dllVarL = l(i4, z, truncateAt, i, i5, i8, i3, i7, charSequence2);
            if (android.os.Build.VERSION.SDK_INT < 35) {
                h().getLetterSpacing();
            }
            if (i2 == 2 || dllVarL.g() <= defpackage.dpd.a(j) || i <= 1) {
                this.b = dllVarL;
            } else {
                int iA = defpackage.dpd.a(j);
                int i13 = dllVarL.g;
                int i14 = 0;
                while (true) {
                    if (i14 >= i13) {
                        i14 = dllVarL.g;
                        break;
                    } else if (dllVarL.b(i14) > iA) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (i14 >= 0 && i14 != this.h) {
                    dllVarL = l(i4, z, truncateAt, i14 <= 0 ? 1 : i14, i5, i8, i3, i7, this.c);
                }
                this.b = dllVarL;
            }
            if (this.e || java.lang.Float.isNaN(this.d)) {
                this.d = dllVarL.g();
            } else {
                float fG = this.d - dllVarL.g();
                defpackage.dos dosVarS = dkzVar.s();
                int i15 = dosVarS != null ? dosVarS.d : defpackage.dos.a.d;
                defpackage.dos dosVarS2 = dkzVar.s();
                int i16 = dosVarS2 != null ? dosVarS2.c : defpackage.dos.a.c;
                int i17 = i16 & 1;
                boolean z4 = (dllVarL.d || (i16 & 16) == 0) ? false : true;
                defpackage.dos dosVarS3 = dkzVar.s();
                float fAbs = dosVarS3 != null ? dosVarS3.b : defpackage.dos.a.b;
                fAbs = fAbs == -1.0f ? dllVarL.g() != 0 ? java.lang.Math.abs((dllVarL.g + (-1) != 0 || (fontMetricsInt = dllVarL.k) == null) ? dllVarL.f.getLineAscent(0) : fontMetricsInt.ascent) / dllVarL.g() : 0.5f : fAbs;
                float fCeil = (float) java.lang.Math.ceil(fG);
                float fCeil2 = (float) (fG <= 0.0f ? java.lang.Math.ceil(fAbs * fCeil) : java.lang.Math.ceil((1.0f - fAbs) * fCeil));
                if (i17 == 0 || !z4) {
                    i12 = 2;
                } else {
                    i12 = 2;
                    if (i15 == 2) {
                        i15 = 2;
                    } else {
                        this.d = dllVarL.g();
                        this.f = 0.0f;
                    }
                }
                if ((i15 == 1 && fG <= 0.0f) || (i15 != i12 && fG < 0.0f)) {
                    this.d = dllVarL.g();
                    this.f = 0.0f;
                } else if (fG >= 0.0f || i15 != i12) {
                    float f2 = 1 == i17 ? 0.0f : fCeil - fCeil2;
                    f = true != z4 ? fCeil2 : 0.0f;
                    this.f = f2;
                    this.d = dllVarL.g() + f2 + f;
                } else {
                    float f3 = i17 != 0 ? fCeil - fCeil2 : 0.0f;
                    f = (dllVarL.d || (i16 & 16) != 0) ? fCeil2 : 0.0f;
                    this.f = f3;
                    this.d = dllVarL.g() + f3 + f;
                }
            }
            h().b(dkzVar.j(), (((long) java.lang.Float.floatToRawIntBits(e())) << 32) | (((long) java.lang.Float.floatToRawIntBits(this.d)) & 4294967295L), dkzVar.a());
            if (dllVarL.m() instanceof android.text.Spanned) {
                charSequenceM = dllVarL.m();
                if (charSequenceM == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type android.text.Spanned");
                }
                if (n((android.text.Spanned) charSequenceM, defpackage.doj.class)) {
                    charSequenceM2 = dllVarL.m();
                    if (charSequenceM2 == null) {
                        defpackage.aooh.h("null cannot be cast to non-null type android.text.Spanned");
                    }
                    objArr = (defpackage.doj[]) ((android.text.Spanned) charSequenceM2).getSpans(0, dllVarL.m().length(), defpackage.doj.class);
                } else {
                    objArr = th;
                }
            } else {
                objArr = th;
            }
            if (objArr != 0) {
                for (defpackage.doj dojVar : objArr) {
                    dojVar.b.b(new defpackage.cpp((((long) java.lang.Float.floatToRawIntBits(e())) << 32) | (((long) java.lang.Float.floatToRawIntBits(this.d)) & 4294967295L)));
                }
            }
            charSequence3 = this.c;
            if (charSequence3 instanceof android.text.Spanned) {
                spanned = (android.text.Spanned) charSequence3;
                spans = spanned.getSpans(0, charSequence3.length(), defpackage.dlw.class);
                length = spans.length;
                arrayList = new java.util.ArrayList(length);
                i9 = 0;
                while (i9 < length) {
                    defpackage.dlw dlwVar = (defpackage.dlw) spans[i9];
                    int spanStart = spanned.getSpanStart(dlwVar);
                    int spanEnd = spanned.getSpanEnd(dlwVar);
                    i10 = this.b.i(spanStart);
                    int i18 = this.h;
                    if (this.b.f.getEllipsisCount(i10) > 0 || spanEnd <= this.b.j(i10) + this.b.f.getEllipsisStart(i10)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    int iH = this.b.h(i10);
                    if (z2 && spanEnd <= iH && i10 < i18) {
                        boolean z5 = this.b.k(i10) == 1;
                        boolean zO = this.b.o(spanStart);
                        if (z5) {
                            defpackage.dll dllVar = this.b;
                            if (zO) {
                                dllVar.f(spanStart, false);
                                throw th;
                            }
                            dllVar.e(spanStart, false);
                            throw th;
                        }
                        defpackage.dll dllVar2 = this.b;
                        if (zO) {
                            dllVar2.e(spanStart, false);
                            throw th;
                        }
                        dllVar2.f(spanStart, false);
                        throw th;
                    }
                    java.lang.Throwable th2 = th;
                    arrayList.add(th2);
                    i9++;
                    th = th2;
                }
                list = arrayList;
            } else {
                list = defpackage.aokc.a;
            }
            this.g = list;
        }
        th = null;
        charSequence = djcVar.d;
        charSequence2 = charSequence;
        this.c = charSequence2;
        if (this.e) {
            this.d = defpackage.dfb.w(dkzVar.i(), h().getTextSize(), djcVar.b);
        }
        iC = dkzVar.c();
        i3 = 3;
        if (iC == 1) {
            i4 = 3;
        } else if (iC == 2) {
            i4 = 4;
        } else if (iC == 3) {
            i4 = 2;
        } else if (iC == 5) {
            i4 = 0;
        } else {
            i4 = 0;
        }
        if (dkzVar.c() == 4) {
            z = true;
        } else {
            z = false;
        }
        if (dkzVar.c.h == 2) {
            i5 = 0;
        } else if (android.os.Build.VERSION.SDK_INT <= 32) {
            i5 = 2;
        } else {
            i5 = 4;
        }
        iB = dkzVar.b() & 255;
        if (iB == 1) {
            i6 = 0;
        } else if (iB == 2) {
            i6 = 1;
        } else if (iB == 3) {
            i6 = 2;
        } else {
            i6 = 0;
        }
        iB2 = (dkzVar.b() >> 8) & 255;
        if (iB2 == 1) {
            i3 = 0;
        } else if (iB2 == 2) {
            i3 = 1;
        } else if (iB2 == 3) {
            i3 = 2;
        } else if (iB2 != 4) {
            i3 = 0;
        }
        iB3 = (dkzVar.b() >> 16) & 255;
        if (iB3 == 1) {
            i7 = 0;
        } else {
            i7 = 0;
        }
        if (i2 == 2) {
            truncateAt = android.text.TextUtils.TruncateAt.END;
            i8 = i6;
        } else {
            i8 = i6;
            truncateAt = th;
        }
        dllVarL = l(i4, z, truncateAt, i, i5, i8, i3, i7, charSequence2);
        if (android.os.Build.VERSION.SDK_INT < 35) {
            h().getLetterSpacing();
        }
        if (i2 == 2) {
            this.b = dllVarL;
        } else {
            this.b = dllVarL;
        }
        if (this.e) {
            this.d = dllVarL.g();
        } else {
            this.d = dllVarL.g();
        }
        h().b(dkzVar.j(), (((long) java.lang.Float.floatToRawIntBits(e())) << 32) | (((long) java.lang.Float.floatToRawIntBits(this.d)) & 4294967295L), dkzVar.a());
        if (dllVarL.m() instanceof android.text.Spanned) {
            objArr = th;
        } else {
            charSequenceM = dllVarL.m();
            if (charSequenceM == null) {
                defpackage.aooh.h("null cannot be cast to non-null type android.text.Spanned");
            }
            if (n((android.text.Spanned) charSequenceM, defpackage.doj.class)) {
                objArr = th;
            } else {
                charSequenceM2 = dllVarL.m();
                if (charSequenceM2 == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type android.text.Spanned");
                }
                objArr = (defpackage.doj[]) ((android.text.Spanned) charSequenceM2).getSpans(0, dllVarL.m().length(), defpackage.doj.class);
            }
        }
        if (objArr != 0) {
            while (i11 < objArr.length) {
                dojVar.b.b(new defpackage.cpp((((long) java.lang.Float.floatToRawIntBits(e())) << 32) | (((long) java.lang.Float.floatToRawIntBits(this.d)) & 4294967295L)));
            }
        }
        charSequence3 = this.c;
        if (charSequence3 instanceof android.text.Spanned) {
            list = defpackage.aokc.a;
        } else {
            spanned = (android.text.Spanned) charSequence3;
            spans = spanned.getSpans(0, charSequence3.length(), defpackage.dlw.class);
            length = spans.length;
            arrayList = new java.util.ArrayList(length);
            i9 = 0;
            while (i9 < length) {
                defpackage.dlw dlwVar2 = (defpackage.dlw) spans[i9];
                int spanStart2 = spanned.getSpanStart(dlwVar2);
                int spanEnd2 = spanned.getSpanEnd(dlwVar2);
                i10 = this.b.i(spanStart2);
                int i19 = this.h;
                if (this.b.f.getEllipsisCount(i10) > 0) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                int iH2 = this.b.h(i10);
                if (z2) {
                }
                java.lang.Throwable th3 = th;
                arrayList.add(th3);
                i9++;
                th = th3;
            }
            list = arrayList;
        }
        this.g = list;
    }

    private final defpackage.dll l(int i, int i2, android.text.TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, java.lang.CharSequence charSequence) {
        defpackage.djc djcVar = this.a;
        return new defpackage.dll(charSequence, e(), h(), i, truncateAt, djcVar.f, defpackage.dnz.b(djcVar.a), i3, i5, i6, i7, i4, i2, djcVar.e);
    }

    private final void m(float f, defpackage.cqf cqfVar) {
        defpackage.cqf cqfVar2;
        defpackage.cqf cqfVar3;
        if (!i() && f == 0.0f) {
            defpackage.dll dllVar = this.b;
            android.graphics.Canvas canvas = defpackage.cpr.a;
            if (cqfVar == null) {
                defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
                cqfVar = null;
            }
            dllVar.n(((defpackage.cpq) cqfVar).a);
            return;
        }
        cqfVar.g();
        if (i()) {
            cqfVar2 = cqfVar;
            cqfVar2.a(0.0f, 0.0f, e(), this.d, 1);
        } else {
            cqfVar2 = cqfVar;
        }
        if (f != 0.0f) {
            cqfVar2.i(0.0f, f);
        }
        defpackage.dll dllVar2 = this.b;
        android.graphics.Canvas canvas2 = defpackage.cpr.a;
        if (cqfVar2 == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
            cqfVar3 = null;
        } else {
            cqfVar3 = cqfVar2;
        }
        dllVar2.n(((defpackage.cpq) cqfVar3).a);
        cqfVar3.e();
    }

    private static final boolean n(android.text.Spanned spanned, java.lang.Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public final float a() {
        return b(f() - 1);
    }

    public final float b(int i) {
        android.graphics.Paint.FontMetricsInt fontMetricsInt;
        defpackage.dll dllVar = this.b;
        return dllVar.h + ((i != dllVar.g + (-1) || (fontMetricsInt = dllVar.k) == null) ? dllVar.f.getLineBaseline(i) : dllVar.d(i) - fontMetricsInt.ascent) + this.f;
    }

    public final float c(int i) {
        return this.e ? this.d : this.b.b(i);
    }

    public final float d(int i) {
        if (this.e) {
            return 0.0f;
        }
        return this.b.d(i);
    }

    public final float e() {
        return defpackage.dpd.b(this.j);
    }

    public final int f() {
        return this.b.g;
    }

    public final defpackage.cpn g(int i) {
        if (i < 0 || i > this.c.length()) {
            dnv.b("offset(" + i + ") is out of bounds [0," + this.c.length() + ']');
        }
        defpackage.dll dllVar = this.b;
        float fE = dllVar.e(i, false);
        int i2 = dllVar.i(i);
        return new defpackage.cpn(fE, d(i2), fE, c(i2));
    }

    public final defpackage.dob h() {
        return this.a.c;
    }

    public final boolean i() {
        return this.b.d;
    }

    public final void j(defpackage.cqf cqfVar, long j, defpackage.crc crcVar, defpackage.dou douVar, defpackage.den denVar) {
        int i = h().a;
        defpackage.dob dobVarH = h();
        dobVarH.c(j);
        dobVarH.d(crcVar);
        dobVarH.e(douVar);
        dobVarH.f(denVar);
        dobVarH.a(3);
        m(this.f, cqfVar);
        h().a(i);
    }

    public final void k(defpackage.cqf cqfVar, defpackage.cqd cqdVar, float f, defpackage.crc crcVar, defpackage.dou douVar, defpackage.den denVar) {
        int i = h().a;
        defpackage.dob dobVarH = h();
        float fE = e();
        float f2 = this.d;
        dobVarH.b(cqdVar, (((long) java.lang.Float.floatToRawIntBits(fE)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f2)) & 4294967295L), f);
        dobVarH.d(crcVar);
        dobVarH.e(douVar);
        dobVarH.f(denVar);
        dobVarH.a(3);
        m(this.f, cqfVar);
        h().a(i);
    }
}
