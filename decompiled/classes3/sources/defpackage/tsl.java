package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tsl {
    public static final defpackage.tsl a;
    public static final defpackage.tsl b;
    public static final defpackage.tsl c;
    public static final defpackage.tsl d;
    private static final /* synthetic */ defpackage.tsl[] e;

    static {
        defpackage.tsl tslVar = new defpackage.tsl("NOT_STARTED", 0);
        a = tslVar;
        defpackage.tsl tslVar2 = new defpackage.tsl("PENDING", 1);
        b = tslVar2;
        defpackage.tsl tslVar3 = new defpackage.tsl("SUCCEEDED", 2);
        c = tslVar3;
        defpackage.tsl tslVar4 = new defpackage.tsl("ERROR", 3);
        d = tslVar4;
        defpackage.tsl[] tslVarArr = {tslVar, tslVar2, tslVar3, tslVar4};
        e = tslVarArr;
        ajsz.am(tslVarArr);
    }

    public static defpackage.tsl[] values() {
        return (defpackage.tsl[]) e.clone();
    }
}
