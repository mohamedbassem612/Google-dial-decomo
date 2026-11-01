package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yjq extends org.xml.sax.ext.DefaultHandler2 {
    private int d;
    private defpackage.yiw a = null;
    private defpackage.yib b = null;
    private boolean c = false;
    private boolean e = false;
    private defpackage.yjo f = null;
    private java.lang.StringBuilder g = null;
    private boolean h = false;
    private java.lang.StringBuilder i = null;

    private static final void A(defpackage.yid yidVar, org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
        java.lang.Boolean bool;
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                yidVar.o = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                java.lang.String strTrim = attributes.getValue(i).trim();
                if ("default".equals(strTrim)) {
                    bool = java.lang.Boolean.FALSE;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new org.xml.sax.SAXException("Invalid value for \"xml:space\" attribute: ".concat(java.lang.String.valueOf(strTrim)));
                    }
                    bool = java.lang.Boolean.TRUE;
                }
                yidVar.p = bool;
                return;
            }
        }
    }

    private static final void B(defpackage.yhr yhrVar, org.xml.sax.Attributes attributes, java.lang.String str) throws org.xml.sax.SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (defpackage.yjn.a(attributes.getLocalName(i)) == defpackage.yjn.V) {
                defpackage.yjp yjpVar = new defpackage.yjp(attributes.getValue(i));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                yjpVar.j();
                while (!yjpVar.m()) {
                    float fB = yjpVar.b();
                    if (java.lang.Float.isNaN(fB)) {
                        throw new org.xml.sax.SAXException(a.bk(str, "Invalid <", "> points attribute. Non-coordinate content found in list."));
                    }
                    yjpVar.o();
                    float fB2 = yjpVar.b();
                    if (java.lang.Float.isNaN(fB2)) {
                        throw new org.xml.sax.SAXException(a.bk(str, "Invalid <", "> points attribute. There should be an even number of coordinates."));
                    }
                    yjpVar.o();
                    arrayList.add(java.lang.Float.valueOf(fB));
                    arrayList.add(java.lang.Float.valueOf(fB2));
                }
                yhrVar.a = new float[arrayList.size()];
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    yhrVar.a[i3] = ((java.lang.Float) arrayList.get(i2)).floatValue();
                    i2++;
                    i3++;
                }
            }
        }
    }

    private static final void C(defpackage.yid yidVar, org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String strTrim = attributes.getValue(i).trim();
            if (strTrim.length() != 0) {
                int iOrdinal = defpackage.yjn.a(attributes.getLocalName(i)).ordinal();
                if (iOrdinal == 0) {
                    java.util.ArrayList arrayList = null;
                    defpackage.yjp yjpVar = new defpackage.yjp(strTrim, null);
                    while (!yjpVar.m()) {
                        java.lang.String strQ = yjpVar.q();
                        if (strQ == null) {
                            throw new org.xml.sax.SAXException("Invalid value for \"class\" attribute: ".concat(java.lang.String.valueOf(strTrim)));
                        }
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                        }
                        arrayList.add(strQ);
                        yjpVar.j();
                    }
                    yidVar.s = arrayList;
                } else if (iOrdinal == 72) {
                    defpackage.yjp yjpVar2 = new defpackage.yjp(strTrim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        java.lang.String strI = yjpVar2.i(':');
                        yjpVar2.j();
                        if (!yjpVar2.k(':')) {
                            break;
                        }
                        yjpVar2.j();
                        java.lang.String strI2 = yjpVar2.i(';');
                        if (strI2 == null) {
                            break;
                        }
                        yjpVar2.j();
                        if (yjpVar2.m() || yjpVar2.k(';')) {
                            if (yidVar.r == null) {
                                yidVar.r = new defpackage.yhw();
                            }
                            c(yidVar.r, strI, strI2);
                            yjpVar2.j();
                        }
                    }
                } else {
                    if (yidVar.q == null) {
                        yidVar.q = new defpackage.yhw();
                    }
                    c(yidVar.q, attributes.getLocalName(i), attributes.getValue(i).trim());
                }
            }
        }
    }

    private static final void D(defpackage.yis yisVar, org.xml.sax.Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String strTrim = attributes.getValue(i).trim();
            int iOrdinal = defpackage.yjn.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 9) {
                yisVar.d = n(strTrim);
            } else if (iOrdinal == 10) {
                yisVar.e = n(strTrim);
            } else if (iOrdinal == 82) {
                yisVar.b = n(strTrim);
            } else if (iOrdinal == 83) {
                yisVar.c = n(strTrim);
            }
        }
    }

    private static final void E(defpackage.yij yijVar, org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String strTrim = attributes.getValue(i).trim();
            int iOrdinal = defpackage.yjn.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 48) {
                w(yijVar, strTrim);
            } else if (iOrdinal == 80) {
                defpackage.yjp yjpVar = new defpackage.yjp(strTrim);
                yjpVar.j();
                float fB = yjpVar.b();
                yjpVar.o();
                float fB2 = yjpVar.b();
                yjpVar.o();
                float fB3 = yjpVar.b();
                yjpVar.o();
                float fB4 = yjpVar.b();
                if (java.lang.Float.isNaN(fB) || java.lang.Float.isNaN(fB2) || java.lang.Float.isNaN(fB3) || java.lang.Float.isNaN(fB4)) {
                    throw new org.xml.sax.SAXException("Invalid viewBox definition - should have four numbers");
                }
                if (fB3 < 0.0f) {
                    throw new org.xml.sax.SAXException("Invalid viewBox. width cannot be negative");
                }
                if (fB4 < 0.0f) {
                    throw new org.xml.sax.SAXException("Invalid viewBox. height cannot be negative");
                }
                yijVar.w = new defpackage.ygv(fB, fB2, fB3, fB4);
            } else {
                continue;
            }
        }
    }

    private static float F(java.lang.String str, int i) throws org.xml.sax.SAXException {
        float fA = new defpackage.ygs().a(str, 0, i);
        if (java.lang.Float.isNaN(fA)) {
            throw new org.xml.sax.SAXException("Invalid float value: ".concat(java.lang.String.valueOf(str)));
        }
        return fA;
    }

    private static final android.graphics.Matrix G(java.lang.String str) throws org.xml.sax.SAXException {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        defpackage.yjp yjpVar = new defpackage.yjp(str);
        yjpVar.j();
        while (!yjpVar.m()) {
            java.lang.String strSubstring = null;
            if (!yjpVar.m()) {
                int i = yjpVar.b;
                int iCharAt = yjpVar.a.charAt(i);
                while (true) {
                    if ((iCharAt < 97 || iCharAt > 122) && (iCharAt < 65 || iCharAt > 90)) {
                        break;
                    }
                    iCharAt = yjpVar.d();
                }
                int i2 = yjpVar.b;
                while (defpackage.yjp.r(iCharAt)) {
                    iCharAt = yjpVar.d();
                }
                if (iCharAt == 40) {
                    yjpVar.b++;
                    strSubstring = yjpVar.a.substring(i, i2);
                } else {
                    yjpVar.b = i;
                }
            }
            if (strSubstring == null) {
                throw new org.xml.sax.SAXException("Bad transform function encountered in transform list: ".concat(java.lang.String.valueOf(str)));
            }
            if (strSubstring.equals("matrix")) {
                yjpVar.j();
                float fB = yjpVar.b();
                yjpVar.o();
                float fB2 = yjpVar.b();
                yjpVar.o();
                float fB3 = yjpVar.b();
                yjpVar.o();
                float fB4 = yjpVar.b();
                yjpVar.o();
                float fB5 = yjpVar.b();
                yjpVar.o();
                float fB6 = yjpVar.b();
                yjpVar.j();
                if (java.lang.Float.isNaN(fB6) || !yjpVar.k(')')) {
                    throw new org.xml.sax.SAXException("Invalid transform list: ".concat(java.lang.String.valueOf(str)));
                }
                android.graphics.Matrix matrix2 = new android.graphics.Matrix();
                matrix2.setValues(new float[]{fB, fB3, fB5, fB2, fB4, fB6, 0.0f, 0.0f, 1.0f});
                matrix.preConcat(matrix2);
            } else if (strSubstring.equals("translate")) {
                yjpVar.j();
                float fB7 = yjpVar.b();
                float fC = yjpVar.c();
                yjpVar.j();
                if (java.lang.Float.isNaN(fB7) || !yjpVar.k(')')) {
                    throw new org.xml.sax.SAXException("Invalid transform list: ".concat(java.lang.String.valueOf(str)));
                }
                if (java.lang.Float.isNaN(fC)) {
                    matrix.preTranslate(fB7, 0.0f);
                } else {
                    matrix.preTranslate(fB7, fC);
                }
            } else if (strSubstring.equals("scale")) {
                yjpVar.j();
                float fB8 = yjpVar.b();
                float fC2 = yjpVar.c();
                yjpVar.j();
                if (java.lang.Float.isNaN(fB8) || !yjpVar.k(')')) {
                    throw new org.xml.sax.SAXException("Invalid transform list: ".concat(java.lang.String.valueOf(str)));
                }
                if (java.lang.Float.isNaN(fC2)) {
                    matrix.preScale(fB8, fB8);
                } else {
                    matrix.preScale(fB8, fC2);
                }
            } else if (strSubstring.equals("rotate")) {
                yjpVar.j();
                float fB9 = yjpVar.b();
                float fC3 = yjpVar.c();
                float fC4 = yjpVar.c();
                yjpVar.j();
                if (java.lang.Float.isNaN(fB9) || !yjpVar.k(')')) {
                    throw new org.xml.sax.SAXException("Invalid transform list: ".concat(java.lang.String.valueOf(str)));
                }
                if (java.lang.Float.isNaN(fC3)) {
                    matrix.preRotate(fB9);
                } else {
                    if (java.lang.Float.isNaN(fC4)) {
                        throw new org.xml.sax.SAXException("Invalid transform list: ".concat(java.lang.String.valueOf(str)));
                    }
                    matrix.preRotate(fB9, fC3, fC4);
                }
            } else if (strSubstring.equals("skewX")) {
                yjpVar.j();
                float fB10 = yjpVar.b();
                yjpVar.j();
                if (java.lang.Float.isNaN(fB10) || !yjpVar.k(')')) {
                    throw new org.xml.sax.SAXException("Invalid transform list: ".concat(java.lang.String.valueOf(str)));
                }
                matrix.preSkew((float) java.lang.Math.tan(java.lang.Math.toRadians(fB10)), 0.0f);
            } else {
                if (!strSubstring.equals("skewY")) {
                    throw new org.xml.sax.SAXException(a.bp((byte) 41, strSubstring, "Invalid transform list fn: "));
                }
                yjpVar.j();
                float fB11 = yjpVar.b();
                yjpVar.j();
                if (java.lang.Float.isNaN(fB11) || !yjpVar.k(')')) {
                    throw new org.xml.sax.SAXException("Invalid transform list: ".concat(java.lang.String.valueOf(str)));
                }
                matrix.preSkew(0.0f, (float) java.lang.Math.tan(java.lang.Math.toRadians(fB11)));
            }
            if (yjpVar.m()) {
                break;
            }
            yjpVar.o();
        }
        return matrix;
    }

    private static final void H(defpackage.yhc yhcVar, org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
        int i;
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            java.lang.String strTrim = attributes.getValue(i2).trim();
            int iOrdinal = defpackage.yjn.a(attributes.getLocalName(i2)).ordinal();
            if (iOrdinal == 23) {
                yhcVar.c = G(strTrim);
            } else if (iOrdinal != 24) {
                if (iOrdinal != 26) {
                    if (iOrdinal == 60) {
                        try {
                            int iHashCode = strTrim.hashCode();
                            if (iHashCode == -934531685) {
                                if (!strTrim.equals("repeat")) {
                                    throw new java.lang.IllegalArgumentException();
                                }
                                i = 3;
                                yhcVar.e = i;
                            } else if (iHashCode != 110739) {
                                if (iHashCode != 1085265597 || !strTrim.equals("reflect")) {
                                    throw new java.lang.IllegalArgumentException();
                                }
                                i = 2;
                                yhcVar.e = i;
                            } else {
                                if (!strTrim.equals("pad")) {
                                    throw new java.lang.IllegalArgumentException();
                                }
                                i = 1;
                                yhcVar.e = i;
                            }
                        } catch (java.lang.IllegalArgumentException unused) {
                            throw new org.xml.sax.SAXException(a.bk(strTrim, "Invalid spreadMethod attribute. \"", "\" is not a valid value."));
                        }
                    } else {
                        continue;
                    }
                } else if ("http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                    yhcVar.d = strTrim;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                yhcVar.b = java.lang.Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new org.xml.sax.SAXException("Invalid value for attribute gradientUnits");
                }
                yhcVar.b = java.lang.Boolean.TRUE;
            }
        }
    }

    private static final void I(defpackage.yhf yhfVar, org.xml.sax.Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (defpackage.yjn.a(attributes.getLocalName(i)) == defpackage.yjn.ay) {
                yhfVar.a(G(attributes.getValue(i)));
            }
        }
    }

    protected static defpackage.yhh a(java.lang.String str) throws org.xml.sax.SAXException {
        int i;
        int iR;
        if (str.length() == 0) {
            throw new org.xml.sax.SAXException("Invalid length value (empty string)");
        }
        int length = str.length();
        int i2 = length - 1;
        char cCharAt = str.charAt(i2);
        try {
            if (cCharAt != '%') {
                i = 1;
                if (length > 2 && java.lang.Character.isLetter(cCharAt)) {
                    i2 = length - 2;
                    if (java.lang.Character.isLetter(str.charAt(i2))) {
                        try {
                            iR = defpackage.xfh.r(str.substring(i2).toLowerCase(java.util.Locale.US));
                        } catch (java.lang.IllegalArgumentException unused) {
                            throw new org.xml.sax.SAXException("Invalid length unit specifier: ".concat(java.lang.String.valueOf(str)));
                        }
                    }
                }
                return new defpackage.yhh(F(str, length), i);
            }
            iR = 9;
            return new defpackage.yhh(F(str, length), i);
        } catch (java.lang.NumberFormatException e) {
            throw new org.xml.sax.SAXException("Invalid length value: ".concat(java.lang.String.valueOf(str)), e);
        }
        i = iR;
        length = i2;
    }

    protected static void c(defpackage.yhw yhwVar, java.lang.String str, java.lang.String str2) {
        java.lang.Boolean bool;
        java.lang.String strI;
        int i;
        defpackage.yhh yhhVarE;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        int iOrdinal = defpackage.yjn.a(str).ordinal();
        int i2 = 5;
        defpackage.zlr zlrVar = null;
        yhhVarArr = null;
        yhhVarArr = null;
        defpackage.yhh[] yhhVarArr = null;
        java.lang.String strSubstring = null;
        int i3 = 1;
        if (iOrdinal == 1) {
            if (!"auto".equals(str2)) {
                if (!str2.toLowerCase(java.util.Locale.US).startsWith("rect(")) {
                    throw new org.xml.sax.SAXException("Invalid clip attribute shape. Only rect() is supported.");
                }
                defpackage.yjp yjpVar = new defpackage.yjp(str2.substring(5));
                yjpVar.j();
                defpackage.yhh yhhVarI = i(yjpVar);
                yjpVar.o();
                defpackage.yhh yhhVarI2 = i(yjpVar);
                yjpVar.o();
                defpackage.yhh yhhVarI3 = i(yjpVar);
                yjpVar.o();
                defpackage.yhh yhhVarI4 = i(yjpVar);
                yjpVar.j();
                if (!yjpVar.k(')')) {
                    throw new org.xml.sax.SAXException("Bad rect() clip definition: ".concat(java.lang.String.valueOf(str2)));
                }
                zlrVar = new defpackage.zlr(yhhVarI, yhhVarI2, yhhVarI3, yhhVarI4);
            }
            yhwVar.L = zlrVar;
            yhwVar.a |= 1048576;
            return;
        }
        if (iOrdinal == 2) {
            yhwVar.w = l(str2, str);
            yhwVar.a |= 268435456;
            return;
        }
        if (iOrdinal == 4) {
            yhwVar.J = x(str2);
            yhwVar.a |= 536870912;
            return;
        }
        if (iOrdinal == 5) {
            yhwVar.k = g(str2);
            yhwVar.a |= 4096;
            return;
        }
        if (iOrdinal == 8) {
            if (!"ltr".equals(str2)) {
                if (!"rtl".equals(str2)) {
                    throw new org.xml.sax.SAXException("Invalid direction property: ".concat(java.lang.String.valueOf(str2)));
                }
                i3 = 2;
            }
            yhwVar.H = i3;
            yhwVar.a |= 68719476736L;
            return;
        }
        if (iOrdinal == 35) {
            yhwVar.x = l(str2, str);
            yhwVar.a |= 1073741824;
            return;
        }
        if (iOrdinal == 40) {
            yhwVar.j = java.lang.Float.valueOf(e(str2));
            yhwVar.a |= 2048;
            return;
        }
        if (iOrdinal == 42) {
            if ("visible".equals(str2) || "auto".equals(str2)) {
                bool = java.lang.Boolean.TRUE;
            } else {
                if (!"hidden".equals(str2) && !"scroll".equals(str2)) {
                    throw new org.xml.sax.SAXException("Invalid toverflow property: ".concat(java.lang.String.valueOf(str2)));
                }
                bool = java.lang.Boolean.FALSE;
            }
            yhwVar.o = bool;
            yhwVar.a |= 524288;
            return;
        }
        if (iOrdinal == 78) {
            if (!"none".equals(str2)) {
                if (!"non-scaling-stroke".equals(str2)) {
                    throw new org.xml.sax.SAXException("Invalid vector-effect property: ".concat(java.lang.String.valueOf(str2)));
                }
                i3 = 2;
            }
            yhwVar.K = i3;
            yhwVar.a |= 34359738368L;
            return;
        }
        if (iOrdinal == 58) {
            if (str2.equals("currentColor")) {
                yhwVar.y = defpackage.ygz.a;
            } else {
                yhwVar.y = g(str2);
            }
            yhwVar.a |= 2147483648L;
            return;
        }
        if (iOrdinal == 59) {
            yhwVar.z = java.lang.Float.valueOf(e(str2));
            yhwVar.a |= 4294967296L;
            return;
        }
        if (iOrdinal == 74) {
            if (!"start".equals(str2)) {
                if ("middle".equals(str2)) {
                    i3 = 2;
                } else {
                    if (!"end".equals(str2)) {
                        throw new org.xml.sax.SAXException("Invalid text-anchor property: ".concat(java.lang.String.valueOf(str2)));
                    }
                    i3 = 3;
                }
            }
            yhwVar.I = i3;
            yhwVar.a |= 262144;
            return;
        }
        if (iOrdinal == 75) {
            if ("none".equals(str2)) {
                i2 = 1;
            } else if ("underline".equals(str2)) {
                i2 = 2;
            } else if ("overline".equals(str2)) {
                i2 = 3;
            } else if ("line-through".equals(str2)) {
                i2 = 4;
            } else if (!"blink".equals(str2)) {
                throw new org.xml.sax.SAXException("Invalid text-decoration property: ".concat(java.lang.String.valueOf(str2)));
            }
            yhwVar.G = i2;
            yhwVar.a |= 131072;
            return;
        }
        switch (iOrdinal) {
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                if (str2.indexOf(124) < 0) {
                    if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".indexOf("|" + str2 + '|') != -1) {
                        yhwVar.s = java.lang.Boolean.valueOf(!str2.equals("none"));
                        yhwVar.a |= 16777216;
                        return;
                    }
                }
                throw new org.xml.sax.SAXException("Invalid value for \"display\" attribute: ".concat(java.lang.String.valueOf(str2)));
            case 15:
                yhwVar.b = k(str2, "fill");
                yhwVar.a |= 1;
                return;
            case 16:
                yhwVar.C = x(str2);
                yhwVar.a |= 2;
                return;
            case 17:
                yhwVar.c = java.lang.Float.valueOf(e(str2));
                yhwVar.a |= 4;
                return;
            case 18:
                if ("|caption|icon|menu|message-box|small-caption|status-bar|".indexOf("|" + str2 + '|') == -1) {
                    defpackage.yjp yjpVar2 = new defpackage.yjp(str2);
                    int iY = 0;
                    java.lang.Integer numA = null;
                    java.lang.String str3 = null;
                    while (true) {
                        strI = yjpVar2.i('/');
                        yjpVar2.j();
                        if (strI == null) {
                            throw new org.xml.sax.SAXException("Invalid font style attribute: missing font size and family");
                        }
                        if (numA == null) {
                            i = iY;
                        } else if (iY == 0) {
                            i = 0;
                        }
                        if (!strI.equals("normal") && (numA != null || (numA = defpackage.yjm.a(strI)) == null)) {
                            if (i == 0) {
                                iY = y(strI);
                                if (iY != 0) {
                                    continue;
                                }
                            } else {
                                iY = i;
                            }
                            if (str3 == null && strI.equals("small-caps")) {
                                str3 = strI;
                            }
                        }
                    }
                    defpackage.yhh yhhVarH = h(strI);
                    if (yjpVar2.k('/')) {
                        yjpVar2.j();
                        java.lang.String strI2 = yjpVar2.i(' ');
                        if (strI2 == null) {
                            throw new org.xml.sax.SAXException("Invalid font style attribute: missing line-height");
                        }
                        a(strI2);
                        yjpVar2.j();
                    }
                    if (!yjpVar2.m()) {
                        int i4 = yjpVar2.b;
                        yjpVar2.b = yjpVar2.c;
                        strSubstring = yjpVar2.a.substring(i4);
                    }
                    yhwVar.l = m(strSubstring);
                    yhwVar.m = yhhVarH;
                    yhwVar.n = java.lang.Integer.valueOf(numA == null ? 400 : numA.intValue());
                    yhwVar.F = iY != 0 ? iY : 1;
                    yhwVar.a |= 122880;
                    return;
                }
                return;
            case 19:
                yhwVar.l = m(str2);
                yhwVar.a |= 8192;
                return;
            case 20:
                yhwVar.m = h(str2);
                yhwVar.a |= 16384;
                return;
            case 21:
                java.lang.Integer numA2 = defpackage.yjm.a(str2);
                if (numA2 == null) {
                    throw new org.xml.sax.SAXException("Invalid font-weight property: ".concat(java.lang.String.valueOf(str2)));
                }
                yhwVar.n = numA2;
                yhwVar.a |= 32768;
                return;
            case 22:
                int iY2 = y(str2);
                if (iY2 == 0) {
                    throw new org.xml.sax.SAXException("Invalid font-style property: ".concat(java.lang.String.valueOf(str2)));
                }
                yhwVar.F = iY2;
                yhwVar.a |= 65536;
                return;
            default:
                switch (iOrdinal) {
                    case 28:
                        yhwVar.p = l(str2, str);
                        java.lang.String str4 = yhwVar.p;
                        yhwVar.q = str4;
                        yhwVar.r = str4;
                        yhwVar.a |= 14680064;
                        return;
                    case 29:
                        yhwVar.p = l(str2, str);
                        yhwVar.a |= 2097152;
                        return;
                    case 30:
                        yhwVar.q = l(str2, str);
                        yhwVar.a |= 4194304;
                        return;
                    case 31:
                        yhwVar.r = l(str2, str);
                        yhwVar.a |= 8388608;
                        return;
                    default:
                        switch (iOrdinal) {
                            case 62:
                                if (str2.equals("currentColor")) {
                                    yhwVar.u = defpackage.ygz.a;
                                } else {
                                    yhwVar.u = g(str2);
                                }
                                yhwVar.a |= 67108864;
                                return;
                            case 63:
                                yhwVar.v = java.lang.Float.valueOf(e(str2));
                                yhwVar.a |= 134217728;
                                return;
                            case 64:
                                yhwVar.d = k(str2, "stroke");
                                yhwVar.a |= 8;
                                return;
                            case 65:
                                if ("none".equals(str2)) {
                                    yhwVar.h = null;
                                } else {
                                    defpackage.yjp yjpVar3 = new defpackage.yjp(str2);
                                    yjpVar3.j();
                                    if (!yjpVar3.m() && (yhhVarE = yjpVar3.e()) != null) {
                                        if (yhhVarE.e()) {
                                            throw new org.xml.sax.SAXException("Invalid stroke-dasharray. Dash segemnts cannot be negative: ".concat(java.lang.String.valueOf(str2)));
                                        }
                                        float f = yhhVarE.a;
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        arrayList.add(yhhVarE);
                                        while (!yjpVar3.m()) {
                                            yjpVar3.o();
                                            defpackage.yhh yhhVarE2 = yjpVar3.e();
                                            if (yhhVarE2 == null) {
                                                throw new org.xml.sax.SAXException("Invalid stroke-dasharray. Non-Length content found: ".concat(java.lang.String.valueOf(str2)));
                                            }
                                            if (yhhVarE2.e()) {
                                                throw new org.xml.sax.SAXException("Invalid stroke-dasharray. Dash segemnts cannot be negative: ".concat(java.lang.String.valueOf(str2)));
                                            }
                                            arrayList.add(yhhVarE2);
                                            f += yhhVarE2.a;
                                        }
                                        if (f != 0.0f) {
                                            yhhVarArr = (defpackage.yhh[]) arrayList.toArray(new defpackage.yhh[arrayList.size()]);
                                        }
                                    }
                                    yhwVar.h = yhhVarArr;
                                }
                                yhwVar.a |= 512;
                                return;
                            case 66:
                                yhwVar.i = a(str2);
                                yhwVar.a |= 1024;
                                return;
                            case 67:
                                if (!"butt".equals(str2)) {
                                    if ("round".equals(str2)) {
                                        i3 = 2;
                                    } else {
                                        if (!"square".equals(str2)) {
                                            throw new org.xml.sax.SAXException("Invalid stroke-linecap property: ".concat(java.lang.String.valueOf(str2)));
                                        }
                                        i3 = 3;
                                    }
                                }
                                yhwVar.D = i3;
                                yhwVar.a |= 64;
                                return;
                            case 68:
                                if (!"miter".equals(str2)) {
                                    if ("round".equals(str2)) {
                                        i3 = 2;
                                    } else {
                                        if (!"bevel".equals(str2)) {
                                            throw new org.xml.sax.SAXException("Invalid stroke-linejoin property: ".concat(java.lang.String.valueOf(str2)));
                                        }
                                        i3 = 3;
                                    }
                                }
                                yhwVar.E = i3;
                                yhwVar.a |= 128;
                                return;
                            case 69:
                                yhwVar.g = java.lang.Float.valueOf(d(str2));
                                yhwVar.a |= 256;
                                return;
                            case 70:
                                yhwVar.e = java.lang.Float.valueOf(e(str2));
                                yhwVar.a |= 16;
                                return;
                            case 71:
                                yhwVar.f = a(str2);
                                yhwVar.a |= 32;
                                return;
                            default:
                                switch (iOrdinal) {
                                    case 88:
                                        if (str2.equals("currentColor")) {
                                            yhwVar.A = defpackage.ygz.a;
                                        } else {
                                            yhwVar.A = g(str2);
                                        }
                                        yhwVar.a |= 8589934592L;
                                        return;
                                    case 89:
                                        yhwVar.B = java.lang.Float.valueOf(e(str2));
                                        yhwVar.a |= 17179869184L;
                                        return;
                                    case 90:
                                        if (str2.indexOf(124) < 0) {
                                            if ("|visible|hidden|collapse|".indexOf("|" + str2 + '|') != -1) {
                                                yhwVar.t = java.lang.Boolean.valueOf(str2.equals("visible"));
                                                yhwVar.a |= 33554432;
                                                return;
                                            }
                                        }
                                        throw new org.xml.sax.SAXException("Invalid value for \"visibility\" attribute: ".concat(java.lang.String.valueOf(str2)));
                                    default:
                                        return;
                                }
                        }
                }
        }
    }

    private static float d(java.lang.String str) throws org.xml.sax.SAXException {
        int length = str.length();
        if (length != 0) {
            return F(str, length);
        }
        throw new org.xml.sax.SAXException("Invalid float value (empty string)");
    }

    private static float e(java.lang.String str) throws org.xml.sax.SAXException {
        float fD = d(str);
        float f = 0.0f;
        if (fD >= 0.0f) {
            f = 1.0f;
            if (fD <= 1.0f) {
                return fD;
            }
        }
        return f;
    }

    private static int f(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return java.lang.Math.round(f);
    }

    private static defpackage.ygy g(java.lang.String str) throws org.xml.sax.SAXException {
        long j;
        int i;
        if (str.charAt(0) != '#') {
            if (!str.toLowerCase(java.util.Locale.US).startsWith("rgb(")) {
                java.lang.Integer num = (java.lang.Integer) defpackage.yjk.a.get(str.toLowerCase(java.util.Locale.US));
                if (num != null) {
                    return new defpackage.ygy(num.intValue());
                }
                throw new org.xml.sax.SAXException("Invalid colour keyword: ".concat(java.lang.String.valueOf(str)));
            }
            defpackage.yjp yjpVar = new defpackage.yjp(str.substring(4));
            yjpVar.j();
            float fB = yjpVar.b();
            if (!java.lang.Float.isNaN(fB) && yjpVar.k('%')) {
                fB = (fB * 256.0f) / 100.0f;
            }
            float fA = yjpVar.a(fB);
            if (!java.lang.Float.isNaN(fA) && yjpVar.k('%')) {
                fA = (fA * 256.0f) / 100.0f;
            }
            float fA2 = yjpVar.a(fA);
            if (!java.lang.Float.isNaN(fA2) && yjpVar.k('%')) {
                fA2 = (fA2 * 256.0f) / 100.0f;
            }
            yjpVar.j();
            if (java.lang.Float.isNaN(fA2) || !yjpVar.k(')')) {
                throw new org.xml.sax.SAXException("Bad rgb() colour value: ".concat(java.lang.String.valueOf(str)));
            }
            return new defpackage.ygy((f(fB) << 16) | (f(fA) << 8) | f(fA2));
        }
        int length = str.length();
        ygr ygrVar = null;
        if (length > 1) {
            long j2 = 0;
            int i2 = 1;
            while (true) {
                if (i2 < length) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt < '0' || cCharAt > '9') {
                        if (cCharAt >= 'A' && cCharAt <= 'F') {
                            j = j2 << 4;
                            i = cCharAt - 'A';
                        } else if (cCharAt >= 'a' && cCharAt <= 'f') {
                            j = j2 << 4;
                            i = cCharAt - 'a';
                        }
                        j2 = j + ((long) i) + 10;
                    } else {
                        j2 = (j2 << 4) + ((long) (cCharAt - '0'));
                    }
                    if (j2 <= 4294967295L) {
                        i2++;
                    }
                }
                if (i2 != 1) {
                    ygrVar = new ygr(j2, i2);
                }
            }
        }
        if (ygrVar == null) {
            throw new org.xml.sax.SAXException("Bad hex colour value: ".concat(java.lang.String.valueOf(str)));
        }
        int i3 = ygrVar.a;
        if (i3 == 7) {
            return new defpackage.ygy(ygrVar.a());
        }
        if (i3 != 4) {
            throw new org.xml.sax.SAXException("Bad hex colour value: ".concat(java.lang.String.valueOf(str)));
        }
        int iA = ygrVar.a();
        int i4 = iA & 3840;
        int i5 = iA & 240;
        int i6 = iA & 15;
        return new defpackage.ygy((i4 << 12) | (-16777216) | (i4 << 8) | (i5 << 8) | (i5 << 4) | (i6 << 4) | i6);
    }

    private static defpackage.yhh h(java.lang.String str) {
        defpackage.yhh yhhVar = (defpackage.yhh) defpackage.yjl.a.get(str);
        return yhhVar == null ? a(str) : yhhVar;
    }

    private static defpackage.yhh i(defpackage.yjp yjpVar) {
        return yjpVar.l("auto") ? new defpackage.yhh(0.0f) : yjpVar.e();
    }

    private static defpackage.yig j(java.lang.String str) {
        if (str.equals("none")) {
            return null;
        }
        return str.equals("currentColor") ? defpackage.ygz.a : g(str);
    }

    private static defpackage.yig k(java.lang.String str, java.lang.String str2) throws org.xml.sax.SAXException {
        if (!str.startsWith("url(")) {
            return j(str);
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            throw new org.xml.sax.SAXException(a.bk(str2, "Bad ", " attribute. Unterminated url() reference"));
        }
        java.lang.String strTrim = str.substring(4, iIndexOf).trim();
        java.lang.String strTrim2 = str.substring(iIndexOf + 1).trim();
        return new defpackage.yhm(strTrim, strTrim2.length() > 0 ? j(strTrim2) : null);
    }

    private static java.lang.String l(java.lang.String str, java.lang.String str2) throws org.xml.sax.SAXException {
        if (str.equals("none")) {
            return null;
        }
        if (str.startsWith("url(") && str.endsWith(")")) {
            return str.substring(4, str.length() - 1).trim();
        }
        throw new org.xml.sax.SAXException(a.bk(str2, "Bad ", " attribute. Expected \"none\" or \"url()\" format"));
    }

    private static java.util.List m(java.lang.String str) {
        defpackage.yjp yjpVar = new defpackage.yjp(str);
        java.util.ArrayList arrayList = null;
        do {
            java.lang.String strH = yjpVar.h();
            if (strH == null) {
                strH = yjpVar.i(',');
            }
            if (strH == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
            }
            arrayList.add(strH);
            yjpVar.o();
        } while (!yjpVar.m());
        return arrayList;
    }

    private static java.util.List n(java.lang.String str) throws org.xml.sax.SAXException {
        if (str.length() == 0) {
            throw new org.xml.sax.SAXException("Invalid length list (empty string)");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        defpackage.yjp yjpVar = new defpackage.yjp(str);
        yjpVar.j();
        while (!yjpVar.m()) {
            float fB = yjpVar.b();
            if (java.lang.Float.isNaN(fB)) {
                int i = yjpVar.b;
                while (!yjpVar.m() && !defpackage.yjp.r(yjpVar.a.charAt(yjpVar.b))) {
                    yjpVar.b++;
                }
                java.lang.String strSubstring = yjpVar.a.substring(i, yjpVar.b);
                yjpVar.b = i;
                throw new org.xml.sax.SAXException("Invalid length list value: ".concat(java.lang.String.valueOf(strSubstring)));
            }
            int iP = yjpVar.p();
            if (iP == 0) {
                iP = 1;
            }
            arrayList.add(new defpackage.yhh(fB, iP));
            yjpVar.o();
        }
        return arrayList;
    }

    private final void o(org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
        defpackage.yib yibVar = this.b;
        if (yibVar == null) {
            throw new org.xml.sax.SAXException("Invalid document. Root element must be <svg>");
        }
        defpackage.ygw ygwVar = new defpackage.ygw();
        ygwVar.t = this.a;
        ygwVar.u = yibVar;
        A(ygwVar, attributes);
        C(ygwVar, attributes);
        I(ygwVar, attributes);
        z(ygwVar, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String strTrim = attributes.getValue(i).trim();
            int iOrdinal = defpackage.yjn.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 6) {
                ygwVar.a = a(strTrim);
            } else if (iOrdinal == 7) {
                ygwVar.b = a(strTrim);
            } else if (iOrdinal == 49) {
                ygwVar.c = a(strTrim);
                if (ygwVar.c.e()) {
                    throw new org.xml.sax.SAXException("Invalid <circle> element. r cannot be negative");
                }
            } else {
                continue;
            }
        }
        this.b.b(ygwVar);
    }

    private final void p(org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
        if (this.b == null) {
            throw new org.xml.sax.SAXException("Invalid document. Root element must be <svg>");
        }
        defpackage.ygx ygxVar = new defpackage.ygx();
        ygxVar.t = this.a;
        ygxVar.u = this.b;
        A(ygxVar, attributes);
        C(ygxVar, attributes);
        I(ygxVar, attributes);
        z(ygxVar, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String strTrim = attributes.getValue(i).trim();
            if (defpackage.yjn.a(attributes.getLocalName(i)).ordinal() == 3) {
                if ("objectBoundingBox".equals(strTrim)) {
                    ygxVar.a = java.lang.Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new org.xml.sax.SAXException("Invalid value for attribute clipPathUnits");
                    }
                    ygxVar.a = java.lang.Boolean.TRUE;
                }
            }
        }
        this.b.b(ygxVar);
        this.b = ygxVar;
    }

    private final void q(org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
        if (this.b == null) {
            throw new org.xml.sax.SAXException("Invalid document. Root element must be <svg>");
        }
        defpackage.yha yhaVar = new defpackage.yha();
        yhaVar.t = this.a;
        yhaVar.u = this.b;
        A(yhaVar, attributes);
        C(yhaVar, attributes);
        I(yhaVar, attributes);
        this.b.b(yhaVar);
        this.b = yhaVar;
    }

    private final void r(org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
        defpackage.yib yibVar = this.b;
        if (yibVar == null) {
            throw new org.xml.sax.SAXException("Invalid document. Root element must be <svg>");
        }
        defpackage.yhb yhbVar = new defpackage.yhb();
        yhbVar.t = this.a;
        yhbVar.u = yibVar;
        A(yhbVar, attributes);
        C(yhbVar, attributes);
        I(yhbVar, attributes);
        z(yhbVar, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String strTrim = attributes.getValue(i).trim();
            int iOrdinal = defpackage.yjn.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 6) {
                yhbVar.a = a(strTrim);
            } else if (iOrdinal == 7) {
                yhbVar.b = a(strTrim);
            } else if (iOrdinal == 56) {
                yhbVar.c = a(strTrim);
                if (yhbVar.c.e()) {
                    throw new org.xml.sax.SAXException("Invalid <ellipse> element. rx cannot be negative");
                }
            } else if (iOrdinal == 57) {
                yhbVar.d = a(strTrim);
                if (yhbVar.d.e()) {
                    throw new org.xml.sax.SAXException("Invalid <ellipse> element. ry cannot be negative");
                }
            } else {
                continue;
            }
        }
        this.b.b(yhbVar);
    }

    private final void s(org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
        if (this.b == null) {
            throw new org.xml.sax.SAXException("Invalid document. Root element must be <svg>");
        }
        defpackage.yhe yheVar = new defpackage.yhe();
        yheVar.t = this.a;
        yheVar.u = this.b;
        A(yheVar, attributes);
        C(yheVar, attributes);
        I(yheVar, attributes);
        z(yheVar, attributes);
        this.b.b(yheVar);
        this.b = yheVar;
    }

    private final void t(org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
        if (this.b == null) {
            throw new org.xml.sax.SAXException("Invalid document. Root element must be <svg>");
        }
        defpackage.yhg yhgVar = new defpackage.yhg();
        yhgVar.t = this.a;
        yhgVar.u = this.b;
        A(yhgVar, attributes);
        C(yhgVar, attributes);
        I(yhgVar, attributes);
        z(yhgVar, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String strTrim = attributes.getValue(i).trim();
            int iOrdinal = defpackage.yjn.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 25) {
                yhgVar.e = a(strTrim);
                if (yhgVar.e.e()) {
                    throw new org.xml.sax.SAXException("Invalid <use> element. height cannot be negative");
                }
            } else if (iOrdinal != 26) {
                if (iOrdinal != 48) {
                    switch (iOrdinal) {
                        case 81:
                            yhgVar.d = a(strTrim);
                            if (yhgVar.d.e()) {
                                throw new org.xml.sax.SAXException("Invalid <use> element. width cannot be negative");
                            }
                            break;
                            break;
                        case 82:
                            yhgVar.b = a(strTrim);
                            break;
                        case 83:
                            yhgVar.c = a(strTrim);
                            break;
                    }
                } else {
                    w(yhgVar, strTrim);
                }
            } else if ("http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                yhgVar.a = strTrim;
            }
        }
        this.b.b(yhgVar);
        this.b = yhgVar;
    }

    private final void u(org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
        if (this.b == null) {
            throw new org.xml.sax.SAXException("Invalid document. Root element must be <svg>");
        }
        defpackage.yhj yhjVar = new defpackage.yhj();
        yhjVar.t = this.a;
        yhjVar.u = this.b;
        A(yhjVar, attributes);
        C(yhjVar, attributes);
        z(yhjVar, attributes);
        E(yhjVar, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String strTrim = attributes.getValue(i).trim();
            int iOrdinal = defpackage.yjn.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal != 41) {
                if (iOrdinal == 50) {
                    yhjVar.b = a(strTrim);
                } else if (iOrdinal != 51) {
                    switch (iOrdinal) {
                        case 32:
                            yhjVar.e = a(strTrim);
                            if (yhjVar.e.e()) {
                                throw new org.xml.sax.SAXException("Invalid <marker> element. markerHeight cannot be negative");
                            }
                            break;
                            break;
                        case 33:
                            if (!"strokeWidth".equals(strTrim)) {
                                if (!"userSpaceOnUse".equals(strTrim)) {
                                    throw new org.xml.sax.SAXException("Invalid value for attribute markerUnits");
                                }
                                yhjVar.a = true;
                            } else {
                                yhjVar.a = false;
                            }
                            break;
                        case 34:
                            yhjVar.d = a(strTrim);
                            if (yhjVar.d.e()) {
                                throw new org.xml.sax.SAXException("Invalid <marker> element. markerWidth cannot be negative");
                            }
                            break;
                            break;
                    }
                } else {
                    yhjVar.c = a(strTrim);
                }
            } else if ("auto".equals(strTrim)) {
                yhjVar.f = java.lang.Float.valueOf(Float.NaN);
            } else {
                yhjVar.f = java.lang.Float.valueOf(d(strTrim));
            }
        }
        this.b.b(yhjVar);
        this.b = yhjVar;
    }

    private final void v(org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
        if (this.b == null) {
            throw new org.xml.sax.SAXException("Invalid document. Root element must be <svg>");
        }
        defpackage.yhk yhkVar = new defpackage.yhk();
        yhkVar.t = this.a;
        yhkVar.u = this.b;
        A(yhkVar, attributes);
        C(yhkVar, attributes);
        z(yhkVar, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String strTrim = attributes.getValue(i).trim();
            int iOrdinal = defpackage.yjn.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 25) {
                yhkVar.b = a(strTrim);
                if (yhkVar.b.e()) {
                    throw new org.xml.sax.SAXException("Invalid <mask> element. height cannot be negative");
                }
            } else if (iOrdinal == 36) {
                if (!"objectBoundingBox".equals(strTrim) && !"userSpaceOnUse".equals(strTrim)) {
                    throw new org.xml.sax.SAXException("Invalid value for attribute maskContentUnits");
                }
            } else if (iOrdinal != 37) {
                switch (iOrdinal) {
                    case 81:
                        yhkVar.a = a(strTrim);
                        if (yhkVar.a.e()) {
                            throw new org.xml.sax.SAXException("Invalid <mask> element. width cannot be negative");
                        }
                        break;
                        break;
                    case 82:
                        a(strTrim);
                        break;
                    case 83:
                        a(strTrim);
                        break;
                }
            } else if (!"objectBoundingBox".equals(strTrim) && !"userSpaceOnUse".equals(strTrim)) {
                throw new org.xml.sax.SAXException("Invalid value for attribute maskUnits");
            }
        }
        this.b.b(yhkVar);
        this.b = yhkVar;
    }

    private static void w(defpackage.yih yihVar, java.lang.String str) throws org.xml.sax.SAXException {
        int i;
        defpackage.yjp yjpVar = new defpackage.yjp(str);
        yjpVar.j();
        java.lang.String strI = yjpVar.i(' ');
        if ("defer".equals(strI)) {
            yjpVar.j();
            strI = yjpVar.i(' ');
        }
        defpackage.ygt ygtVar = (defpackage.ygt) defpackage.yjj.a.get(strI);
        yjpVar.j();
        if (yjpVar.m()) {
            i = 0;
        } else {
            java.lang.String strI2 = yjpVar.i(' ');
            if (strI2.equals("meet")) {
                i = 1;
            } else {
                if (!strI2.equals("slice")) {
                    throw new org.xml.sax.SAXException("Invalid preserveAspectRatio definition: ".concat(java.lang.String.valueOf(str)));
                }
                i = 2;
            }
        }
        yihVar.v = new defpackage.ygu(ygtVar, i);
    }

    private static int x(java.lang.String str) throws org.xml.sax.SAXException {
        if ("nonzero".equals(str)) {
            return 1;
        }
        if ("evenodd".equals(str)) {
            return 2;
        }
        throw new org.xml.sax.SAXException("Invalid fill-rule property: ".concat(java.lang.String.valueOf(str)));
    }

    private static int y(java.lang.String str) {
        if ("italic".equals(str)) {
            return 2;
        }
        if ("normal".equals(str)) {
            return 1;
        }
        return "oblique".equals(str) ? 3 : 0;
    }

    private static final void z(defpackage.yhy yhyVar, org.xml.sax.Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String strTrim = attributes.getValue(i).trim();
            int iOrdinal = defpackage.yjn.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal != 73) {
                switch (iOrdinal) {
                    case 52:
                        defpackage.yjp yjpVar = new defpackage.yjp(strTrim);
                        java.util.HashSet hashSet = new java.util.HashSet();
                        while (!yjpVar.m()) {
                            java.lang.String strI = yjpVar.i(' ');
                            if (strI.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(strI.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            yjpVar.j();
                        }
                        yhyVar.i(hashSet);
                        break;
                    case 53:
                        yhyVar.h(strTrim);
                        break;
                    case 54:
                        defpackage.yjp yjpVar2 = new defpackage.yjp(strTrim);
                        java.util.HashSet hashSet2 = new java.util.HashSet();
                        while (!yjpVar2.m()) {
                            hashSet2.add(yjpVar2.i(' '));
                            yjpVar2.j();
                        }
                        yhyVar.k(hashSet2);
                        break;
                    case 55:
                        java.util.List listM = m(strTrim);
                        yhyVar.j(listM != null ? new java.util.HashSet(listM) : new java.util.HashSet(0));
                        break;
                }
            } else {
                defpackage.yjp yjpVar3 = new defpackage.yjp(strTrim);
                java.util.HashSet hashSet3 = new java.util.HashSet();
                while (!yjpVar3.m()) {
                    java.lang.String strI2 = yjpVar3.i(' ');
                    int iIndexOf = strI2.indexOf(45);
                    if (iIndexOf != -1) {
                        strI2 = strI2.substring(0, iIndexOf);
                    }
                    hashSet3.add(new java.util.Locale(strI2, "", "").getLanguage());
                    yjpVar3.j();
                }
                yhyVar.l(hashSet3);
            }
        }
    }

    public final defpackage.yiw b(java.io.InputStream inputStream) {
        if (!inputStream.markSupported()) {
            inputStream = new java.io.BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i == 35615) {
                inputStream = new java.util.zip.GZIPInputStream(inputStream);
            }
        } catch (java.io.IOException unused) {
        }
        javax.xml.parsers.SAXParserFactory sAXParserFactoryNewInstance = javax.xml.parsers.SAXParserFactory.newInstance();
        sAXParserFactoryNewInstance.setNamespaceAware(true);
        try {
            try {
                try {
                    org.xml.sax.XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
                    xMLReader.setContentHandler(this);
                    xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", this);
                    xMLReader.parse(new org.xml.sax.InputSource(inputStream));
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused2) {
                        android.util.Log.e("SVGParser", "Exception thrown closing input stream");
                    }
                    return this.a;
                } catch (java.lang.Throwable th) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused3) {
                        android.util.Log.e("SVGParser", "Exception thrown closing input stream");
                    }
                    throw th;
                }
            } catch (javax.xml.parsers.ParserConfigurationException e) {
                throw new defpackage.yji("XML Parser problem", e);
            }
        } catch (java.io.IOException e2) {
            throw new defpackage.yji("File error", e2);
        } catch (org.xml.sax.SAXException e3) {
            throw new defpackage.yji("SVG parse error: " + e3.getMessage(), e3);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        if (this.c) {
            return;
        }
        if (this.e) {
            java.lang.StringBuilder sb = this.g;
            if (sb == null) {
                sb = new java.lang.StringBuilder(i2);
                this.g = sb;
            }
            sb.append(cArr, i, i2);
            return;
        }
        if (this.h) {
            java.lang.StringBuilder sb2 = this.i;
            if (sb2 == null) {
                sb2 = new java.lang.StringBuilder(i2);
                this.i = sb2;
            }
            sb2.append(cArr, i, i2);
            return;
        }
        defpackage.yib yibVar = this.b;
        if (yibVar instanceof defpackage.yiq) {
            defpackage.yhz yhzVar = (defpackage.yhz) yibVar;
            int size = yhzVar.i.size();
            defpackage.yif yifVar = size == 0 ? null : (defpackage.yif) yhzVar.i.get(size - 1);
            if (!(yifVar instanceof defpackage.yit)) {
                ((defpackage.yhz) this.b).b(new defpackage.yit(new java.lang.String(cArr, i, i2)));
                return;
            }
            defpackage.yit yitVar = (defpackage.yit) yifVar;
            yitVar.a = java.lang.String.valueOf(yitVar.a).concat(new java.lang.String(cArr, i, i2));
        }
    }

    @Override // org.xml.sax.ext.DefaultHandler2, org.xml.sax.ext.LexicalHandler
    public final void comment(char[] cArr, int i, int i2) {
        if (this.c || !this.h) {
            return;
        }
        java.lang.StringBuilder sb = this.i;
        if (sb == null) {
            sb = new java.lang.StringBuilder(i2);
            this.i = sb;
        }
        sb.append(cArr, i, i2);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(java.lang.String str, java.lang.String str2, java.lang.String str3) throws org.xml.sax.SAXException {
        if (this.c) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                this.c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            switch (defpackage.yjo.a(str2).ordinal()) {
                case 0:
                case 3:
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                case 17:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 25:
                case 28:
                case 29:
                case 30:
                    this.b = ((defpackage.yif) this.b).u;
                    break;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                case 26:
                    this.e = false;
                    defpackage.yjo yjoVar = this.f;
                    if (yjoVar == defpackage.yjo.A || yjoVar == defpackage.yjo.f) {
                        this.g.toString();
                    }
                    this.g.setLength(0);
                    break;
                case 21:
                    java.lang.StringBuilder sb = this.i;
                    if (sb != null) {
                        this.h = false;
                        java.lang.String string = sb.toString();
                        defpackage.ygq ygqVar = new defpackage.ygq(defpackage.ygl.h);
                        defpackage.yiw yiwVar = this.a;
                        defpackage.yjp yjpVar = new defpackage.yjp(string, null);
                        yjpVar.j();
                        yiwVar.c.a(ygqVar.d(yjpVar));
                        this.i.setLength(0);
                    }
                    break;
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() {
        this.a = new defpackage.yiw();
    }

    /* JADX WARN: Code duplicated, block: B:428:0x08eb  */
    /* JADX WARN: Code duplicated, block: B:430:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:591:0x0904 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:0x08f9 A[SYNTHETIC] */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(java.lang.String str, java.lang.String str2, java.lang.String str3, org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
        float f;
        int iIntValue;
        float fA;
        float fA2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        boolean z;
        if (this.c) {
            this.d++;
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            defpackage.yjo yjoVarA = defpackage.yjo.a(str2);
            int i = 77;
            int i2 = 0;
            float f7 = 0.0f;
            switch (yjoVarA.ordinal()) {
                case 0:
                    defpackage.yhx yhxVar = new defpackage.yhx();
                    yhxVar.t = this.a;
                    yhxVar.u = this.b;
                    A(yhxVar, attributes);
                    C(yhxVar, attributes);
                    z(yhxVar, attributes);
                    E(yhxVar, attributes);
                    while (i2 < attributes.getLength()) {
                        java.lang.String strTrim = attributes.getValue(i2).trim();
                        int iOrdinal = defpackage.yjn.a(attributes.getLocalName(i2)).ordinal();
                        if (iOrdinal != 25) {
                            switch (iOrdinal) {
                                case 81:
                                    yhxVar.c = a(strTrim);
                                    if (yhxVar.c.e()) {
                                        throw new org.xml.sax.SAXException("Invalid <svg> element. width cannot be negative");
                                    }
                                    break;
                                    break;
                                case 82:
                                    yhxVar.a = a(strTrim);
                                    break;
                                case 83:
                                    yhxVar.b = a(strTrim);
                                    break;
                            }
                        } else {
                            yhxVar.d = a(strTrim);
                            if (yhxVar.d.e()) {
                                throw new org.xml.sax.SAXException("Invalid <svg> element. height cannot be negative");
                            }
                        }
                        i2++;
                    }
                    defpackage.yib yibVar = this.b;
                    if (yibVar == null) {
                        this.a.a = yhxVar;
                    } else {
                        yibVar.b(yhxVar);
                    }
                    this.b = yhxVar;
                    return;
                case 1:
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    s(attributes);
                    return;
                case 2:
                    o(attributes);
                    return;
                case 3:
                    p(attributes);
                    return;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    q(attributes);
                    return;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                case 26:
                    this.e = true;
                    this.f = yjoVarA;
                    return;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    r(attributes);
                    return;
                case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                    t(attributes);
                    return;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                    defpackage.yib yibVar2 = this.b;
                    if (yibVar2 == null) {
                        throw new org.xml.sax.SAXException("Invalid document. Root element must be <svg>");
                    }
                    defpackage.yhi yhiVar = new defpackage.yhi();
                    yhiVar.t = this.a;
                    yhiVar.u = yibVar2;
                    A(yhiVar, attributes);
                    C(yhiVar, attributes);
                    I(yhiVar, attributes);
                    z(yhiVar, attributes);
                    while (i2 < attributes.getLength()) {
                        java.lang.String strTrim2 = attributes.getValue(i2).trim();
                        switch (defpackage.yjn.a(attributes.getLocalName(i2)).ordinal()) {
                            case 84:
                                yhiVar.a = a(strTrim2);
                                break;
                            case 85:
                                yhiVar.b = a(strTrim2);
                                break;
                            case 86:
                                yhiVar.c = a(strTrim2);
                                break;
                            case 87:
                                yhiVar.d = a(strTrim2);
                                break;
                        }
                        i2++;
                    }
                    this.b.b(yhiVar);
                    return;
                case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                    if (this.b == null) {
                        throw new org.xml.sax.SAXException("Invalid document. Root element must be <svg>");
                    }
                    defpackage.yie yieVar = new defpackage.yie();
                    yieVar.t = this.a;
                    yieVar.u = this.b;
                    A(yieVar, attributes);
                    C(yieVar, attributes);
                    H(yieVar, attributes);
                    while (i2 < attributes.getLength()) {
                        java.lang.String strTrim3 = attributes.getValue(i2).trim();
                        switch (defpackage.yjn.a(attributes.getLocalName(i2)).ordinal()) {
                            case 84:
                                yieVar.f = a(strTrim3);
                                break;
                            case 85:
                                yieVar.g = a(strTrim3);
                                break;
                            case 86:
                                yieVar.h = a(strTrim3);
                                break;
                            case 87:
                                yieVar.i = a(strTrim3);
                                break;
                        }
                        i2++;
                    }
                    this.b.b(yieVar);
                    this.b = yieVar;
                    return;
                case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                    u(attributes);
                    return;
                case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                    v(attributes);
                    return;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                    defpackage.yib yibVar3 = this.b;
                    if (yibVar3 == null) {
                        throw new org.xml.sax.SAXException("Invalid document. Root element must be <svg>");
                    }
                    defpackage.yhn yhnVar = new defpackage.yhn();
                    yhnVar.t = this.a;
                    yhnVar.u = yibVar3;
                    A(yhnVar, attributes);
                    C(yhnVar, attributes);
                    I(yhnVar, attributes);
                    z(yhnVar, attributes);
                    while (i2 < attributes.getLength()) {
                        java.lang.String strTrim4 = attributes.getValue(i2).trim();
                        int iOrdinal2 = defpackage.yjn.a(attributes.getLocalName(i2)).ordinal();
                        if (iOrdinal2 != 13) {
                            if (iOrdinal2 == 43) {
                                yhnVar.b = java.lang.Float.valueOf(d(strTrim4));
                                if (yhnVar.b.floatValue() < f7) {
                                    throw new org.xml.sax.SAXException("Invalid <path> element. pathLength cannot be negative");
                                }
                            }
                            f = f7;
                        } else {
                            defpackage.yjp yjpVar = new defpackage.yjp(strTrim4);
                            defpackage.yho yhoVar = new defpackage.yho();
                            if (!yjpVar.m() && ((iIntValue = yjpVar.g().intValue()) == i || iIntValue == 109)) {
                                float fC = f7;
                                float f8 = fC;
                                float fA3 = f8;
                                float f9 = fA3;
                                float f10 = f9;
                                float f11 = f10;
                                while (true) {
                                    yjpVar.j();
                                    char c = (char) iIntValue;
                                    f = f7;
                                    switch (iIntValue) {
                                        case 65:
                                        case 97:
                                            float f12 = fC;
                                            float fB = yjpVar.b();
                                            float fA4 = yjpVar.a(fB);
                                            float fA5 = yjpVar.a(fA4);
                                            java.lang.Boolean boolF = yjpVar.f(java.lang.Float.valueOf(fA5));
                                            java.lang.Boolean boolF2 = yjpVar.f(boolF);
                                            if (boolF2 == null) {
                                                fA = Float.NaN;
                                                fC = Float.NaN;
                                            } else {
                                                fC = yjpVar.c();
                                                fA = yjpVar.a(fC);
                                            }
                                            if (java.lang.Float.isNaN(fA) || fB < f || fA4 < f) {
                                                android.util.Log.e("SVGParser", hgb.m(c, "Bad path coords for ", " path segment"));
                                            } else {
                                                if (iIntValue == 97) {
                                                    fC += f12;
                                                    fA += f8;
                                                    iIntValue = 97;
                                                }
                                                yhoVar.b(fB, fA4, fA5, boolF.booleanValue(), boolF2.booleanValue(), fC, fA);
                                                f9 = fC;
                                                f8 = fA;
                                                fA3 = f8;
                                                yjpVar.o();
                                                if (!yjpVar.m()) {
                                                    if (yjpVar.n()) {
                                                        iIntValue = yjpVar.g().intValue();
                                                    }
                                                    f7 = f;
                                                }
                                            }
                                            break;
                                        case 67:
                                        case 99:
                                            float fB2 = yjpVar.b();
                                            float fA6 = yjpVar.a(fB2);
                                            float fA7 = yjpVar.a(fA6);
                                            float fA8 = yjpVar.a(fA7);
                                            float f13 = fC;
                                            float fA9 = yjpVar.a(fA8);
                                            fA2 = yjpVar.a(fA9);
                                            if (java.lang.Float.isNaN(fA2)) {
                                                android.util.Log.e("SVGParser", hgb.m(c, "Bad path coords for ", " path segment"));
                                            } else {
                                                if (iIntValue == 99) {
                                                    fA9 += f13;
                                                    fA2 += f8;
                                                    float f14 = fB2 + f13;
                                                    fA8 += f8;
                                                    f2 = fA7 + f13;
                                                    f3 = fA6 + f8;
                                                    f4 = f14;
                                                    iIntValue = 99;
                                                } else {
                                                    f2 = fA7;
                                                    f3 = fA6;
                                                    f4 = fB2;
                                                }
                                                f5 = fA8;
                                                f6 = fA9;
                                                yhoVar.d(f4, f3, f2, f5, f6, fA2);
                                                f9 = f2;
                                                fA3 = f5;
                                                fC = f6;
                                                f8 = fA2;
                                                yjpVar.o();
                                                if (!yjpVar.m()) {
                                                    if (yjpVar.n()) {
                                                        iIntValue = yjpVar.g().intValue();
                                                    }
                                                    f7 = f;
                                                }
                                            }
                                            break;
                                        case 72:
                                        case 104:
                                            float fB3 = yjpVar.b();
                                            if (java.lang.Float.isNaN(fB3)) {
                                                android.util.Log.e("SVGParser", hgb.m(c, "Bad path coords for ", " path segment"));
                                            } else {
                                                if (iIntValue == 104) {
                                                    fB3 += fC;
                                                    iIntValue = 104;
                                                }
                                                fC = fB3;
                                                yhoVar.f(fC, f8);
                                                f9 = fC;
                                                yjpVar.o();
                                                if (!yjpVar.m()) {
                                                    if (yjpVar.n()) {
                                                        iIntValue = yjpVar.g().intValue();
                                                    }
                                                    f7 = f;
                                                }
                                            }
                                            break;
                                        case 76:
                                        case 108:
                                            float fB4 = yjpVar.b();
                                            float fA10 = yjpVar.a(fB4);
                                            if (java.lang.Float.isNaN(fA10)) {
                                                android.util.Log.e("SVGParser", hgb.m(c, "Bad path coords for ", " path segment"));
                                            } else {
                                                if (iIntValue == 108) {
                                                    fB4 += fC;
                                                    fA10 += f8;
                                                    iIntValue = 108;
                                                }
                                                fC = fB4;
                                                f8 = fA10;
                                                yhoVar.f(fC, f8);
                                                fA3 = f8;
                                                f9 = fC;
                                                yjpVar.o();
                                                if (!yjpVar.m()) {
                                                    if (yjpVar.n()) {
                                                        iIntValue = yjpVar.g().intValue();
                                                    }
                                                    f7 = f;
                                                }
                                            }
                                            break;
                                        case 77:
                                        case 109:
                                            float fB5 = yjpVar.b();
                                            float fA11 = yjpVar.a(fB5);
                                            if (java.lang.Float.isNaN(fA11)) {
                                                android.util.Log.e("SVGParser", hgb.m(c, "Bad path coords for ", " path segment"));
                                            } else {
                                                if (iIntValue == 109) {
                                                    if (yhoVar.a != 0) {
                                                        fB5 += fC;
                                                        fA11 += f8;
                                                    }
                                                    fC = fB5;
                                                    f8 = fA11;
                                                    iIntValue = 109;
                                                } else {
                                                    fC = fB5;
                                                    f8 = fA11;
                                                }
                                                yhoVar.g(fC, f8);
                                                f11 = fC;
                                                fA3 = f8;
                                                f10 = fA3;
                                                iIntValue = iIntValue == 109 ? 108 : 76;
                                                f9 = f11;
                                                yjpVar.o();
                                                if (!yjpVar.m()) {
                                                    if (yjpVar.n()) {
                                                        iIntValue = yjpVar.g().intValue();
                                                    }
                                                    f7 = f;
                                                }
                                            }
                                            break;
                                        case 81:
                                        case 113:
                                            float fB6 = yjpVar.b();
                                            fA3 = yjpVar.a(fB6);
                                            float fA12 = yjpVar.a(fA3);
                                            float fA13 = yjpVar.a(fA12);
                                            if (java.lang.Float.isNaN(fA13)) {
                                                android.util.Log.e("SVGParser", hgb.m(c, "Bad path coords for ", " path segment"));
                                            } else {
                                                if (iIntValue == 113) {
                                                    fA12 += fC;
                                                    fA13 += f8;
                                                    fB6 += fC;
                                                    fA3 += f8;
                                                    iIntValue = 113;
                                                }
                                                fC = fA12;
                                                f8 = fA13;
                                                f9 = fB6;
                                                yhoVar.h(f9, fA3, fC, f8);
                                                yjpVar.o();
                                                if (!yjpVar.m()) {
                                                    if (yjpVar.n()) {
                                                        iIntValue = yjpVar.g().intValue();
                                                    }
                                                    f7 = f;
                                                }
                                            }
                                            break;
                                        case 83:
                                        case 115:
                                            float f15 = (f8 + f8) - fA3;
                                            float f16 = (fC + fC) - f9;
                                            float fB7 = yjpVar.b();
                                            float fA14 = yjpVar.a(fB7);
                                            float fA15 = yjpVar.a(fA14);
                                            fA2 = yjpVar.a(fA15);
                                            if (java.lang.Float.isNaN(fA2)) {
                                                android.util.Log.e("SVGParser", hgb.m(c, "Bad path coords for ", " path segment"));
                                            } else {
                                                if (iIntValue == 115) {
                                                    fA15 += fC;
                                                    fA2 += f8;
                                                    fA14 += f8;
                                                    f2 = fB7 + fC;
                                                    iIntValue = 115;
                                                } else {
                                                    f2 = fB7;
                                                }
                                                f5 = fA14;
                                                f6 = fA15;
                                                yhoVar.d(f16, f15, f2, f5, f6, fA2);
                                                f9 = f2;
                                                fA3 = f5;
                                                fC = f6;
                                                f8 = fA2;
                                                yjpVar.o();
                                                if (!yjpVar.m()) {
                                                    if (yjpVar.n()) {
                                                        iIntValue = yjpVar.g().intValue();
                                                    }
                                                    f7 = f;
                                                }
                                            }
                                            break;
                                        case 84:
                                        case 116:
                                            fA3 = (f8 + f8) - fA3;
                                            f9 = (fC + fC) - f9;
                                            float fB8 = yjpVar.b();
                                            float fA16 = yjpVar.a(fB8);
                                            if (java.lang.Float.isNaN(fA16)) {
                                                android.util.Log.e("SVGParser", hgb.m(c, "Bad path coords for ", " path segment"));
                                            } else {
                                                if (iIntValue == 116) {
                                                    fB8 += fC;
                                                    fA16 += f8;
                                                    iIntValue = 116;
                                                }
                                                fC = fB8;
                                                f8 = fA16;
                                                yhoVar.h(f9, fA3, fC, f8);
                                                yjpVar.o();
                                                if (!yjpVar.m()) {
                                                    if (yjpVar.n()) {
                                                        iIntValue = yjpVar.g().intValue();
                                                    }
                                                    f7 = f;
                                                }
                                            }
                                            break;
                                        case 86:
                                        case 118:
                                            float fB9 = yjpVar.b();
                                            if (java.lang.Float.isNaN(fB9)) {
                                                android.util.Log.e("SVGParser", hgb.m(c, "Bad path coords for ", " path segment"));
                                            } else {
                                                if (iIntValue == 118) {
                                                    fB9 += f8;
                                                    iIntValue = 118;
                                                }
                                                f8 = fB9;
                                                yhoVar.f(fC, f8);
                                                fA3 = f8;
                                                yjpVar.o();
                                                if (!yjpVar.m()) {
                                                    if (yjpVar.n()) {
                                                        iIntValue = yjpVar.g().intValue();
                                                    }
                                                    f7 = f;
                                                }
                                            }
                                            break;
                                        case 90:
                                        case 122:
                                            yhoVar.a((byte) 8);
                                            f8 = f10;
                                            fA3 = f8;
                                            fC = f11;
                                            f9 = fC;
                                            yjpVar.o();
                                            if (!yjpVar.m()) {
                                                if (yjpVar.n()) {
                                                    iIntValue = yjpVar.g().intValue();
                                                }
                                                f7 = f;
                                            }
                                            break;
                                    }
                                }
                            } else {
                                f = f7;
                            }
                            yhnVar.a = yhoVar;
                        }
                        i2++;
                        f7 = f;
                        i = 77;
                    }
                    this.b.b(yhnVar);
                    return;
                case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                    if (this.b == null) {
                        throw new org.xml.sax.SAXException("Invalid document. Root element must be <svg>");
                    }
                    defpackage.yhq yhqVar = new defpackage.yhq();
                    yhqVar.t = this.a;
                    yhqVar.u = this.b;
                    A(yhqVar, attributes);
                    C(yhqVar, attributes);
                    z(yhqVar, attributes);
                    E(yhqVar, attributes);
                    while (i2 < attributes.getLength()) {
                        java.lang.String strTrim5 = attributes.getValue(i2).trim();
                        int iOrdinal3 = defpackage.yjn.a(attributes.getLocalName(i2)).ordinal();
                        if (iOrdinal3 == 25) {
                            yhqVar.g = a(strTrim5);
                            if (yhqVar.g.e()) {
                                throw new org.xml.sax.SAXException("Invalid <pattern> element. height cannot be negative");
                            }
                        } else if (iOrdinal3 != 26) {
                            switch (iOrdinal3) {
                                case 44:
                                    if (!"objectBoundingBox".equals(strTrim5)) {
                                        if (!"userSpaceOnUse".equals(strTrim5)) {
                                            throw new org.xml.sax.SAXException("Invalid value for attribute patternContentUnits");
                                        }
                                        yhqVar.b = java.lang.Boolean.TRUE;
                                    } else {
                                        yhqVar.b = java.lang.Boolean.FALSE;
                                    }
                                    break;
                                case 45:
                                    yhqVar.c = G(strTrim5);
                                    break;
                                case 46:
                                    if (!"objectBoundingBox".equals(strTrim5)) {
                                        if (!"userSpaceOnUse".equals(strTrim5)) {
                                            throw new org.xml.sax.SAXException("Invalid value for attribute patternUnits");
                                        }
                                        yhqVar.a = java.lang.Boolean.TRUE;
                                    } else {
                                        yhqVar.a = java.lang.Boolean.FALSE;
                                    }
                                    break;
                                default:
                                    switch (iOrdinal3) {
                                        case 81:
                                            yhqVar.f = a(strTrim5);
                                            if (yhqVar.f.e()) {
                                                throw new org.xml.sax.SAXException("Invalid <pattern> element. width cannot be negative");
                                            }
                                            break;
                                            break;
                                        case 82:
                                            yhqVar.d = a(strTrim5);
                                            break;
                                        case 83:
                                            yhqVar.e = a(strTrim5);
                                            break;
                                    }
                                    break;
                            }
                        } else if ("http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                            yhqVar.h = strTrim5;
                        }
                        i2++;
                    }
                    this.b.b(yhqVar);
                    this.b = yhqVar;
                    return;
                case 15:
                    defpackage.yib yibVar4 = this.b;
                    if (yibVar4 == null) {
                        throw new org.xml.sax.SAXException("Invalid document. Root element must be <svg>");
                    }
                    defpackage.yhs yhsVar = new defpackage.yhs();
                    yhsVar.t = this.a;
                    yhsVar.u = yibVar4;
                    A(yhsVar, attributes);
                    C(yhsVar, attributes);
                    I(yhsVar, attributes);
                    z(yhsVar, attributes);
                    B(yhsVar, attributes, "polygon");
                    this.b.b(yhsVar);
                    return;
                case 16:
                    defpackage.yib yibVar5 = this.b;
                    if (yibVar5 == null) {
                        throw new org.xml.sax.SAXException("Invalid document. Root element must be <svg>");
                    }
                    defpackage.yhr yhrVar = new defpackage.yhr();
                    yhrVar.t = this.a;
                    yhrVar.u = yibVar5;
                    A(yhrVar, attributes);
                    C(yhrVar, attributes);
                    I(yhrVar, attributes);
                    z(yhrVar, attributes);
                    B(yhrVar, attributes, "polyline");
                    this.b.b(yhrVar);
                    return;
                case 17:
                    if (this.b == null) {
                        throw new org.xml.sax.SAXException("Invalid document. Root element must be <svg>");
                    }
                    defpackage.yii yiiVar = new defpackage.yii();
                    yiiVar.t = this.a;
                    yiiVar.u = this.b;
                    A(yiiVar, attributes);
                    C(yiiVar, attributes);
                    H(yiiVar, attributes);
                    while (i2 < attributes.getLength()) {
                        java.lang.String strTrim6 = attributes.getValue(i2).trim();
                        int iOrdinal4 = defpackage.yjn.a(attributes.getLocalName(i2)).ordinal();
                        if (iOrdinal4 == 6) {
                            yiiVar.f = a(strTrim6);
                        } else if (iOrdinal4 == 7) {
                            yiiVar.g = a(strTrim6);
                        } else if (iOrdinal4 == 11) {
                            yiiVar.i = a(strTrim6);
                        } else if (iOrdinal4 == 12) {
                            yiiVar.j = a(strTrim6);
                        } else if (iOrdinal4 == 49) {
                            yiiVar.h = a(strTrim6);
                            if (yiiVar.h.e()) {
                                throw new org.xml.sax.SAXException("Invalid <radialGradient> element. r cannot be negative");
                            }
                        } else {
                            continue;
                        }
                        i2++;
                    }
                    this.b.b(yiiVar);
                    this.b = yiiVar;
                    return;
                case 18:
                    defpackage.yib yibVar6 = this.b;
                    if (yibVar6 == null) {
                        throw new org.xml.sax.SAXException("Invalid document. Root element must be <svg>");
                    }
                    defpackage.yht yhtVar = new defpackage.yht();
                    yhtVar.t = this.a;
                    yhtVar.u = yibVar6;
                    A(yhtVar, attributes);
                    C(yhtVar, attributes);
                    I(yhtVar, attributes);
                    z(yhtVar, attributes);
                    while (i2 < attributes.getLength()) {
                        java.lang.String strTrim7 = attributes.getValue(i2).trim();
                        int iOrdinal5 = defpackage.yjn.a(attributes.getLocalName(i2)).ordinal();
                        if (iOrdinal5 == 25) {
                            yhtVar.d = a(strTrim7);
                            if (yhtVar.d.e()) {
                                throw new org.xml.sax.SAXException("Invalid <rect> element. height cannot be negative");
                            }
                        } else if (iOrdinal5 == 56) {
                            yhtVar.f = a(strTrim7);
                            if (yhtVar.f.e()) {
                                throw new org.xml.sax.SAXException("Invalid <rect> element. rx cannot be negative");
                            }
                        } else if (iOrdinal5 != 57) {
                            switch (iOrdinal5) {
                                case 81:
                                    yhtVar.c = a(strTrim7);
                                    if (yhtVar.c.e()) {
                                        throw new org.xml.sax.SAXException("Invalid <rect> element. width cannot be negative");
                                    }
                                    break;
                                    break;
                                case 82:
                                    yhtVar.a = a(strTrim7);
                                    break;
                                case 83:
                                    yhtVar.b = a(strTrim7);
                                    break;
                            }
                        } else {
                            yhtVar.g = a(strTrim7);
                            if (yhtVar.g.e()) {
                                throw new org.xml.sax.SAXException("Invalid <rect> element. ry cannot be negative");
                            }
                        }
                        i2++;
                    }
                    this.b.b(yhtVar);
                    return;
                case 19:
                    defpackage.yib yibVar7 = this.b;
                    if (yibVar7 == null) {
                        throw new org.xml.sax.SAXException("Invalid document. Root element must be <svg>");
                    }
                    defpackage.yhu yhuVar = new defpackage.yhu();
                    yhuVar.t = this.a;
                    yhuVar.u = yibVar7;
                    A(yhuVar, attributes);
                    C(yhuVar, attributes);
                    this.b.b(yhuVar);
                    this.b = yhuVar;
                    return;
                case 20:
                    defpackage.yib yibVar8 = this.b;
                    if (yibVar8 == null) {
                        throw new org.xml.sax.SAXException("Invalid document. Root element must be <svg>");
                    }
                    if (!(yibVar8 instanceof defpackage.yhc)) {
                        throw new org.xml.sax.SAXException("Invalid document. <stop> elements are only valid inside <linearGradiant> or <radialGradient> elements.");
                    }
                    defpackage.yhv yhvVar = new defpackage.yhv();
                    yhvVar.t = this.a;
                    yhvVar.u = yibVar8;
                    A(yhvVar, attributes);
                    C(yhvVar, attributes);
                    for (int i3 = 0; i3 < attributes.getLength(); i3++) {
                        java.lang.String strTrim8 = attributes.getValue(i3).trim();
                        if (defpackage.yjn.a(attributes.getLocalName(i3)).ordinal() == 39) {
                            if (strTrim8.length() == 0) {
                                throw new org.xml.sax.SAXException("Invalid offset value in <stop> (empty string)");
                            }
                            int length = strTrim8.length();
                            if (strTrim8.charAt(strTrim8.length() - 1) == '%') {
                                length--;
                                z = true;
                            } else {
                                z = false;
                            }
                            try {
                                float F = F(strTrim8, length);
                                float f17 = 100.0f;
                                if (z) {
                                    F /= 100.0f;
                                }
                                if (F < 0.0f) {
                                    f17 = 0.0f;
                                } else if (F <= 100.0f) {
                                    f17 = F;
                                }
                                yhvVar.a = java.lang.Float.valueOf(f17);
                            } catch (java.lang.NumberFormatException e) {
                                throw new org.xml.sax.SAXException("Invalid offset value in <stop>: ".concat(java.lang.String.valueOf(strTrim8)), e);
                            }
                        }
                    }
                    this.b.b(yhvVar);
                    this.b = yhvVar;
                    return;
                case 21:
                    if (this.b == null) {
                        throw new org.xml.sax.SAXException("Invalid document. Root element must be <svg>");
                    }
                    java.lang.String str4 = "all";
                    boolean zEquals = true;
                    while (i2 < attributes.getLength()) {
                        java.lang.String strTrim9 = attributes.getValue(i2).trim();
                        int iOrdinal6 = defpackage.yjn.a(attributes.getLocalName(i2)).ordinal();
                        if (iOrdinal6 == 38) {
                            str4 = strTrim9;
                        } else if (iOrdinal6 == 77) {
                            zEquals = strTrim9.equals("text/css");
                        }
                        i2++;
                    }
                    if (zEquals) {
                        defpackage.ygl yglVar = defpackage.ygl.h;
                        defpackage.yjp yjpVar2 = new defpackage.yjp(str4, null);
                        yjpVar2.j();
                        java.util.List listE = defpackage.ygq.e(yjpVar2);
                        if (!yjpVar2.m()) {
                            throw new org.xml.sax.SAXException("Invalid @media type list");
                        }
                        if (defpackage.ygq.a(listE, yglVar)) {
                            this.h = true;
                            return;
                        }
                    }
                    this.c = true;
                    this.d = 1;
                    return;
                case 22:
                    if (this.b == null) {
                        throw new org.xml.sax.SAXException("Invalid document. Root element must be <svg>");
                    }
                    defpackage.yik yikVar = new defpackage.yik();
                    yikVar.t = this.a;
                    yikVar.u = this.b;
                    A(yikVar, attributes);
                    C(yikVar, attributes);
                    I(yikVar, attributes);
                    z(yikVar, attributes);
                    this.b.b(yikVar);
                    this.b = yikVar;
                    return;
                case 23:
                    if (this.b == null) {
                        throw new org.xml.sax.SAXException("Invalid document. Root element must be <svg>");
                    }
                    defpackage.yil yilVar = new defpackage.yil();
                    yilVar.t = this.a;
                    yilVar.u = this.b;
                    A(yilVar, attributes);
                    C(yilVar, attributes);
                    z(yilVar, attributes);
                    E(yilVar, attributes);
                    this.b.b(yilVar);
                    this.b = yilVar;
                    return;
                case 24:
                    if (this.b == null) {
                        throw new org.xml.sax.SAXException("Invalid document. Root element must be <svg>");
                    }
                    defpackage.yio yioVar = new defpackage.yio();
                    yioVar.t = this.a;
                    yioVar.u = this.b;
                    A(yioVar, attributes);
                    C(yioVar, attributes);
                    I(yioVar, attributes);
                    z(yioVar, attributes);
                    D(yioVar, attributes);
                    this.b.b(yioVar);
                    this.b = yioVar;
                    return;
                case 25:
                    if (this.b == null) {
                        throw new org.xml.sax.SAXException("Invalid document. Root element must be <svg>");
                    }
                    defpackage.yir yirVar = new defpackage.yir();
                    yirVar.t = this.a;
                    yirVar.u = this.b;
                    A(yirVar, attributes);
                    C(yirVar, attributes);
                    z(yirVar, attributes);
                    while (i2 < attributes.getLength()) {
                        java.lang.String strTrim10 = attributes.getValue(i2).trim();
                        int iOrdinal7 = defpackage.yjn.a(attributes.getLocalName(i2)).ordinal();
                        if (iOrdinal7 != 26) {
                            if (iOrdinal7 == 61) {
                                yirVar.b = a(strTrim10);
                            }
                        } else if ("http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                            yirVar.a = strTrim10;
                        }
                        i2++;
                    }
                    this.b.b(yirVar);
                    this.b = yirVar;
                    defpackage.yib yibVar9 = yirVar.u;
                    if (yibVar9 instanceof defpackage.yio) {
                        yirVar.c = (defpackage.yio) yibVar9;
                        return;
                    } else {
                        yirVar.c = ((defpackage.yip) yibVar9).m();
                        return;
                    }
                case 27:
                    defpackage.yib yibVar10 = this.b;
                    if (yibVar10 == null) {
                        throw new org.xml.sax.SAXException("Invalid document. Root element must be <svg>");
                    }
                    if (!(yibVar10 instanceof defpackage.yiq)) {
                        throw new org.xml.sax.SAXException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                    }
                    defpackage.yim yimVar = new defpackage.yim();
                    yimVar.t = this.a;
                    yimVar.u = this.b;
                    A(yimVar, attributes);
                    C(yimVar, attributes);
                    z(yimVar, attributes);
                    while (i2 < attributes.getLength()) {
                        java.lang.String strTrim11 = attributes.getValue(i2).trim();
                        if (defpackage.yjn.a(attributes.getLocalName(i2)).ordinal() == 26 && "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                            yimVar.a = strTrim11;
                        }
                        i2++;
                    }
                    this.b.b(yimVar);
                    defpackage.yib yibVar11 = yimVar.u;
                    if (yibVar11 instanceof defpackage.yio) {
                        yimVar.b = (defpackage.yio) yibVar11;
                        return;
                    } else {
                        yimVar.b = ((defpackage.yip) yibVar11).m();
                        return;
                    }
                case 28:
                    defpackage.yib yibVar12 = this.b;
                    if (yibVar12 == null) {
                        throw new org.xml.sax.SAXException("Invalid document. Root element must be <svg>");
                    }
                    if (!(yibVar12 instanceof defpackage.yiq)) {
                        throw new org.xml.sax.SAXException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                    }
                    defpackage.yin yinVar = new defpackage.yin();
                    yinVar.t = this.a;
                    yinVar.u = this.b;
                    A(yinVar, attributes);
                    C(yinVar, attributes);
                    z(yinVar, attributes);
                    D(yinVar, attributes);
                    this.b.b(yinVar);
                    this.b = yinVar;
                    defpackage.yib yibVar13 = yinVar.u;
                    if (yibVar13 instanceof defpackage.yio) {
                        yinVar.a = (defpackage.yio) yibVar13;
                        return;
                    } else {
                        yinVar.a = ((defpackage.yip) yibVar13).m();
                        return;
                    }
                case 29:
                    if (this.b == null) {
                        throw new org.xml.sax.SAXException("Invalid document. Root element must be <svg>");
                    }
                    defpackage.yiu yiuVar = new defpackage.yiu();
                    yiuVar.t = this.a;
                    yiuVar.u = this.b;
                    A(yiuVar, attributes);
                    C(yiuVar, attributes);
                    I(yiuVar, attributes);
                    z(yiuVar, attributes);
                    while (i2 < attributes.getLength()) {
                        java.lang.String strTrim12 = attributes.getValue(i2).trim();
                        int iOrdinal8 = defpackage.yjn.a(attributes.getLocalName(i2)).ordinal();
                        if (iOrdinal8 == 25) {
                            yiuVar.f = a(strTrim12);
                            if (yiuVar.f.e()) {
                                throw new org.xml.sax.SAXException("Invalid <use> element. height cannot be negative");
                            }
                        } else if (iOrdinal8 != 26) {
                            switch (iOrdinal8) {
                                case 81:
                                    yiuVar.e = a(strTrim12);
                                    if (yiuVar.e.e()) {
                                        throw new org.xml.sax.SAXException("Invalid <use> element. width cannot be negative");
                                    }
                                    break;
                                    break;
                                case 82:
                                    yiuVar.c = a(strTrim12);
                                    break;
                                case 83:
                                    yiuVar.d = a(strTrim12);
                                    break;
                            }
                        } else if ("http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                            yiuVar.a = strTrim12;
                        }
                        i2++;
                    }
                    this.b.b(yiuVar);
                    this.b = yiuVar;
                    return;
                case 30:
                    if (this.b == null) {
                        throw new org.xml.sax.SAXException("Invalid document. Root element must be <svg>");
                    }
                    defpackage.yiv yivVar = new defpackage.yiv();
                    yivVar.t = this.a;
                    yivVar.u = this.b;
                    A(yivVar, attributes);
                    z(yivVar, attributes);
                    E(yivVar, attributes);
                    this.b.b(yivVar);
                    this.b = yivVar;
                    return;
                default:
                    this.c = true;
                    this.d = 1;
                    return;
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
    }
}
