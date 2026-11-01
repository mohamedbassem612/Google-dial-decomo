package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fsy implements defpackage.frt {
    private final org.xmlpull.v1.XmlPullParserFactory h;
    private static final java.util.regex.Pattern c = java.util.regex.Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final java.util.regex.Pattern d = java.util.regex.Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final java.util.regex.Pattern e = java.util.regex.Pattern.compile("^(([0-9]*\\.)?[0-9]+)(px|em|%)$");
    static final java.util.regex.Pattern a = java.util.regex.Pattern.compile("^([-+]?\\d+(?:\\.\\d*)?)%$");
    static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("^([-+]?\\d+(?:\\.\\d*)?)% ([-+]?\\d+(?:\\.\\d*)?)%$");
    private static final java.util.regex.Pattern f = java.util.regex.Pattern.compile("^([-+]?\\d+(?:\\.\\d*)?)px ([-+]?\\d+(?:\\.\\d*)?)px$");
    private static final java.util.regex.Pattern g = java.util.regex.Pattern.compile("^(\\d+) (\\d+)$");
    private static final alii i = new alii(30.0f, 1, 1);

    public fsy() {
        try {
            org.xmlpull.v1.XmlPullParserFactory xmlPullParserFactoryNewInstance = org.xmlpull.v1.XmlPullParserFactory.newInstance();
            this.h = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (org.xmlpull.v1.XmlPullParserException e2) {
            throw new java.lang.RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r1.equals("left") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r1.equals("end") != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return android.text.Layout.Alignment.ALIGN_NORMAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return android.text.Layout.Alignment.ALIGN_OPPOSITE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.equals("start") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r1.equals("right") != false) goto L16;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.text.Layout.Alignment d(java.lang.String r1) {
        /*
            java.lang.String r1 = ahvr.p(r1)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1364013995: goto L34;
                case 100571: goto L29;
                case 3317767: goto L1e;
                case 108511772: goto L15;
                case 109757538: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L3f
        Lc:
            java.lang.String r0 = "start"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L3f
            goto L26
        L15:
            java.lang.String r0 = "right"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L3f
            goto L31
        L1e:
            java.lang.String r0 = "left"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L3f
        L26:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L40
        L29:
            java.lang.String r0 = "end"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L3f
        L31:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L40
        L34:
            java.lang.String r0 = "center"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L3f
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L40
        L3f:
            r1 = 0
        L40:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsy.d(java.lang.String):android.text.Layout$Alignment");
    }

    private static defpackage.fta e(defpackage.fta ftaVar) {
        return ftaVar == null ? new defpackage.fta() : ftaVar;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x0325  */
    /* JADX WARN: Code duplicated, block: B:167:0x0354  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fb  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static defpackage.fta f(org.xmlpull.v1.XmlPullParser xmlPullParser, defpackage.fta ftaVar) {
        int i2;
        java.util.regex.Matcher matcher;
        int i3;
        defpackage.fsv fsvVar;
        int attributeCount = xmlPullParser.getAttributeCount();
        defpackage.fta ftaVarE = ftaVar;
        for (int i4 = 0; i4 < attributeCount; i4++) {
            java.lang.String attributeValue = xmlPullParser.getAttributeValue(i4);
            java.lang.String attributeName = xmlPullParser.getAttributeName(i4);
            int i5 = -1;
            int i6 = 1;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        ftaVarE = e(ftaVarE);
                        ftaVarE.i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    }
                    break;
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        ftaVarE = e(ftaVarE);
                        ftaVarE.u = attributeValue;
                    }
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        ftaVarE = e(ftaVarE);
                        ftaVarE.a = attributeValue;
                    }
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        ftaVarE = e(ftaVarE);
                        ftaVarE.o = d(attributeValue);
                    }
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        ftaVarE = e(ftaVarE);
                        ftaVarE.t = attributeValue;
                    }
                    break;
                case -879295043:
                    if (!attributeName.equals("textDecoration")) {
                        break;
                    } else {
                        java.lang.String strP = ahvr.p(attributeValue);
                        switch (strP.hashCode()) {
                            case -1461280213:
                                if (strP.equals("nounderline")) {
                                    ftaVarE = e(ftaVarE);
                                    ftaVarE.g = 0;
                                }
                                break;
                            case -1026963764:
                                if (strP.equals("underline")) {
                                    ftaVarE = e(ftaVarE);
                                    ftaVarE.g = 1;
                                }
                                break;
                            case 913457136:
                                if (strP.equals("nolinethrough")) {
                                    ftaVarE = e(ftaVarE);
                                    ftaVarE.f = 0;
                                }
                                break;
                            case 1679736913:
                                if (strP.equals("linethrough")) {
                                    ftaVarE = e(ftaVarE);
                                    ftaVarE.f = 1;
                                }
                                break;
                        }
                    }
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        ftaVarE = e(ftaVarE);
                        ftaVarE.h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    }
                    break;
                case 3355:
                    if (attributeName.equals("id") && "style".equals(xmlPullParser.getName())) {
                        ftaVarE = e(ftaVarE);
                        ftaVarE.l = attributeValue;
                    }
                    break;
                case 3511770:
                    if (!attributeName.equals("ruby")) {
                        break;
                    } else {
                        java.lang.String strP2 = ahvr.p(attributeValue);
                        switch (strP2.hashCode()) {
                            case -618561360:
                                if (strP2.equals("baseContainer")) {
                                    ftaVarE = e(ftaVarE);
                                    i2 = 2;
                                    ftaVarE.m = i2;
                                }
                                break;
                            case -410956671:
                                if (strP2.equals("container")) {
                                    ftaVarE = e(ftaVarE);
                                    ftaVarE.m = 1;
                                }
                                break;
                            case -250518009:
                                if (strP2.equals("delimiter")) {
                                    ftaVarE = e(ftaVarE);
                                    ftaVarE.m = 4;
                                }
                                break;
                            case -136074796:
                                if (strP2.equals("textContainer")) {
                                    ftaVarE = e(ftaVarE);
                                    i2 = 3;
                                    ftaVarE.m = i2;
                                }
                                break;
                            case 3016401:
                                if (strP2.equals("base")) {
                                    ftaVarE = e(ftaVarE);
                                    i2 = 2;
                                    ftaVarE.m = i2;
                                }
                                break;
                            case 3556653:
                                if (strP2.equals("text")) {
                                    ftaVarE = e(ftaVarE);
                                    i2 = 3;
                                    ftaVarE.m = i2;
                                }
                                break;
                        }
                    }
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        ftaVarE = e(ftaVarE);
                        try {
                            ftaVarE.d(defpackage.etf.a(attributeValue, false));
                        } catch (java.lang.IllegalArgumentException unused) {
                            defpackage.etr.f("TtmlParser", "Failed parsing color value: ".concat(java.lang.String.valueOf(attributeValue)));
                        }
                    }
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        defpackage.fta ftaVarE2 = e(ftaVarE);
                        java.util.regex.Matcher matcher2 = a.matcher(attributeValue);
                        float fMin = Float.MAX_VALUE;
                        if (matcher2.matches()) {
                            try {
                                java.lang.String strGroup = matcher2.group(1);
                                ahvr.ci(strGroup);
                                fMin = java.lang.Math.min(100.0f, java.lang.Math.max(-100.0f, java.lang.Float.parseFloat(strGroup)));
                            } catch (java.lang.NumberFormatException e2) {
                                defpackage.etr.g("TtmlParser", "Failed to parse shear: ".concat(java.lang.String.valueOf(attributeValue)), e2);
                            }
                        } else {
                            defpackage.etr.f("TtmlParser", "Invalid value for shear: ".concat(java.lang.String.valueOf(attributeValue)));
                        }
                        ftaVarE2.s = fMin;
                        ftaVarE = ftaVarE2;
                        break;
                    }
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        java.lang.String strP3 = ahvr.p(attributeValue);
                        int iHashCode = strP3.hashCode();
                        if (iHashCode != 96673) {
                            if (iHashCode == 3387192 && strP3.equals("none")) {
                                ftaVarE = e(ftaVarE);
                                ftaVarE.q = 0;
                            }
                        } else if (strP3.equals("all")) {
                            ftaVarE = e(ftaVarE);
                            ftaVarE.q = 1;
                        }
                    }
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        try {
                            ftaVarE = e(ftaVarE);
                            java.lang.String str = eum.a;
                            java.lang.String[] strArrSplit = attributeValue.split("\\s+", -1);
                            int length = strArrSplit.length;
                            if (length == 1) {
                                matcher = e.matcher(attributeValue);
                            } else {
                                if (length != 2) {
                                    throw new defpackage.frl(a.bw((byte) 46, length, "Invalid number of entries for fontSize: "));
                                }
                                matcher = e.matcher(strArrSplit[1]);
                                defpackage.etr.f("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                            }
                            if (!matcher.matches()) {
                                throw new defpackage.frl(a.bk(attributeValue, "Invalid expression for fontSize: '", "'."));
                            }
                            java.lang.String strGroup2 = matcher.group(3);
                            ahvr.ci(strGroup2);
                            int iHashCode2 = strGroup2.hashCode();
                            if (iHashCode2 == 37) {
                                if (!strGroup2.equals("%")) {
                                    throw new defpackage.frl(a.bk(strGroup2, "Invalid unit for fontSize: '", "'."));
                                }
                                ftaVarE.j = 3;
                                java.lang.String strGroup3 = matcher.group(1);
                                ahvr.ci(strGroup3);
                                ftaVarE.k = java.lang.Float.parseFloat(strGroup3);
                            } else if (iHashCode2 == 3240) {
                                if (!strGroup2.equals("em")) {
                                    throw new defpackage.frl(a.bk(strGroup2, "Invalid unit for fontSize: '", "'."));
                                }
                                ftaVarE.j = 2;
                                java.lang.String strGroup4 = matcher.group(1);
                                ahvr.ci(strGroup4);
                                ftaVarE.k = java.lang.Float.parseFloat(strGroup4);
                            } else {
                                if (iHashCode2 != 3592 || !strGroup2.equals("px")) {
                                    throw new defpackage.frl(a.bk(strGroup2, "Invalid unit for fontSize: '", "'."));
                                }
                                ftaVarE.j = 1;
                                java.lang.String strGroup5 = matcher.group(1);
                                ahvr.ci(strGroup5);
                                ftaVarE.k = java.lang.Float.parseFloat(strGroup5);
                            }
                        } catch (defpackage.frl unused2) {
                            defpackage.etr.f("TtmlParser", "Failed parsing fontSize value: ".concat(java.lang.String.valueOf(attributeValue)));
                        }
                    } else {
                        continue;
                    }
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        ftaVarE = e(ftaVarE);
                        java.util.regex.Pattern pattern = defpackage.fsv.a;
                        defpackage.fsv fsvVar2 = null;
                        if (attributeValue != null) {
                            java.lang.String strP4 = ahvr.p(attributeValue.trim());
                            if (!strP4.isEmpty()) {
                                aihd aihdVarP = aihd.p(android.text.TextUtils.split(strP4, defpackage.fsv.a));
                                java.lang.String str2 = (java.lang.String) ahvr.bj(ahvr.an(defpackage.fsv.e, aihdVarP), "outside");
                                int iHashCode3 = str2.hashCode();
                                if (iHashCode3 != -1106037339) {
                                    if (iHashCode3 == 92734940 && str2.equals("after")) {
                                        i3 = 2;
                                    } else {
                                        i3 = 1;
                                    }
                                } else if (str2.equals("outside")) {
                                    i3 = -2;
                                } else {
                                    i3 = 1;
                                }
                                aild aildVarAn = ahvr.an(defpackage.fsv.b, aihdVarP);
                                if (aildVarAn.isEmpty()) {
                                    aild aildVarAn2 = ahvr.an(defpackage.fsv.d, aihdVarP);
                                    aild aildVarAn3 = ahvr.an(defpackage.fsv.c, aihdVarP);
                                    if (aildVarAn2.isEmpty() && aildVarAn3.isEmpty()) {
                                        fsvVar = new defpackage.fsv(-1, 0, i3);
                                    } else {
                                        java.lang.String str3 = (java.lang.String) ahvr.bj(aildVarAn2, "filled");
                                        int i7 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                                        java.lang.String str4 = (java.lang.String) ahvr.bj(aildVarAn3, "circle");
                                        int iHashCode4 = str4.hashCode();
                                        if (iHashCode4 != -905816648) {
                                            if (iHashCode4 == 99657 && str4.equals("dot")) {
                                                i6 = 2;
                                            }
                                        } else if (str4.equals("sesame")) {
                                            i6 = 3;
                                        }
                                        fsvVar = new defpackage.fsv(i6, i7, i3);
                                    }
                                } else {
                                    java.lang.String str5 = (java.lang.String) ((defpackage.aikv) aildVarAn).iterator().next();
                                    if (str5.hashCode() == 3387192 && str5.equals("none")) {
                                        i5 = 0;
                                    }
                                    fsvVar = new defpackage.fsv(i5, 0, i3);
                                }
                                fsvVar2 = fsvVar;
                            }
                        }
                        ftaVarE.r = fsvVar2;
                    }
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        java.lang.String strP5 = ahvr.p(attributeValue);
                        int iHashCode5 = strP5.hashCode();
                        if (iHashCode5 != -1392885889) {
                            if (iHashCode5 == 92734940 && strP5.equals("after")) {
                                ftaVarE = e(ftaVarE);
                                ftaVarE.n = 2;
                            }
                        } else if (strP5.equals("before")) {
                            ftaVarE = e(ftaVarE);
                            ftaVarE.n = 1;
                        }
                    }
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        ftaVarE = e(ftaVarE);
                        try {
                            ftaVarE.c(defpackage.etf.a(attributeValue, false));
                        } catch (java.lang.IllegalArgumentException unused3) {
                            defpackage.etr.f("TtmlParser", "Failed parsing background value: ".concat(java.lang.String.valueOf(attributeValue)));
                        }
                    }
                    break;
                case 1587328867:
                    if (attributeName.equals("displayAlign")) {
                        ftaVarE = e(ftaVarE);
                        ftaVarE.v = attributeValue;
                    }
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        ftaVarE = e(ftaVarE);
                        ftaVarE.p = d(attributeValue);
                    }
                    break;
            }
        }
        return ftaVarE;
    }

    private static java.lang.String[] g(java.lang.String str) {
        java.lang.String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new java.lang.String[0];
        }
        java.lang.String str2 = eum.a;
        return strTrim.split("\\s+", -1);
    }

    private static long h(java.lang.String str, alii aliiVar) throws defpackage.frl {
        double d2;
        double d3;
        java.util.regex.Matcher matcher = c.matcher(str);
        if (matcher.matches()) {
            java.lang.String strGroup = matcher.group(1);
            ahvr.ci(strGroup);
            long j = java.lang.Long.parseLong(strGroup) * 3600;
            java.lang.String strGroup2 = matcher.group(2);
            ahvr.ci(strGroup2);
            long j2 = java.lang.Long.parseLong(strGroup2) * 60;
            java.lang.String strGroup3 = matcher.group(3);
            ahvr.ci(strGroup3);
            double d4 = java.lang.Long.parseLong(strGroup3);
            java.lang.String strGroup4 = matcher.group(4);
            double d5 = 0.0d;
            double d6 = strGroup4 != null ? java.lang.Double.parseDouble(strGroup4) : 0.0d;
            double d7 = j + j2 + d4;
            java.lang.String strGroup5 = matcher.group(5);
            double d8 = strGroup5 != null ? java.lang.Long.parseLong(strGroup5) / aliiVar.c : 0.0d;
            double d9 = d7 + d6;
            java.lang.String strGroup6 = matcher.group(6);
            if (strGroup6 != null) {
                d5 = (java.lang.Long.parseLong(strGroup6) / ((double) aliiVar.b)) / ((double) aliiVar.c);
            }
            return (long) ((d9 + d8 + d5) * 1000000.0d);
        }
        java.util.regex.Matcher matcher2 = d.matcher(str);
        if (!matcher2.matches()) {
            throw new defpackage.frl("Malformed time expression: ".concat(java.lang.String.valueOf(str)));
        }
        java.lang.String strGroup7 = matcher2.group(1);
        ahvr.ci(strGroup7);
        double d10 = java.lang.Double.parseDouble(strGroup7);
        java.lang.String strGroup8 = matcher2.group(2);
        ahvr.ci(strGroup8);
        int iHashCode = strGroup8.hashCode();
        if (iHashCode != 102) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 3494) {
                        if (iHashCode == 115) {
                            strGroup8.equals("s");
                        } else if (iHashCode == 116 && strGroup8.equals("t")) {
                            d2 = aliiVar.a;
                            d10 /= d2;
                        }
                    } else if (strGroup8.equals("ms")) {
                        d2 = 1000.0d;
                        d10 /= d2;
                    }
                } else if (strGroup8.equals("m")) {
                    d3 = 60.0d;
                    d10 *= d3;
                }
            } else if (strGroup8.equals("h")) {
                d3 = 3600.0d;
                d10 *= d3;
            }
        } else if (strGroup8.equals("f")) {
            d2 = aliiVar.c;
            d10 /= d2;
        }
        return (long) (d10 * 1000000.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:195:0x046d  */
    /* JADX WARN: Code duplicated, block: B:214:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:215:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:222:0x04d3 A[LOOP:1: B:98:0x0241->B:222:0x04d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:241:0x0534 A[PHI: r36 r38
      0x0534: PHI (r36v3 java.lang.String[]) = 
      (r36v2 java.lang.String[])
      (r36v2 java.lang.String[])
      (r36v2 java.lang.String[])
      (r36v2 java.lang.String[])
      (r36v5 java.lang.String[])
      (r36v2 java.lang.String[])
      (r36v2 java.lang.String[])
      (r36v2 java.lang.String[])
     binds: [B:228:0x050b, B:243:0x053d, B:237:0x0529, B:239:0x0530, B:240:0x0532, B:231:0x0515, B:233:0x051d, B:234:0x051f] A[DONT_GENERATE, DONT_INLINE]
      0x0534: PHI (r38v3 java.lang.String) = 
      (r38v2 java.lang.String)
      (r38v2 java.lang.String)
      (r38v2 java.lang.String)
      (r38v2 java.lang.String)
      (r38v2 java.lang.String)
      (r38v2 java.lang.String)
      (r38v2 java.lang.String)
      (r38v5 java.lang.String)
     binds: [B:228:0x050b, B:243:0x053d, B:237:0x0529, B:239:0x0530, B:240:0x0532, B:231:0x0515, B:233:0x051d, B:234:0x051f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:358:0x04cd A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:228:0x050b. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.frt
    public final defpackage.frj a(byte[] bArr, int i2, int i3) {
        java.lang.String str;
        int i4;
        java.lang.String str2;
        java.util.ArrayDeque arrayDeque;
        alii aliiVar;
        defpackage.fsw fswVar;
        long j;
        long j2;
        java.lang.String str3;
        defpackage.fsz fszVar;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i5;
        float f7;
        int i6;
        java.lang.String strD;
        defpackage.fta ftaVar;
        java.lang.String strD2;
        defpackage.fta ftaVar2;
        java.lang.String strD3;
        defpackage.fta ftaVar3;
        java.lang.String strD4;
        float f8;
        boolean z;
        java.lang.String str4 = "";
        java.lang.String str5 = "\n";
        java.lang.String str6 = "http://www.w3.org/ns/ttml#parameter";
        try {
            org.xmlpull.v1.XmlPullParser xmlPullParserNewPullParser = this.h.newPullParser();
            java.util.HashMap map = new java.util.HashMap();
            java.util.HashMap map2 = new java.util.HashMap();
            java.util.HashMap map3 = new java.util.HashMap();
            map2.put("", new defpackage.fsz("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            xmlPullParserNewPullParser.setInput(new java.io.ByteArrayInputStream(bArr, i2, i3), null);
            java.util.ArrayDeque arrayDeque2 = new java.util.ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            alii aliiVar2 = i;
            defpackage.ftb ftbVar = null;
            defpackage.fsx fsxVar = null;
            alii aliiVar3 = aliiVar2;
            int i7 = 0;
            int i8 = 15;
            while (eventType != 1) {
                defpackage.fsw fswVar2 = (defpackage.fsw) arrayDeque2.peek();
                if (i7 == 0) {
                    java.lang.String name = xmlPullParserNewPullParser.getName();
                    str = str4;
                    ftbVar = ftbVar;
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            java.lang.String attributeValue = xmlPullParserNewPullParser.getAttributeValue(str6, "frameRate");
                            int i9 = attributeValue != null ? java.lang.Integer.parseInt(attributeValue) : 30;
                            java.lang.String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(str6, "frameRateMultiplier");
                            if (attributeValue2 != null) {
                                java.lang.String str7 = eum.a;
                                java.lang.String[] strArrSplit = attributeValue2.split(" ", -1);
                                ahvr.bN(strArrSplit.length == 2, "frameRateMultiplier doesn't have 2 parts");
                                f8 = java.lang.Integer.parseInt(strArrSplit[0]) / java.lang.Integer.parseInt(strArrSplit[1]);
                            } else {
                                f8 = 1.0f;
                            }
                            int i10 = aliiVar2.b;
                            java.lang.String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(str6, "subFrameRate");
                            if (attributeValue3 != null) {
                                i10 = java.lang.Integer.parseInt(attributeValue3);
                            }
                            int i11 = aliiVar2.a;
                            java.lang.String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue(str6, "tickRate");
                            if (attributeValue4 != null) {
                                i11 = java.lang.Integer.parseInt(attributeValue4);
                            }
                            alii aliiVar4 = new alii(i9 * f8, i10, i11);
                            java.lang.String attributeValue5 = xmlPullParserNewPullParser.getAttributeValue(str6, "cellResolution");
                            if (attributeValue5 != null) {
                                java.util.regex.Matcher matcher = g.matcher(attributeValue5);
                                if (matcher.matches()) {
                                    try {
                                        java.lang.String strGroup = matcher.group(1);
                                        ahvr.ci(strGroup);
                                        int i12 = java.lang.Integer.parseInt(strGroup);
                                        java.lang.String strGroup2 = matcher.group(2);
                                        ahvr.ci(strGroup2);
                                        int i13 = java.lang.Integer.parseInt(strGroup2);
                                        try {
                                            if (i12 != 0) {
                                                if (i13 != 0) {
                                                    z = true;
                                                } else {
                                                    i13 = 0;
                                                    z = false;
                                                }
                                                ahvr.bT(z, "Invalid cell resolution %s %s", i12, i13);
                                                i8 = i13;
                                            } else {
                                                z = false;
                                            }
                                            ahvr.bT(z, "Invalid cell resolution %s %s", i12, i13);
                                            i8 = i13;
                                        } catch (java.lang.NumberFormatException unused) {
                                            defpackage.etr.f("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                            i8 = 15;
                                        }
                                    } catch (java.lang.NumberFormatException unused2) {
                                        str6 = str6;
                                    }
                                } else {
                                    defpackage.etr.f("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                    str6 = str6;
                                    i8 = 15;
                                }
                            } else {
                                str6 = str6;
                                i8 = 15;
                            }
                            java.lang.String strD5 = defpackage.esv.d(xmlPullParserNewPullParser, "extent");
                            if (strD5 != null) {
                                java.util.regex.Matcher matcher2 = f.matcher(strD5);
                                if (matcher2.matches()) {
                                    try {
                                        java.lang.String strGroup3 = matcher2.group(1);
                                        ahvr.ci(strGroup3);
                                        int i14 = java.lang.Integer.parseInt(strGroup3);
                                        java.lang.String strGroup4 = matcher2.group(2);
                                        ahvr.ci(strGroup4);
                                        fsxVar = new defpackage.fsx(i14, java.lang.Integer.parseInt(strGroup4));
                                    } catch (java.lang.NumberFormatException unused3) {
                                        defpackage.etr.f("TtmlParser", "Ignoring malformed tts extent: ".concat(strD5));
                                        fsxVar = null;
                                    }
                                    aliiVar3 = aliiVar4;
                                } else {
                                    defpackage.etr.f("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strD5));
                                }
                                fsxVar = null;
                                aliiVar3 = aliiVar4;
                            } else {
                                fsxVar = null;
                                aliiVar3 = aliiVar4;
                            }
                        } else {
                            str6 = str6;
                            i7 = i7;
                        }
                        i8 = i8;
                        fsxVar = fsxVar;
                        java.lang.String str8 = "image";
                        str2 = str5;
                        java.util.ArrayDeque arrayDeque3 = arrayDeque2;
                        if (name.equals("tt") || name.equals("head") || name.equals("body") || name.equals("div") || name.equals("p") || name.equals("span") || name.equals("br") || name.equals("style") || name.equals("styling") || name.equals("layout") || name.equals("region") || name.equals("metadata") || name.equals("image") || name.equals("data") || name.equals("information")) {
                            if ("head".equals(name)) {
                                while (true) {
                                    xmlPullParserNewPullParser.next();
                                    if (defpackage.esv.f(xmlPullParserNewPullParser, "style")) {
                                        java.lang.String strD6 = defpackage.esv.d(xmlPullParserNewPullParser, "style");
                                        defpackage.fta ftaVarF = f(xmlPullParserNewPullParser, new defpackage.fta());
                                        if (strD6 != null) {
                                            java.lang.String[] strArrG = g(strD6);
                                            int i15 = 0;
                                            for (int length = strArrG.length; i15 < length; length = length) {
                                                ftaVarF.b((defpackage.fta) map.get(strArrG[i15]));
                                                i15++;
                                            }
                                        }
                                        java.lang.String str9 = ftaVarF.l;
                                        if (str9 != null) {
                                            map.put(str9, ftaVarF);
                                        }
                                    } else {
                                        aliiVar3 = aliiVar3;
                                        if (defpackage.esv.f(xmlPullParserNewPullParser, "region")) {
                                            java.lang.String strD7 = defpackage.esv.d(xmlPullParserNewPullParser, "id");
                                            if (strD7 == null) {
                                                str3 = str8;
                                                fszVar = null;
                                            } else {
                                                java.lang.String strD8 = defpackage.esv.d(xmlPullParserNewPullParser, "origin");
                                                if (strD8 == null && (strD3 = defpackage.esv.d(xmlPullParserNewPullParser, "style")) != null && (ftaVar3 = (defpackage.fta) map.get(strD3)) != null) {
                                                    strD8 = ftaVar3.t;
                                                }
                                                if (strD8 != null) {
                                                    java.util.regex.Matcher matcher3 = b.matcher(strD8);
                                                    java.util.regex.Matcher matcher4 = f.matcher(strD8);
                                                    if (matcher3.matches()) {
                                                        f2 = 100.0f;
                                                        try {
                                                            java.lang.String strGroup5 = matcher3.group(1);
                                                            ahvr.ci(strGroup5);
                                                            f4 = java.lang.Float.parseFloat(strGroup5) / 100.0f;
                                                            java.lang.String strGroup6 = matcher3.group(2);
                                                            ahvr.ci(strGroup6);
                                                            f3 = java.lang.Float.parseFloat(strGroup6) / 100.0f;
                                                        } catch (java.lang.NumberFormatException unused4) {
                                                            defpackage.etr.f("TtmlParser", "Ignoring region with malformed origin: ".concat(strD8));
                                                            str3 = str8;
                                                        }
                                                    } else {
                                                        f2 = 100.0f;
                                                        if (!matcher4.matches()) {
                                                            defpackage.etr.f("TtmlParser", "Ignoring region with unsupported origin: ".concat(strD8));
                                                        } else if (fsxVar == null) {
                                                            defpackage.etr.f("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strD8));
                                                        } else {
                                                            try {
                                                                java.lang.String strGroup7 = matcher4.group(1);
                                                                ahvr.ci(strGroup7);
                                                                int i16 = java.lang.Integer.parseInt(strGroup7);
                                                                java.lang.String strGroup8 = matcher4.group(2);
                                                                ahvr.ci(strGroup8);
                                                                int i17 = java.lang.Integer.parseInt(strGroup8);
                                                                f4 = i16 / fsxVar.a;
                                                                f3 = i17 / fsxVar.b;
                                                            } catch (java.lang.NumberFormatException unused5) {
                                                                defpackage.etr.f("TtmlParser", "Ignoring region with malformed origin: ".concat(strD8));
                                                                str3 = str8;
                                                            }
                                                        }
                                                        str3 = str8;
                                                        fszVar = null;
                                                    }
                                                } else {
                                                    f2 = 100.0f;
                                                    f3 = 0.0f;
                                                    f4 = 0.0f;
                                                }
                                                float f9 = f4;
                                                java.lang.String strD9 = defpackage.esv.d(xmlPullParserNewPullParser, "extent");
                                                if (strD9 == null && (strD2 = defpackage.esv.d(xmlPullParserNewPullParser, "style")) != null && (ftaVar2 = (defpackage.fta) map.get(strD2)) != null) {
                                                    strD9 = ftaVar2.u;
                                                }
                                                if (strD9 != null) {
                                                    java.util.regex.Matcher matcher5 = b.matcher(strD9);
                                                    str3 = str8;
                                                    java.util.regex.Matcher matcher6 = f.matcher(strD9);
                                                    if (matcher5.matches()) {
                                                        try {
                                                            java.lang.String strGroup9 = matcher5.group(1);
                                                            ahvr.ci(strGroup9);
                                                            float f10 = java.lang.Float.parseFloat(strGroup9) / f2;
                                                            java.lang.String strGroup10 = matcher5.group(2);
                                                            ahvr.ci(strGroup10);
                                                            f6 = java.lang.Float.parseFloat(strGroup10) / f2;
                                                            f5 = f10;
                                                        } catch (java.lang.NumberFormatException unused6) {
                                                            defpackage.etr.f("TtmlParser", "Ignoring region with malformed extent: ".concat(java.lang.String.valueOf(strD8)));
                                                            fszVar = null;
                                                        }
                                                    } else {
                                                        if (!matcher6.matches()) {
                                                            defpackage.etr.f("TtmlParser", "Ignoring region with unsupported extent: ".concat(java.lang.String.valueOf(strD8)));
                                                        } else if (fsxVar == null) {
                                                            defpackage.etr.f("TtmlParser", "Ignoring region with missing tts:extent: ".concat(java.lang.String.valueOf(strD8)));
                                                        } else {
                                                            try {
                                                                java.lang.String strGroup11 = matcher6.group(1);
                                                                ahvr.ci(strGroup11);
                                                                int i18 = java.lang.Integer.parseInt(strGroup11);
                                                                java.lang.String strGroup12 = matcher6.group(2);
                                                                ahvr.ci(strGroup12);
                                                                int i19 = java.lang.Integer.parseInt(strGroup12);
                                                                float f11 = i18 / fsxVar.a;
                                                                f6 = i19 / fsxVar.b;
                                                                f5 = f11;
                                                            } catch (java.lang.NumberFormatException unused7) {
                                                                defpackage.etr.f("TtmlParser", "Ignoring region with malformed extent: ".concat(java.lang.String.valueOf(strD8)));
                                                                fszVar = null;
                                                            }
                                                        }
                                                        fszVar = null;
                                                    }
                                                } else {
                                                    str3 = str8;
                                                    f5 = 1.0f;
                                                    f6 = 1.0f;
                                                }
                                                java.lang.String strD10 = defpackage.esv.d(xmlPullParserNewPullParser, "displayAlign");
                                                if (strD10 == null && (strD = defpackage.esv.d(xmlPullParserNewPullParser, "style")) != null && (ftaVar = (defpackage.fta) map.get(strD)) != null) {
                                                    strD10 = ftaVar.v;
                                                }
                                                if (strD10 != null) {
                                                    java.lang.String strP = ahvr.p(strD10);
                                                    int iHashCode = strP.hashCode();
                                                    if (iHashCode != -1364013995) {
                                                        if (iHashCode == 92734940 && strP.equals("after")) {
                                                            f7 = f3 + f6;
                                                            i5 = 2;
                                                        } else {
                                                            i5 = 0;
                                                            f7 = f3;
                                                        }
                                                    } else if (strP.equals("center")) {
                                                        f7 = f3 + (f6 / 2.0f);
                                                        i5 = 1;
                                                    } else {
                                                        i5 = 0;
                                                        f7 = f3;
                                                    }
                                                } else {
                                                    i5 = 0;
                                                    f7 = f3;
                                                }
                                                float f12 = 1.0f / i8;
                                                java.lang.String strD11 = defpackage.esv.d(xmlPullParserNewPullParser, "writingMode");
                                                if (strD11 != null) {
                                                    java.lang.String strP2 = ahvr.p(strD11);
                                                    int iHashCode2 = strP2.hashCode();
                                                    if (iHashCode2 != 3694) {
                                                        if (iHashCode2 != 3553396) {
                                                            if (iHashCode2 == 3553576 && strP2.equals("tbrl")) {
                                                                i6 = 1;
                                                            }
                                                        } else if (strP2.equals("tblr")) {
                                                            i6 = 2;
                                                        }
                                                        i6 = Integer.MIN_VALUE;
                                                    } else if (strP2.equals("tb")) {
                                                        i6 = 2;
                                                    } else {
                                                        i6 = Integer.MIN_VALUE;
                                                    }
                                                } else {
                                                    i6 = Integer.MIN_VALUE;
                                                }
                                                fszVar = new defpackage.fsz(strD7, f9, f7, 0, i5, f5, f6, 1, f12, i6);
                                            }
                                            if (fszVar != null) {
                                                map2.put(fszVar.a, fszVar);
                                            }
                                        } else if (defpackage.esv.f(xmlPullParserNewPullParser, "metadata")) {
                                            do {
                                                xmlPullParserNewPullParser.next();
                                                if (defpackage.esv.f(xmlPullParserNewPullParser, str8) && (strD4 = defpackage.esv.d(xmlPullParserNewPullParser, "id")) != null) {
                                                    map3.put(strD4, xmlPullParserNewPullParser.nextText());
                                                }
                                            } while (!defpackage.esv.e(xmlPullParserNewPullParser, "metadata"));
                                        }
                                        if (defpackage.esv.e(xmlPullParserNewPullParser, "head")) {
                                            aliiVar = aliiVar3;
                                            arrayDeque = arrayDeque3;
                                        } else {
                                            aliiVar3 = aliiVar3;
                                            str8 = str3;
                                        }
                                    }
                                    str3 = str8;
                                    if (defpackage.esv.e(xmlPullParserNewPullParser, "head")) {
                                        aliiVar = aliiVar3;
                                        arrayDeque = arrayDeque3;
                                    } else {
                                        aliiVar3 = aliiVar3;
                                        str8 = str3;
                                    }
                                }
                            } else {
                                alii aliiVar5 = aliiVar3;
                                try {
                                    int attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                                    defpackage.fta ftaVarF2 = f(xmlPullParserNewPullParser, null);
                                    int i20 = 0;
                                    java.lang.String[] strArr = null;
                                    java.lang.String strSubstring = null;
                                    java.lang.String str10 = str;
                                    long jH = -9223372036854775807L;
                                    long jH2 = -9223372036854775807L;
                                    long jH3 = -9223372036854775807L;
                                    while (i20 < attributeCount) {
                                        java.lang.String attributeName = xmlPullParserNewPullParser.getAttributeName(i20);
                                        java.lang.String attributeValue6 = xmlPullParserNewPullParser.getAttributeValue(i20);
                                        aliiVar = aliiVar5;
                                        switch (attributeName.hashCode()) {
                                            case -934795532:
                                                if (attributeName.equals("region") && map2.containsKey(attributeValue6)) {
                                                    str10 = attributeValue6;
                                                }
                                                i20++;
                                                aliiVar5 = aliiVar;
                                                break;
                                            case 99841:
                                                if (attributeName.equals("dur")) {
                                                    jH3 = h(attributeValue6, aliiVar);
                                                }
                                                i20++;
                                                aliiVar5 = aliiVar;
                                                break;
                                            case 100571:
                                                if (attributeName.equals("end")) {
                                                    jH = h(attributeValue6, aliiVar);
                                                }
                                                i20++;
                                                aliiVar5 = aliiVar;
                                                break;
                                            case 93616297:
                                                if (attributeName.equals("begin")) {
                                                    aliiVar = aliiVar5;
                                                    try {
                                                        jH2 = h(attributeValue6, aliiVar);
                                                    } catch (defpackage.frl e2) {
                                                        e = e2;
                                                        arrayDeque = arrayDeque3;
                                                        defpackage.etr.g("TtmlParser", "Suppressing parser error", e);
                                                        aliiVar3 = aliiVar;
                                                        i7 = 1;
                                                        xmlPullParserNewPullParser.next();
                                                        eventType = xmlPullParserNewPullParser.getEventType();
                                                        arrayDeque2 = arrayDeque;
                                                        str5 = str2;
                                                        str4 = str;
                                                        aliiVar2 = aliiVar2;
                                                        str6 = str6;
                                                    }
                                                } else {
                                                    aliiVar = aliiVar5;
                                                }
                                                i20++;
                                                aliiVar5 = aliiVar;
                                                break;
                                            case 109780401:
                                                if (attributeName.equals("style")) {
                                                    java.lang.String[] strArrG2 = g(attributeValue6);
                                                    if (strArrG2.length > 0) {
                                                        strArr = strArrG2;
                                                    }
                                                }
                                                aliiVar = aliiVar5;
                                                i20++;
                                                aliiVar5 = aliiVar;
                                                break;
                                            case 1292595405:
                                                if (attributeName.equals("backgroundImage") && attributeValue6.startsWith("#")) {
                                                    strSubstring = attributeValue6.substring(1);
                                                }
                                                aliiVar = aliiVar5;
                                                i20++;
                                                aliiVar5 = aliiVar;
                                                break;
                                            default:
                                                aliiVar = aliiVar5;
                                                i20++;
                                                aliiVar5 = aliiVar;
                                                break;
                                        }
                                    }
                                    aliiVar = aliiVar5;
                                    if (fswVar2 != null) {
                                        long j3 = fswVar2.d;
                                        if (j3 == -9223372036854775807L) {
                                            fswVar = fswVar2;
                                        } else {
                                            jH2 = jH2 != -9223372036854775807L ? jH2 + j3 : j3;
                                            if (jH != -9223372036854775807L) {
                                                jH += j3;
                                                fswVar = fswVar2;
                                            } else {
                                                fswVar = fswVar2;
                                                jH = -9223372036854775807L;
                                            }
                                        }
                                    } else {
                                        fswVar = null;
                                    }
                                    if (jH == -9223372036854775807L) {
                                        if (jH3 != -9223372036854775807L) {
                                            j2 = jH2 + jH3;
                                        } else {
                                            if (fswVar != null) {
                                                j2 = fswVar.e;
                                                if (j2 == -9223372036854775807L) {
                                                }
                                            }
                                            j = -9223372036854775807L;
                                        }
                                        j = j2;
                                    } else {
                                        j = jH;
                                    }
                                    defpackage.fsw fswVar3 = new defpackage.fsw(xmlPullParserNewPullParser.getName(), null, jH2, j, ftaVarF2, strArr, str10, strSubstring, fswVar);
                                    arrayDeque = arrayDeque3;
                                    try {
                                        arrayDeque.push(fswVar3);
                                        if (fswVar2 != null) {
                                            fswVar2.c(fswVar3);
                                        }
                                    } catch (defpackage.frl e3) {
                                        e = e3;
                                        defpackage.etr.g("TtmlParser", "Suppressing parser error", e);
                                        aliiVar3 = aliiVar;
                                        i7 = 1;
                                    }
                                } catch (defpackage.frl e4) {
                                    e = e4;
                                    aliiVar = aliiVar5;
                                }
                            }
                            i8 = i8;
                            fsxVar = fsxVar;
                            aliiVar3 = aliiVar;
                            ftbVar = ftbVar;
                            i7 = i7;
                            str2 = str2;
                        } else {
                            defpackage.etr.e("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            arrayDeque = arrayDeque3;
                        }
                        i7 = 1;
                    } else {
                        java.lang.String str11 = str5;
                        str6 = str6;
                        arrayDeque = arrayDeque2;
                        aliiVar2 = aliiVar2;
                        i4 = i7;
                        if (eventType == 4) {
                            ahvr.ci(fswVar2);
                            str2 = str11;
                            fswVar2.c(new defpackage.fsw(null, xmlPullParserNewPullParser.getText().replaceAll("\r\n", str2).replaceAll(" *\n *", str2).replaceAll(str2, " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null));
                        } else {
                            str2 = str11;
                            if (eventType == 3) {
                                if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                    defpackage.fsw fswVar4 = (defpackage.fsw) arrayDeque.peek();
                                    ahvr.ci(fswVar4);
                                    ftbVar = new defpackage.ftb(fswVar4, map, map2, map3);
                                } else {
                                    ftbVar = ftbVar;
                                }
                                arrayDeque.pop();
                            }
                            i7 = i4;
                        }
                        ftbVar = ftbVar;
                        i7 = i4;
                    }
                } else {
                    str = str4;
                    str6 = str6;
                    aliiVar2 = aliiVar2;
                    ftbVar = ftbVar;
                    i4 = i7;
                    str2 = str5;
                    arrayDeque = arrayDeque2;
                    if (eventType == 2) {
                        i7 = i4 + 1;
                    } else {
                        if (eventType == 3) {
                            i7 = i4 - 1;
                        }
                        ftbVar = ftbVar;
                        i7 = i4;
                    }
                    ftbVar = ftbVar;
                }
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                arrayDeque2 = arrayDeque;
                str5 = str2;
                str4 = str;
                aliiVar2 = aliiVar2;
                str6 = str6;
            }
            defpackage.ftb ftbVar2 = ftbVar;
            ahvr.ci(ftbVar2);
            return ftbVar2;
        } catch (java.io.IOException e5) {
            throw new java.lang.IllegalStateException("Unexpected error when reading input.", e5);
        } catch (org.xmlpull.v1.XmlPullParserException e6) {
            throw new java.lang.IllegalStateException("Unable to decode source", e6);
        }
    }

    @Override // defpackage.frt
    public final void b(byte[] bArr, int i2, int i3, defpackage.frs frsVar, java.util.function.Consumer consumer) {
        defpackage.fsu.b(a(bArr, i2, i3), frsVar, consumer);
    }

    @Override // defpackage.frt
    public final /* synthetic */ void c() {
    }
}
