package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fst implements defpackage.frt {
    private static final java.util.regex.Pattern a = java.util.regex.Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    private static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("\\{\\\\.*?\\}");
    private final java.lang.StringBuilder c = new java.lang.StringBuilder();
    private final java.util.ArrayList d = new java.util.ArrayList();
    private final defpackage.etx e = new defpackage.etx();
    private final defpackage.eqg f;

    public fst(defpackage.eqg eqgVar) {
        this.f = eqgVar;
    }

    public static float d(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new java.lang.IllegalArgumentException();
    }

    private static long e(java.util.regex.Matcher matcher, int i) {
        java.lang.String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? java.lang.Long.parseLong(strGroup) * 3600000 : 0L;
        java.lang.String strGroup2 = matcher.group(i + 2);
        ahvr.ci(strGroup2);
        long j2 = java.lang.Long.parseLong(strGroup2) * 60000;
        java.lang.String strGroup3 = matcher.group(i + 3);
        ahvr.ci(strGroup3);
        long j3 = java.lang.Long.parseLong(strGroup3) * 1000;
        java.lang.String strGroup4 = matcher.group(i + 4);
        long j4 = j + j2 + j3;
        if (strGroup4 != null) {
            j4 += java.lang.Long.parseLong(strGroup4);
        }
        return j4 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    private static final defpackage.ess f(android.text.Spanned spanned, java.lang.String str) {
        int i;
        defpackage.esr esrVar = new defpackage.esr();
        esrVar.d(spanned);
        if (str == null) {
            return esrVar.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    esrVar.f = 1;
                    i = 1;
                } else {
                    esrVar.f = 0;
                    i = 0;
                }
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    esrVar.f = 1;
                    i = 1;
                } else {
                    esrVar.f = 2;
                    i = 2;
                }
                break;
            case -685620617:
                if (!str.equals("{\\an4}")) {
                    esrVar.f = 1;
                    i = 1;
                } else {
                    esrVar.f = 0;
                    i = 0;
                }
                break;
            case -685620555:
                if (!str.equals("{\\an6}")) {
                    esrVar.f = 1;
                    i = 1;
                } else {
                    esrVar.f = 2;
                    i = 2;
                }
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    esrVar.f = 1;
                    i = 1;
                } else {
                    esrVar.f = 0;
                    i = 0;
                }
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    esrVar.f = 1;
                    i = 1;
                } else {
                    esrVar.f = 2;
                    i = 2;
                }
                break;
            default:
                esrVar.f = 1;
                i = 1;
                break;
        }
        switch (str) {
            case "{\an1}":
            case "{\an2}":
            case "{\an3}":
                esrVar.d = 2;
                break;
            case "{\an7}":
            case "{\an8}":
            case "{\an9}":
                esrVar.d = 0;
                break;
            default:
                esrVar.d = 1;
                break;
        }
        esrVar.e = d(i);
        esrVar.c(d(esrVar.d), 0);
        return esrVar.a();
    }

    @Override // defpackage.frt
    public final /* synthetic */ defpackage.frj a(byte[] bArr, int i, int i2) {
        return defpackage.fsu.a(this, bArr, i2);
    }

    @Override // defpackage.frt
    public final void b(byte[] bArr, int i, int i2, defpackage.frs frsVar, java.util.function.Consumer consumer) {
        java.nio.charset.Charset charsetE;
        defpackage.etx etxVar;
        long j;
        java.lang.String str;
        defpackage.fst fstVar = this;
        defpackage.etx etxVar2 = fstVar.e;
        etxVar2.O(bArr, i + i2);
        etxVar2.Q(i);
        java.lang.String str2 = fstVar.f.o;
        int i3 = defpackage.eqz.a;
        if ((str2 != null && (str2.startsWith("video/webm") || str2.startsWith("audio/webm") || str2.startsWith("application/webm") || str2.startsWith("video/x-matroska") || str2.startsWith("audio/x-matroska") || str2.startsWith("application/x-matroska"))) || (charsetE = etxVar2.E()) == null) {
            charsetE = java.nio.charset.StandardCharsets.UTF_8;
        }
        aihd aihdVar = defpackage.etx.a;
        ahvr.ci(charsetE);
        if (!aihdVar.contains(charsetE)) {
            etxVar2.N(new java.lang.String(etxVar2.b, etxVar2.c, etxVar2.d(), charsetE).getBytes(java.nio.charset.StandardCharsets.UTF_8));
            charsetE = java.nio.charset.StandardCharsets.UTF_8;
        }
        long j2 = -9223372036854775807L;
        java.util.ArrayList arrayList = (frsVar.b == -9223372036854775807L || !frsVar.c) ? null : new java.util.ArrayList();
        while (true) {
            java.lang.String strA = etxVar2.A(charsetE);
            int i4 = 0;
            if (strA == null) {
                break;
            }
            if (strA.isEmpty()) {
                etxVar = etxVar2;
                j = j2;
            } else {
                try {
                    java.lang.Integer.parseInt(strA);
                    defpackage.etx etxVar3 = fstVar.e;
                    java.lang.String strA2 = etxVar3.A(charsetE);
                    if (strA2 == null) {
                        defpackage.etr.f("SubripParser", "Unexpected end");
                        break;
                    }
                    java.util.regex.Matcher matcher = a.matcher(strA2);
                    if (matcher.matches()) {
                        long jE = e(matcher, 1);
                        long jE2 = e(matcher, 6);
                        java.lang.StringBuilder sb = fstVar.c;
                        sb.setLength(0);
                        java.util.ArrayList arrayList2 = fstVar.d;
                        arrayList2.clear();
                        java.lang.String strA3 = etxVar3.A(charsetE);
                        while (!android.text.TextUtils.isEmpty(strA3)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            java.lang.String strTrim = strA3.trim();
                            long j3 = j2;
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(strTrim);
                            java.util.regex.Matcher matcher2 = b.matcher(strTrim);
                            int i5 = i4;
                            while (matcher2.find()) {
                                java.lang.String strGroup = matcher2.group();
                                arrayList2.add(strGroup);
                                int iStart = matcher2.start() - i5;
                                int length = strGroup.length();
                                sb2.replace(iStart, iStart + length, "");
                                i5 += length;
                                matcher2 = matcher2;
                                etxVar2 = etxVar2;
                            }
                            sb.append(sb2.toString());
                            j2 = j3;
                            strA3 = etxVar3.A(charsetE);
                            i4 = 0;
                        }
                        etxVar = etxVar2;
                        j = j2;
                        android.text.Spanned spannedM = fh$.ExternalSyntheticApiModelOutline0.m(sb.toString(), 0);
                        int i6 = 0;
                        while (true) {
                            if (i6 >= arrayList2.size()) {
                                str = null;
                                break;
                            }
                            str = (java.lang.String) arrayList2.get(i6);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                        long j4 = frsVar.b;
                        if (j4 == j || jE2 >= j4) {
                            aa$.ExternalSyntheticApiModelOutline1.m(consumer, new defpackage.frf(aify.p(f(spannedM, str)), jE, jE2 - jE));
                        } else if (arrayList != null) {
                            arrayList.add(new defpackage.frf(aify.p(f(spannedM, str)), jE, jE2 - jE));
                        }
                    } else {
                        etxVar = etxVar2;
                        j = j2;
                        defpackage.etr.f("SubripParser", "Skipping invalid timing: ".concat(strA2));
                    }
                } catch (java.lang.NumberFormatException unused) {
                    etxVar = etxVar2;
                    j = j2;
                    defpackage.etr.f("SubripParser", "Skipping invalid index: ".concat(strA));
                }
            }
            fstVar = this;
            j2 = j;
            etxVar2 = etxVar;
        }
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                aa$.ExternalSyntheticApiModelOutline1.m(consumer, (defpackage.frf) arrayList.get(i7));
            }
        }
    }

    @Override // defpackage.frt
    public final /* synthetic */ void c() {
    }
}
