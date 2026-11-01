package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ygg implements dxz {
    private final defpackage.ygf a;
    private final defpackage.ygi b;
    private final dxz c;

    public ygg(dxz dxzVar, defpackage.ygf ygfVar, defpackage.ygi ygiVar) {
        this.c = dxzVar;
        this.a = ygfVar;
        this.b = ygiVar;
    }

    public final java.lang.Object a() {
        java.lang.Object objA = this.c.a();
        if (objA == null) {
            objA = this.a.a();
            if (android.util.Log.isLoggable("FactoryPools", 2)) {
                android.util.Log.v("FactoryPools", "Created new ".concat(java.lang.String.valueOf(java.lang.String.valueOf(objA.getClass()))));
            }
        }
        if (objA instanceof defpackage.ygh) {
            ((defpackage.ygh) objA).ez().a = false;
        }
        return objA;
    }

    public final boolean b(java.lang.Object obj) {
        if (obj instanceof defpackage.ygh) {
            ((defpackage.ygh) obj).ez().a = true;
        }
        this.b.a(obj);
        return this.c.b(obj);
    }
}
