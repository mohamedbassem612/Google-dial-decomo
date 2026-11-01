package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ttc {
    public static final defpackage.ttc a;
    public static final defpackage.ttc b;
    public static final defpackage.ttc c;
    private static final /* synthetic */ defpackage.ttc[] d;

    static {
        defpackage.ttc ttcVar = new defpackage.ttc("NO_CHANGE", 0);
        a = ttcVar;
        defpackage.ttc ttcVar2 = new defpackage.ttc("CHANGE_REQUIRES_UI_UPDATE", 1);
        b = ttcVar2;
        defpackage.ttc ttcVar3 = new defpackage.ttc("CHANGE_DOES_NOT_REQUIRE_UI_UPDATE", 2);
        c = ttcVar3;
        defpackage.ttc[] ttcVarArr = {ttcVar, ttcVar2, ttcVar3};
        d = ttcVarArr;
        ajsz.am(ttcVarArr);
    }

    public static defpackage.ttc[] values() {
        return (defpackage.ttc[]) d.clone();
    }
}
