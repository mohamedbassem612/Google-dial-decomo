package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zfm {
    public static final defpackage.zfm a;
    public static final defpackage.zfm b;
    public static final defpackage.zfm c;
    public static final defpackage.zfm d;
    public static final defpackage.zfm e;
    public static final defpackage.zfm f;
    private static final /* synthetic */ defpackage.zfm[] g;

    static {
        defpackage.zfm zfmVar = new defpackage.zfm("SUCCESS", 0);
        a = zfmVar;
        defpackage.zfm zfmVar2 = new defpackage.zfm("FAILURE", 1);
        b = zfmVar2;
        defpackage.zfm zfmVar3 = new defpackage.zfm("FAILURE_SERVICE_NOT_AVAILABLE", 2);
        c = zfmVar3;
        defpackage.zfm zfmVar4 = new defpackage.zfm("FAILURE_SESSION_IS_TERMINATED", 3);
        d = zfmVar4;
        defpackage.zfm zfmVar5 = new defpackage.zfm("FAILURE_TIMED_OUT", 4);
        e = zfmVar5;
        defpackage.zfm zfmVar6 = new defpackage.zfm("FAILURE_REJECTED", 5);
        f = zfmVar6;
        defpackage.zfm[] zfmVarArr = {zfmVar, zfmVar2, zfmVar3, zfmVar4, zfmVar5, zfmVar6};
        g = zfmVarArr;
        ajsz.am(zfmVarArr);
    }

    public static defpackage.zfm[] values() {
        return (defpackage.zfm[]) g.clone();
    }
}
