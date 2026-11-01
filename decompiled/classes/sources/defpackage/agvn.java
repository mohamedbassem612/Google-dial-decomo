package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agvn {
    public static final defpackage.agvn a;
    public static final defpackage.agvn b;
    public static final defpackage.agvn c;
    public static final defpackage.agvn d;
    public static final defpackage.agvn e;
    private static final /* synthetic */ defpackage.agvn[] f;

    static {
        defpackage.agvn agvnVar = new defpackage.agvn("PROD", 0);
        a = agvnVar;
        defpackage.agvn agvnVar2 = new defpackage.agvn("DEV", 1);
        b = agvnVar2;
        defpackage.agvn agvnVar3 = new defpackage.agvn("ROBOLECTRIC", 2);
        c = agvnVar3;
        defpackage.agvn agvnVar4 = new defpackage.agvn("EMULATOR", 3);
        d = agvnVar4;
        defpackage.agvn agvnVar5 = new defpackage.agvn("UNKNOWN", 4);
        e = agvnVar5;
        f = new defpackage.agvn[]{agvnVar, agvnVar2, agvnVar3, agvnVar4, agvnVar5};
    }

    public static defpackage.agvn[] values() {
        return (defpackage.agvn[]) f.clone();
    }
}
