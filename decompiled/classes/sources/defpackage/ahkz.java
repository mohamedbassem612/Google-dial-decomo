package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahkz {
    public static final defpackage.ahkz a;
    public static final defpackage.ahkz b;
    public static final defpackage.ahkz c;
    private static final /* synthetic */ defpackage.ahkz[] d;

    static {
        defpackage.ahkz ahkzVar = new defpackage.ahkz("ON_CHARGER", 0);
        a = ahkzVar;
        defpackage.ahkz ahkzVar2 = new defpackage.ahkz("ON_NETWORK_UNMETERED", 1);
        b = ahkzVar2;
        defpackage.ahkz ahkzVar3 = new defpackage.ahkz("ON_NETWORK_CONNECTED", 2);
        c = ahkzVar3;
        d = new defpackage.ahkz[]{ahkzVar, ahkzVar2, ahkzVar3};
    }

    public static defpackage.ahkz[] values() {
        return (defpackage.ahkz[]) d.clone();
    }
}
