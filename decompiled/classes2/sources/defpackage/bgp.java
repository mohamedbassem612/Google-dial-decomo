package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bgp {
    public static final defpackage.bgp a;
    public static final defpackage.bgp b;
    public static final defpackage.bgp c;
    private static final /* synthetic */ defpackage.bgp[] d;

    static {
        defpackage.bgp bgpVar = new defpackage.bgp("Cursor", 0);
        a = bgpVar;
        defpackage.bgp bgpVar2 = new defpackage.bgp("SelectionStart", 1);
        b = bgpVar2;
        defpackage.bgp bgpVar3 = new defpackage.bgp("SelectionEnd", 2);
        c = bgpVar3;
        defpackage.bgp[] bgpVarArr = {bgpVar, bgpVar2, bgpVar3};
        d = bgpVarArr;
        ajsz.am(bgpVarArr);
    }

    public static defpackage.bgp[] values() {
        return (defpackage.bgp[]) d.clone();
    }
}
