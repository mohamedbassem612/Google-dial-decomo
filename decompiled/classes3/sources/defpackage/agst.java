package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agst {
    public static final defpackage.agst a;
    public static final defpackage.agst b;
    public static final defpackage.agst c;
    private static final /* synthetic */ defpackage.agst[] d;

    static {
        defpackage.agst agstVar = new defpackage.agst("STOPPED", 0);
        a = agstVar;
        defpackage.agst agstVar2 = new defpackage.agst("STARTING", 1);
        b = agstVar2;
        defpackage.agst agstVar3 = new defpackage.agst("STARTED", 2);
        c = agstVar3;
        d = new defpackage.agst[]{agstVar, agstVar2, agstVar3};
    }

    public static defpackage.agst[] values() {
        return (defpackage.agst[]) d.clone();
    }
}
