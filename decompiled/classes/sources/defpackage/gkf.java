package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class gkf extends android.util.Property {
    public gkf(java.lang.Class cls) {
        super(cls, "bottomRight");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        gkl gklVar = (gkl) obj;
        android.graphics.PointF pointF = (android.graphics.PointF) obj2;
        gklVar.c = java.lang.Math.round(pointF.x);
        gklVar.d = java.lang.Math.round(pointF.y);
        int i = gklVar.f + 1;
        gklVar.f = i;
        if (gklVar.e == i) {
            gklVar.a();
        }
    }
}
