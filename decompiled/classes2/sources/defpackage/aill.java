package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aill extends defpackage.ailq {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aill(defpackage.ailm ailmVar, defpackage.aizh aizhVar) {
        super(aizhVar);
        j$.util.Objects.requireNonNull(ailmVar);
    }

    private static final int b(defpackage.aizh aizhVar, defpackage.aizh aizhVar2) {
        int i = 0;
        while (true) {
            int i2 = aizhVar.c;
            if (i >= i2) {
                return 1;
            }
            if (aizhVar2.a(i) != aizhVar.a(i)) {
                while (i < i2) {
                    int i3 = i + 1;
                    if (aizhVar2.a(i3) != aizhVar.a(i)) {
                        return 2;
                    }
                    i = i3;
                }
                return 1;
            }
            i++;
        }
    }

    @Override // defpackage.ailq
    public final int a(defpackage.aizh aizhVar, int i) {
        ahvr.bP(i <= 1, "Expected limit of at most 1, but found %s", i);
        int i2 = aizhVar.c;
        defpackage.aizh aizhVar2 = this.b;
        int i3 = i2 - aizhVar2.c;
        if (i3 == -1) {
            return b(aizhVar, aizhVar2);
        }
        if (i3 != 0) {
            if (i3 != 1) {
                return 2;
            }
            return b(aizhVar2, aizhVar);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            if (aizhVar.a(i5) != aizhVar2.a(i5)) {
                int i6 = i4 + 1;
                if (i4 != 0) {
                    return i6;
                }
                i4 = i6;
            }
        }
        return i4;
    }
}
