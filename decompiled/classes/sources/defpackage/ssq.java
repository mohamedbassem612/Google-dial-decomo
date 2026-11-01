package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ssq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/phonenumberutil/PhoneNumberHelper");
    private static final java.util.Set b = new java.util.HashSet(java.util.Arrays.asList("-1", "-2", "-3"));
    private final android.content.Context c;
    private final defpackage.oko d;
    private final defpackage.aogc e;

    public ssq(android.content.Context context, defpackage.aogc aogcVar, defpackage.oko okoVar) {
        this.c = context;
        this.e = aogcVar;
        this.d = okoVar;
    }

    public static final boolean h(java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str) && str.contains("#");
    }

    public final java.lang.CharSequence a(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return null;
        }
        return android.telephony.PhoneNumberUtils.createTtsSpannable(dxt.a().d(g(str, str2), dxv.a));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0152, code lost:
    
        if (r0.equals("310013") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x015b, code lost:
    
        if (r0.equals("310012") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0164, code lost:
    
        if (r0.equals("311390") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x016d, code lost:
    
        if (r0.equals("311110") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r0.equals("311489") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0176, code lost:
    
        if (r0.equals("310910") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x017f, code lost:
    
        if (r0.equals("310890") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0188, code lost:
    
        if (r0.equals("310590") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0191, code lost:
    
        if (r0.equals("310010") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x019a, code lost:
    
        if (r0.equals("310004") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r0.equals("311488") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r0.equals("311487") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r0.equals("311486") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (r0.equals("311485") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r0.equals("311484") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        if (r0.equals("311483") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        if (r0.equals("311482") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        if (r0.equals("311481") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        if (r0.equals("311480") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        if (r0.equals("311289") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0096, code lost:
    
        if (r0.equals("311288") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a0, code lost:
    
        if (r0.equals("311287") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00aa, code lost:
    
        if (r0.equals("311286") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b4, code lost:
    
        if (r0.equals("311285") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00be, code lost:
    
        if (r0.equals("311284") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c8, code lost:
    
        if (r0.equals("311283") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d2, code lost:
    
        if (r0.equals("311282") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00dc, code lost:
    
        if (r0.equals("311281") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e6, code lost:
    
        if (r0.equals("311280") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f0, code lost:
    
        if (r0.equals("311279") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00fa, code lost:
    
        if (r0.equals("311278") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0104, code lost:
    
        if (r0.equals("311277") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x010e, code lost:
    
        if (r0.equals("311276") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0118, code lost:
    
        if (r0.equals("311275") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0122, code lost:
    
        if (r0.equals("311274") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x012c, code lost:
    
        if (r0.equals("311273") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0136, code lost:
    
        if (r0.equals("311272") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0140, code lost:
    
        if (r0.equals("311271") != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0149, code lost:
    
        if (r0.equals("311270") != false) goto L125;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b() {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ssq.b():java.lang.String");
    }

    public final boolean c(java.lang.CharSequence charSequence, int i) {
        return (i != 1 || android.text.TextUtils.isEmpty(charSequence) || d(charSequence)) ? false : true;
    }

    public final boolean d(java.lang.CharSequence charSequence) {
        return charSequence != null && b.contains(charSequence.toString());
    }

    public final boolean e(java.lang.String str) {
        return this.d.X(str);
    }

    public final boolean f(java.lang.String str) {
        if (str != null) {
            return str.contains("@") || str.contains("%40");
        }
        return false;
    }

    public final java.lang.String g(java.lang.String str, java.lang.String str2) {
        java.lang.String number;
        if (str == null) {
            return null;
        }
        return (this.e.aD() || (number = android.telephony.PhoneNumberUtils.formatNumber(str, str2)) == null) ? str : number;
    }
}
