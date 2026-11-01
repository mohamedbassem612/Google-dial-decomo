package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class gkh extends android.util.Property {
    public gkh(java.lang.Class cls) {
        super(cls, "topLeft");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View view = (android.view.View) obj;
        android.graphics.PointF pointF = (android.graphics.PointF) obj2;
        int iRound = java.lang.Math.round(pointF.x);
        int iRound2 = java.lang.Math.round(pointF.y);
        int right = view.getRight();
        int bottom = view.getBottom();
        int i = gll.b;
        fn$.ExternalSyntheticApiModelOutline0.m(view, iRound, iRound2, right, bottom);
    }
}
