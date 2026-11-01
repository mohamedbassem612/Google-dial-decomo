package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aisx implements java.util.function.Supplier {
    final /* synthetic */ java.lang.String a;
    final /* synthetic */ defpackage.airh b;
    private final int c;
    private int d;

    public aisx(defpackage.airh airhVar, java.lang.String str) {
        this.a = str;
        j$.util.Objects.requireNonNull(airhVar);
        this.b = airhVar;
        this.c = str.length();
        this.d = 0;
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ java.lang.Object get() {
        defpackage.aisu aisuVar;
        defpackage.aisu aisuVar2;
        int i = this.d;
        int i2 = this.c;
        if (i > i2) {
            return null;
        }
        defpackage.airh airhVar = this.b;
        java.lang.String str = this.a;
        int iA = i;
        while (true) {
            if (iA <= str.length()) {
                defpackage.airh airhVar2 = ((defpackage.aisw) airhVar).a;
                int iA2 = iA;
                while (true) {
                    defpackage.aisv aisvVar = (defpackage.aisv) airhVar2;
                    if (iA2 > str.length() - aisvVar.a.length()) {
                        aisuVar2 = null;
                        break;
                    }
                    defpackage.aist aistVar = (defpackage.aist) aisvVar.b;
                    int iE = aistVar.a.e(str, iA2);
                    if (iE < 0) {
                        aisuVar2 = null;
                    } else {
                        int iE2 = aistVar.b.e(str, iE + 1);
                        if (iE2 < 0) {
                            iE2 = str.length();
                        }
                        int i3 = iE2 - iE;
                        aisuVar2 = new defpackage.aisu(str, iE, i3, iE + i3, java.lang.Math.max(1, i3) + iE);
                    }
                    if (aisuVar2 == null) {
                        break;
                    }
                    if (aisuVar2.a.startsWith("{", aisuVar2.b - 1) && aisuVar2.c("}")) {
                        break;
                    }
                    iA2 = aisuVar2.a(iA2);
                }
                if (aisuVar2 != null) {
                    int i4 = aisuVar2.b - 1;
                    if (i4 >= i) {
                        int length = aisuVar2.length();
                        int i5 = aisuVar2.d;
                        int i6 = length + 2;
                        aisuVar = new defpackage.aisu(aisuVar2.a, i4, i6, i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i5 - 1, java.lang.Math.max(aisuVar2.e, i4 + i6));
                        break;
                    }
                    iA = aisuVar2.a(iA);
                }
            }
            aisuVar = null;
            break;
        }
        if (aisuVar == null) {
            return null;
        }
        if (aisuVar.c == i2) {
            this.d = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        } else {
            int i7 = aisuVar.e;
            if (i7 <= this.d) {
                throw new java.lang.IllegalStateException(a.bj(i7, "Infinite loop detected at "));
            }
            this.d = i7;
        }
        return aisuVar;
    }
}
