package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akfi {
    private static final defpackage.akft f;
    private static final java.util.regex.Pattern g;
    private static final java.util.regex.Pattern h;
    private static final java.util.regex.Pattern i;
    private final akfg q;
    private final defpackage.akft r;
    private defpackage.akft s;
    public java.lang.String a = "";
    private final java.lang.StringBuilder j = new java.lang.StringBuilder();
    private java.lang.String k = "";
    private final java.lang.StringBuilder l = new java.lang.StringBuilder();
    public final java.lang.StringBuilder b = new java.lang.StringBuilder();
    public boolean c = true;
    private boolean m = false;
    private boolean n = false;
    private boolean o = false;
    private final defpackage.akfx p = defpackage.akfx.h();
    private int t = 0;
    public int d = 0;
    public int e = 0;
    private final java.lang.StringBuilder u = new java.lang.StringBuilder();
    private boolean v = false;
    private java.lang.String w = "";
    private final java.lang.StringBuilder x = new java.lang.StringBuilder();
    private final java.util.List y = new java.util.ArrayList();
    private final ajyi z = new ajyi(64);

    static {
        akzx akzxVarM = defpackage.akft.a.m();
        akzxVarM.u();
        defpackage.akft akftVar = (defpackage.akft) akzxVarM.b;
        j$.util.Objects.requireNonNull("<ignored>");
        akftVar.b |= 131072;
        akftVar.o = "<ignored>";
        akzxVarM.u();
        defpackage.akft akftVar2 = (defpackage.akft) akzxVarM.b;
        j$.util.Objects.requireNonNull("NA");
        akftVar2.b |= 524288;
        akftVar2.q = "NA";
        f = (defpackage.akft) akzxVarM.p();
        g = java.util.regex.Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*\\$1[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*)*");
        h = java.util.regex.Pattern.compile("[- ]");
        i = java.util.regex.Pattern.compile("\u2008");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: akfm */
    public akfi(akfg akfgVar) throws akfm {
        this.q = akfgVar;
        defpackage.akft akftVarD = d(akfgVar);
        this.s = akftVarD;
        this.r = akftVarD;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: akfm */
    private final defpackage.akft d(akfg akfgVar) throws akfm {
        defpackage.akfx akfxVar = this.p;
        defpackage.akft akftVarF = akfxVar.f(akfxVar.c(akfxVar.b(akfgVar)));
        return akftVarF == null ? f : akftVarF;
    }

    private final java.lang.String e(java.lang.String str) {
        java.lang.StringBuilder sb = this.u;
        int length = sb.length();
        if (!this.v || length <= 0 || sb.charAt(length - 1) == ' ') {
            return sb.toString().concat(java.lang.String.valueOf(str));
        }
        return new java.lang.String(sb) + ' ' + str;
    }

    private final java.lang.String f() {
        java.lang.StringBuilder sb = this.x;
        if (sb.length() < 3) {
            return e(sb.toString());
        }
        java.lang.String string = sb.toString();
        for (defpackage.akfn akfnVar : (this.n && this.w.isEmpty() && this.s.w.size() > 0) ? this.s.w : this.s.v) {
            if (this.w.isEmpty() || !defpackage.akfx.o(akfnVar.f) || akfnVar.g || (akfnVar.b & 16) != 0) {
                if (!this.w.isEmpty() || this.n || defpackage.akfx.o(akfnVar.f) || akfnVar.g) {
                    if (g.matcher(akfnVar.d).matches()) {
                        this.y.add(akfnVar);
                    }
                }
            }
        }
        k(string);
        java.lang.String strA = a();
        if (strA.length() <= 0) {
            return n() ? h() : this.l.toString();
        }
        return strA;
    }

    private final java.lang.String g() {
        this.c = true;
        this.o = false;
        this.y.clear();
        this.t = 0;
        this.j.setLength(0);
        this.k = "";
        return f();
    }

    private final java.lang.String h() {
        java.lang.StringBuilder sb;
        java.lang.StringBuilder sb2 = this.x;
        int length = sb2.length();
        if (length > 0) {
            java.lang.String strI = "";
            for (int i2 = 0; i2 < length; i2++) {
                strI = i(sb2.charAt(i2));
            }
            if (this.c) {
                return e(strI);
            }
            sb = this.l;
        } else {
            sb = this.u;
        }
        return sb.toString();
    }

    private final java.lang.String i(char c) {
        java.util.regex.Pattern pattern = i;
        java.lang.StringBuilder sb = this.j;
        java.util.regex.Matcher matcher = pattern.matcher(sb);
        if (!matcher.find(this.t)) {
            if (this.y.size() == 1) {
                this.c = false;
            }
            this.k = "";
            return this.l.toString();
        }
        java.lang.String strReplaceFirst = matcher.replaceFirst(java.lang.Character.toString(c));
        sb.replace(0, strReplaceFirst.length(), strReplaceFirst);
        int iStart = matcher.start();
        this.t = iStart;
        return sb.substring(0, iStart + 1);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    private final java.lang.String j() {
        defpackage.akft akftVar;
        java.util.regex.Matcher matcher;
        int iEnd = 1;
        if (this.s.p == 1) {
            java.lang.StringBuilder sb = this.x;
            if (sb.charAt(0) != '1' || sb.charAt(1) == '0' || sb.charAt(1) == '1') {
                akftVar = this.s;
                if ((akftVar.b & 8388608) != 0) {
                    java.util.regex.Pattern patternB = this.z.b(akftVar.s);
                    java.lang.StringBuilder sb2 = this.x;
                    matcher = patternB.matcher(sb2);
                    if (matcher.lookingAt() || matcher.end() <= 0) {
                        iEnd = 0;
                    } else {
                        this.n = true;
                        iEnd = matcher.end();
                        this.u.append(sb2.substring(0, iEnd));
                    }
                } else {
                    iEnd = 0;
                }
            } else {
                this.u.append("1 ");
                this.n = true;
            }
        } else {
            akftVar = this.s;
            if ((akftVar.b & 8388608) != 0) {
                java.util.regex.Pattern patternB2 = this.z.b(akftVar.s);
                java.lang.StringBuilder sb3 = this.x;
                matcher = patternB2.matcher(sb3);
                if (matcher.lookingAt()) {
                    iEnd = 0;
                } else {
                    iEnd = 0;
                }
            } else {
                iEnd = 0;
            }
        }
        java.lang.StringBuilder sb4 = this.x;
        java.lang.String strSubstring = sb4.substring(0, iEnd);
        sb4.delete(0, iEnd);
        return strSubstring;
    }

    private final void k(java.lang.String str) {
        java.util.Iterator it = this.y.iterator();
        while (it.hasNext()) {
            defpackage.akfn akfnVar = (defpackage.akfn) it.next();
            if (akfnVar.e.size() != 0) {
                int length = str.length();
                if (!this.z.b((java.lang.String) akfnVar.e.get(java.lang.Math.min(length - 3, akfnVar.e.size() - 1))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    private final boolean l() {
        java.lang.StringBuilder sb;
        defpackage.akfx akfxVar;
        int iA;
        java.lang.StringBuilder sb2 = this.x;
        if (sb2.length() == 0 || (iA = (akfxVar = this.p).a(sb2, (sb = new java.lang.StringBuilder()))) == 0) {
            return false;
        }
        sb2.setLength(0);
        sb2.append((java.lang.CharSequence) sb);
        akfg akfgVarC = akfxVar.c(iA);
        if (defpackage.akgb.a.equals(akfgVarC)) {
            this.s = akfxVar.e(iA);
        } else if (!akfgVarC.equals(this.q)) {
            this.s = d(akfgVarC);
        }
        java.lang.String string = java.lang.Integer.toString(iA);
        java.lang.StringBuilder sb3 = this.u;
        sb3.append(string);
        sb3.append(' ');
        this.w = "";
        return true;
    }

    private final boolean m() {
        java.util.regex.Pattern patternB = this.z.b("\\+|".concat(java.lang.String.valueOf(this.s.q)));
        java.lang.StringBuilder sb = this.b;
        java.util.regex.Matcher matcher = patternB.matcher(sb);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.n = true;
        int iEnd = matcher.end();
        java.lang.StringBuilder sb2 = this.x;
        sb2.setLength(0);
        sb2.append(sb.substring(iEnd));
        java.lang.StringBuilder sb3 = this.u;
        sb3.setLength(0);
        sb3.append(sb.substring(0, iEnd));
        if (sb.charAt(0) != '+') {
            sb3.append(' ');
        }
        return true;
    }

    private final boolean n() {
        java.util.Iterator it = this.y.iterator();
        while (it.hasNext()) {
            defpackage.akfn akfnVar = (defpackage.akfn) it.next();
            java.lang.String str = akfnVar.c;
            if (this.k.equals(str)) {
                return false;
            }
            java.lang.String str2 = akfnVar.c;
            java.lang.StringBuilder sb = this.j;
            sb.setLength(0);
            java.lang.String str3 = akfnVar.d;
            java.util.regex.Matcher matcher = this.z.b(str2).matcher("999999999999999");
            matcher.find();
            java.lang.String strGroup = matcher.group();
            java.lang.String strReplaceAll = strGroup.length() < this.x.length() ? "" : strGroup.replaceAll(str2, str3).replaceAll("9", "\u2008");
            if (strReplaceAll.length() > 0) {
                sb.append(strReplaceAll);
                this.k = str;
                this.v = h.matcher(akfnVar.f).find();
                this.t = 0;
                return true;
            }
            it.remove();
        }
        this.c = false;
        return false;
    }

    final java.lang.String a() {
        for (defpackage.akfn akfnVar : this.y) {
            java.util.regex.Matcher matcher = this.z.b(akfnVar.c).matcher(this.x);
            if (matcher.matches()) {
                this.v = h.matcher(akfnVar.f).find();
                java.lang.String strE = e(matcher.replaceAll(akfnVar.d));
                if (defpackage.akfx.D(strE, defpackage.akfx.c).contentEquals(this.b)) {
                    return strE;
                }
            }
        }
        return "";
    }

    public final java.lang.String b(char c, boolean z) {
        java.lang.StringBuilder sb = this.l;
        sb.append(c);
        if (z) {
            this.d = sb.length();
        }
        if (java.lang.Character.isDigit(c) || (sb.length() == 1 && defpackage.akfx.d.matcher(java.lang.Character.toString(c)).matches())) {
            java.lang.StringBuilder sb2 = this.b;
            if (c == '+') {
                sb2.append('+');
            } else {
                c = java.lang.Character.forDigit(java.lang.Character.digit(c, 10), 10);
                sb2.append(c);
                this.x.append(c);
            }
            if (z) {
                this.e = this.b.length();
            }
        } else {
            this.c = false;
            this.m = true;
        }
        if (this.c) {
            int length = this.b.length();
            if (length != 0 && length != 1 && length != 2) {
                if (length == 3) {
                    if (!m()) {
                        this.w = j();
                        return f();
                    }
                    this.o = true;
                }
                if (this.o) {
                    if (l()) {
                        this.o = false;
                    }
                    return this.u.toString().concat(this.x.toString());
                }
                if (this.y.isEmpty()) {
                    return f();
                }
                java.lang.String strI = i(c);
                java.lang.String strA = a();
                if (strA.length() > 0) {
                    return strA;
                }
                k(this.x.toString());
                if (n()) {
                    return h();
                }
                return this.c ? e(strI) : sb.toString();
            }
        } else if (!this.m) {
            if (!m()) {
                if (this.w.length() > 0) {
                    this.x.insert(0, this.w);
                    java.lang.StringBuilder sb3 = this.u;
                    sb3.setLength(sb3.lastIndexOf(this.w));
                }
                if (!this.w.equals(j())) {
                    this.u.append(' ');
                    return g();
                }
            } else if (l()) {
                return g();
            }
        }
        return sb.toString();
    }

    public final void c() {
        this.a = "";
        this.l.setLength(0);
        this.b.setLength(0);
        this.j.setLength(0);
        this.t = 0;
        this.k = "";
        this.u.setLength(0);
        this.w = "";
        this.x.setLength(0);
        this.c = true;
        this.m = false;
        this.e = 0;
        this.d = 0;
        this.n = false;
        this.o = false;
        this.y.clear();
        this.v = false;
        if (this.s.equals(this.r)) {
            return;
        }
        this.s = d(this.q);
    }
}
