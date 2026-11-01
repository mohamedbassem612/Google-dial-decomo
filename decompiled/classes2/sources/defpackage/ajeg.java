package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajeg implements ajzt {
    public final aify h;
    public final aihd i;
    private final aigf l;
    public static final aenj a = new aenj("scooby.SpamProtectionService.");
    private static final aenj j = new aenj("scooby.SpamProtectionService/");
    public static final ajzs b = new defpackage.ajef(1, (byte[]) null);
    public static final ajzs c = new defpackage.ajef(0);
    public static final ajzs d = new defpackage.ajef(2, (char[]) null);
    public static final ajzs e = new defpackage.ajef(3, (short[]) null);
    public static final ajzs f = new defpackage.ajef(4, (int[]) null);
    public static final defpackage.ajeg g = new defpackage.ajeg();
    private static final aenj k = new aenj("telephonyspamprotect-pa.googleapis.com");

    private ajeg() {
        aift aiftVar = new aift(4);
        aiftVar.i("telephonyspamprotect-pa.googleapis.com");
        aiftVar.i("dogfood-telephonyspamprotect-pa.sandbox.googleapis.com");
        aiftVar.i("telephonyspamprotect-pa.googleapis.com");
        this.h = aiftVar.h();
        this.i = new aihb().h();
        ajzs ajzsVar = b;
        ajzs ajzsVar2 = c;
        ajzs ajzsVar3 = d;
        ajzs ajzsVar4 = e;
        ajzs ajzsVar5 = f;
        aihd.u(ajzsVar, ajzsVar2, ajzsVar3, ajzsVar4, ajzsVar5);
        aigb aigbVar = new aigb(4);
        aigbVar.i("GetSpamNumbers", ajzsVar);
        aigbVar.i("ReportSpam", ajzsVar2);
        aigbVar.i("AddMessageSpamSignal", ajzsVar3);
        aigbVar.i("GetCallerInfo", ajzsVar4);
        aigbVar.i("GetSpamEmbeddings", ajzsVar5);
        this.l = aigbVar.e(true);
        new aigb(4).e(true);
    }

    public final aenj a() {
        return k;
    }

    public final ajzs b(java.lang.String str) {
        java.lang.String str2 = j.a;
        if (str.startsWith(str2)) {
            java.lang.String strSubstring = str.substring(str2.length());
            aigf aigfVar = this.l;
            if (aigfVar.containsKey(strSubstring)) {
                return (ajzs) aigfVar.get(strSubstring);
            }
        }
        return null;
    }
}
