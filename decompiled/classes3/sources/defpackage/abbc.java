package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abbc implements defpackage.abba {
    public final java.util.List b;
    public final defpackage.ajyr c;
    private final aoir d;

    public abbc(java.util.List list, defpackage.ajyr ajyrVar) {
        aooh.f(list, "attachedFeatureBuilders");
        this.b = list;
        this.c = ajyrVar;
        this.d = aooc.ag(new defpackage.xmr(this, 9));
    }

    @Override // defpackage.abba
    public final defpackage.abba a(java.util.List list) {
        aooh.f(list, "additionalFeatures");
        return new defpackage.abbc(ajsz.bT(this.b, list), this.c);
    }

    @Override // defpackage.abba
    public final /* synthetic */ defpackage.abbf b() {
        int iH;
        defpackage.ajyu ajyuVarC = c();
        int iH2 = ajyuVarC.h(6);
        int i = 0;
        int iJ = iH2 != 0 ? ajyuVarC.j(iH2) : 0;
        while (true) {
            if (i >= iJ) {
                return null;
            }
            defpackage.ajyu ajyuVarC2 = c();
            defpackage.ajyu ajyuVar = new defpackage.ajyu((boolean[]) null);
            int iH3 = ajyuVarC2.h(6);
            if (iH3 != 0) {
                int iG = ajyuVarC2.g(ajyuVarC2.i(iH3) + (i << 2));
                java.nio.ByteBuffer byteBuffer = ajyuVarC2.b;
                aooh.e(byteBuffer, "bb");
                aooh.f(byteBuffer, "_bb");
                aooh.f(byteBuffer, "_bb");
                ajyuVar.l(iG, byteBuffer);
            } else {
                ajyuVar = null;
            }
            if (ajyuVar != null && (iH = ajyuVar.h(6)) != 0 && ajyuVar.b.getInt(iH + ajyuVar.a) == 655374) {
                defpackage.ajyu ajyuVar2 = new defpackage.ajyu((byte[]) null);
                int iH4 = ajyuVar.h(8);
                if (iH4 != 0) {
                    int iG2 = ajyuVar.g(iH4 + ajyuVar.a);
                    java.nio.ByteBuffer byteBuffer2 = ajyuVar.b;
                    aooh.e(byteBuffer2, "bb");
                    aooh.f(byteBuffer2, "_bb");
                    aooh.f(byteBuffer2, "_bb");
                    ajyuVar2.l(iG2, byteBuffer2);
                } else {
                    ajyuVar2 = null;
                }
                if (ajyuVar2 != null) {
                    defpackage.ajyu ajyuVar3 = new defpackage.ajyu((short[]) null);
                    int iH5 = ajyuVar2.h(10);
                    if (iH5 != 0) {
                        int iG3 = ajyuVar2.g(iH5 + ajyuVar2.a);
                        java.nio.ByteBuffer byteBuffer3 = ajyuVar2.b;
                        aooh.e(byteBuffer3, "bb");
                        aooh.f(byteBuffer3, "_bb");
                        aooh.f(byteBuffer3, "_bb");
                        ajyuVar3.l(iG3, byteBuffer3);
                    } else {
                        ajyuVar3 = null;
                    }
                    if (ajyuVar3 != null) {
                        defpackage.ajyu ajyuVar4 = new defpackage.ajyu();
                        int iH6 = ajyuVar3.h(14);
                        if (iH6 != 0) {
                            int iG4 = ajyuVar3.g(iH6 + ajyuVar3.a);
                            java.nio.ByteBuffer byteBuffer4 = ajyuVar3.b;
                            aooh.e(byteBuffer4, "bb");
                            aooh.f(byteBuffer4, "_bb");
                            aooh.f(byteBuffer4, "_bb");
                            ajyuVar4.l(iG4, byteBuffer4);
                        } else {
                            ajyuVar4 = null;
                        }
                        if (ajyuVar4 != null) {
                            int iH7 = ajyuVar4.h(4);
                            java.lang.String strK = iH7 != 0 ? ajyuVar4.k(iH7 + ajyuVar4.a) : null;
                            if (strK == null) {
                                strK = "";
                            }
                            return new defpackage.abbf(strK);
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    @Override // defpackage.abba
    public final defpackage.ajyu c() {
        return (defpackage.ajyu) this.d.a();
    }
}
