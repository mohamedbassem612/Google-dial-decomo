package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vrr {
    public static final defpackage.vrr a;
    public static final defpackage.vrr b;
    public static final defpackage.vrr c;
    private static final /* synthetic */ defpackage.vrr[] d;

    static {
        defpackage.vrr vrrVar = new defpackage.vrr("ENABLED", 0);
        a = vrrVar;
        defpackage.vrr vrrVar2 = new defpackage.vrr("DISABLED", 1);
        b = vrrVar2;
        defpackage.vrr vrrVar3 = new defpackage.vrr("UNAVAILABLE", 2);
        c = vrrVar3;
        d = new defpackage.vrr[]{vrrVar, vrrVar2, vrrVar3};
    }

    public static defpackage.vrr[] values() {
        return (defpackage.vrr[]) d.clone();
    }
}
