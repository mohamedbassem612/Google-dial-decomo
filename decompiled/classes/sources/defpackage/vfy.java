package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class vfy implements defpackage.aoin {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ vfy(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v44, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v47, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v49, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [aoin, java.lang.Object] */
    @Override // defpackage.aoin, defpackage.aoim
    public final java.lang.Object a() {
        switch (this.$cid) {
            case 0:
            case 1:
            case 2:
            case 3:
                return this.a;
            case 4:
                return ((defpackage.vlh) this.a).a() ? defpackage.vcs.TMO_REST : defpackage.vcs.TMO_CVVM;
            case 5:
                return ((java.lang.Boolean) this.a.a()).booleanValue() ? defpackage.vcs.VVM3_MVNO : defpackage.vcs.OMTP_1_3;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return this.a;
            case 9:
                return (defpackage.aguq) this.a.a();
            case 10:
                return (defpackage.aguq) this.a.a();
            case 11:
                return this.a;
            case 12:
                defpackage.aiyy aiyyVar = new defpackage.aiyy();
                java.lang.Object obj = this.a;
                j$.util.Objects.requireNonNull(obj);
                aiyyVar.a = new wdn(obj, 14);
                return new defpackage.adcq(aiyyVar);
            case 13:
                return this.a;
            case 14:
                defpackage.aiyy aiyyVar2 = new defpackage.aiyy();
                java.lang.Object obj2 = this.a;
                j$.util.Objects.requireNonNull(obj2);
                aiyyVar2.a = new defpackage.rwp(obj2, 5);
                return new defpackage.adcq(aiyyVar2);
            case 15:
                return ((defpackage.wzy) defpackage.agab.aH(((com.android.incallui.atlas.ui.impl.pixeltipsintegration.AtlasPixelTipsContentProvider) this.a).getContext(), defpackage.wzy.class)).dt();
            case 16:
                return ((defpackage.wzy) defpackage.agab.aH(((com.android.incallui.atlas.ui.impl.pixeltipsintegration.AtlasPixelTipsContentProvider) this.a).getContext(), defpackage.wzy.class)).nH();
            case 17:
                return ((defpackage.wzy) defpackage.agab.aH(((com.android.incallui.atlas.ui.impl.pixeltipsintegration.AtlasPixelTipsContentProvider) this.a).getContext(), defpackage.wzy.class)).dX();
            case 18:
                return (defpackage.aguq) this.a.a();
            case 19:
                return this.a.a();
            default:
                ?? r3 = this.a;
                if (((defpackage.ahyn) r3.a()).f()) {
                }
                return null;
        }
    }
}
