package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xpq implements defpackage.xpb {
    private final defpackage.xpb a;
    private final aonj b;

    public xpq(defpackage.xpb xpbVar, aonj aonjVar) {
        aooh.f(xpbVar, "elementDeserializer");
        this.a = xpbVar;
        this.b = aonjVar;
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
    public final java.util.List c(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "persistableBundle");
        aokv aokvVar = new aokv(10);
        int i = persistableBundle.getInt("size");
        for (int i2 = 0; i2 < i; i2++) {
            java.lang.Object objG = defpackage.xfh.g(persistableBundle, a.bj(i2, "item_"), this.a);
            if (objG == null) {
                objG = this.b.a(java.lang.Integer.valueOf(i2));
            }
            aokvVar.add(objG);
        }
        return ajsz.aX(aokvVar);
    }

    public /* synthetic */ xpq(defpackage.xpb xpbVar) {
        this(xpbVar, new defpackage.xgn(19));
    }
}
