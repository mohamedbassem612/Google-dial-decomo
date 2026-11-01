package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class fhk implements java.util.function.ToLongFunction {
    private final /* synthetic */ int $cid;

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                int i = defpackage.fhl.a;
                return ((defpackage.frf) obj).c;
            case 1:
                int i2 = defpackage.fhl.a;
                return ((defpackage.frf) obj).b;
            case 2:
                int i3 = defpackage.foq.d;
                return ((defpackage.foq) obj).a;
            case 3:
                int i4 = defpackage.foq.d;
                return ((defpackage.foq) obj).b;
            case 4:
                int i5 = defpackage.frg.a;
                return defpackage.frg.d(((defpackage.frf) obj).b);
            case 5:
                return ((defpackage.fti) obj).a;
            case 6:
                android.util.Size size = (android.util.Size) obj;
                aimz aimzVar = pvf.a;
                return ((long) size.getHeight()) * ((long) size.getWidth());
            case 7:
                return ((java.lang.Long) obj).longValue();
            case 8:
                return ((apqr) obj).a;
            default:
                return ((java.io.File) obj).lastModified();
        }
    }
}
