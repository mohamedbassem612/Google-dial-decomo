package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jac {
    public static final defpackage.jac a;
    public static final defpackage.jac b;
    public static final defpackage.jac c;
    public static final defpackage.jac d;
    private static final /* synthetic */ defpackage.jac[] e;

    static {
        defpackage.jac jacVar = new defpackage.jac("Countdown", 0);
        a = jacVar;
        defpackage.jac jacVar2 = new defpackage.jac("Recording", 1);
        b = jacVar2;
        defpackage.jac jacVar3 = new defpackage.jac("Paused", 2);
        c = jacVar3;
        defpackage.jac jacVar4 = new defpackage.jac("Restarting", 3);
        d = jacVar4;
        defpackage.jac[] jacVarArr = {jacVar, jacVar2, jacVar3, jacVar4};
        e = jacVarArr;
        ajsz.am(jacVarArr);
    }

    public static defpackage.jac[] values() {
        return (defpackage.jac[]) e.clone();
    }
}
