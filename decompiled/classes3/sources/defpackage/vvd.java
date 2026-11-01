package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class vvd {
    public static final defpackage.vvd a;
    public static final defpackage.vvd b;
    public static final defpackage.vvd c;
    private static final /* synthetic */ defpackage.vvd[] d;

    static {
        defpackage.vvd vvdVar = new defpackage.vvd("CARRIER_APP_INSTALLED", 0);
        a = vvdVar;
        defpackage.vvd vvdVar2 = new defpackage.vvd("VVM_DISABLED", 1);
        b = vvdVar2;
        defpackage.vvd vvdVar3 = new defpackage.vvd("NOT_DEFAULT_DATA_SIM", 2);
        c = vvdVar3;
        defpackage.vvd[] vvdVarArr = {vvdVar, vvdVar2, vvdVar3};
        d = vvdVarArr;
        ajsz.am(vvdVarArr);
    }

    public static defpackage.vvd[] values() {
        return (defpackage.vvd[]) d.clone();
    }
}
