package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class gke extends android.util.Property {
    public gke(java.lang.Class cls) {
        super(cls, "topLeft");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        gkl gklVar = (gkl) obj;
        android.graphics.PointF pointF = (android.graphics.PointF) obj2;
        gklVar.a = java.lang.Math.round(pointF.x);
        gklVar.b = java.lang.Math.round(pointF.y);
        int i = gklVar.e + 1;
        gklVar.e = i;
        if (i == gklVar.f) {
            gklVar.a();
        }
    }
}
