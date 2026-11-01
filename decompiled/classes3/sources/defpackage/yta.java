package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yta {
    public static final defpackage.yta a;
    public static final defpackage.yta b;
    public static final defpackage.yta c;
    public static final defpackage.yta d;
    public static final defpackage.yta e;
    public static final defpackage.yta f;
    public static final defpackage.yta g;
    private static final /* synthetic */ defpackage.yta[] h;

    static {
        defpackage.yta ytaVar = new defpackage.yta("NEED_UPDATE", 0);
        a = ytaVar;
        defpackage.yta ytaVar2 = new defpackage.yta("FEATURE_UNAVAILABLE", 1);
        b = ytaVar2;
        defpackage.yta ytaVar3 = new defpackage.yta("FEATURE_NOT_FOUND", 2);
        c = ytaVar3;
        defpackage.yta ytaVar4 = new defpackage.yta("MISSING_MODEL", 3);
        d = ytaVar4;
        defpackage.yta ytaVar5 = new defpackage.yta("DOWNLOADING_MODEL", 4);
        e = ytaVar5;
        defpackage.yta ytaVar6 = new defpackage.yta("DOWNLOADED_MODEL", 5);
        f = ytaVar6;
        defpackage.yta ytaVar7 = new defpackage.yta("MODEL_VERSION_DOES_NOT_MEET_MINIMUM", 6);
        g = ytaVar7;
        defpackage.yta[] ytaVarArr = {ytaVar, ytaVar2, ytaVar3, ytaVar4, ytaVar5, ytaVar6, ytaVar7};
        h = ytaVarArr;
        ajsz.am(ytaVarArr);
    }

    public static defpackage.yta[] values() {
        return (defpackage.yta[]) h.clone();
    }
}
