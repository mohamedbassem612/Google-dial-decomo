package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vhc implements defpackage.vhe {
    public static final defpackage.vhc a;
    public static final defpackage.vhc b;
    public static final defpackage.vhc c;
    public static final defpackage.vhc d;
    public static final defpackage.vhc e;
    private static final /* synthetic */ defpackage.vhc[] f;

    static {
        defpackage.vhc vhcVar = new defpackage.vhc("FLAGS", 0);
        a = vhcVar;
        defpackage.vhc vhcVar2 = new defpackage.vhc("ENVELOPE", 1);
        b = vhcVar2;
        defpackage.vhc vhcVar3 = new defpackage.vhc("STRUCTURE", 2);
        c = vhcVar3;
        defpackage.vhc vhcVar4 = new defpackage.vhc("BODY_SANE", 3);
        d = vhcVar4;
        defpackage.vhc vhcVar5 = new defpackage.vhc("BODY", 4);
        e = vhcVar5;
        f = new defpackage.vhc[]{vhcVar, vhcVar2, vhcVar3, vhcVar4, vhcVar5};
    }

    public static defpackage.vhc[] values() {
        return (defpackage.vhc[]) f.clone();
    }
}
