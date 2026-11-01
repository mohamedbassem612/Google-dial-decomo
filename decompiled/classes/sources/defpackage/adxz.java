package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adxz {
    public static final defpackage.adxz a;
    public static final defpackage.adxz b;
    public static final defpackage.adxz c;
    public static final defpackage.adxz d;
    public static final defpackage.adxz e;
    public static final defpackage.adxz f;
    private static final /* synthetic */ defpackage.adxz[] g;

    static {
        defpackage.adxz adxzVar = new defpackage.adxz("PRODUCTION", 0);
        a = adxzVar;
        defpackage.adxz adxzVar2 = new defpackage.adxz("AUTOPUSH", 1);
        b = adxzVar2;
        defpackage.adxz adxzVar3 = new defpackage.adxz("AUTOPUSH_QUAL_PLAYGROUND", 2);
        c = adxzVar3;
        defpackage.adxz adxzVar4 = new defpackage.adxz("STAGING", 3);
        d = adxzVar4;
        defpackage.adxz adxzVar5 = new defpackage.adxz("STAGING_QUAL_QA", 4);
        e = adxzVar5;
        defpackage.adxz adxzVar6 = new defpackage.adxz("DEV", 5);
        f = adxzVar6;
        defpackage.adxz[] adxzVarArr = {adxzVar, adxzVar2, adxzVar3, adxzVar4, adxzVar5, adxzVar6};
        g = adxzVarArr;
        defpackage.ajsz.am(adxzVarArr);
    }

    public static defpackage.adxz[] values() {
        return (defpackage.adxz[]) g.clone();
    }
}
