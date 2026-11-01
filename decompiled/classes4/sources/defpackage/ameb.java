package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class ameb implements defpackage.amec {
    private final /* synthetic */ int $cid;

    @Override // defpackage.amec
    public final float a(int i, int i2, aify aifyVar, aify aifyVar2) {
        int i3 = this.$cid;
        if (i3 == 0) {
            aigf aigfVar = defpackage.amef.a;
            if (i2 == -1 || i2 == aifyVar2.size() - 1) {
                return 0.0f;
            }
            return defpackage.amef.c(i, aifyVar);
        }
        if (i3 != 1) {
            return defpackage.amef.c(i, aifyVar);
        }
        aigf aigfVar2 = defpackage.amef.a;
        if (i2 != -1) {
            return defpackage.amef.c(i, aifyVar);
        }
        return 0.0f;
    }
}
