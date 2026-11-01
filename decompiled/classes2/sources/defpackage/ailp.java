package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ailp extends defpackage.ailq {
    public ailp(defpackage.aizh aizhVar) {
        super(aizhVar);
    }

    @Override // defpackage.ailq
    public final int a(defpackage.aizh aizhVar, int i) {
        int i2;
        if (aizhVar.d()) {
            return 1;
        }
        int i3 = 0;
        int iA = this.b.a(0);
        while (true) {
            i2 = aizhVar.c;
            if (i3 >= i2) {
                break;
            }
            if (aizhVar.b[i3] == iA) {
                if (i3 < 0) {
                    break;
                }
                return i2 - 1;
            }
            i3++;
        }
        return i2;
    }
}
