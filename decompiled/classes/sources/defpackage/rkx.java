package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rkx implements defpackage.rld {
    public static final defpackage.rkx a;
    public static final defpackage.rkx b;
    private static final /* synthetic */ defpackage.rkx[] c;

    static {
        defpackage.rkx rkxVar = new defpackage.rkx("SDK", 0);
        a = rkxVar;
        defpackage.rkx rkxVar2 = new defpackage.rkx("FORM_FACTOR", 1);
        b = rkxVar2;
        defpackage.rkx[] rkxVarArr = {rkxVar, rkxVar2};
        c = rkxVarArr;
        defpackage.ajsz.am(rkxVarArr);
    }

    public static defpackage.rkx[] values() {
        return (defpackage.rkx[]) c.clone();
    }

    @Override // defpackage.rld
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        int i;
        defpackage.rln rlnVar = (defpackage.rln) obj;
        if (rlnVar == null) {
            defpackage.aooh.i("state");
        }
        defpackage.rla rlaVarA = rlnVar.a();
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            i = rlaVarA.c;
        } else {
            if (iOrdinal != 1) {
                throw new defpackage.aois();
            }
            i = rlaVarA.p;
        }
        return java.lang.Integer.valueOf(i);
    }
}
