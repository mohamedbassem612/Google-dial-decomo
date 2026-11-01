package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ahff implements eoe {
    final /* synthetic */ defpackage.ahfk a;

    public ahff(defpackage.ahfk ahfkVar) {
        j$.util.Objects.requireNonNull(ahfkVar);
        this.a = ahfkVar;
    }

    public final /* synthetic */ eoa a(java.lang.Class cls) {
        return enn.d(cls);
    }

    public final eoa b(java.lang.Class cls, eoq eoqVar) {
        java.lang.Object objC = this.a.c();
        amxw amxwVar = new amxw(eoqVar);
        amyl amylVar = (amyl) eoqVar.a(defpackage.ahgf.b);
        if (amylVar == null) {
            amylVar = amyl.a;
        }
        return new defpackage.ahfh(objC, amxwVar, amylVar);
    }

    public final /* synthetic */ eoa c(aopu aopuVar, eoq eoqVar) {
        return enn.c(this, aopuVar, eoqVar);
    }
}
