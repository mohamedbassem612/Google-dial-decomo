package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nzo {
    public static final defpackage.nzo a;
    public static final defpackage.nzo b;
    private static final /* synthetic */ defpackage.nzo[] c;

    static {
        defpackage.nzo nzoVar = new defpackage.nzo("EMERGENCY_CALL", 0);
        a = nzoVar;
        defpackage.nzo nzoVar2 = new defpackage.nzo("EMERGENCY_CALLBACK", 1);
        b = nzoVar2;
        defpackage.nzo[] nzoVarArr = {nzoVar, nzoVar2};
        c = nzoVarArr;
        ajsz.am(nzoVarArr);
    }

    public static defpackage.nzo[] values() {
        return (defpackage.nzo[]) c.clone();
    }
}
