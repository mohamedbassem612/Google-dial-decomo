package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xpl implements defpackage.xpb, defpackage.xpn {
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
    public final /* bridge */ /* synthetic */ java.lang.Object c(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "persistableBundle");
        aooh.f(persistableBundle, "persistableBundle");
        return new defpackage.xpm(persistableBundle);
    }

    @Override // defpackage.xoz
    public final /* synthetic */ defpackage.xoz e() {
        return new defpackage.xoy(this);
    }

    @Override // defpackage.xpn, defpackage.xoz
    public final /* synthetic */ android.os.PersistableBundle ew(java.lang.Object obj) {
        return (android.os.PersistableBundle) obj;
    }
}
