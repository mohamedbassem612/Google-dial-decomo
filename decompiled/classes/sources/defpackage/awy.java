package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class awy {
    public static final defpackage.awy a = new defpackage.awy();

    private awy() {
    }

    public static final defpackage.cmw a(defpackage.cmw cmwVar, defpackage.cmi cmiVar) {
        return cmwVar.a(new axy(cmiVar));
    }

    public static final defpackage.cmw b(defpackage.cmw cmwVar, float f, boolean z) {
        if (f <= 0.0d) {
            bai.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return cmwVar.a(new defpackage.ayl(f, z));
    }
}
