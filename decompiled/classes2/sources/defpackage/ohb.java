package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ohb {
    public static final defpackage.ohb a;
    public static final defpackage.ohb b;
    public static final defpackage.ohb c;
    public static final defpackage.ohb d;
    public static final defpackage.ohb e;
    public static final defpackage.ohb f;
    public static final defpackage.ohb g;
    public static final defpackage.ohb h;
    public static final defpackage.ohb i;
    private static final /* synthetic */ defpackage.ohb[] j;

    static {
        defpackage.ohb ohbVar = new defpackage.ohb("NOT_READY", 0);
        a = ohbVar;
        defpackage.ohb ohbVar2 = new defpackage.ohb("READY", 1);
        b = ohbVar2;
        defpackage.ohb ohbVar3 = new defpackage.ohb("NOTIFYING", 2);
        c = ohbVar3;
        defpackage.ohb ohbVar4 = new defpackage.ohb("NOTIFIED", 3);
        d = ohbVar4;
        defpackage.ohb ohbVar5 = new defpackage.ohb("TIMEOUT", 4);
        e = ohbVar5;
        defpackage.ohb ohbVar6 = new defpackage.ohb("UNREACHABLE", 5);
        f = ohbVar6;
        defpackage.ohb ohbVar7 = new defpackage.ohb("REJECTED", 6);
        g = ohbVar7;
        defpackage.ohb ohbVar8 = new defpackage.ohb("SERVICE_UNAVAILABLE", 7);
        h = ohbVar8;
        defpackage.ohb ohbVar9 = new defpackage.ohb("FAILURE", 8);
        i = ohbVar9;
        defpackage.ohb[] ohbVarArr = {ohbVar, ohbVar2, ohbVar3, ohbVar4, ohbVar5, ohbVar6, ohbVar7, ohbVar8, ohbVar9};
        j = ohbVarArr;
        ajsz.am(ohbVarArr);
    }

    public static defpackage.ohb[] values() {
        return (defpackage.ohb[]) j.clone();
    }
}
