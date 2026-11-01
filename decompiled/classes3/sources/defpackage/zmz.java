package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zmz {
    public static final defpackage.zmz a;
    public static final defpackage.zmz b;
    public static final defpackage.zmz c;
    private static final /* synthetic */ defpackage.zmz[] d;

    static {
        defpackage.zmz zmzVar = new defpackage.zmz("MERGE_NONE", 0);
        a = zmzVar;
        defpackage.zmz zmzVar2 = new defpackage.zmz("MERGE_IN_PROGRESS", 1);
        b = zmzVar2;
        defpackage.zmz zmzVar3 = new defpackage.zmz("MERGE_COMPLETE", 2);
        c = zmzVar3;
        d = new defpackage.zmz[]{zmzVar, zmzVar2, zmzVar3};
    }

    public static defpackage.zmz[] values() {
        return (defpackage.zmz[]) d.clone();
    }
}
