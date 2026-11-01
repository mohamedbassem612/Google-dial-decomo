package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class gki extends android.util.Property {
    public gki(java.lang.Class cls) {
        super(cls, "position");
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
        int width = view.getWidth() + iRound;
        int height = view.getHeight() + iRound2;
        int i = gll.b;
        fn$.ExternalSyntheticApiModelOutline0.m(view, iRound, iRound2, width, height);
    }
}
