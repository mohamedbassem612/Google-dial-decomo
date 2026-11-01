package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rky implements defpackage.rll {
    public static final defpackage.rky a;
    public static final defpackage.rky b;
    public static final defpackage.rky c;
    public static final defpackage.rky d;
    public static final defpackage.rky e;
    public static final defpackage.rky f;
    public static final defpackage.rky g;
    public static final defpackage.rky h;
    public static final defpackage.rky i;
    private static final /* synthetic */ defpackage.rky[] j;

    static {
        defpackage.rky rkyVar = new defpackage.rky("BRAND", 0);
        a = rkyVar;
        defpackage.rky rkyVar2 = new defpackage.rky("DEVICE", 1);
        b = rkyVar2;
        defpackage.rky rkyVar3 = new defpackage.rky("MANUFACTURER", 2);
        c = rkyVar3;
        defpackage.rky rkyVar4 = new defpackage.rky("MODEL", 3);
        d = rkyVar4;
        defpackage.rky rkyVar5 = new defpackage.rky("PRODUCT", 4);
        e = rkyVar5;
        defpackage.rky rkyVar6 = new defpackage.rky("OS_BUILD", 5);
        f = rkyVar6;
        defpackage.rky rkyVar7 = new defpackage.rky("FINGERPRINT", 6);
        g = rkyVar7;
        defpackage.rky rkyVar8 = new defpackage.rky("LOCALE_COUNTRY_ISO", 7);
        h = rkyVar8;
        defpackage.rky rkyVar9 = new defpackage.rky("LOCALE_LANGUAGE", 8);
        i = rkyVar9;
        defpackage.rky[] rkyVarArr = {rkyVar, rkyVar2, rkyVar3, rkyVar4, rkyVar5, rkyVar6, rkyVar7, rkyVar8, rkyVar9};
        j = rkyVarArr;
        defpackage.ajsz.am(rkyVarArr);
    }

    public static defpackage.rky[] values() {
        return (defpackage.rky[]) j.clone();
    }

    @Override // defpackage.rld
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        java.lang.String str;
        defpackage.rln rlnVar = (defpackage.rln) obj;
        if (rlnVar == null) {
            defpackage.aooh.i("state");
        }
        defpackage.rla rlaVarA = rlnVar.a();
        switch (ordinal()) {
            case 0:
                str = rlaVarA.f;
                break;
            case 1:
                str = rlaVarA.g;
                break;
            case 2:
                str = rlaVarA.h;
                break;
            case 3:
                str = rlaVarA.i;
                break;
            case 4:
                str = rlaVarA.j;
                break;
            case 5:
                str = rlaVarA.n;
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                str = rlaVarA.o;
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                str = rlaVarA.k;
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                str = rlaVarA.l;
                break;
            default:
                throw new defpackage.aois();
        }
        defpackage.aooh.e(str, "with(...)");
        return str;
    }
}
