package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nje {
    public static final defpackage.nje a;
    public static final defpackage.nje b;
    public static final defpackage.nje c;
    public static final defpackage.nje d;
    public static final defpackage.nje e;
    private static final /* synthetic */ defpackage.nje[] f;

    static {
        defpackage.nje njeVar = new defpackage.nje("MANUAL_SCREENING", 0);
        a = njeVar;
        defpackage.nje njeVar2 = new defpackage.nje("AUTO_SCREENING", 1);
        b = njeVar2;
        defpackage.nje njeVar3 = new defpackage.nje("BAM", 2);
        c = njeVar3;
        defpackage.nje njeVar4 = new defpackage.nje("BEESLY", 3);
        d = njeVar4;
        defpackage.nje njeVar5 = new defpackage.nje("CALL_SCREEN_LITE", 4);
        e = njeVar5;
        defpackage.nje[] njeVarArr = {njeVar, njeVar2, njeVar3, njeVar4, njeVar5};
        f = njeVarArr;
        ajsz.am(njeVarArr);
    }

    public static defpackage.nje[] values() {
        return (defpackage.nje[]) f.clone();
    }
}
