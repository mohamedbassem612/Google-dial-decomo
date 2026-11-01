package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fzi {
    public static final defpackage.fzi a;
    public static final defpackage.fzi b;
    public static final defpackage.fzi c;
    private static final /* synthetic */ defpackage.fzi[] d;

    static {
        defpackage.fzi fziVar = new defpackage.fzi("ITEM_TO_PLACEHOLDER", 0);
        a = fziVar;
        defpackage.fzi fziVar2 = new defpackage.fzi("PLACEHOLDER_TO_ITEM", 1);
        b = fziVar2;
        defpackage.fzi fziVar3 = new defpackage.fzi("PLACEHOLDER_POSITION_CHANGE", 2);
        c = fziVar3;
        defpackage.fzi[] fziVarArr = {fziVar, fziVar2, fziVar3};
        d = fziVarArr;
        ajsz.am(fziVarArr);
    }

    public static defpackage.fzi[] values() {
        return (defpackage.fzi[]) d.clone();
    }
}
