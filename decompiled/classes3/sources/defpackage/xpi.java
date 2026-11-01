package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xpi implements defpackage.xpb {
    private final defpackage.xpb a;
    private final defpackage.xpb b;

    public xpi(defpackage.xpb xpbVar, defpackage.xpb xpbVar2) {
        aooh.f(xpbVar2, "valueDeserializer");
        this.a = xpbVar;
        this.b = xpbVar2;
    }

    @Override // defpackage.xpb
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ java.lang.Object b(android.os.PersistableBundle persistableBundle) {
        return defpackage.xfh.d(this, persistableBundle);
    }

    @Override // defpackage.xhf
    public final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        return b((android.os.PersistableBundle) obj);
    }

    @Override // defpackage.xpb
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final java.util.Map c(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "persistableBundle");
        aola aolaVar = new aola(8);
        int i = persistableBundle.getInt("size");
        for (int i2 = 0; i2 < i; i2++) {
            java.lang.Object objG = defpackage.xfh.g(persistableBundle, a.bj(i2, "key_"), this.a);
            if (objG == null) {
                throw new java.lang.IllegalStateException(a.bj(i2, "Missing key in persistable map "));
            }
            java.lang.Object objG2 = defpackage.xfh.g(persistableBundle, a.bj(i2, "item_"), this.b);
            if (objG2 == null) {
                throw new java.lang.IllegalStateException(a.bj(i2, "Missing value in persistable map "));
            }
            aolaVar.put(objG, objG2);
        }
        return aolaVar.e();
    }
}
