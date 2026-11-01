package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zmj {
    public static final defpackage.zmj a;
    public static final defpackage.zmj b;
    public static final defpackage.zmj c;
    public static final defpackage.zmj d;
    public static final defpackage.zmj e;
    public static final defpackage.zmj f;
    private static final /* synthetic */ defpackage.zmj[] g;

    static {
        defpackage.zmj zmjVar = new defpackage.zmj("SENT_STATUS_UNDEFINED", 0);
        a = zmjVar;
        defpackage.zmj zmjVar2 = new defpackage.zmj("SUCCESS", 1);
        b = zmjVar2;
        defpackage.zmj zmjVar3 = new defpackage.zmj("NODE_OFFLINE", 2);
        c = zmjVar3;
        defpackage.zmj zmjVar4 = new defpackage.zmj("EXCEEDED_MAX_RETRIES", 3);
        d = zmjVar4;
        defpackage.zmj zmjVar5 = new defpackage.zmj("ERROR", 4);
        e = zmjVar5;
        defpackage.zmj zmjVar6 = new defpackage.zmj("CLIENT_API_UNAVAILABLE", 5);
        f = zmjVar6;
        defpackage.zmj[] zmjVarArr = {zmjVar, zmjVar2, zmjVar3, zmjVar4, zmjVar5, zmjVar6};
        g = zmjVarArr;
        ajsz.am(zmjVarArr);
    }

    public static defpackage.zmj[] values() {
        return (defpackage.zmj[]) g.clone();
    }
}
