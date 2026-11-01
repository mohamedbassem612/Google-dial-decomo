package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akfx {
    public static final aihd a;
    public static final aihd b;
    public static final aigf c;
    static final java.util.regex.Pattern d;
    static final java.util.regex.Pattern e;
    static final java.util.regex.Pattern f;
    public static final java.util.regex.Pattern g;
    public static final akfg h;
    private static final java.util.logging.Logger j = java.util.logging.Logger.getLogger(defpackage.akfx.class.getName());
    private static final aigf k = aigf.k(54, "9");
    private static final aihd l;
    private static final java.util.regex.Pattern m;
    private static final java.util.regex.Pattern n;
    private static final java.lang.String o;
    private static final java.lang.String p;
    private static final java.util.regex.Pattern q;
    private static final java.util.regex.Pattern r;
    private static final java.util.regex.Pattern s;
    private static final java.util.regex.Pattern t;
    private static defpackage.akfx u;
    private final ajyi A;
    public final java.util.Map i;
    private final akgt y;
    private final java.util.Set v = java.util.EnumSet.noneOf(akfg.class);
    private final ajyi z = new ajyi(100);
    private final java.util.Set w = new java.util.HashSet(320);
    private final java.util.Set x = new java.util.HashSet();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [char] */
    /* JADX WARN: Type inference failed for: r5v4 */
    static {
        aihb aihbVar = new aihb();
        aihbVar.i(86);
        aihd aihdVarH = aihbVar.h();
        a = aihdVarH;
        b = new aile(52);
        aihb aihbVar2 = new aihb();
        aihbVar2.i(52);
        aihbVar2.i(54);
        aihbVar2.i(55);
        aihbVar2.i(62);
        aihbVar2.k(aihdVarH);
        l = aihbVar2.h();
        aigb aigbVar = new aigb(4);
        aigbVar.l(defpackage.akfj.a);
        aigbVar.i('+', '+');
        aigbVar.i('*', '*');
        aigbVar.i('#', '#');
        c = aigbVar.e(true);
        java.util.HashMap map = new java.util.HashMap();
        ailj ailjVarK = defpackage.akfj.b.f().k();
        while (ailjVarK.hasNext()) {
            java.lang.Character ch = (java.lang.Character) ailjVarK.next();
            int iCharValue = ch.charValue();
            if (ahvr.t((char) iCharValue)) {
                iCharValue ^= 32;
            }
            map.put(java.lang.Character.valueOf((char) iCharValue), ch);
            map.put(ch, ch);
        }
        aigb aigbVar2 = new aigb(4);
        aigbVar2.l(defpackage.akfj.a);
        aigbVar2.l(map);
        aigbVar2.i('-', '-');
        aigbVar2.i((char) 65293, '-');
        aigbVar2.i((char) 8208, '-');
        aigbVar2.i((char) 8209, '-');
        aigbVar2.i((char) 8210, '-');
        aigbVar2.i((char) 8211, '-');
        aigbVar2.i((char) 8212, '-');
        aigbVar2.i((char) 8213, '-');
        aigbVar2.i((char) 8722, '-');
        aigbVar2.i('/', '/');
        aigbVar2.i((char) 65295, '/');
        aigbVar2.i(' ', ' ');
        aigbVar2.i((char) 12288, ' ');
        aigbVar2.i((char) 8288, ' ');
        aigbVar2.i('.', '.');
        aigbVar2.i((char) 65294, '.');
        aigbVar2.e(true);
        java.util.regex.Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        d = java.util.regex.Pattern.compile("[+＋]+");
        java.util.regex.Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        m = java.util.regex.Pattern.compile("(\\p{Nd})");
        n = java.util.regex.Pattern.compile("[+＋\\p{Nd}]");
        e = java.util.regex.Pattern.compile("[\\\\/] *x");
        f = java.util.regex.Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        java.lang.String str = "\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*" + defpackage.akfj.d + "\\p{Nd}]*";
        o = str;
        java.lang.String strK = K(true);
        p = strK;
        K(false);
        q = java.util.regex.Pattern.compile("(?:" + strK + ")$", 66);
        r = java.util.regex.Pattern.compile(str + "(?:" + strK + ")?", 66);
        g = java.util.regex.Pattern.compile("(\\D+)");
        s = java.util.regex.Pattern.compile("(\\$\\d)");
        t = java.util.regex.Pattern.compile("\\(?\\$1\\)?");
        u = null;
        h = defpackage.akgb.a;
    }

    public akfx(akgt akgtVar, java.util.Map map) {
        this.A = new ajyi(map.keySet());
        this.y = akgtVar;
        this.i = map;
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.util.List list = (java.util.List) entry.getValue();
            if (list.size() == 1 && h.equals(list.get(0))) {
                this.x.add((java.lang.Integer) entry.getKey());
            } else {
                this.w.addAll(list);
            }
        }
        if (this.w.remove(h)) {
            j.logp(java.util.logging.Level.WARNING, "com.google.i18n.phonenumbers.PhoneNumberUtil", "<init>", "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.v.addAll((java.util.Collection) map.get(1));
    }

    static void C(java.lang.StringBuilder sb) {
        if (defpackage.akfj.e.matcher(sb).matches()) {
            sb.replace(0, sb.length(), D(sb, defpackage.akfj.c));
        } else {
            sb.replace(0, sb.length(), defpackage.agwm.i(sb));
        }
    }

    public static java.lang.String D(java.lang.CharSequence charSequence, java.util.Map map) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            java.lang.Character ch = (java.lang.Character) map.get(java.lang.Character.valueOf(ahvr.o(charSequence.charAt(i))));
            if (ch != null) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void G(java.lang.CharSequence charSequence, akzx akzxVar) {
        if (charSequence.length() <= 1 || charSequence.charAt(0) != '0') {
            return;
        }
        akzxVar.u();
        defpackage.akgu akguVar = (defpackage.akgu) akzxVar.b;
        defpackage.akgu akguVar2 = defpackage.akgu.a;
        akguVar.b |= 8;
        akguVar.f = true;
        int i = 1;
        while (i < charSequence.length() - 1 && charSequence.charAt(i) == '0') {
            i++;
        }
        if (i != 1) {
            akzxVar.u();
            defpackage.akgu akguVar3 = (defpackage.akgu) akzxVar.b;
            akguVar3.b |= 16;
            akguVar3.g = i;
        }
    }

    static final boolean H(java.lang.String str, defpackage.akfv akfvVar) {
        alak alakVar = akfvVar.d;
        return (alakVar.isEmpty() || alakVar.contains(java.lang.Integer.valueOf(str.length()))) && defpackage.agwm.h(str, akfvVar) == 1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: akfm */
    private final int J(akfg akfgVar) throws akfm {
        defpackage.akft akftVarF = f(akfgVar);
        if (akftVarF != null) {
            return akftVarF.p;
        }
        throw new java.lang.IllegalArgumentException("Invalid region code: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(akfgVar))));
    }

    private static java.lang.String K(boolean z) {
        java.lang.String strL = L(20);
        java.lang.String str = ";ext=".concat(strL) + '|' + ("[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + L(20) + "#?") + '|' + ("[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + L(9) + "#?") + '|' + ("[- ]+" + L(6) + '#');
        if (!z) {
            return str;
        }
        return str + '|' + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + L(15) + "#?") + '|' + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + L(9) + "#?");
    }

    private static java.lang.String L(int i) {
        return a.bs(i, "(\\p{Nd}{1,", "})");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: akfm */
    private static void M(defpackage.akft akftVar, java.lang.String str) throws akfm {
        if (akftVar == null) {
            throw new akfm(str);
        }
    }

    private static boolean N(defpackage.akfv akfvVar) {
        return (akfvVar.d.size() == 1 && akfvVar.d.e(0) == -1) ? false : true;
    }

    private final boolean O(akfg akfgVar) {
        return akfgVar != null && this.w.contains(akfgVar);
    }

    private static defpackage.akfv P(defpackage.akft akftVar, int i) {
        switch (i - 1) {
            case 0:
            case 2:
                defpackage.akfv akfvVar = akftVar.d;
                return akfvVar == null ? defpackage.akfv.a : akfvVar;
            case 1:
                defpackage.akfv akfvVar2 = akftVar.e;
                return akfvVar2 == null ? defpackage.akfv.a : akfvVar2;
            case 3:
                defpackage.akfv akfvVar3 = akftVar.f;
                return akfvVar3 == null ? defpackage.akfv.a : akfvVar3;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.akfv akfvVar4 = akftVar.g;
                return akfvVar4 == null ? defpackage.akfv.a : akfvVar4;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.akfv akfvVar5 = akftVar.h;
                return akfvVar5 == null ? defpackage.akfv.a : akfvVar5;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.akfv akfvVar6 = akftVar.j;
                return akfvVar6 == null ? defpackage.akfv.a : akfvVar6;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.akfv akfvVar7 = akftVar.i;
                return akfvVar7 == null ? defpackage.akfv.a : akfvVar7;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.akfv akfvVar8 = akftVar.k;
                return akfvVar8 == null ? defpackage.akfv.a : akfvVar8;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.akfv akfvVar9 = akftVar.l;
                return akfvVar9 == null ? defpackage.akfv.a : akfvVar9;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.akfv akfvVar10 = akftVar.m;
                return akfvVar10 == null ? defpackage.akfv.a : akfvVar10;
            default:
                defpackage.akfv akfvVar11 = akftVar.c;
                return akfvVar11 == null ? defpackage.akfv.a : akfvVar11;
        }
    }

    private static final boolean Q(defpackage.akgu akguVar, defpackage.akgu akguVar2) {
        java.lang.String strValueOf = java.lang.String.valueOf(akguVar.d);
        java.lang.String strValueOf2 = java.lang.String.valueOf(akguVar2.d);
        return strValueOf.endsWith(strValueOf2) || strValueOf2.endsWith(strValueOf);
    }

    private static akzx R(defpackage.akgu akguVar) {
        akzx akzxVarM = defpackage.akgu.a.m();
        int i = akguVar.c;
        akzxVarM.u();
        defpackage.akgu akguVar2 = (defpackage.akgu) akzxVarM.b;
        akguVar2.b |= 1;
        akguVar2.c = i;
        long j2 = akguVar.d;
        akzxVarM.u();
        defpackage.akgu akguVar3 = (defpackage.akgu) akzxVarM.b;
        akguVar3.b |= 2;
        akguVar3.d = j2;
        if (akguVar.e.length() > 0) {
            java.lang.String str = akguVar.e;
            akzxVarM.u();
            defpackage.akgu akguVar4 = (defpackage.akgu) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            akguVar4.b |= 4;
            akguVar4.e = str;
        }
        if (akguVar.f) {
            akzxVarM.u();
            defpackage.akgu akguVar5 = (defpackage.akgu) akzxVarM.b;
            akguVar5.b |= 8;
            akguVar5.f = true;
            int i2 = akguVar.g;
            akzxVarM.u();
            defpackage.akgu akguVar6 = (defpackage.akgu) akzxVarM.b;
            akguVar6.b |= 16;
            akguVar6.g = i2;
        }
        return akzxVarM;
    }

    private static final int S(java.lang.String str, defpackage.akft akftVar) {
        defpackage.akfv akfvVar = akftVar.c;
        if (akfvVar == null) {
            akfvVar = defpackage.akfv.a;
        }
        if (!H(str, akfvVar)) {
            return 12;
        }
        defpackage.akfv akfvVar2 = akftVar.g;
        if (akfvVar2 == null) {
            akfvVar2 = defpackage.akfv.a;
        }
        if (H(str, akfvVar2)) {
            return 5;
        }
        defpackage.akfv akfvVar3 = akftVar.f;
        if (akfvVar3 == null) {
            akfvVar3 = defpackage.akfv.a;
        }
        if (H(str, akfvVar3)) {
            return 4;
        }
        defpackage.akfv akfvVar4 = akftVar.h;
        if (akfvVar4 == null) {
            akfvVar4 = defpackage.akfv.a;
        }
        if (H(str, akfvVar4)) {
            return 6;
        }
        defpackage.akfv akfvVar5 = akftVar.j;
        if (akfvVar5 == null) {
            akfvVar5 = defpackage.akfv.a;
        }
        if (H(str, akfvVar5)) {
            return 7;
        }
        defpackage.akfv akfvVar6 = akftVar.i;
        if (akfvVar6 == null) {
            akfvVar6 = defpackage.akfv.a;
        }
        if (H(str, akfvVar6)) {
            return 8;
        }
        defpackage.akfv akfvVar7 = akftVar.k;
        if (akfvVar7 == null) {
            akfvVar7 = defpackage.akfv.a;
        }
        if (H(str, akfvVar7)) {
            return 9;
        }
        defpackage.akfv akfvVar8 = akftVar.l;
        if (akfvVar8 == null) {
            akfvVar8 = defpackage.akfv.a;
        }
        if (H(str, akfvVar8)) {
            return 10;
        }
        defpackage.akfv akfvVar9 = akftVar.m;
        if (akfvVar9 == null) {
            akfvVar9 = defpackage.akfv.a;
        }
        if (H(str, akfvVar9)) {
            return 11;
        }
        defpackage.akfv akfvVar10 = akftVar.d;
        if (akfvVar10 == null) {
            akfvVar10 = defpackage.akfv.a;
        }
        if (H(str, akfvVar10)) {
            if (akftVar.u) {
                return 3;
            }
            defpackage.akfv akfvVar11 = akftVar.e;
            if (akfvVar11 == null) {
                akfvVar11 = defpackage.akfv.a;
            }
            return !H(str, akfvVar11) ? 1 : 3;
        }
        if (akftVar.u) {
            return 12;
        }
        defpackage.akfv akfvVar12 = akftVar.e;
        if (akfvVar12 == null) {
            akfvVar12 = defpackage.akfv.a;
        }
        return H(str, akfvVar12) ? 2 : 12;
    }

    public static synchronized defpackage.akfx h() {
        if (u == null) {
            m(new defpackage.akfx((akgt) apdi.f().c, defpackage.akfk.a));
        }
        return u;
    }

    public static java.lang.String k(int i) {
        aigf aigfVar = k;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        return aigfVar.containsKey(numValueOf) ? (java.lang.String) aigfVar.get(numValueOf) : "";
    }

    static synchronized void m(defpackage.akfx akfxVar) {
        u = akfxVar;
    }

    static boolean o(java.lang.String str) {
        return str.length() == 0 || t.matcher(str).matches();
    }

    static boolean s(java.lang.CharSequence charSequence) {
        if (charSequence.length() < 2) {
            return false;
        }
        return r.matcher(charSequence).matches();
    }

    public final boolean A(int i, int i2) {
        if (i == 1 || i == 3) {
            return true;
        }
        return l.contains(java.lang.Integer.valueOf(i2)) && i == 2;
    }

    final void B(java.lang.StringBuilder sb, defpackage.akft akftVar, java.lang.StringBuilder sb2) {
        int length = sb.length();
        java.lang.String str = akftVar.s;
        if (length == 0 || str.length() == 0) {
            return;
        }
        java.util.regex.Matcher matcher = this.z.b(str).matcher(sb);
        if (matcher.lookingAt()) {
            defpackage.akfv akfvVar = akftVar.c;
            if (akfvVar == null) {
                akfvVar = defpackage.akfv.a;
            }
            int iH = defpackage.agwm.h(sb, akfvVar);
            int iGroupCount = matcher.groupCount();
            java.lang.String str2 = akftVar.t;
            if (str2.length() == 0 || matcher.group(iGroupCount) == null) {
                if (iH != 1 || defpackage.agwm.h(sb.substring(matcher.end()), akfvVar) == 1) {
                    if (sb2 != null && iGroupCount > 0 && matcher.group(iGroupCount) != null) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return;
                }
                return;
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(sb);
            sb3.replace(0, length, matcher.replaceFirst(str2));
            if (iH != 1 || defpackage.agwm.h(sb3.toString(), akfvVar) == 1) {
                if (sb2 != null && iGroupCount > 1) {
                    sb2.append(matcher.group(1));
                }
                sb.replace(0, sb.length(), sb3.toString());
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: akfp */
    /* JADX WARN: Code duplicated, block: B:20:0x0072  */
    final int E(java.lang.CharSequence charSequence, defpackage.akft akftVar, java.lang.StringBuilder sb, boolean z, akzx akzxVar) throws akfp {
        int i;
        if (charSequence.length() == 0) {
            return 0;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(charSequence);
        java.lang.String str = akftVar != null ? akftVar.q : "NonMatch";
        if (sb2.length() != 0) {
            java.util.regex.Matcher matcher = d.matcher(sb2);
            if (matcher.lookingAt()) {
                sb2.delete(0, matcher.end());
                C(sb2);
                i = 2;
            } else {
                java.util.regex.Pattern patternB = this.z.b(str);
                C(sb2);
                java.util.regex.Matcher matcher2 = patternB.matcher(sb2);
                if (matcher2.lookingAt()) {
                    int iEnd = matcher2.end();
                    java.util.regex.Matcher matcher3 = m.matcher(sb2.substring(iEnd));
                    if (matcher3.find() && defpackage.agwm.i(matcher3.group(1)).equals("0")) {
                        i = 21;
                    } else {
                        sb2.delete(0, iEnd);
                        i = 6;
                    }
                } else {
                    i = 21;
                }
            }
        } else {
            i = 21;
        }
        if (z) {
            akzxVar.u();
            defpackage.akgu akguVar = (defpackage.akgu) akzxVar.b;
            defpackage.akgu akguVar2 = defpackage.akgu.a;
            akguVar.i = i - 1;
            akguVar.b |= 64;
        }
        if (i != 21) {
            if (sb2.length() <= 2) {
                throw new akfp(defpackage.akfo.c, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
            }
            int iA = a(sb2, sb);
            if (iA == 0) {
                throw new akfp(defpackage.akfo.a, "Country calling code supplied was not recognised.");
            }
            akzxVar.u();
            defpackage.akgu akguVar3 = (defpackage.akgu) akzxVar.b;
            defpackage.akgu akguVar4 = defpackage.akgu.a;
            akguVar3.b |= 1;
            akguVar3.c = iA;
            return iA;
        }
        if (akftVar != null) {
            int i2 = akftVar.p;
            java.lang.String strValueOf = java.lang.String.valueOf(i2);
            java.lang.String string = sb2.toString();
            if (string.startsWith(strValueOf)) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(string.substring(strValueOf.length()));
                defpackage.akfv akfvVar = akftVar.c;
                if (akfvVar == null) {
                    akfvVar = defpackage.akfv.a;
                }
                B(sb3, akftVar, null);
                if ((defpackage.agwm.h(sb2, akfvVar) != 1 && defpackage.agwm.h(sb3, akfvVar) == 1) || w(sb2, akftVar, 12) == 6) {
                    sb.append((java.lang.CharSequence) sb3);
                    if (z) {
                        akzxVar.u();
                        defpackage.akgu akguVar5 = (defpackage.akgu) akzxVar.b;
                        defpackage.akgu akguVar6 = defpackage.akgu.a;
                        akguVar5.i = 10;
                        akguVar5.b |= 64;
                    }
                    akzxVar.u();
                    defpackage.akgu akguVar7 = (defpackage.akgu) akzxVar.b;
                    defpackage.akgu akguVar8 = defpackage.akgu.a;
                    akguVar7.b |= 1;
                    akguVar7.c = i2;
                    return i2;
                }
            }
        }
        akzxVar.u();
        defpackage.akgu akguVar9 = (defpackage.akgu) akzxVar.b;
        defpackage.akgu akguVar10 = defpackage.akgu.a;
        akguVar9.b |= 1;
        akguVar9.c = 0;
        return 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: akfm */
    /* JADX INFO: Thrown type has an unknown type hierarchy: akfp */
    /* JADX WARN: Type inference failed for: r3v56, types: [java.lang.Object, java.util.Set] */
    public final void F(java.lang.CharSequence charSequence, defpackage.akfr akfrVar, boolean z, akzx akzxVar) throws akfp, akfm {
        java.lang.String strSubstring;
        java.lang.StringBuilder sb;
        defpackage.akfx akfxVar;
        akzx akzxVar2;
        int iE;
        java.lang.CharSequence charSequenceSubSequence;
        defpackage.akfs akfsVar;
        if (charSequence == null) {
            throw new akfp(defpackage.akfo.b, "The phone number supplied was null.");
        }
        if (charSequence.length() > 250) {
            throw new akfp(defpackage.akfo.e, "The string supplied was too long to parse.");
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        java.lang.String string = charSequence.toString();
        ajyi ajyiVar = this.A;
        int iIndexOf = string.indexOf(";phone-context=");
        java.lang.String strGroup = "";
        defpackage.akfs akfsVar2 = null;
        if (iIndexOf == -1) {
            strSubstring = null;
        } else {
            int i = iIndexOf + 15;
            if (i >= string.length()) {
                strSubstring = "";
            } else {
                int iIndexOf2 = string.indexOf(59, i);
                strSubstring = iIndexOf2 < 0 ? string.substring(i) : string.substring(i, iIndexOf2);
            }
        }
        if (strSubstring != null) {
            if (strSubstring.isEmpty() || !(defpackage.akfj.f.matcher(strSubstring).matches() || defpackage.akfj.k.matcher(strSubstring).matches())) {
                throw new akfp(defpackage.akfo.b, "The phone-context value is invalid.");
            }
            if (strSubstring.charAt(0) != '+') {
                akfsVar = new defpackage.akfs(strSubstring, null);
            } else {
                java.lang.String strI = defpackage.agwm.i(strSubstring.substring(1));
                if (!strI.isEmpty() && strI.length() <= 3) {
                    int i2 = java.lang.Integer.parseInt(strI);
                    ?? r3 = ajyiVar.a;
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(i2);
                    if (r3.contains(numValueOf)) {
                        akfsVar2 = new defpackage.akfs(strSubstring, numValueOf);
                    }
                }
                akfsVar = new defpackage.akfs(strSubstring, null);
            }
            akfsVar2 = akfsVar;
        }
        if (akfsVar2 == null) {
            java.util.regex.Matcher matcher = n.matcher(string);
            if (matcher.find()) {
                charSequenceSubSequence = string.subSequence(matcher.start(), string.length());
                java.util.regex.Matcher matcher2 = f.matcher(charSequenceSubSequence);
                if (matcher2.find()) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher2.start());
                }
                java.util.regex.Matcher matcher3 = e.matcher(charSequenceSubSequence);
                if (matcher3.find()) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher3.start());
                }
            } else {
                charSequenceSubSequence = "";
            }
            sb2.append(charSequenceSubSequence);
            int iIndexOf3 = sb2.indexOf(";isub=");
            if (iIndexOf3 >= 0) {
                sb2.delete(iIndexOf3, sb2.length());
            }
        } else {
            int iIndexOf4 = string.indexOf("tel:");
            int i3 = iIndexOf4 >= 0 ? iIndexOf4 + 4 : 0;
            int iIndexOf5 = string.indexOf(";", i3);
            if (iIndexOf5 < 0) {
                throw new akfp(defpackage.akfo.b, "The string supplied does not form a valid RFC3966 number.");
            }
            java.lang.String strSubstring2 = string.substring(i3, iIndexOf5);
            java.lang.String str = akfsVar2.a;
            if (str.charAt(0) == '+') {
                java.lang.Integer num = akfsVar2.b;
                if (num == null) {
                    strSubstring2 = str.concat(java.lang.String.valueOf(strSubstring2));
                } else {
                    defpackage.akft akftVarG = g(num.intValue(), c(num.intValue()));
                    if (akftVarG == null) {
                        strSubstring2 = str.concat(java.lang.String.valueOf(strSubstring2));
                    } else {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(strSubstring2);
                        B(sb3, akftVarG, new java.lang.StringBuilder());
                        strSubstring2 = "+" + num.toString() + sb3.toString();
                    }
                }
            }
            sb2.append(strSubstring2);
            int iIndexOf6 = string.indexOf(";ext=");
            if (iIndexOf6 >= 0) {
                int i4 = iIndexOf6 + 5;
                int iIndexOf7 = string.indexOf(";", i4);
                if (iIndexOf7 < 0) {
                    iIndexOf7 = string.length();
                }
                sb2.append(" ext. ");
                sb2.append((java.lang.CharSequence) string, i4, iIndexOf7);
            }
        }
        if (!s(sb2)) {
            throw new akfp(defpackage.akfo.b, "The string supplied did not seem to be a phone number.");
        }
        akfg akfgVar = akfrVar.a;
        if (z && !O(akfgVar) && (sb2.length() == 0 || !d.matcher(sb2).lookingAt())) {
            throw new akfp(defpackage.akfo.a, "Missing or invalid default region.");
        }
        boolean z2 = akfrVar.b;
        if (z2) {
            akzxVar.u();
            defpackage.akgu akguVar = (defpackage.akgu) akzxVar.b;
            defpackage.akgu akguVar2 = defpackage.akgu.a;
            j$.util.Objects.requireNonNull(string);
            akguVar.b |= 32;
            akguVar.h = string;
        }
        java.util.regex.Matcher matcher4 = q.matcher(sb2);
        if (matcher4.find() && s(sb2.substring(0, matcher4.start()))) {
            int iGroupCount = matcher4.groupCount();
            for (int i5 = 1; i5 <= iGroupCount; i5++) {
                if (matcher4.group(i5) != null) {
                    strGroup = matcher4.group(i5);
                    sb2.delete(matcher4.start(), sb2.length());
                    break;
                }
            }
        }
        if (strGroup.length() > 0) {
            akzxVar.u();
            defpackage.akgu akguVar3 = (defpackage.akgu) akzxVar.b;
            defpackage.akgu akguVar4 = defpackage.akgu.a;
            j$.util.Objects.requireNonNull(strGroup);
            akguVar3.b |= 4;
            akguVar3.e = strGroup;
        }
        defpackage.akft akftVarF = f(akfgVar);
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        try {
            iE = E(sb2, akftVarF, sb4, z2, akzxVar);
            sb = sb2;
            akfxVar = this;
            akzxVar2 = akzxVar;
        } catch (akfp e2) {
            sb = sb2;
            java.util.regex.Matcher matcher5 = d.matcher(sb);
            defpackage.akfo akfoVar = e2.a;
            defpackage.akfo akfoVar2 = defpackage.akfo.a;
            if (akfoVar != akfoVar2 || !matcher5.lookingAt()) {
                throw new akfp(akfoVar, e2.getMessage());
            }
            java.lang.String strSubstring3 = sb.substring(matcher5.end());
            akfxVar = this;
            akzxVar2 = akzxVar;
            iE = akfxVar.E(strSubstring3, akftVarF, sb4, z2, akzxVar2);
            if (iE == 0) {
                throw new akfp(akfoVar2, "Could not interpret numbers after plus-sign.");
            }
        }
        boolean z3 = iE != 0;
        if (z3) {
            akfg akfgVarC = akfxVar.c(iE);
            if (!akfgVarC.equals(akfgVar)) {
                akftVarF = akfxVar.g(iE, akfgVarC);
            }
        } else {
            C(sb);
            sb4.append((java.lang.CharSequence) sb);
            if (akfgVar != null) {
                int i6 = akftVarF.p;
                akzxVar2.u();
                defpackage.akgu akguVar5 = (defpackage.akgu) akzxVar2.b;
                defpackage.akgu akguVar6 = defpackage.akgu.a;
                akguVar5.b |= 1;
                akguVar5.c = i6;
            } else if (z2) {
                akzxVar2.u();
                defpackage.akgu akguVar7 = (defpackage.akgu) akzxVar2.b;
                defpackage.akgu akguVar8 = defpackage.akgu.a;
                akguVar7.b &= -65;
                akguVar7.i = 0;
            }
        }
        if (sb4.length() < 2) {
            throw new akfp(defpackage.akfo.d, "The string supplied is too short to be a phone number.");
        }
        if (akftVarF != null && (akfrVar.c || !z3)) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(sb4);
            akfxVar.B(sb6, akftVarF, sb5);
            int iW = akfxVar.w(sb6, akftVarF, 12);
            if (iW != 4 && iW != 2 && iW != 5) {
                if (z2 && sb5.length() > 0) {
                    java.lang.String string2 = sb5.toString();
                    akzxVar2.u();
                    defpackage.akgu akguVar9 = (defpackage.akgu) akzxVar2.b;
                    defpackage.akgu akguVar10 = defpackage.akgu.a;
                    j$.util.Objects.requireNonNull(string2);
                    akguVar9.b |= 128;
                    akguVar9.j = string2;
                }
                sb4 = sb6;
            }
        }
        int length = sb4.length();
        if (length < 2) {
            throw new akfp(defpackage.akfo.d, "The string supplied is too short to be a phone number.");
        }
        if (length > 17) {
            throw new akfp(defpackage.akfo.e, "The string supplied is too long to be a phone number.");
        }
        G(sb4, akzxVar2);
        long j2 = java.lang.Long.parseLong(sb4.toString());
        akzxVar2.u();
        defpackage.akgu akguVar11 = (defpackage.akgu) akzxVar2.b;
        defpackage.akgu akguVar12 = defpackage.akgu.a;
        akguVar11.b |= 2;
        akguVar11.d = j2;
    }

    public final void I(defpackage.akgu akguVar, defpackage.akft akftVar, java.lang.StringBuilder sb) {
        if ((akguVar.b & 4) == 0 || akguVar.e.length() <= 0) {
            return;
        }
        if ((akftVar.b & 4194304) != 0) {
            sb.append(akftVar.r);
            sb.append(akguVar.e);
        } else {
            sb.append(" ext. ");
            sb.append(akguVar.e);
        }
    }

    final int a(java.lang.StringBuilder sb, java.lang.StringBuilder sb2) {
        if (sb.length() == 0 || sb.charAt(0) == '0') {
            return 0;
        }
        int length = sb.length();
        for (int i = 1; i <= 3 && i <= length; i++) {
            int i2 = java.lang.Integer.parseInt(sb.substring(0, i));
            if (this.i.containsKey(java.lang.Integer.valueOf(i2))) {
                sb2.append(sb.substring(i));
                return i2;
            }
        }
        return 0;
    }

    public final int b(akfg akfgVar) {
        if (O(akfgVar)) {
            return J(akfgVar);
        }
        j.logp(java.util.logging.Level.WARNING, "com.google.i18n.phonenumbers.PhoneNumberUtil", "getCountryCodeForRegion", a.bk(akfgVar == null ? "null" : akfgVar.eW, "Invalid or missing region code (", ") provided."));
        return 0;
    }

    public final akfg c(int i) {
        java.util.List list = (java.util.List) this.i.get(java.lang.Integer.valueOf(i));
        return list == null ? akfg.eq : (akfg) list.get(0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: akfm */
    public final akfg d(defpackage.akgu akguVar) throws akfm {
        int i = akguVar.c;
        java.util.List<akfg> list = (java.util.List) this.i.get(java.lang.Integer.valueOf(i));
        if (list == null) {
            j.logp(java.util.logging.Level.INFO, "com.google.i18n.phonenumbers.PhoneNumberUtil", "getRegionCodeForNumber", a.bw((byte) 41, i, "Missing/invalid country_code ("));
            return null;
        }
        if (list.size() == 1) {
            return (akfg) list.get(0);
        }
        java.lang.String strL = l(akguVar);
        for (akfg akfgVar : list) {
            defpackage.akft akftVarF = f(akfgVar);
            if ((akftVarF.b & 134217728) != 0) {
                if (this.z.b(akftVarF.x).matcher(strL).lookingAt()) {
                    return akfgVar;
                }
            } else if (S(strL, akftVarF) != 12) {
                return akfgVar;
            }
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: akfm */
    final defpackage.akft e(int i) throws akfm {
        java.util.Set set = this.x;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (!set.contains(numValueOf)) {
            return null;
        }
        akgt akgtVar = this.y;
        akfg akfgVar = defpackage.akgb.a;
        java.util.List list = (java.util.List) defpackage.akfk.a.get(numValueOf);
        boolean z = false;
        if (list != null && !list.contains(defpackage.akgb.a)) {
            z = true;
        }
        ahvr.bM(!z);
        defpackage.akft akftVarB = akgtVar.b.d(akgtVar.a.U(numValueOf)).a.b(numValueOf);
        M(akftVarB, a.bj(i, "Missing metadata for country code "));
        return akftVarB;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: akfm */
    public final defpackage.akft f(akfg akfgVar) throws akfm {
        if (!O(akfgVar)) {
            return null;
        }
        akgt akgtVar = this.y;
        ahvr.bM(defpackage.akgb.a(akfgVar));
        defpackage.akft akftVarB = akgtVar.b.d(akgtVar.a.U(akfgVar)).b.b(akfgVar);
        M(akftVarB, "Missing metadata for region code ".concat(java.lang.String.valueOf(java.lang.String.valueOf(akfgVar))));
        return akftVarB;
    }

    public final defpackage.akft g(int i, akfg akfgVar) {
        return h.equals(akfgVar) ? e(i) : f(akfgVar);
    }

    public final defpackage.akgu i(java.lang.CharSequence charSequence, akfg akfgVar) {
        defpackage.akfq akfqVarA = defpackage.akfr.a();
        akfqVarA.a = akfgVar;
        return j(charSequence, akfqVarA.a());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: akfm */
    /* JADX INFO: Thrown type has an unknown type hierarchy: akfp */
    public final defpackage.akgu j(java.lang.CharSequence charSequence, defpackage.akfr akfrVar) throws akfp, akfm {
        akzx akzxVarM = defpackage.akgu.a.m();
        F(charSequence, akfrVar, true, akzxVarM);
        return (defpackage.akgu) akzxVarM.p();
    }

    public final java.lang.String l(defpackage.akgu akguVar) {
        int i;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (akguVar.f && (i = akguVar.g) > 0) {
            char[] cArr = new char[i];
            java.util.Arrays.fill(cArr, '0');
            sb.append(new java.lang.String(cArr));
        }
        sb.append(akguVar.d);
        return sb.toString();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: akfm */
    public final boolean n(defpackage.akgu akguVar) throws akfm {
        defpackage.akft akftVarF = f(d(akguVar));
        if (akftVarF == null) {
            return true;
        }
        java.lang.String strL = l(akguVar);
        defpackage.akfv akfvVar = akftVarF.n;
        if (akfvVar == null) {
            akfvVar = defpackage.akfv.a;
        }
        return !H(strL, akfvVar);
    }

    public final boolean p(int i) {
        return this.i.containsKey(java.lang.Integer.valueOf(i));
    }

    public final boolean q(defpackage.akgu akguVar) {
        return r(akguVar, d(akguVar));
    }

    public final boolean r(defpackage.akgu akguVar, akfg akfgVar) {
        int i = akguVar.c;
        defpackage.akft akftVarG = g(i, akfgVar);
        if (akftVarG != null) {
            return (h.equals(akfgVar) || i == J(akfgVar)) && S(l(akguVar), akftVarG) != 12;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (Q(r6, r7) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (Q(r5, r7) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return 3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int t(defpackage.akgu r6, defpackage.akgu r7) {
        /*
            r5 = this;
            akzx r5 = R(r6)
            alad r6 = r5.p()
            akgu r6 = (defpackage.akgu) r6
            akzx r7 = R(r7)
            alad r7 = r7.p()
            akgu r7 = (defpackage.akgu) r7
            int r0 = r6.b
            r1 = 4
            r0 = r0 & r1
            r2 = 2
            if (r0 == 0) goto L2a
            int r0 = r7.b
            r0 = r0 & r1
            if (r0 == 0) goto L2a
            java.lang.String r0 = r6.e
            java.lang.String r3 = r7.e
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L67
        L2a:
            int r0 = r6.c
            int r3 = r7.c
            r4 = 3
            if (r0 == 0) goto L44
            if (r3 == 0) goto L44
            boolean r5 = r6.equals(r7)
            if (r5 == 0) goto L3b
            r1 = 5
            goto L68
        L3b:
            if (r0 != r3) goto L67
            boolean r5 = Q(r6, r7)
            if (r5 == 0) goto L67
            goto L65
        L44:
            r5.u()
            alad r6 = r5.b
            akgu r6 = (defpackage.akgu) r6
            int r0 = r6.b
            r0 = r0 | 1
            r6.b = r0
            r6.c = r3
            alad r5 = r5.p()
            akgu r5 = (defpackage.akgu) r5
            boolean r6 = r5.equals(r7)
            if (r6 != 0) goto L68
            boolean r5 = Q(r5, r7)
            if (r5 == 0) goto L67
        L65:
            r1 = r4
            goto L68
        L67:
            r1 = r2
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akfx.t(akgu, akgu):int");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: akfm */
    /* JADX INFO: Thrown type has an unknown type hierarchy: akfp */
    public final int u(defpackage.akgu akguVar, java.lang.CharSequence charSequence) throws akfm {
        int iT;
        try {
            return t(akguVar, i(charSequence, akfg.eq));
        } catch (akfp e2) {
            if (e2.a == defpackage.akfo.a) {
                akfg akfgVarC = c(akguVar.c);
                try {
                    if (akfgVarC.equals(akfg.eq)) {
                        akzx akzxVarM = defpackage.akgu.a.m();
                        defpackage.akfq akfqVarA = defpackage.akfr.a();
                        akfqVarA.b(true);
                        akfqVarA.a = null;
                        F(charSequence, akfqVarA.a(), false, akzxVarM);
                        iT = t(akguVar, (defpackage.akgu) akzxVarM.p());
                    } else {
                        iT = t(akguVar, i(charSequence, akfgVarC));
                        if (iT == 5) {
                            iT = 4;
                        }
                    }
                    return iT;
                } catch (akfp unused) {
                    return 1;
                }
            }
            return 1;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: akfm */
    public final int v(defpackage.akgu akguVar) throws akfm {
        defpackage.akft akftVarG = g(akguVar.c, d(akguVar));
        if (akftVarG == null) {
            return 12;
        }
        return S(l(akguVar), akftVarG);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b9, code lost:
    
        if (r1.subList(1, r1.size()).contains(r7) != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int w(java.lang.CharSequence r6, defpackage.akft r7, int r8) {
        /*
            r5 = this;
            akfv r0 = P(r7, r8)
            alak r1 = r0.d
            int r1 = r1.size()
            if (r1 != 0) goto L15
            akfv r1 = r7.c
            if (r1 != 0) goto L12
            akfv r1 = defpackage.akfv.a
        L12:
            alak r1 = r1.d
            goto L17
        L15:
            alak r1 = r0.d
        L17:
            alak r0 = r0.e
            r2 = 3
            r3 = 2
            r4 = 1
            if (r8 != r2) goto L6d
            akfv r8 = P(r7, r4)
            boolean r8 = N(r8)
            if (r8 != 0) goto L2d
            int r3 = r5.w(r6, r7, r3)
            return r3
        L2d:
            akfv r5 = P(r7, r3)
            boolean r8 = N(r5)
            if (r8 == 0) goto L6d
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r1)
            alak r1 = r5.d
            int r1 = r1.size()
            if (r1 != 0) goto L4d
            akfv r7 = r7.c
            if (r7 != 0) goto L4a
            akfv r7 = defpackage.akfv.a
        L4a:
            alak r7 = r7.d
            goto L4f
        L4d:
            alak r7 = r5.d
        L4f:
            r8.addAll(r7)
            java.util.Collections.sort(r8)
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L5e
            alak r0 = r5.e
            goto L6c
        L5e:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            alak r5 = r5.e
            r7.addAll(r5)
            java.util.Collections.sort(r7)
            r0 = r7
        L6c:
            r1 = r8
        L6d:
            r5 = 0
            java.lang.Object r7 = r1.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r8 = 5
            r2 = -1
            if (r7 == r2) goto Lbd
            int r6 = r6.length()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            boolean r0 = r0.contains(r7)
            if (r0 != 0) goto Lbe
            java.lang.Object r5 = r1.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 == r6) goto Lbb
            if (r5 <= r6) goto L9a
            r3 = 4
            goto Lbe
        L9a:
            int r5 = r1.size()
            int r5 = r5 + r2
            java.lang.Object r5 = r1.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 >= r6) goto Lad
            r3 = 6
            goto Lbe
        Lad:
            int r5 = r1.size()
            java.util.List r5 = r1.subList(r4, r5)
            boolean r5 = r5.contains(r7)
            if (r5 == 0) goto Lbd
        Lbb:
            r3 = r4
            goto Lbe
        Lbd:
            r3 = r8
        Lbe:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akfx.w(java.lang.CharSequence, akft, int):int");
    }

    public final java.lang.String x(defpackage.akgu akguVar, int i) {
        int iH;
        if (akguVar.d == 0) {
            java.lang.String str = akguVar.h;
            if (str.length() > 0 && (akguVar.b & 1) != 0 && (iH = akky.h(akguVar.i)) != 0 && iH == 21 && i == 1) {
                int i2 = akguVar.c;
                java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
                z(i2, 1, sb);
                return sb.toString();
            }
            if (str.length() > 0 || (akguVar.b & 1) == 0) {
                return str;
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(20);
        sb2.setLength(0);
        int i3 = akguVar.c;
        java.lang.String strL = l(akguVar);
        if (i == 1) {
            sb2.append(strL);
            z(i3, 1, sb2);
        } else if (p(i3)) {
            defpackage.akft akftVarG = g(i3, c(i3));
            sb2.append(y(strL, akftVarG, i, null));
            I(akguVar, akftVarG, sb2);
            z(i3, i, sb2);
        } else {
            sb2.append(strL);
        }
        return sb2.toString();
    }

    public final java.lang.String y(java.lang.String str, defpackage.akft akftVar, int i, java.lang.CharSequence charSequence) {
        defpackage.akfn akfnVar;
        java.util.Iterator it = ((akftVar.w.isEmpty() || i == 3) ? akftVar.v : akftVar.w).iterator();
        while (true) {
            if (!it.hasNext()) {
                akfnVar = null;
                break;
            }
            akfnVar = (defpackage.akfn) it.next();
            int size = akfnVar.e.size();
            if (size != 0) {
                if (!this.z.b((java.lang.String) akfnVar.e.get(size - 1)).matcher(str).lookingAt()) {
                    continue;
                }
            }
            if (this.z.b(akfnVar.c).matcher(str).matches()) {
                break;
            }
        }
        if (akfnVar == null) {
            return str;
        }
        ajyi ajyiVar = this.z;
        java.lang.String str2 = akfnVar.d;
        java.util.regex.Matcher matcher = ajyiVar.b(akfnVar.c).matcher(str);
        if (i == 3 && charSequence != null && charSequence.length() > 0 && akfnVar.h.length() > 0) {
            return matcher.replaceAll(s.matcher(str2).replaceFirst(akfnVar.h.replace("$CC", charSequence)));
        }
        java.lang.String str3 = akfnVar.f;
        return (i != 3 || str3.length() <= 0) ? matcher.replaceAll(str2) : matcher.replaceAll(s.matcher(str2).replaceFirst(str3));
    }

    public final void z(int i, int i2, java.lang.StringBuilder sb) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            sb.insert(0, i).insert(0, '+');
        } else if (i3 == 1) {
            sb.insert(0, " ").insert(0, i).insert(0, '+');
        }
    }
}
