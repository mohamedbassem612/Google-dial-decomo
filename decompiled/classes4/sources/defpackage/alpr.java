package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alpr {
    public static final /* synthetic */ int a = 0;
    private static final aigf b;

    static {
        aigb aigbVar = new aigb(4);
        aigbVar.i(defpackage.aqaj.f, defpackage.aqaf.DT_BOOL);
        aigbVar.i(defpackage.aqaj.a, defpackage.aqaf.DT_FLOAT);
        aigbVar.i(defpackage.aqaj.g, defpackage.aqaf.DT_INT16);
        aigbVar.i(defpackage.aqaj.b, defpackage.aqaf.DT_INT32);
        aigbVar.i(defpackage.aqaj.d, defpackage.aqaf.DT_INT64);
        aigbVar.i(defpackage.aqaj.h, defpackage.aqaf.DT_INT8);
        aigbVar.i(defpackage.aqaj.e, defpackage.aqaf.DT_STRING);
        aigbVar.i(defpackage.aqaj.c, defpackage.aqaf.DT_UINT8);
        b = aigbVar.e(true);
    }

    public static aify a(java.nio.ByteBuffer byteBuffer) {
        int i = 0;
        int i2 = byteBuffer.getInt(0);
        aift aiftVar = new aift(4);
        for (int i3 = 0; i3 < i2 + 1; i3++) {
            if (i3 == 0) {
                byteBuffer.getInt();
            } else {
                aiftVar.i(java.lang.Integer.valueOf(byteBuffer.getInt()));
            }
        }
        aike aikeVarH = aiftVar.h();
        aift aiftVar2 = new aift(4);
        while (i < aikeVarH.d - 1) {
            int i4 = i + 1;
            aiftVar2.i(c(byteBuffer, ((java.lang.Integer) aikeVarH.get(i)).intValue(), ((java.lang.Integer) aikeVarH.get(i4)).intValue() - ((java.lang.Integer) aikeVarH.get(i)).intValue()));
            i = i4;
        }
        int iIntValue = ((java.lang.Integer) ahvr.bk(aikeVarH)).intValue();
        aiftVar2.i(c(byteBuffer, iIntValue, byteBuffer.capacity() - iIntValue));
        return aiftVar2.h();
    }

    public static akzx b(defpackage.aqaj aqajVar, int[] iArr) {
        final int i = 3;
        aify aifyVar = (aify) j$.util.DesugarArrays.stream(iArr).mapToObj(new java.util.function.IntFunction() { // from class: via
            @Override // java.util.function.IntFunction
            public final java.lang.Object apply(int i2) {
                int i3 = i;
                if (i3 == 0) {
                    return new vih[i2];
                }
                if (i3 == 1) {
                    return new java.lang.String[i2];
                }
                if (i3 == 2) {
                    return new com.google.android.gms.duokit.RemoteUserReachability[i2];
                }
                int i4 = defpackage.alpr.a;
                akzx akzxVarM = defpackage.aqah.a.m();
                akzxVarM.u();
                ((defpackage.aqah) akzxVarM.b).b = i2;
                return (defpackage.aqah) akzxVarM.p();
            }
        }).collect(aido.a);
        akzx akzxVarM = defpackage.aqag.a.m();
        akzx akzxVarM2 = defpackage.aqai.a.m();
        akzxVarM2.u();
        defpackage.aqai aqaiVar = (defpackage.aqai) akzxVarM2.b;
        aqaiVar.b();
        akyl.i(aifyVar, aqaiVar.b);
        akzxVarM.u();
        defpackage.aqag aqagVar = (defpackage.aqag) akzxVarM.b;
        defpackage.aqai aqaiVar2 = (defpackage.aqai) akzxVarM2.p();
        j$.util.Objects.requireNonNull(aqaiVar2);
        aqagVar.d = aqaiVar2;
        aqagVar.b |= 1;
        defpackage.aqaf aqafVar = (defpackage.aqaf) b.getOrDefault(aqajVar, defpackage.aqaf.DT_INVALID);
        akzxVarM.u();
        ((defpackage.aqag) akzxVarM.b).c = aqafVar.a();
        return akzxVarM;
    }

    private static java.lang.String c(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = byteBuffer.get(i + i3);
        }
        return akzc.u(bArr).A();
    }
}
