package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pyx {
    public static final defpackage.pyx a;
    public static final defpackage.pyx b;
    public static final defpackage.pyx c;
    public static final defpackage.pyx d;
    private static final /* synthetic */ defpackage.pyx[] e;

    static {
        defpackage.pyx pyxVar = new defpackage.pyx("HOLD_FOR_ME", 0);
        a = pyxVar;
        defpackage.pyx pyxVar2 = new defpackage.pyx("CALL_IS_RECORDING_UTTERANCE", 1);
        b = pyxVar2;
        defpackage.pyx pyxVar3 = new defpackage.pyx("RECURRING_BEEP", 2);
        c = pyxVar3;
        defpackage.pyx pyxVar4 = new defpackage.pyx("SINGLE_BEEP", 3);
        d = pyxVar4;
        defpackage.pyx[] pyxVarArr = {pyxVar, pyxVar2, pyxVar3, pyxVar4};
        e = pyxVarArr;
        ajsz.am(pyxVarArr);
    }

    public static defpackage.pyx[] values() {
        return (defpackage.pyx[]) e.clone();
    }
}
