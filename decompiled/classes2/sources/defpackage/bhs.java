package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bhs {
    public static final aonq a = new cja(636288403, false, new defpackage.bhr(0));
    public static final aonq b = new cja(-1357803046, false, new defpackage.bhr(2));

    public static /* synthetic */ aojh a(defpackage.bhi bhiVar, defpackage.biv bivVar, aomy aomyVar, cav cavVar, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVar.B(bhiVar) : cavVar.D(bhiVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cavVar.B(bivVar) : cavVar.D(bivVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVar.D(aomyVar) ? 128 : 256;
        }
        if (cavVar.H((i2 & 1171) != 1170, i2 & 1)) {
            defpackage.bhu.c(bhiVar, bivVar, aomyVar, cavVar, i2 & 1022);
        } else {
            cavVar.s();
        }
        return aojh.a;
    }
}
