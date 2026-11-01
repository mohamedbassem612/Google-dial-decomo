package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sat extends defpackage.sai {
    public static final defpackage.sat a = new defpackage.sat();
    public static final java.util.function.Function b = defpackage.saq.a;
    public static final java.util.function.Function c = defpackage.sar.a;

    @Override // defpackage.sai
    public final void b(defpackage.akmm akmmVar, akzx akzxVar) {
        aooh.f(akmmVar, "from");
        aooh.f(akzxVar, "to");
        java.lang.String str = akmmVar.e;
        aooh.e(str, "getOwnerId(...)");
        if (str.length() > 0) {
            java.lang.String str2 = akmmVar.e;
            akzxVar.u();
            defpackage.abxt abxtVar = (defpackage.abxt) akzxVar.b;
            defpackage.abxt abxtVar2 = defpackage.abxt.a;
            j$.util.Objects.requireNonNull(str2);
            abxtVar.b |= 4;
            abxtVar.e = str2;
        }
    }
}
