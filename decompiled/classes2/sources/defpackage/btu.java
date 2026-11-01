package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class btu {
    public static final defpackage.btu a;
    public static final defpackage.btu b;
    public static final defpackage.btu c;
    private static final /* synthetic */ defpackage.btu[] d;

    static {
        defpackage.btu btuVar = new defpackage.btu("Hidden", 0);
        a = btuVar;
        defpackage.btu btuVar2 = new defpackage.btu("Expanded", 1);
        b = btuVar2;
        defpackage.btu btuVar3 = new defpackage.btu("PartiallyExpanded", 2);
        c = btuVar3;
        defpackage.btu[] btuVarArr = {btuVar, btuVar2, btuVar3};
        d = btuVarArr;
        ajsz.am(btuVarArr);
    }

    public static defpackage.btu[] values() {
        return (defpackage.btu[]) d.clone();
    }
}
