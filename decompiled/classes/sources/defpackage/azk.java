package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class azk implements defpackage.azj {
    public static final defpackage.azk a = new defpackage.azk();

    @Override // defpackage.azj
    public final defpackage.cmw a(defpackage.cmw cmwVar, float f, boolean z) {
        if (f <= 0.0d) {
            bai.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return cmwVar.a(new defpackage.ayl(f, z));
    }

    @Override // defpackage.azj
    public final defpackage.cmw b(defpackage.cmw cmwVar, defpackage.cmn cmnVar) {
        return cmwVar.a(new azx(cmnVar));
    }
}
