package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zmb {
    public static final defpackage.zmb a;
    public static final defpackage.zmb b;
    public static final defpackage.zmb c;
    private static final /* synthetic */ defpackage.zmb[] d;

    static {
        defpackage.zmb zmbVar = new defpackage.zmb("DIALER_PHONE_METRICS_REQUEST", 0);
        a = zmbVar;
        defpackage.zmb zmbVar2 = new defpackage.zmb("DIALER_WEAR_METRICS_REQUEST", 1);
        b = zmbVar2;
        defpackage.zmb zmbVar3 = new defpackage.zmb("FEATUREDATA_NOT_SET", 2);
        c = zmbVar3;
        d = new defpackage.zmb[]{zmbVar, zmbVar2, zmbVar3};
    }

    public static defpackage.zmb[] values() {
        return (defpackage.zmb[]) d.clone();
    }
}
