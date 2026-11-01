package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sfb {
    public static final defpackage.sfb a;
    public static final defpackage.sfb b;
    public static final defpackage.sfb c;
    private static final /* synthetic */ defpackage.sfb[] d;

    static {
        defpackage.sfb sfbVar = new defpackage.sfb("CONTACTS_ONLY", 0);
        a = sfbVar;
        defpackage.sfb sfbVar2 = new defpackage.sfb("EVERYONE", 1);
        b = sfbVar2;
        defpackage.sfb sfbVar3 = new defpackage.sfb("NO_ONE", 2);
        c = sfbVar3;
        defpackage.sfb[] sfbVarArr = {sfbVar, sfbVar2, sfbVar3};
        d = sfbVarArr;
        ajsz.am(sfbVarArr);
    }

    public static defpackage.sfb[] values() {
        return (defpackage.sfb[]) d.clone();
    }
}
