package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aso {
    public static final defpackage.aso a;
    public static final defpackage.aso b;
    private static final /* synthetic */ defpackage.aso[] c;

    static {
        defpackage.aso asoVar = new defpackage.aso("Vertical", 0);
        a = asoVar;
        defpackage.aso asoVar2 = new defpackage.aso("Horizontal", 1);
        b = asoVar2;
        defpackage.aso[] asoVarArr = {asoVar, asoVar2};
        c = asoVarArr;
        defpackage.ajsz.am(asoVarArr);
    }

    public static defpackage.aso[] values() {
        return (defpackage.aso[]) c.clone();
    }
}
