package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xpo implements defpackage.xpb, defpackage.xpn {
    public static final java.lang.String f(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "persistableBundle");
        java.lang.String string = persistableBundle.getString("value");
        if (string != null) {
            return string;
        }
        throw new java.lang.IllegalArgumentException("PersistableString has no value");
    }

    public static final android.os.PersistableBundle g(java.lang.String str) {
        aooh.f(str, "value");
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putString("value", str);
        return persistableBundle;
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
    public final /* synthetic */ java.lang.Object c(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "persistableBundle");
        return new defpackage.xpp(f(persistableBundle));
    }

    @Override // defpackage.xoz
    public final /* synthetic */ defpackage.xoz e() {
        return new defpackage.xoy(this);
    }

    @Override // defpackage.xpn, defpackage.xoz
    public final /* bridge */ /* synthetic */ android.os.PersistableBundle ew(java.lang.Object obj) {
        return g((java.lang.String) obj);
    }
}
