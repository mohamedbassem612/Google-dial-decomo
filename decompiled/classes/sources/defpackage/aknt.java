package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aknt implements defpackage.ajzt {
    public final defpackage.aify k;
    public final defpackage.aihd l;
    private final defpackage.aigf o;
    public static final defpackage.aenj a = new defpackage.aenj("google.internal.dialer.v1.DialerCallInfoLookupService.");
    private static final defpackage.aenj m = new defpackage.aenj("google.internal.dialer.v1.DialerCallInfoLookupService/");
    public static final defpackage.ajzs b = new defpackage.akns(1, (byte[]) null);
    public static final defpackage.ajzs c = new defpackage.akns(0);
    public static final defpackage.ajzs d = new defpackage.akns(2, (char[]) null);
    public static final defpackage.ajzs e = new defpackage.akns(3, (short[]) null);
    public static final defpackage.ajzs f = new defpackage.akns(4, (int[]) null);
    public static final defpackage.ajzs g = new defpackage.akns(5, (boolean[]) null);
    public static final defpackage.ajzs h = new defpackage.akns(6, (float[]) null);
    public static final defpackage.ajzs i = new akmf(6, (float[]) null);
    public static final defpackage.aknt j = new defpackage.aknt();
    private static final defpackage.aenj n = new defpackage.aenj("dialercallinfolookup-pa.googleapis.com");

    private aknt() {
        defpackage.aift aiftVar = new defpackage.aift(4);
        aiftVar.i("autopush-dialercallinfolookup-pa.mtls.sandbox.googleapis.com");
        aiftVar.i("autopush-dialercallinfolookup-pa.sandbox.googleapis.com");
        aiftVar.i("dialercallinfolookup-pa.mtls.googleapis.com");
        aiftVar.i("preprod-dialercallinfolookup-pa.googleapis.com");
        aiftVar.i("preprod-dialercallinfolookup-pa.mtls.googleapis.com");
        aiftVar.i("prodlocal-dialercallinfolookup-pa.mtls.sandbox.googleapis.com");
        aiftVar.i("prodlocal-dialercallinfolookup-pa.sandbox.googleapis.com");
        aiftVar.i("staging-dialercallinfolookup-pa.mtls.sandbox.googleapis.com");
        aiftVar.i("staging-dialercallinfolookup-pa.sandbox.googleapis.com");
        aiftVar.i("dialercallinfolookup-pa.googleapis.com");
        this.k = aiftVar.g();
        this.l = new defpackage.aihb().g();
        defpackage.ajzs ajzsVar = b;
        defpackage.ajzs ajzsVar2 = c;
        defpackage.ajzs ajzsVar3 = d;
        defpackage.ajzs ajzsVar4 = e;
        defpackage.ajzs ajzsVar5 = f;
        defpackage.ajzs ajzsVar6 = g;
        defpackage.ajzs ajzsVar7 = h;
        defpackage.ajzs ajzsVar8 = i;
        defpackage.aihd.v(ajzsVar, ajzsVar2, ajzsVar3, ajzsVar4, ajzsVar5, ajzsVar6, ajzsVar7, ajzsVar8);
        defpackage.aigb aigbVar = new defpackage.aigb(4);
        aigbVar.i("GetCallInfo", ajzsVar);
        aigbVar.i("GetXatuInfo", ajzsVar2);
        aigbVar.i("CheckBlocklisting", ajzsVar3);
        aigbVar.i("GrantPhoneBasedCallingCardAcl", ajzsVar4);
        aigbVar.i("DeleteMyCallingCard", ajzsVar5);
        aigbVar.i("UpdateMyCallingCard", ajzsVar6);
        aigbVar.i("GetSelfMyCallingCard", ajzsVar7);
        aigbVar.i("RemixCallingCardBackdrop", ajzsVar8);
        this.o = aigbVar.e(true);
        new defpackage.aigb(4).e(true);
    }

    @Override // defpackage.ajzt
    public final defpackage.aenj a() {
        return n;
    }

    @Override // defpackage.ajzt
    public final defpackage.ajzs b(java.lang.String str) {
        java.lang.String str2 = m.a;
        if (str.startsWith(str2)) {
            java.lang.String strSubstring = str.substring(str2.length());
            defpackage.aigf aigfVar = this.o;
            if (aigfVar.containsKey(strSubstring)) {
                return (defpackage.ajzs) aigfVar.get(strSubstring);
            }
        }
        return null;
    }
}
