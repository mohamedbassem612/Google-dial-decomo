package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zfj {
    public static final defpackage.zfj a;
    public static final defpackage.zfj b;
    public static final defpackage.zfj c;
    private static final /* synthetic */ defpackage.zfj[] d;

    static {
        defpackage.zfj zfjVar = new defpackage.zfj("TEST_ENTRY", 0);
        a = zfjVar;
        defpackage.zfj zfjVar2 = new defpackage.zfj("MESSAGE_SEND_NO_ACK", 1);
        b = zfjVar2;
        defpackage.zfj zfjVar3 = new defpackage.zfj("MESSAGE_SEND_WITH_ACK", 2);
        c = zfjVar3;
        defpackage.zfj[] zfjVarArr = {zfjVar, zfjVar2, zfjVar3};
        d = zfjVarArr;
        ajsz.am(zfjVarArr);
    }

    public static defpackage.zfj[] values() {
        return (defpackage.zfj[]) d.clone();
    }
}
