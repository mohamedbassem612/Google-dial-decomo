package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hwa {
    public static final defpackage.hwa a;
    public static final defpackage.hwa b;
    private static final /* synthetic */ defpackage.hwa[] c;

    static {
        defpackage.hwa hwaVar = new defpackage.hwa("StartAudio", 0);
        a = hwaVar;
        defpackage.hwa hwaVar2 = new defpackage.hwa("StopAudio", 1);
        b = hwaVar2;
        defpackage.hwa[] hwaVarArr = {hwaVar, hwaVar2};
        c = hwaVarArr;
        ajsz.am(hwaVarArr);
    }

    public static defpackage.hwa[] values() {
        return (defpackage.hwa[]) c.clone();
    }
}
