package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nvr {
    public static final defpackage.nvr a;
    public static final defpackage.nvr b;
    public static final defpackage.nvr c;
    public static final defpackage.nvr d;
    public static final defpackage.nvr e;
    private static final /* synthetic */ defpackage.nvr[] f;

    static {
        defpackage.nvr nvrVar = new defpackage.nvr("CAN_SELECT", 0);
        a = nvrVar;
        defpackage.nvr nvrVar2 = new defpackage.nvr("OTHER_SIM_IN_USE", 1);
        b = nvrVar2;
        defpackage.nvr nvrVar3 = new defpackage.nvr("NO_VIDEO_CALL_SUPPORT", 2);
        c = nvrVar3;
        defpackage.nvr nvrVar4 = new defpackage.nvr("NO_VIDEO_CALL", 3);
        d = nvrVar4;
        defpackage.nvr nvrVar5 = new defpackage.nvr("NO_SIGNAL", 4);
        e = nvrVar5;
        defpackage.nvr[] nvrVarArr = {nvrVar, nvrVar2, nvrVar3, nvrVar4, nvrVar5};
        f = nvrVarArr;
        ajsz.am(nvrVarArr);
    }

    public static defpackage.nvr[] values() {
        return (defpackage.nvr[]) f.clone();
    }
}
