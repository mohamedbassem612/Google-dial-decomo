package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class twx {
    public static final defpackage.twx a;
    public static final defpackage.twx b;
    public static final defpackage.twx c;
    private static final /* synthetic */ defpackage.twx[] d;

    static {
        defpackage.twx twxVar = new defpackage.twx("IMMEDIATELY_START", 0);
        a = twxVar;
        defpackage.twx twxVar2 = new defpackage.twx("INTERRUPT_LOW_PRIORITY_SESSION", 1);
        b = twxVar2;
        defpackage.twx twxVar3 = new defpackage.twx("CANNOT_START", 2);
        c = twxVar3;
        defpackage.twx[] twxVarArr = {twxVar, twxVar2, twxVar3};
        d = twxVarArr;
        ajsz.am(twxVarArr);
    }

    public static defpackage.twx[] values() {
        return (defpackage.twx[]) d.clone();
    }
}
