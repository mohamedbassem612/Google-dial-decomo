package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hen extends defpackage.hef {
    private defpackage.hbd A;
    private defpackage.hbd B;
    private defpackage.hbd C;
    private defpackage.hbd D;
    private final java.lang.StringBuilder j;
    private final android.graphics.RectF k;
    private final android.graphics.Matrix l;
    private final android.graphics.Paint m;
    private final android.graphics.Paint n;
    private final java.util.Map o;
    private final adb p;
    private final java.util.List q;
    private final defpackage.hbs r;
    private final defpackage.gzs s;
    private final defpackage.gzh t;
    private defpackage.hbd u;
    private defpackage.hbd v;
    private defpackage.hbd w;
    private defpackage.hbd x;
    private defpackage.hbd y;
    private defpackage.hbd z;

    public hen(defpackage.gzs gzsVar, defpackage.hei heiVar) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        super(gzsVar, heiVar);
        this.j = new java.lang.StringBuilder(2);
        this.k = new android.graphics.RectF();
        this.l = new android.graphics.Matrix();
        this.m = new defpackage.hem(this, null);
        this.n = new defpackage.hem(this);
        this.o = new java.util.HashMap();
        this.p = new adb(10);
        this.q = new java.util.ArrayList();
        this.s = gzsVar;
        this.t = heiVar.b;
        defpackage.hbs hbsVarA = heiVar.p.a();
        this.r = hbsVarA;
        hbsVarA.h(this);
        i(hbsVarA);
        defpackage.jkq jkqVar = heiVar.y;
        if (jkqVar != null && (obj4 = jkqVar.d) != null) {
            defpackage.hbd hbdVarA = ((defpackage.hda) obj4).a();
            this.u = hbdVarA;
            hbdVarA.h(this);
            i(this.u);
        }
        if (jkqVar != null && (obj3 = jkqVar.a) != null) {
            defpackage.hbd hbdVarA2 = ((defpackage.hda) obj3).a();
            this.w = hbdVarA2;
            hbdVarA2.h(this);
            i(this.w);
        }
        if (jkqVar != null && (obj2 = jkqVar.c) != null) {
            defpackage.hbd hbdVarA3 = ((defpackage.hdb) obj2).a();
            this.y = hbdVarA3;
            hbdVarA3.h(this);
            i(this.y);
        }
        if (jkqVar == null || (obj = jkqVar.b) == null) {
            return;
        }
        defpackage.hbd hbdVarA4 = ((defpackage.hdb) obj).a();
        this.A = hbdVarA4;
        hbdVarA4.h(this);
        i(this.A);
    }

    private final boolean s(android.graphics.Canvas canvas, defpackage.hcu hcuVar, int i, float f) {
        android.graphics.PointF pointF = hcuVar.k;
        android.graphics.PointF pointF2 = hcuVar.l;
        float fA = defpackage.hgm.a();
        float f2 = (i * hcuVar.e * fA) + (pointF == null ? 0.0f : (hcuVar.e * fA) + pointF.y);
        if (this.s.l && pointF2 != null && pointF != null && f2 >= pointF.y + pointF2.y + hcuVar.c) {
            return false;
        }
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int i2 = hcuVar.m;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            canvas.translate(f3, f2);
        } else if (i3 == 1) {
            canvas.translate((f3 + f4) - f, f2);
        } else if (i3 == 2) {
            canvas.translate((f3 + (f4 / 2.0f)) - (f / 2.0f), f2);
        }
        return true;
    }

    private static final void t(java.lang.String str, android.graphics.Paint paint, android.graphics.Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == android.graphics.Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
        }
    }

    private static final void u(android.graphics.Path path, android.graphics.Paint paint, android.graphics.Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == android.graphics.Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawPath(path, paint);
        }
    }

    private static final java.util.List v(java.lang.String str) {
        return java.util.Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private final defpackage.wm w(int i) {
        java.util.List list = this.q;
        for (int size = list.size(); size < i; size++) {
            list.add(new defpackage.wm());
        }
        return (defpackage.wm) list.get(i - 1);
    }

    private final java.util.List x(java.lang.String str, float f, defpackage.kgo kgoVar, float f2, float f3, boolean z) {
        float f4;
        float fMeasureText;
        int i = 0;
        float f5 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        float f6 = 0.0f;
        int i4 = 0;
        float f7 = 0.0f;
        while (i < str.length()) {
            int i5 = i + 1;
            char cCharAt = str.charAt(i);
            if (z) {
                f4 = 0.0f;
                defpackage.hcv hcvVar = (defpackage.hcv) defpackage.aee.a(this.t.f, (((cCharAt * 31) + ((java.lang.String) kgoVar.b).hashCode()) * 31) + ((java.lang.String) kgoVar.a).hashCode());
                if (hcvVar != null) {
                    float f8 = ((float) hcvVar.b) * f2;
                    java.lang.ThreadLocal threadLocal = defpackage.hgm.a;
                    fMeasureText = f8 * android.content.res.Resources.getSystem().getDisplayMetrics().density;
                }
                i = i5;
            } else {
                f4 = 0.0f;
                fMeasureText = this.m.measureText(str.substring(i, i5));
            }
            float f9 = fMeasureText + f3;
            if (cCharAt == ' ') {
                z2 = true;
                f7 = f9;
            } else {
                if (z2) {
                    f6 = f9;
                    i4 = i;
                } else {
                    f6 += f9;
                }
                z2 = false;
            }
            f5 += f9;
            if (f > f4 && f5 >= f && cCharAt != ' ') {
                i2++;
                defpackage.wm wmVarW = w(i2);
                if (i4 == i3) {
                    java.lang.String strSubstring = str.substring(i3, i);
                    java.lang.String strTrim = strSubstring.trim();
                    wmVarW.a(strTrim, (f5 - f9) - ((strTrim.length() - strSubstring.length()) * f7));
                    f5 = f9;
                    f6 = f5;
                    i3 = i;
                    i4 = i3;
                } else {
                    java.lang.String strSubstring2 = str.substring(i3, i4 - 1);
                    java.lang.String strTrim2 = strSubstring2.trim();
                    wmVarW.a(strTrim2, ((f5 - f6) - ((strSubstring2.length() - strTrim2.length()) * f7)) - f7);
                    f5 = f6;
                    i3 = i4;
                }
            }
            i = i5;
        }
        if (f5 > 0.0f) {
            i2++;
            w(i2).a(str.substring(i3), f5);
        }
        return this.q.subList(0, i2);
    }

    @Override // defpackage.hef, defpackage.hcx
    public final void a(java.lang.Object obj, defpackage.hgp hgpVar) {
        super.a(obj, hgpVar);
        if (obj == defpackage.gzx.a) {
            defpackage.hbd hbdVar = this.v;
            if (hbdVar != null) {
                k(hbdVar);
            }
            if (hgpVar == null) {
                this.v = null;
                return;
            }
            defpackage.hbu hbuVar = new defpackage.hbu(hgpVar, null);
            this.v = hbuVar;
            hbuVar.h(this);
            i(this.v);
            return;
        }
        if (obj == defpackage.gzx.b) {
            defpackage.hbd hbdVar2 = this.x;
            if (hbdVar2 != null) {
                k(hbdVar2);
            }
            if (hgpVar == null) {
                this.x = null;
                return;
            }
            defpackage.hbu hbuVar2 = new defpackage.hbu(hgpVar, null);
            this.x = hbuVar2;
            hbuVar2.h(this);
            i(this.x);
            return;
        }
        if (obj == defpackage.gzx.s) {
            defpackage.hbd hbdVar3 = this.z;
            if (hbdVar3 != null) {
                k(hbdVar3);
            }
            if (hgpVar == null) {
                this.z = null;
                return;
            }
            defpackage.hbu hbuVar3 = new defpackage.hbu(hgpVar, null);
            this.z = hbuVar3;
            hbuVar3.h(this);
            i(this.z);
            return;
        }
        if (obj == defpackage.gzx.t) {
            defpackage.hbd hbdVar4 = this.B;
            if (hbdVar4 != null) {
                k(hbdVar4);
            }
            if (hgpVar == null) {
                this.B = null;
                return;
            }
            defpackage.hbu hbuVar4 = new defpackage.hbu(hgpVar, null);
            this.B = hbuVar4;
            hbuVar4.h(this);
            i(this.B);
            return;
        }
        if (obj == defpackage.gzx.F) {
            defpackage.hbd hbdVar5 = this.C;
            if (hbdVar5 != null) {
                k(hbdVar5);
            }
            if (hgpVar == null) {
                this.C = null;
                return;
            }
            defpackage.hbu hbuVar5 = new defpackage.hbu(hgpVar, null);
            this.C = hbuVar5;
            hbuVar5.h(this);
            i(this.C);
            return;
        }
        if (obj != defpackage.gzx.M) {
            if (obj == defpackage.gzx.O) {
                defpackage.hbs hbsVar = this.r;
                hbsVar.d = new defpackage.hbr(hbsVar, new defpackage.hgo(), hgpVar, new defpackage.hcu());
                return;
            }
            return;
        }
        defpackage.hbd hbdVar6 = this.D;
        if (hbdVar6 != null) {
            k(hbdVar6);
        }
        if (hgpVar == null) {
            this.D = null;
            return;
        }
        defpackage.hbu hbuVar6 = new defpackage.hbu(hgpVar, null);
        this.D = hbuVar6;
        hbuVar6.h(this);
        i(this.D);
    }

    @Override // defpackage.hef, defpackage.hai
    public final void c(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        defpackage.gzh gzhVar = this.t;
        rectF.set(0.0f, 0.0f, gzhVar.i.width(), gzhVar.i.height());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0301  */
    /* JADX WARN: Code duplicated, block: B:102:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0305  */
    /* JADX WARN: Code duplicated, block: B:104:0x0307  */
    /* JADX WARN: Code duplicated, block: B:126:0x0398  */
    /* JADX WARN: Code duplicated, block: B:128:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:129:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:133:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:135:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:138:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:141:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:157:0x043a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0441  */
    /* JADX WARN: Code duplicated, block: B:160:0x044a A[LOOP:9: B:159:0x0448->B:160:0x044a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:164:0x046b  */
    /* JADX WARN: Code duplicated, block: B:165:0x0472  */
    /* JADX WARN: Code duplicated, block: B:167:0x0490  */
    /* JADX WARN: Code duplicated, block: B:188:0x042d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x012e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0138  */
    /* JADX WARN: Code duplicated, block: B:47:0x013a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0155  */
    /* JADX WARN: Code duplicated, block: B:53:0x016a  */
    /* JADX WARN: Code duplicated, block: B:56:0x017b  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:64:0x01da A[LOOP:4: B:63:0x01d8->B:64:0x01da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0200  */
    /* JADX WARN: Code duplicated, block: B:71:0x0233  */
    /* JADX WARN: Code duplicated, block: B:72:0x023a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0266  */
    @Override // defpackage.hef
    public final void j(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) {
        java.lang.Object obj;
        int i2;
        float fFloatValue;
        float f;
        java.util.List listV;
        int size;
        int i3;
        int i4;
        android.graphics.PointF pointF;
        float f2;
        java.util.List listX;
        int i5;
        defpackage.wm wmVar;
        int i6;
        java.util.List list;
        java.lang.Object obj2;
        int length;
        java.lang.String str;
        int iCodePointAt;
        int iCharCount;
        java.lang.Object obj3;
        adb adbVar;
        long j;
        java.lang.StringBuilder sb;
        int iCharCount2;
        java.lang.String string;
        int iCodePointAt2;
        float fFloatValue2;
        int i7;
        int i8;
        android.graphics.PointF pointF2;
        float f3;
        float f4;
        float f5;
        int i9;
        java.util.List listX2;
        int i10;
        defpackage.wm wmVar2;
        int i11;
        int i12;
        java.lang.Object obj4;
        int i13;
        java.lang.String str2;
        defpackage.hcv hcvVar;
        java.util.Map map;
        java.util.List list2;
        int size2;
        java.util.ArrayList arrayList;
        int i14;
        java.util.List list3;
        int i15;
        android.graphics.Path pathI;
        defpackage.hen henVar = this;
        defpackage.hcu hcuVar = (defpackage.hcu) henVar.r.e();
        defpackage.gzh gzhVar = henVar.t;
        defpackage.kgo kgoVar = (defpackage.kgo) gzhVar.d.get(hcuVar.b);
        if (kgoVar != null) {
            canvas.save();
            canvas.concat(matrix);
            defpackage.hbd hbdVar = henVar.v;
            if (hbdVar != null) {
                henVar.m.setColor(((java.lang.Integer) hbdVar.e()).intValue());
            } else {
                defpackage.hbd hbdVar2 = henVar.u;
                android.graphics.Paint paint = henVar.m;
                if (hbdVar2 != null) {
                    paint.setColor(((java.lang.Integer) hbdVar2.e()).intValue());
                } else {
                    paint.setColor(hcuVar.g);
                }
            }
            defpackage.hbd hbdVar3 = henVar.x;
            if (hbdVar3 != null) {
                henVar.n.setColor(((java.lang.Integer) hbdVar3.e()).intValue());
            } else {
                defpackage.hbd hbdVar4 = henVar.w;
                android.graphics.Paint paint2 = henVar.n;
                if (hbdVar4 != null) {
                    paint2.setColor(((java.lang.Integer) hbdVar4.e()).intValue());
                } else {
                    paint2.setColor(hcuVar.h);
                }
            }
            defpackage.hbd hbdVar5 = henVar.g.e;
            int iIntValue = hbdVar5 == null ? 100 : ((java.lang.Integer) hbdVar5.e()).intValue();
            android.graphics.Paint paint3 = henVar.m;
            int i16 = (((iIntValue * 255) / 100) * i) / 255;
            paint3.setAlpha(i16);
            android.graphics.Paint paint4 = henVar.n;
            paint4.setAlpha(i16);
            defpackage.hbd hbdVar6 = henVar.z;
            if (hbdVar6 != null) {
                paint4.setStrokeWidth(((java.lang.Float) hbdVar6.e()).floatValue());
            } else {
                defpackage.hbd hbdVar7 = henVar.y;
                if (hbdVar7 != null) {
                    paint4.setStrokeWidth(((java.lang.Float) hbdVar7.e()).floatValue());
                } else {
                    float f6 = hcuVar.i;
                    java.lang.ThreadLocal threadLocal = defpackage.hgm.a;
                    paint4.setStrokeWidth(f6 * android.content.res.Resources.getSystem().getDisplayMetrics().density);
                }
            }
            defpackage.gzs gzsVar = henVar.s;
            float f7 = 10.0f;
            if (gzsVar.b.f.c() > 0) {
                defpackage.hbd hbdVar8 = henVar.C;
                float fFloatValue3 = (hbdVar8 != null ? ((java.lang.Float) hbdVar8.e()).floatValue() : hcuVar.c) / 100.0f;
                defpackage.hgm.c(matrix);
                java.util.List listV2 = v(hcuVar.a);
                int size3 = listV2.size();
                float f8 = hcuVar.d / 10.0f;
                defpackage.hbd hbdVar9 = henVar.B;
                if (hbdVar9 != null) {
                    fFloatValue2 = ((java.lang.Float) hbdVar9.e()).floatValue();
                } else {
                    defpackage.hbd hbdVar10 = henVar.A;
                    if (hbdVar10 != null) {
                        fFloatValue2 = ((java.lang.Float) hbdVar10.e()).floatValue();
                    }
                    i7 = 0;
                    i8 = -1;
                    while (i7 < size3) {
                        java.lang.String str3 = (java.lang.String) listV2.get(i7);
                        pointF2 = hcuVar.l;
                        if (pointF2 == null) {
                            f3 = 0.0f;
                        } else {
                            f3 = pointF2.x;
                        }
                        int i17 = size3;
                        f4 = f8;
                        f5 = fFloatValue3;
                        float f9 = f3;
                        i9 = i7;
                        listX2 = henVar.x(str3, f9, kgoVar, f5, f4, true);
                        i10 = 0;
                        while (i10 < listX2.size()) {
                            wmVar2 = (defpackage.wm) listX2.get(i10);
                            i11 = i8 + 1;
                            canvas.save();
                            java.util.List list4 = listX2;
                            if (henVar.s(canvas, hcuVar, i11, wmVar2.a)) {
                                obj4 = wmVar2.b;
                                i13 = 0;
                                while (true) {
                                    str2 = (java.lang.String) obj4;
                                    i12 = i10;
                                    if (i13 < str2.length()) {
                                        hcvVar = (defpackage.hcv) defpackage.aee.a(gzhVar.f, (((str2.charAt(i13) * 31) + ((java.lang.String) kgoVar.b).hashCode()) * 31) + ((java.lang.String) kgoVar.a).hashCode());
                                        if (hcvVar == null) {
                                            f4 = f4;
                                            i13 = i13;
                                            i9 = i9;
                                            i11 = i11;
                                        } else {
                                            map = henVar.o;
                                            if (map.containsKey(hcvVar)) {
                                                list3 = (java.util.List) map.get(hcvVar);
                                            } else {
                                                list2 = hcvVar.a;
                                                size2 = list2.size();
                                                arrayList = new java.util.ArrayList(size2);
                                                i14 = 0;
                                                while (i14 < size2) {
                                                    arrayList.add(new defpackage.hah(gzsVar, henVar, (defpackage.hea) list2.get(i14), gzhVar));
                                                    i14++;
                                                    size2 = size2;
                                                    list2 = list2;
                                                }
                                                map.put(hcvVar, arrayList);
                                                list3 = arrayList;
                                            }
                                            i15 = 0;
                                            while (i15 < list3.size()) {
                                                pathI = ((defpackage.hah) list3.get(i15)).i();
                                                pathI.computeBounds(henVar.k, false);
                                                android.graphics.Matrix matrix2 = henVar.l;
                                                matrix2.reset();
                                                java.util.List list5 = list3;
                                                matrix2.preTranslate(0.0f, (-hcuVar.f) * android.content.res.Resources.getSystem().getDisplayMetrics().density);
                                                matrix2.preScale(f5, f5);
                                                pathI.transform(matrix2);
                                                if (hcuVar.j) {
                                                    u(pathI, paint3, canvas);
                                                    u(pathI, paint4, canvas);
                                                } else {
                                                    u(pathI, paint4, canvas);
                                                    u(pathI, paint3, canvas);
                                                }
                                                i15++;
                                                list3 = list5;
                                            }
                                            canvas.translate((((float) hcvVar.b) * f5 * android.content.res.Resources.getSystem().getDisplayMetrics().density) + f4, 0.0f);
                                        }
                                        i13++;
                                        i10 = i12;
                                        f4 = f4;
                                        i9 = i9;
                                        i11 = i11;
                                    }
                                }
                            } else {
                                i12 = i10;
                            }
                            canvas.restore();
                            i10 = i12 + 1;
                            listX2 = list4;
                            f4 = f4;
                            i9 = i9;
                            i8 = i11;
                        }
                        float f10 = f4;
                        i7 = i9 + 1;
                        fFloatValue3 = f5;
                        size3 = i17;
                        f8 = f10;
                    }
                }
                f8 += fFloatValue2;
                i7 = 0;
                i8 = -1;
                while (i7 < size3) {
                    java.lang.String str4 = (java.lang.String) listV2.get(i7);
                    pointF2 = hcuVar.l;
                    if (pointF2 == null) {
                        f3 = 0.0f;
                    } else {
                        f3 = pointF2.x;
                    }
                    int i18 = size3;
                    f4 = f8;
                    f5 = fFloatValue3;
                    float f11 = f3;
                    i9 = i7;
                    listX2 = henVar.x(str4, f11, kgoVar, f5, f4, true);
                    i10 = 0;
                    while (i10 < listX2.size()) {
                        wmVar2 = (defpackage.wm) listX2.get(i10);
                        i11 = i8 + 1;
                        canvas.save();
                        java.util.List list6 = listX2;
                        if (henVar.s(canvas, hcuVar, i11, wmVar2.a)) {
                            obj4 = wmVar2.b;
                            i13 = 0;
                            while (true) {
                                str2 = (java.lang.String) obj4;
                                i12 = i10;
                                if (i13 < str2.length()) {
                                    hcvVar = (defpackage.hcv) defpackage.aee.a(gzhVar.f, (((str2.charAt(i13) * 31) + ((java.lang.String) kgoVar.b).hashCode()) * 31) + ((java.lang.String) kgoVar.a).hashCode());
                                    if (hcvVar == null) {
                                        f4 = f4;
                                        i13 = i13;
                                        i9 = i9;
                                        i11 = i11;
                                    } else {
                                        map = henVar.o;
                                        if (map.containsKey(hcvVar)) {
                                            list3 = (java.util.List) map.get(hcvVar);
                                        } else {
                                            list2 = hcvVar.a;
                                            size2 = list2.size();
                                            arrayList = new java.util.ArrayList(size2);
                                            i14 = 0;
                                            while (i14 < size2) {
                                                arrayList.add(new defpackage.hah(gzsVar, henVar, (defpackage.hea) list2.get(i14), gzhVar));
                                                i14++;
                                                size2 = size2;
                                                list2 = list2;
                                            }
                                            map.put(hcvVar, arrayList);
                                            list3 = arrayList;
                                        }
                                        i15 = 0;
                                        while (i15 < list3.size()) {
                                            pathI = ((defpackage.hah) list3.get(i15)).i();
                                            pathI.computeBounds(henVar.k, false);
                                            android.graphics.Matrix matrix3 = henVar.l;
                                            matrix3.reset();
                                            java.util.List list7 = list3;
                                            matrix3.preTranslate(0.0f, (-hcuVar.f) * android.content.res.Resources.getSystem().getDisplayMetrics().density);
                                            matrix3.preScale(f5, f5);
                                            pathI.transform(matrix3);
                                            if (hcuVar.j) {
                                                u(pathI, paint3, canvas);
                                                u(pathI, paint4, canvas);
                                            } else {
                                                u(pathI, paint4, canvas);
                                                u(pathI, paint3, canvas);
                                            }
                                            i15++;
                                            list3 = list7;
                                        }
                                        canvas.translate((((float) hcvVar.b) * f5 * android.content.res.Resources.getSystem().getDisplayMetrics().density) + f4, 0.0f);
                                    }
                                    i13++;
                                    i10 = i12;
                                    f4 = f4;
                                    i9 = i9;
                                    i11 = i11;
                                }
                            }
                        } else {
                            i12 = i10;
                        }
                        canvas.restore();
                        i10 = i12 + 1;
                        listX2 = list6;
                        f4 = f4;
                        i9 = i9;
                        i8 = i11;
                    }
                    float f12 = f4;
                    i7 = i9 + 1;
                    fFloatValue3 = f5;
                    size3 = i18;
                    f8 = f12;
                }
            } else {
                defpackage.hbd hbdVar11 = henVar.D;
                if (hbdVar11 == null || (obj = (android.graphics.Typeface) hbdVar11.e()) == null) {
                    defpackage.hcr hcrVarF = gzsVar.f();
                    if (hcrVarF != null) {
                        java.lang.Object obj5 = kgoVar.b;
                        java.lang.Object obj6 = kgoVar.a;
                        defpackage.hcz hczVar = hcrVarF.a;
                        hczVar.a = obj5;
                        hczVar.b = obj6;
                        java.util.Map map2 = hcrVarF.b;
                        android.graphics.Typeface typeface = (android.graphics.Typeface) map2.get(hczVar);
                        if (typeface != null) {
                            f7 = 10.0f;
                            obj = typeface;
                        } else {
                            java.util.Map map3 = hcrVarF.c;
                            java.lang.Object objCreate = (android.graphics.Typeface) map3.get(obj5);
                            if (objCreate == null && (objCreate = kgoVar.c) == null) {
                                objCreate = android.graphics.Typeface.createFromAsset(hcrVarF.d, "fonts/" + ((java.lang.String) obj5) + hcrVarF.e);
                                map3.put(obj5, objCreate);
                            }
                            java.lang.String str5 = (java.lang.String) obj6;
                            boolean zContains = str5.contains("Italic");
                            boolean zContains2 = str5.contains("Bold");
                            if (zContains) {
                                if (zContains2) {
                                    i2 = 3;
                                } else {
                                    zContains2 = false;
                                    if (zContains) {
                                        i2 = 2;
                                    } else if (zContains2) {
                                        i2 = 1;
                                    } else {
                                        i2 = 0;
                                    }
                                }
                            } else if (zContains) {
                                i2 = 2;
                            } else if (zContains2) {
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            android.graphics.Typeface typeface2 = (android.graphics.Typeface) objCreate;
                            if (typeface2.getStyle() != i2) {
                                objCreate = android.graphics.Typeface.create(typeface2, i2);
                            }
                            map2.put(hczVar, objCreate);
                            obj = objCreate;
                        }
                    } else {
                        f7 = 10.0f;
                        obj = null;
                    }
                    if (obj == null) {
                        obj = kgoVar.c;
                    }
                } else {
                    f7 = 10.0f;
                }
                if (obj != null) {
                    java.lang.String str6 = hcuVar.a;
                    paint3.setTypeface((android.graphics.Typeface) obj);
                    defpackage.hbd hbdVar12 = henVar.C;
                    float fFloatValue4 = hbdVar12 != null ? ((java.lang.Float) hbdVar12.e()).floatValue() : hcuVar.c;
                    java.lang.ThreadLocal threadLocal2 = defpackage.hgm.a;
                    paint3.setTextSize(android.content.res.Resources.getSystem().getDisplayMetrics().density * fFloatValue4);
                    paint4.setTypeface(paint3.getTypeface());
                    paint4.setTextSize(paint3.getTextSize());
                    float f13 = hcuVar.d / f7;
                    defpackage.hbd hbdVar13 = henVar.B;
                    if (hbdVar13 != null) {
                        fFloatValue = ((java.lang.Float) hbdVar13.e()).floatValue();
                    } else {
                        defpackage.hbd hbdVar14 = henVar.A;
                        if (hbdVar14 != null) {
                            fFloatValue = ((java.lang.Float) hbdVar14.e()).floatValue();
                        }
                        f = ((f13 * android.content.res.Resources.getSystem().getDisplayMetrics().density) * fFloatValue4) / 100.0f;
                        listV = v(str6);
                        size = listV.size();
                        i3 = 0;
                        i4 = -1;
                        while (i3 < size) {
                            java.lang.String str7 = (java.lang.String) listV.get(i3);
                            pointF = hcuVar.l;
                            if (pointF == null) {
                                f2 = 0.0f;
                            } else {
                                f2 = pointF.x;
                            }
                            listX = henVar.x(str7, f2, kgoVar, 0.0f, f, false);
                            i5 = 0;
                            while (i5 < listX.size()) {
                                wmVar = (defpackage.wm) listX.get(i5);
                                i6 = i4 + 1;
                                canvas.save();
                                if (henVar.s(canvas, hcuVar, i6, wmVar.a)) {
                                    obj2 = wmVar.b;
                                    length = 0;
                                    while (true) {
                                        str = (java.lang.String) obj2;
                                        list = listX;
                                        if (length < str.length()) {
                                            iCodePointAt = str.codePointAt(length);
                                            int i19 = i5;
                                            defpackage.kgo kgoVar2 = kgoVar;
                                            iCharCount = length + java.lang.Character.charCount(iCodePointAt);
                                            while (true) {
                                                if (iCharCount < str.length()) {
                                                    obj3 = obj2;
                                                    break;
                                                }
                                                iCodePointAt2 = str.codePointAt(iCharCount);
                                                obj3 = obj2;
                                                if (java.lang.Character.getType(iCodePointAt2) == 16 && java.lang.Character.getType(iCodePointAt2) != 27 && java.lang.Character.getType(iCodePointAt2) != 6 && java.lang.Character.getType(iCodePointAt2) != 28 && java.lang.Character.getType(iCodePointAt2) != 8 && java.lang.Character.getType(iCodePointAt2) != 19) {
                                                    break;
                                                }
                                                iCharCount += java.lang.Character.charCount(iCodePointAt2);
                                                iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                                obj2 = obj3;
                                            }
                                            adbVar = henVar.p;
                                            float f14 = f;
                                            j = iCodePointAt;
                                            if (adbVar.i(j)) {
                                                string = (java.lang.String) adbVar.d(j);
                                            } else {
                                                sb = henVar.j;
                                                sb.setLength(0);
                                                iCharCount2 = length;
                                                while (iCharCount2 < iCharCount) {
                                                    int i20 = iCharCount;
                                                    int iCodePointAt3 = str.codePointAt(iCharCount2);
                                                    sb.appendCodePoint(iCodePointAt3);
                                                    iCharCount2 += java.lang.Character.charCount(iCodePointAt3);
                                                    iCharCount = i20;
                                                }
                                                string = sb.toString();
                                                adbVar.g(j, string);
                                            }
                                            length += string.length();
                                            if (hcuVar.j) {
                                                t(string, paint3, canvas);
                                                t(string, paint4, canvas);
                                            } else {
                                                t(string, paint4, canvas);
                                                t(string, paint3, canvas);
                                            }
                                            canvas.translate(paint3.measureText(string) + f14, 0.0f);
                                            henVar = this;
                                            listX = list;
                                            i5 = i19;
                                            kgoVar = kgoVar2;
                                            obj2 = obj3;
                                            f = f14;
                                        }
                                    }
                                } else {
                                    list = listX;
                                }
                                canvas.restore();
                                listX = list;
                                i5++;
                                i4 = i6;
                                kgoVar = kgoVar;
                                f = f;
                                henVar = this;
                            }
                            i3++;
                            henVar = this;
                        }
                    }
                    f13 += fFloatValue;
                    f = ((f13 * android.content.res.Resources.getSystem().getDisplayMetrics().density) * fFloatValue4) / 100.0f;
                    listV = v(str6);
                    size = listV.size();
                    i3 = 0;
                    i4 = -1;
                    while (i3 < size) {
                        java.lang.String str8 = (java.lang.String) listV.get(i3);
                        pointF = hcuVar.l;
                        if (pointF == null) {
                            f2 = 0.0f;
                        } else {
                            f2 = pointF.x;
                        }
                        listX = henVar.x(str8, f2, kgoVar, 0.0f, f, false);
                        i5 = 0;
                        while (i5 < listX.size()) {
                            wmVar = (defpackage.wm) listX.get(i5);
                            i6 = i4 + 1;
                            canvas.save();
                            if (henVar.s(canvas, hcuVar, i6, wmVar.a)) {
                                obj2 = wmVar.b;
                                length = 0;
                                while (true) {
                                    str = (java.lang.String) obj2;
                                    list = listX;
                                    if (length < str.length()) {
                                        iCodePointAt = str.codePointAt(length);
                                        int i110 = i5;
                                        defpackage.kgo kgoVar3 = kgoVar;
                                        iCharCount = length + java.lang.Character.charCount(iCodePointAt);
                                        while (true) {
                                            if (iCharCount < str.length()) {
                                                obj3 = obj2;
                                                break;
                                            }
                                            iCodePointAt2 = str.codePointAt(iCharCount);
                                            obj3 = obj2;
                                            if (java.lang.Character.getType(iCodePointAt2) == 16) {
                                            }
                                            iCharCount += java.lang.Character.charCount(iCodePointAt2);
                                            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                            obj2 = obj3;
                                        }
                                        adbVar = henVar.p;
                                        float f15 = f;
                                        j = iCodePointAt;
                                        if (adbVar.i(j)) {
                                            string = (java.lang.String) adbVar.d(j);
                                        } else {
                                            sb = henVar.j;
                                            sb.setLength(0);
                                            iCharCount2 = length;
                                            while (iCharCount2 < iCharCount) {
                                                int i21 = iCharCount;
                                                int iCodePointAt4 = str.codePointAt(iCharCount2);
                                                sb.appendCodePoint(iCodePointAt4);
                                                iCharCount2 += java.lang.Character.charCount(iCodePointAt4);
                                                iCharCount = i21;
                                            }
                                            string = sb.toString();
                                            adbVar.g(j, string);
                                        }
                                        length += string.length();
                                        if (hcuVar.j) {
                                            t(string, paint3, canvas);
                                            t(string, paint4, canvas);
                                        } else {
                                            t(string, paint4, canvas);
                                            t(string, paint3, canvas);
                                        }
                                        canvas.translate(paint3.measureText(string) + f15, 0.0f);
                                        henVar = this;
                                        listX = list;
                                        i5 = i110;
                                        kgoVar = kgoVar3;
                                        obj2 = obj3;
                                        f = f15;
                                    }
                                }
                            } else {
                                list = listX;
                            }
                            canvas.restore();
                            listX = list;
                            i5++;
                            i4 = i6;
                            kgoVar = kgoVar;
                            f = f;
                            henVar = this;
                        }
                        i3++;
                        henVar = this;
                    }
                }
            }
            canvas.restore();
        }
    }
}
