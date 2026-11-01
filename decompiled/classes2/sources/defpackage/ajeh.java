package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajeh implements ajzt {
    public final aify l;
    public final aihd m;
    private final aigf p;
    public static final aenj a = new aenj("google.communications.businesscalls.mobile.v1.MobileService.");
    private static final aenj n = new aenj("google.communications.businesscalls.mobile.v1.MobileService/");
    public static final ajzs b = new defpackage.ajef(5, (boolean[]) null);
    public static final ajzs c = new defpackage.ajef(6, (float[]) null);
    public static final ajzs d = new defpackage.ajef(7, (byte[][]) null);
    public static final ajzs e = new defpackage.ajef(8, (char[][]) null);
    public static final ajzs f = new defpackage.ajef(9, (short[][]) null);
    public static final ajzs g = new defpackage.ajef(10, (int[][]) null);
    public static final ajzs h = new defpackage.ajef(11, (boolean[][]) null);
    public static final ajzs i = new defpackage.ajef(12, (float[][]) null);
    public static final ajzs j = new defpackage.ajef(13, (byte[][][]) null);
    public static final defpackage.ajeh k = new defpackage.ajeh();
    private static final aenj o = new aenj("businesscalls.googleapis.com");

    private ajeh() {
        aift aiftVar = new aift(4);
        aiftVar.i("autopush-businesscalls.mtls.sandbox.googleapis.com");
        aiftVar.i("autopush-businesscalls.sandbox.googleapis.com");
        aiftVar.i("businesscalls.mtls.googleapis.com");
        aiftVar.i("oneplatformcontrolplane-businesscalls.mtls.sandbox.googleapis.com");
        aiftVar.i("oneplatformcontrolplane-businesscalls.sandbox.googleapis.com");
        aiftVar.i("staging-businesscalls.mtls.sandbox.googleapis.com");
        aiftVar.i("staging-businesscalls.sandbox.googleapis.com");
        aiftVar.i("businesscalls.googleapis.com");
        this.l = aiftVar.h();
        this.m = new aihb().h();
        ajzs ajzsVar = b;
        ajzs ajzsVar2 = c;
        ajzs ajzsVar3 = d;
        ajzs ajzsVar4 = e;
        ajzs ajzsVar5 = f;
        ajzs ajzsVar6 = g;
        ajzs ajzsVar7 = h;
        ajzs ajzsVar8 = i;
        ajzs ajzsVar9 = j;
        aihd.v(ajzsVar, ajzsVar2, ajzsVar3, ajzsVar4, ajzsVar5, ajzsVar6, new ajzs[]{ajzsVar7, ajzsVar8, ajzsVar9});
        aigb aigbVar = new aigb(4);
        aigbVar.i("FetchVcallVerification", ajzsVar);
        aigbVar.i("RecordVcallEvent", ajzsVar2);
        aigbVar.i("RecordVcallUserConsent", ajzsVar3);
        aigbVar.i("RecordBvRealTimeMetrics", ajzsVar4);
        aigbVar.i("FetchBusinessMessagingData", ajzsVar5);
        aigbVar.i("FetchBusinessData", ajzsVar6);
        aigbVar.i("FetchUserData", ajzsVar7);
        aigbVar.i("SetupCallDataSession", ajzsVar8);
        aigbVar.i("TerminateCallDataSession", ajzsVar9);
        this.p = aigbVar.e(true);
        new aigb(4).e(true);
    }

    public final aenj a() {
        return o;
    }

    public final ajzs b(java.lang.String str) {
        java.lang.String str2 = n.a;
        if (str.startsWith(str2)) {
            java.lang.String strSubstring = str.substring(str2.length());
            aigf aigfVar = this.p;
            if (aigfVar.containsKey(strSubstring)) {
                return (ajzs) aigfVar.get(strSubstring);
            }
        }
        return null;
    }
}
