package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bib implements aono {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public bib(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i = this.$cid;
        if (i == 0) {
            long j = ((cqg) obj).a;
            cav cavVar = (cav) obj2;
            int iIntValue = ((java.lang.Number) obj3).intValue();
            int i2 = iIntValue & 17;
            if (cavVar.H(i2 != 16, iIntValue & 1)) {
                defpackage.bic.a.a((android.graphics.drawable.Drawable) this.a, cavVar, 48);
            } else {
                cavVar.s();
            }
            return aojh.a;
        }
        if (i != 1) {
            long j2 = ((cqg) obj).a;
            cav cavVar2 = (cav) obj2;
            int iIntValue2 = ((java.lang.Number) obj3).intValue();
            if (cavVar2.H((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                defpackage.bic.a.a((android.graphics.drawable.Drawable) this.a, cavVar2, 48);
            } else {
                cavVar2.s();
            }
            return aojh.a;
        }
        long j3 = ((cqg) obj).a;
        cav cavVar3 = (cav) obj2;
        int iIntValue3 = ((java.lang.Number) obj3).intValue();
        if ((iIntValue3 & 6) == 0) {
            iIntValue3 |= true != cavVar3.A(j3) ? 2 : 4;
        }
        if (cavVar3.H((iIntValue3 & 19) != 18, iIntValue3 & 1)) {
            defpackage.bhu.b(((defpackage.bhf) this.a).c, j3, cavVar3, (iIntValue3 << 3) & 112);
        } else {
            cavVar3.s();
        }
        return aojh.a;
    }
}
