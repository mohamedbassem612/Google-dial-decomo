package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bkb {
    public static final defpackage.bkb a;
    public static final defpackage.bkb b;
    public static final defpackage.bkb c;
    public static final defpackage.bkb d;
    private static final /* synthetic */ defpackage.bkb[] e;

    static {
        defpackage.bkb bkbVar = new defpackage.bkb("Up", 0);
        a = bkbVar;
        defpackage.bkb bkbVar2 = new defpackage.bkb("Drag", 1);
        b = bkbVar2;
        defpackage.bkb bkbVar3 = new defpackage.bkb("Timeout", 2);
        c = bkbVar3;
        defpackage.bkb bkbVar4 = new defpackage.bkb("Cancel", 3);
        d = bkbVar4;
        defpackage.bkb[] bkbVarArr = {bkbVar, bkbVar2, bkbVar3, bkbVar4};
        e = bkbVarArr;
        ajsz.am(bkbVarArr);
    }

    public static defpackage.bkb[] values() {
        return (defpackage.bkb[]) e.clone();
    }
}
