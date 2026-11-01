package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nml {
    public static final defpackage.nml a;
    public static final defpackage.nml b;
    public static final defpackage.nml c;
    private static final /* synthetic */ defpackage.nml[] d;

    static {
        defpackage.nml nmlVar = new defpackage.nml("NO_CHANGE", 0);
        a = nmlVar;
        defpackage.nml nmlVar2 = new defpackage.nml("CHANGE_REQUIRES_UI_UPDATE", 1);
        b = nmlVar2;
        defpackage.nml nmlVar3 = new defpackage.nml("CHANGE_DOES_NOT_REQUIRE_UI_UPDATE", 2);
        c = nmlVar3;
        defpackage.nml[] nmlVarArr = {nmlVar, nmlVar2, nmlVar3};
        d = nmlVarArr;
        ajsz.am(nmlVarArr);
    }

    public static defpackage.nml[] values() {
        return (defpackage.nml[]) d.clone();
    }
}
