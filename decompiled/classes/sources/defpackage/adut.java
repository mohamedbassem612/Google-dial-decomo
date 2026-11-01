package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adut {
    public static final defpackage.adut a;
    public static final defpackage.adut b;
    public static final defpackage.adut c;
    public static final defpackage.adut d;
    public static final defpackage.adut e;
    private static final /* synthetic */ defpackage.adut[] f;

    static {
        defpackage.adut adutVar = new defpackage.adut("PRODUCTION", 0);
        a = adutVar;
        defpackage.adut adutVar2 = new defpackage.adut("STAGING_QUAL_QA", 1);
        b = adutVar2;
        defpackage.adut adutVar3 = new defpackage.adut("AUTOPUSH", 2);
        c = adutVar3;
        defpackage.adut adutVar4 = new defpackage.adut("AUTOPUSH_QUAL_PLAYGROUND", 3);
        d = adutVar4;
        defpackage.adut adutVar5 = new defpackage.adut("DEV", 4);
        e = adutVar5;
        f = new defpackage.adut[]{adutVar, adutVar2, adutVar3, adutVar4, adutVar5};
    }

    public static defpackage.adut[] values() {
        return (defpackage.adut[]) f.clone();
    }
}
