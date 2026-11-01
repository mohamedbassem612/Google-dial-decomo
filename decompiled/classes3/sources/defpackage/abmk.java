package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abmk {
    public static final defpackage.abmk a;
    public static final defpackage.abmk b;
    public static final defpackage.abmk c;
    private static final /* synthetic */ defpackage.abmk[] d;

    static {
        defpackage.abmk abmkVar = new defpackage.abmk("All", 0);
        a = abmkVar;
        defpackage.abmk abmkVar2 = new defpackage.abmk("Background", 1);
        b = abmkVar2;
        defpackage.abmk abmkVar3 = new defpackage.abmk("Foreground", 2);
        c = abmkVar3;
        defpackage.abmk[] abmkVarArr = {abmkVar, abmkVar2, abmkVar3};
        d = abmkVarArr;
        ajsz.am(abmkVarArr);
    }

    public static defpackage.abmk[] values() {
        return (defpackage.abmk[]) d.clone();
    }
}
