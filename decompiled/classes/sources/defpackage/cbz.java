package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class cbz implements defpackage.aomy {
    private final /* synthetic */ int $cid;

    public /* synthetic */ cbz(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aomy
    public final java.lang.Object a() {
        java.lang.Object cjwVar;
        android.view.Choreographer choreographer;
        boolean z = true;
        int i = 2;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                defpackage.cbd cbdVar = defpackage.cca.a;
                throw new java.lang.IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 1:
                defpackage.cax.a("Unexpected call to default provider");
                throw new defpackage.aoiq();
            case 2:
                defpackage.cax.a("Unexpected call to default provider");
                throw new defpackage.aoiq();
            case 3:
                defpackage.cbd cbdVar2 = defpackage.cjm.a;
                return defpackage.cjl.a;
            case 4:
                cjwVar = new defpackage.cjw(bArr);
                break;
            case 5:
                defpackage.cbd cbdVar3 = defpackage.cjz.a;
                return null;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.cbd cbdVar4 = defpackage.cmf.a;
                return null;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.cuv.b;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                cjwVar = new defpackage.dbk(z, i, bArr);
                break;
            case 9:
                defpackage.cbd cbdVar5 = defpackage.cza.a;
                return null;
            case 10:
                cjwVar = new defpackage.dbk(z, i, bArr);
                break;
            case 11:
                cjwVar = new defpackage.dbk(false, 3, bArr);
                break;
            case 12:
                if (defpackage.dez.b()) {
                    choreographer = android.view.Choreographer.getInstance();
                } else {
                    defpackage.aosp aospVar = defpackage.aoth.a;
                    choreographer = (android.view.Choreographer) defpackage.aoov.ah(defpackage.apcg.a, new bbf((defpackage.aoln) null, 2, (char[]) null));
                }
                defpackage.det detVar = new defpackage.det(choreographer, ft$.ExternalSyntheticApiModelOutline0.m(android.os.Looper.getMainLooper()));
                return detVar.plus(detVar.j);
            case 13:
                defpackage.cbd cbdVar6 = defpackage.dfm.a;
                return null;
            case 14:
                defpackage.cbd cbdVar7 = defpackage.dfo.a;
                return java.lang.Boolean.FALSE;
            case 15:
                defpackage.cbd cbdVar8 = defpackage.dfo.a;
                return java.lang.Boolean.TRUE;
            case 16:
                defpackage.cbd cbdVar9 = defpackage.dfo.a;
                throw new java.lang.IllegalStateException("CompositionLocal LocalOwner not present");
            case 17:
                return defpackage.dkt.d;
            case 18:
                defpackage.cbd cbdVar10 = defpackage.eom.a;
                throw new java.lang.IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 19:
                int i2 = defpackage.ggq.h;
                return java.lang.Boolean.TRUE;
            default:
                defpackage.cbd cbdVar11 = defpackage.gik.a;
                throw new java.lang.IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
        }
        return cjwVar;
    }
}
