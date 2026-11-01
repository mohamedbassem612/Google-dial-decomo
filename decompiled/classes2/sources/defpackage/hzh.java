package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hzh {
    public static final defpackage.hzh a;
    public static final defpackage.hzh b;
    public static final defpackage.hzh c;
    private static final /* synthetic */ defpackage.hzh[] d;

    static {
        defpackage.hzh hzhVar = new defpackage.hzh("DOWNLINK", 0);
        a = hzhVar;
        defpackage.hzh hzhVar2 = new defpackage.hzh("DOWNLINK_AND_UPLINK", 1);
        b = hzhVar2;
        defpackage.hzh hzhVar3 = new defpackage.hzh("UPLINK", 2);
        c = hzhVar3;
        d = new defpackage.hzh[]{hzhVar, hzhVar2, hzhVar3};
    }

    public static defpackage.hzh[] values() {
        return (defpackage.hzh[]) d.clone();
    }
}
